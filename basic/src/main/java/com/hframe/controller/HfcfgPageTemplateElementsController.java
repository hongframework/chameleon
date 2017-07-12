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
import com.hframe.domain.model.HfcfgPageTemplateElements;
import com.hframe.domain.model.HfcfgPageTemplateElements_Example;
import com.hframe.service.interfaces.IHfcfgPageTemplateElementsSV;

@Controller
@RequestMapping(value = "/hframe/hfcfgPageTemplateElements")
public class HfcfgPageTemplateElementsController   {
    private static final Logger logger = LoggerFactory.getLogger(HfcfgPageTemplateElementsController.class);

	@Resource
	private IHfcfgPageTemplateElementsSV iHfcfgPageTemplateElementsSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示列表
     * @param hfcfgPageTemplateElements
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfcfgPageTemplateElements") HfcfgPageTemplateElements hfcfgPageTemplateElements,
                                      @ModelAttribute("example") HfcfgPageTemplateElements_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfcfgPageTemplateElements, example, pagination);
        try{
            ExampleUtils.parseExample(hfcfgPageTemplateElements, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfcfgPageTemplateElements> list = iHfcfgPageTemplateElementsSV.getHfcfgPageTemplateElementsListByExample(example);
            pagination.setTotalCount(iHfcfgPageTemplateElementsSV.getHfcfgPageTemplateElementsCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示明细
     * @param hfcfgPageTemplateElements
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfcfgPageTemplateElements") HfcfgPageTemplateElements hfcfgPageTemplateElements){
        logger.debug("request : {},{}", hfcfgPageTemplateElements.getHfcfgPageTemplateElementsId(), hfcfgPageTemplateElements);
        try{
            HfcfgPageTemplateElements result = iHfcfgPageTemplateElementsSV.getHfcfgPageTemplateElementsByPK(hfcfgPageTemplateElements.getHfcfgPageTemplateElementsId());
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
    * 搜索一个
    * @param  hfcfgPageTemplateElements
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfcfgPageTemplateElements") HfcfgPageTemplateElements  hfcfgPageTemplateElements){
        logger.debug("request : {}",  hfcfgPageTemplateElements);
        try{
            HfcfgPageTemplateElements result = null;
            if(hfcfgPageTemplateElements.getHfcfgPageTemplateElementsId() != null) {
                result =  iHfcfgPageTemplateElementsSV.getHfcfgPageTemplateElementsByPK(hfcfgPageTemplateElements.getHfcfgPageTemplateElementsId());
            }else {
                HfcfgPageTemplateElements_Example example = ExampleUtils.parseExample( hfcfgPageTemplateElements, HfcfgPageTemplateElements_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfcfgPageTemplateElements> list =  iHfcfgPageTemplateElementsSV.getHfcfgPageTemplateElementsListByExample(example);
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
    * 创建
    * @param hfcfgPageTemplateElements
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfcfgPageTemplateElements") HfcfgPageTemplateElements hfcfgPageTemplateElements) {
        logger.debug("request : {}", hfcfgPageTemplateElements);
        try {
            ControllerHelper.setDefaultValue(hfcfgPageTemplateElements, "hfcfgPageTemplateElementsId");
            int result = iHfcfgPageTemplateElementsSV.create(hfcfgPageTemplateElements);
            if(result > 0) {
                return ResultData.success(hfcfgPageTemplateElements);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护
    * @param hfcfgPageTemplateElementss
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfcfgPageTemplateElements[] hfcfgPageTemplateElementss) {
        logger.debug("request : {}", hfcfgPageTemplateElementss);

        try {
            ControllerHelper.setDefaultValue(hfcfgPageTemplateElementss, "hfcfgPageTemplateElementsId");
            ControllerHelper.reorderProperty(hfcfgPageTemplateElementss);

            int result = iHfcfgPageTemplateElementsSV.batchOperate(hfcfgPageTemplateElementss);
            if(result > 0) {
                return ResultData.success(hfcfgPageTemplateElementss);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新
    * @param hfcfgPageTemplateElements
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfcfgPageTemplateElements") HfcfgPageTemplateElements hfcfgPageTemplateElements) {
        logger.debug("request : {}", hfcfgPageTemplateElements);
        try {
            ControllerHelper.setDefaultValue(hfcfgPageTemplateElements, "hfcfgPageTemplateElementsId");
            int result = iHfcfgPageTemplateElementsSV.update(hfcfgPageTemplateElements);
            if(result > 0) {
                return ResultData.success(hfcfgPageTemplateElements);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除
    * @param hfcfgPageTemplateElements
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfcfgPageTemplateElements") HfcfgPageTemplateElements hfcfgPageTemplateElements) {
        logger.debug("request : {}", hfcfgPageTemplateElements);

        try {
            ControllerHelper.setDefaultValue(hfcfgPageTemplateElements, "hfcfgPageTemplateElementsId");
            int result = iHfcfgPageTemplateElementsSV.delete(hfcfgPageTemplateElements);
            if(result > 0) {
                return ResultData.success(hfcfgPageTemplateElements);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfcfgPageTemplateElementsSV getIHfcfgPageTemplateElementsSV(){
		return iHfcfgPageTemplateElementsSV;
	}
	//setter
	public void setIHfcfgPageTemplateElementsSV(IHfcfgPageTemplateElementsSV iHfcfgPageTemplateElementsSV){
    	this.iHfcfgPageTemplateElementsSV = iHfcfgPageTemplateElementsSV;
    }
}
