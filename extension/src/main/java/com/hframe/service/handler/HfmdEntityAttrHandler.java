package com.hframe.service.handler;

import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.common.util.BeanUtils;
import com.hframework.generator.web.container.bean.DataField;
import com.hframework.generator.web.container.bean.DataSet;
import com.hframework.generator.web.container.bean.EntityAttr;
import com.hframework.web.extension.AbstractBusinessHandler;
import com.hframework.base.service.DataSetLoaderHelper;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.generator.web.container.HfModelContainerUtil;
import com.hframework.web.extension.annotation.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangquanhong on 2016/10/14.
 */
@Service
public class HfmdEntityAttrHandler extends AbstractBusinessHandler<HfmdEntityAttr> {

    private static final long ENUM_CLASS_DEFAULT_HOLDER = 2;

    @Resource
    private IHfmdEntitySV hfmdEntitySV;

    @Resource
    private IHfmdEntityAttrSV hfmdEntityAttrSV;
    @Resource
    private IHfpmDataSetSV hfpmDataSetSV;
    @Resource
    private IHfpmDataFieldSV hfpmDataFieldSV;
    @Resource
    private IHfpmProgramSV hfpmProgramSV;
    @Resource
    private IHfmdEnumClassSV hfmdEnumClassSV;
    @Resource
    private IHfmdEntitySV iHfmdEntitySV;
    @Resource
    private IHfpmProgramCfgSV iHfpmProgramCfgSV;



    @BeforeUpdateHandler(attr = "hfmdEnumClassId",target = "2")
    @BeforeCreateHandler(attr = "hfmdEnumClassId",target = "2")
    public boolean resetEnumClass(HfmdEntityAttr hfmdEntityAttr) throws Exception {

        if(hfmdEntityAttr.getHfmdEnumClassId() != null
                && hfmdEntityAttr.getHfmdEnumClassId() == ENUM_CLASS_DEFAULT_HOLDER) {
            HfmdEntity hfmdEntity = hfmdEntitySV.getHfmdEntityByPK(hfmdEntityAttr.getHfmdEntityId());

            HfmdEnumClass_Example example = new HfmdEnumClass_Example();
            example.createCriteria().andHfmdEnumClassCodeEqualTo(hfmdEntity.getHfmdEntityCode() + "." + hfmdEntityAttr.getHfmdEntityAttrCode());
            List<HfmdEnumClass> hfmdEnumClassCountByExample = hfmdEnumClassSV.getHfmdEnumClassListByExample(example);
            long classId = -1;
            if(hfmdEnumClassCountByExample == null || hfmdEnumClassCountByExample.size() == 0) {
                HfmdEnumClass enumClass = new HfmdEnumClass();
                enumClass.setHfmdEnumClassName(hfmdEntity.getHfmdEntityName() + "-" + hfmdEntityAttr.getHfmdEntityAttrName());
                enumClass.setHfmdEnumClassCode(hfmdEntity.getHfmdEntityCode() + "." + hfmdEntityAttr.getHfmdEntityAttrCode());
                enumClass.setHfmdEnumClassDesc(hfmdEntityAttr.getHfmdEntityAttrName());
                enumClass.setHfpmProgramId(hfmdEntityAttr.getHfpmProgramId());
                hfmdEnumClassSV.create(enumClass);
                classId = enumClass.getHfmdEnumClassId();


                HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(hfmdEntityAttr.getHfpmProgramId());

                String companyCode = hfpmProgram.getOwnerCode();
                String programCode = hfpmProgram.getHfpmProgramCode();

                DataSetLoaderService dataSetLoaderService = DataSetLoaderHelper.getDataSetLoaderService(
                        companyCode, programCode, null,iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV,hfpmProgram.getHfpmProgramId());
                dataSetLoaderService.overrideHfmdEnumClass(enumClass);

            }else {
                classId = hfmdEnumClassCountByExample.get(0).getHfmdEnumClassId();
            }
            hfmdEntityAttr.setHfmdEnumClassId(classId);




//            hfmdEntityAttrSV.update(hfmdEntityAttr);
        }
        return true;
    }

    @BeforeUpdateHandler(attr = "hfmdEntityAttrCode",target = "parent_hfsec_menu_id")
    @BeforeCreateHandler(attr = "hfmdEntityAttrCode",target = "parent_hfsec_menu_id")
    public boolean updateSelfRelat(HfmdEntityAttr hfmdEntityAttr) throws Exception {

        if(hfmdEntityAttr.getRelHfmdEntityAttrId() == null) {
            Long hfmdEntityId = hfmdEntityAttr.getHfmdEntityId();
            HfmdEntityAttr_Example example = new HfmdEntityAttr_Example();
            example.createCriteria().andHfmdEntityIdEqualTo(hfmdEntityId);
            List<HfmdEntityAttr> hfmdEntityAttrListByExample = hfmdEntityAttrSV.getHfmdEntityAttrListByExample(example);
            for (HfmdEntityAttr entityAttr : hfmdEntityAttrListByExample) {
                if(entityAttr.getIspk() == 1) {
                    hfmdEntityAttr.setRelHfmdEntityAttrId(entityAttr.getHfmdEntityAttrId());
                }
            }
        }
        return true;
    }

    @AfterDeleteHandler
    public boolean deleteDataFiled(HfmdEntityAttr hfmdEntityAttr) throws Exception {
        HfpmDataField_Example example = new HfpmDataField_Example();
        example.createCriteria().andHfmdEntityAttrIdEqualTo(hfmdEntityAttr.getHfmdEntityAttrId());
        List<HfpmDataField> hfpmDataFieldListByExample = hfpmDataFieldSV.getHfpmDataFieldListByExample(example);
        if(hfpmDataFieldListByExample != null) {
            for (HfpmDataField hfpmDataField : hfpmDataFieldListByExample) {
                hfpmDataFieldSV.delete(hfpmDataField);
            }
        }
        return true;
    }

//    @AfterCreateHandler
//    @AfterUpdateHandler
    public boolean updateDataSetService(HfmdEntityAttr hfmdEntityAttr) throws Exception {
        HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(hfmdEntityAttr.getHfpmProgramId());

        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();

        DataSetLoaderService dataSetLoaderService = DataSetLoaderHelper.getDataSetLoaderService(
                companyCode, programCode, null,iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV,hfpmProgram.getHfpmProgramId());
        System.out.printf("hfmdEntityAttr : "  + hfmdEntityAttr.getHfmdEntityAttrName());
        dataSetLoaderService.overrideHfmdEntityAttr(hfmdEntityAttr);
        return true;
    }

    @AfterCreateHandler
    public boolean generateDataFiled(HfmdEntityAttr hfmdEntityAttr) throws Exception {
        updateDataSetService(hfmdEntityAttr);
        HfpmDataSet_Example example = new HfpmDataSet_Example();
        example.createCriteria().andMainHfmdEntityIdEqualTo(hfmdEntityAttr.getHfmdEntityId());
        List<HfpmDataSet> hfpmDataSetList = hfpmDataSetSV.getHfpmDataSetListByExample(example);
        if(hfpmDataSetList != null) {
            for (HfpmDataSet dataSet : hfpmDataSetList) {
                if(dataSet.getHfpmDataSetName().endsWith("【默认】")) {
                    HfpmDataField dataField = BeanUtils.convertObject(HfpmDataField.class, HfModelContainerUtil.getDataFieldFromEntityAttr(
                            BeanUtils.convertObject(EntityAttr.class, hfmdEntityAttr),
                            BeanUtils.convertObject(DataSet.class, dataSet)));
                    hfpmDataFieldSV.create(dataField);
                }else if(dataSet.getHfpmDataSetName().endsWith("【查询】")) {
                    List<DataField> qryDataFields = HfModelContainerUtil.getDS4QryDataFieldFromEntityAttr(
                            BeanUtils.convertObject(EntityAttr.class, hfmdEntityAttr),
                            BeanUtils.convertObject(DataSet.class, dataSet));
                    for (DataField qryDataField : qryDataFields) {
                        hfpmDataFieldSV.create(BeanUtils.convertObject(HfpmDataField.class,qryDataField));
                    }
                }
            }
        }
        return true;
    }

    @AfterUpdateHandler
    public boolean updateDataFiled(HfmdEntityAttr hfmdEntityAttr) throws Exception {
        updateDataSetService(hfmdEntityAttr);
        String fieldShowTypeId = HfModelContainerUtil.getFieldShowTypeIdByEntityAttr(BeanUtils.convertObject(EntityAttr.class, hfmdEntityAttr));
//        if("1".equals(fieldShowTypeId)) return true;

//        String fieldShowCode = HfModelContainerUtil.getFieldShowCodeByEntityAttr(hfmdEntityAttr);
        HfpmDataField_Example example = new HfpmDataField_Example();
        example.createCriteria().andHfmdEntityAttrIdEqualTo(hfmdEntityAttr.getHfmdEntityAttrId());
        List<HfpmDataField> hfpmDataFieldListByExample = hfpmDataFieldSV.getHfpmDataFieldListByExample(example);
        if(hfpmDataFieldListByExample != null) {
            for (HfpmDataField hfpmDataField : hfpmDataFieldListByExample) {
//                if(!hfpmDataField.getHfpmFieldShowTypeId().equals(fieldShowTypeId)
//                        && hfpmDataField.getHfpmFieldShowTypeId().equals("1")) {
                    hfpmDataField.setHfpmFieldShowTypeId(fieldShowTypeId);
                    hfpmDataFieldSV.update(hfpmDataField);
//                }
            }
        }
        return true;
    }

}
