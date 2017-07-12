package com.hframe.controller;

import com.hframe.domain.model.HfmdEntityAttr;
import com.hframe.domain.model.HfmdEntityAttr_Example;
import com.hframe.service.interfaces.IHfmdEntityAttrSV;
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
@RequestMapping(value = "/hframe/hfmdEntityAttr")
public class HfmdEntityAttrController   {
    private static final Logger logger = LoggerFactory.getLogger(HfmdEntityAttrController.class);

	@Resource
	private IHfmdEntityAttrSV iHfmdEntityAttrSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示实体属性列表
     * @param hfmdEntityAttr
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfmdEntityAttr") HfmdEntityAttr hfmdEntityAttr,
                                      @ModelAttribute("example") HfmdEntityAttr_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfmdEntityAttr, example, pagination);
        try{
            ExampleUtils.parseExample(hfmdEntityAttr, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfmdEntityAttr> list = iHfmdEntityAttrSV.getHfmdEntityAttrListByExample(example);
            pagination.setTotalCount(iHfmdEntityAttrSV.getHfmdEntityAttrCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示实体属性明细
     * @param hfmdEntityAttr
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfmdEntityAttr") HfmdEntityAttr hfmdEntityAttr){
        logger.debug("request : {},{}", hfmdEntityAttr.getHfmdEntityAttrId(), hfmdEntityAttr);
        try{
            HfmdEntityAttr result = iHfmdEntityAttrSV.getHfmdEntityAttrByPK(hfmdEntityAttr.getHfmdEntityAttrId());
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
    * 创建实体属性
    * @param hfmdEntityAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfmdEntityAttr") HfmdEntityAttr hfmdEntityAttr) {
        logger.debug("request : {}", hfmdEntityAttr);
        try {
            ControllerHelper.setDefaultValue(hfmdEntityAttr, "hfmdEntityAttrId");
            int result = iHfmdEntityAttrSV.create(hfmdEntityAttr);
            if(result > 0) {
                return ResultData.success(hfmdEntityAttr);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护实体属性
    * @param hfmdEntityAttrs
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfmdEntityAttr[] hfmdEntityAttrs) {
        logger.debug("request : {}", hfmdEntityAttrs);

        try {
            ControllerHelper.setDefaultValue(hfmdEntityAttrs, "hfmdEntityAttrId");
            ControllerHelper.reorderProperty(hfmdEntityAttrs);

            int result = iHfmdEntityAttrSV.batchOperate(hfmdEntityAttrs);
            if(result > 0) {
                return ResultData.success(hfmdEntityAttrs);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新实体属性
    * @param hfmdEntityAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfmdEntityAttr") HfmdEntityAttr hfmdEntityAttr) {
        logger.debug("request : {}", hfmdEntityAttr);
        try {
            ControllerHelper.setDefaultValue(hfmdEntityAttr, "hfmdEntityAttrId");
            int result = iHfmdEntityAttrSV.update(hfmdEntityAttr);
            if(result > 0) {
                return ResultData.success(hfmdEntityAttr);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除实体属性
    * @param hfmdEntityAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfmdEntityAttr") HfmdEntityAttr hfmdEntityAttr) {
        logger.debug("request : {}", hfmdEntityAttr);

        try {
            ControllerHelper.setDefaultValue(hfmdEntityAttr, "hfmdEntityAttrId");
            int result = iHfmdEntityAttrSV.delete(hfmdEntityAttr);
            if(result > 0) {
                return ResultData.success(hfmdEntityAttr);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfmdEntityAttrSV getIHfmdEntityAttrSV(){
		return iHfmdEntityAttrSV;
	}
	//setter
	public void setIHfmdEntityAttrSV(IHfmdEntityAttrSV iHfmdEntityAttrSV){
    	this.iHfmdEntityAttrSV = iHfmdEntityAttrSV;
    }
}
