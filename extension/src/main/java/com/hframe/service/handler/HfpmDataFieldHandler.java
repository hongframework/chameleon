package com.hframe.service.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.hframe.domain.enums.HfpmDataFieldEnum;
import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.common.util.JavaUtil;
import com.hframework.web.extension.AbstractBusinessHandler;
import com.hframework.base.service.DataSetLoaderHelper;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.web.extension.annotation.*;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Model;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangquanhong on 2016/10/16.
 */
@Service
public class HfpmDataFieldHandler extends AbstractBusinessHandler<HfpmDataField> {

    protected transient RepositoryService repositoryService ;
    @Resource
    private IHfpmDataSetSV hfpmDataSetSV;

    @Resource
    private IHfpmProgramSV hfpmProgramSV;

    @Resource
    private IHfmdEntityAttrSV hfmdEntityAttrSV;

    @Resource
    private IHfmdEnumSV hfmdEnumSV;
    @Resource
    private IHfpmProgramCfgSV iHfpmProgramCfgSV;

    @Resource
    private IHfmdEntitySV iHfmdEntitySV;

//    @AfterUpdateHandler
//    @AfterCreateHandler
    public boolean add(HfpmDataField dataField) throws Exception {



        HfpmDataSet hfpmDataSet = hfpmDataSetSV.getHfpmDataSetByPK(dataField.getHfpmDataSetId());
        HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(hfpmDataSet.getHfpmProgramId());

        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();

        DataSetLoaderService dataSetLoaderService = DataSetLoaderHelper.getDataSetLoaderService(
                companyCode, programCode, null,iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV,hfpmDataSet.getHfpmProgramId());
        dataSetLoaderService.updateDataSetXml(dataSetLoaderService.overrideDataSetField(dataField));
        return true;
    }

//    @BeforeUpdateHandler
//    @BeforeCreateHandler
    @AfterUpdateHandler
    @AfterCreateHandler
    public boolean updateWorkflowModel(HfpmDataField dataField) throws Exception {
        add(dataField);
        if(HfpmDataFieldEnum.DataGetMethod.isWorkflow(dataField.getDataGetMethod()) && StringUtils.isBlank(dataField.getWorkfowModelId())) {
            repositoryService = ProcessEngines.getDefaultProcessEngine().getRepositoryService();

            HfpmDataSet hfpmDataSet = hfpmDataSetSV.getHfpmDataSetByPK(dataField.getHfpmDataSetId());
            ObjectMapper objectMapper = new ObjectMapper();

            Model modelData = repositoryService.newModel();
            ObjectNode modelObjectNode = objectMapper.createObjectNode();
            modelObjectNode.put(ModelDataJsonConstants.MODEL_NAME, hfpmDataSet.getHfpmDataSetName().replaceAll("【[^【】]*】","") + "流程");
            modelObjectNode.put(ModelDataJsonConstants.MODEL_REVISION, 1);
            String description = null;
            modelObjectNode.put(ModelDataJsonConstants.MODEL_DESCRIPTION, description);
            modelData.setMetaInfo(modelObjectNode.toString());
            modelData.setName(hfpmDataSet.getHfpmDataSetName().replaceAll("【[^【】]*】", "") + "流程");
            repositoryService.saveModel(modelData);

            ObjectNode editorNode = objectMapper.createObjectNode();
            editorNode.put("id", JavaUtil.getJavaVarName(hfpmDataSet.getHfpmDataSetCode()));
            editorNode.put("resourceId", JavaUtil.getJavaVarName(hfpmDataSet.getHfpmDataSetCode()));
            editorNode.put("properties", objectMapper.createObjectNode()
                    .put("process_id", JavaUtil.getJavaVarName(hfpmDataSet.getHfpmDataSetCode()))
                    .put("name", hfpmDataSet.getHfpmDataSetName().replaceAll("【[^【】]*】","") + "流程")
                    .put("documentation", "")
                    .put("process_author", "hframework"));
            ObjectNode stencilSetNode = objectMapper.createObjectNode();
            stencilSetNode.put("namespace", "http://b3mn.org/stencilset/bpmn2.0#");
            editorNode.put("stencilset", stencilSetNode);
            HfmdEntityAttr hfmdEntityAttr = hfmdEntityAttrSV.getHfmdEntityAttrByPK(dataField.getHfmdEntityAttrId());
            if(hfmdEntityAttr.getHfmdEnumClassId() != null) {
                HfmdEnum_Example hfmdEnum_example = new HfmdEnum_Example();
                hfmdEnum_example.createCriteria().andHfmdEnumClassIdEqualTo(hfmdEntityAttr.getHfmdEnumClassId());
                List<HfmdEnum> hfmdEnumList = hfmdEnumSV.getHfmdEnumListByExample(hfmdEnum_example);



                ArrayNode arrayNode = objectMapper.createArrayNode();
                int x = 128, y = 115, step = 145;
                for (int i = 0; i < hfmdEnumList.size(); i++) {
                    String value = "value-" + hfmdEnumList.get(i).getHfmdEnumValue();
                    String assignment = "group-" + hfmdEnumList.get(i).getHfmdEnumValue();
                    if(i == 0) {
                        ObjectNode startNoneEvent = createChildShapes(objectMapper, "StartNoneEvent", value, value,assignment,
                                hfmdEnumList.get(i).getHfmdEnumText(), x + 30, y + 55, x, y + 25);
                        ((ObjectNode)startNoneEvent.get("properties")).put("initiator","initiator");
                        arrayNode.add(startNoneEvent);
                        x -=70;
                    }else if(i == hfmdEnumList.size()-1) {
                        arrayNode.add(createChildShapes(objectMapper, "EndNoneEvent", value, value,null,
                                hfmdEnumList.get(i).getHfmdEnumText(), x + 30, y + 55,  x, y + 25));
                    }else {
                        arrayNode.add(createChildShapes(objectMapper, "UserTask", value, value,null,
                                hfmdEnumList.get(i).getHfmdEnumText(), x + 100, y + 80,  x, y));
                    }
                    x += step;
                }
                editorNode.put("childShapes", arrayNode);
            }
            editorNode.put("bounds", createBounds(objectMapper, 1200, 1050, 0, 0));

            repositoryService.addModelEditorSource(modelData.getId(), editorNode.toString().getBytes("utf-8"));

            dataField.setWorkfowModelId(modelData.getId());
        }

        return true;
    }

    private ObjectNode createChildShapes(ObjectMapper objectMapper, String stencilId, String resourceId, String overrideId, String assignment,  String name , int lrX, int lrY, int ulX, int ulY) {
        ObjectNode childShapeNode = objectMapper.createObjectNode();
        childShapeNode.put("resourceId", resourceId);
        ObjectNode properties = objectMapper.createObjectNode()
                .put("overrideid", overrideId)
                .put("name", name)
                .put("documentation", "")
                .put("executionlisteners", "")
                .put("initiator", "")
                .put("formkeydefinition", "")
                .put("formproperties", "");
        if(StringUtils.isNotBlank(assignment)) {
            properties.put("usertaskassignment", objectMapper.createObjectNode()
                    .put("assignment", objectMapper.createObjectNode()
                            .put("candidateGroups", objectMapper.createArrayNode().add(objectMapper.createObjectNode()
                                    .put("value", assignment)))));
        }
        childShapeNode.put("properties", properties);
        childShapeNode.put("stencil",  objectMapper.createObjectNode()
                                                .put("id", stencilId));
        childShapeNode.put("childShapes", objectMapper.createArrayNode());
        childShapeNode.put("outgoing", objectMapper.createArrayNode());
        childShapeNode.put("bounds", createBounds(objectMapper, lrX, lrY, ulX, ulY));
        childShapeNode.put("dockers", objectMapper.createArrayNode());

        return childShapeNode;
    }

    private ObjectNode createBounds(ObjectMapper objectMapper, int lrX, int lrY, int ulX, int ulY) {

        ObjectNode lowerRightNode = objectMapper.createObjectNode();
        lowerRightNode.put("x", lrX);
        lowerRightNode.put("y", lrY);

        ObjectNode upperLeftNode = objectMapper.createObjectNode();
        upperLeftNode.put("x", ulX);
        upperLeftNode.put("y", ulY);

        ObjectNode boundsNode = objectMapper.createObjectNode();
        boundsNode.put("lowerRight", lowerRightNode);
        boundsNode.put("upperLeft", upperLeftNode);
        return boundsNode;
    }

    @AfterDeleteHandler
    public boolean delete(HfpmDataField dataField) throws Exception {

        HfpmDataSet hfpmDataSet = hfpmDataSetSV.getHfpmDataSetByPK(dataField.getHfpmDataSetId());
        HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(hfpmDataSet.getHfpmProgramId());

        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();

        DataSetLoaderService dataSetLoaderService = DataSetLoaderHelper.getDataSetLoaderService(
                companyCode, programCode, null,iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV,hfpmDataSet.getHfpmProgramId());
        dataSetLoaderService.removeDataSetField(dataField);
        dataSetLoaderService.updateDataSetXml(dataField.getHfpmDataSetId());
        return true;
    }
}
