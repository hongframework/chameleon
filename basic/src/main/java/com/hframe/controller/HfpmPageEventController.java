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
import com.hframe.domain.model.HfpmPageEvent;
import com.hframe.domain.model.HfpmPageEvent_Example;
import com.hframe.service.interfaces.IHfpmPageEventSV;

@Controller
@RequestMapping(value = "/hframe/hfpmPageEvent")
public class HfpmPageEventController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmPageEventController.class);

	@Resource
	private IHfpmPageEventSV iHfpmPageEventSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示页面事件列表
     * @param hfpmPageEvent
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmPageEvent") HfpmPageEvent hfpmPageEvent,
                                      @ModelAttribute("example") HfpmPageEvent_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmPageEvent, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmPageEvent, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmPageEvent> list = iHfpmPageEventSV.getHfpmPageEventListByExample(example);
            pagination.setTotalCount(iHfpmPageEventSV.getHfpmPageEventCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示页面事件明细
     * @param hfpmPageEvent
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmPageEvent") HfpmPageEvent hfpmPageEvent){
        logger.debug("request : {},{}", hfpmPageEvent.getHfpmPageEventId(), hfpmPageEvent);
        try{
            HfpmPageEvent result = null;
            if(hfpmPageEvent.getHfpmPageEventId() != null) {
                result = iHfpmPageEventSV.getHfpmPageEventByPK(hfpmPageEvent.getHfpmPageEventId());
            }else {
                HfpmPageEvent_Example example = ExampleUtils.parseExample(hfpmPageEvent, HfpmPageEvent_Example.class);
                List<HfpmPageEvent> list = iHfpmPageEventSV.getHfpmPageEventListByExample(example);
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
    * 搜索一个页面事件
    * @param  hfpmPageEvent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfpmPageEvent") HfpmPageEvent  hfpmPageEvent){
        logger.debug("request : {}",  hfpmPageEvent);
        try{
            HfpmPageEvent result = null;
            if(hfpmPageEvent.getHfpmPageEventId() != null) {
                result =  iHfpmPageEventSV.getHfpmPageEventByPK(hfpmPageEvent.getHfpmPageEventId());
            }else {
                HfpmPageEvent_Example example = ExampleUtils.parseExample( hfpmPageEvent, HfpmPageEvent_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfpmPageEvent> list =  iHfpmPageEventSV.getHfpmPageEventListByExample(example);
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
    * 创建页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmPageEvent") HfpmPageEvent hfpmPageEvent) {
        logger.debug("request : {}", hfpmPageEvent);
        try {
            ControllerHelper.setDefaultValue(hfpmPageEvent, "hfpmPageEventId");
            int result = iHfpmPageEventSV.create(hfpmPageEvent);
            if(result > 0) {
                return ResultData.success(hfpmPageEvent);
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
    * 批量维护页面事件
    * @param hfpmPageEvents
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmPageEvent[] hfpmPageEvents) {
        logger.debug("request : {}", hfpmPageEvents);

        try {
            ControllerHelper.setDefaultValue(hfpmPageEvents, "hfpmPageEventId");
            ControllerHelper.reorderProperty(hfpmPageEvents);

            int result = iHfpmPageEventSV.batchOperate(hfpmPageEvents);
            if(result > 0) {
                return ResultData.success(hfpmPageEvents);
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
    * 更新页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmPageEvent") HfpmPageEvent hfpmPageEvent) {
        logger.debug("request : {}", hfpmPageEvent);
        try {
            ControllerHelper.setDefaultValue(hfpmPageEvent, "hfpmPageEventId");
            int result = iHfpmPageEventSV.update(hfpmPageEvent);
            if(result > 0) {
                return ResultData.success(hfpmPageEvent);
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
    * 创建或更新页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/saveOrUpdateByAjax.json")
    @ResponseBody
    public ResultData saveOrUpdate(@ModelAttribute("hfpmPageEvent") HfpmPageEvent hfpmPageEvent) {
        logger.debug("request : {}", hfpmPageEvent);
        try {
            ControllerHelper.setDefaultValue(hfpmPageEvent, "hfpmPageEventId");
            int result = iHfpmPageEventSV.batchOperate(new HfpmPageEvent[]{hfpmPageEvent});
            if(result > 0) {
                return ResultData.success(hfpmPageEvent);
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
    * 删除页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmPageEvent") HfpmPageEvent hfpmPageEvent) {
        logger.debug("request : {}", hfpmPageEvent);

        try {
            ControllerHelper.setDefaultValue(hfpmPageEvent, "hfpmPageEventId");
            int result = iHfpmPageEventSV.delete(hfpmPageEvent);
            if(result > 0) {
                return ResultData.success(hfpmPageEvent);
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
 	
	public IHfpmPageEventSV getIHfpmPageEventSV(){
		return iHfpmPageEventSV;
	}
	//setter
	public void setIHfpmPageEventSV(IHfpmPageEventSV iHfpmPageEventSV){
    	this.iHfpmPageEventSV = iHfpmPageEventSV;
    }
}
