package com.hframe.controller;

import com.hframe.domain.model.HfpmDataSet;
import com.hframe.domain.model.HfpmDataSet_Example;
import com.hframe.service.interfaces.IHfpmDataSetSV;
import com.hframework.beans.controller.Pagination;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.util.ExampleUtils;
import com.hframework.web.ControllerHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/hframe/hfpmDataSet")
public class HfpmDataSetController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmDataSetController.class);

	@Resource
	private IHfpmDataSetSV iHfpmDataSetSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示数据集列表
     * @param hfpmDataSet
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmDataSet") HfpmDataSet hfpmDataSet,
                                      @ModelAttribute("example") HfpmDataSet_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmDataSet, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmDataSet, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmDataSet> list = iHfpmDataSetSV.getHfpmDataSetListByExample(example);
            pagination.setTotalCount(iHfpmDataSetSV.getHfpmDataSetCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示数据集明细
     * @param hfpmDataSet
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmDataSet") HfpmDataSet hfpmDataSet){
        logger.debug("request : {},{}", hfpmDataSet.getHfpmDataSetId(), hfpmDataSet);
        try{
            HfpmDataSet result = iHfpmDataSetSV.getHfpmDataSetByPK(hfpmDataSet.getHfpmDataSetId());
            if(result != null) {
                return ResultData.success(result);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
    * 创建数据集
    * @param hfpmDataSet
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmDataSet") HfpmDataSet hfpmDataSet) {
        logger.debug("request : {}", hfpmDataSet);
        try {
            ControllerHelper.setDefaultValue(hfpmDataSet, "hfpmDataSetId");
            int result = iHfpmDataSetSV.create(hfpmDataSet);
            if(result > 0) {
                return ResultData.success(hfpmDataSet);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护数据集
    * @param hfpmDataSets
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmDataSet[] hfpmDataSets) {
        logger.debug("request : {}", hfpmDataSets);

        try {
            ControllerHelper.setDefaultValue(hfpmDataSets, "hfpmDataSetId");
            ControllerHelper.reorderProperty(hfpmDataSets);

            int result = iHfpmDataSetSV.batchOperate(hfpmDataSets);
            if(result > 0) {
                return ResultData.success(hfpmDataSets);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新数据集
    * @param hfpmDataSet
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmDataSet") HfpmDataSet hfpmDataSet) {
        logger.debug("request : {}", hfpmDataSet);
        try {
            ControllerHelper.setDefaultValue(hfpmDataSet, "hfpmDataSetId");
            int result = iHfpmDataSetSV.update(hfpmDataSet);
            if(result > 0) {
                return ResultData.success(hfpmDataSet);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除数据集
    * @param hfpmDataSet
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmDataSet") HfpmDataSet hfpmDataSet) {
        logger.debug("request : {}", hfpmDataSet);

        try {
            ControllerHelper.setDefaultValue(hfpmDataSet, "hfpmDataSetId");
            int result = iHfpmDataSetSV.delete(hfpmDataSet);
            if(result > 0) {
                return ResultData.success(hfpmDataSet);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmDataSetSV getIHfpmDataSetSV(){
		return iHfpmDataSetSV;
	}
	//setter
	public void setIHfpmDataSetSV(IHfpmDataSetSV iHfpmDataSetSV){
    	this.iHfpmDataSetSV = iHfpmDataSetSV;
    }
}
