package com.hframework.base.service;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.hframe.domain.model.*;
import com.hframe.service.interfaces.IHfmdEntityAttrSV;
import com.hframe.service.interfaces.IHfmdEntitySV;
import com.hframe.service.interfaces.IHfpmProgramCfgSV;
import com.hframework.common.util.StringUtils;
import com.hframework.controller.ext.bean.AuthManager;

import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangquanhong on 2016/10/16.
 */
public class DataSetLoaderHelper {

    private static Map<String, DataSetLoaderService> dataSetLoaderServiceMap = new HashMap<String, DataSetLoaderService>();

    public static DataSetLoaderService getDataSetLoaderService(
            String companyCode, String programCode, String moduleCode, IHfpmProgramCfgSV iHfpmProgramCfgSV,
            IHfmdEntitySV iHfmdEntitySV, IHfmdEntityAttrSV hfmdEntityAttrSV, Long programId) {
        if(moduleCode == null) moduleCode = "";
        String key = Joiner.on("|").join(new String[]{companyCode, programCode, moduleCode});

        if(!dataSetLoaderServiceMap.containsKey(key)) {
            synchronized (DataSetLoaderHelper.class) {
                if(!dataSetLoaderServiceMap.containsKey(key)) {
                    DataSetLoaderService dataSetLoaderService = new DataSetLoaderService();
                    dataSetLoaderService.init(companyCode, programCode, moduleCode);
                    if(programId > 0) {
                        try {
                            HfpmProgramCfg_Example programCfgExample = new HfpmProgramCfg_Example();
                            programCfgExample.createCriteria().andHfpmProgramIdEqualTo(programId);
                            List<HfpmProgramCfg> hfpmProgramCfgListByExample = iHfpmProgramCfgSV.getHfpmProgramCfgListByExample(programCfgExample);
                            if(hfpmProgramCfgListByExample.size() > 0) {
                                HfpmProgramCfg hfpmProgramCfg = hfpmProgramCfgListByExample.get(0);
                                if(StringUtils.isNotBlank(hfpmProgramCfg.getUserEntityName())) {
                                    String[] userEntityIds = hfpmProgramCfg.getUserEntityName().replaceAll("/", ",").split(",");
                                    if (userEntityIds.length > 0) {
                                        HfmdEntity hfmdEntityByPK = iHfmdEntitySV.getHfmdEntityByPK(Long.valueOf(userEntityIds[0]));

                                        HfmdEntityAttr_Example entityAttrExample = new HfmdEntityAttr_Example();
                                        entityAttrExample.createCriteria().andHfmdEntityIdEqualTo(Long.valueOf(userEntityIds[0]));
                                        List<HfmdEntityAttr> hfmdEntityAttrList = hfmdEntityAttrSV.getHfmdEntityAttrListByExample(entityAttrExample);
                                        String tableName = hfmdEntityByPK.getHfmdEntityCode();
                                        String keyProperty = null;
                                        for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrList) {
                                            if (hfmdEntityAttr.getIspk() != null && 1 == hfmdEntityAttr.getIspk()) {
                                                keyProperty = hfmdEntityAttr.getHfmdEntityAttrCode();
                                                break;
                                            }
                                        }
                                        String nameProperty = null;
                                        for (String name : Lists.newArrayList("name", "user_name", "username")) {
                                            for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrList) {
                                                if (hfmdEntityAttr.getHfmdEntityAttrCode().toLowerCase().equals(name)) {
                                                    nameProperty = hfmdEntityAttr.getHfmdEntityAttrCode();
                                                    break;
                                                }
                                            }
                                        }
                                        if (StringUtils.isBlank(nameProperty)) {
                                            for (String name : Lists.newArrayList("name", "user_name", "username")) {
                                                for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrList) {
                                                    if (hfmdEntityAttr.getHfmdEntityAttrCode().toLowerCase().endsWith(name)) {
                                                        nameProperty = hfmdEntityAttr.getHfmdEntityAttrCode();
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        String userInfo = tableName + "/" + keyProperty + "/" + nameProperty;
                                        dataSetLoaderService.setUserRefInfo(userInfo);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    dataSetLoaderServiceMap.put(key, dataSetLoaderService);
                }
            }
        }
        return dataSetLoaderServiceMap.get(key);
    }

    public static DataSetLoaderService getDataSetLoaderService(
            String companyCode, String programCode, String moduleCode) {
        return getDataSetLoaderService(companyCode,programCode,moduleCode, null, null,null,-1L);
    }

}
