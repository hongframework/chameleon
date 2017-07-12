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
import com.hframe.domain.model.HfcfgComponentTemplate;
import com.hframe.domain.model.HfcfgComponentTemplate_Example;
import com.hframe.service.interfaces.IHfcfgComponentTemplateSV;

@Controller
@RequestMapping(value = "/hframe/hfcfgComponentTemplate")
public class HfcfgComponentTemplateController   {
    private static final Logger logger = LoggerFactory.getLogger(HfcfgComponentTemplateController.class);

	@Resource
	private IHfcfgComponentTemplateSV iHfcfgComponentTemplateSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示列表
     * @param hfcfgComponentTemplate
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfcfgComponentTemplate") HfcfgComponentTemplate hfcfgComponentTemplate,
                                      @ModelAttribute("example") HfcfgComponentTemplate_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfcfgComponentTemplate, example, pagination);
        try{
            ExampleUtils.parseExample(hfcfgComponentTemplate, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfcfgComponentTemplate> list = iHfcfgComponentTemplateSV.getHfcfgComponentTemplateListByExample(example);
            pagination.setTotalCount(iHfcfgComponentTemplateSV.getHfcfgComponentTemplateCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示明细
     * @param hfcfgComponentTemplate
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfcfgComponentTemplate") HfcfgComponentTemplate hfcfgComponentTemplate){
        logger.debug("request : {},{}", hfcfgComponentTemplate.getHfcfgComponentTemplateId(), hfcfgComponentTemplate);
        try{
            HfcfgComponentTemplate result = iHfcfgComponentTemplateSV.getHfcfgComponentTemplateByPK(hfcfgComponentTemplate.getHfcfgComponentTemplateId());
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
    * @param  hfcfgComponentTemplate
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfcfgComponentTemplate") HfcfgComponentTemplate  hfcfgComponentTemplate){
        logger.debug("request : {}",  hfcfgComponentTemplate);
        try{
            HfcfgComponentTemplate result = null;
            if(hfcfgComponentTemplate.getHfcfgComponentTemplateId() != null) {
                result =  iHfcfgComponentTemplateSV.getHfcfgComponentTemplateByPK(hfcfgComponentTemplate.getHfcfgComponentTemplateId());
            }else {
                HfcfgComponentTemplate_Example example = ExampleUtils.parseExample( hfcfgComponentTemplate, HfcfgComponentTemplate_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfcfgComponentTemplate> list =  iHfcfgComponentTemplateSV.getHfcfgComponentTemplateListByExample(example);
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
    * @param hfcfgComponentTemplate
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfcfgComponentTemplate") HfcfgComponentTemplate hfcfgComponentTemplate) {
        logger.debug("request : {}", hfcfgComponentTemplate);
        try {
            ControllerHelper.setDefaultValue(hfcfgComponentTemplate, "hfcfgComponentTemplateId");
            int result = iHfcfgComponentTemplateSV.create(hfcfgComponentTemplate);
            if(result > 0) {
                return ResultData.success(hfcfgComponentTemplate);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护
    * @param hfcfgComponentTemplates
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfcfgComponentTemplate[] hfcfgComponentTemplates) {
        logger.debug("request : {}", hfcfgComponentTemplates);

        try {
            ControllerHelper.setDefaultValue(hfcfgComponentTemplates, "hfcfgComponentTemplateId");
            ControllerHelper.reorderProperty(hfcfgComponentTemplates);

            int result = iHfcfgComponentTemplateSV.batchOperate(hfcfgComponentTemplates);
            if(result > 0) {
                return ResultData.success(hfcfgComponentTemplates);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新
    * @param hfcfgComponentTemplate
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfcfgComponentTemplate") HfcfgComponentTemplate hfcfgComponentTemplate) {
        logger.debug("request : {}", hfcfgComponentTemplate);
        try {
            ControllerHelper.setDefaultValue(hfcfgComponentTemplate, "hfcfgComponentTemplateId");
            int result = iHfcfgComponentTemplateSV.update(hfcfgComponentTemplate);
            if(result > 0) {
                return ResultData.success(hfcfgComponentTemplate);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除
    * @param hfcfgComponentTemplate
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfcfgComponentTemplate") HfcfgComponentTemplate hfcfgComponentTemplate) {
        logger.debug("request : {}", hfcfgComponentTemplate);

        try {
            ControllerHelper.setDefaultValue(hfcfgComponentTemplate, "hfcfgComponentTemplateId");
            int result = iHfcfgComponentTemplateSV.delete(hfcfgComponentTemplate);
            if(result > 0) {
                return ResultData.success(hfcfgComponentTemplate);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfcfgComponentTemplateSV getIHfcfgComponentTemplateSV(){
		return iHfcfgComponentTemplateSV;
	}
	//setter
	public void setIHfcfgComponentTemplateSV(IHfcfgComponentTemplateSV iHfcfgComponentTemplateSV){
    	this.iHfcfgComponentTemplateSV = iHfcfgComponentTemplateSV;
    }
}
