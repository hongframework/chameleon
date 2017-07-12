package com.hframework.controller.ext;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfpmModule;
import com.hframe.domain.model.HfpmProgram;
import com.hframe.domain.model.HfusEntityStore;
import com.hframe.service.interfaces.*;
import com.hframework.base.service.CommonDataService;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.base.service.ModelLoaderService;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.common.util.collect.bean.Grouper;
import com.hframework.common.util.StringUtils;
import com.hframework.web.controller.DefaultController;
import com.hframework.common.springext.datasource.DataSourceContextHolder;
import com.hframework.generator.web.container.HfModelContainer;
import com.hframework.generator.web.container.HfModelContainerUtil;
import com.hframework.generator.web.sql.HfModelService;
import com.hframework.generator.web.sql.reverse.SQLParseUtil;
import com.hframework.web.context.WebContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangquanhong on 2016/12/11.
 */
@Controller
@RequestMapping(value = "/extend")
public class EntityGeneratorController extends ExtBaseController {
    private static final Logger logger = LoggerFactory.getLogger(EntityGeneratorController.class);
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
     * 常用实体添加-选择组合
     * @return
     */
    @RequestMapping(value = "/general_entity_add.json")
    @ResponseBody
    public ResultData generalEntityAdd(HttpServletRequest request){
        logger.debug("request : {}");
        try{
            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            String companyCode = "hframe";
            String programCode = "hframe";
            Long programId = -1L;
            String programeName = "框架";
            String moduleCode = "hframe";
            String moduleName = "框架";
            if(pageFlowParams != null) {
                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
                    programCode = program.getHfpmProgramCode();
                    programId = program.getHfpmProgramId();
                    programeName = program.getHfpmProgramName();
                }
                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
                    moduleCode = module.getHfpmModuleCode();
                    moduleName = module.getHfpmModuleName();
                }
            }

            List<HfusEntityStore> hfusEntityStoreAll = hfusEntityStoreSV.getHfusEntityStoreAll();
            final Map<Byte, List<HfusEntityStore>> hfusEntityStoreMap =
                    CollectionUtils.group(hfusEntityStoreAll, new Grouper<Byte, HfusEntityStore>() {
                        public <K> K groupKey(HfusEntityStore hfusEntityStore) {
                            return (K) hfusEntityStore.getEntityGroup();
                        }
                    });

            final List<Map<String, String>> authList = new ArrayList();
            final List<Map<String, String>> dicList = new ArrayList();
            for (Byte groupId : hfusEntityStoreMap.keySet()) {
                List<HfusEntityStore> hfusEntityStores = hfusEntityStoreMap.get(groupId);
                Map<Byte, List<HfusEntityStore>> convert = CollectionUtils.group(hfusEntityStores, new Grouper<Byte, HfusEntityStore>() {
                    public <K> K groupKey(HfusEntityStore hfusEntityStore) {
                        return (K) hfusEntityStore.getHfusEntityStoreType();
                    }
                });

                Map map = new HashMap();
                map.put("groupId", groupId);
                if(convert.containsKey((byte)1)) {

                    setVal(map, convert, "userEntityName", 1);
                    setVal(map, convert, "dataEntityName", 2);
                    setVal(map, convert, "funcEntityName", 3);
                    setVal(map, convert, "userAuthPath", 4);
                    setVal(map, convert, "funcAuthPath", 5);
                    authList.add(map);
                }else {
                    setVal(map, convert, "dictionary", 6);
                    setVal(map, convert, "dictionaryItem", 7);
                    dicList.add(map);
                }
            }
            return ResultData.success(new HashMap<String,Object>(){{
                put("hfpmProgramCfgAuthPart", new HashMap<String, Object>() {{
                    put("list", authList);
                }});
                put("hfpmProgramCfgDictPart", new HashMap<String, Object>() {{
                    put("list", dicList);
                }});

            }});
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }finally {
            DataSourceContextHolder.clear();
        }
    }

    private void setVal(Map map, Map<Byte, List<HfusEntityStore>> convert, String fieldName, int index) {
        if(convert.containsKey((byte)index)) {
            String fieldValue = "";
            for (HfusEntityStore hfusEntityStore : convert.get((byte) index)){
                fieldValue += (hfusEntityStore.getHfusEntityStoreName() + "【" + hfusEntityStore.getHfusEntityStoreCode() + "】，");
            }
            map.put(fieldName, fieldValue.substring(0, fieldValue.length()-1));
        }
    }

    /**
     * 常用实体添加-预执行差异比对
     * @return
     */
    @RequestMapping(value = "/general_entity_add_diff.json")
    @ResponseBody
    public ResultData general_entity_add_save(HttpServletRequest request){
        logger.debug("request : {}");
        try{
            String[] groupIds = request.getParameterValues("checkIds");
            List<HfusEntityStore> hfusEntityStoreAll = hfusEntityStoreSV.getHfusEntityStoreAll();
            final Map<Byte, List<HfusEntityStore>> hfusEntityStoreMap =
                    CollectionUtils.group(hfusEntityStoreAll, new Grouper<Byte, HfusEntityStore>() {
                        public <K> K groupKey(HfusEntityStore hfusEntityStore) {
                            return (K) hfusEntityStore.getEntityGroup();
                        }
                    });
            List<String> sqlList = new ArrayList<String>();
            for (String groupId : groupIds) {
                List<HfusEntityStore> hfusEntityStores = hfusEntityStoreMap.get(Byte.parseByte(groupId));
                sqlList.addAll(CollectionUtils.fetch(hfusEntityStores, new Fetcher<HfusEntityStore, String>() {
                    public String fetch(HfusEntityStore hfusEntityStore) {
                        return hfusEntityStore.getSqlContent();
                    }
                }));
            }
            return modelDiff(Joiner.on("").join(sqlList), request);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }finally {
            DataSourceContextHolder.clear();
        }
    }

    /**
     * 反向工程-差异比对
     * @return
     */
    @RequestMapping(value = "/sql_reverse_diff.json")
    @ResponseBody
    public ResultData sqlReverse(HttpServletRequest request){
        logger.debug("request : {}");
        String sqlContent = request.getParameter("sql");
        return modelDiff(sqlContent.replaceAll("\t"," "), request);

    }

    private ResultData modelDiff(String sqlContent, HttpServletRequest request) {
        try{
            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            String companyCode = "hframe";
            String programCode = "hframe";
            Long programId = -1L;
            String programeName = "框架";
            String moduleCode = "hframe";
            String moduleName = "框架";
            if(pageFlowParams != null) {
                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
                    programCode = program.getHfpmProgramCode();
                    programId = program.getHfpmProgramId();
                    programeName = program.getHfpmProgramName();
                }
                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
                    moduleCode = module.getHfpmModuleCode();
                    moduleName = module.getHfpmModuleName();
                }
            }
//
//            String  configSqlPath= modelLoaderService.load(companyCode, programCode, programeName, moduleCode, moduleName);
//
//            HfModelContainer curlModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
//                    configSqlPath, programCode, programeName, moduleCode, moduleName);
            HfModelContainer curlModelContainer = HfModelService.get().getModelContainerFromDB(
                    programCode, programeName, moduleCode, moduleName);


            HfModelContainer targetSqlModelContainer = SQLParseUtil.parseModelContainerFromSQL(
                    sqlContent, programCode, programeName, moduleCode, moduleName);


            final HfModelContainer[] resultModelContainers =
                    HfModelContainerUtil.mergerModelContainer(curlModelContainer, targetSqlModelContainer);
            final List<String> result = HfModelContainerUtil.getSql(resultModelContainers[0], resultModelContainers[1]);
            final List<Map<String, String>> sqls = new ArrayList<Map<String, String>>();
            for (final String sql : result) {
                sqls.add(new HashMap<String, String>(){{
                    put("sql",sql.replaceAll("\n", ""));
                }});
            }
            return ResultData.success(new HashMap<String,Object>(){{
                put("NewEntityId", new HashMap<String, Object>() {{
                    put("list", Lists.newArrayList(resultModelContainers[0].getEntityMap().values()));
                }});
                put("NewEntityAttrId", new HashMap<String, Object>() {{
                    put("list", Lists.newArrayList(resultModelContainers[0].getEntityAttrMap().values()));
                }});
                put("ModEntityId", new HashMap<String, Object>() {{
                    put("list", Lists.newArrayList(resultModelContainers[1].getEntityMap().values()));
                }});
                put("ModEntityAttrId", new HashMap<String, Object>() {{
                    put("list", Lists.newArrayList(resultModelContainers[1].getEntityAttrMap().values()));
                }});
                put("SelectDbConnector", new HashMap<String, Object>() {{
                    put("data", new HashMap(){{
                        put("hfcfgDbConnectId",null);
                    }});
                }});


                put("sql", new HashMap<String, Object>() {{
                    put("list", sqls);
                }});
            }});
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }finally {
            DataSourceContextHolder.clear();
        }

    }



    /**
     * 反向工程-实体生成
     * @return
     */
    @RequestMapping(value = "/sql_reverse_execute.json")
    @ResponseBody
    public ResultData sqlReverseExecute(@RequestParam(value="checkIds[]",required=false) String[] sqls, HttpServletRequest request){
        logger.debug("request : {}");
        try{
            if(sqls != null && sqls.length > 1) {
                if(!sqls[0].endsWith(";")) {
                    sqls = new String[]{Joiner.on(",").join(sqls)};
                }

            }
            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            String companyCode = "hframe";
            String programCode = "hframe";
            Long programId = -1L;
            String programeName = "框架";
            String moduleCode = "hframe";
            String moduleName = "框架";
            if(pageFlowParams != null) {
                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
                    programCode = program.getHfpmProgramCode();
                    programId = program.getHfpmProgramId();
                    programeName = program.getHfpmProgramName();
                    companyCode = program.getOwnerCode();
                }
                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
                    moduleCode = module.getHfpmModuleCode();
                    moduleName = module.getHfpmModuleName();
                }
            }

//            String  configSqlPath= modelLoaderService.load(companyCode, programCode, programeName, moduleCode, moduleName);
//
//            HfModelContainer curlModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
//                    configSqlPath, programCode, programeName, moduleCode, moduleName);
            HfModelContainer curlModelContainer = HfModelService.get().getModelContainerFromDB(
                    programCode, programeName, moduleCode, moduleName);

            String sqlContent = Joiner.on("").join(sqls);
            HfModelContainer targetSqlModelContainer = SQLParseUtil.parseModelContainerFromSQL(
                    sqlContent, programCode, programeName, moduleCode, moduleName);

            final HfModelContainer[] resultModelContainers =
                    HfModelContainerUtil.mergerModelContainer(curlModelContainer, targetSqlModelContainer);
            HfModelService.get().executeModelInsert(resultModelContainers[0]);
            HfModelService.get().executeModelUpdate(resultModelContainers[1]);

            return ResultData.success();
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }finally {
            DataSourceContextHolder.clear();
        }
    }


}
