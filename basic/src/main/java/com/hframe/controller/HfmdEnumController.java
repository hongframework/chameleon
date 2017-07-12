package com.hframe.controller;

import com.hframe.domain.model.HfmdEnum;
import com.hframe.domain.model.HfmdEnum_Example;
import com.hframe.service.interfaces.IHfmdEnumSV;
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
@RequestMapping(value = "/hframe/hfmdEnum")
public class HfmdEnumController   {
    private static final Logger logger = LoggerFactory.getLogger(HfmdEnumController.class);

	@Resource
	private IHfmdEnumSV iHfmdEnumSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示枚举列表
     * @param hfmdEnum
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfmdEnum") HfmdEnum hfmdEnum,
                                      @ModelAttribute("example") HfmdEnum_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfmdEnum, example, pagination);
        try{
            ExampleUtils.parseExample(hfmdEnum, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfmdEnum> list = iHfmdEnumSV.getHfmdEnumListByExample(example);
            pagination.setTotalCount(iHfmdEnumSV.getHfmdEnumCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示枚举明细
     * @param hfmdEnum
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfmdEnum") HfmdEnum hfmdEnum){
        logger.debug("request : {},{}", hfmdEnum.getHfmdEnumId(), hfmdEnum);
        try{
            HfmdEnum result = iHfmdEnumSV.getHfmdEnumByPK(hfmdEnum.getHfmdEnumId());
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
    * 创建枚举
    * @param hfmdEnum
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfmdEnum") HfmdEnum hfmdEnum) {
        logger.debug("request : {}", hfmdEnum);
        try {
            ControllerHelper.setDefaultValue(hfmdEnum, "hfmdEnumId");
            int result = iHfmdEnumSV.create(hfmdEnum);
            if(result > 0) {
                return ResultData.success(hfmdEnum);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护枚举
    * @param hfmdEnums
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfmdEnum[] hfmdEnums) {
        logger.debug("request : {}", hfmdEnums);

        try {
            ControllerHelper.setDefaultValue(hfmdEnums, "hfmdEnumId");
            ControllerHelper.reorderProperty(hfmdEnums);

            int result = iHfmdEnumSV.batchOperate(hfmdEnums);
            if(result > 0) {
                return ResultData.success(hfmdEnums);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新枚举
    * @param hfmdEnum
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfmdEnum") HfmdEnum hfmdEnum) {
        logger.debug("request : {}", hfmdEnum);
        try {
            ControllerHelper.setDefaultValue(hfmdEnum, "hfmdEnumId");
            int result = iHfmdEnumSV.update(hfmdEnum);
            if(result > 0) {
                return ResultData.success(hfmdEnum);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除枚举
    * @param hfmdEnum
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfmdEnum") HfmdEnum hfmdEnum) {
        logger.debug("request : {}", hfmdEnum);

        try {
            ControllerHelper.setDefaultValue(hfmdEnum, "hfmdEnumId");
            int result = iHfmdEnumSV.delete(hfmdEnum);
            if(result > 0) {
                return ResultData.success(hfmdEnum);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfmdEnumSV getIHfmdEnumSV(){
		return iHfmdEnumSV;
	}
	//setter
	public void setIHfmdEnumSV(IHfmdEnumSV iHfmdEnumSV){
    	this.iHfmdEnumSV = iHfmdEnumSV;
    }
}
