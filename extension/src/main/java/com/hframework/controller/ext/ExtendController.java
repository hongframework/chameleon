package com.hframework.controller.ext;

/**
 * User: zhangqh6
 * Date: 2016/5/11 0:16:16
 */
//@Controller
//@RequestMapping(value = "/extend")
public class ExtendController {
//    private static final Logger logger = LoggerFactory.getLogger(ExtendController.class);
//
//    private static final String INSERT_HFSEC_USER_SQL =
//            "insert into hfsec_user(account,password, hfsec_user_name, avatar, status,hfsec_organize_id) values (\"{0}\",\"{1}\",\"{2}\",\"{3}\",1,1)";
//
//    private static final String SELECT_HFSEC_ROLE_SQL = "SELECT hfsec_role_id,hfsec_role_code,hfsec_role_name,hfsec_role_type,status FROM hfsec_role;";
//
//    private static final String SELECT_HFSEC_ROLE_2_SQL = "SELECT 2 AS hfsec_role_id," +
//            "'general_operator' AS hfsec_role_code,'普通操作员' AS hfsec_role_name," +
//            "1 AS hfsec_role_type,1 AS status " +
//            "UNION SELECT 1,'super_operator','超级管理员',1,1 " +
//            "UNION SELECT 3,'report_viewer','报表人员',2,1;";
//    private static final String SELECT_HFSEC_ORGANIZE_SQL = "SELECT hfsec_organize_id,hfsec_organize_code,hfsec_organize_name,hfsec_organize_type,hfsec_organize_level,status,parent_hfsec_organize_id FROM hfsec_organize;";
//    private static final String SELECT_HFSEC_ORGANIZE_2_SQL = " SELECT 1 AS hfsec_organize_id,'ROOT' AS hfsec_organize_code,'集团' AS hfsec_organize_name,1 AS hfsec_organize_type,1 AS hfsec_organize_level,1 AS status,-1 AS parent_hfsec_organize_id;";
//
//    private static final String SELECT_HFSEC_USER_AUTH_SQL = "SELECT hfsec_user_authorize_id, hfsec_user_id, hfsec_organize_id, hfsec_role_id, status FROM hfsec_user_authorize;";
//    private static final String SELECT_HFSEC_USER_AUTH_2_SQL = "SELECT 1 AS hfsec_user_authorize_id, 1 AS hfsec_user_id, 1 AS hfsec_organize_id, 1 AS hfsec_role_id, 1 AS status;";
//
//
//    private static final String SELECT_HFMD_ENUM_SQL = "SELECT hfmd_enum_value,CONCAT('<font color=\"red\">',hfmd_enum_text,'</font>') as hfmd_enum_text," +
//            "hfmd_enum_desc,is_default,pri,hfmd_enum_class_id,hfmd_enum_class_code,del_flag FROM hfmd_enum t  " +
//            "WHERE EXISTS (SELECT 1 FROM hfmd_enum_class c WHERE c.hfmd_enum_class_id = t.hfmd_enum_class_id)";
//    private static final String SELECT_HFMD_ENUM_CLASS_SQL = "SELECT hfmd_enum_class_id,hfmd_enum_class_name,CONCAT('<font color=\"red\">',hfmd_enum_class_code,'</font>') " +
//            "as hfmd_enum_class_code,hfmd_enum_class_desc,del_flag FROM hfmd_enum_class t";
//    @Resource
//    private DataSetLoaderService dataSetLoaderService;
//
//    @Resource
//    private ModelLoaderService modelLoaderService;
//    @Resource
//    private CommonDataService commonDataService;
//
//    @Resource
//    private IHfpmProgramSV hfpmProgramSV;
//
//    @Resource
//    private IHfsecMenuSV hfsecMenuSV;
//
//    @Resource
//    private IHfsecUserSV hfsecUserSV;
//
//
//    @Resource
//    private IHfpmModuleSV hfpmModuleSV;
//
//    @Resource
//    private IHfcfgDbConnectSV iHfcfgDbConnectSV;
//    @Resource
//    private IHfpmProgramCfgSV iHfpmProgramCfgSV;
//
//    @Resource
//    private IHfusEntityStoreSV hfusEntityStoreSV;
//
//    @Resource
//    private IHfsecMenuSV iHfsecMenuSV;
//
//    @Resource
//    private IHfmdEntitySV iHfmdEntitySV;
//
//    @Resource
//    private IHfmdEntityAttrSV hfmdEntityAttrSV;
//
//    public enum EntityPageSet{
//
//        SINGLE_MGR("_mgr","管理","qlist",new String[]{"qForm"}),
//        SINGLE_CREATE("_create","创建","create",new String[]{}),
//        SINGLE_EDIT("_edit","修改","edit",new String[]{}),
//        SINGLE_DETAIL("_detail","明细","edit",new String[]{}),
//
//        COMPLEX_MGR("_mgr","管理","qlist",new String[]{"qForm"}),
//        COMPLEX_CREATE("_create","添加","cComb",new String[]{"cForm","cList"}),
//        COMPLEX_EDIT("_edit","修改","eComb",new String[]{"eForm","eList"}),
//        COMPLEX_DETAIL("_detail","查看","dComb",new String[]{"dForm","qList"}),
//
//        CATEGORY_MGR("_mgr","管理","editByCategory",new String[]{});
//
//        String id;
//        String name;
//        String pageTemplate;
//        String[] component;
//
//        EntityPageSet(String id, String name, String pageTemplate, String[] component) {
//            this.id = id;
//            this.name = name;
//            this.pageTemplate = pageTemplate;
//            this.component = component;
//        }
//    }
//
//    /**
//     * 重新加载（全量）
//     * @return
//     */
//    @RequestMapping(value = "/model_diff.json")
//    @ResponseBody
//    public ResultData getModelDiff(HttpServletRequest request){
//        logger.debug("request : {}");
//        try{
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//
//            String companyCode = "hframe";
//            String programCode = "hframe";
//            Long programId = -1L;
//            String programeName = "框架";
//            String moduleCode = "hframe";
//            String moduleName = "框架";
//            if(pageFlowParams != null) {
//                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
//                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
//                    programCode = program.getHfpmProgramCode();
//                    programId = program.getHfpmProgramId();
//                    programeName = program.getHfpmProgramName();
//                }
//                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
//                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
//                    moduleCode = module.getHfpmModuleCode();
//                    moduleName = module.getHfpmModuleName();
//                }
//            }
//
//
//
////            final String hfcfgDbConnectId = request.getParameter("hfcfgDbConnectId");
//
//
//
//            String  configSqlPath= modelLoaderService.load(companyCode, programCode, programeName, moduleCode, moduleName);
//
//            HfModelContainer targetModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
//                    configSqlPath, programCode, programeName, moduleCode, moduleName);
//
//
//            startDynamicDataSource(pageFlowParams);
//            String dbSqlPath = SqlGeneratorUtil.createSqlFile(companyCode, programCode);
//
//            String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode,
//                    "hframe".equals(programCode) ? "trunk" : programCode, null);
//            Program program = XmlUtils.readValueFromAbsoluteFilePath(projectBasePath + "/hframe-web/src/main/resources/program/program.xml", Program.class);
//            HfsecUser_Example example = new HfsecUser_Example();
//            example.createCriteria().andAccountEqualTo(program.getSuperManager().getCode());
//            int hfsecUserCountByExample = 0 ;
//            try{
//                hfsecUserCountByExample = hfsecUserSV.getHfsecUserCountByExample(example);
//            }catch(Exception e){}
//
//            DataSourceContextHolder.clear();
//
//            HfModelContainer curDbModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
//                    dbSqlPath, programCode, programeName, moduleCode, moduleName);
//
//            final HfModelContainer[] resultModelContainers =
//                    HfModelContainerUtil.mergerModelContainer(curDbModelContainer, targetModelContainer);
//            final List<String> result = HfModelContainerUtil.getSql(resultModelContainers[0], resultModelContainers[1]);
//            final List<Map<String, String>> sqls = new ArrayList<Map<String, String>>();
//            for (final String sql : result) {
//                sqls.add(new HashMap<String, String>(){{
//                    put("sql",sql.replaceAll("\n", ""));
//                }});
//            }
//
//            //添加枚举值变更sql语句
//            List<String> enumSqls =  getEnumSql(programId, pageFlowParams);
//            for (final String enumSql : enumSqls) {
//                sqls.add(new HashMap<String, String>() {{
//                    put("sql", enumSql);
//                }});
//            }
//
//
//            if(hfsecUserCountByExample ==  0) {
//                final String sql = MessageFormat.format(INSERT_HFSEC_USER_SQL, program.getSuperManager().getCode(),
//                        program.getSuperManager().getPassword(), program.getSuperManager().getName(), "http://pic.hanhande.com/files/141127/1283574_094432_8946.jpg");
//
//                sqls.add(new HashMap<String, String>() {{
//                    put("sql", sql);
//                }});
//            }
//            //这部内容已由具体的连带规则实现，无需再次买点处理
////            generateDefaultDataSetIfNotExists(resultModelContainers, programCode, programeName, moduleCode, moduleName);
//
////            WebContext.putContext("hfcfgDbConnectId", hfcfgDbConnectId);
//            return ResultData.success(new HashMap<String,Object>(){{
//                put("NewEntityId", new HashMap<String, Object>() {{
//                    put("list", Lists.newArrayList(resultModelContainers[0].getEntityMap().values()));
//                }});
//                put("NewEntityAttrId", new HashMap<String, Object>() {{
//                    put("list", Lists.newArrayList(resultModelContainers[0].getEntityAttrMap().values()));
//                }});
//                put("ModEntityId", new HashMap<String, Object>() {{
//                    put("list", Lists.newArrayList(resultModelContainers[1].getEntityMap().values()));
//                }});
//                put("ModEntityAttrId", new HashMap<String, Object>() {{
//                    put("list", Lists.newArrayList(resultModelContainers[1].getEntityAttrMap().values()));
//                }});
//                put("SelectDbConnector", new HashMap<String, Object>() {{
//                    put("data", new HashMap(){{
//                        put("hfcfgDbConnectId",null);
//                    }});
//                }});
//
//
//                put("sql", new HashMap<String, Object>() {{
//                    put("list", sqls);
//                }});
//            }});
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//    }
//
//
//
//    /**
//     * 重新加载（全量）
//     * @return
//     */
//    @RequestMapping(value = "/general_entity_add.json")
//    @ResponseBody
//    public ResultData generalEntityAdd(HttpServletRequest request){
//        logger.debug("request : {}");
//        try{
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//
//            String companyCode = "hframe";
//            String programCode = "hframe";
//            Long programId = -1L;
//            String programeName = "框架";
//            String moduleCode = "hframe";
//            String moduleName = "框架";
//            if(pageFlowParams != null) {
//                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
//                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
//                    programCode = program.getHfpmProgramCode();
//                    programId = program.getHfpmProgramId();
//                    programeName = program.getHfpmProgramName();
//                }
//                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
//                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
//                    moduleCode = module.getHfpmModuleCode();
//                    moduleName = module.getHfpmModuleName();
//                }
//            }
//
//            List<HfusEntityStore> hfusEntityStoreAll = hfusEntityStoreSV.getHfusEntityStoreAll();
//            final Map<Byte, List<HfusEntityStore>> hfusEntityStoreMap =
//                    CollectionUtils.group(hfusEntityStoreAll, new Grouper<Byte, HfusEntityStore>() {
//                        public <K> K groupKey(HfusEntityStore hfusEntityStore) {
//                            return (K) hfusEntityStore.getEntityGroup();
//                        }
//                    });
//
//            final List<Map<String, String>> authList = new ArrayList();
//            final List<Map<String, String>> dicList = new ArrayList();
//            for (Byte groupId : hfusEntityStoreMap.keySet()) {
//                List<HfusEntityStore> hfusEntityStores = hfusEntityStoreMap.get(groupId);
//                Map<Byte, List<HfusEntityStore>> convert = CollectionUtils.group(hfusEntityStores, new Grouper<Byte, HfusEntityStore>() {
//                    public <K> K groupKey(HfusEntityStore hfusEntityStore) {
//                        return (K) hfusEntityStore.getHfusEntityStoreType();
//                    }
//                });
//
//                Map map = new HashMap();
//                map.put("groupId", groupId);
//                if(convert.containsKey((byte)1)) {
//
//                    setVal(map, convert, "userEntityName", 1);
//                    setVal(map, convert, "dataEntityName", 2);
//                    setVal(map, convert, "funcEntityName", 3);
//                    setVal(map, convert, "userAuthPath", 4);
//                    setVal(map, convert, "funcAuthPath", 5);
//                    authList.add(map);
//                }else {
//                    setVal(map, convert, "dictionary", 6);
//                    setVal(map, convert, "dictionaryItem", 7);
//                    dicList.add(map);
//                }
//            }
//            return ResultData.success(new HashMap<String,Object>(){{
//                put("hfpmProgramCfgAuthPart", new HashMap<String, Object>() {{
//                    put("list", authList);
//                }});
//                put("hfpmProgramCfgDictPart", new HashMap<String, Object>() {{
//                    put("list", dicList);
//                }});
//
//            }});
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//    }
//
//    private void setVal(Map map, Map<Byte, List<HfusEntityStore>> convert, String fieldName, int index) {
//        if(convert.containsKey((byte)index)) {
//            String fieldValue = "";
//            for (HfusEntityStore hfusEntityStore : convert.get((byte) index)){
//                fieldValue += (hfusEntityStore.getHfusEntityStoreName() + "【" + hfusEntityStore.getHfusEntityStoreCode() + "】，");
//            }
//            map.put(fieldName, fieldValue.substring(0, fieldValue.length()-1));
//        }
//    }
//
//    private List<String> getEnumSql(final Long finalProgramId, Map<String, String> pageFlowParams) throws Exception {
//
//        List<String> sqls = new ArrayList<String>();
//
//        startDynamicDataSource(pageFlowParams);
//        List<Map<String, Object>> curEnumList = getDynamicTableDataSome(SELECT_HFMD_ENUM_SQL);
//        List<Map<String, Object>> curEnumClassList = getDynamicTableDataSome(SELECT_HFMD_ENUM_CLASS_SQL);
//
//        List<Map<String, Object>> curRoleList = getDynamicTableDataSome(SELECT_HFSEC_ROLE_SQL);
//        List<Map<String, Object>> curUserAuthList = getDynamicTableDataSome(SELECT_HFSEC_USER_AUTH_SQL);
//        List<Map<String, Object>> curOrganizeList = getDynamicTableDataSome(SELECT_HFSEC_ORGANIZE_SQL);
//
//        DataSourceContextHolder.clear();
//
//        List<Map<String, Object>> enumList = getDynamicTableDataSome(SELECT_HFMD_ENUM_SQL + "and (t.hfpm_program_id IN (\" + finalProgramId + \") OR hfpm_program_id IS NULL )");
//        List<Map<String, Object>> enumClassList = getDynamicTableDataSome(SELECT_HFMD_ENUM_CLASS_SQL + " where t.hfpm_program_id IN (" + finalProgramId + ") OR hfpm_program_id IS NULL");
//
//        List<Map<String, Object>> roleList = getDynamicTableDataSome(SELECT_HFSEC_ROLE_2_SQL);
//        List<Map<String, Object>> userAuthList = getDynamicTableDataSome(SELECT_HFSEC_USER_AUTH_2_SQL);
//        List<Map<String, Object>> organizeList = getDynamicTableDataSome(SELECT_HFSEC_ORGANIZE_2_SQL);
//
//        CollectionUtils.remove(enumList, curEnumList, new Merger<String, Map<String,Object>>() {
//            public <K> K getKey(Map<String, Object> objectMap) {
//                return (K) (String.valueOf(objectMap.get("hfmd_enum_class_id")) + String.valueOf(objectMap.get("hfmd_enum_value")));
//            }
//
//            public <K> K groupKey(Map<String, Object> objectMap) {
//                return (K) (String.valueOf(objectMap.get("hfmd_enum_class_id")) + String.valueOf(objectMap.get("hfmd_enum_value")));
//            }
//        });
//
//        CollectionUtils.remove(enumClassList, curEnumClassList, new Merger<String, Map<String,Object>>() {
//            public <K> K getKey(Map<String, Object> objectMap) {
//                return (K) (String.valueOf(objectMap.get("hfmd_enum_class_id")) + String.valueOf(objectMap.get("hfmd_enum_class_code")));
//            }
//
//            public <K> K groupKey(Map<String, Object> objectMap) {
//                return (K) (String.valueOf(objectMap.get("hfmd_enum_class_id")) + String.valueOf(objectMap.get("hfmd_enum_class_code")));
//            }
//        });
//
//        CollectionUtils.remove(roleList, curRoleList, new Merger<String, Map<String,Object>>() {
//            public <K> K getKey(Map<String, Object> objectMap) {
//                return (K) String.valueOf(objectMap.get("hfsec_role_id"));
//            }
//
//            public <K> K groupKey(Map<String, Object> objectMap) {
//                return (K) String.valueOf(objectMap.get("hfsec_role_id"));
//            }
//        });
//
//        CollectionUtils.remove(organizeList, curOrganizeList, new Merger<String, Map<String,Object>>() {
//            public <K> K getKey(Map<String, Object> objectMap) {
//                return (K) String.valueOf(objectMap.get("hfsec_organize_id"));
//            }
//
//            public <K> K groupKey(Map<String, Object> objectMap) {
//                return (K) String.valueOf(objectMap.get("hfsec_organize_id"));
//            }
//        });
//
//        CollectionUtils.remove(userAuthList, curUserAuthList, new Merger<String, Map<String,Object>>() {
//            public <K> K getKey(Map<String, Object> objectMap) {
//                return (K) String.valueOf(objectMap.get("hfsec_user_authorize_id"));
//            }
//
//            public <K> K groupKey(Map<String, Object> objectMap) {
//                return (K) String.valueOf(objectMap.get("hfsec_user_authorize_id"));
//            }
//        });
//
//        List<String> roleSqls = HfModelContainerUtil.getSql(roleList, "hfsec_role", false);
//        for (String roleSql : roleSqls) {
//            sqls.add(roleSql + ";");
//        }
//
//        List<String> organizeSqls = HfModelContainerUtil.getSql(organizeList, "hfsec_organize", false);
//        for (String organizeSql : organizeSqls) {
//            sqls.add(organizeSql + ";");
//        }
//
//        List<String> userAuthorizeSqls = HfModelContainerUtil.getSql(userAuthList, "hfsec_user_authorize", false);
//        for (String userAuthorizeSql : userAuthorizeSqls) {
//            sqls.add(userAuthorizeSql + ";");
//        }
//
//        Map<Long, List<Map<String, Object>>> enumClassMap = CollectionUtils.group(enumList, new Grouper<Long, Map<String, Object>>() {
//            public <K> K groupKey(Map<String, Object> objectMap) {
//                return (K) objectMap.get("hfmd_enum_class_id");
//            }
//        });
//
//        for (Map<String, Object> enumClass : enumClassList) {
//            List<String> hfmd_enum_class = HfModelContainerUtil.getSql(Lists.newArrayList(enumClass), "hfmd_enum_class", false);
//            String mergeSql = "";
//            for (final String sql : hfmd_enum_class) {
//                mergeSql += (sql + ";");
//            }
//
//            if(enumClassMap.containsKey(enumClass.get("hfmd_enum_class_id"))) {
//                List<Map<String, Object>> enums = enumClassMap.remove(enumClass.get("hfmd_enum_class_id"));
//                List<String> hfmd_enum = HfModelContainerUtil.getSql(enums, "hfmd_enum", false);
//                for (final String sql : hfmd_enum) {
//                    mergeSql += ("<br/>" + sql + ";");
//
//                }
//            }
//            sqls.add(mergeSql);
//        }
//
//        for (List<Map<String, Object>> enumInfo : enumClassMap.values()) {
//            List<String> hfmd_enum = HfModelContainerUtil.getSql(enumInfo, "hfmd_enum", false);
//            for (final String sql : hfmd_enum) {
//                sqls.add(sql + ";");
//            }
//        }
//
//
//        return sqls;
//    }
//
//    private List<Map<String, Object>> getDynamicTableDataSome(final String sql) {
//        List<Map<String, Object>> list = null;
//        try{
//            list =  commonDataService.selectDynamicTableDataSome(new HashMap<String, String>() {{
//                put("sql", sql);
//            }});
//        }catch (Exception e){};
//        return list;
//    }
//
//
//    /**
//     * 重新加载（全量）
//     * @return
//     */
//    @RequestMapping(value = "/sql_reverse_diff.json")
//    @ResponseBody
//    public ResultData sqlReverse(HttpServletRequest request){
//        logger.debug("request : {}");
//        String sqlContent = request.getParameter("sql");
//        return modelDiff(sqlContent, request);
//
//    }
//
//    private ResultData modelDiff(String sqlContent, HttpServletRequest request) {
//        try{
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//
//            String companyCode = "hframe";
//            String programCode = "hframe";
//            Long programId = -1L;
//            String programeName = "框架";
//            String moduleCode = "hframe";
//            String moduleName = "框架";
//            if(pageFlowParams != null) {
//                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
//                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
//                    programCode = program.getHfpmProgramCode();
//                    programId = program.getHfpmProgramId();
//                    programeName = program.getHfpmProgramName();
//                }
//                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
//                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
//                    moduleCode = module.getHfpmModuleCode();
//                    moduleName = module.getHfpmModuleName();
//                }
//            }
////
////            String  configSqlPath= modelLoaderService.load(companyCode, programCode, programeName, moduleCode, moduleName);
////
////            HfModelContainer curlModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
////                    configSqlPath, programCode, programeName, moduleCode, moduleName);
//            HfModelContainer curlModelContainer = HfModelService.get().getModelContainerFromDB(
//                    programCode, programeName, moduleCode, moduleName);
//
//
//            HfModelContainer targetSqlModelContainer = SQLParseUtil.parseModelContainerFromSQL(
//                    sqlContent, programCode, programeName, moduleCode, moduleName);
//
//
//            final HfModelContainer[] resultModelContainers =
//                    HfModelContainerUtil.mergerModelContainer(curlModelContainer, targetSqlModelContainer);
//            final List<String> result = HfModelContainerUtil.getSql(resultModelContainers[0], resultModelContainers[1]);
//            final List<Map<String, String>> sqls = new ArrayList<Map<String, String>>();
//            for (final String sql : result) {
//                sqls.add(new HashMap<String, String>(){{
//                    put("sql",sql.replaceAll("\n", ""));
//                }});
//            }
//            return ResultData.success(new HashMap<String,Object>(){{
//                put("NewEntityId", new HashMap<String, Object>() {{
//                    put("list", Lists.newArrayList(resultModelContainers[0].getEntityMap().values()));
//                }});
//                put("NewEntityAttrId", new HashMap<String, Object>() {{
//                    put("list", Lists.newArrayList(resultModelContainers[0].getEntityAttrMap().values()));
//                }});
//                put("ModEntityId", new HashMap<String, Object>() {{
//                    put("list", Lists.newArrayList(resultModelContainers[1].getEntityMap().values()));
//                }});
//                put("ModEntityAttrId", new HashMap<String, Object>() {{
//                    put("list", Lists.newArrayList(resultModelContainers[1].getEntityAttrMap().values()));
//                }});
//                put("SelectDbConnector", new HashMap<String, Object>() {{
//                    put("data", new HashMap(){{
//                        put("hfcfgDbConnectId",null);
//                    }});
//                }});
//
//
//                put("sql", new HashMap<String, Object>() {{
//                    put("list", sqls);
//                }});
//            }});
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//
//    }
//
//
//    /**
//     * 重新加载（全量）
//     * @return
//     */
//    @RequestMapping(value = "/general_entity_add_diff.json")
//    @ResponseBody
//    public ResultData general_entity_add_save(HttpServletRequest request){
//        logger.debug("request : {}");
//        try{
//            String[] groupIds = request.getParameterValues("checkIds");
//            List<HfusEntityStore> hfusEntityStoreAll = hfusEntityStoreSV.getHfusEntityStoreAll();
//            final Map<Byte, List<HfusEntityStore>> hfusEntityStoreMap =
//                    CollectionUtils.group(hfusEntityStoreAll, new Grouper<Byte, HfusEntityStore>() {
//                        public <K> K groupKey(HfusEntityStore hfusEntityStore) {
//                            return (K) hfusEntityStore.getEntityGroup();
//                        }
//                    });
//            List<String> sqlList = new ArrayList<String>();
//            for (String groupId : groupIds) {
//                List<HfusEntityStore> hfusEntityStores = hfusEntityStoreMap.get(Byte.parseByte(groupId));
//                sqlList.addAll(CollectionUtils.fetch(hfusEntityStores, new Fetcher<HfusEntityStore, String>() {
//                    public String fetch(HfusEntityStore hfusEntityStore) {
//                        return hfusEntityStore.getSqlContent();
//                    }
//                }));
//            }
//            return modelDiff(Joiner.on("").join(sqlList), request);
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//    }
//
//    /**
//     * 重新加载（全量）
//     * @return
//     */
//    @RequestMapping(value = "/sql_reverse_execute.json")
//    @ResponseBody
//    public ResultData sqlReverseExecute(@RequestParam(value="checkIds[]",required=false) String[] sqls, HttpServletRequest request){
//        logger.debug("request : {}");
//        try{
//            if(sqls != null && sqls.length > 1) {
//                if(!sqls[0].endsWith(";")) {
//                    sqls = new String[]{Joiner.on(",").join(sqls)};
//                }
//
//            }
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//
//            String companyCode = "hframe";
//            String programCode = "hframe";
//            Long programId = -1L;
//            String programeName = "框架";
//            String moduleCode = "hframe";
//            String moduleName = "框架";
//            if(pageFlowParams != null) {
//                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
//                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
//                    programCode = program.getHfpmProgramCode();
//                    programId = program.getHfpmProgramId();
//                    programeName = program.getHfpmProgramName();
//                }
//                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
//                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
//                    moduleCode = module.getHfpmModuleCode();
//                    moduleName = module.getHfpmModuleName();
//                }
//            }
//
////            String  configSqlPath= modelLoaderService.load(companyCode, programCode, programeName, moduleCode, moduleName);
////
////            HfModelContainer curlModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
////                    configSqlPath, programCode, programeName, moduleCode, moduleName);
//            HfModelContainer curlModelContainer = HfModelService.get().getModelContainerFromDB(
//                    programCode, programeName, moduleCode, moduleName);
//
//            String sqlContent = Joiner.on("").join(sqls);
//            HfModelContainer targetSqlModelContainer = SQLParseUtil.parseModelContainerFromSQL(
//                    sqlContent, programCode, programeName, moduleCode, moduleName);
//
//            final HfModelContainer[] resultModelContainers =
//                    HfModelContainerUtil.mergerModelContainer(curlModelContainer, targetSqlModelContainer);
//            HfModelService.get().executeModelInsert(resultModelContainers[0]);
//            HfModelService.get().executeModelUpdate(resultModelContainers[1]);
//
//            return ResultData.success();
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//    }
//
//    private HfcfgDbConnect startDynamicDataSource(Map<String, String> pageFlowParams) throws Exception {
//        HfpmProgramCfg hfpmProgramCfg = new HfpmProgramCfg();
//        ReflectUtils.setFieldValue(hfpmProgramCfg, pageFlowParams);
//        HfpmProgramCfg_Example example = ExampleUtils.parseExample(hfpmProgramCfg, HfpmProgramCfg_Example.class);
//        List<HfpmProgramCfg> programCfgList = iHfpmProgramCfgSV.getHfpmProgramCfgListByExample(example);
//        if(programCfgList != null && programCfgList.size() == 1) {
//            HfpmProgramCfg programCfg = programCfgList.get(0);
//            Long hfcfgDbConnectId1 = programCfg.getHfcfgDbConnectId();
//            if(hfcfgDbConnectId1 != null) {
//                HfcfgDbConnect dbConnect = iHfcfgDbConnectSV.getHfcfgDbConnectByPK(hfcfgDbConnectId1);
//                String url = dbConnect.getUrl();
//                String user = dbConnect.getUser();
//                String password = dbConnect.getPassword();
//                DataSourceContextHolder.setDbInfo(url,user,password);
//                return dbConnect;
//            }
//
//        }
//
//        return null;
//    }
//
//    private void generateDefaultDataSetIfNotExists(HfModelContainer[] resultModelContainers, String programCode, String programName, String moduleCode, String moduleName) throws Exception {
//
//        HfModelContainer dbModelContainer = HfModelService.get().getModelContainerFromDB(
//                programCode, programName, moduleCode, moduleName);
//
//        resultModelContainers =
//                HfModelContainerUtil.mergerEntityToDataSetReturnOnly(resultModelContainers,dbModelContainer);
//        System.out.println(resultModelContainers);
//
//        HfModelService.get().executeModelInsert(resultModelContainers[0]);
////        HfModelService.get().executeModelUpdate(resultModelContainers[1]);
//    }
//
//    /**
//     * menuChart初始化处理
//     * @return
//     */
//    @RequestMapping(value = "/menu_chart.json")
//    @ResponseBody
//    public ResultData getMenuChart(HttpServletRequest request){
//        logger.debug("request : {}");
//        try{
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//
//            String companyCode = "hframe";
//            String programCode = "hframe";
//            String programeName = "框架";
//            String moduleCode = "hframe";
//            String moduleName = "框架";
//            if(pageFlowParams != null) {
//                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
//                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
//                    programCode = program.getHfpmProgramCode();
//                    programeName = program.getHfpmProgramName();
//                }
//                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
//                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
//                    moduleCode = module.getHfpmModuleCode();
//                    moduleName = module.getHfpmModuleName();
//                }
//            }
//
//            startDynamicDataSource(pageFlowParams);
//            HfsecMenu_Example hfsecMenuExample = new HfsecMenu_Example();
//            HfsecMenu hfsecMenu = new HfsecMenu();
//            hfsecMenu.setParentHfsecMenuId(-1L);
//            final Map<Long, List<HfsecMenu>> result = hfsecMenuSV.getHfsecMenuTreeByParentId(hfsecMenu, hfsecMenuExample);
//
//            HfsecMenu  virtualNode = new HfsecMenu();
//            virtualNode.setParentHfsecMenuId(-1L);
//            virtualNode.setHfsecMenuId(-2L);
//            virtualNode.setHfsecMenuName("未设置菜单");
//            if(!result.containsKey(-1L)) result.put(-1L, new ArrayList<HfsecMenu>());
//            result.get(-1L).add(virtualNode);
//
//            hfsecMenuExample = new HfsecMenu_Example();
//            hfsecMenu.setParentHfsecMenuId(-2L);
//            Map<Long, List<HfsecMenu>> virtualMenus = hfsecMenuSV.getHfsecMenuTreeByParentId(hfsecMenu, hfsecMenuExample);
//            if(virtualMenus.containsKey(-2L)) {
//
//                result.putAll(virtualMenus);
//            }
//
//            return ResultData.success(new HashMap<String,Object>(){{
//                put("AllMenuTree",result);
//            }});
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//    }
//
//
//    /**
//     * 数据保存
//     * @return
//     */
//    @RequestMapping(value = "/save_menu.json")
//    @ResponseBody
//    public ResultData saveData(HttpServletRequest request,
//                               HttpServletResponse response){
//
//        try {
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//            startDynamicDataSource(pageFlowParams);
//            ResultData resultData = new DefaultController().saveData(request, response);
//            return resultData;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//
//        return ResultData.error(ResultCode.UNKNOW);
//    }
//
//
//    /**
//     * 重新加载（全量）
//     * @return
//     */
//    @RequestMapping(value = "/model_execute.json")
//    @ResponseBody
//    public ResultData modelExecute(@RequestParam(value="checkIds[]",required=false) String[] sqls, HttpServletRequest request){
//        if(sqls != null && sqls.length > 0 && !sqls[0].endsWith(";")) {
//            sqls = new String[]{Joiner.on(",").join(sqls)};
//        }
//        logger.debug("request : {}", sqls);
//        List<String> result = new ArrayList<String>();
//        for (String sql : sqls) {
//            if(sql.contains("insert into")) {
//                String[] split = sql.split(";[ ]*insert into");
//                for (String s : split) {
//                    if(StringUtils.isNotBlank(s)) {
//                        result.add((s.startsWith("insert into ") ? "" : "insert into ") + (s.endsWith(";") ? s : (s + ";")));
//                    }
//                }
//            }else {
//                result.add(sql);
//            }
//        }
//        try{
//
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//            startDynamicDataSource(pageFlowParams);
//            commonDataService.executeDBStructChange(result);
//            return ResultData.success();
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//    }
//
//    /**
//     * 重新加载（全量）
//     * @return
//     */
//    @RequestMapping(value = "/code_generate.json")
//    @ResponseBody
//    public ResultData codeGenerate(@RequestParam(value="checkIds[]",required=false) Set<String> entityCodes, HttpServletRequest request){
//        logger.debug("request : {}", entityCodes);
//
//        try{
//
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//
//            String companyCode = "hframe";
//            String programCode = "hframe";
//            Long programId = -1L;
//            String programName = "框架";
//            String moduleCode = "hframe";
//            String moduleName = "框架";
//            if(pageFlowParams != null) {
//                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
//                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
//                    programId  = program.getHfpmProgramId();
//                    programCode = program.getHfpmProgramCode();
//                    programName = program.getHfpmProgramName();
//                }
//                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
//                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
//                    moduleCode = module.getHfpmModuleCode();
//                    moduleName = module.getHfpmModuleName();
//                }
//            }
//
//            startDynamicDataSource(pageFlowParams);
//            DataSourceContextHolder.DataSourceDescriptor dataSourceInfo = DataSourceContextHolder.getDBInfoAnyMore();
//            String sql = SqlGeneratorUtil.getSqlContent(entityCodes);
//            DataSourceContextHolder.clear();
//
//            final HfModelContainer hfModelContainer = SQLParseUtil.parseModelContainerFromSQL(sql, null, null, null, null);
//            HfModelContainer configModelContainer = HfModelService.get().getModelContainerFromDB(
//                    programCode, programName, moduleCode, moduleName);
//            List<Map<String, String>> tables = new ArrayList<Map<String, String>>();
//            for (final String tableName : entityCodes) {
//                final HfmdEntity entity = configModelContainer.getEntity(tableName);
//                HfmdEntityAttr keyAttrInfo = configModelContainer.getEntityAttr(tableName, tableName + "_id");
//                Long hfmdEntityAttrId = keyAttrInfo.getHfmdEntityAttrId();
//
//                HfmdEntityAttr_Example example = new HfmdEntityAttr_Example();
//                example.createCriteria().andRelHfmdEntityAttrIdEqualTo(hfmdEntityAttrId).andHfmdEntityIdEqualTo(entity.getHfmdEntityId());
//                List<HfmdEntityAttr> hfmdEntityAttrListByExample = hfmdEntityAttrSV.getHfmdEntityAttrListByExample(example);
//
//                HashMap<String, String> hashMap = new HashMap<String, String>() {{
//                    put("tableName", tableName);
//                    put("tableDesc", entity.getHfmdEntityName());
//                    put("generatedKey", tableName + "_id");
//
//                }};
//                if(hfmdEntityAttrListByExample != null && hfmdEntityAttrListByExample.size() > 0) {
//                    hashMap.put("parentId", hfmdEntityAttrListByExample.get(0).getHfmdEntityAttrCode());
//                }
//                tables.add(hashMap);
//            }
//
//            String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode,
//                    "hframe".equals(programCode) ? "trunk" : programCode, moduleCode);
//
//            String projectRootPath = projectBasePath + "\\hframe-core";
//
//            String mybatisConfigFilePath = BaseGeneratorUtil.generateMybatisConfig(tables, projectRootPath, programCode, dataSourceInfo);
//            MyBatisGeneratorUtil.generate(new File(mybatisConfigFilePath));
//            BaseGeneratorUtil.generator(mybatisConfigFilePath, companyCode, programCode, moduleCode);
//
//            ShellExecutor.exeCmd(projectBasePath + "/build/compile.bat");
//
//            return ResultData.success();
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }
//    }
//
//
//    /**
//     * 页面生成
//     * @return
//     */
//    @RequestMapping(value = "/page_generate.json")
//    @ResponseBody
//    public ResultData pageGenerate(@RequestParam(value="dataIds[]",required=false) List<String> entityCodes, String moduleCode, HttpServletRequest request){
//        logger.debug("request : {}", entityCodes, moduleCode);
//        try{
//
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//
//            String companyCode = "hframe";
//            Long programId = null;
//            String programCode = "hframe";
//            String programName = "框架";
//            Long moduleId = null;
//            String moduleName = "框架";
//            if(pageFlowParams != null) {
//                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
//                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
//                    programId = program.getHfpmProgramId();
//                    programCode = program.getHfpmProgramCode();
//                    programName = program.getHfpmProgramName();
//                }
////                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
////                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
////                    moduleCode = module.getHfpmModuleCode();
////                    moduleName = module.getHfpmModuleName();
////                }
//            }
//
//            HfmdEntity_Example example = new HfmdEntity_Example();
//            HfmdEntity_Example.Criteria criteria = example.createCriteria();
//            if(programId != null) criteria.andHfpmProgramIdEqualTo(programId);
//            if(moduleId != null) criteria.andHfpmModuleIdEqualTo(moduleId);
//
//
//            Map<String, Boolean> selfDependEntityCache =  new HashedMap();
//
//            if(programId == null && moduleId == null) criteria.andHfmdEntityCodeLike("hf%");
//            final List<HfmdEntity> hfmdEntityListByExample = iHfmdEntitySV.getHfmdEntityListByExample(example);
//
//            Map<String, HfmdEntity> cache = CollectionUtils.convert(hfmdEntityListByExample, new Mapper<String, HfmdEntity>() {
//                public <K> K getKey(HfmdEntity hfmdEntity) {
//                    return (K) hfmdEntity.getHfmdEntityCode();
//                }
//            });
//
//            Module module = new Module();
//            module.setCode(moduleCode);
//            List<Page> pageList = new ArrayList<Page>();
//            module.setPageList(pageList);
//
//            List<Page> menuList = new ArrayList<Page>();
//            for (String entityCode : entityCodes) {
//                if(StringUtils.isBlank(entityCode)) {
//                    continue;
//                }
//                String[] lineEntityCodes = entityCode.substring(0,entityCode.length()-1).split("\\|");
//                String rootEntityCode = lineEntityCodes[0];
//                String rootEntityName = cache.get(rootEntityCode).getHfmdEntityName();
//
//                String[] relEntityCodes = Arrays.copyOfRange(lineEntityCodes, 1, lineEntityCodes.length);
//
//                boolean isSelfDepend = isSelfDependEntity(selfDependEntityCache, cache.get(rootEntityCode));
//
//
//
//                List<Page> pages = getPages(moduleCode, rootEntityCode, rootEntityName, relEntityCodes, isSelfDepend);
//                menuList.add(pages.get(0));
//                pageList.addAll(pages);
//            }
//
//            WebContextHelper contextHelper = new WebContextHelper(companyCode, programCode,null, "default");
//            String pageFilePath = contextHelper.programConfigRootDir + "/" + contextHelper.programConfigModuleDir + "/" + moduleCode + ".xml";
//
//            String xml = XmlUtils.writeValueAsString(module);
////            String pageFilePath =  PropertyConfigurerUtils.getProperty(DataSetLoaderService.CreatorConst.PROJECT_BASE_FILE_PATH) +
////                    "/hframe-webtemplate/src/main/resources/program/hframe/module/" + moduleCode + ".xml";
//            System.out.println(pageFilePath);
//            System.out.println(xml);
//            FileUtils.writeFile(pageFilePath, xml);
//
//            //已经由具体的dataset变化时候动态加载到对应的xml文件中
//            dataSetLoaderService.load(companyCode,programCode,moduleCode);
//
//            startDynamicDataSource(pageFlowParams);
//            List<HfsecMenu> hfsecMenuList = iHfsecMenuSV.getHfsecMenuListByExample(new HfsecMenu_Example());
//            Iterator<Page> iterator = menuList.iterator();
//            while(iterator.hasNext()) {
//                Page page = iterator.next();
//                for (HfsecMenu hfsecMenu : hfsecMenuList) {
//                    if(page.getId().equals(hfsecMenu.getHfsecMenuCode())) {
//                        iterator.remove();
//                        break;
//                    }
//                }
//            }
//
//            for (Page page : menuList) {
//                HfsecMenu hfsecMenu = new HfsecMenu();
//                hfsecMenu.setHfsecMenuCode(page.getId());
//                hfsecMenu.setHfsecMenuName(page.getName());
//                hfsecMenu.setHfsecMenuDesc(page.getName());
//                hfsecMenu.setMenuLevel(1);
//                hfsecMenu.setParentHfsecMenuId(-2L);
//                hfsecMenu.setIcon("");
//                hfsecMenu.setUrl("/" + moduleCode + "/" + page.getId() + ".html");
//                iHfsecMenuSV.create(hfsecMenu);
//            }
//            return ResultData.success();
//        }catch (Exception e) {
//            logger.error("error : ", e);
//
//            return ResultData.error(ResultCode.ERROR);
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//    }
//
//    private boolean isSelfDependEntity(Map<String, Boolean> selfDependEntityCache, HfmdEntity hfmdEntity) throws Exception {
//        if(selfDependEntityCache.containsKey(hfmdEntity.getHfmdEntityCode())) {
//            return selfDependEntityCache.get(hfmdEntity.getHfmdEntityCode());
//        }
//
//        HfmdEntityAttr_Example hfmdEntityAttrExample = new HfmdEntityAttr_Example();
//        hfmdEntityAttrExample.createCriteria().andHfmdEntityIdEqualTo(hfmdEntity.getHfmdEntityId());
//        List<HfmdEntityAttr> hfmdEntityAttrList = hfmdEntityAttrSV.getHfmdEntityAttrListByExample(hfmdEntityAttrExample);
//        List<Long> hfmdEntityAttrIds = CollectionUtils.fetch(hfmdEntityAttrList, new Fetcher<HfmdEntityAttr, Long>() {
//            public Long fetch(HfmdEntityAttr hfmdEntityAttr) {
//                return hfmdEntityAttr.getHfmdEntityAttrId();
//            }
//        });
//
//        List<Long> relHfmdEntityAttrIds = CollectionUtils.fetch(hfmdEntityAttrList, new Fetcher<HfmdEntityAttr, Long>() {
//            public Long fetch(HfmdEntityAttr hfmdEntityAttr) {
//                return hfmdEntityAttr.getRelHfmdEntityAttrId();
//            }
//        });
//        hfmdEntityAttrIds.retainAll(relHfmdEntityAttrIds);
//        if(hfmdEntityAttrIds.size() > 0) {
//            selfDependEntityCache.put(hfmdEntity.getHfmdEntityCode(), true);
//        }else {
//            selfDependEntityCache.put(hfmdEntity.getHfmdEntityCode(), false);
//        }
//        return selfDependEntityCache.get(hfmdEntity.getHfmdEntityCode());
//    }
//
//    private List<Page> getPages(String moduleCode, String rootEntityCode, String rootEntityName, String[] relEntityCodes, boolean isSelfDepend) {
//
//        List<Page> pages = new ArrayList<Page>();
//
//
//        if(relEntityCodes == null || relEntityCodes.length == 0) {
//            if(isSelfDepend) {
//                pages.add(getPage(EntityPageSet.CATEGORY_MGR, moduleCode, rootEntityCode, rootEntityName,null, null));
//            }else {
//                pages.add(getPage(EntityPageSet.SINGLE_MGR, moduleCode, rootEntityCode, rootEntityName,null, null));
//            }
//            pages.add(getPage(EntityPageSet.SINGLE_CREATE, moduleCode, rootEntityCode, rootEntityName,null, rootEntityCode + EntityPageSet.SINGLE_MGR.id));
//            pages.add(getPage(EntityPageSet.SINGLE_EDIT, moduleCode, rootEntityCode, rootEntityName,null, rootEntityCode + EntityPageSet.SINGLE_MGR.id));
//            pages.add(getPage(EntityPageSet.SINGLE_DETAIL, moduleCode, rootEntityCode, rootEntityName,null,rootEntityCode + EntityPageSet.SINGLE_MGR.id ));
//
//        }else {
//            if(isSelfDepend) {
//                pages.add(getPage(EntityPageSet.CATEGORY_MGR, moduleCode, rootEntityCode, rootEntityName,null, null));
//            }else {
//                pages.add(getPage(EntityPageSet.COMPLEX_MGR, moduleCode, rootEntityCode, rootEntityName,relEntityCodes, null));
//            }
//            pages.add(getPage(EntityPageSet.COMPLEX_CREATE, moduleCode, rootEntityCode, rootEntityName, relEntityCodes, rootEntityCode + EntityPageSet.COMPLEX_MGR.id));
//            pages.add(getPage(EntityPageSet.COMPLEX_EDIT, moduleCode, rootEntityCode, rootEntityName, relEntityCodes, rootEntityCode + EntityPageSet.COMPLEX_MGR.id));
//            pages.add(getPage(EntityPageSet.COMPLEX_DETAIL, moduleCode, rootEntityCode, rootEntityName, relEntityCodes, rootEntityCode + EntityPageSet.COMPLEX_MGR.id));
//        }
//
//        return pages;
//    }
//
//    private Page getPage(EntityPageSet entityPage, String moduleCode, String rootEntityCode, String rootEntityName, String[] relEntityCodes, String relPageCode) {
//        Page page = new Page();
//
//        page.setId(rootEntityCode + entityPage.id);
//        page.setName(rootEntityName + entityPage.name);
//        page.setPageTemplate(entityPage.pageTemplate);
//        page.setDataSet(moduleCode + "/" + rootEntityCode);
//        page.setRelPage(relPageCode);
//        page.setComponentList(new ArrayList<Component>());
//        String[] components = entityPage.component;
//        for (String componentId : components) {
//            Component component = new Component();
//            component.setId(componentId);
//            if(componentId.equals("qForm")) {
//                component.setDataSet(moduleCode + "/" + rootEntityCode + "_DS4Q");
//            }else if(componentId.equals("cList") && relEntityCodes != null) {
//                component.setDataSet(moduleCode + "/" + relEntityCodes[0]);
//            }else if(componentId.equals("eList") && relEntityCodes != null) {
//                component.setDataSet(moduleCode + "/" + relEntityCodes[0]);
//            }else if(componentId.equals("qList") && relEntityCodes != null) {
//                component.setDataSet(moduleCode + "/" + relEntityCodes[0]);
//            }else {
//                component.setDataSet(moduleCode + "/" + rootEntityCode);
//            }
//            page.getComponentList().add(component);
//        }
//
//        return page;
//    }
//
//
//    /**
//     * 代码差异比对
//     * @return
//     */
//    @RequestMapping(value = "/code_diff.json")
//    @ResponseBody
//    public ResultData getCodeDiff(HttpServletRequest request){
//        logger.debug("request : {}");
//        try{
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//
//            String companyCode = "hframe";
//            String programCode = "hframe";
//            Long programId = -1L;
//            String programName = "框架";
//            String moduleCode = "hframe";
//            String moduleName = "框架";
//            HfpmProgram hfpmProgram = null;
//            if(pageFlowParams != null) {
//                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
//                    hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
//                    programCode = hfpmProgram.getHfpmProgramCode();
//                    programId = hfpmProgram.getHfpmProgramId();
//                    programName = hfpmProgram.getHfpmProgramName();
//                }
//                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
//                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
//                    moduleCode = module.getHfpmModuleCode();
//                    moduleName = module.getHfpmModuleName();
//                }
//            }
//
//            HfcfgDbConnect dataSourceInfo = startDynamicDataSource(pageFlowParams);
//            String dbSqlPath = SqlGeneratorUtil.createSqlFile(companyCode, programCode);
//            DataSourceContextHolder.clear();
//            HfModelContainer targetFileModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
//                    dbSqlPath, programCode, programName, moduleCode, moduleName);
//            HfClassContainer targetClassContainer = HfClassContainerUtil.getClassInfoContainer(targetFileModelContainer);
//
//
//            String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode,
//                    "hframe".equals(programCode) ? "trunk" : programCode, moduleCode);
//
//
////            if(!new File(projectBasePath).exists()) {
////                WebContextHelper helper = new WebContextHelper(companyCode,programCode,moduleCode,"");
////                String programTemplatePath = CreatorUtil.getTargetProjectBasePath("hframe", "template", moduleCode);
////                FileUtils.copyFolder(programTemplatePath, projectBasePath);
////
////                FileUtils.copyFolder(helper.programConfigRootDir + "/" + helper.programConfigMapperDir.replaceAll(programCode,"template"),
////                        helper.programConfigRootDir + "/" + helper.programConfigMapperDir);
////                FileUtils.delFolder(helper.programConfigRootDir + "/" + helper.programConfigMapperDir.replaceAll(programCode,"template"));
////                if(dataSourceInfo != null) {
////                    Map map = new HashMap();
////                    map.put("Jdbc", new BaseGeneratorUtil.Jdbc(dataSourceInfo.getUrl().replaceAll("&", "&amp;"), dataSourceInfo.getUser(), dataSourceInfo.getPassword()));
////                    String content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/jdbcProperties.vm", map);
////                    System.out.println(content);
////                    FileUtils.writeFile(projectBasePath + "/hframe-core/src/main/resources/properties/dataSource.properties", content);
////                }
//
////                Map map = new HashMap();
////                map.put("companyCode", companyCode);
////                map.put("programCode", programCode);
////                String content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/compileBat.vm", map);
////                System.out.println(content);
////                FileUtils.writeFile(projectBasePath + "/build/compile.bat", content);
////
////                content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/compileSh.vm", map);
////                System.out.println(content);
////                FileUtils.writeFile(projectBasePath + "/build/compile.sh", content);
//
//
////                Program program = new Program();
////                program.setCompany(companyCode);
////                program.setCode(programCode);
////                program.setName(programName);
////                program.setDescription(hfpmProgram != null ? hfpmProgram.getHfpmProgramDesc() : programName);
////
////
////                Modules modules = new Modules();
////                program.setModules(modules);
////
////                List<com.hframework.web.config.bean.program.Module> moduleList = new ArrayList<com.hframework.web.config.bean.program.Module>();
////                modules.setModuleList(moduleList);
////
////                HfpmModule_Example example = new HfpmModule_Example();
////                example.createCriteria().andHfpmProgramIdEqualTo(programId);
////                List<HfpmModule> hfpmModuleListByExample = hfpmModuleSV.getHfpmModuleListByExample(example);
////                for (HfpmModule module : hfpmModuleListByExample) {
////                    com.hframework.web.config.bean.program.Module module1 = new com.hframework.web.config.bean.program.Module();
////                    module1.setCode(module.getHfpmModuleCode());
////                    module1.setName(module.getHfpmModuleName());
////                    moduleList.add(module1);
////                }
////
////                Template template = new Template();
////                template.setCode("default");
////                template.setPath("hframework.template.default");
////                program.setTemplate(template);
////
////                program.setWelcome("uc/login.html");
////
////                SuperManager superManager = new SuperManager();
////                superManager.setCode("admin");
////                superManager.setPassword("admin");
////                superManager.setName("草鸡管理员");
////                program.setSuperManager(superManager);
////                String xml = XmlUtils.writeValueAsString(program);
////                FileUtils.writeFile(projectBasePath + "/hframe-web/src/main/resources/program/program.xml", xml);
//
////                startDynamicDataSource(pageFlowParams);
////                HfsecUser hfsecUser = new HfsecUser();
////                hfsecUser.setHfsecUserName(superManager.getName());
////                hfsecUser.setAccount(superManager.getCode());
////                hfsecUser.setPassword(superManager.getPassword());
////                hfsecUser.setStatus(1);
////                hfsecUser.setAvatar("http://pic.hanhande.com/files/141127/1283574_094432_8946.jpg");
////                hfsecUserSV.create(hfsecUser);
////                DataSourceContextHolder.clear();
//
////                Map map = new HashMap();
////                map.put("programName", programName);
////                map.put("menuDataSet", "hframe/hfsec_menu");
////                map.put("userDataSet", "hframe/hfsec_user");
////                content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/defaultPage.vm", map);
////                System.out.println(content);
////
////                WebContextHelper contextHelper = new WebContextHelper(companyCode,programCode,moduleCode,"default");
////                String pageFilePath = contextHelper.programConfigRootDir + "/" + contextHelper.programConfigModuleDir + "/default.xml";
////                FileUtils.writeFile(pageFilePath, content);
////            }
//
//
//            String projectCompileTargetPath = projectBasePath + "\\hframe-core\\target\\classes\\";
////            String filePath = "/D:/my_workspace/hframe-trunk" + "\\hframe-core\\target\\classes\\";
//            String classPackage = "com.hframe.domain.model.";
//            HfClassContainer originClassContainer = HfClassContainerUtil.fromClassPath(
//                    projectCompileTargetPath, classPackage, programCode, programName);
//
//            final List<Map<String, String>>[] result = HfClassContainerUtil.compare(originClassContainer, targetClassContainer);
//
//            return ResultData.success(new HashMap<String,Object>(){{
//                put("AddClassInfo", new HashMap<String, Object>() {{
//                    put("list", result[0]);
//                }});
//                put("ModClassInfo", new HashMap<String, Object>() {{
//                    put("list", result[1]);
//                }});
//                put("DelClassInfo", new HashMap<String, Object>() {{
//                    put("list", result[2]);
//                }});
//            }});
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }finally {
//            DataSourceContextHolder.clear();
//        }
//    }
//
//    /**
//     * 代码差异比对
//     * @return
//     */
//    @RequestMapping(value = "/page_load.json")
//    @ResponseBody
//    public ResultData getPageLoad(HttpServletRequest request){
//        logger.debug("request : {}");
//        try{
//            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
//            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
//            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
//
//            String companyCode = "hframe";
//            Long programId = null;
//            String programCode = "hframe";
//            String programName = "框架";
//            Long moduleId = null;
//            String moduleCode = "hframe";
//            String moduleName = "框架";
//            if(pageFlowParams != null) {
//                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
//                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
//                    programId = program.getHfpmProgramId();
//                    programCode = program.getHfpmProgramCode();
//                    programName = program.getHfpmProgramName();
//                }
//                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
//                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
//                    moduleId = module.getHfpmModuleId();
//                    moduleCode = module.getHfpmModuleCode();
//                    moduleName = module.getHfpmModuleName();
//
//                }
//            }
//            HfmdEntity_Example example = new HfmdEntity_Example();
//            HfmdEntity_Example.Criteria criteria = example.createCriteria();
//            if(programId != null) criteria.andHfpmProgramIdEqualTo(programId);
//            if(moduleId != null) criteria.andHfpmModuleIdEqualTo(moduleId);
//
//            if(programId == null && moduleId == null) criteria.andHfmdEntityCodeLike("hf%");
//
//
//            final List<HfmdEntity> hfmdEntityListByExample = iHfmdEntitySV.getHfmdEntityListByExample(example);
//
//            Map<Module, List<List<Entity>>> entityRelats = WebContext.get(companyCode,programCode,"default").getEntityRelats();
//            final Map<Module, List<List<HfmdEntity>>> todoList = new HashMap<Module, List<List<HfmdEntity>>>();
//            for (Module module : entityRelats.keySet()) {
//                todoList.put(module, new ArrayList<List<HfmdEntity>>());
//                List<List<HfmdEntity>> targetList = todoList.get(module);
//                List<List<Entity>> originList = entityRelats.get(module);
//                for (List<Entity> entities : originList) {
//                    List<HfmdEntity> target = new ArrayList<HfmdEntity>();
//                    for (Entity entity : entities) {
//                        if(StringUtils.isNotBlank(entity.getText())) {
//                            target.add(getHfmdEntity(hfmdEntityListByExample, entity));
//                        }
//                    }
//                    targetList.add(target);
//                }
//            }
//
//
//            System.out.println("==>" + JSON.toJSONString(entityRelats));
//            return ResultData.success(new HashMap<String,Object>(){{
//                put("TodoList", hfmdEntityListByExample);
//                put("DownList", todoList);
//            }});
//        }catch (Exception e) {
//            logger.error("error : ", e);
//            return ResultData.error(ResultCode.ERROR);
//        }
//    }
//
//    private HfmdEntity getHfmdEntity(List<HfmdEntity> hfmdEntityListByExample, Entity entity) {
//        Iterator<HfmdEntity> iterator = hfmdEntityListByExample.iterator();
//        while (iterator.hasNext()) {
//            HfmdEntity hfmdEntity = iterator.next();
//            if(entity.getText().equals(hfmdEntity.getHfmdEntityCode())) {
//                iterator.remove();
//                return hfmdEntity;
//            }
//        }
//        return null;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(DateUtils.getDateYYYYMMDD(new Date(1475330401000L)));
//    }
}
