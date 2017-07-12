package com.hframe.controller;

import com.hframe.domain.model.HfpmFieldShowType;
import com.hframe.domain.model.HfpmFieldShowType_Example;
import com.hframe.service.interfaces.IHfpmFieldShowTypeSV;
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
@RequestMapping(value = "/hframe/hfpmFieldShowType")
public class HfpmFieldShowTypeController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmFieldShowTypeController.class);

	@Resource
	private IHfpmFieldShowTypeSV iHfpmFieldShowTypeSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示列展示类型列表
     * @param hfpmFieldShowType
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmFieldShowType") HfpmFieldShowType hfpmFieldShowType,
                                      @ModelAttribute("example") HfpmFieldShowType_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmFieldShowType, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmFieldShowType, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmFieldShowType> list = iHfpmFieldShowTypeSV.getHfpmFieldShowTypeListByExample(example);
            pagination.setTotalCount(iHfpmFieldShowTypeSV.getHfpmFieldShowTypeCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示列展示类型明细
     * @param hfpmFieldShowType
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmFieldShowType") HfpmFieldShowType hfpmFieldShowType){
        logger.debug("request : {},{}", hfpmFieldShowType.getHfpmFieldShowTypeId(), hfpmFieldShowType);
        try{
            HfpmFieldShowType result = iHfpmFieldShowTypeSV.getHfpmFieldShowTypeByPK(hfpmFieldShowType.getHfpmFieldShowTypeId());
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
    * 创建列展示类型
    * @param hfpmFieldShowType
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmFieldShowType") HfpmFieldShowType hfpmFieldShowType) {
        logger.debug("request : {}", hfpmFieldShowType);
        try {
            ControllerHelper.setDefaultValue(hfpmFieldShowType, "hfpmFieldShowTypeId");
            int result = iHfpmFieldShowTypeSV.create(hfpmFieldShowType);
            if(result > 0) {
                return ResultData.success(hfpmFieldShowType);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护列展示类型
    * @param hfpmFieldShowTypes
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmFieldShowType[] hfpmFieldShowTypes) {
        logger.debug("request : {}", hfpmFieldShowTypes);

        try {
            ControllerHelper.setDefaultValue(hfpmFieldShowTypes, "hfpmFieldShowTypeId");
            ControllerHelper.reorderProperty(hfpmFieldShowTypes);

            int result = iHfpmFieldShowTypeSV.batchOperate(hfpmFieldShowTypes);
            if(result > 0) {
                return ResultData.success(hfpmFieldShowTypes);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新列展示类型
    * @param hfpmFieldShowType
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmFieldShowType") HfpmFieldShowType hfpmFieldShowType) {
        logger.debug("request : {}", hfpmFieldShowType);
        try {
            ControllerHelper.setDefaultValue(hfpmFieldShowType, "hfpmFieldShowTypeId");
            int result = iHfpmFieldShowTypeSV.update(hfpmFieldShowType);
            if(result > 0) {
                return ResultData.success(hfpmFieldShowType);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除列展示类型
    * @param hfpmFieldShowType
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmFieldShowType") HfpmFieldShowType hfpmFieldShowType) {
        logger.debug("request : {}", hfpmFieldShowType);

        try {
            ControllerHelper.setDefaultValue(hfpmFieldShowType, "hfpmFieldShowTypeId");
            int result = iHfpmFieldShowTypeSV.delete(hfpmFieldShowType);
            if(result > 0) {
                return ResultData.success(hfpmFieldShowType);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmFieldShowTypeSV getIHfpmFieldShowTypeSV(){
		return iHfpmFieldShowTypeSV;
	}
	//setter
	public void setIHfpmFieldShowTypeSV(IHfpmFieldShowTypeSV iHfpmFieldShowTypeSV){
    	this.iHfpmFieldShowTypeSV = iHfpmFieldShowTypeSV;
    }
}
