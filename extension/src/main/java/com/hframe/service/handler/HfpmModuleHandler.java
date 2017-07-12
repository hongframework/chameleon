package com.hframe.service.handler;

import com.hframe.domain.model.HfpmModule;
import com.hframe.domain.model.HfpmProgram;
import com.hframe.service.interfaces.IHfpmModuleSV;
import com.hframe.service.interfaces.IHfpmProgramSV;
import com.hframework.beans.class0.*;
import com.hframework.web.extension.AbstractBusinessHandler;
import com.hframework.web.extension.annotation.AfterCreateHandler;
import com.hframework.web.extension.annotation.AfterDeleteHandler;
import com.hframework.common.util.file.FileUtils;
import com.hframework.common.util.message.XmlUtils;
import com.hframework.generator.util.CreatorUtil;
import com.hframework.web.config.bean.Program;
import com.hframework.web.config.bean.program.Module;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhangquanhong on 2016/10/14.
 */
@Service
public class HfpmModuleHandler extends AbstractBusinessHandler<HfpmModule> {
    @Resource
    private IHfpmProgramSV hfpmProgramSV;

    @Resource
    private IHfpmModuleSV hfpmModuleSV;


    @AfterCreateHandler
    public boolean createModule(HfpmModule module) throws Exception {
        HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(module.getHfpmProgramId());
        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();
        String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode, programCode, null);


        Program program = XmlUtils.readValueFromAbsoluteFilePath(projectBasePath + "/basic/src/main/resources/program/program.xml", Program.class);

        List<Module> moduleList = program.getModules().getModuleList();
        if(moduleList == null) {
            moduleList = new ArrayList<Module>();
            program.getModules().setModuleList(moduleList);
        }

        for (Module module1 : moduleList) {
            if(module1.getCode().equals(module.getHfpmModuleCode())) {
                return true;
            }
        }

        com.hframework.web.config.bean.program.Module module1 = new com.hframework.web.config.bean.program.Module();
        module1.setCode(module.getHfpmModuleCode());
        module1.setName(module.getHfpmModuleName());
        moduleList.add(module1);

        String xml = XmlUtils.writeValueAsString(program);
        FileUtils.writeFile(projectBasePath + "/basic/src/main/resources/program/program.xml", xml);

        String springConfigFile = projectBasePath + "/extension/src/main/resources/spring/spring-config.xml";
        com.hframework.beans.class0.Class defPoClass = CreatorUtil.getDefPoClass(program.getCompany(), program.getCode(), module.getHfpmModuleCode(), "a");
        com.hframework.beans.class0.Class defDaoClass = CreatorUtil.getDefDaoClass(program.getCompany(), program.getCode(),module.getHfpmModuleCode(), "a");
        com.hframework.beans.class0.Class defBPoClass = CreatorUtil.getDefPoClass(program.getCompany(), program.getCode(), "B", "b");
        String sharePackage = calcSharePackage(defPoClass.getClassPackage(), defDaoClass.getClassPackage());
        sharePackage = calcSharePackage(sharePackage, defBPoClass.getClassPackage());
        String  springConfigContent= FileUtils.readFile(springConfigFile);
        if(!springConfigContent.contains("<context:component-scan base-package=\"" + sharePackage + "\">")){
            String config = "<context:component-scan base-package=\"" + sharePackage + "\">\n" +
                            "        <context:exclude-filter type=\"annotation\" expression=\"org.springframework.stereotype.Controller\"/>\n" +
                            "    </context:component-scan>\n";
            FileUtils.replaceFile(springConfigFile,"<context:annotation-config/>", config + "    <context:annotation-config/>");
        }

        springConfigFile = projectBasePath + "/extension/src/main/resources/spring/spring-config-dao.xml";
        List<String> strings = FileUtils.readFileToArray(springConfigFile);
        for (String string : strings) {
            if(string.contains("property name=\"typeAliasesPackage\"") && !string.contains(defPoClass.getClassPackage())) {
                FileUtils.replaceFile(springConfigFile, string, string.replace("\"/>", defPoClass.getClassPackage() + ";\"/>"));
            }
            if(string.contains("name=\"basePackage\"") && !string.contains(defDaoClass.getClassPackage())) {
                FileUtils.replaceFile(springConfigFile, string, string.replace("\"/>", defDaoClass.getClassPackage() + ";\"/>"));
            }

        }


        return true;
    }

    private String calcSharePackage(String classPackageA, String classPackageB) {
        if(classPackageA.startsWith(classPackageB)) {
            return classPackageB;
        }
        if(classPackageB.startsWith(classPackageA)) {
            return classPackageA;
        }

        classPackageA = classPackageA.substring(0, classPackageA.lastIndexOf("."));
        classPackageB = classPackageB.substring(0, classPackageB.lastIndexOf("."));

        return calcSharePackage(classPackageA, classPackageB);
    }


    @AfterDeleteHandler
    public boolean deleteModule(HfpmModule module) throws Exception {

        HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(module.getHfpmProgramId());
        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();
        String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode, programCode, null);


        Program program = XmlUtils.readValueFromAbsoluteFilePath(projectBasePath + "/basic/src/main/resources/program/program.xml", Program.class);

        List<Module> moduleList = program.getModules().getModuleList();
        if(moduleList == null) {
            moduleList = new ArrayList<Module>();
            program.getModules().setModuleList(moduleList);
        }
        Iterator<Module> iterator = moduleList.iterator();
        while (iterator.hasNext()) {
            Module module1 = iterator.next();
            if(module1.getCode().equals(module.getHfpmModuleCode())) {
                iterator.remove();
            }
        }

        String xml = XmlUtils.writeValueAsString(program);
        FileUtils.writeFile(projectBasePath + "/basic/src/main/resources/program/program.xml", xml);

        return true;
    }
}
