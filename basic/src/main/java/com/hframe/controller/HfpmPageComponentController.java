package com.hframe.controller;

import com.hframework.beans.controller.Pagination;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.util.ExampleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.ServletRequestDataBinder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import com.hframework.web.ControllerHelper;
import com.hframe.domain.model.HfpmPageComponent;
import com.hframe.domain.model.HfpmPageComponent_Example;
import com.hframe.service.interfaces.IHfpmPageComponentSV;

@Controller
@RequestMapping(value = "/hframe/hfpmPageComponent")
public class HfpmPageComponentController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmPageComponentController.class);

	@Resource
	private IHfpmPageComponentSV iHfpmPageComponentSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示椤甸潰缁勪欢列表
     * @param hfpmPageComponent
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmPageComponent") HfpmPageComponent hfpmPageComponent,
                                      @ModelAttribute("example") HfpmPageComponent_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmPageComponent, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmPageComponent, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmPageComponent> list = iHfpmPageComponentSV.getHfpmPageComponentListByExample(example);
            pagination.setTotalCount(iHfpmPageComponentSV.getHfpmPageComponentCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示椤甸潰缁勪欢明细
     * @param hfpmPageComponent
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmPageComponent") HfpmPageComponent hfpmPageComponent){
        logger.debug("request : {},{}", hfpmPageComponent.getHfpmPageComponentId(), hfpmPageComponent);
        try{
            HfpmPageComponent result = iHfpmPageComponentSV.getHfpmPageComponentByPK(hfpmPageComponent.getHfpmPageComponentId());
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
    * 搜索一个椤甸潰缁勪欢
    * @param  hfpmPageComponent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfpmPageComponent") HfpmPageComponent  hfpmPageComponent){
        logger.debug("request : {}",  hfpmPageComponent);
        try{
            HfpmPageComponent result = null;
            if(hfpmPageComponent.getHfpmPageComponentId() != null) {
                result =  iHfpmPageComponentSV.getHfpmPageComponentByPK(hfpmPageComponent.getHfpmPageComponentId());
            }else {
                HfpmPageComponent_Example example = ExampleUtils.parseExample( hfpmPageComponent, HfpmPageComponent_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfpmPageComponent> list =  iHfpmPageComponentSV.getHfpmPageComponentListByExample(example);
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
    * 创建椤甸潰缁勪欢
    * @param hfpmPageComponent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmPageComponent") HfpmPageComponent hfpmPageComponent) {
        logger.debug("request : {}", hfpmPageComponent);
        try {
            ControllerHelper.setDefaultValue(hfpmPageComponent, "hfpmPageComponentId");
            int result = iHfpmPageComponentSV.create(hfpmPageComponent);
            if(result > 0) {
                return ResultData.success(hfpmPageComponent);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护椤甸潰缁勪欢
    * @param hfpmPageComponents
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmPageComponent[] hfpmPageComponents) {
        logger.debug("request : {}", hfpmPageComponents);

        try {
            ControllerHelper.setDefaultValue(hfpmPageComponents, "hfpmPageComponentId");
            ControllerHelper.reorderProperty(hfpmPageComponents);

            int result = iHfpmPageComponentSV.batchOperate(hfpmPageComponents);
            if(result > 0) {
                return ResultData.success(hfpmPageComponents);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新椤甸潰缁勪欢
    * @param hfpmPageComponent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmPageComponent") HfpmPageComponent hfpmPageComponent) {
        logger.debug("request : {}", hfpmPageComponent);
        try {
            ControllerHelper.setDefaultValue(hfpmPageComponent, "hfpmPageComponentId");
            int result = iHfpmPageComponentSV.update(hfpmPageComponent);
            if(result > 0) {
                return ResultData.success(hfpmPageComponent);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除椤甸潰缁勪欢
    * @param hfpmPageComponent
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmPageComponent") HfpmPageComponent hfpmPageComponent) {
        logger.debug("request : {}", hfpmPageComponent);

        try {
            ControllerHelper.setDefaultValue(hfpmPageComponent, "hfpmPageComponentId");
            int result = iHfpmPageComponentSV.delete(hfpmPageComponent);
            if(result > 0) {
                return ResultData.success(hfpmPageComponent);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmPageComponentSV getIHfpmPageComponentSV(){
		return iHfpmPageComponentSV;
	}
	//setter
	public void setIHfpmPageComponentSV(IHfpmPageComponentSV iHfpmPageComponentSV){
    	this.iHfpmPageComponentSV = iHfpmPageComponentSV;
    }
}
