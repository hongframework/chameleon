package com.hframe.controller;

import com.hframe.domain.model.HfusEntityAttr;
import com.hframe.domain.model.HfusEntityAttr_Example;
import com.hframe.service.interfaces.IHfusEntityAttrSV;
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
@RequestMapping(value = "/hframe/hfusEntityAttr")
public class HfusEntityAttrController   {
    private static final Logger logger = LoggerFactory.getLogger(HfusEntityAttrController.class);

	@Resource
	private IHfusEntityAttrSV iHfusEntityAttrSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示常用实体属性列表
     * @param hfusEntityAttr
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfusEntityAttr") HfusEntityAttr hfusEntityAttr,
                                      @ModelAttribute("example") HfusEntityAttr_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfusEntityAttr, example, pagination);
        try{
            ExampleUtils.parseExample(hfusEntityAttr, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfusEntityAttr> list = iHfusEntityAttrSV.getHfusEntityAttrListByExample(example);
            pagination.setTotalCount(iHfusEntityAttrSV.getHfusEntityAttrCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示常用实体属性明细
     * @param hfusEntityAttr
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfusEntityAttr") HfusEntityAttr hfusEntityAttr){
        logger.debug("request : {},{}", hfusEntityAttr.getHfusEntityAttrId(), hfusEntityAttr);
        try{
            HfusEntityAttr result = iHfusEntityAttrSV.getHfusEntityAttrByPK(hfusEntityAttr.getHfusEntityAttrId());
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
    * 创建常用实体属性
    * @param hfusEntityAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfusEntityAttr") HfusEntityAttr hfusEntityAttr) {
        logger.debug("request : {}", hfusEntityAttr);
        try {
            ControllerHelper.setDefaultValue(hfusEntityAttr, "hfusEntityAttrId");
            int result = iHfusEntityAttrSV.create(hfusEntityAttr);
            if(result > 0) {
                return ResultData.success(hfusEntityAttr);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护常用实体属性
    * @param hfusEntityAttrs
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfusEntityAttr[] hfusEntityAttrs) {
        logger.debug("request : {}", hfusEntityAttrs);

        try {
            ControllerHelper.setDefaultValue(hfusEntityAttrs, "hfusEntityAttrId");
            ControllerHelper.reorderProperty(hfusEntityAttrs);

            int result = iHfusEntityAttrSV.batchOperate(hfusEntityAttrs);
            if(result > 0) {
                return ResultData.success(hfusEntityAttrs);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新常用实体属性
    * @param hfusEntityAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfusEntityAttr") HfusEntityAttr hfusEntityAttr) {
        logger.debug("request : {}", hfusEntityAttr);
        try {
            ControllerHelper.setDefaultValue(hfusEntityAttr, "hfusEntityAttrId");
            int result = iHfusEntityAttrSV.update(hfusEntityAttr);
            if(result > 0) {
                return ResultData.success(hfusEntityAttr);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除常用实体属性
    * @param hfusEntityAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfusEntityAttr") HfusEntityAttr hfusEntityAttr) {
        logger.debug("request : {}", hfusEntityAttr);

        try {
            ControllerHelper.setDefaultValue(hfusEntityAttr, "hfusEntityAttrId");
            int result = iHfusEntityAttrSV.delete(hfusEntityAttr);
            if(result > 0) {
                return ResultData.success(hfusEntityAttr);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfusEntityAttrSV getIHfusEntityAttrSV(){
		return iHfusEntityAttrSV;
	}
	//setter
	public void setIHfusEntityAttrSV(IHfusEntityAttrSV iHfusEntityAttrSV){
    	this.iHfusEntityAttrSV = iHfusEntityAttrSV;
    }
}
