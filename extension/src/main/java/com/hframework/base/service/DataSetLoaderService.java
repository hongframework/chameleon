package com.hframework.base.service;

import com.google.common.collect.Lists;
import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.common.frame.cache.ehcache.CacheKeyEnum;
import com.hframework.common.util.JavaUtil;
import com.hframework.beans.tagbean.Option;
import com.hframework.beans.tagbean.*;
import com.hframework.beans.class0.Class;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.common.util.collect.bean.Mapper;
import com.hframework.common.frame.ServiceFactory;
import com.hframework.common.frame.cache.CacheFactory;

import com.hframework.common.springext.properties.PropertyConfigurerUtils;
import com.hframework.common.util.file.FileUtils;
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.message.XmlUtils;
import com.hframework.beans.tagbean.Column;
import com.hframework.web.CreatorUtil;
import com.hframework.web.context.DataSetDescriptor;
import com.hframework.web.context.IDataSet;
import com.hframework.web.context.WebContextHelper;
import com.hframework.web.config.bean.DataSet;
import com.hframework.web.config.bean.dataset.*;
import com.hframework.web.config.bean.dataset.Field;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.*;

/**
 * Created by zhangquanhong on 2016/7/3.
 */
@Service()
public class DataSetLoaderService {

    private static final String TITLE = "Title";
    private static final String VIEW_OBJECT = "ViewObject";
    private static final String PO_PATH = "PoPath";
    private static final String COLUMNS_LIST = "columnsList";
    private static final String PRIMARY_KEY = "PrimaryKey";
    private static final String FIELDS_LIST = "fieldsList";
    private static final String REL_ENTITYS = "CoreSetTables";
    private static final String FIELDS = "fields";
    private String userRefInfo = "hfsec_user/hfsec_user_id/hfsec_user_name";

    private String companyCode;
    private String programCode;
    private String moduleCode;
    private WebContextHelper contextHelper;

    private List<HfmdEntity> hfmdEntityAll;
    private Map<Long, HfmdEntity> hfmdEntityIdEntityMap = null;
    private Map<Long, List<HfmdEntityAttr>> hfmdEntityAttrMap = null;
    private Map<Long, HfmdEntityAttr> hfmdEntityAttrIdEntityAttrMap = null;

    private List<HfpmDataSet> hfpmDataSetAll;
    private Map<Long, HfpmDataSet> hfpmDataSetMap;
    private Map<Long, List<HfpmDataField>> hfpmDataFieldMap;
    private Map<Long, HfpmDataField> hfpmDataFieldInfoMap;
    private Map<Long, HfpmProgram> hfpmProgramMap = null;
    private Map<Long, HfpmModule> hfpmModuleMap = null;




    private Map<Long, HfpmFieldShowType> hfpmFieldShowTypeMap = null;

    private Map<Long, HfmdEnumClass> hfmdEnumClassMap = null;
    private Map<Long, List<HfmdEnum>> hfmdEnumMap = null;

    private WebApplicationContext webappcontext;

    public void load(ServletContext servletContext) {
        webappcontext = WebApplicationContextUtils
                .getRequiredWebApplicationContext(servletContext);
        load("hframe","hframe","hframe");
    }

    public void init(String companyCode, String programCode, String moduleCode) {
        this.companyCode = companyCode;
        this.programCode = programCode;
        this.moduleCode = moduleCode;
        contextHelper = new WebContextHelper(companyCode, programCode, null, null);

        if(webappcontext == null) {
            webappcontext = (WebApplicationContext) ServiceFactory.getWebAppContext();
        }
        IHfpmProgramSV iHfpmProgramSV = (IHfpmProgramSV) webappcontext.getBean("iHfpmProgramSV");
        IHfpmModuleSV iHfpmModuleSV = (IHfpmModuleSV) webappcontext.getBean("iHfpmModuleSV");

        IHfmdEntitySV iHfmdEntitySV = (IHfmdEntitySV) webappcontext.getBean("iHfmdEntitySV");
        IHfmdEntityAttrSV iHfmdEntityAttrSV = (IHfmdEntityAttrSV) webappcontext.getBean("iHfmdEntityAttrSV");

        IHfpmDataSetSV iHfpmDataSetSV = (IHfpmDataSetSV) webappcontext.getBean("iHfpmDataSetSV");
        IHfpmDataFieldSV iHfpmDataFieldSV = (IHfpmDataFieldSV) webappcontext.getBean("iHfpmDataFieldSV");

        IHfpmFieldShowTypeSV iHfpmFieldShowTypeSV = (IHfpmFieldShowTypeSV) webappcontext.getBean("iHfpmFieldShowTypeSV");

        IHfmdEnumClassSV iHfmdEnumClassSV = (IHfmdEnumClassSV) webappcontext.getBean("iHfmdEnumClassSV");
        IHfmdEnumSV iHfmdEnumSV = (IHfmdEnumSV) webappcontext.getBean("iHfmdEnumSV");

        try {

            Long programId = null;

            //获取项目信息
            HfpmProgram_Example programExample = new HfpmProgram_Example();
            programExample.createCriteria().andHfpmProgramCodeEqualTo(programCode);
            List<HfpmProgram> hfpmProgramAll = iHfpmProgramSV.getHfpmProgramListByExample(programExample);

            if(hfpmProgramAll != null && hfpmProgramAll.size() > 0) {
                programId = hfpmProgramAll.get(0).getHfpmProgramId();
            }
            hfpmProgramMap = getHfpmProgramMap(hfpmProgramAll);

            //获取项目模块信息
            HfpmModule_Example hfpmModuleExample = new HfpmModule_Example();
            hfpmModuleExample.createCriteria().andHfpmProgramIdEqualTo(programId);
            List<HfpmModule> hfpmModuleAll = iHfpmModuleSV.getHfpmModuleListByExample(hfpmModuleExample);
            hfpmModuleMap = getHfpmModuleMap(hfpmModuleAll);

            //获取实体信息
            HfmdEntity_Example hfmdEntityExample = new HfmdEntity_Example();
            hfmdEntityExample.createCriteria().andHfpmProgramIdEqualTo(programId);
            hfmdEntityAll = iHfmdEntitySV.getHfmdEntityListByExample(hfmdEntityExample);
            hfmdEntityIdEntityMap = getHfmdEntityIdEntityMap(hfmdEntityAll);

            //获取实体属性信息
            HfmdEntityAttr_Example hfmdEntityAttrExample = new HfmdEntityAttr_Example();
            hfmdEntityAttrExample.createCriteria().andHfpmProgramIdEqualTo(programId);
            hfmdEntityAttrExample.setOrderByClause("pri asc");
            List<HfmdEntityAttr> hfmdEntityAttrAll = iHfmdEntityAttrSV.getHfmdEntityAttrListByExample(hfmdEntityAttrExample);
            hfmdEntityAttrMap = getHfmdEntityAttrMap(hfmdEntityAttrAll);
            hfmdEntityAttrIdEntityAttrMap = getHfmdEntityAttrIdEntityAttrMap(hfmdEntityAttrAll);

            //获取数据集信息
            HfpmDataSet_Example hfpmDataSetExample = new HfpmDataSet_Example();
            hfpmDataSetExample.createCriteria().andHfpmProgramIdEqualTo(programId);
            hfpmDataSetAll = iHfpmDataSetSV.getHfpmDataSetListByExample(hfpmDataSetExample);

            hfpmDataSetMap = CollectionUtils.convert(hfpmDataSetAll, new Mapper<Long, HfpmDataSet>() {
                public <K> K getKey(HfpmDataSet hfpmDataSet) {
                    return (K) hfpmDataSet.getHfpmDataSetId();
                }
            });

            if(hfpmDataSetAll.size() == 0) {
                hfpmDataFieldInfoMap = new HashMap<Long, HfpmDataField>();
                hfpmDataFieldMap = new HashMap<Long, List<HfpmDataField>>();
            }else {
                //获取数据字段信息<HfpmDataFieldId, List<HfpmDataField>>
                HfpmDataField_Example hfpmDataFieldExample = new HfpmDataField_Example();
                hfpmDataFieldExample.createCriteria().andHfpmDataSetIdIn(
                        CollectionUtils.fetch(hfpmDataSetAll, new Fetcher<HfpmDataSet, Long>() {
                            public Long fetch(HfpmDataSet hfpmDataSet) {
                                return hfpmDataSet.getHfpmDataSetId();
                            }
                        }));
                List<HfpmDataField> hfpmDataFieldAll = iHfpmDataFieldSV.getHfpmDataFieldListByExample(hfpmDataFieldExample);

                hfpmDataFieldInfoMap = CollectionUtils.convert(hfpmDataFieldAll, new Mapper<Long, HfpmDataField>() {
                    public <K> K getKey(HfpmDataField dataField) {
                        return (K) dataField.getHfpmDataFieldId();
                    }
                });

                hfpmDataFieldMap = getHfpmDataFieldMap(hfpmDataFieldAll);
            }

            //获取展示方式信息
            List<HfpmFieldShowType> hfpmFieldShowTypeAll = iHfpmFieldShowTypeSV.getHfpmFieldShowTypeAll();
            hfpmFieldShowTypeMap = getHfpmFieldShowTypeMap(hfpmFieldShowTypeAll);

            //获取枚举类信息
            List<HfmdEnumClass> hfmdEnumClassAll = iHfmdEnumClassSV.getHfmdEnumClassAll();
            hfmdEnumClassMap = getHfmdEnumClassMap(hfmdEnumClassAll);

            //获取枚举值信息
            List<HfmdEnum> hfmdEnumAll = iHfmdEnumSV.getHfmdEnumAll();
            hfmdEnumMap = getHfmdEnumMap(hfmdEnumAll);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void load(String companyCode, String programCode, String moduleCode) {
       try{
           init(companyCode, programCode, moduleCode);
           loadEntity(hfmdEntityAll, hfmdEntityAttrMap);
           loadDataSet(hfpmDataSetAll, hfpmDataFieldMap);
           createDataSetDescriptorXml();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createDataSetDescriptorXml() throws IOException {
        if (hfpmDataSetAll != null) {
            for (HfpmDataSet hfpmDataSet : hfpmDataSetAll) {
                createDataSetDescriptorXml(hfpmDataSet);
            }
        }


    }

    private void createDataSetDescriptorXml(HfpmDataSet hfpmDataSet) throws IOException {
        if(hfpmDataSet.getHfpmDataSetCode().equals("sql_reverse_input")) {
            System.out.println(1);
        }
                DataSet dataSet = new DataSet();
                dataSet.setModule("hframe");
                HfmdEntity hfmdEntity = hfmdEntityIdEntityMap.get(hfpmDataSet.getMainHfmdEntityId());
                if(hfmdEntity != null) {
                    HfpmModule module = hfpmModuleMap.get(hfmdEntity.getHfpmModuleId());
                    if(module != null) {
                        dataSet.setModule(module.getHfpmModuleCode());
                    }
                }else {
                    new RuntimeException("通过DataSet的MainHfmdEntityId获取Entity失败！");
                }

                dataSet.setCode(hfpmDataSet.getHfpmDataSetCode());
                dataSet.setName(hfpmDataSet.getHfpmDataSetName());
                Fields fields = new Fields();
                ArrayList<com.hframework.web.config.bean.dataset.Field> fieldList
                        = new ArrayList<com.hframework.web.config.bean.dataset.Field>();
                fields.setFieldList(fieldList);
                dataSet.setFields(fields);
                List<HfpmDataField> hfpmDataFieldList = hfpmDataFieldMap.get(hfpmDataSet.getHfpmDataSetId());
                if(hfpmDataFieldList != null) {
                    for (HfpmDataField hfpmDataField : hfpmDataFieldList) {
                        fieldList.add(getField(fieldList, hfpmDataField));
                    }
                }


                List<Entity> entitys = new ArrayList<Entity>();
                dataSet.setEntityList(entitys);
                Set<HfmdEntity> entityList = getEntityFromDataFieldList(hfpmDataFieldList);
                for (HfmdEntity entity : entityList) {
                    Entity entity1 = new Entity();
                    entity1.setText(entity == null ? "" : entity.getHfmdEntityCode());
                    entitys.add(entity1);
                }

                String dataSetXml = XmlUtils.writeValueAsString(dataSet);
//                dataSetXml = dataSetXml.replaceAll("/name", "//name");


                //获取属性文件路径
                WebContextHelper contextHelper = new WebContextHelper(companyCode, programCode, null, null);
                String dataSetFilePath = contextHelper.programConfigRootDir + "/" + contextHelper.programConfigDataSetDir + "/" + dataSet.getCode() + ".xml";
//                String dataSetFilePath =  PropertyConfigurerUtils.getProperty(CreatorConst.PROJECT_BASE_FILE_PATH) +
//                        "/hframe-webtemplate/src/main/resources/program/hframe/data/set/" + dataSet.getCode() + ".xml";
                System.out.println(dataSetFilePath);
                System.out.println(dataSetXml);
                FileUtils.writeFile(dataSetFilePath, dataSetXml);

//                //如果是树形数据集，生成一个默认的树形缓存对象
//                fieldList = getTreeFieldListFromDataFieldList(hfpmDataFieldList);
//                if(fieldList != null) {
//                    map = new HashMap();
//                    map.put(FIELDS_LIST, fieldList);
//                    map.put(TITLE, hfpmDataSet.getHfpmDataSetName());
//                    map.put(REL_ENTITYS, entityCodes);
////                SetCacheFactory.put(hfpmDataSet.getHfpmDataSetCode(), map, "table");
//                    CacheFactory.put(CacheKeyEnum.DS_TREE_CACHE.getName(),hfpmDataSet.getHfpmDataSetCode(),map);
//                }


//                map = getDataSetMap(hfpmDataSet,entityCodes,hfpmDataFieldList,0);
//                CacheFactory.put(CacheKeyEnum.DS_CREATE_CACHE.getName(),hfpmDataSet.getHfpmDataSetCode(),map);
//
//                map = getDataSetMap(hfpmDataSet,entityCodes,hfpmDataFieldList,1);
//                CacheFactory.put(CacheKeyEnum.DS_MODIFY_CACHE.name(),hfpmDataSet.getHfpmDataSetCode(),map);
//
//                map = getDataSetMap(hfpmDataSet,entityCodes,hfpmDataFieldList,2);
//                CacheFactory.put(CacheKeyEnum.DS_SHOW_CACHE.name(),hfpmDataSet.getHfpmDataSetCode(),map);

    }

    public Field getField(List<com.hframework.web.config.bean.dataset.Field> fieldList, HfpmDataField hfpmDataField) {
        com.hframework.web.config.bean.dataset.Field field = new com.hframework.web.config.bean.dataset.Field();
        field.setName(hfpmDataField.getHfpmDataFieldName());
        field.setCode(hfpmDataField.getHfpmDataFieldCode());
        if(hfpmDataField.getCreateEditAuth() == null) hfpmDataField.setCreateEditAuth((byte) 0);
        if(hfpmDataField.getUpdateEditAuth() == null) hfpmDataField.setUpdateEditAuth((byte) 0);
        if(hfpmDataField.getListShowAuth() == null) hfpmDataField.setListShowAuth((byte) 0);
        if(hfpmDataField.getDetailShowAuth() == null) hfpmDataField.setDetailShowAuth((byte) 0);

//
//        if(hfpmDataField.getFieldShowCode().length() > 1) {
//            field.setCreateEditType("0".equals(String.valueOf(hfpmDataField.getFieldShowCode().charAt(0))) ? "hidden"
//                    : "1".equals(String.valueOf(hfpmDataField.getFieldShowCode().charAt(0))) ? "text" : null);
//            field.setUpdateEditType("0".equals(String.valueOf(hfpmDataField.getFieldShowCode().charAt(1))) ? "hidden"
//                    : "1".equals(String.valueOf(hfpmDataField.getFieldShowCode().charAt(1))) ? "text" : null);
//        }

        field.setCreateEditType((byte) 0 == hfpmDataField.getCreateEditAuth() ? "hidden" : (byte) 1 == hfpmDataField.getCreateEditAuth() ? "text" : null);
        field.setUpdateEditType((byte) 0 == hfpmDataField.getUpdateEditAuth() ? "hidden" : (byte) 1 == hfpmDataField.getUpdateEditAuth() ? "text" : null);
        field.setShowType((byte)0 == hfpmDataField.getListShowAuth() ? "hidden" : null);

        if(hfpmDataField.getHfmdEntityAttrId() == null) {
            field.setEditType(getShowTypesByFieldShowTypeIds(new String[]{hfpmDataField.getHfpmFieldShowTypeId()}).get(0).getType());
            return field;
        }
        HfmdEntityAttr hfmdEntityAttr = hfmdEntityAttrIdEntityAttrMap.get(hfpmDataField.getHfmdEntityAttrId());
        HfmdEnumClass hfmdEnumClass = hfmdEnumClassMap.get(hfmdEntityAttr.getHfmdEnumClassId());
        HfmdEntityAttr relEntityAttr = hfmdEntityAttrIdEntityAttrMap.get(hfmdEntityAttr.getRelHfmdEntityAttrId());


        com.hframework.beans.tagbean.Column column = getColumnFromHfmdEntityAttr(hfmdEntityAttr, hfpmDataField.getHfpmFieldShowTypeId());
        String editType = column.getShowType().getType();


        if(hfmdEntityAttr != null && hfmdEntityAttr.getIspk() != null && hfmdEntityAttr.getIspk() == 1) {
            field.setIsKey("true");
        }

        if(notExistNameField(fieldList) && hfmdEntityAttr.getHfmdEntityAttrCode().toLowerCase().endsWith("name")) {
            field.setIsName("true");
        };


        field.setEditType(editType);
        if(column.getNullable() == 0) field.setNotNull("true");

//                    field.setAction();

        if(hfmdEntityAttr != null) {
            Long hfmdEnumClassId = hfmdEntityAttr.getHfmdEnumClassId();
            if(hfmdEnumClassId != null && hfmdEnumClassId > 0) {
                EnumClass enumClass = new EnumClass();
                enumClass.setCode(hfmdEnumClass.getHfmdEnumClassCode());
                field.setEnumClass(enumClass);

            }
            if(hfmdEntityAttr.getRelHfmdEntityAttrId() != null && hfmdEntityAttr.getRelHfmdEntityAttrId() > 0) {
                if(relEntityAttr == null) {
                    System.out.println("==>RelHfmdEntityAttrId【" + hfmdEntityAttr.getRelHfmdEntityAttrId() + " : " + hfmdEntityAttr.getHfmdEntityAttrCode() + "】没有找到对应的记录！");
                }

                Rel rel = getRel(relEntityAttr);
                rel.setRelField(getRelField(fieldList, relEntityAttr));
                field.setRel(rel);
                if("select-panel".equals(editType)) {
                    rel.setEntityCode(rel.getEntityCode() + "/hfmd_entity_id");
                    relEntityAttr = hfmdEntityAttrIdEntityAttrMap.get(151031185115L);
                    field.getRel().setRelList(Lists.newArrayList(getRel(relEntityAttr)));;
                }
            }else {
                if(hfmdEntityAttr.getIspk() == 1 && "select".equals(editType)) {
                    Rel rel = getRel(hfmdEntityAttr);
                    field.setRel(rel);
                }
            }
            if(Arrays.asList(new String[]{"op_id", "modify_op_id", "creator_id", "creator", "modifier_id"}).contains(hfmdEntityAttr.getHfmdEntityAttrCode())) {
                Rel rel = new Rel();
                rel.setAddByGlobal("true");
                rel.setEntityCode(userRefInfo);
                field.setRel(rel);
            }
        }

        return field;
    }

    private boolean notExistNameField(List<Field> fieldList) {
        for (Field field : fieldList) if("true".equals(field.getIsName())) return false;
        return true;
    }

    /**
     * 返回依赖的字段的上级依赖值
     * @param fieldList
     * @param relEntityAttr
     */
    private String getRelField(List<Field> fieldList, HfmdEntityAttr relEntityAttr) {

        List<HfmdEntityAttr> hfmdEntityAttrs = hfmdEntityAttrMap.get(relEntityAttr.getHfmdEntityId());
        for (int i = 0; i <hfmdEntityAttrs.size(); i++) {//查看当前获取元素之前的元素
            //如果有依赖的属性
            if(hfmdEntityAttrs.get(i).getRelHfmdEntityAttrId() != null && hfmdEntityAttrs.get(i).getRelHfmdEntityAttrId() > 0) {
                HfmdEntityAttr rrelEntityAttr = hfmdEntityAttrIdEntityAttrMap.get(hfmdEntityAttrs.get(i).getRelHfmdEntityAttrId());
                Rel rrel = getRel(rrelEntityAttr);
                for (Field field : fieldList) {
                    if(field.getRel() != null && rrel.getEntityCode().equals(field.getRel().getEntityCode())) {
                        return field.getCode();
                    }
                }
            }
        }
        return null;
    }

    private Rel getRel(HfmdEntityAttr relEntityAttr) {
        Rel rel = new Rel();
        Long hfpmModuleId = relEntityAttr.getHfpmModuleId();
        HfpmModule hfpmModule = hfpmModuleMap.get(hfpmModuleId);
        Long hfmdEntityId = relEntityAttr.getHfmdEntityId();
        HfmdEntity hfmdEntity = hfmdEntityIdEntityMap.get(hfmdEntityId);
        List<HfmdEntityAttr> hfmdEntityAttrs = hfmdEntityAttrMap.get(hfmdEntityId);
        String name = null;
        for (HfmdEntityAttr entityAttr : hfmdEntityAttrs) {
            if(entityAttr.getHfmdEntityAttrCode().endsWith("ame")) {
                name = entityAttr.getHfmdEntityAttrCode();
                break;
            }
        }
        rel.setEntityCode(hfmdEntity.getHfmdEntityCode() + "/" + relEntityAttr.getHfmdEntityAttrCode() + "/" + name);
        return rel;
    }

    private Map<Long, HfmdEntityAttr> getHfmdEntityAttrIdEntityAttrMap(List<HfmdEntityAttr> hfmdEntityAttrAll) {

        Map<Long, HfmdEntityAttr> map = new HashMap<Long, HfmdEntityAttr>();
        for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrAll) {
            map.put(hfmdEntityAttr.getHfmdEntityAttrId(), hfmdEntityAttr);
        }

        return map;
    }

    private Map<Long, HfmdEntity> getHfmdEntityIdEntityMap(List<HfmdEntity> hfmdEntityAll) {

        Map<Long, HfmdEntity> map = new HashMap<Long, HfmdEntity>();
        for (HfmdEntity hfmdEntity : hfmdEntityAll) {
            map.put(hfmdEntity.getHfmdEntityId(), hfmdEntity);
        }
        return map;
    }

    private void loadDataSet(List<HfpmDataSet> hfpmDataSetAll, Map<Long, List<HfpmDataField>> hfpmDataFieldMap) throws Exception {
        if (hfpmDataSetAll != null) {
            for (HfpmDataSet hfpmDataSet : hfpmDataSetAll) {
                if(hfpmDataSet.getHfpmDataSetCode().equals("sql_reverse_input")) {
                    System.out.println(1);
                }

                //if ("fields".equals(coreSet.getCoreSetType()))
                List<HfpmDataField> hfpmDataFieldList = hfpmDataFieldMap.get(hfpmDataSet.getHfpmDataSetId());
                List<com.hframework.beans.tagbean.Field> fieldList = getFieldListFromDataFieldList(hfpmDataFieldList);
                Set<HfmdEntity> entityList = getEntityFromDataFieldList(hfpmDataFieldList);
                String entityCodes = "";
                for (HfmdEntity entity : entityList) {
                    if(entity == null) {
                        continue;
                    }
                    if (!"".equals(entityCodes)) {
                        entityCodes += ",";
                    }
                    entityCodes += entity.getHfmdEntityCode();
                }
                Map map = new HashMap();
                map.put(FIELDS_LIST, fieldList);
                map.put(TITLE, hfpmDataSet.getHfpmDataSetName());
                map.put(REL_ENTITYS, entityCodes);
//                SetCacheFactory.put(hfpmDataSet.getHfpmDataSetCode(), map, FIELDS);
                CacheFactory.put(CacheKeyEnum.DS_LIST_CACHE.name(), hfpmDataSet.getHfpmDataSetCode(), map);


                //如果是树形数据集，生成一个默认的树形缓存对象
                fieldList = getTreeFieldListFromDataFieldList(hfpmDataFieldList);
                if(fieldList != null) {
                    map = new HashMap();
                    map.put(FIELDS_LIST, fieldList);
                    map.put(TITLE, hfpmDataSet.getHfpmDataSetName());
                    map.put(REL_ENTITYS, entityCodes);
//                SetCacheFactory.put(hfpmDataSet.getHfpmDataSetCode(), map, "table");
                    CacheFactory.put(CacheKeyEnum.DS_TREE_CACHE.getName(),hfpmDataSet.getHfpmDataSetCode(),map);
                }



//				if ("columns".equals(coreSet.getCoreSetType()))

                map = getDataSetMap(hfpmDataSet,entityCodes,hfpmDataFieldList,0);
//                SetCacheFactory.put(hfpmDataSet.getHfpmDataSetCode(), map, "table");
                CacheFactory.put(CacheKeyEnum.DS_CREATE_CACHE.getName(),hfpmDataSet.getHfpmDataSetCode(),map);

                map = getDataSetMap(hfpmDataSet,entityCodes,hfpmDataFieldList,1);
                CacheFactory.put(CacheKeyEnum.DS_MODIFY_CACHE.name(),hfpmDataSet.getHfpmDataSetCode(),map);

                map = getDataSetMap(hfpmDataSet,entityCodes,hfpmDataFieldList,2);
                CacheFactory.put(CacheKeyEnum.DS_SHOW_CACHE.name(),hfpmDataSet.getHfpmDataSetCode(),map);
//			if ("element".equals(coreSet.getCoreSetType())) {
//
//			// 4、根据set对象找出对应的enum_group 对象，并精确到具体的某一个enum，或则sql
//
//			if(null == coreSet.getCoreSetQuote() || "".equals(coreSet.getCoreSetQuote())){
//				continue;
//			}
//
//			CoreEnumGroup coreEnumGroup=coreEnumGroupServ.getCoreEnumGroupByCoreEnumGroupId(coreSet.getCoreSetQuote(), 100);
//
//			List optionList=new ArrayList();
//			List<CoreEnum> coreEnumList=coreEnumGroup.getCoreEnumList();
//			for (CoreEnum coreEnum : coreEnumList) {
//				optionList.add(new Option(coreEnum.getCoreEnumValue(),coreEnum.getCoreEnumDisplayValue()));
//			}
//
//			Map map = new HashMap();
//			map.put("optionList", optionList);
//			map.put("Title", coreEnumGroup.getCoreEnumGroupName());
//			map.put("CoreEnumDyn", coreEnumGroup.getCoreEnumDyn());
//			map.put("ViewObject",JavaUtil.getJavaVarName(coreSet.getCoreSetName()));
//
//			SetCacheFactory.put(coreSet.getCoreSetName(), map,
//					"element");
                Collection<String> all = CacheFactory.getAll(CacheKeyEnum.DS_MODIFY_CACHE.name());
                System.out.println(1);

            }
        }


    }

    private Map getDataSetMap(HfpmDataSet hfpmDataSet, String entityCodes, List<HfpmDataField> hfpmDataFieldList, int showTypeCodeIndex) throws Exception {
        Map map = new HashMap();
        com.hframework.beans.class0.Class defPoClass = CreatorUtil.getDefPoClass("",
                hfpmProgramMap.get(hfpmDataSet.getHfpmProgramId()).getHfpmProgramCode(),
                hfpmProgramMap.get(hfpmDataSet.getHfpmProgramId()).getHfpmProgramCode(),//TODO
                hfpmDataSet.getHfpmDataSetCode());

        map.put(TITLE, hfpmDataSet.getHfpmDataSetName());
        map.put(VIEW_OBJECT, JavaUtil.getJavaVarName(hfpmDataSet.getHfpmDataSetCode()));
        map.put(PO_PATH, defPoClass.getClassPath());

        List<Column> columnList = getColumnListFromHfpmDataFieldList(hfpmDataFieldList,showTypeCodeIndex);
        map.put(COLUMNS_LIST, columnList);
        map.put(REL_ENTITYS, entityCodes);
        return map;
    }

    private List<Column> getColumnListFromHfpmDataFieldList(List<HfpmDataField> hfpmDataFieldList, int showTypeCodeIndex) {

        List<Column> columnList = new ArrayList<Column>();

        if (hfpmDataFieldList != null) {
            for (HfpmDataField hfpmDataField : hfpmDataFieldList) {
                HfmdEntityAttr hfmdEntityAttr = hfmdEntityAttrIdEntityAttrMap.get(hfpmDataField.getHfmdEntityAttrId());

                if((showTypeCodeIndex == 0 && !"0".equals(String.valueOf(hfpmDataField.getCreateEditAuth()))
                    || showTypeCodeIndex == 1 && !"0".equals(String.valueOf(hfpmDataField.getUpdateEditAuth()))
                    || showTypeCodeIndex == 2 && !"0".equals(String.valueOf(hfpmDataField.getListShowAuth())))) {
                    Column column = getColumnFromHfmdEntityAttr(hfmdEntityAttr, hfpmDataField.getHfpmFieldShowTypeId());
                    if (StringUtils.isNotBlank(hfpmDataField.getHfpmDataFieldName())) {
                        column.setDisplayName(hfpmDataField.getHfpmDataFieldName());
                    }
                    columnList.add(column);
                }

//                if(showTypeCodeIndex < hfpmDataField.getFieldShowCode().length() && !"0".equals(String.valueOf(hfpmDataField.getFieldShowCode().charAt(showTypeCodeIndex)))) {
//                    com.hframe.tag.bean.Column column = getColumnFromHfmdEntityAttr(hfmdEntityAttr, hfpmDataField.getHfpmFieldShowTypeId());
//                    if (StringUtils.isNotBlank(hfpmDataField.getHfpmDataFieldName())) {
//                        column.setDisplayName(hfpmDataField.getHfpmDataFieldName());
//                    }
//                    columnList.add(column);
//                }
            }
        }

        return columnList;
    }

    private Set<HfmdEntity> getEntityFromDataFieldList(List<HfpmDataField> hfpmDataFieldList) {
        Set<HfmdEntity> set = new HashSet<HfmdEntity>();
        if (hfpmDataFieldList != null) {
            for (HfpmDataField hfpmDataField : hfpmDataFieldList) {
                HfmdEntity entity = hfmdEntityIdEntityMap.get(hfpmDataField.getHfmdEntityId());
                set.add(entity);
            }
        }
        return set;
    }

    private List<com.hframework.beans.tagbean.Field> getFieldListFromDataFieldList(List<HfpmDataField> hfpmDataFieldList) {

        List<com.hframework.beans.tagbean.Field> fieldList = new ArrayList<com.hframework.beans.tagbean.Field>();

        if (hfpmDataFieldList != null) {

            for (HfpmDataField hfpmDataField : hfpmDataFieldList) {
                HfmdEntityAttr hfmdEntityAttr = hfmdEntityAttrIdEntityAttrMap.get(hfpmDataField.getHfmdEntityAttrId());
                if(hfmdEntityAttr != null && hfmdEntityAttr.getIspk() != null && hfmdEntityAttr.getIspk() == 1) {
                    fieldList.add(new com.hframework.beans.tagbean.Field(hfmdEntityAttr.getHfmdEntityAttrId()+"111",
                            "全选${sys:allSelect}",
                            "checkbox","",
//                            "${column:id}"
                            "${column:" + hfmdEntityAttr.getHfmdEntityAttrCode() + "}"
                    ));
                }
            }
            for (HfpmDataField hfpmDataField : hfpmDataFieldList) {
                //TODO
//                HfpmFieldShowType showType = hfpmFieldShowTypeMap.get(Long.valueOf(hfpmDataField.getHfpmFieldShowTypeId()));
                Long hfmdEntityAttrId = hfpmDataField.getHfmdEntityAttrId();

//                if(hfpmDataField.getFieldShowCode() !=null && hfpmDataField.getFieldShowCode().length() > 1
//                        && !"0".equals(hfpmDataField.getFieldShowCode().charAt(2))) {
                if(hfpmDataField.getListShowAuth() != 0L) {
                    fieldList.add(new com.hframework.beans.tagbean.Field(
                            String.valueOf(hfpmDataField.getHfpmDataFieldId()),
                            hfpmDataField.getHfpmDataFieldName(),
                            "text",
                            "${column:" + (hfmdEntityAttrIdEntityAttrMap.containsKey(hfmdEntityAttrId) ?
                                    hfmdEntityAttrIdEntityAttrMap.get(hfmdEntityAttrId).getHfmdEntityAttrCode() : "" + "}"), ""));
                }
            }
        }
        return fieldList;
    }

    private List<com.hframework.beans.tagbean.Field> getTreeFieldListFromDataFieldList(List<HfpmDataField> hfpmDataFieldList) {

        List<com.hframework.beans.tagbean.Field> fieldList = new ArrayList<com.hframework.beans.tagbean.Field>();

        if (hfpmDataFieldList != null) {

            HfmdEntityAttr pkEntityAttr = null;
            for (HfpmDataField hfpmDataField : hfpmDataFieldList) {
                HfmdEntityAttr hfmdEntityAttr = hfmdEntityAttrIdEntityAttrMap.get(hfpmDataField.getHfmdEntityAttrId());
                if(hfmdEntityAttr == null) {
                    System.out.println("warning : HfmdEntityAttrId : " + hfpmDataField.getHfmdEntityAttrId() + "; hfpmDataField:" + hfpmDataField.getHfpmDataFieldId());
                    continue;
                }
                if(hfmdEntityAttr.getIspk() != null && hfmdEntityAttr.getIspk() == 1) {
                    pkEntityAttr = hfmdEntityAttr;
                }
            }

            if(pkEntityAttr == null) {
                return null;
            }


            for (HfpmDataField hfpmDataField : hfpmDataFieldList) {
                HfmdEntityAttr hfmdEntityAttr = hfmdEntityAttrIdEntityAttrMap.get(hfpmDataField.getHfmdEntityAttrId());
                if(hfmdEntityAttr == null) {
                    continue;
                }

                //判断是否为自循环
                if(hfmdEntityAttr.getRelHfmdEntityAttrId() != null && hfmdEntityAttr.getRelHfmdEntityAttrId() > 0L
                        && pkEntityAttr.getHfmdEntityAttrId().equals(hfmdEntityAttr.getRelHfmdEntityAttrId())) {
                    fieldList.add(new com.hframework.beans.tagbean.Field(hfmdEntityAttr.getHfmdEntityAttrId()+"",
                            "",
                            "virtual_pid","",
                            hfmdEntityAttr.getHfmdEntityAttrCode()
//                            "${column:" + hfmdEntityAttr.getHfmdEntityAttrCode() + "}"
                    ));
                    fieldList.add(new com.hframework.beans.tagbean.Field(pkEntityAttr.getHfmdEntityAttrId()+"",
                            "",
                            "virtual_id","",
                            pkEntityAttr.getHfmdEntityAttrCode()
//                            "${column:" + pkEntityAttr.getHfmdEntityAttrCode() + "}"
                    ));
                }
            }

            if(fieldList.size() == 0) {
                return null;
            }

            for (HfpmDataField hfpmDataField : hfpmDataFieldList) {
                Long hfmdEntityAttrId = hfpmDataField.getHfmdEntityAttrId();

                if(hfmdEntityAttrIdEntityAttrMap.get(hfmdEntityAttrId).getHfmdEntityAttrCode().toLowerCase().contains("name")) {
                    fieldList.add(new com.hframework.beans.tagbean.Field(
                            String.valueOf(hfpmDataField.getHfpmDataFieldId()),
                            hfpmDataField.getHfpmDataFieldName(),
                            "href",
                            "${column:" + hfmdEntityAttrIdEntityAttrMap.get(hfmdEntityAttrId).getHfmdEntityAttrCode() + "}", ""));
                }
            }
        }
        return fieldList;
    }

    private void loadEntity(List<HfmdEntity> hfmdEntityAll, Map<Long, List<HfmdEntityAttr>> hfmdEntityAttrMap) throws Exception {
        if (hfmdEntityAll != null) {
            for (HfmdEntity hfmdEntity : hfmdEntityAll) {
                com.hframework.beans.class0.Class defPoClass = CreatorUtil.getDefPoClass("",
                        hfpmProgramMap.get(hfmdEntity.getHfpmProgramId()).getHfpmProgramCode(),
                        hfpmModuleMap.get(hfmdEntity.getHfpmModuleId()).getHfpmModuleCode(),
                        hfmdEntity.getHfmdEntityCode());
                Map<String,Object> map = new HashMap();
                map.put(TITLE, hfmdEntity.getHfmdEntityName());
                map.put(VIEW_OBJECT, JavaUtil.getJavaVarName(hfmdEntity.getHfmdEntityCode()));
                map.put(PO_PATH, defPoClass.getClassPath());

                List<HfmdEntityAttr> hfmdEntityAttrs = hfmdEntityAttrMap.get(hfmdEntity.getHfmdEntityId());
                List<Column> columnList = getColumnListFromHfmdEntityAttrs(hfmdEntityAttrs);
                map.put(COLUMNS_LIST, columnList);

                if (hfmdEntityAttrs != null) {
                    for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrs) {
                        if(hfmdEntityAttr == null) {
                            System.out.println(1);
                        }
                        if (hfmdEntityAttr.getIspk()  != null && hfmdEntityAttr.getIspk() == 1) {
                            map.put(PRIMARY_KEY, hfmdEntityAttr.getHfmdEntityAttrCode());
                        }
                    }
                }
//                SetCacheFactory.put(hfmdEntity.getHfmdEntityCode(), map, "table");
                CacheFactory.put(CacheKeyEnum.ENTITY_CACHE.name(),hfmdEntity.getHfmdEntityCode(),map);
            }
        }
    }

    private Map<Long, List<HfpmDataField>> getHfpmDataFieldMap(List<HfpmDataField> hfpmDataFieldAll) {

        Map<Long, List<HfpmDataField>> map = new HashMap<Long, List<HfpmDataField>>();
        for (HfpmDataField hfpmDataField : hfpmDataFieldAll) {
            if (!map.containsKey(hfpmDataField.getHfpmDataSetId())) {
                map.put(hfpmDataField.getHfpmDataSetId(), new ArrayList<HfpmDataField>());
            }
            List<HfpmDataField> hfpmDataFieldList = map.get(hfpmDataField.getHfpmDataSetId());

//            Collections.sort(hfpmDataFieldList, new Comparator<HfpmDataField>() {
//                public int compare(HfpmDataField o1, HfpmDataField o2) {
//                    return (o1.getPri().compareTo(o2.getPri()) < 0) ? -1 : 1;
//                }
//            });
            int index = -1;
            for (int i = 0; i < hfpmDataFieldList.size(); i++) {
                if(hfpmDataFieldList.get(i).getPri().compareTo(hfpmDataField.getPri()) > 0) {
                    index = i;
                }
            }
            if(index != -1) {
                hfpmDataFieldList.add(index,hfpmDataField);
            }else {
                hfpmDataFieldList.add(hfpmDataField);
            }

        }

        for (List<HfpmDataField> hfpmDataFields : map.values()) {
            Collections.sort(hfpmDataFields, new Comparator<HfpmDataField>() {
                public int compare(HfpmDataField o1, HfpmDataField o2) {
                    return (o1.getPri().compareTo(o2.getPri()) < 0) ? -1 : 1;
                }
            });
        }

        return map;
    }

    private Map<Long, List<HfmdEnum>> getHfmdEnumMap(List<HfmdEnum> hfmdEnumAll) {

        Map<Long, List<HfmdEnum>> map = new HashMap<Long, List<HfmdEnum>>();
        for (HfmdEnum hfmdEnum : hfmdEnumAll) {
            if (!map.containsKey(hfmdEnum.getHfmdEnumClassId())) {
                map.put(Long.valueOf(hfmdEnum.getHfmdEnumClassId()), new ArrayList<HfmdEnum>());
            }

            map.get(Long.valueOf(hfmdEnum.getHfmdEnumClassId())).add(hfmdEnum);
        }

        return map;
    }

    private Map<Long, HfmdEnumClass> getHfmdEnumClassMap(List<HfmdEnumClass> hfmdEnumClassAll) {
        Map<Long, HfmdEnumClass> map = new HashMap<Long, HfmdEnumClass>();
        for (HfmdEnumClass hfmdEnumClass : hfmdEnumClassAll) {
            map.put(hfmdEnumClass.getHfmdEnumClassId(), hfmdEnumClass);
        }

        return map;
    }

    private Map<Long, HfpmFieldShowType> getHfpmFieldShowTypeMap(List<HfpmFieldShowType> hfpmFieldShowTypeAll) {
        Map<Long, HfpmFieldShowType> map = new HashMap<Long, HfpmFieldShowType>();
        for (HfpmFieldShowType showType : hfpmFieldShowTypeAll) {
            map.put(showType.getHfpmFieldShowTypeId(), showType);
        }
        return map;
    }

    private List<Column> getColumnListFromHfmdEntityAttrs(List<HfmdEntityAttr> hfmdEntityAttrs) {

        List<Column> columnList = new ArrayList<Column>();

        for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrs) {
            columnList.add(getColumnFromHfmdEntityAttr(hfmdEntityAttr, null));
        }

        return null;
    }

    private Column getColumnFromHfmdEntityAttr(HfmdEntityAttr hfmdEntityAttr, String showTypeIds) {
        Column column = new Column();

        if(hfmdEntityAttr == null) {
            column.setShowType(new ShowType("input"));
            return column;
        }


        column.setId(String.valueOf(hfmdEntityAttr.getHfmdEntityAttrId()));
        column.setName(hfmdEntityAttr.getHfmdEntityAttrCode());
        column.setJavaVarName(JavaUtil.getJavaVarName(hfmdEntityAttr.getHfmdEntityAttrCode()));
        column.setDisplayName(hfmdEntityAttr.getHfmdEntityAttrName());
        column.setNullable(hfmdEntityAttr.getNullable() == null ? 0 : hfmdEntityAttr.getNullable());
        ///column.setDefaultValue(coreColumn.get)  //TODO

        //设置showType----------------------------一个column可以配置多个showType,分别用“，”分割
        if (StringUtils.isBlank(showTypeIds)) {
            if (hfmdEntityAttr.getIsBusiAttr() == null || hfmdEntityAttr.getIsBusiAttr() == 0) {
                column.setShowType(new ShowType("hidden"));
            } else {
                column.setShowType(new ShowType("input"));
            }
            return column;
        }

        String[] showTypeIdArray = showTypeIds.split(",");

        List<ShowType> showTypeList = getShowTypesByFieldShowTypeIds(showTypeIdArray);
        Long hfmdEnumClassId = hfmdEntityAttr.getHfmdEnumClassId();
        //设置showType中enum枚举值-------------------一个showType可以有optionList也可以没有optionList
        fillShowTypeList(showTypeList, hfmdEnumClassId);
        if (showTypeList != null) {
            if (showTypeList.size() == 1) {
                if (hfmdEntityAttr.getIsBusiAttr() == null || hfmdEntityAttr.getIsBusiAttr() == 0) {
                    column.setShowType(new ShowType("hidden"));
                } else {
                    column.setShowType(showTypeList.get(0));
                }
            } else {
                column.setShowTypes(showTypeList);
            }
        }
        return column;
    }

    private void fillShowTypeList(List<ShowType> showTypeList, Long hfmdEnumClassId) {
        if (hfmdEnumClassId != null && hfmdEnumClassId > 0) {
            List<HfmdEnum> hfmdEnumList = hfmdEnumMap.get(hfmdEnumClassId);
            if (hfmdEnumList != null) {
                List<Option> optionList = new ArrayList<Option>();
                for (HfmdEnum hfmdEnum : hfmdEnumList) {
                    optionList.add(new Option(hfmdEnum.getHfmdEnumValue(), hfmdEnum.getHfmdEnumText()));
                }
                if (showTypeList != null && showTypeList.size() > 0) {
                    showTypeList.get(0).setOptionList(optionList);
                }
                //TODO
//				showType.setCoreEnumDyn(getCoreEnumDynFromCoreShowType(coreShowType));
            }
        }
    }

    private List<ShowType> getShowTypesByFieldShowTypeIds(String[] showTypeIdArray) {

        List<ShowType> showTypeList = new ArrayList<ShowType>();

        for (String showTypeId : showTypeIdArray) {
            HfpmFieldShowType hfpmFieldShowType = hfpmFieldShowTypeMap.get(Long.valueOf(showTypeId));

            ShowType showType = new ShowType(hfpmFieldShowType.getHfpmFieldShowTypeCode());
            showType.setAfterStr(hfpmFieldShowType.getAfterStr());
            showType.setColSpan(hfpmFieldShowType.getColSpan()==null?1:hfpmFieldShowType.getColSpan());
            showType.setId(hfpmFieldShowType.getHfpmFieldShowTypeId().intValue());
            showType.setPreStr(hfpmFieldShowType.getPreStr());


//			showType.setElementId(coreShowType.getCoreElementId());//为tipinput,openwin使用 //TODO

            if (hfpmFieldShowType.getWidth() != null) {
                showType.setWidth(hfpmFieldShowType.getWidth());
            }
            if (hfpmFieldShowType.getHeight() != null) {
                showType.setHeight(hfpmFieldShowType.getHeight());
            }
//TODO
//			if(coreShowType.getCoreShowTypeAttr()!=null){
//				CoreShowTypeAttr coreShowTypeAttr = coreShowType.getCoreShowTypeAttr();
//				ShowTypeAttr showTypeAttr=new ShowTypeAttr();
//				showTypeAttr.setCondition(coreShowTypeAttr.getCondition());
//				showTypeAttr.setTitle(coreShowTypeAttr.getTitle());
//				showTypeAttr.setType(coreShowTypeAttr.getType());
//				showTypeAttr.setView(coreShowTypeAttr.getView());
//				showTypeAttr.setSrc(coreShowTypeAttr.getSrc()==null||"".equals(coreShowTypeAttr.getSrc())?"myDialog.jsp":coreShowTypeAttr.getSrc());
//				showType.setShowTypeAttr(showTypeAttr);
//			}

            showTypeList.add(showType);
        }

        return showTypeList;
    }

    private Map<Long, HfpmModule> getHfpmModuleMap(List<HfpmModule> hfpmModuleAll) {
        Map<Long, HfpmModule> map = new HashMap<Long, HfpmModule>();
        if (hfpmModuleAll != null) {
            for (HfpmModule hfpmModule : hfpmModuleAll) {
                map.put(hfpmModule.getHfpmModuleId(), hfpmModule);
            }
        }
        return map;
    }

    private Map<Long, HfpmProgram> getHfpmProgramMap(List<HfpmProgram> hfpmProgramAll) {
        Map<Long, HfpmProgram> map = new HashMap<Long, HfpmProgram>();
        if (hfpmProgramAll != null) {
            for (HfpmProgram hfpmProgram : hfpmProgramAll) {
                map.put(hfpmProgram.getHfpmProgramId(), hfpmProgram);
            }
        }
        return map;
    }

    private Map<Long, List<HfmdEntityAttr>> getHfmdEntityAttrMap(List<HfmdEntityAttr> hfmdEntityAttrAll) {
        Map<Long, List<HfmdEntityAttr>> hfmdEntityAttrMap = new HashMap<Long, List<HfmdEntityAttr>>();
        if (hfmdEntityAttrAll != null) {
            for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrAll) {
                if (!hfmdEntityAttrMap.containsKey(hfmdEntityAttr.getHfmdEntityId())) {
                    hfmdEntityAttrMap.put(hfmdEntityAttr.getHfmdEntityId(), new ArrayList<HfmdEntityAttr>());
                }
                hfmdEntityAttrMap.get(hfmdEntityAttr.getHfmdEntityId()).add(hfmdEntityAttr);
            }
        }
        return hfmdEntityAttrMap;
    }

    public HfpmDataField overrideDataSetField(HfpmDataField dataField) {
        HfpmDataField tempDataField = dataField;
        if(hfpmDataFieldInfoMap.containsKey(dataField.getHfpmDataFieldId())) {
            BeanUtils.copyProperties(dataField, hfpmDataFieldInfoMap.get(dataField.getHfpmDataFieldId()));
            tempDataField =  hfpmDataFieldInfoMap.get(dataField.getHfpmDataFieldId());

        }else {
            hfpmDataFieldInfoMap.put(dataField.getHfpmDataFieldId(), dataField);
            if(!hfpmDataFieldMap.containsKey(dataField.getHfpmDataSetId())) {//这里算是补丁
                synchronized (hfpmDataFieldMap) {
                    if(!hfpmDataFieldMap.containsKey(dataField.getHfpmDataSetId())) {
                        hfpmDataFieldMap.put(dataField.getHfpmDataSetId(), new ArrayList<HfpmDataField>());
                    }
                }
            }
            hfpmDataFieldMap.get(dataField.getHfpmDataSetId()).add(dataField);
            Collections.sort(hfpmDataFieldMap.get(dataField.getHfpmDataSetId()), new Comparator<HfpmDataField>() {
                public int compare(HfpmDataField o1, HfpmDataField o2) {
                    return (o1.getPri().compareTo(o2.getPri()) < 0) ? -1 : 1;
                }
            });
        }
        return tempDataField;
    }

    public HfmdEntityAttr overrideHfmdEntityAttr(HfmdEntityAttr hfmdEntityAttr) {
        HfmdEntityAttr tempHfmdEntityAttr = hfmdEntityAttr;
        if(hfmdEntityAttrIdEntityAttrMap.containsKey(hfmdEntityAttr.getHfmdEntityAttrId())) {
            BeanUtils.copyProperties(hfmdEntityAttr, hfmdEntityAttrIdEntityAttrMap.get(hfmdEntityAttr.getHfmdEntityAttrId()));
            tempHfmdEntityAttr = hfmdEntityAttrIdEntityAttrMap.get(hfmdEntityAttr.getHfmdEntityAttrId());
        }else {
            if(hfmdEntityAttrMap.get(hfmdEntityAttr.getHfmdEntityId()) == null) {
                synchronized (this) {
                    if(hfmdEntityAttrMap.get(hfmdEntityAttr.getHfmdEntityId()) == null) {
                        hfmdEntityAttrMap.put(hfmdEntityAttr.getHfmdEntityId(), new ArrayList<HfmdEntityAttr>());
                    }
                }
            }
            hfmdEntityAttrMap.get(hfmdEntityAttr.getHfmdEntityId()).add(hfmdEntityAttr);
            hfmdEntityAttrIdEntityAttrMap.put(hfmdEntityAttr.getHfmdEntityAttrId(), hfmdEntityAttr);
        }
        return tempHfmdEntityAttr;
    }


    public HfmdEntity overrideHfmdEntity(HfmdEntity hfmdEntity) {
        HfmdEntity tempHfmdEntity = hfmdEntity;
        if(hfmdEntityIdEntityMap.containsKey(hfmdEntity.getHfmdEntityId())) {
            BeanUtils.copyProperties(hfmdEntity, hfmdEntityIdEntityMap.get(hfmdEntity.getHfmdEntityId()));
            tempHfmdEntity = hfmdEntityIdEntityMap.get(hfmdEntity.getHfmdEntityId());
        }else {
            hfmdEntityIdEntityMap.put(hfmdEntity.getHfmdEntityId(), hfmdEntity);
            hfmdEntityAll.add(hfmdEntity);
            hfmdEntityAttrMap.put(hfmdEntity.getHfmdEntityId(), new ArrayList<HfmdEntityAttr>());
        }
        return tempHfmdEntity;
    }

    public void overrideHfmdEnumClass(HfmdEnumClass enumClass) {
        hfmdEnumClassMap.put(enumClass.getHfmdEnumClassId(), enumClass);
    }

    public HfpmDataSet overrideDataSet(HfpmDataSet hfpmDataSet) {
        HfpmDataSet tempDataSet = hfpmDataSet;
        if(hfpmDataSetMap.containsKey(hfpmDataSet.getHfpmDataSetId())) {
            BeanUtils.copyProperties(hfpmDataSet, hfpmDataSetMap.get(hfpmDataSet.getHfpmDataSetId()));
            tempDataSet = hfpmDataSetMap.get(hfpmDataSet.getHfpmDataSetId());
        }else {
            hfpmDataSetMap.put(hfpmDataSet.getHfpmDataSetId(), hfpmDataSet);
            hfpmDataSetAll.add(hfpmDataSet);
            hfpmDataFieldMap.put(hfpmDataSet.getHfpmDataSetId(), new ArrayList<HfpmDataField>());
        }

        return tempDataSet;
    }

    public HfpmDataField removeDataSetField(HfpmDataField dataField) {
        if(hfpmDataFieldInfoMap.containsKey(dataField.getHfpmDataFieldId())) {
            hfpmDataFieldInfoMap.remove(dataField.getHfpmDataFieldId());
            Iterator<HfpmDataField> iterator = hfpmDataFieldMap.get(dataField.getHfpmDataSetId()).iterator();
            while (iterator.hasNext()) {
                HfpmDataField next = iterator.next();
//                if(next.getHfpmDataFieldCode().equals(dataField.getFieldShowCode())) {
                if(next.getCreateEditAuth() == dataField.getCreateEditAuth()
                        && next.getUpdateEditAuth() == dataField.getUpdateEditAuth()
                        && next.getListShowAuth() == dataField.getListShowAuth()
                        && next.getDetailShowAuth() == dataField.getDetailShowAuth()){
                    iterator.remove();
                    return null;
                }
            }
        }
        return null;
    }

    public HfpmDataSet removeDataSet(HfpmDataSet hfpmDataSet) {
        if(hfpmDataSetMap.containsKey(hfpmDataSet.getHfpmDataSetId())) {
            hfpmDataSetMap.remove(hfpmDataSet.getHfpmDataSetId());
            Iterator<HfpmDataSet> iterator = hfpmDataSetAll.iterator();
            while (iterator.hasNext()) {
                HfpmDataSet next = iterator.next();
                if(next.getHfpmDataSetCode().equals(hfpmDataSet.getHfpmDataSetCode())) {
                    iterator.remove();
                    return null;
                }
            }
        }
        return null;
    }

    public boolean updateDataSetXml(HfpmDataField dataField) throws IOException {
        String dataSetFilePath = contextHelper.programConfigRootDir + "/" +
                contextHelper.programConfigDataSetDir + "/" + hfpmDataSetMap.get(dataField.getHfpmDataSetId()).getHfpmDataSetCode() + ".xml";
        DataSet dataSet = XmlUtils.readValueFromAbsoluteFilePath(dataSetFilePath, DataSet.class);
        List<Field> fieldList = dataSet.getFields().getFieldList();
        if(fieldList == null) {
            fieldList = new ArrayList<Field>();
            dataSet.getFields().setFieldList(fieldList);
        }
        Field targetField = getField(fieldList,dataField);
        boolean isNewField = true;
        for (Field field : fieldList) {
            if(targetField.getCode().equals(field.getCode())) {
                BeanUtils.copyProperties(targetField, field);
                isNewField = false;
                break;
            }
        }

        int index = hfpmDataFieldMap.get(dataField.getHfpmDataSetId()).indexOf(dataField);
        if(isNewField) {
            if(index < 0 || index >= fieldList.size()) {
                fieldList.add(targetField);
            }else {
                fieldList.add(index, targetField);
            }
        }

        //讲entity补充上
        List<HfpmDataField> hfpmDataFieldList = hfpmDataFieldMap.get(dataField.getHfpmDataSetId());
        List<Entity> entitys = new ArrayList<Entity>();
        dataSet.setEntityList(entitys);
        Set<HfmdEntity> entityList = getEntityFromDataFieldList(hfpmDataFieldList);
        for (HfmdEntity entity : entityList) {
            Entity entity1 = new Entity();
            entity1.setText(entity == null ? "" : entity.getHfmdEntityCode());
            entitys.add(entity1);
        }

        String dataSetXml = XmlUtils.writeValueAsString(dataSet);
        System.out.println(dataSetXml);
        FileUtils.writeFile(dataSetFilePath, dataSetXml);
        return true;
    }

    public boolean updateDataSetXml(Long dataSetId) throws IOException {
        createDataSetDescriptorXml(hfpmDataSetMap.get(dataSetId));
        return true;
    }

    public void updateAllUserRel(String oldUserRefInfo, String newUserRefInfo) throws IOException {
        //加载数据源信息
        List<DataSet> dataSetList = XmlUtils.readValuesFromDirectory(contextHelper.programConfigRootDir, contextHelper.programConfigDataSetDir, DataSet.class, ".xml");
        for (DataSet dataSet : dataSetList) {
            for (Field field : dataSet.getFields().getFieldList()) {
                if(field.getRel() != null && oldUserRefInfo.equals(field.getRel().getEntityCode())) {
                    field.getRel().setEntityCode(newUserRefInfo);
                }
                if(field.getRel() != null && field.getRel().getRelList() != null && field.getRel().getRelList().size() > 0 ) {
                    for (Rel rel : field.getRel().getRelList()) {
                        if(rel != null && oldUserRefInfo.equals(rel.getEntityCode())) {
                            rel.setEntityCode(newUserRefInfo);
                        }
                    }
                }
            }
            String dataSetFilePath = contextHelper.programConfigRootDir + "/" +
                    contextHelper.programConfigDataSetDir + "/" + dataSet.getCode() + ".xml";
            String dataSetXml = XmlUtils.writeValueAsString(dataSet);
            System.out.println(dataSetXml);
            FileUtils.writeFile(dataSetFilePath, dataSetXml);
        }
    }


    public static class CreatorUtil {

        public static String getJavaClassName(String tableName) {
            String returnName = "";
            tableName = tableName.toLowerCase();
            String[] parts = tableName.split("[_]+");
            for (String part : parts) {
                if (!"".equals(part)) {
                    returnName += part.substring(0, 1).toUpperCase()
                            + part.substring(1);
                }
            }
            return returnName;
        }

        public static Class getDefPoExampleClass(String companyName,
                                                 String projectName,String moduleName, String tableName) throws Exception {
            if(StringUtils.isBlank(tableName)) {
                throw new Exception("表名称为不能为空！");
            }

            companyName = StringUtils.isBlank(companyName)?"":"."+(companyName);
            projectName = StringUtils.isBlank(projectName)?"":"."+(projectName);
            moduleName = StringUtils.isBlank(moduleName)?"":"."+(moduleName);


            Class class1 = new Class();
            class1.setSrcFilePath(CreatorUtil.getSrcFilePath(companyName, projectName));
            class1.setClassPackage(CreatorUtil.getPoClassPackage(
                    companyName, projectName, moduleName, tableName));
            class1.setClassName(JavaUtil.getJavaClassName(tableName) + "_Example");
            return class1;
        }
        public static Class getDefServiceClass(String companyName,
                                               String projectName, String moduleName,String tableName) throws Exception {
            if(StringUtils.isBlank(tableName)) {
                throw new Exception("表名称为不能为空！");
            }

            companyName = StringUtils.isBlank(companyName)?"":"."+(companyName);
            projectName = StringUtils.isBlank(projectName)?"":"."+(projectName);
            moduleName = StringUtils.isBlank(moduleName)?"":"."+(moduleName);

            Class class1 = new Class();
            class1.setSrcFilePath(CreatorUtil.getSrcFilePath(companyName, projectName));
            class1.setClassPackage(CreatorUtil.getServiceClassPackage(
                    companyName, projectName, moduleName, tableName));
            class1.setClassName("I" + JavaUtil.getJavaClassName(tableName) + "SV");
            return class1;
        }

        public static String getServiceClassPackage(String companyName,
                                                    String projectName,String moduleName, String tableName) throws Exception {

            return PropertyConfigurerUtils.getProperty(
                    "service_class_package",
                    companyName.toLowerCase(),
                    projectName.toLowerCase(),
                    moduleName.toLowerCase());
        }

        public static Class getDefServiceImplClass(String companyName,
                                                   String projectName, String moduleName,String tableName) throws Exception {
            if(StringUtils.isBlank(tableName)) {
                throw new Exception("表名称为不能为空！");
            }

            companyName = StringUtils.isBlank(companyName)?"":"."+(companyName);
            projectName = StringUtils.isBlank(projectName)?"":"."+(projectName);
            moduleName = StringUtils.isBlank(moduleName)?"":"."+(moduleName);

            Class class1 = new Class();
            class1.setSrcFilePath(CreatorUtil.getSrcFilePath(companyName, projectName));
            class1.setClassPackage(CreatorUtil.getServiceImplClassPackage(
                    companyName, projectName, moduleName, tableName));
            class1.setClassName(JavaUtil.getJavaClassName(tableName) + "SVImpl");
            return class1;
        }
        public static Class getDefControllerClass(String companyName,
                                                  String projectName, String moduleName,String tableName) throws Exception {

            if(StringUtils.isBlank(tableName)) {
                throw new Exception("表名称为不能为空！");
            }

            companyName = StringUtils.isBlank(companyName)?"":"."+(companyName);
            projectName = StringUtils.isBlank(projectName)?"":"."+(projectName);
            moduleName = StringUtils.isBlank(moduleName)?"":"."+(moduleName);

            Class class1 = new Class();
            class1.setSrcFilePath(CreatorUtil.getSrcFilePath(companyName, projectName));
            class1.setClassPackage(CreatorUtil.getActionClassPackage(
                    companyName, projectName, moduleName, tableName));
            class1.setClassName(JavaUtil.getJavaClassName(tableName) + "Controller");
            return class1;
        }

        public static String getActionClassPackage(String companyName,
                                                   String projectName,String moduleName,String tableName) throws Exception {

            return PropertyConfigurerUtils.getProperty(
                    "action_class_package",
                    companyName.toLowerCase(),
                    projectName.toLowerCase(),
                    moduleName.toLowerCase());
        }
        public static String getServiceImplClassPackage(String companyName,
                                                        String projectName,String moduleName, String tableName) throws Exception {

            return PropertyConfigurerUtils.getProperty(
                    "serviceimpl_class_package",
                    companyName.toLowerCase(),
                    projectName.toLowerCase(),
                    moduleName.toLowerCase());
        }

        public static String getJavaVarName(String tableName) {

            String returnName="";
            tableName=tableName.toLowerCase();
            String[] parts=tableName.split("[_]+");
            for (String part : parts) {
                if(!"".equals(part)){
                    returnName+=part.substring(0,1).toUpperCase()+part.substring(1);
                }
            }
            return returnName.substring(0,1).toLowerCase()+returnName.substring(1);
        }


        /**
         * @param companyName
         * @param projectName
         * @return 获取SQL文件在项目中存放的路径即名称
         * @throws Exception
         */
        public static String getSrcFilePath(String companyName,
                                            String projectName) throws Exception {

            if("".equals(companyName) || companyName == null){
                companyName="zqh";
            }


            if(StringUtils.isBlank(projectName)) {
                throw new Exception("项目名称为不能为空！");
            }

            return PropertyConfigurerUtils.getProperty(CreatorConst.PROJECT_SRC_FILE_PATH);
        }



        /**
         * @param companyName
         * @param projectName
         * @param tableName
         * @return 获取SQL文件在项目中存放的路径即名称
         * @throws Exception
         */
        public static String getPoClassPackage(String companyName,
                                               String projectName,String moduleName,String tableName) throws Exception {
            return PropertyConfigurerUtils.getProperty(
                    CreatorConst.PO_CLASS_PACKAGE,
                    companyName.toLowerCase(),
                    projectName.toLowerCase(),
                    moduleName.toLowerCase(),
                    getJavaClassName(tableName.toLowerCase()));
        }


        public static Class getDefPoClass(String companyName,
                                          String projectName, String moduleName,String tableName) throws Exception {
            if(StringUtils.isBlank(tableName)) {
                throw new Exception("表名称为不能为空！");
            }

            companyName = StringUtils.isBlank(companyName)?"":"."+(companyName);
            projectName = StringUtils.isBlank(projectName)?"":"."+(projectName);
            moduleName = StringUtils.isBlank(moduleName)?"":"."+(moduleName);


            Class class1 = new Class();
            class1.setSrcFilePath(CreatorUtil.getSrcFilePath(companyName, projectName));
            class1.setClassPackage(CreatorUtil.getPoClassPackage(
                    companyName, projectName, moduleName,tableName));
            class1.setClassName(JavaUtil.getJavaClassName(tableName) + "");
            return class1;
        }
    }
    public static class CreatorConst {

        public static String PROJECT_SRC_FILE_PATH = "project_src_file_path";
        public static String PO_CLASS_PACKAGE = "po_class_package";
        public static String PROJECT_BASE_FILE_PATH = "project_base_file_path";

    }

    public Map<Long, HfmdEntity> getHfmdEntityIdEntityMap() {
        return hfmdEntityIdEntityMap;
    }

    public void setHfmdEntityIdEntityMap(Map<Long, HfmdEntity> hfmdEntityIdEntityMap) {
        this.hfmdEntityIdEntityMap = hfmdEntityIdEntityMap;
    }

    public Map<Long, List<HfmdEntityAttr>> getHfmdEntityAttrMap() {
        return hfmdEntityAttrMap;
    }

    public void setHfmdEntityAttrMap(Map<Long, List<HfmdEntityAttr>> hfmdEntityAttrMap) {
        this.hfmdEntityAttrMap = hfmdEntityAttrMap;
    }

    public String getUserRefInfo() {
        return userRefInfo;
    }

    public void setUserRefInfo(String userRefInfo) {
        this.userRefInfo = userRefInfo;
    }
}
