package com.hframe.controller;

import com.hframe.domain.model.HfusPageEvent;
import com.hframe.domain.model.HfusPageEvent_Example;
import com.hframe.service.interfaces.IHfusPageEventSV;
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
@RequestMapping(value = "/hframe/hfusPageEvent")
public class HfusPageEventController   {
    private static final Logger logger = LoggerFactory.getLogger(HfusPageEventController.class);

	@Resource
	private IHfusPageEventSV iHfusPageEventSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示常用页面事件列表
     * @param hfusPageEvent
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfusPageEvent") HfusPageEvent hfusPageEvent,
                                      @ModelAttribute("example") HfusPageEvent_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfusPageEvent, example, pagination);
        try{
            ExampleUtils.parseExample(hfusPageEvent, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfusPageEvent> list = iHfusPageEventSV.getHfusPageEventListByExample(example);
            pagination.setTotalCount(iHfusPageEventSV.getHfusPageEventCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示常用页面事件明细
     * @param hfusPageEvent
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfusPageEvent") HfusPageEvent hfusPageEvent){
        logger.debug("request : {},{}", hfusPageEvent.getHfusPageEventId(), hfusPageEvent);
        try{
            HfusPageEvent result = iHfusPageEventSV.getHfusPageEventByPK(hfusPageEvent.getHfusPageEventId());
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
    * 创建常用页面事件
    * @param hfusPageEvent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfusPageEvent") HfusPageEvent hfusPageEvent) {
        logger.debug("request : {}", hfusPageEvent);
        try {
            ControllerHelper.setDefaultValue(hfusPageEvent, "hfusPageEventId");
            int result = iHfusPageEventSV.create(hfusPageEvent);
            if(result > 0) {
                return ResultData.success(hfusPageEvent);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护常用页面事件
    * @param hfusPageEvents
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfusPageEvent[] hfusPageEvents) {
        logger.debug("request : {}", hfusPageEvents);

        try {
            ControllerHelper.setDefaultValue(hfusPageEvents, "hfusPageEventId");
            ControllerHelper.reorderProperty(hfusPageEvents);

            int result = iHfusPageEventSV.batchOperate(hfusPageEvents);
            if(result > 0) {
                return ResultData.success(hfusPageEvents);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新常用页面事件
    * @param hfusPageEvent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfusPageEvent") HfusPageEvent hfusPageEvent) {
        logger.debug("request : {}", hfusPageEvent);
        try {
            ControllerHelper.setDefaultValue(hfusPageEvent, "hfusPageEventId");
            int result = iHfusPageEventSV.update(hfusPageEvent);
            if(result > 0) {
                return ResultData.success(hfusPageEvent);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除常用页面事件
    * @param hfusPageEvent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfusPageEvent") HfusPageEvent hfusPageEvent) {
        logger.debug("request : {}", hfusPageEvent);

        try {
            ControllerHelper.setDefaultValue(hfusPageEvent, "hfusPageEventId");
            int result = iHfusPageEventSV.delete(hfusPageEvent);
            if(result > 0) {
                return ResultData.success(hfusPageEvent);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfusPageEventSV getIHfusPageEventSV(){
		return iHfusPageEventSV;
	}
	//setter
	public void setIHfusPageEventSV(IHfusPageEventSV iHfusPageEventSV){
    	this.iHfusPageEventSV = iHfusPageEventSV;
    }
}
