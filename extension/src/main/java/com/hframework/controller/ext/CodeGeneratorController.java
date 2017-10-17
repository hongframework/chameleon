package com.hframework.controller.ext;

import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.base.service.CommonDataService;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.base.service.ModelLoaderService;
import com.hframework.beans.class0.*;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.util.BeanUtils;
import com.hframework.common.util.cmd.ShellExecutor;
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.common.util.collect.bean.Grouper;
import com.hframework.common.util.collect.bean.Mapper;
import com.hframework.generator.web.container.bean.Entity;
import com.hframework.generator.web.container.bean.EntityAttr;
import com.hframework.generator.web.container.bean.Module;
import com.hframework.web.controller.DefaultController;
import com.hframework.common.springext.datasource.DataSourceContextHolder;
import com.hframework.generator.util.CreatorUtil;
import com.hframework.generator.web.BaseGeneratorUtil;
import com.hframework.generator.web.container.HfClassContainer;
import com.hframework.generator.web.container.HfClassContainerUtil;
import com.hframework.generator.web.container.HfModelContainer;
import com.hframework.generator.web.mybatis.MyBatisGeneratorUtil;
import com.hframework.generator.web.sql.HfModelService;
import com.hframework.generator.web.sql.SqlGeneratorUtil;
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
import java.io.File;
import java.util.*;

/**
 * Created by zhangquanhong on 2016/12/11.
 */
@Controller
@RequestMapping(value = "/extend")
public class CodeGeneratorController extends ExtBaseController {
    private static final Logger logger = LoggerFactory.getLogger(CodeGeneratorController.class);
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
     * 代码差异比对
     * @return
     */
    @RequestMapping(value = "/code_diff.json")
    @ResponseBody
    public ResultData getCodeDiff(HttpServletRequest request){
        logger.debug("request : {}");
        try{
            Map<String, String> pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            String companyCode = "hframe";
            String programCode = "hframe";
            Long programId = -1L;
            String programName = "框架";
            String moduleCode = "hframe";
            String moduleName = "框架";
            HfpmProgram hfpmProgram = null;
            if(pageFlowParams != null) {
                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
                    programCode = hfpmProgram.getHfpmProgramCode();
                    programId = hfpmProgram.getHfpmProgramId();
                    programName = hfpmProgram.getHfpmProgramName();
                    companyCode = hfpmProgram.getOwnerCode();
                }
                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
                    moduleCode = module.getHfpmModuleCode();
                    moduleName = module.getHfpmModuleName();
                }
            }


            HfpmModule_Example moduleExample = new HfpmModule_Example();
            moduleExample.createCriteria().andHfpmProgramIdEqualTo(programId);
            List<HfpmModule> hfpmModuleList = hfpmModuleSV.getHfpmModuleListByExample(moduleExample);
            Map<Long, Module> moduleMap = CollectionUtils.convert(CollectionUtils.fetch(hfpmModuleList, new Fetcher<HfpmModule, Module>() {
                public Module fetch(HfpmModule module) {
                    return BeanUtils.convertObject(Module.class, module);
                }
            }), new Mapper<Long, Module>() {
                public <K> K getKey(Module module) {
                    return (K) module.getHfpmModuleId();
                }
            });

            HfmdEntity_Example entityExample = new HfmdEntity_Example();
            entityExample.createCriteria().andHfpmProgramIdEqualTo(programId);
            List<HfmdEntity> hfmdEntityList = iHfmdEntitySV.getHfmdEntityListByExample(entityExample);
            Map<String, HfmdEntity> entityMap = CollectionUtils.convert(hfmdEntityList, new Mapper<String, HfmdEntity>() {
                public <K> K getKey(HfmdEntity hfmdEntity) {
                    return (K) hfmdEntity.getHfmdEntityCode();
                }
            });

            HfcfgDbConnect dataSourceInfo = startDynamicDataSource(pageFlowParams);
            String dbSqlPath = SqlGeneratorUtil.createSqlFile(companyCode, programCode);
            DataSourceContextHolder.clear();
            HfModelContainer targetFileModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
                    dbSqlPath, programCode, programName, moduleCode, moduleName);

            for (Map.Entry<String, Entity> entry : targetFileModelContainer.getEntityMap().entrySet()) {
                if(entityMap.containsKey(entry.getKey())) {
                    entry.getValue().setHfpmModuleId(entityMap.get(entry.getKey()).getHfpmModuleId());
                }
            }
            ;
            targetFileModelContainer.getModuleMap().putAll(moduleMap);

            //完善hfModelContainer



            HfClassContainer targetClassContainer = HfClassContainerUtil.getClassInfoContainer(targetFileModelContainer);


            String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode,programCode, moduleCode);


//            if(!new File(projectBasePath).exists()) {
//                WebContextHelper helper = new WebContextHelper(companyCode,programCode,moduleCode,"");
//                String programTemplatePath = CreatorUtil.getTargetProjectBasePath("hframe", "template", moduleCode);
//                FileUtils.copyFolder(programTemplatePath, projectBasePath);
//
//                FileUtils.copyFolder(helper.programConfigRootDir + "/" + helper.programConfigMapperDir.replaceAll(programCode,"template"),
//                        helper.programConfigRootDir + "/" + helper.programConfigMapperDir);
//                FileUtils.delFolder(helper.programConfigRootDir + "/" + helper.programConfigMapperDir.replaceAll(programCode,"template"));
//                if(dataSourceInfo != null) {
//                    Map map = new HashMap();
//                    map.put("Jdbc", new BaseGeneratorUtil.Jdbc(dataSourceInfo.getUrl().replaceAll("&", "&amp;"), dataSourceInfo.getUser(), dataSourceInfo.getPassword()));
//                    String content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/jdbcProperties.vm", map);
//                    System.out.println(content);
//                    FileUtils.writeFile(projectBasePath + "/hframe-core/src/main/resources/properties/dataSource.properties", content);
//                }

//                Map map = new HashMap();
//                map.put("companyCode", companyCode);
//                map.put("programCode", programCode);
//                String content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/compileBat.vm", map);
//                System.out.println(content);
//                FileUtils.writeFile(projectBasePath + "/build/compile.bat", content);
//
//                content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/compileSh.vm", map);
//                System.out.println(content);
//                FileUtils.writeFile(projectBasePath + "/build/compile.sh", content);


//                Program program = new Program();
//                program.setCompany(companyCode);
//                program.setCode(programCode);
//                program.setName(programName);
//                program.setDescription(hfpmProgram != null ? hfpmProgram.getHfpmProgramDesc() : programName);
//
//
//                Modules modules = new Modules();
//                program.setModules(modules);
//
//                List<com.hframework.web.config.bean.program.Module> moduleList = new ArrayList<com.hframework.web.config.bean.program.Module>();
//                modules.setModuleList(moduleList);
//
//                HfpmModule_Example example = new HfpmModule_Example();
//                example.createCriteria().andHfpmProgramIdEqualTo(programId);
//                List<HfpmModule> hfpmModuleListByExample = hfpmModuleSV.getHfpmModuleListByExample(example);
//                for (HfpmModule module : hfpmModuleListByExample) {
//                    com.hframework.web.config.bean.program.Module module1 = new com.hframework.web.config.bean.program.Module();
//                    module1.setCode(module.getHfpmModuleCode());
//                    module1.setName(module.getHfpmModuleName());
//                    moduleList.add(module1);
//                }
//
//                Template template = new Template();
//                template.setCode("default");
//                template.setPath("hframework.template.default");
//                program.setTemplate(template);
//
//                program.setWelcome("uc/login.html");
//
//                SuperManager superManager = new SuperManager();
//                superManager.setCode("admin");
//                superManager.setPassword("admin");
//                superManager.setName("草鸡管理员");
//                program.setSuperManager(superManager);
//                String xml = XmlUtils.writeValueAsString(program);
//                FileUtils.writeFile(projectBasePath + "/hframe-web/src/main/resources/program/program.xml", xml);

//                startDynamicDataSource(pageFlowParams);
//                HfsecUser hfsecUser = new HfsecUser();
//                hfsecUser.setHfsecUserName(superManager.getName());
//                hfsecUser.setAccount(superManager.getCode());
//                hfsecUser.setPassword(superManager.getPassword());
//                hfsecUser.setStatus(1);
//                hfsecUser.setAvatar("http://pic.hanhande.com/files/141127/1283574_094432_8946.jpg");
//                hfsecUserSV.create(hfsecUser);
//                DataSourceContextHolder.clear();

//                Map map = new HashMap();
//                map.put("programName", programName);
//                map.put("menuDataSet", "hframe/hfsec_menu");
//                map.put("userDataSet", "hframe/hfsec_user");
//                content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/defaultPage.vm", map);
//                System.out.println(content);
//
//                WebContextHelper contextHelper = new WebContextHelper(companyCode,programCode,moduleCode,"default");
//                String pageFilePath = contextHelper.programConfigRootDir + "/" + contextHelper.programConfigModuleDir + "/default.xml";
//                FileUtils.writeFile(pageFilePath, content);
//            }


            String projectCompileTargetPath = projectBasePath + "\\basic\\target\\classes\\";
//            String filePath = "/D:/my_workspace/hframe-trunk" + "\\hframe-core\\target\\classes\\";
//            String classPackage = com.hframework.web.CreatorUtil.getDefPoClass(WebContext.get().getProgram().getCompany(),
//                    programCode, moduleCode, "X").getClassPackage() + ".";

            final String finalProgramCode = programCode;
            final String finalCompanyCode = companyCode;
            List<String> classPackages = CollectionUtils.fetch(hfpmModuleList, new Fetcher<HfpmModule, String>() {
                public String fetch(HfpmModule module) {
                    try {
                        return com.hframework.web.CreatorUtil.getDefPoClass(finalCompanyCode,
                                finalProgramCode, module.getHfpmModuleCode(), "X").getClassPackage() + ".";
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                }
            });

//            String classPackage = "com";
            HfClassContainer originClassContainer = HfClassContainerUtil.fromClassPath(
                    projectCompileTargetPath, classPackages, programCode, programName);

            final List<Map<String, String>>[] result = HfClassContainerUtil.compare(originClassContainer, targetClassContainer);

            Collections.sort(result[0], new Comparator<Map<String, String>>() {
                public int compare(Map<String, String> o1, Map<String, String> o2) {
                    if(o1.get("classDesc") == null) o1.put("classDesc", "");
                    if(o2.get("classDesc") == null) o2.put("classDesc","");
                    return -o1.get("classDesc").compareTo(o2.get("classDesc"));
                }
            });
            ;

            return ResultData.success(new HashMap<String,Object>(){{
                put("AddClassInfo", new HashMap<String, Object>() {{
                    put("list", result[0]);
                }});
                put("ModClassInfo", new HashMap<String, Object>() {{
                    put("list", result[1]);
                }});
                put("DelClassInfo", new HashMap<String, Object>() {{
                    put("list", result[2]);
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
     * 重新加载（全量）
     * @return
     */
    @RequestMapping(value = "/code_generate.json")
    @ResponseBody
    public ResultData codeGenerate(@RequestParam(value="checkIds[]",required=false) Set<String> entityCodes, HttpServletRequest request){
        logger.debug("request : {}", entityCodes);

        try{

            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            String companyCode = "hframe";
            String programCode = "hframe";
            Long programId = -1L;
            String programName = "框架";
            String moduleCode = "hframe";
            String moduleName = "框架";
            if(pageFlowParams != null) {
                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
                    programId  = program.getHfpmProgramId();
                    programCode = program.getHfpmProgramCode();
                    programName = program.getHfpmProgramName();
                    companyCode = program.getOwnerCode();
                }
                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
                    moduleCode = module.getHfpmModuleCode();
                    moduleName = module.getHfpmModuleName();
                }
            }

            startDynamicDataSource(pageFlowParams);
            DataSourceContextHolder.DataSourceDescriptor dataSourceInfo = DataSourceContextHolder.getDBInfoAnyMore();
//            String sql = SqlGeneratorUtil.getSqlContent(entityCodes);
            DataSourceContextHolder.clear();

//            final HfModelContainer hfModelContainer = SQLParseUtil.parseModelContainerFromSQL(sql, null, null, null, null);
            HfModelContainer configModelContainer = HfModelService.get().getModelContainerFromDB(
                    programCode, programName, moduleCode, moduleName);
            List<Map<String, String>> tables = new ArrayList<Map<String, String>>();
            for (final String tableName : entityCodes) {
                //对应实体信息
                final Entity entity = configModelContainer.getEntity(tableName);
                //对应实体属性信息
                HfmdEntityAttr_Example example = new HfmdEntityAttr_Example();
                example.createCriteria().andHfmdEntityIdEqualTo(entity.getHfmdEntityId());
                List<HfmdEntityAttr> hfmdEntityAttrListByExample = hfmdEntityAttrSV.getHfmdEntityAttrListByExample(example);

                //获取主键与自依赖外键信息
                Long pkAttrId = null;
                String pkAttrCode = null;
                String parentAttrCode = null;
                for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrListByExample) {
                    if(hfmdEntityAttr.getIspk() !=null && hfmdEntityAttr.getIspk() == 1){
                        pkAttrId = hfmdEntityAttr.getHfmdEntityAttrId();
                        pkAttrCode = hfmdEntityAttr.getHfmdEntityAttrCode();
                    }
                }

                for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrListByExample) {
                    if(pkAttrId != null && pkAttrId.equals(hfmdEntityAttr.getRelHfmdEntityAttrId())) {
                        parentAttrCode = hfmdEntityAttr.getHfmdEntityAttrCode();
                    }
                }
                final String finalPkAttrCode = pkAttrCode;
                HashMap<String, String> hashMap = new HashMap<String, String>() {{
                    put("tableName", tableName);
                    put("tableDesc", entity.getHfmdEntityName());
                    put("generatedKey", finalPkAttrCode);


                }};
                if(parentAttrCode != null) hashMap.put("parentId", parentAttrCode);

                if(configModelContainer.getModuleMap().containsKey(entity.getHfpmModuleId())) {
                    hashMap.put("moduleCode", configModelContainer.getModuleMap().get(entity.getHfpmModuleId()).getHfpmModuleCode());
                }else {
                    hashMap.put("moduleCode", moduleCode);
                }

                tables.add(hashMap);
            }

            Map<String, List<Map<String, String>>> moduleAndTables = CollectionUtils.group(tables, new Grouper<String, Map<String, String>>() {
                public <K> K groupKey(Map<String, String> stringStringMap) {
                    return (K) stringStringMap.get("moduleCode");
                }
            });

            String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode, programCode, moduleCode);
            String projectRootPath = projectBasePath + "/basic";
            for (Map.Entry<String, List<Map<String, String>>> moduleAndTable : moduleAndTables.entrySet()) {
                moduleCode = moduleAndTable.getKey();
                tables = moduleAndTable.getValue();
                String mybatisConfigFilePath = BaseGeneratorUtil.generateMybatisConfig(tables, projectRootPath,
                        companyCode, programCode, moduleCode, dataSourceInfo);
                BaseGeneratorUtil.generator(mybatisConfigFilePath, companyCode, programCode, moduleCode);
                MyBatisGeneratorUtil.generate(new File(mybatisConfigFilePath));
            }

            ShellExecutor.exeCmd(projectBasePath + "/build/compile.bat");

            return ResultData.success();
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
}
