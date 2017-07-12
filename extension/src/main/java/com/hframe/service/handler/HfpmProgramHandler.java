package com.hframe.service.handler;

import com.google.common.base.Strings;
import com.hframe.domain.model.*;
import com.hframe.service.interfaces.IHfmdEnumClassSV;
import com.hframe.service.interfaces.IHfpmModuleSV;
import com.hframework.common.util.BeanUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.generator.web.container.bean.EnumClass;
import com.hframework.web.extension.AbstractBusinessHandler;
import com.hframework.web.extension.annotation.AfterCreateHandler;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Mapper;
import com.hframework.common.util.file.FileUtils;
import com.hframework.common.util.message.VelocityUtil;
import com.hframework.common.util.message.XmlUtils;
import com.hframework.generator.util.CreatorUtil;
import com.hframework.generator.web.container.HfModelContainer;
import com.hframework.generator.web.container.HfModelContainerUtil;
import com.hframework.generator.web.sql.HfModelService;
import com.hframework.generator.web.sql.reverse.SQLParseUtil;
import com.hframework.web.context.WebContextHelper;
import com.hframework.web.config.bean.Program;
import com.hframework.web.config.bean.program.Module;
import com.hframework.web.config.bean.program.Modules;
import com.hframework.web.config.bean.program.SuperManager;
import com.hframework.web.config.bean.program.Template;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangquanhong on 2016/10/14.
 */
@Service
public class HfpmProgramHandler extends AbstractBusinessHandler<HfpmProgram> {
    @Resource
    private IHfpmModuleSV hfpmModuleSV;
    @Resource
    private IHfmdEnumClassSV hfmdEnumClassSV;


    @AfterCreateHandler
    public boolean initProgramCodes(HfpmProgram hfpmProgram) throws Exception {
        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();
        String programName = hfpmProgram.getHfpmProgramCode();

        //1. 项目拷贝生成

        String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode, programCode, null);//获取目标项目根路径
//        String programTemplatePath = CreatorUtil.getTargetProjectBasePath("hframe", "template", null);
        String programTemplatePath = this.getClass().getClassLoader().getResource("").getPath() + "/webtemplate";//获取模板全根路径
        FileUtils.copyFolder(programTemplatePath, projectBasePath);//拷贝

        //2. 公共配置文件拷贝
        WebContextHelper helper = new WebContextHelper(companyCode,programCode,null,"");
        //将basic\src\main\resources\program\hframe\mapper下的特殊配置拷贝，目前已经实现所有自动匹配，无特殊配置
//        FileUtils.copyFolder(helper.programConfigRootDir + "/" + helper.programConfigMapperDir.replaceAll(programCode, "template"),
//                helper.programConfigRootDir + "/" + helper.programConfigMapperDir);
//        FileUtils.delFolder(helper.programConfigRootDir + "/" + helper.programConfigMapperDir.replaceAll(programCode, "template"));
        //将basic\src\main\resources\program\hframe\module下的default.xml配置进行拷贝
        FileUtils.moveFolder(helper.programConfigRootDir + "/" + helper.programConfigModuleDir.replaceAll(programCode, "template"),
                helper.programConfigRootDir + "/" + helper.programConfigModuleDir);
        String templateDir = helper.programConfigModuleDir.replaceAll(programCode, "template");
        FileUtils.deleteFile(helper.programConfigRootDir + "/" + templateDir.substring(0, templateDir.lastIndexOf("/")));

        //2. 初始化编译脚本,由于脚本采用相对路径，所以不用再生成
//        Map map = new HashMap();
////        map.put("companyCode", companyCode);
////        map.put("programCode", programCode);
//        map.put("projectBasePath", projectBasePath.startsWith("/") ? projectBasePath.substring(1) : projectBasePath.substring(1));
//        String content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/compileBat.vm", map);
//        System.out.println(content);
//        map.put("projectBasePath", projectBasePath.replace(":", ""));
//        FileUtils.writeFile(projectBasePath + "/build/compile.bat", content);
//
//        content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/compileSh.vm", map);
//        System.out.println(content);
//        FileUtils.writeFile(projectBasePath + "/build/compile.sh", content);

        //3. 初始化program配置文件
        Program program = new Program();
        program.setCompany(companyCode);
        program.setCode(programCode);
        program.setName(programName);
        program.setDescription(hfpmProgram != null ? hfpmProgram.getHfpmProgramDesc() : programName);

        Modules modules = new Modules();
        modules.setModuleList(new ArrayList<Module>());
        program.setModules(modules);

//        com.hframework.web.config.bean.program.Module module1 = new com.hframework.web.config.bean.program.Module();
//        module1.setCode("hframe");
//        module1.setName("框架默认");
//        modules.getModuleList().add(module1);

        Template template = new Template();
        template.setCode("default");
        template.setPath("hframework.template.default");
        program.setTemplate(template);//设置选取web模板

        program.setWelcome("/login.html");//设置登录页面
        SuperManager superManager = new SuperManager();
        superManager.setCode("admin");
        superManager.setPassword("admin");
        superManager.setName("草鸡管理员");
        program.setSuperManager(superManager);//设置管理员信息
        String xml = XmlUtils.writeValueAsString(program);
        FileUtils.writeFile(projectBasePath + "/basic/src/main/resources/program/program.xml", xml);


        WebContextHelper contextHelper = new WebContextHelper(companyCode,programCode,null,"default");
//        map = new HashMap();
//        map.put("programName", "#program.name#");
//        map.put("menuDataSet", "#program.auth-instance.function#");
//        map.put("userDataSet", "#program.auth-instance.user#");
//        map.put("userLoginDataSet", "#program.login.data-set#");
//        content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/defaultPage.vm", map);
////        System.out.println(content);
//
//
//        String pageFilePath = contextHelper.programConfigRootDir + "/" + contextHelper.programConfigModuleDir + "/default.xml";
//        FileUtils.writeFile(pageFilePath, content);
        //4. 初始化hframe.properties文件
        String programIdStr = Strings.padStart(hfpmProgram.getHfpmProgramId().toString(), 4, '0');
        String hframeProFilePath = contextHelper.programConfigRootDir.replace("/basic/src/main/resources/", "/extension/src/main/resources/") + "hframe.properties";
        FileUtils.replaceFile(hframeProFilePath, "hframe.port=8082", "hframe.port=1" + programIdStr.substring(programIdStr.length() - 4));

        //5. 初始化pom.properties文件
        String pomFilePath = projectBasePath + "/pom.xml";
        FileUtils.replaceFile(pomFilePath, "<artifactId>WEBTEMPLATE</artifactId>", "<artifactId>" + programCode + "</artifactId>");

        pomFilePath = projectBasePath + "/basic/pom.xml";
        FileUtils.replaceFile(pomFilePath, "<artifactId>WEBTEMPLATE</artifactId>", "<artifactId>" + programCode + "</artifactId>");

        pomFilePath = projectBasePath + "/extension/pom.xml";
        FileUtils.replaceFile(pomFilePath, "<artifactId>WEBTEMPLATE</artifactId>", "<artifactId>" + programCode + "</artifactId>");
        return true;
    }


    /**
     * 通过常用实体添加功能手动设置
     * @param program
     * @return
     * @throws Exception
     */
    @Deprecated
//    @AfterCreateHandler
    public boolean programDefaultSetting(HfpmProgram program) throws Exception {

        final HfpmModule hframeModule = new HfpmModule();
        hframeModule.setHfpmProgramId(program.getHfpmProgramId());
        hframeModule.setHfpmModuleCode("hframe");
        hframeModule.setHfpmModuleName("框架默认");
        hframeModule.setHfpmModuleDesc("框架默认");
        hfpmModuleSV.create(hframeModule);

        WebContextHelper contextHelper = new WebContextHelper("hframe", "trunk", "hframe", "hframe");
        String sqlFile = contextHelper.programConfigRootDir + "/init/sql/entitys.sql";
        final HfModelContainer sqlFileModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
                sqlFile, program.getHfpmProgramCode(), program.getHfpmProgramName(), hframeModule.getHfpmModuleCode(),
                hframeModule.getHfpmModuleName());

        final HfModelContainer baseModelContainer = HfModelContainerUtil.getInstance();
        baseModelContainer.setProgram(BeanUtils.convertObject(com.hframework.generator.web.container.bean.Program.class, program));
        baseModelContainer.setModuleMap(new HashMap<Long, com.hframework.generator.web.container.bean.Module>() {{
            put(hframeModule.getHfpmModuleId(), BeanUtils.convertObject(com.hframework.generator.web.container.bean.Module.class, hframeModule));
        }});
        //添加枚举值
        HfmdEnumClass_Example example1 = new HfmdEnumClass_Example();
        example1.createCriteria().andHfpmProgramIdEqualTo(program.getHfpmProgramId());
        example1.or().andHfpmProgramIdIsNull();
        List<HfmdEnumClass> hfmdEnumClasses = hfmdEnumClassSV.getHfmdEnumClassListByExample(example1);
        List<EnumClass> enumClasses = CollectionUtils.fetch(hfmdEnumClasses, new Fetcher<HfmdEnumClass, EnumClass>() {
            public EnumClass fetch(HfmdEnumClass hfmdEnumClass) {
                return BeanUtils.convertObject(EnumClass.class, hfmdEnumClass);
            }
        });
        baseModelContainer.setEnumClassCodeMap(CollectionUtils.convert(enumClasses, new Mapper<String, EnumClass>() {
            public <K> K getKey(EnumClass hfmdEnumClass) {
                return (K) hfmdEnumClass.getHfmdEnumClassCode();
            }
        }));
        baseModelContainer.setEnumClassMap(CollectionUtils.convert(enumClasses, new Mapper<Long, EnumClass>() {
            public <K> K getKey(EnumClass hfmdEnumClass) {
                return (K) hfmdEnumClass.getHfmdEnumClassId();
            }
        }));

        HfModelContainer[] resultModelContainers =
                HfModelContainerUtil.mergerModelContainer(baseModelContainer, sqlFileModelContainer);
        HfModelService.get().executeModelInsert(resultModelContainers[0]);

        return true;
    }


}
