package com.hframe.controller;

import com.hframe.domain.model.HfcfgPageTemplate;
import com.hframe.domain.model.HfcfgPageTemplate_Example;
import com.hframe.service.interfaces.IHfcfgPageTemplateSV;
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
@RequestMapping(value = "/hframe/hfcfgPageTemplate")
public class HfcfgPageTemplateController   {
    private static final Logger logger = LoggerFactory.getLogger(HfcfgPageTemplateController.class);

	@Resource
	private IHfcfgPageTemplateSV iHfcfgPageTemplateSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示页面模板列表
     * @param hfcfgPageTemplate
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfcfgPageTemplate") HfcfgPageTemplate hfcfgPageTemplate,
                                      @ModelAttribute("example") HfcfgPageTemplate_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfcfgPageTemplate, example, pagination);
        try{
            ExampleUtils.parseExample(hfcfgPageTemplate, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfcfgPageTemplate> list = iHfcfgPageTemplateSV.getHfcfgPageTemplateListByExample(example);
            pagination.setTotalCount(iHfcfgPageTemplateSV.getHfcfgPageTemplateCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示页面模板明细
     * @param hfcfgPageTemplate
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfcfgPageTemplate") HfcfgPageTemplate hfcfgPageTemplate){
        logger.debug("request : {},{}", hfcfgPageTemplate.getHfcfgPageTemplateId(), hfcfgPageTemplate);
        try{
            HfcfgPageTemplate result = iHfcfgPageTemplateSV.getHfcfgPageTemplateByPK(hfcfgPageTemplate.getHfcfgPageTemplateId());
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
    * 创建页面模板
    * @param hfcfgPageTemplate
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfcfgPageTemplate") HfcfgPageTemplate hfcfgPageTemplate) {
        logger.debug("request : {}", hfcfgPageTemplate);
        try {
            ControllerHelper.setDefaultValue(hfcfgPageTemplate, "hfcfgPageTemplateId");
            int result = iHfcfgPageTemplateSV.create(hfcfgPageTemplate);
            if(result > 0) {
                return ResultData.success(hfcfgPageTemplate);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护页面模板
    * @param hfcfgPageTemplates
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfcfgPageTemplate[] hfcfgPageTemplates) {
        logger.debug("request : {}", hfcfgPageTemplates);

        try {
            ControllerHelper.setDefaultValue(hfcfgPageTemplates, "hfcfgPageTemplateId");
            ControllerHelper.reorderProperty(hfcfgPageTemplates);

            int result = iHfcfgPageTemplateSV.batchOperate(hfcfgPageTemplates);
            if(result > 0) {
                return ResultData.success(hfcfgPageTemplates);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新页面模板
    * @param hfcfgPageTemplate
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfcfgPageTemplate") HfcfgPageTemplate hfcfgPageTemplate) {
        logger.debug("request : {}", hfcfgPageTemplate);
        try {
            ControllerHelper.setDefaultValue(hfcfgPageTemplate, "hfcfgPageTemplateId");
            int result = iHfcfgPageTemplateSV.update(hfcfgPageTemplate);
            if(result > 0) {
                return ResultData.success(hfcfgPageTemplate);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除页面模板
    * @param hfcfgPageTemplate
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfcfgPageTemplate") HfcfgPageTemplate hfcfgPageTemplate) {
        logger.debug("request : {}", hfcfgPageTemplate);

        try {
            ControllerHelper.setDefaultValue(hfcfgPageTemplate, "hfcfgPageTemplateId");
            int result = iHfcfgPageTemplateSV.delete(hfcfgPageTemplate);
            if(result > 0) {
                return ResultData.success(hfcfgPageTemplate);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfcfgPageTemplateSV getIHfcfgPageTemplateSV(){
		return iHfcfgPageTemplateSV;
	}
	//setter
	public void setIHfcfgPageTemplateSV(IHfcfgPageTemplateSV iHfcfgPageTemplateSV){
    	this.iHfcfgPageTemplateSV = iHfcfgPageTemplateSV;
    }
}
