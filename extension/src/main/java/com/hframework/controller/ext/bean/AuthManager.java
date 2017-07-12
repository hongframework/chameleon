package com.hframework.controller.ext.bean;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.hframe.domain.model.*;
import com.hframe.service.interfaces.IHfmdEntityAttrSV;
import com.hframe.service.interfaces.IHfmdEntitySV;
import com.hframe.service.interfaces.IHfpmProgramCfgSV;
import com.hframework.base.service.CommonDataService;
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.common.util.collect.bean.Grouper;
import com.hframework.common.util.collect.bean.Mapper;

import java.util.*;

/**
 * Created by zhangquanhong on 2017/6/7.
 */
public  class AuthManager{

    public static final Map<String, List<String>> userModel = new LinkedHashMap<String, List<String>>();
    static {
        userModel.put("id",Lists.newArrayList("{pk}","id"));
        userModel.put("account", Lists.newArrayList("account"));
        userModel.put("password", Lists.newArrayList("password"));
        userModel.put("name", Lists.newArrayList("name","user_name","username"));
        userModel.put("avatar", Lists.newArrayList("avatar"));
        userModel.put("status", Lists.newArrayList("status","state"));
        userModel.put("organize_id", Lists.newArrayList("{fk}"));
    }

    public static final Map<String, List<String>> organizeModel = new LinkedHashMap<String, List<String>>();
    static {
        organizeModel.put("id",Lists.newArrayList("{pk}","id"));
        organizeModel.put("code",Lists.newArrayList("code"));
        organizeModel.put("name",Lists.newArrayList("name"));
        organizeModel.put("status", Lists.newArrayList("status","state"));
        organizeModel.put("parent_id",Lists.newArrayList("{fk2self}"));
    }

    public static final Map<String, List<String>> roleModel = new LinkedHashMap<String, List<String>>();
    static {
        roleModel.put("id",Lists.newArrayList("{pk}","id"));
        roleModel.put("code",Lists.newArrayList("code"));
        roleModel.put("name",Lists.newArrayList("name"));
        roleModel.put("status", Lists.newArrayList("status","state"));
    }

    public static final Map<String, List<String>> enumClassModel = new LinkedHashMap<String, List<String>>();
    static {
        enumClassModel.put("id",Lists.newArrayList("{pk}","id"));
        enumClassModel.put("code",Lists.newArrayList("code"));
//        organizeModel.put("desc",Lists.newArrayList("desc","desciption","remark"));
        enumClassModel.put("name",Lists.newArrayList("name"));
        enumClassModel.put("status", Lists.newArrayList("status","state","del_flag"));
    }

    public static final Map<String, List<String>> enumModel = new LinkedHashMap<String, List<String>>();
    static {
        enumModel.put("value",Lists.newArrayList("value"));
        enumModel.put("text",Lists.newArrayList("text"));
        enumModel.put("desc",Lists.newArrayList("desc","desciption","remark"));
        enumModel.put("default",Lists.newArrayList("default","is_default"));
        enumModel.put("pri",Lists.newArrayList("pri","sort_by"));
        enumModel.put("enumClass", Lists.newArrayList("{fk}"));
        enumModel.put("status", Lists.newArrayList("status","state","del_flag"));
    }

    public static final Map<String, List<String>> funcModel = new LinkedHashMap<String, List<String>>();
    static {
        funcModel.put("code",Lists.newArrayList("code"));
        funcModel.put("name",Lists.newArrayList("name"));
        funcModel.put("desc",Lists.newArrayList("desc","desciption","remark"));
        funcModel.put("parent_id",Lists.newArrayList("{fk2self}"));
        funcModel.put("icon",Lists.newArrayList("icon","img","image"));
        funcModel.put("url",Lists.newArrayList("url","path"));
//        funcModel.put("status", Lists.newArrayList("status","state"));
    }

    public AuthObjects user;
    public AuthObjects data;
    public AuthObjects superFunc;
    public AuthObjects userToData;
    public AuthObjects userToSuperFunc;
    public AuthObjects enums;
    public AuthObjects enumsClass;

    public AuthObjects func;


    public static AuthManager load(IHfpmProgramCfgSV iHfpmProgramCfgSV, IHfmdEntitySV iHfmdEntitySV, IHfmdEntityAttrSV hfmdEntityAttrSV, Long programId) throws Exception {

        HfpmProgramCfg_Example programCfgExample = new HfpmProgramCfg_Example();
        programCfgExample.createCriteria().andHfpmProgramIdEqualTo(programId);
        HfpmProgramCfg hfpmProgramCfg = iHfpmProgramCfgSV.getHfpmProgramCfgListByExample(programCfgExample).get(0);

        String userEntityIds = hfpmProgramCfg.getUserEntityName();
        String dataEntityIds = hfpmProgramCfg.getDataEntityName();
        String userAuthPath = hfpmProgramCfg.getUserAuthPath();
        String funcAuthPath = hfpmProgramCfg.getFuncAuthPath();
        String dictionarys = hfpmProgramCfg.getDictionarys();
        Long superAuthFilterEntity = hfpmProgramCfg.getSuperAuthFilterEntity();
        Long superAuthFilterField = hfpmProgramCfg.getSuperAuthFilterField();
        String superAuthFilterFieldValue = hfpmProgramCfg.getSuperAuthFilterFieldValue();

        String funcEntityIds = hfpmProgramCfg.getFuncEntityName();
        if(StringUtils.isBlank(userAuthPath)) userAuthPath = "";
        if(StringUtils.isBlank(funcAuthPath)) funcAuthPath = "";
        if(StringUtils.isBlank(userEntityIds)) userEntityIds = "";
        if(StringUtils.isBlank(dataEntityIds)) dataEntityIds = "";
        if(StringUtils.isBlank(dictionarys)) dictionarys = "";
        if(StringUtils.isBlank(funcEntityIds)) funcEntityIds = "";
        if(superAuthFilterEntity == null) superAuthFilterEntity = 0L;


        String[] dbQueryEntityNames = Joiner.on(",").join(Lists.newArrayList(userAuthPath, funcAuthPath)).replaceAll("/",",").split(",");
        for (int i = 0; i < dbQueryEntityNames.length; i++) {
            dbQueryEntityNames[i] = dbQueryEntityNames[i].substring(dbQueryEntityNames[i].indexOf(".") + 1);
        }

        String[] dbQueryEntityIds = Joiner.on(",").join(Lists.newArrayList(userEntityIds, dataEntityIds, dictionarys, superAuthFilterEntity, funcEntityIds)).replaceAll("/",",").split(",");
        List<Long> dbQueryEntityIdInts = new ArrayList<Long>();
        for (int i = 0; i < dbQueryEntityIds.length; i++) {
            dbQueryEntityIdInts.add(Long.parseLong(dbQueryEntityIds[i]));
        }
        HfmdEntity_Example entityExample = new HfmdEntity_Example();
        entityExample.createCriteria().andHfmdEntityCodeIn(Arrays.asList(dbQueryEntityNames)).andHfpmProgramIdEqualTo(programId);
        entityExample.or().andHfmdEntityIdIn(dbQueryEntityIdInts);
        List<HfmdEntity> hfmdEntityList = iHfmdEntitySV.getHfmdEntityListByExample(entityExample);

        List<Long> entityIds = CollectionUtils.fetch(hfmdEntityList, new Fetcher<HfmdEntity, Long>() {
            public Long fetch(HfmdEntity hfmdEntity) {
                return hfmdEntity.getHfmdEntityId();
            }
        });
        HfmdEntityAttr_Example entityAttrExample = new HfmdEntityAttr_Example();
        entityAttrExample.createCriteria().andHfmdEntityIdIn(entityIds);
        List<HfmdEntityAttr> hfmdEntityAttrList = hfmdEntityAttrSV.getHfmdEntityAttrListByExample(entityAttrExample);

        Map<String, HfmdEntity> entitys = CollectionUtils.convert(hfmdEntityList, new Mapper<String, HfmdEntity>() {
            public <K> K getKey(HfmdEntity hfmdEntity) {
                return (K) hfmdEntity.getHfmdEntityCode();
            }
        });

        Map<Long, HfmdEntity> entityByIds = CollectionUtils.convert(hfmdEntityList, new Mapper<Long, HfmdEntity>() {
            public <K> K getKey(HfmdEntity hfmdEntity) {
                return (K) hfmdEntity.getHfmdEntityId();
            }
        });

        Map <Long, List <HfmdEntityAttr>> entityAttrs = CollectionUtils.group(hfmdEntityAttrList, new Grouper<Long, HfmdEntityAttr>() {
            public <K> K groupKey(HfmdEntityAttr hfmdEntityAttr) {
                return (K) hfmdEntityAttr.getHfmdEntityId();
            }
        });

        Map<Long, HfmdEntityAttr> entityAttrByIds = CollectionUtils.convert(hfmdEntityAttrList, new Mapper<Long, HfmdEntityAttr>() {
            public <K> K getKey(HfmdEntityAttr hfmdEntityAttr) {
                return (K) hfmdEntityAttr.getHfmdEntityAttrId();
            }
        });
        String superFuncEntityName = entityByIds.get(superAuthFilterEntity).getHfmdEntityCode();
        String userEntityName = "";
        for (String userEntityId : userEntityIds.split(",")) {
            if(StringUtils.isNotBlank(userEntityId))
                userEntityName += entityByIds.get(Long.valueOf(userEntityId)).getHfmdEntityCode() + ",";
        }
        String dataEntityName = "";
        for (String dataEntityId : dataEntityIds.split(",")) {
            if(StringUtils.isNotBlank(dataEntityId))
                dataEntityName += entityByIds.get(Long.valueOf(dataEntityId)).getHfmdEntityCode() + ",";
        }

        String funcEntityName = "";
        for (String funcEntityId : funcEntityIds.split(",")) {
            if(StringUtils.isNotBlank(funcEntityId))
                funcEntityName += entityByIds.get(Long.valueOf(funcEntityId)).getHfmdEntityCode() + ",";
        }

        AuthManager authManager = new AuthManager();
        authManager.user = parseAuthObjects(userEntityName, entitys, entityAttrs,entityByIds, entityAttrByIds);
        authManager.data = parseAuthObjects(dataEntityName, entitys, entityAttrs,entityByIds, entityAttrByIds);
        authManager.superFunc = parseAuthObjects(superFuncEntityName, entitys, entityAttrs,entityByIds, entityAttrByIds);
        authManager.userToData = parseAuthObjects(userAuthPath, entitys, entityAttrs,entityByIds, entityAttrByIds);
        authManager.userToSuperFunc = parseAuthObjects(funcAuthPath.substring(0, funcAuthPath.indexOf(superFuncEntityName)
                + superFuncEntityName.length()), entitys, entityAttrs,entityByIds, entityAttrByIds);
        authManager.enumsClass = parseAuthObjects(entityByIds.get(Long.parseLong(dictionarys.split(",")[0])).getHfmdEntityCode(), entitys, entityAttrs, entityByIds, entityAttrByIds);
        authManager.enums = parseAuthObjects(entityByIds.get(Long.parseLong(dictionarys.split(",")[1])).getHfmdEntityCode(), entitys, entityAttrs,entityByIds, entityAttrByIds);

        authManager.func = parseAuthObjects(funcEntityName, entitys, entityAttrs,entityByIds, entityAttrByIds);
        return authManager;
    }

    private static AuthObjects parseAuthObjects(String entityCodes, Map<String, HfmdEntity> entitys,
                                                Map<Long, List<HfmdEntityAttr>> entityAttrs,
                                                Map<Long, HfmdEntity> entityByIds, Map<Long, HfmdEntityAttr> entityAttrByIds) {
        String[] entityCodesArray = entityCodes.replaceAll("/", ",").split(",");
        AuthObjects authObjects = new AuthObjects();
        for (String entityCode : entityCodesArray) {
            HfmdEntity hfmdEntity = entitys.get(entityCode.substring(entityCode.indexOf(".")+1).trim());
            List<HfmdEntityAttr> hfmdEntityAttrs = entityAttrs.get(hfmdEntity.getHfmdEntityId());
            AuthObject authObject = new AuthObject();
            authObjects.add(authObject);
            authObject.tableId = hfmdEntity.getHfmdEntityId();
            authObject.tableName = hfmdEntity.getHfmdEntityCode();
            for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrs) {
                AuthObjectAttr objectAttr = new AuthObjectAttr();
                objectAttr.attrId = hfmdEntityAttr.getHfmdEntityAttrId();
                objectAttr.attrName = hfmdEntityAttr.getHfmdEntityAttrCode();
                objectAttr.tableId = hfmdEntity.getHfmdEntityId();
                objectAttr.isPk = hfmdEntityAttr.getIspk() == 1;
                objectAttr.isNumeric = hfmdEntityAttr.getAttrType() != 3 && hfmdEntityAttr.getAttrType() != 5
                        && hfmdEntityAttr.getAttrType() != 6 && hfmdEntityAttr.getAttrType() != 12;
                objectAttr.isFk = hfmdEntityAttr.getRelHfmdEntityAttrId() != null;
                if(objectAttr.isFk) {
                    HfmdEntityAttr relHfmdEntityAttr = entityAttrByIds.get(hfmdEntityAttr.getRelHfmdEntityAttrId());
                    objectAttr.relTableId = relHfmdEntityAttr.getHfmdEntityId();
//                        if(relHfmdEntityAttr != null) {
//                            HfmdEntity relHfmdEntity = entityByIds.get(relHfmdEntityAttr.getHfmdEntityId());
//                        }
                }
                authObject.authObjectAttrs.add(objectAttr);
            }
        }
        return authObjects;
    }

    public static void calcAuthObjectKeyAttr(AuthObjects objects, Map<String, List<String>> userModel) {
        for (AuthObject object : objects) {
            for (Map.Entry<String, List<String>> field : userModel.entrySet()) {
                object.keyAttrs.add(calcField(field.getValue(), object.authObjectAttrs));
            }
        }
    }

    public static void calcAuthObjectKeyAttr(AuthObjects objects, AuthObjects mainAuthObjects) {
        for (AuthObject object : objects) {
            if(mainAuthObjects.contains(object)) continue;
            for (AuthObjectAttr authObjectAttr : object.authObjectAttrs) {
                if(authObjectAttr.isPk || authObjectAttr.isFk || "status".equals(authObjectAttr.attrName) || "state".equals(authObjectAttr.attrName)){
                    object.keyAttrs.add(authObjectAttr.attrName);
                    object.authObjectKeyAttrs.add(authObjectAttr);
                }
            }
        }
    }

    public static String calcField(List<String> configs, List<AuthObjectAttr> authObjectAttrs) {
        for (String config : configs) {
            if(config.startsWith("{") && config.endsWith("}")) {
                if("{pk}".equals(config)) {
                    for (AuthObjectAttr authObjectAttr : authObjectAttrs) {
                        if(authObjectAttr.isPk) return authObjectAttr.attrName;
                    }
                }else  if("{fk}".equals(config)) {
                    for (AuthObjectAttr authObjectAttr : authObjectAttrs) {
                        if(authObjectAttr.isFk) return authObjectAttr.attrName;
                    }
                }else if("{fk2self}".equals(config)) {
                    for (AuthObjectAttr authObjectAttr : authObjectAttrs) {
                        if(authObjectAttr.isFk && authObjectAttr.relTableId.equals(authObjectAttr.tableId)) return authObjectAttr.attrName;
                    }
                }else{
                }
            }

            for (AuthObjectAttr authObjectAttr : authObjectAttrs) {
                if(authObjectAttr.attrName.toLowerCase().equals(config)) {
                    return authObjectAttr.attrName;
                }
            }

            for (AuthObjectAttr authObjectAttr : authObjectAttrs) {
                if(authObjectAttr.attrName.toLowerCase().endsWith(config)) {
                    return authObjectAttr.attrName;
                }
            }

        }
        return "{unknown}";
    }

    public static String calcSelectDualSql(AuthObject object, List<Object[]> datas) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < datas.size(); i++) {
            if(i != 0) sb.append(" union ");

            sb.append("select ");
            for (int j = 0; j < datas.get(i).length; j++) {
                Object item = datas.get(i)[j];
                if(item instanceof String) {
                    sb.append("'").append(item).append("'");
                }else {
                    sb.append(item);
                }
                if(i ==0) sb.append(" as ").append(object.keyAttrs.get(j));
                if(j != datas.get(i).length - 1) sb.append(", ");

            }
        }

        return sb + ";";
    }

    public static String calcSelectSql(AuthObject object) {
        StringBuffer sb = new StringBuffer("select ");
        for (Object keyAttr : object.keyAttrs) {
            sb.append("`").append(keyAttr).append("`").append(", ");
        }
        return sb.substring(0,sb.length()-2) + " from " + object.tableName + ";";
    }



    public static String calcInsertSql(AuthObjects objects) {
        for (AuthObject object : objects) {
            StringBuffer begin = new StringBuffer("insert into ").append(object.tableName).append("(");
            StringBuffer end = new StringBuffer(" values (");
            int count = 0;
            for (Object keyAttr : object.keyAttrs) {
                begin.append(keyAttr).append(", ");
                end.append("\"{" + count++ + "}, \"");
            }
            return begin.substring(0,begin.length()-2) + ") " + end.substring(0,end.length()-2);
        }
        return null;
    }

    public static List<Map<String, Object>> getDynamicTableDataSome(CommonDataService commonDataService, final String sql) {
        List<Map<String, Object>> list = null;
        try{
            list =  commonDataService.selectDynamicTableDataSome(new HashMap<String, String>() {{
                put("sql", sql);
            }});
        }catch (Exception e){};
        return list;
    }

}

