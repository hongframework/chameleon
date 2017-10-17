package com.hframework.controller.ext;

import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.base.service.CommonDataService;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.base.service.ModelLoaderService;
import com.hframework.common.util.*;
import com.hframework.common.springext.datasource.DataSourceContextHolder;
import com.hframework.generator.web.container.HfModelContainer;
import com.hframework.generator.web.container.HfModelContainerUtil;
import com.hframework.generator.web.sql.HfModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.*;

/**
 * User: zhangqh6
 * Date: 2016/5/11 0:16:16
 */
public class ExtBaseController {
    private static final Logger logger = LoggerFactory.getLogger(ExtBaseController.class);


    @Resource
    private DataSetLoaderService dataSetLoaderService;

    @Resource
    private ModelLoaderService modelLoaderService;
    @Resource
    private CommonDataService commonDataService;

    @Resource
    private IHfpmProgramSV hfpmProgramSV;

    @Resource
    private IHfsecMenuSV hfsecMenuSV;

    @Resource
    private IHfsecUserSV hfsecUserSV;


    @Resource
    private IHfpmModuleSV hfpmModuleSV;

    @Resource
    private IHfcfgDbConnectSV iHfcfgDbConnectSV;
    @Resource
    private IHfpmProgramCfgSV iHfpmProgramCfgSV;

    @Resource
    private IHfusEntityStoreSV hfusEntityStoreSV;

    @Resource
    private IHfsecMenuSV iHfsecMenuSV;

    @Resource
    private IHfmdEntitySV iHfmdEntitySV;

    @Resource
    private IHfmdEntityAttrSV hfmdEntityAttrSV;

    public enum EntityPageSet{

        SINGLE_MGR("_mgr","管理","qlist",new String[]{"qForm"}),
        SINGLE_CREATE("_create","创建","create",new String[]{}),
        SINGLE_EDIT("_edit","修改","edit",new String[]{}),
        SINGLE_DETAIL("_detail","明细","edit",new String[]{}),

        COMPLEX_MGR("_mgr","管理","qlist",new String[]{"qForm"}),
        COMPLEX_CREATE("_create","添加","cComb",new String[]{"cForm","cList"}),
        COMPLEX_EDIT("_edit","修改","eComb",new String[]{"eForm","eList"}),
        COMPLEX_DETAIL("_detail","查看","dComb",new String[]{"dForm","qList"}),

        CATEGORY_MGR("_mgr","管理","editByCategory",new String[]{});

        String id;
         String name;
         String pageTemplate;
         String[] component;

        EntityPageSet(String id, String name, String pageTemplate, String[] component) {
            this.id = id;
            this.name = name;
            this.pageTemplate = pageTemplate;
            this.component = component;
        }
    }
    protected HfcfgDbConnect startDynamicDataSource(Map<String, String> pageFlowParams) throws Exception {
        HfpmProgramCfg hfpmProgramCfg = new HfpmProgramCfg();
        ReflectUtils.setFieldValue(hfpmProgramCfg, pageFlowParams);
        HfpmProgramCfg_Example example = ExampleUtils.parseExample(hfpmProgramCfg, HfpmProgramCfg_Example.class);
        List<HfpmProgramCfg> programCfgList = iHfpmProgramCfgSV.getHfpmProgramCfgListByExample(example);
        if(programCfgList != null && programCfgList.size() == 1) {
            HfpmProgramCfg programCfg = programCfgList.get(0);
            Long hfcfgDbConnectId1 = programCfg.getHfcfgDbConnectId();
            if(hfcfgDbConnectId1 != null) {
                HfcfgDbConnect dbConnect = iHfcfgDbConnectSV.getHfcfgDbConnectByPK(hfcfgDbConnectId1);
                String url = dbConnect.getUrl();
                String user = dbConnect.getUser();
                String password = dbConnect.getPassword();
                DataSourceContextHolder.setDbInfo(url.trim(), user.trim(), password != null ? password.trim() : null);
                return dbConnect;
            }

        }

        return null;
    }

    private void generateDefaultDataSetIfNotExists(HfModelContainer[] resultModelContainers, String programCode, String programName, String moduleCode, String moduleName) throws Exception {

        HfModelContainer dbModelContainer = HfModelService.get().getModelContainerFromDB(
                programCode, programName, moduleCode, moduleName);

        resultModelContainers =
                HfModelContainerUtil.mergerEntityToDataSetReturnOnly(resultModelContainers,dbModelContainer);
        System.out.println(resultModelContainers);

        HfModelService.get().executeModelInsert(resultModelContainers[0]);
//        HfModelService.get().executeModelUpdate(resultModelContainers[1]);
    }
}
