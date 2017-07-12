package com.hframe.controller;

import com.hframe.domain.model.HfcfgLoginPage;
import com.hframe.domain.model.HfcfgLoginPage_Example;
import com.hframe.service.interfaces.IHfcfgLoginPageSV;
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
@RequestMapping(value = "/hframe/hfcfgLoginPage")
public class HfcfgLoginPageController   {
    private static final Logger logger = LoggerFactory.getLogger(HfcfgLoginPageController.class);

	@Resource
	private IHfcfgLoginPageSV iHfcfgLoginPageSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示登陆页列表
     * @param hfcfgLoginPage
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfcfgLoginPage") HfcfgLoginPage hfcfgLoginPage,
                                      @ModelAttribute("example") HfcfgLoginPage_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfcfgLoginPage, example, pagination);
        try{
            ExampleUtils.parseExample(hfcfgLoginPage, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfcfgLoginPage> list = iHfcfgLoginPageSV.getHfcfgLoginPageListByExample(example);
            pagination.setTotalCount(iHfcfgLoginPageSV.getHfcfgLoginPageCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示登陆页明细
     * @param hfcfgLoginPage
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfcfgLoginPage") HfcfgLoginPage hfcfgLoginPage){
        logger.debug("request : {},{}", hfcfgLoginPage.getHfcfgLoginPageId(), hfcfgLoginPage);
        try{
            HfcfgLoginPage result = iHfcfgLoginPageSV.getHfcfgLoginPageByPK(hfcfgLoginPage.getHfcfgLoginPageId());
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
    * 创建登陆页
    * @param hfcfgLoginPage
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfcfgLoginPage") HfcfgLoginPage hfcfgLoginPage) {
        logger.debug("request : {}", hfcfgLoginPage);
        try {
            ControllerHelper.setDefaultValue(hfcfgLoginPage, "hfcfgLoginPageId");
            int result = iHfcfgLoginPageSV.create(hfcfgLoginPage);
            if(result > 0) {
                return ResultData.success(hfcfgLoginPage);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护登陆页
    * @param hfcfgLoginPages
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfcfgLoginPage[] hfcfgLoginPages) {
        logger.debug("request : {}", hfcfgLoginPages);

        try {
            ControllerHelper.setDefaultValue(hfcfgLoginPages, "hfcfgLoginPageId");
            ControllerHelper.reorderProperty(hfcfgLoginPages);

            int result = iHfcfgLoginPageSV.batchOperate(hfcfgLoginPages);
            if(result > 0) {
                return ResultData.success(hfcfgLoginPages);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新登陆页
    * @param hfcfgLoginPage
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfcfgLoginPage") HfcfgLoginPage hfcfgLoginPage) {
        logger.debug("request : {}", hfcfgLoginPage);
        try {
            ControllerHelper.setDefaultValue(hfcfgLoginPage, "hfcfgLoginPageId");
            int result = iHfcfgLoginPageSV.update(hfcfgLoginPage);
            if(result > 0) {
                return ResultData.success(hfcfgLoginPage);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除登陆页
    * @param hfcfgLoginPage
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfcfgLoginPage") HfcfgLoginPage hfcfgLoginPage) {
        logger.debug("request : {}", hfcfgLoginPage);

        try {
            ControllerHelper.setDefaultValue(hfcfgLoginPage, "hfcfgLoginPageId");
            int result = iHfcfgLoginPageSV.delete(hfcfgLoginPage);
            if(result > 0) {
                return ResultData.success(hfcfgLoginPage);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfcfgLoginPageSV getIHfcfgLoginPageSV(){
		return iHfcfgLoginPageSV;
	}
	//setter
	public void setIHfcfgLoginPageSV(IHfcfgLoginPageSV iHfcfgLoginPageSV){
    	this.iHfcfgLoginPageSV = iHfcfgLoginPageSV;
    }
}
