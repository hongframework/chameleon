package com.hframe.controller;

import com.hframe.domain.model.HfpmPageEventAttr;
import com.hframe.domain.model.HfpmPageEventAttr_Example;
import com.hframe.service.interfaces.IHfpmPageEventAttrSV;
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
@RequestMapping(value = "/hframe/hfpmPageEventAttr")
public class HfpmPageEventAttrController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmPageEventAttrController.class);

	@Resource
	private IHfpmPageEventAttrSV iHfpmPageEventAttrSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示事件属性列表
     * @param hfpmPageEventAttr
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmPageEventAttr") HfpmPageEventAttr hfpmPageEventAttr,
                                      @ModelAttribute("example") HfpmPageEventAttr_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmPageEventAttr, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmPageEventAttr, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmPageEventAttr> list = iHfpmPageEventAttrSV.getHfpmPageEventAttrListByExample(example);
            pagination.setTotalCount(iHfpmPageEventAttrSV.getHfpmPageEventAttrCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示事件属性明细
     * @param hfpmPageEventAttr
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmPageEventAttr") HfpmPageEventAttr hfpmPageEventAttr){
        logger.debug("request : {},{}", hfpmPageEventAttr.getHfpmPageEventAttrId(), hfpmPageEventAttr);
        try{
            HfpmPageEventAttr result = iHfpmPageEventAttrSV.getHfpmPageEventAttrByPK(hfpmPageEventAttr.getHfpmPageEventAttrId());
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
    * 创建事件属性
    * @param hfpmPageEventAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmPageEventAttr") HfpmPageEventAttr hfpmPageEventAttr) {
        logger.debug("request : {}", hfpmPageEventAttr);
        try {
            ControllerHelper.setDefaultValue(hfpmPageEventAttr, "hfpmPageEventAttrId");
            int result = iHfpmPageEventAttrSV.create(hfpmPageEventAttr);
            if(result > 0) {
                return ResultData.success(hfpmPageEventAttr);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护事件属性
    * @param hfpmPageEventAttrs
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmPageEventAttr[] hfpmPageEventAttrs) {
        logger.debug("request : {}", hfpmPageEventAttrs);

        try {
            ControllerHelper.setDefaultValue(hfpmPageEventAttrs, "hfpmPageEventAttrId");
            ControllerHelper.reorderProperty(hfpmPageEventAttrs);

            int result = iHfpmPageEventAttrSV.batchOperate(hfpmPageEventAttrs);
            if(result > 0) {
                return ResultData.success(hfpmPageEventAttrs);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新事件属性
    * @param hfpmPageEventAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmPageEventAttr") HfpmPageEventAttr hfpmPageEventAttr) {
        logger.debug("request : {}", hfpmPageEventAttr);
        try {
            ControllerHelper.setDefaultValue(hfpmPageEventAttr, "hfpmPageEventAttrId");
            int result = iHfpmPageEventAttrSV.update(hfpmPageEventAttr);
            if(result > 0) {
                return ResultData.success(hfpmPageEventAttr);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除事件属性
    * @param hfpmPageEventAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmPageEventAttr") HfpmPageEventAttr hfpmPageEventAttr) {
        logger.debug("request : {}", hfpmPageEventAttr);

        try {
            ControllerHelper.setDefaultValue(hfpmPageEventAttr, "hfpmPageEventAttrId");
            int result = iHfpmPageEventAttrSV.delete(hfpmPageEventAttr);
            if(result > 0) {
                return ResultData.success(hfpmPageEventAttr);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmPageEventAttrSV getIHfpmPageEventAttrSV(){
		return iHfpmPageEventAttrSV;
	}
	//setter
	public void setIHfpmPageEventAttrSV(IHfpmPageEventAttrSV iHfpmPageEventAttrSV){
    	this.iHfpmPageEventAttrSV = iHfpmPageEventAttrSV;
    }
}
