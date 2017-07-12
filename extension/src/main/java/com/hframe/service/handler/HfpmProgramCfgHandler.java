
package com.hframe.service.handler;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.base.service.DataSetLoaderHelper;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.common.util.collect.bean.Grouper;
import com.hframework.common.util.collect.bean.Mapper;
import com.hframework.controller.ext.bean.AuthManager;
import com.hframework.controller.ext.bean.AuthObjectAttr;
import com.hframework.web.extension.AbstractBusinessHandler;
import com.hframework.web.extension.annotation.AfterCreateHandler;
import com.hframework.web.extension.annotation.AfterUpdateHandler;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.common.util.file.FileUtils;
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.message.VelocityUtil;
import com.hframework.common.util.message.XmlUtils;
import com.hframework.generator.util.CreatorUtil;
import com.hframework.generator.web.BaseGeneratorUtil;
import com.hframework.web.config.bean.Program;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.*;

/**
 * Created by zhangquanhong on 2016/10/14.
 */
@Service
public class HfpmProgramCfgHandler extends AbstractBusinessHandler<HfpmProgramCfg> {

    @Resource
    private IHfcfgDbConnectSV iHfcfgDbConnectSV;
    @Resource
    private IHfsecUserSV hfsecUserSV;
    @Resource
    private IHfpmProgramSV hfpmProgramSV;
    @Resource
    private IHfpmModuleSV hfpmModuleSV;

    @Resource
    private IHfmdEntitySV hfmdEntitySV;

    @Resource
    private IHfpmDataSetSV hfpmDataSetSV;
    @Resource
    private IHfmdEntityAttrSV hfmdEntityAttrSV;

    @Resource
    private IHfpmProgramCfgSV iHfpmProgramCfgSV;

    @Resource
    private IHfmdEntitySV iHfmdEntitySV;

    @AfterCreateHandler
    @AfterUpdateHandler(attr = "hfcfgDbConnectId")
    public boolean dataSetSetting(HfpmProgramCfg hfpmProgramCfg) throws Exception {
        if(hfpmProgramCfg.getHfcfgDbConnectId() != null && hfpmProgramCfg.getHfcfgDbConnectId() > 0L){
            HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(hfpmProgramCfg.getHfpmProgramId());
            String companyCode = hfpmProgram.getOwnerCode();
            String programCode = hfpmProgram.getHfpmProgramCode();
//            String programName = hfpmProgram.getHfpmProgramCode();
            String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode, programCode, null);
            HfcfgDbConnect dataSourceInfo = iHfcfgDbConnectSV.getHfcfgDbConnectByPK(hfpmProgramCfg.getHfcfgDbConnectId());
            if(dataSourceInfo == null) return true;

            //重定义项目的dataSource.properties文件
            BaseGeneratorUtil.Jdbc jdbc = new BaseGeneratorUtil.Jdbc(dataSourceInfo.getUrl().replaceAll("&", "&amp;"),
                    dataSourceInfo.getUser(), dataSourceInfo.getPassword());
//            Map map = new HashMap();
//            map.put("Jdbc", jdbc);
//            String content = VelocityUtil.produceTemplateContent("com/hframework/generator/vm/jdbcProperties.vm", map);
//            System.out.println(content);
//            FileUtils.writeFile(projectBasePath + "/extension/src/main/resources/properties/dataSource.properties", content);
            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/dev.properties",
                    "jdbc.url=.*", "jdbc.url=" + jdbc.getUrl());
            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/dev.properties",
                    "jdbc.user=.*", "jdbc.user=" + jdbc.getUser());
            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/dev.properties",
                    "jdbc.password=.*", "jdbc.password=" + (jdbc.getPassword() == null ? "" : jdbc.getPassword()));

            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/debug.properties",
                    "jdbc.url=.*", "jdbc.url=" + jdbc.getUrl());
            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/debug.properties",
                    "jdbc.user=.*", "jdbc.user=" + jdbc.getUser());
            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/debug.properties",
                    "jdbc.password=.*", "jdbc.password=" + (jdbc.getPassword() == null ? "" : jdbc.getPassword()));

            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/beta.properties",
                    "jdbc.url=.*", "jdbc.url=" + jdbc.getUrl());
            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/beta.properties",
                    "jdbc.user=.*", "jdbc.user=" + jdbc.getUser());
            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/beta.properties",
                    "jdbc.password=.*", "jdbc.password=" + (jdbc.getPassword() == null ? "" : jdbc.getPassword()));

            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/release.properties",
                    "jdbc.url=.*", "jdbc.url=" + jdbc.getUrl());
            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/release.properties",
                    "jdbc.user=.*", "jdbc.user=" + jdbc.getUser());
            FileUtils.replaceFile(projectBasePath + "/extension/src/main/filters/release.properties",
                    "jdbc.password=.*", "jdbc.password=" + (jdbc.getPassword() == null ? "" : jdbc.getPassword()));
        }
        return true;
    }

    @AfterCreateHandler
    @AfterUpdateHandler
    public boolean generateAuthInstance(HfpmProgramCfg hfpmProgramCfg) throws Exception {

        if(hfpmProgramCfg == null) return true;
        HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(hfpmProgramCfg.getHfpmProgramId());
        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();
        String projectBasePath = CreatorUtil.getTargetProjectBasePath(companyCode, programCode, null);
        Program program = XmlUtils.readValueFromAbsoluteFilePath(projectBasePath + "/basic/src/main/resources/program/program.xml", Program.class);
        if(StringUtils.isNotBlank(hfpmProgramCfg.getShowName())) program.setName(hfpmProgramCfg.getShowName());
        //用户实体
        if(hfpmProgramCfg.getUserEntityName() != null) program.getAuthInstance().setUser(getCfgName(hfpmProgramCfg.getUserEntityName()));
        //数据实体
        if(hfpmProgramCfg.getDataEntityName() != null) program.getAuthInstance().setData(getCfgName(hfpmProgramCfg.getDataEntityName()));
        //功能实体
        if(hfpmProgramCfg.getFuncEntityName() != null) program.getAuthInstance().setFunction(getCfgName(hfpmProgramCfg.getFuncEntityName()));
        //用户数据授权路径
        if(hfpmProgramCfg.getUserAuthPath() != null) program.getAuthInstance().setUserDataAuth(hfpmProgramCfg.getUserAuthPath());
        //用户功能授权路径
        if(hfpmProgramCfg.getFuncAuthPath() != null) program.getAuthInstance().setUserFuncAuth(hfpmProgramCfg.getFuncAuthPath());
        //设置字典
        if(hfpmProgramCfg.getDictionarys() != null)
            program.getAuthInstance().setDictionary(getCfgName(hfpmProgramCfg.getDictionarys()).replaceAll(","," / "));
        //超级管理员规则【实体】
        if(hfpmProgramCfg.getSuperAuthFilterEntity() != null) program.getAuthInstance().getSuperAuthFilter().setDataSet(getCfgName(hfpmProgramCfg.getSuperAuthFilterEntity() + ""));
        //超级管理员规则【字段】
        if(hfpmProgramCfg.getSuperAuthFilterField() != null) {
            HfmdEntityAttr hfmdEntityAttrByPK = hfmdEntityAttrSV.getHfmdEntityAttrByPK(hfpmProgramCfg.getSuperAuthFilterField());
            if(hfpmProgramCfg.getSuperAuthFilterField() != null) program.getAuthInstance().getSuperAuthFilter().setDataField(hfmdEntityAttrByPK.getHfmdEntityAttrCode());
        }

        //超级管理员规则【字段值】
        if(hfpmProgramCfg.getSuperAuthFilterFieldValue() != null) program.getAuthInstance().getSuperAuthFilter().setDataFieldValue(hfpmProgramCfg.getSuperAuthFilterFieldValue());

        if(hfpmProgramCfg.getUserLoginDataSet() != null) program.getLogin().setDataSet(getDataSetName(hfpmProgramCfg.getUserLoginDataSet()));

        String xml = XmlUtils.writeValueAsString(program);
        FileUtils.writeFile(projectBasePath + "/basic/src/main/resources/program/program.xml", xml);

        try {

            if(StringUtils.isNotBlank(program.getAuthInstance().getUser())) {
                String[] userEntityIds = hfpmProgramCfg.getUserEntityName().replaceAll("/",",").split(",");
                if(userEntityIds.length > 0) {
                    HfmdEntity hfmdEntityByPK = iHfmdEntitySV.getHfmdEntityByPK(Long.valueOf(userEntityIds[0]));

                    HfmdEntityAttr_Example entityAttrExample = new HfmdEntityAttr_Example();
                    entityAttrExample.createCriteria().andHfmdEntityIdEqualTo(Long.valueOf(userEntityIds[0]));
                    List<HfmdEntityAttr> hfmdEntityAttrList = hfmdEntityAttrSV.getHfmdEntityAttrListByExample(entityAttrExample);
                    String tableName = hfmdEntityByPK.getHfmdEntityCode();
                    String keyProperty = null;
                    for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrList) {
                        if(hfmdEntityAttr.getIspk() != null && 1 == hfmdEntityAttr.getIspk()) {
                            keyProperty = hfmdEntityAttr.getHfmdEntityAttrCode();
                            break;
                        }
                    }
                    String nameProperty = null;
                    for (String name : Lists.newArrayList("name", "user_name", "username")) {
                        for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrList) {
                            if(hfmdEntityAttr.getHfmdEntityAttrCode().toLowerCase().equals(name)) {
                                nameProperty = hfmdEntityAttr.getHfmdEntityAttrCode();
                                break;
                            }
                        }
                    }
                    if(StringUtils.isBlank(nameProperty)) {
                        for (String name : Lists.newArrayList("name", "user_name", "username")) {
                            for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrList) {
                                if(hfmdEntityAttr.getHfmdEntityAttrCode().toLowerCase().endsWith(name)) {
                                    nameProperty = hfmdEntityAttr.getHfmdEntityAttrCode();
                                    break;
                                }
                            }
                        }
                    }
                    String userInfo = tableName + "/" + keyProperty + "/" + nameProperty;
                    DataSetLoaderService dataSetLoaderService = DataSetLoaderHelper.getDataSetLoaderService(
                            companyCode, programCode, null);
                    if(!userInfo.equals(dataSetLoaderService.getUserRefInfo())) {
                        dataSetLoaderService.updateAllUserRel(dataSetLoaderService.getUserRefInfo(),userInfo);
                        dataSetLoaderService.setUserRefInfo(userInfo);

                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        dataSetSetting(program);
        return true;
    }

    private String getDataSetName(String dataSetId) throws Exception {

        HfpmDataSet hfpmDataSet = hfpmDataSetSV.getHfpmDataSetByPK(Long.parseLong(dataSetId));
        HfmdEntity hfmdEntity = hfmdEntitySV.getHfmdEntityByPK(hfpmDataSet.getMainHfmdEntityId());
        HfpmModule hfpmModule = hfpmModuleSV.getHfpmModuleByPK(hfmdEntity.getHfpmModuleId());
        return hfpmModule.getHfpmModuleCode() + "/" + hfpmDataSet.getHfpmDataSetCode();
    }


    private String getCfgName(String userEntityName) throws Exception {
        HfmdEntity_Example example = new HfmdEntity_Example();
        List<Long> entityIds = CollectionUtils.fetch(Arrays.asList(userEntityName.split(",")),
                new Fetcher<String, Long>() {
                    public Long fetch(String s) {
                        return Long.valueOf(s);
                    }
                });
        example.createCriteria().andHfmdEntityIdIn(entityIds);
        List<HfmdEntity> hfmdEntityList = hfmdEntitySV.getHfmdEntityListByExample(example);

        for (HfmdEntity hfmdEntity : hfmdEntityList) {
            HfpmModule hfpmModule = hfpmModuleSV.getHfpmModuleByPK(hfmdEntity.getHfpmModuleId());
            ;
            userEntityName = userEntityName.replaceAll(String.valueOf(hfmdEntity.getHfmdEntityId()), hfpmModule.getHfpmModuleCode() + "." + hfmdEntity.getHfmdEntityCode());
        }

        return userEntityName;
    }

//    public static void main(String[] args) throws IOException {
//        FileUtils.replaceFile("D:/my_workspace/chameleon/extension/target/classes//projects/lcs3//extension/src/main/filters/dev.properties",
//                "jdbc.url=.*", "jdbc.url=jdbc:mysql://localhost:3306/shop2?useUnicode=true&amp;characterEncoding=UTF-8&amp;zeroDateTimeBehavior=convertToNull");
//    }
}
