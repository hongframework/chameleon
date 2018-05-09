package com.hframework.generator.web.sql;

import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.common.util.BeanUtils;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.common.util.collect.bean.Mapper;
import com.hframework.common.frame.ServiceFactory;
import com.hframework.generator.web.container.HfModelContainer;
import com.hframework.generator.web.container.bean.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by zhangquanhong on 2016/8/2.
 */
public class HfModelService {
    @Resource
    private IHfpmProgramSV iHfpmProgramSV = ServiceFactory.getService(IHfpmProgramSV.class);
    @Resource
    private IHfpmModuleSV iHfpmModuleSV = ServiceFactory.getService(IHfpmModuleSV.class);
    @Resource
    private IHfmdEntitySV iHfmdEntitySV = ServiceFactory.getService(IHfmdEntitySV.class);
    @Resource
    private IHfmdEntityAttrSV iHfmdEntityAttrSV = ServiceFactory.getService(IHfmdEntityAttrSV.class);
    @Resource
    private IHfpmDataSetSV iHfpmDataSetSV = ServiceFactory.getService(IHfpmDataSetSV.class);
    @Resource
    private IHfpmDataFieldSV iHfpmDataFieldSV = ServiceFactory.getService(IHfpmDataFieldSV.class);
    @Resource
    private IHfmdEnumClassSV hfmdEnumClassSV = ServiceFactory.getService(IHfmdEnumClassSV.class);


    public HfModelContainer getModelContainerFromDB(String programCode, String programeName, String moduleCode, String moduleName) throws Exception {

        HfModelContainer hfModelContainer = new HfModelContainer();

        HfpmProgram_Example example = new HfpmProgram_Example();
        example.or() .andHfpmProgramCodeEqualTo(programCode);
        List<HfpmProgram> hfpmProgramList = iHfpmProgramSV.getHfpmProgramListByExample(example);

        if(hfpmProgramList != null && hfpmProgramList.size() > 0) {
            HfpmProgram hfpmProgram = hfpmProgramList.get(0);
            Long programId = hfpmProgram.getHfpmProgramId();

            hfModelContainer.setProgram(BeanUtils.convertObject(Program.class,hfpmProgram));

            //获取模块信息
            HfpmModule_Example moduleExample = new HfpmModule_Example();
            moduleExample.or().andHfpmProgramIdEqualTo(programId);
            List<HfpmModule> hfpmModuleList = iHfpmModuleSV.getHfpmModuleListByExample(moduleExample);

            if(hfpmModuleList != null && hfpmModuleList.size() > 0) {
                for (HfpmModule hfpmModule : hfpmModuleList) {
                    hfModelContainer.getModuleMap().put(hfpmModule.getHfpmModuleId(),
                            BeanUtils.convertObject(Module.class,hfpmModule));
                }
            }

            //获取实体信息
            HfmdEntity_Example entityExample = new HfmdEntity_Example();
            entityExample.or().andHfpmProgramIdEqualTo(programId);
            List<HfmdEntity> hfmdEntityList = iHfmdEntitySV.getHfmdEntityListByExample(entityExample);
            Map<String,Entity> entityMap = new HashMap<String, Entity>();
            Map<Long,Entity> entityIdEntityMap = new HashMap<Long, Entity>();
            if(hfmdEntityList != null && hfmdEntityList.size() > 0) {
                //实体信息<entityCode,HfmdEntity>
                for (HfmdEntity entity : hfmdEntityList) {
                    entity.setHfmdEntityCode(entity.getHfmdEntityCode().toLowerCase());
                    entityMap.put(entity.getHfmdEntityCode(), BeanUtils.convertObject(Entity.class, entity));
                    entityIdEntityMap.put(entity.getHfmdEntityId(), BeanUtils.convertObject(Entity.class, entity));
                }
            }
            hfModelContainer.setEntityMap(entityMap);

            //获取实体属�?�信�?
            HfmdEntityAttr_Example entityAttrExample = new HfmdEntityAttr_Example();
            entityAttrExample.or().andHfpmProgramIdEqualTo(programId);
            List<HfmdEntityAttr> hfmdEntityAttrList = iHfmdEntityAttrSV.getHfmdEntityAttrListByExample(entityAttrExample);
            if(hfmdEntityAttrList != null && hfmdEntityAttrList.size() > 0) {
                //实体属�?�信�?<entityCode.entityAttrCode,HfmdEntityAttr>
                Map<String,EntityAttr> entityAttrMap = new HashMap<String, EntityAttr>();
                for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrList) {
                    Entity entity =  entityIdEntityMap.get(hfmdEntityAttr.getHfmdEntityId());
                    if(entity == null) {//垃圾数据过滤
                        continue;
                    }

                    if("hfpm_page_cfg.hfpm_program_cfg_id".equals(entity.getHfmdEntityCode() + "." + hfmdEntityAttr.getHfmdEntityAttrCode())) {
                        System.out.println("1");
                    }

                    entityAttrMap.put(entity.getHfmdEntityCode() + "." + hfmdEntityAttr.getHfmdEntityAttrCode(),
                            BeanUtils.convertObject(EntityAttr.class, hfmdEntityAttr));
                }
                hfModelContainer.setEntityAttrMap(entityAttrMap);
            }

            //获取数据集信�?
            HfpmDataSet_Example dataSetExample = new HfpmDataSet_Example();
            dataSetExample.or() .andHfpmProgramIdEqualTo(programId);
            List<HfpmDataSet> hfpmDataSets = iHfpmDataSetSV.getHfpmDataSetListByExample(dataSetExample);
            if(hfpmDataSets != null) {
                Map<String, DataSet> dataSetMap = new HashMap<String, DataSet>();
                hfModelContainer.setDataSetMap(dataSetMap);
                Map<String, List<DataField>> dataFieldListMap = new HashMap<String, List<DataField>>();
                hfModelContainer.setDataFieldListMap(dataFieldListMap);
                for (HfpmDataSet hfpmDataSet : hfpmDataSets) {
                    dataSetMap.put(hfpmDataSet.getHfpmDataSetCode(), BeanUtils.convertObject(DataSet.class, hfpmDataSet));
                    //获取数据列信�?
                    HfpmDataField_Example dataFieldExample = new HfpmDataField_Example();
                    dataFieldExample.or().andHfpmDataSetIdEqualTo(hfpmDataSet.getHfpmDataSetId());
                    List<HfpmDataField> hfpmDataFieldList = iHfpmDataFieldSV.getHfpmDataFieldListByExample(dataFieldExample);
                    dataFieldListMap.put(hfpmDataSet.getHfpmDataSetCode(), CollectionUtils.fetch(hfpmDataFieldList, new Fetcher<HfpmDataField, DataField>() {
                        public DataField fetch(HfpmDataField dataField) {
                            return BeanUtils.convertObject(DataField.class, dataField);
                        }
                    }));
                }
            }

            //添加枚举值
            HfmdEnumClass_Example example1 = new HfmdEnumClass_Example();
            example1.createCriteria().andHfpmProgramIdEqualTo(programId);
            example1.or().andHfpmProgramIdIsNull();
            List<HfmdEnumClass> hfmdEnumClasses = hfmdEnumClassSV.getHfmdEnumClassListByExample(example1);
            List<EnumClass> enumClasses = CollectionUtils.fetch(hfmdEnumClasses, new Fetcher<HfmdEnumClass, EnumClass>() {
                public EnumClass fetch(HfmdEnumClass hfmdEnumClass) {
                    return BeanUtils.convertObject(EnumClass.class, hfmdEnumClass);
                }
            });
            hfModelContainer.setEnumClassCodeMap(CollectionUtils.convert(enumClasses, new Mapper<String, EnumClass>() {
                public <K> K getKey(EnumClass hfmdEnumClass) {
                    return (K) hfmdEnumClass.getHfmdEnumClassCode();
                }
            }));
            hfModelContainer.setEnumClassMap(CollectionUtils.convert(enumClasses, new Mapper<Long, EnumClass>() {
                public <K> K getKey(EnumClass hfmdEnumClass) {
                    return (K) hfmdEnumClass.getHfmdEnumClassId();
                }
            }));
        }

        return hfModelContainer;
    }

    private void executeModel(HfModelContainer hfModelContainer,int operType) throws Exception {
        //项目信息
        HfpmProgram hfpmProgram = BeanUtils.convertObject(HfpmProgram.class, hfModelContainer.getProgram());
        if(hfpmProgram != null) {
            if(operType == 1) {
                iHfpmProgramSV.create(hfpmProgram);
            }else {
                iHfpmProgramSV.update(hfpmProgram);
            }
        }

        //模块信息
        for (Module targetModule : hfModelContainer.getModuleMap().values()) {
            HfpmModule hfpmModule = BeanUtils.convertObject(HfpmModule.class, targetModule);
            if(operType == 1) {
                iHfpmModuleSV.create(hfpmModule);
            }else {
                iHfpmModuleSV.update(hfpmModule);
            }
        }
        //实体信息
        Map<Long, Long> entityIdChangeMap = new HashMap<Long, Long>();
        Map<String, Entity> targetEntityMap = hfModelContainer.getEntityMap();
        if(targetEntityMap != null) {
            for (String entityCode : targetEntityMap.keySet()) {
                Entity targetEntity = targetEntityMap.get(entityCode);
                Long tempId = targetEntity.getHfmdEntityId();
                HfmdEntity hfmdEntity = BeanUtils.convertObject(HfmdEntity.class, targetEntity);
                if(operType == 1) {
                    iHfmdEntitySV.create(hfmdEntity);
                }else {
                    iHfmdEntitySV.update(hfmdEntity);
                }
                entityIdChangeMap.put(tempId,hfmdEntity.getHfmdEntityId());
            }
        }

        //实体属�?�信�?
        Map<Long, Long> entityAttrIdChangeMap = new HashMap<Long, Long>();
        Map<String,EntityAttr> targetEntityAttrMap = hfModelContainer.getEntityAttrMap();
        if(targetEntityAttrMap != null) {
            List<HfmdEntityAttr> entityAttrList = CollectionUtils.fetch(new ArrayList<EntityAttr>(targetEntityAttrMap.values()),
                    new Fetcher<EntityAttr, HfmdEntityAttr>() {
                        public HfmdEntityAttr fetch(EntityAttr entityAttr) {
                            HfmdEntityAttr hfmdEntityAttr = BeanUtils.convertObject(HfmdEntityAttr.class, entityAttr);
                            if(entityAttr.getRelHfmdEntityAttrId() == null) hfmdEntityAttr.setRelHfmdEntityAttrId(null);
                            return hfmdEntityAttr ;
                        }
            });
            Collections.sort(entityAttrList, new Comparator<HfmdEntityAttr>() {
                public int compare(HfmdEntityAttr o1, HfmdEntityAttr o2) {
                    if(o1.getRelHfmdEntityAttrId() == null && o2.getRelHfmdEntityAttrId() == null) return 0;
                    if(o1.getRelHfmdEntityAttrId() == null) return -1;
                    if(o2.getRelHfmdEntityAttrId() == null) return 1;
                    return 0;
                }
            });
            for (HfmdEntityAttr targetEntityAttr : entityAttrList) {
                Long tempId = targetEntityAttr.getHfmdEntityAttrId();
                Long hfmdEntityId = entityIdChangeMap.get(targetEntityAttr.getHfmdEntityId());
                if (hfmdEntityId != null) {
                    targetEntityAttr.setHfmdEntityId(hfmdEntityId);
                }

                if(targetEntityAttr.getRelHfmdEntityAttrId() != null && entityAttrIdChangeMap.containsKey(targetEntityAttr.getRelHfmdEntityAttrId())){
                    targetEntityAttr.setRelHfmdEntityAttrId(entityAttrIdChangeMap.get(targetEntityAttr.getRelHfmdEntityAttrId()));
                }

                if(operType == 1) {
                    iHfmdEntityAttrSV.create(targetEntityAttr);
                }else {
                    iHfmdEntityAttrSV.update(targetEntityAttr);
                }
                entityAttrIdChangeMap.put(tempId, targetEntityAttr.getHfmdEntityAttrId());
            }
        }
        Map<String, DataSet> dataSetMap = hfModelContainer.getDataSetMap();
        if (dataSetMap != null) {
            for (DataSet hfpmDataSet : dataSetMap.values()) {
                Long hfmdEntityId = entityIdChangeMap.get(hfpmDataSet.getMainHfmdEntityId());
                if (hfmdEntityId != null) {
                    hfpmDataSet.setMainHfmdEntityId(hfmdEntityId);
                }
                HfpmDataSet hfpmDataSet1 = BeanUtils.convertObject(HfpmDataSet.class, hfpmDataSet);
                if(operType == 1) {
                    iHfpmDataSetSV.create(hfpmDataSet1);
                    hfpmDataSet.setHfpmDataSetId(hfpmDataSet1.getHfpmDataSetId());
                }else {
                    iHfpmDataSetSV.update(hfpmDataSet1);
                }
            }
        }
        Map<String, List<DataField>> dataFieldListMap = hfModelContainer.getDataFieldListMap();
        if(dataFieldListMap != null) {
            for (String dataSetCode : dataFieldListMap.keySet()) {
                List<DataField> hfpmDataFieldList =  dataFieldListMap.get(dataSetCode);
                if(hfpmDataFieldList != null) {
                    for (DataField hfpmDataField : hfpmDataFieldList) {
                        if(dataSetMap.get(dataSetCode) != null) {
                            hfpmDataField.setHfpmDataSetId(dataSetMap.get(dataSetCode).getHfpmDataSetId());
                        }

                        Long hfmdEntityId = entityIdChangeMap.get(hfpmDataField.getHfmdEntityId());
                        if (hfmdEntityId != null) {
                            hfpmDataField.setHfmdEntityId(hfmdEntityId);
                        }
                        Long entityAttrId = entityAttrIdChangeMap.get(hfpmDataField.getHfmdEntityAttrId());
                        if(entityAttrId != null) {
                            hfpmDataField.setHfmdEntityAttrId(entityAttrId);
                        }
                        if(operType == 1) {
                            iHfpmDataFieldSV.create(BeanUtils.convertObject(HfpmDataField.class, hfpmDataField));
                        }else {
                            iHfpmDataFieldSV.update(BeanUtils.convertObject(HfpmDataField.class, hfpmDataField));
                        }
                    }
                }
            }
        }
    }

    public void executeModelUpdate(HfModelContainer hfModelContainer) throws Exception {
        executeModel(hfModelContainer,2);
    }

    public void executeModelInsert(HfModelContainer hfModelContainer) throws Exception {
        executeModel(hfModelContainer,1);
    }

    public static HfModelService get(){
        return new HfModelService();
    }
}
