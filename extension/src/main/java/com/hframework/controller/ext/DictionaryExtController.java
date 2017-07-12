package com.hframework.controller.ext;

import com.google.common.base.Joiner;
import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.base.bean.KVBean;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.common.util.collect.bean.Mapper;
import com.hframework.common.util.collect.bean.Mapping;
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.math.ShortestPathUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created by zhangquanhong on 2016/12/11.
 */
@Controller
@RequestMapping(value = "/extend")
public class DictionaryExtController extends ExtBaseController {
    private static final Logger logger = LoggerFactory.getLogger(DictionaryExtController.class);

    @Resource
    private IHfpmModuleSV hfpmModuleSV;

    @Resource
    private IHfmdEntitySV hfmdEntitySV;
    @Resource
    private IHfmdEntityAttrSV hfmdEntityAttrSV;

    /**
     * 获取表列表
     * @param dataCondition
     * @return
     */
    @RequestMapping(value = "/user_data_path_list.json")
    @ResponseBody
    public ResultData userDataPath(@ModelAttribute("dataCondition") final String dataCondition, HttpServletRequest request){
        logger.debug("request : {}", dataCondition);
        return dictionary(dataCondition, "user_entity_name", "data_entity_name", request);
    }

    /**
     * 获取表列表
     * @param dataCondition
     * @return
     */
    @RequestMapping(value = "/user_func_path_list.json")
    @ResponseBody
    public ResultData userFuncPath(@ModelAttribute("dataCondition") final String dataCondition, HttpServletRequest request){
        logger.debug("request : {}", dataCondition);
        return dictionary(dataCondition, "user_entity_name", "func_entity_name", request);
    }

    private ResultData dictionary(String dataCondition, String userEntityNameParam, String dataEntityNameParam, HttpServletRequest request) {
        try {

            String userEntityIds = dataCondition.substring(dataCondition.indexOf(userEntityNameParam),
                    dataCondition.indexOf(dataEntityNameParam)).replace(userEntityNameParam, "").substring(1).replaceAll("&", "");
            String dataEntityIds = dataCondition.substring(dataCondition.indexOf(dataEntityNameParam)).replace(dataEntityNameParam, "").substring(1).replaceAll("&", "");;
            if(StringUtils.isBlank(userEntityIds) || StringUtils.isBlank(dataEntityIds)) {
                return ResultData.success();
            }
            List<String> userEntityIdList = Arrays.asList(userEntityIds.split(","));
            List<String> dataEntityIdList = Arrays.asList(dataEntityIds.split(","));
            Long programId = -1L;


            if(userEntityIdList != null && userEntityIdList.size() > 0) {
                HfmdEntity hfmdEntityByPK = hfmdEntitySV.getHfmdEntityByPK(Long.parseLong(userEntityIdList.get(0)));
                programId = hfmdEntityByPK.getHfpmProgramId();
            }else if(dataEntityIdList != null && dataEntityIdList.size() > 0) {
                HfmdEntity hfmdEntityByPK = hfmdEntitySV.getHfmdEntityByPK(Long.parseLong(dataEntityIdList.get(0)));
                programId = hfmdEntityByPK.getHfpmProgramId();
            }

            HfpmModule_Example moduleExample = new HfpmModule_Example();
            moduleExample.createCriteria().andHfpmProgramIdEqualTo(programId);
            List<HfpmModule> hfpmModuleList = hfpmModuleSV.getHfpmModuleListByExample(moduleExample);
            final Map<Long, HfpmModule> moduleMap = CollectionUtils.convert(hfpmModuleList, new Mapper<Long, HfpmModule>() {
                public <K> K getKey(HfpmModule hfmdEntity) {
                    return (K) hfmdEntity.getHfpmModuleId();
                }
            });


            HfmdEntity_Example example = new HfmdEntity_Example();
            example.createCriteria().andHfpmProgramIdEqualTo(programId);
            List<HfmdEntity> hfmdEntityList = hfmdEntitySV.getHfmdEntityListByExample(example);
            final Map<Long, HfmdEntity> entityMap = CollectionUtils.convert(hfmdEntityList, new Mapper<Long, HfmdEntity>() {
                public <K> K getKey(HfmdEntity hfmdEntity) {
                    return (K) hfmdEntity.getHfmdEntityId();
                }
            });


            HfmdEntityAttr_Example attrExample = new HfmdEntityAttr_Example();
            attrExample.createCriteria().andHfpmProgramIdEqualTo(programId);//.andRelHfmdEntityAttrIdIsNotNull();
            List<HfmdEntityAttr> hfmdEntityAttrList = hfmdEntityAttrSV.getHfmdEntityAttrListByExample(attrExample);
            Map<Long, HfmdEntityAttr> entityAttrMap = CollectionUtils.convert(hfmdEntityAttrList, new Mapper<Long, HfmdEntityAttr>() {
                public <K> K getKey(HfmdEntityAttr hfmdEntityAttr) {
                    return (K) hfmdEntityAttr.getHfmdEntityAttrId();
                }
            });

            Map<HfmdEntity, List<HfmdEntity>> accessibilityPathMap = new HashMap<HfmdEntity, List<HfmdEntity>>();
            for (HfmdEntityAttr hfmdEntityAttr : entityAttrMap.values()) {
                if (hfmdEntityAttr.getRelHfmdEntityAttrId() != null) {
                    HfmdEntity entity = entityMap.get(hfmdEntityAttr.getHfmdEntityId());
                    HfmdEntity relEntity = entityMap.get(
                            entityAttrMap.get(hfmdEntityAttr.getRelHfmdEntityAttrId()).getHfmdEntityId());
                    if (!accessibilityPathMap.containsKey(relEntity))
                        accessibilityPathMap.put(relEntity, new ArrayList<HfmdEntity>());
                    accessibilityPathMap.get(relEntity).add(entity);

                    if (!accessibilityPathMap.containsKey(entity))
                        accessibilityPathMap.put(entity, new ArrayList<HfmdEntity>());
                    accessibilityPathMap.get(entity).add(relEntity);
                }
            }

            List<HfmdEntity> userEntityList = CollectionUtils.fetch(userEntityIdList, new Fetcher<String, HfmdEntity>() {
                public HfmdEntity fetch(String s) {
                    return entityMap.get(Long.valueOf(s));
                }
            });
            userEntityList.remove(null);

            List<HfmdEntity> dataEntityList = CollectionUtils.fetch(dataEntityIdList, new Fetcher<String, HfmdEntity>() {
                public HfmdEntity fetch(String s) {
                    return entityMap.get(Long.valueOf(s));
                }
            });
            dataEntityList.remove(null);

            List<List<HfmdEntity>> allPath = new ArrayList<List<HfmdEntity>>();
            for (HfmdEntity user : userEntityList) {
                for (HfmdEntity data : dataEntityList) {
                    allPath.addAll(ShortestPathUtils.search(user, data, accessibilityPathMap));
                }
            }


            List<KVBean> kvBeans = CollectionUtils.from(allPath, new Mapping<List<HfmdEntity>, KVBean>() {
                public KVBean from(List<HfmdEntity> hfmdEntities) {
                    List<String> name = CollectionUtils.fetch(hfmdEntities, new Fetcher<HfmdEntity, String>() {
                        public String fetch(HfmdEntity hfmdEntity) {
                            return hfmdEntity.getHfmdEntityName();
                        }
                    });

                    List<String> value = CollectionUtils.fetch(hfmdEntities, new Fetcher<HfmdEntity, String>() {
                        public String fetch(HfmdEntity hfmdEntity) {
                            return moduleMap.get(hfmdEntity.getHfpmModuleId()).getHfpmModuleCode() + "." + hfmdEntity.getHfmdEntityCode();
                        }
                    });

                    KVBean kvBean = new KVBean();
                    kvBean.setValue(Joiner.on(" / ").join(value));
                    kvBean.setText(Joiner.on(" / ").join(name));
                    return kvBean;
                }
            });

            return ResultData.success(kvBeans);
        } catch (Exception e) {
            logger.error("error => {} ", ExceptionUtils.getFullStackTrace(e));
            return ResultData.error(ResultCode.ERROR);
        }
    }
}
