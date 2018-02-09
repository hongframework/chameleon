package com.hframework.controller.ext;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Joiner;
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
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.message.XmlUtils;
import com.hframework.controller.ext.bean.AuthManager;
import com.hframework.controller.ext.bean.AuthObject;
import com.hframework.controller.ext.bean.AuthObjectAttr;
import com.hframework.controller.ext.bean.AuthObjects;
import com.hframework.generator.web.container.bean.Entity;
import com.hframework.web.controller.DefaultController;
import com.hframework.common.springext.datasource.DataSourceContextHolder;
import com.hframework.generator.util.CreatorUtil;
import com.hframework.generator.web.container.HfModelContainer;
import com.hframework.generator.web.container.HfModelContainerUtil;
import com.hframework.generator.web.sql.SqlGeneratorUtil;
import com.hframework.generator.web.sql.reverse.SQLParseUtil;
import com.hframework.web.context.WebContext;
import com.hframework.web.config.bean.Program;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.MessageFormat;
import java.util.*;

/**
 * Created by zhangquanhong on 2016/12/11.
 */
@Controller
@RequestMapping(value = "/extend")
public class DbGeneratorController extends ExtBaseController {
    private static final Logger logger = LoggerFactory.getLogger(DbGeneratorController.class);

    protected transient RepositoryService repositoryService = ProcessEngines.getDefaultProcessEngine().getRepositoryService();

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


    private static final String INSERT_HFSEC_USER_SQL =
            "insert into hfsec_user(account,password, hfsec_user_name, avatar, status, hfsec_organize_id) values (\"{0}\",\"{1}\",\"{2}\",\"{3}\",1,1)";

    private static final String SELECT_HFSEC_ROLE_SQL = "SELECT hfsec_role_id,hfsec_role_code,hfsec_role_name,hfsec_role_type,status FROM hfsec_role;";

    private static final String SELECT_HFSEC_ROLE_2_SQL = "SELECT 2 AS hfsec_role_id," +
            "'general_operator' AS hfsec_role_code,'普通操作员' AS hfsec_role_name," +
            "1 AS hfsec_role_type,1 AS status " +
            "UNION SELECT 1,'super_operator','超级管理员',1,1 " +
            "UNION SELECT 3,'report_viewer','报表人员',2,1;";
    private static final String SELECT_HFSEC_ORGANIZE_SQL = "SELECT hfsec_organize_id,hfsec_organize_code,hfsec_organize_name,hfsec_organize_type,hfsec_organize_level,status,parent_hfsec_organize_id FROM hfsec_organize;";
    private static final String SELECT_HFSEC_ORGANIZE_2_SQL = " SELECT 1 AS hfsec_organize_id,'ROOT' AS hfsec_organize_code,'集团' AS hfsec_organize_name,1 AS hfsec_organize_type,1 AS hfsec_organize_level,1 AS status,-1 AS parent_hfsec_organize_id;";

    private static final String SELECT_HFSEC_USER_AUTH_SQL = "SELECT hfsec_user_authorize_id, hfsec_user_id, hfsec_organize_id, hfsec_role_id, status FROM hfsec_user_authorize;";
    private static final String SELECT_HFSEC_USER_AUTH_2_SQL = "SELECT 1 AS hfsec_user_authorize_id, 1 AS hfsec_user_id, 1 AS hfsec_organize_id, 1 AS hfsec_role_id, 1 AS status;";


    private static final String SELECT_HFMD_ENUM_SQL = "SELECT hfmd_enum_value,CONCAT('<font color=\"red\">',hfmd_enum_text,'</font>') as hfmd_enum_text," +
            "hfmd_enum_desc,is_default,pri,hfmd_enum_class_id,hfmd_enum_class_code,del_flag FROM hfmd_enum t  " +
            "WHERE EXISTS (SELECT 1 FROM hfmd_enum_class c WHERE c.hfmd_enum_class_id = t.hfmd_enum_class_id)";
    private static final String SELECT_HFMD_ENUM_CLASS_SQL = "SELECT hfmd_enum_class_id,hfmd_enum_class_name,CONCAT('<font color=\"red\">',hfmd_enum_class_code,'</font>') " +
            "as hfmd_enum_class_code,hfmd_enum_class_desc,del_flag FROM hfmd_enum_class t";

    private static final String SELECT_ACT_RE_MODEL_SQL_FORMAT = "SELECT mdl.*\n" +
            "FROM hfpm_data_field fld,\n" +
            "  hfpm_data_set st,act_re_model mdl\n" +
            "WHERE fld.hfpm_data_set_id = st.hfpm_data_set_id\n" +
            "    AND mdl.id_ = fld.workfow_model_id\n" +
            "    AND st.hfpm_program_id IN ({0});";

    private static final String SELECT_ACT_GE_BYTEARRAY_SQL_FORMAT = "SELECT btarr.*\n" +
            "FROM hfpm_data_field fld,\n" +
            "  hfpm_data_set st,act_re_model mdl,\n" +
            "  act_ge_bytearray btarr\n" +
            "WHERE fld.hfpm_data_set_id = st.hfpm_data_set_id\n" +
            "    AND mdl.id_ = fld.workfow_model_id\n" +
            "    AND (btarr.ID_ = mdl.EDITOR_SOURCE_VALUE_ID_ OR btarr.ID_ = mdl.EDITOR_SOURCE_EXTRA_VALUE_ID_)\n" +
            "    AND st.hfpm_program_id IN ({0});";

    /**
     * 重新加载（全量）
     * @return
     */
    @RequestMapping(value = "/model_diff.json")
    @ResponseBody
    public ResultData getModelDiff(HttpServletRequest request){
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


//            final String hfcfgDbConnectId = request.getParameter("hfcfgDbConnectId");



            String  configSqlPath= modelLoaderService.load(companyCode, programCode, programeName, moduleCode, moduleName);

            HfModelContainer targetModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
                    configSqlPath, programCode, programeName, moduleCode, moduleName);


            startDynamicDataSource(pageFlowParams);
            String dbSqlPath = SqlGeneratorUtil.createSqlFile(companyCode, programCode);

            String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode, programCode, null);
            Program program = XmlUtils.readValueFromAbsoluteFilePath(projectBasePath + "/basic/src/main/resources/program/program.xml", Program.class);
//            HfsecUser_Example example = new HfsecUser_Example();
//            example.createCriteria().andAccountEqualTo(program.getSuperManager().getCode());
//            int hfsecUserCountByExample = 0 ;
//            try{
//                hfsecUserCountByExample = hfsecUserSV.getHfsecUserCountByExample(example);
//            }catch(Exception e){}

            DataSourceContextHolder.clear();

            HfModelContainer curDbModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
                    dbSqlPath, programCode, programeName, moduleCode, moduleName);
            System.out.println("==>" + JSONObject.toJSONString(curDbModelContainer));
            final HfModelContainer[] resultModelContainers =
                    HfModelContainerUtil.mergerModelContainer(curDbModelContainer, targetModelContainer);
            final List<String> result = HfModelContainerUtil.getSql(resultModelContainers[0], resultModelContainers[1], false, true);
            final List<Map<String, String>> sqls = new ArrayList<Map<String, String>>();
            for (final String sql : result) {
                sqls.add(new HashMap<String, String>(){{
                    put("sql",sql.replaceAll("\n", ""));
                }});
            }

            AuthManager authManager = AuthManager.load(iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV, programId);
            AuthManager.calcAuthObjectKeyAttr(authManager.data, AuthManager.organizeModel);
            AuthManager.calcAuthObjectKeyAttr(authManager.user, AuthManager.userModel);
            AuthManager.calcAuthObjectKeyAttr(authManager.superFunc, AuthManager.roleModel);
            AuthManager.calcAuthObjectKeyAttr(authManager.enumsClass, AuthManager.enumClassModel);
            AuthManager.calcAuthObjectKeyAttr(authManager.enums, AuthManager.enumModel);

            AuthObjects mainAuthObjects = new AuthObjects();
            mainAuthObjects.addAll(authManager.data);
            mainAuthObjects.addAll(authManager.user);
            mainAuthObjects.addAll(authManager.superFunc);
            AuthManager.calcAuthObjectKeyAttr(authManager.userToSuperFunc, mainAuthObjects);
            AuthManager.calcAuthObjectKeyAttr(authManager.userToData, mainAuthObjects);

//            String insertOrganizeSql = calcInsertSql(authManager.data);
//            String insertUserSql = calcInsertSql(authManager.user);
//            String insertSuperFuncSql = calcInsertSql(authManager.superFunc);

            //添加枚举值变更sql语句
            List<String> enumSqls =  getEnumSql(authManager, programId, pageFlowParams,program, request, curDbModelContainer.getEntityAttrCountMap().containsKey("act_re_model"));
            for (final String enumSql : enumSqls) {
                sqls.add(new HashMap<String, String>() {{
                    put("sql", enumSql);
                }});
            }



//            if(hfsecUserCountByExample ==  0) {
//                final String sql = MessageFormat.format(insertUserSql,1, program.getSuperManager().getCode(),
//                        program.getSuperManager().getPassword(), program.getSuperManager().getName(), "http://pic.hanhande.com/files/141127/1283574_094432_8946.jpg",1,1);
//
//                sqls.add(new HashMap<String, String>() {{
//                    put("sql", sql);
//                }});
//            }
            //这部内容已由具体的连带规则实现，无需再次买点处理
//            generateDefaultDataSetIfNotExists(resultModelContainers, programCode, programeName, moduleCode, moduleName);

//            WebContext.putContext("hfcfgDbConnectId", hfcfgDbConnectId);
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







    private List<String> getEnumSql(final AuthManager authManager, final Long finalProgramId, Map<String, String> pageFlowParams, final Program program, HttpServletRequest request, boolean containActModel) throws Exception {

        List<String> sqls = new ArrayList<String>();

        startDynamicDataSource(pageFlowParams);
        List<Map<String, Object>> curUserList = AuthManager.getDynamicTableDataSome(commonDataService,AuthManager.calcSelectSql(authManager.user.get(0)));
        List<Map<String, Object>> curEnumClassList = AuthManager.getDynamicTableDataSome(commonDataService,AuthManager.calcSelectSql(authManager.enumsClass.get(0)));

        List<Map<String, Object>> curEnumList = AuthManager.getDynamicTableDataSome(commonDataService,AuthManager.calcSelectSql(authManager.enums.get(0)));

        List<Map<String, Object>> curRoleList = AuthManager.getDynamicTableDataSome(commonDataService,AuthManager.calcSelectSql(authManager.superFunc.get(0)));
        List<Map<String, Object>> curOrganizeList = AuthManager.getDynamicTableDataSome(commonDataService,AuthManager.calcSelectSql(authManager.data.get(0)));
        Map<AuthObject, List<Map<String, Object>>[]> bridgeListMap = new HashMap<AuthObject, List<Map<String, Object>>[]>();
        for (AuthObject bridgeObject : authManager.userToSuperFunc) {
            if(bridgeObject.keyAttrs.size() != 0) {
                List<Map<String, Object>>[] array = new List[2];
                array[0] = AuthManager.getDynamicTableDataSome(commonDataService,AuthManager.calcSelectSql(bridgeObject));
                bridgeListMap.put(bridgeObject, array);
            }
        }
//        List<Map<String, Object>> curUserAuthList = getDynamicTableDataSome(SELECT_HFSEC_USER_AUTH_SQL);
        List<Map<String, Object>> curActReModel = AuthManager.getDynamicTableDataSome(commonDataService,"SELECT * FROM act_re_model");
//        List<Map<String, Object>> curActGeByteArrayModel = AuthManager.getDynamicTableDataSome(commonDataService,"SELECT * FROM act_ge_bytearray");




        DataSourceContextHolder.clear();

        List<Object> keyAttrs = authManager.enumsClass.get(0).keyAttrs;
        List<Map<String, Object>> enumClassList = AuthManager.getDynamicTableDataSome(commonDataService,MessageFormat.format(
                "SELECT hfmd_enum_class_id as \"{0}\",hfmd_enum_class_name as \"{2}\",CONCAT(^<font color=\"red\">^,hfmd_enum_class_code,^</font>^) " +
                        " as \"{1}\", del_flag as \"{3}\" FROM hfmd_enum_class t ", keyAttrs.get(0), keyAttrs.get(1), keyAttrs.get(2), keyAttrs.get(3)).replaceAll("\\^", "'")
                + " where (t.hfpm_program_id IN (" + finalProgramId + ") OR hfpm_program_id IS NULL) AND (t.hfmd_enum_class_code LIKE 'DEFAULT.%' OR EXISTS (SELECT 1 FROM hfmd_entity_attr attr WHERE attr.hfmd_enum_class_id = t.hfmd_enum_class_id AND attr.hfpm_program_id IN(" + finalProgramId + ")));");

        keyAttrs = authManager.enums.get(0).keyAttrs;
        List<Map<String, Object>> enumList = AuthManager.getDynamicTableDataSome(commonDataService,MessageFormat.format("SELECT hfmd_enum_value as \"{0}\",CONCAT(^<font color=\"red\">^,hfmd_enum_text,^</font>^) as {1}," +
                "hfmd_enum_desc as \"{2}\",is_default as \"{3}\",pri as \"{4}\",hfmd_enum_class_id as \"{5}\",del_flag as \"{6}\" FROM hfmd_enum t  " +
                "WHERE EXISTS (SELECT 1 FROM hfmd_enum_class c WHERE c.hfmd_enum_class_id = t.hfmd_enum_class_id "
                , keyAttrs.get(0), keyAttrs.get(1), keyAttrs.get(2), keyAttrs.get(3), keyAttrs.get(4), keyAttrs.get(5), keyAttrs.get(6)).replaceAll("\\^", "'")
                + "and (c.hfpm_program_id IN (" + finalProgramId + ") OR hfpm_program_id IS NULL ) AND (c.hfmd_enum_class_code LIKE 'DEFAULT.%' OR EXISTS (SELECT 1 FROM hfmd_entity_attr attr WHERE attr.hfmd_enum_class_id = c.hfmd_enum_class_id AND attr.hfpm_program_id IN(" + finalProgramId + "))))");

        List<Map<String, Object>> roleList = AuthManager.getDynamicTableDataSome(commonDataService,
                AuthManager.calcSelectDualSql(authManager.superFunc.get(0), Lists.newArrayList(new Object[]{1, program.getAuthInstance().getSuperAuthFilter().getDataFieldValue(), "超级管理员", 1}, new Object[]{2, "general_operator", "普通管理员", 1})));
        List<Map<String, Object>> organizeList = AuthManager.getDynamicTableDataSome(commonDataService,
                AuthManager.calcSelectDualSql(authManager.data.get(0), new ArrayList<Object[]>() {{
            add(new Object[]{1, "ROOT", "集团", 1, -1});
        }}));
        List<Map<String, Object>> userList = AuthManager.getDynamicTableDataSome(commonDataService,
                AuthManager.calcSelectDualSql(authManager.user.get(0), new ArrayList<Object[]>() {{
            add(new Object[]{1, program.getSuperManager().getCode(),
                    program.getSuperManager().getPassword(), program.getSuperManager().getName(), "http://pic.hanhande.com/files/141127/1283574_094432_8946.jpg", 1, 1});
        }}));
        for (AuthObject authObject : bridgeListMap.keySet()) {
            final Object[] data = new Object[authObject.keyAttrs.size()];
            for (int i = 0; i < authObject.authObjectKeyAttrs.size(); i++) {
                if(authObject.authObjectKeyAttrs.get(i).isNumeric){
                    data[i] = 1;
                }else {
                    data[i] = "1";
                }
            }
            bridgeListMap.get(authObject)[1] = AuthManager.getDynamicTableDataSome(commonDataService,AuthManager.calcSelectDualSql(authObject, new ArrayList<Object[]>() {{
                add(data);
            }}));
        }

        List<Map<String, Object>> actReModel = AuthManager.getDynamicTableDataSome(commonDataService,MessageFormat.format(SELECT_ACT_RE_MODEL_SQL_FORMAT, String.valueOf(151031375445L)));
//        List<Map<String, Object>> actGeByteArrayModel = AuthManager.getDynamicTableDataSome(commonDataService,MessageFormat.format(SELECT_ACT_GE_BYTEARRAY_SQL_FORMAT, String.valueOf(151031375445L)));


//        List<Map<String, Object>> userAuthList = getDynamicTableDataSome(SELECT_HFSEC_USER_AUTH_2_SQL);

        final List<Object> finalKeyAttrs = keyAttrs;
        CollectionUtils.remove(enumList, curEnumList, new Merger<String, Map<String, Object>>() {
            public <K> K getKey(Map<String, Object> objectMap) {
                return (K) (String.valueOf(objectMap.get(finalKeyAttrs.get(5)) + String.valueOf(objectMap.get(finalKeyAttrs.get(0)))));
            }

            public <K> K groupKey(Map<String, Object> objectMap) {
                return (K) (String.valueOf(objectMap.get(finalKeyAttrs.get(5)) + String.valueOf(objectMap.get(finalKeyAttrs.get(0)))));
            }
        });
        keyAttrs = authManager.enumsClass.get(0).keyAttrs;
        final List<Object> finalKeyAttrs1 = keyAttrs;
        CollectionUtils.remove(enumClassList, curEnumClassList, new Merger<String, Map<String,Object>>() {
            public <K> K getKey(Map<String, Object> objectMap) {
                return (K) (String.valueOf(objectMap.get(finalKeyAttrs1.get(0))) + String.valueOf(finalKeyAttrs1.get(1)));
            }

            public <K> K groupKey(Map<String, Object> objectMap) {
                return (K) (String.valueOf(objectMap.get(finalKeyAttrs1.get(0))) + String.valueOf(finalKeyAttrs1.get(1)));
            }
        });

        CollectionUtils.remove(roleList, curRoleList, new Merger<String, Map<String,Object>>() {
            public <K> K getKey(Map<String, Object> objectMap) {
                return (K) String.valueOf(objectMap.get(authManager.superFunc.get(0).keyAttrs.get(0)));
            }

            public <K> K groupKey(Map<String, Object> objectMap) {
                return (K) String.valueOf(objectMap.get(authManager.superFunc.get(0).keyAttrs.get(0)));
            }
        });

        CollectionUtils.remove(organizeList, curOrganizeList, new Merger<String, Map<String,Object>>() {
            public <K> K getKey(Map<String, Object> objectMap) {
                return (K) String.valueOf(objectMap.get(authManager.data.get(0).keyAttrs.get(0)));
            }

            public <K> K groupKey(Map<String, Object> objectMap) {
                return (K) String.valueOf(objectMap.get(authManager.data.get(0).keyAttrs.get(0)));
            }
        });

        CollectionUtils.remove(userList, curUserList, new Merger<String, Map<String,Object>>() {
            public <K> K getKey(Map<String, Object> objectMap) {
                return (K) String.valueOf(objectMap.get(authManager.user.get(0).keyAttrs.get(0)));
            }

            public <K> K groupKey(Map<String, Object> objectMap) {
                return (K) String.valueOf(objectMap.get(authManager.user.get(0).keyAttrs.get(0)));
            }
        });

        for (Map.Entry<AuthObject, List<Map<String, Object>>[]> authObjectEntry : bridgeListMap.entrySet()) {
            final AuthObject key = authObjectEntry.getKey();
            List<Map<String, Object>>[] value = authObjectEntry.getValue();
            CollectionUtils.remove(value[1], value[0], new Merger<String, Map<String, Object>>() {
                public <K> K getKey(Map<String, Object> objectMap) {
                    return (K) String.valueOf(objectMap.get(key.keyAttrs.get(0)));
                }

                public <K> K groupKey(Map<String, Object> objectMap) {
                    return (K) String.valueOf(objectMap.get(key.keyAttrs.get(0)));
                }
            });
        }

        CollectionUtils.remove(actReModel, curActReModel, new Merger<String, Map<String,Object>>() {
            public <K> K getKey(Map<String, Object> objectMap) {
                return (K) (String.valueOf(objectMap.get("NAME_")) +  String.valueOf(objectMap.get("KEY_"))) ;
            }

            public <K> K groupKey(Map<String, Object> objectMap) {
                return (K) (String.valueOf(objectMap.get("NAME_")) +  String.valueOf(objectMap.get("KEY_"))) ;
            }
        });

//        CollectionUtils.remove(actGeByteArrayModel, curActGeByteArrayModel, new Merger<String, Map<String,Object>>() {
//            public <K> K getKey(Map<String, Object> objectMap) {
//                return (K)String.valueOf(objectMap.get("ID_"));
//            }
//
//            public <K> K groupKey(Map<String, Object> objectMap) {
//                return  (K)String.valueOf(objectMap.get("ID_"));
//            }
//        });



        List<String> roleSqls = HfModelContainerUtil.getSql(roleList, authManager.superFunc.get(0).tableName, false);
        for (String roleSql : roleSqls) {
            sqls.add(roleSql + ";");
        }

        List<String> organizeSqls = HfModelContainerUtil.getSql(organizeList, authManager.data.get(0).tableName, false);
        for (String organizeSql : organizeSqls) {
            sqls.add(organizeSql + ";");
        }

        List<String> userSqls = HfModelContainerUtil.getSql(userList, authManager.user.get(0).tableName, false);
        for (String userSql : userSqls) {
            sqls.add(userSql + ";");
        }

        for (Map.Entry<AuthObject, List<Map<String, Object>>[]> authObjectEntry : bridgeListMap.entrySet()) {
            final AuthObject key = authObjectEntry.getKey();
            List<Map<String, Object>>[] value = authObjectEntry.getValue();
            List<String> userAuthorizeSqls = HfModelContainerUtil.getSql(value[1], key.tableName, false);
            for (String userAuthorizeSql : userAuthorizeSqls) {
                sqls.add(userAuthorizeSql + ";");
            }
        }


        Map<Long, List<Map<String, Object>>> enumClassMap = CollectionUtils.group(enumList, new Grouper<Long, Map<String, Object>>() {
            public <K> K groupKey(Map<String, Object> objectMap) {
                return (K) objectMap.get(authManager.enums.get(0).keyAttrs.get(5));
            }
        });

        for (Map<String, Object> enumClass : enumClassList) {
            List<String> hfmd_enum_class = HfModelContainerUtil.getSql(Lists.newArrayList(enumClass), authManager.enumsClass.get(0).tableName, false);
            String mergeSql = "";
            for (final String sql : hfmd_enum_class) {
                mergeSql += (sql + ";");
            }

            if(enumClassMap.containsKey(enumClass.get(authManager.enums.get(0).keyAttrs.get(5)))) {
                List<Map<String, Object>> enums = enumClassMap.remove(enumClass.get(authManager.enums.get(0).keyAttrs.get(5)));
                List<String> hfmd_enum = HfModelContainerUtil.getSql(enums, authManager.enums.get(0).tableName, false);
                for (final String sql : hfmd_enum) {
                    mergeSql += ("<br/>" + sql + ";");

                }
            }
            sqls.add(mergeSql);
        }

        for (List<Map<String, Object>> enumInfo : enumClassMap.values()) {
            List<String> hfmd_enum = HfModelContainerUtil.getSql(enumInfo, authManager.enums.get(0).tableName, false);
            for (final String sql : hfmd_enum) {
                sqls.add(sql + ";");
            }
        }
//
//        List<String> actGeByteArrays = HfModelContainerUtil.getSql(actGeByteArrayModel, "act_ge_bytearray", false);
//        for (Map<String, Object> map : actGeByteArrayModel) {
//            HttpSession session = request.getSession();
//
//            if(session.getAttribute("BlobObjectCache") == null) {
//                session.setAttribute("BlobObjectCache", new HashMap<String, Object>());
//            }
//            Map<String, Object[]> blobObjectCache = (Map<String, Object[]>) session.getAttribute("BlobObjectCache");
//            blobObjectCache.put(map.get("BYTES_").toString(), new Object[]{map.get("ID_").toString(), map.get("BYTES_")});
//        }
//        for (String actGeByteArraySql : actGeByteArrays) {
//            sqls.add(actGeByteArraySql + ";");
//        }
//        for (Map<String, Object> map : actReModel) {
//            map.remove("EDITOR_SOURCE_VALUE_ID_");
//            map.remove("EDITOR_SOURCE_EXTRA_VALUE_ID_");
//            map.remove("DEPLOYMENT_ID_");
//        }
        List<String> actReModels = HfModelContainerUtil.getSql(actReModel, "act_re_model", false);
        if(!containActModel && actReModels.size() > 0) {
            sqls.add("CREATE TABLE `act_re_deployment` (\n" +
                    "  `ID_` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',\n" +
                    "  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `CATEGORY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',\n" +
                    "  `DEPLOY_TIME_` timestamp NULL DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`ID_`)\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;");
            sqls.add("CREATE TABLE `act_ge_bytearray` (\n" +
                    "  `ID_` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',\n" +
                    "  `REV_` int(11) DEFAULT NULL,\n" +
                    "  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `DEPLOYMENT_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `BYTES_` longblob,\n" +
                    "  `GENERATED_` tinyint(4) DEFAULT NULL,\n" +
                    "  PRIMARY KEY (`ID_`),\n" +
                    "  KEY `ACT_FK_BYTEARR_DEPL` (`DEPLOYMENT_ID_`),\n" +
                    "  CONSTRAINT `ACT_FK_BYTEARR_DEPL` FOREIGN KEY (`DEPLOYMENT_ID_`) REFERENCES `act_re_deployment` (`ID_`)\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;\n");
            sqls.add("CREATE TABLE `act_re_model` (\n" +
                    "  `ID_` varchar(64) COLLATE utf8_bin NOT NULL,\n" +
                    "  `REV_` int(11) DEFAULT NULL,\n" +
                    "  `NAME_` varchar(255) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `KEY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `CATEGORY_` varchar(255) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `CREATE_TIME_` timestamp NULL DEFAULT NULL,\n" +
                    "  `LAST_UPDATE_TIME_` timestamp NULL DEFAULT NULL,\n" +
                    "  `VERSION_` int(11) DEFAULT NULL,\n" +
                    "  `META_INFO_` varchar(4000) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `DEPLOYMENT_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `EDITOR_SOURCE_VALUE_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `EDITOR_SOURCE_EXTRA_VALUE_ID_` varchar(64) COLLATE utf8_bin DEFAULT NULL,\n" +
                    "  `TENANT_ID_` varchar(255) COLLATE utf8_bin DEFAULT '',\n" +
                    "  PRIMARY KEY (`ID_`),\n" +
                    "  KEY `ACT_FK_MODEL_SOURCE` (`EDITOR_SOURCE_VALUE_ID_`),\n" +
                    "  KEY `ACT_FK_MODEL_SOURCE_EXTRA` (`EDITOR_SOURCE_EXTRA_VALUE_ID_`),\n" +
                    "  KEY `ACT_FK_MODEL_DEPLOYMENT` (`DEPLOYMENT_ID_`),\n" +
                    "  CONSTRAINT `ACT_FK_MODEL_DEPLOYMENT` FOREIGN KEY (`DEPLOYMENT_ID_`) REFERENCES `act_re_deployment` (`ID_`),\n" +
                    "  CONSTRAINT `ACT_FK_MODEL_SOURCE` FOREIGN KEY (`EDITOR_SOURCE_VALUE_ID_`) REFERENCES `act_ge_bytearray` (`ID_`),\n" +
                    "  CONSTRAINT `ACT_FK_MODEL_SOURCE_EXTRA` FOREIGN KEY (`EDITOR_SOURCE_EXTRA_VALUE_ID_`) REFERENCES `act_ge_bytearray` (`ID_`)\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;");
        }

        for (String modelSql : actReModels) {
            sqls.add(modelSql.replaceAll("\\{","&123;").replaceAll("\\}","&125;") + ";");
        }
        return sqls;
    }



    /**
     * 重新加载（全量）
     * @return
     */
    @RequestMapping(value = "/model_execute.json")
    @ResponseBody
    public ResultData modelExecute(@RequestParam(value="checkIds[]",required=false) String[] sqls, HttpServletRequest request){
        if(sqls != null && sqls.length > 0 && !sqls[0].endsWith(";")) {
            sqls = new String[]{Joiner.on(",").join(sqls)};
        }
        logger.debug("request : {}", sqls);
        Map<String, int[]> actReModelSet = new HashMap<String, int[]>();
        List<String> result = new ArrayList<String>();
        List<String> actReModelSqlList = new ArrayList<String>();
        for (String sql : sqls) {
            if(sql.contains("insert into")) {
                String[] split = sql.split(";[ ]*insert into");
                for (String s : split) {
                    if(StringUtils.isNotBlank(s)) {
                        String insertSql = (s.startsWith("insert into ") ? "" : "insert into ") + (s.endsWith(";") ? s : (s + ";"));
                        if(insertSql.contains("insert into act_re_model")) {
                            insertSql = insertSql.replace("&123;", "{").replace("&125;", "}");
                            int idIndex = insertSql.substring(0, insertSql.indexOf("`ID_`")).split(",").length;
                            int sourceIdIndex = insertSql.substring(0, insertSql.indexOf("`EDITOR_SOURCE_VALUE_ID_`")).split(",").length;
                            int sourceExtIdIndex = insertSql.substring(0, insertSql.indexOf("`EDITOR_SOURCE_EXTRA_VALUE_ID_`")).split(",").length;

                            String idValue = insertSql.substring(insertSql.lastIndexOf("(")).split("','")[idIndex];
                            String sourceId = insertSql.substring(insertSql.lastIndexOf("(")).split("','")[sourceIdIndex];
                            String sourceExtId = insertSql.substring(insertSql.lastIndexOf("(")).split("','")[sourceExtIdIndex];
                            actReModelSet.put(idValue, new int[]{Integer.parseInt(sourceId), Integer.parseInt(sourceExtId)});
                            actReModelSqlList.add(insertSql);
                        }else {
                            result.add(insertSql);
                        }


                    }
                }
            }else {
                result.add(sql);
            }
        }
        try{

            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            startDynamicDataSource(pageFlowParams);
            commonDataService.executeDBStructChange(result);
            DataSourceContextHolder.clear();

            for (String actReModelId : actReModelSet.keySet()) {
                List<Map<String, Object>> actGeByteArrayModel = AuthManager.getDynamicTableDataSome(commonDataService,
                        MessageFormat.format("SELECT `ID_` AS id, `REV_` AS rev, `NAME_` AS NAME, `DEPLOYMENT_ID_` AS deploymentId, `BYTES_` AS bytes, `GENERATED_` AS generated FROM act_ge_bytearray where id_ in ({0},{1});",
                                String.valueOf(actReModelSet.get(actReModelId)[0]),
                                String.valueOf(actReModelSet.get(actReModelId)[1])));
                startDynamicDataSource(pageFlowParams);
                for (Map<String, Object> map : actGeByteArrayModel) {
                    commonDataService.insertActGeByteArray(map);
                }
                DataSourceContextHolder.clear();
            }

            startDynamicDataSource(pageFlowParams);
            commonDataService.executeDBStructChange(actReModelSqlList);
            DataSourceContextHolder.clear();
            return ResultData.success();
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }finally {
            DataSourceContextHolder.clear();
        }
    }
}
