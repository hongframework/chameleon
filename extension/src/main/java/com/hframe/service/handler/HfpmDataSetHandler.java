package com.hframe.service.handler;

import com.hframe.domain.model.HfpmDataSet;
import com.hframe.domain.model.HfpmProgram;
import com.hframe.service.interfaces.*;
import com.hframework.web.extension.AbstractBusinessHandler;
import com.hframework.base.service.DataSetLoaderHelper;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.web.extension.annotation.AfterCreateHandler;
import com.hframework.web.extension.annotation.AfterUpdateHandler;
import com.hframework.web.extension.annotation.BeforeDeleteHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhangquanhong on 2016/10/16.
 */
@Service
public class HfpmDataSetHandler extends AbstractBusinessHandler<HfpmDataSet> {

    @Resource
    private IHfpmProgramSV hfpmProgramSV;
    @Resource
    private IHfpmDataSetSV hfpmDataSetSV;

    @Resource
    private IHfpmProgramCfgSV iHfpmProgramCfgSV;

    @Resource
    private IHfmdEntitySV iHfmdEntitySV;

    @Resource
    private IHfmdEntityAttrSV hfmdEntityAttrSV;

    @AfterUpdateHandler
    @AfterCreateHandler
    public boolean add(HfpmDataSet hfpmDataSet) throws Exception {

        HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(hfpmDataSet.getHfpmProgramId());

        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();

        DataSetLoaderService dataSetLoaderService = DataSetLoaderHelper.getDataSetLoaderService(
                companyCode, programCode, null,iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV,hfpmDataSet.getHfpmProgramId());
        dataSetLoaderService.overrideDataSet(hfpmDataSet);
        dataSetLoaderService.updateDataSetXml(hfpmDataSet.getHfpmDataSetId());
        return true;
    }

    @BeforeDeleteHandler
    public boolean delete(HfpmDataSet hfpmDataSet) throws Exception {

        if(hfpmDataSet.getHfpmProgramId() == null) {
            hfpmDataSet = hfpmDataSetSV.getHfpmDataSetByPK(hfpmDataSet.getHfpmDataSetId());
        }
        HfpmProgram hfpmProgram = hfpmProgramSV.getHfpmProgramByPK(hfpmDataSet.getHfpmProgramId());

        String companyCode = hfpmProgram.getOwnerCode();
        String programCode = hfpmProgram.getHfpmProgramCode();

        DataSetLoaderService dataSetLoaderService = DataSetLoaderHelper.getDataSetLoaderService(
                companyCode, programCode, null,iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV,hfpmDataSet.getHfpmProgramId());
        dataSetLoaderService.removeDataSet(hfpmDataSet);
//        dataSetLoaderService.updateDataSetXml(hfpmDataSet.getHfpmDataSetId());

        return true;
    }
}
