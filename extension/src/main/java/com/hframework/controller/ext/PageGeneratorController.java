package com.hframework.controller.ext;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.base.service.CommonDataService;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.base.service.ModelLoaderService;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.common.util.collect.bean.Grouper;
import com.hframework.common.util.collect.bean.Mapper;
import com.hframework.common.util.collect.bean.Merger;
import com.hframework.common.util.file.FileUtils;
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.message.XmlUtils;
import com.hframework.controller.ext.bean.AuthManager;
import com.hframework.controller.ext.bean.AuthObject;
import com.hframework.generator.web.container.HfModelContainerUtil;
import com.hframework.web.config.bean.Program;
import com.hframework.web.controller.DefaultController;
import com.hframework.common.springext.datasource.DataSourceContextHolder;
import com.hframework.web.context.WebContext;
import com.hframework.web.context.WebContextHelper;
import com.hframework.web.config.bean.Module;
import com.hframework.web.config.bean.dataset.Entity;
import com.hframework.web.config.bean.module.Component;
import com.hframework.web.config.bean.module.Page;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;
import java.util.*;

/**
 * Created by zhangquanhong on 2016/12/11.
 */
@Controller
@RequestMapping(value = "/extend")
public class PageGeneratorController extends ExtBaseController {
    private static final Logger logger = LoggerFactory.getLogger(PageGeneratorController.class);
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

    /**
     * 页面生成
     * @return
     */
    @RequestMapping(value = "/page_generate.json")
    @ResponseBody
    public ResultData pageGenerate(@RequestParam(value="dataIds[]",required=false) List<String> entityCodes, String moduleCode, HttpServletRequest request){
        logger.debug("request : {}", entityCodes, moduleCode);
        try{

            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            String companyCode = "hframe";
            Long programId = null;
            String programCode = "hframe";
            String programName = "框架";
            Long moduleId = null;
            String moduleName = "框架";
            if(pageFlowParams != null) {
                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
                    programId = program.getHfpmProgramId();
                    programCode = program.getHfpmProgramCode();
                    programName = program.getHfpmProgramName();
                }
//                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
//                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
//                    moduleCode = module.getHfpmModuleCode();
//                    moduleName = module.getHfpmModuleName();
//                }
            }

            HfmdEntity_Example example = new HfmdEntity_Example();
            HfmdEntity_Example.Criteria criteria = example.createCriteria();
            if(programId != null) criteria.andHfpmProgramIdEqualTo(programId);
            if(moduleId != null) criteria.andHfpmModuleIdEqualTo(moduleId);


            Map<String, Boolean> selfDependEntityCache =  new HashedMap();

            if(programId == null && moduleId == null) criteria.andHfmdEntityCodeLike("hf%");
            final List<HfmdEntity> hfmdEntityListByExample = iHfmdEntitySV.getHfmdEntityListByExample(example);

            Map<String, HfmdEntity> cache = CollectionUtils.convert(hfmdEntityListByExample, new Mapper<String, HfmdEntity>() {
                public <K> K getKey(HfmdEntity hfmdEntity) {
                    return (K) hfmdEntity.getHfmdEntityCode();
                }
            });

            Module module = new Module();
            module.setCode(moduleCode);
            List<Page> pageList = new ArrayList<Page>();
            module.setPageList(pageList);

            List<Object[]> menuList =  new ArrayList<Object[]>();
            for (String entityCode : entityCodes) {
                if(StringUtils.isBlank(entityCode)) {
                    continue;
                }
                String[] lineEntityCodes = entityCode.substring(0,entityCode.length()-1).split("\\|");
                String rootEntityCode = lineEntityCodes[0];
                String rootEntityName = cache.get(rootEntityCode).getHfmdEntityName();

                String[] relEntityCodes = Arrays.copyOfRange(lineEntityCodes, 1, lineEntityCodes.length);

                boolean isSelfDepend = isSelfDependEntity(selfDependEntityCache, cache.get(rootEntityCode));



                List<Page> pages = getPages(moduleCode, rootEntityCode, rootEntityName, relEntityCodes, isSelfDepend);
                Page page = pages.get(0);
                menuList.add(new Object[]{page.getId(), page.getName(), page.getName(), -2, "", "/" + moduleCode + "/" + page.getId() + ".html"});
                pageList.addAll(pages);
            }

            WebContextHelper contextHelper = new WebContextHelper(companyCode, programCode,null, "default");
            String pageFilePath = contextHelper.programConfigRootDir + "/" + contextHelper.programConfigModuleDir + "/" + moduleCode + ".xml";

            String xml = XmlUtils.writeValueAsString(module);
//            String pageFilePath =  PropertyConfigurerUtils.getProperty(DataSetLoaderService.CreatorConst.PROJECT_BASE_FILE_PATH) +
//                    "/hframe-webtemplate/src/main/resources/program/hframe/module/" + moduleCode + ".xml";
            System.out.println(pageFilePath);
            System.out.println(xml);
            FileUtils.writeFile(pageFilePath, xml);

            AuthManager authManager = AuthManager.load(iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV, programId);
            AuthManager.calcAuthObjectKeyAttr(authManager.func, AuthManager.funcModel);

            //添加枚举值变更sql语句
            List<String> funcSqls =  getMergeSql(authManager, pageFlowParams, menuList);

            startDynamicDataSource(pageFlowParams);
            commonDataService.executeDBStructChange(funcSqls);
            return ResultData.success();
        }catch (Exception e) {
            logger.error("error : ", e);

            return ResultData.error(ResultCode.ERROR);
        }finally {
            DataSourceContextHolder.clear();
        }
    }

    private List<String> getMergeSql(final AuthManager authManager, Map<String, String> pageFlowParams, final List<Object[]> datas) throws Exception {

        List<String> sqls = new ArrayList<String>();

        startDynamicDataSource(pageFlowParams);
        List<Map<String, Object>> curFuncList = AuthManager.getDynamicTableDataSome(commonDataService,AuthManager.calcSelectSql(authManager.func.get(0)));

        DataSourceContextHolder.clear();

        List<Map<String, Object>> funcList = AuthManager.getDynamicTableDataSome(commonDataService,
                AuthManager.calcSelectDualSql(authManager.func.get(0),datas));


        CollectionUtils.remove(funcList, curFuncList, new Merger<String, Map<String,Object>>() {
            public <K> K getKey(Map<String, Object> objectMap) {
                return (K) String.valueOf(objectMap.get(authManager.func.get(0).keyAttrs.get(5)));
            }

            public <K> K groupKey(Map<String, Object> objectMap) {
                return (K) String.valueOf(objectMap.get(authManager.func.get(0).keyAttrs.get(5)));
            }
        });


        List<String> userSqls = HfModelContainerUtil.getSql(funcList, authManager.func.get(0).tableName, false);
        for (String userSql : userSqls) {
            sqls.add(userSql + ";");
        }

        return sqls;
    }

    private boolean isSelfDependEntity(Map<String, Boolean> selfDependEntityCache, HfmdEntity hfmdEntity) throws Exception {
        if(selfDependEntityCache.containsKey(hfmdEntity.getHfmdEntityCode())) {
            return selfDependEntityCache.get(hfmdEntity.getHfmdEntityCode());
        }

        HfmdEntityAttr_Example hfmdEntityAttrExample = new HfmdEntityAttr_Example();
        hfmdEntityAttrExample.createCriteria().andHfmdEntityIdEqualTo(hfmdEntity.getHfmdEntityId());
        List<HfmdEntityAttr> hfmdEntityAttrList = hfmdEntityAttrSV.getHfmdEntityAttrListByExample(hfmdEntityAttrExample);
        List<Long> hfmdEntityAttrIds = CollectionUtils.fetch(hfmdEntityAttrList, new Fetcher<HfmdEntityAttr, Long>() {
            public Long fetch(HfmdEntityAttr hfmdEntityAttr) {
                return hfmdEntityAttr.getHfmdEntityAttrId();
            }
        });

        List<Long> relHfmdEntityAttrIds = CollectionUtils.fetch(hfmdEntityAttrList, new Fetcher<HfmdEntityAttr, Long>() {
            public Long fetch(HfmdEntityAttr hfmdEntityAttr) {
                return hfmdEntityAttr.getRelHfmdEntityAttrId();
            }
        });
        hfmdEntityAttrIds.retainAll(relHfmdEntityAttrIds);
        if(hfmdEntityAttrIds.size() > 0) {
            selfDependEntityCache.put(hfmdEntity.getHfmdEntityCode(), true);
        }else {
            selfDependEntityCache.put(hfmdEntity.getHfmdEntityCode(), false);
        }
        return selfDependEntityCache.get(hfmdEntity.getHfmdEntityCode());
    }

    private List<Page> getPages(String moduleCode, String rootEntityCode, String rootEntityName, String[] relEntityCodes, boolean isSelfDepend) {

        List<Page> pages = new ArrayList<Page>();


        if(relEntityCodes == null || relEntityCodes.length == 0) {
            if(isSelfDepend) {
                pages.add(getPage(EntityPageSet.CATEGORY_MGR, moduleCode, rootEntityCode, rootEntityName,null, null));
            }else {
                pages.add(getPage(EntityPageSet.SINGLE_MGR, moduleCode, rootEntityCode, rootEntityName,null, null));
            }
            pages.add(getPage(EntityPageSet.SINGLE_CREATE, moduleCode, rootEntityCode, rootEntityName,null, rootEntityCode + EntityPageSet.SINGLE_MGR.id));
            pages.add(getPage(EntityPageSet.SINGLE_EDIT, moduleCode, rootEntityCode, rootEntityName,null, rootEntityCode + EntityPageSet.SINGLE_MGR.id));
            pages.add(getPage(EntityPageSet.SINGLE_DETAIL, moduleCode, rootEntityCode, rootEntityName, null, rootEntityCode + EntityPageSet.SINGLE_MGR.id));

        }else {
            if(isSelfDepend) {
                pages.add(getPage(EntityPageSet.CATEGORY_MGR, moduleCode, rootEntityCode, rootEntityName,null, null));
            }else {
                pages.add(getPage(EntityPageSet.COMPLEX_MGR, moduleCode, rootEntityCode, rootEntityName,relEntityCodes, null));
            }
            pages.add(getPage(EntityPageSet.COMPLEX_CREATE, moduleCode, rootEntityCode, rootEntityName, relEntityCodes, rootEntityCode + EntityPageSet.COMPLEX_MGR.id));
            pages.add(getPage(EntityPageSet.COMPLEX_EDIT, moduleCode, rootEntityCode, rootEntityName, relEntityCodes, rootEntityCode + EntityPageSet.COMPLEX_MGR.id));
            pages.add(getPage(EntityPageSet.COMPLEX_DETAIL, moduleCode, rootEntityCode, rootEntityName, relEntityCodes, rootEntityCode + EntityPageSet.COMPLEX_MGR.id));
        }

        return pages;
    }

    private Page getPage(EntityPageSet entityPage, String moduleCode, String rootEntityCode, String rootEntityName, String[] relEntityCodes, String relPageCode) {
        Page page = new Page();

        page.setId(rootEntityCode + entityPage.id);
        page.setName(rootEntityName + entityPage.name);
        page.setPageTemplate(entityPage.pageTemplate);
        page.setDataSet(moduleCode + "/" + rootEntityCode);
        page.setRelPage(relPageCode);
        page.setComponentList(new ArrayList<Component>());
        String[] components = entityPage.component;
        for (String componentId : components) {
            Component component = new Component();
            component.setId(componentId);
            if(componentId.equals("qForm")) {
                component.setDataSet(moduleCode + "/" + rootEntityCode + "_DS4Q");
            }else if(componentId.equals("cList") && relEntityCodes != null) {
                component.setDataSet(moduleCode + "/" + relEntityCodes[0]);
            }else if(componentId.equals("eList") && relEntityCodes != null) {
                component.setDataSet(moduleCode + "/" + relEntityCodes[0]);
            }else if(componentId.equals("qList") && relEntityCodes != null) {
                component.setDataSet(moduleCode + "/" + relEntityCodes[0]);
            }else {
                component.setDataSet(moduleCode + "/" + rootEntityCode);
            }
            page.getComponentList().add(component);
        }

        return page;
    }




    /**
     * 代码差异比对
     * @return
     */
    @RequestMapping(value = "/page_load.json")
    @ResponseBody
    public ResultData getPageLoad(HttpServletRequest request){
        logger.debug("request : {}");
        try{
            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            String companyCode = "hframe";
            Long programId = null;
            String programCode = "hframe";
            String programName = "框架";
            Long moduleId = null;
            String moduleCode = "hframe";
            String moduleName = "框架";
            if(pageFlowParams != null) {
                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
                    programId = program.getHfpmProgramId();
                    programCode = program.getHfpmProgramCode();
                    programName = program.getHfpmProgramName();
                }
                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
                    moduleId = module.getHfpmModuleId();
                    moduleCode = module.getHfpmModuleCode();
                    moduleName = module.getHfpmModuleName();

                }
            }
            HfmdEntity_Example example = new HfmdEntity_Example();
            HfmdEntity_Example.Criteria criteria = example.createCriteria();
            if(programId != null) criteria.andHfpmProgramIdEqualTo(programId);
            if(moduleId != null) criteria.andHfpmModuleIdEqualTo(moduleId);

            if(programId == null && moduleId == null) criteria.andHfmdEntityCodeLike("hf%");


            final List<HfmdEntity> hfmdEntityListByExample = iHfmdEntitySV.getHfmdEntityListByExample(example);

            Map<Module, List<List<Entity>>> entityRelats = WebContext.get(companyCode,programCode,"default").getEntityRelats();
            final Map<Module, List<List<HfmdEntity>>> todoList = new HashMap<Module, List<List<HfmdEntity>>>();
            for (Module module : entityRelats.keySet()) {
                todoList.put(module, new ArrayList<List<HfmdEntity>>());
                List<List<HfmdEntity>> targetList = todoList.get(module);
                List<List<Entity>> originList = entityRelats.get(module);
                for (List<Entity> entities : originList) {
                    List<HfmdEntity> target = new ArrayList<HfmdEntity>();
                    for (Entity entity : entities) {
                        if(StringUtils.isNotBlank(entity.getText())) {
                            target.add(getHfmdEntity(hfmdEntityListByExample, entity));
                        }
                    }
                    targetList.add(target);
                }
            }


            System.out.println("==>" + JSON.toJSONString(entityRelats));
            return ResultData.success(new HashMap<String,Object>(){{
                put("TodoList", hfmdEntityListByExample);
                put("DownList", todoList);
            }});
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    private HfmdEntity getHfmdEntity(List<HfmdEntity> hfmdEntityListByExample, Entity entity) {
        Iterator<HfmdEntity> iterator = hfmdEntityListByExample.iterator();
        while (iterator.hasNext()) {
            HfmdEntity hfmdEntity = iterator.next();
            if(entity.getText().equals(hfmdEntity.getHfmdEntityCode())) {
                iterator.remove();
                return hfmdEntity;
            }
        }
        return null;
    }
}
