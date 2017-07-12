package com.hframe.service.handler;

import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.common.util.BeanUtils;
import com.hframework.generator.web.container.bean.Entity;
import com.hframework.web.extension.AbstractBusinessHandler;
import com.hframework.base.service.DataSetLoaderHelper;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.web.extension.annotation.AfterCreateHandler;
import com.hframework.web.extension.annotation.AfterDeleteHandler;
import com.hframework.web.extension.annotation.AfterUpdateHandler;
import com.hframework.generator.web.container.HfModelContainerUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangquanhong on 2016/10/14.
 */
@Service
public class HfmdEntityHandler extends AbstractBusinessHandler<HfmdEntity> {

    private static final long ENUM_CLASS_DEFAULT_HOLDER = 2;

    @Resource
    private IHfpmDataSetSV hfpmDataSetSV;
    @Resource
    private IHfpmProgramSV hfpmProgramSV;
    @Resource
    private IHfmdEntityAttrSV hfmdEntityAttrSV;
    @Resource
    private IHfpmProgramCfgSV iHfpmProgramCfgSV;

    @Resource
    private IHfmdEntitySV iHfmdEntitySV;

//    @AfterCreateHandler
    @AfterUpdateHandler
    public boolean updateDataSetService(HfmdEntity hfmdEntity) throws Exception {
        HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(hfmdEntity.getHfpmProgramId());

        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();

        DataSetLoaderService dataSetLoaderService = DataSetLoaderHelper.getDataSetLoaderService(
                companyCode, programCode, null,iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV,hfmdEntity.getHfpmProgramId());
        dataSetLoaderService.overrideHfmdEntity(hfmdEntity);
        return true;
    }

    @AfterCreateHandler
    public boolean generateDataSet(HfmdEntity hfmdEntity) throws Exception {
        updateDataSetService(hfmdEntity);
        HfpmDataSet dataSet = BeanUtils.convertObject(HfpmDataSet.class, HfModelContainerUtil.getDataSetFromEntity(BeanUtils.convertObject(Entity.class, hfmdEntity)));
        hfpmDataSetSV.create(dataSet);
        HfpmDataSet qryDataSet =  BeanUtils.convertObject(HfpmDataSet.class, HfModelContainerUtil.getQryDataSetFromEntity(BeanUtils.convertObject(Entity.class, hfmdEntity)));
        hfpmDataSetSV.create(qryDataSet);
        return true;
    }

    @AfterDeleteHandler
    public boolean deleteDataSet(HfmdEntity hfmdEntity) throws Exception {
        HfpmDataSet_Example example = new HfpmDataSet_Example();
        example.createCriteria().andMainHfmdEntityIdEqualTo(hfmdEntity.getHfmdEntityId());
        List<HfpmDataSet> hfpmDataSetList = hfpmDataSetSV.getHfpmDataSetListByExample(example);
        if(hfpmDataSetList != null) {
            for (HfpmDataSet dataSet : hfpmDataSetList) {
                hfpmDataSetSV.delete(dataSet);
            }
        }
        return true;
    }







}
