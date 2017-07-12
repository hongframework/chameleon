package com.hframe.controller;

import com.hframework.beans.controller.Pagination;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.util.ExampleUtils;
import com.hframework.beans.exceptions.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.ServletRequestDataBinder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import com.hframework.web.ControllerHelper;
import com.hframe.domain.model.HfpmDataField;
import com.hframe.domain.model.HfpmDataField_Example;
import com.hframe.service.interfaces.IHfpmDataFieldSV;

@Controller
@RequestMapping(value = "/hframe/hfpmDataField")
public class HfpmDataFieldController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmDataFieldController.class);

	@Resource
	private IHfpmDataFieldSV iHfpmDataFieldSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示数据列列表
     * @param hfpmDataField
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmDataField") HfpmDataField hfpmDataField,
                                      @ModelAttribute("example") HfpmDataField_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmDataField, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmDataField, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmDataField> list = iHfpmDataFieldSV.getHfpmDataFieldListByExample(example);
            pagination.setTotalCount(iHfpmDataFieldSV.getHfpmDataFieldCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示数据列明细
     * @param hfpmDataField
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmDataField") HfpmDataField hfpmDataField){
        logger.debug("request : {},{}", hfpmDataField.getHfpmDataFieldId(), hfpmDataField);
        try{
            HfpmDataField result = null;
            if(hfpmDataField.getHfpmDataFieldId() != null) {
                result = iHfpmDataFieldSV.getHfpmDataFieldByPK(hfpmDataField.getHfpmDataFieldId());
            }else {
                HfpmDataField_Example example = ExampleUtils.parseExample(hfpmDataField, HfpmDataField_Example.class);
                List<HfpmDataField> list = iHfpmDataFieldSV.getHfpmDataFieldListByExample(example);
                if(list != null && list.size() == 1) {
                    result = list.get(0);
                }
            }

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
    * 搜索一个数据列
    * @param  hfpmDataField
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfpmDataField") HfpmDataField  hfpmDataField){
        logger.debug("request : {}",  hfpmDataField);
        try{
            HfpmDataField result = null;
            if(hfpmDataField.getHfpmDataFieldId() != null) {
                result =  iHfpmDataFieldSV.getHfpmDataFieldByPK(hfpmDataField.getHfpmDataFieldId());
            }else {
                HfpmDataField_Example example = ExampleUtils.parseExample( hfpmDataField, HfpmDataField_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfpmDataField> list =  iHfpmDataFieldSV.getHfpmDataFieldListByExample(example);
                if(list != null && list.size() > 0) {
                    result = list.get(0);
                }
            }

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
    * 创建数据列
    * @param hfpmDataField
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmDataField") HfpmDataField hfpmDataField) {
        logger.debug("request : {}", hfpmDataField);
        try {
            ControllerHelper.setDefaultValue(hfpmDataField, "hfpmDataFieldId");
            int result = iHfpmDataFieldSV.create(hfpmDataField);
            if(result > 0) {
                return ResultData.success(hfpmDataField);
            }
        } catch (BusinessException e ){
            return e.result();
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护数据列
    * @param hfpmDataFields
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmDataField[] hfpmDataFields) {
        logger.debug("request : {}", hfpmDataFields);

        try {
            ControllerHelper.setDefaultValue(hfpmDataFields, "hfpmDataFieldId");
            ControllerHelper.reorderProperty(hfpmDataFields);

            int result = iHfpmDataFieldSV.batchOperate(hfpmDataFields);
            if(result > 0) {
                return ResultData.success(hfpmDataFields);
            }
        } catch (BusinessException e ){
            return e.result();
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新数据列
    * @param hfpmDataField
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmDataField") HfpmDataField hfpmDataField) {
        logger.debug("request : {}", hfpmDataField);
        try {
            ControllerHelper.setDefaultValue(hfpmDataField, "hfpmDataFieldId");
            int result = iHfpmDataFieldSV.update(hfpmDataField);
            if(result > 0) {
                return ResultData.success(hfpmDataField);
            }
        } catch (BusinessException e ){
            return e.result();
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 创建或更新数据列
    * @param hfpmDataField
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/saveOrUpdateByAjax.json")
    @ResponseBody
    public ResultData saveOrUpdate(@ModelAttribute("hfpmDataField") HfpmDataField hfpmDataField) {
        logger.debug("request : {}", hfpmDataField);
        try {
            ControllerHelper.setDefaultValue(hfpmDataField, "hfpmDataFieldId");
            int result = iHfpmDataFieldSV.batchOperate(new HfpmDataField[]{hfpmDataField});
            if(result > 0) {
                return ResultData.success(hfpmDataField);
            }
        } catch (BusinessException e ){
            return e.result();
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除数据列
    * @param hfpmDataField
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmDataField") HfpmDataField hfpmDataField) {
        logger.debug("request : {}", hfpmDataField);

        try {
            ControllerHelper.setDefaultValue(hfpmDataField, "hfpmDataFieldId");
            int result = iHfpmDataFieldSV.delete(hfpmDataField);
            if(result > 0) {
                return ResultData.success(hfpmDataField);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (BusinessException e ){
            return e.result();
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmDataFieldSV getIHfpmDataFieldSV(){
		return iHfpmDataFieldSV;
	}
	//setter
	public void setIHfpmDataFieldSV(IHfpmDataFieldSV iHfpmDataFieldSV){
    	this.iHfpmDataFieldSV = iHfpmDataFieldSV;
    }
}
