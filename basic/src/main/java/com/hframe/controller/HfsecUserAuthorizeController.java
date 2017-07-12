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
import com.hframe.domain.model.HfsecUserAuthorize;
import com.hframe.domain.model.HfsecUserAuthorize_Example;
import com.hframe.service.interfaces.IHfsecUserAuthorizeSV;

@Controller
@RequestMapping(value = "/hframe/hfsecUserAuthorize")
public class HfsecUserAuthorizeController   {
    private static final Logger logger = LoggerFactory.getLogger(HfsecUserAuthorizeController.class);

	@Resource
	private IHfsecUserAuthorizeSV iHfsecUserAuthorizeSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示用户授权列表
     * @param hfsecUserAuthorize
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfsecUserAuthorize") HfsecUserAuthorize hfsecUserAuthorize,
                                      @ModelAttribute("example") HfsecUserAuthorize_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfsecUserAuthorize, example, pagination);
        try{
            ExampleUtils.parseExample(hfsecUserAuthorize, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfsecUserAuthorize> list = iHfsecUserAuthorizeSV.getHfsecUserAuthorizeListByExample(example);
            pagination.setTotalCount(iHfsecUserAuthorizeSV.getHfsecUserAuthorizeCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示用户授权明细
     * @param hfsecUserAuthorize
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfsecUserAuthorize") HfsecUserAuthorize hfsecUserAuthorize){
        logger.debug("request : {},{}", hfsecUserAuthorize.getHfsecUserAuthorizeId(), hfsecUserAuthorize);
        try{
            HfsecUserAuthorize result = null;
            if(hfsecUserAuthorize.getHfsecUserAuthorizeId() != null) {
                result = iHfsecUserAuthorizeSV.getHfsecUserAuthorizeByPK(hfsecUserAuthorize.getHfsecUserAuthorizeId());
            }else {
                HfsecUserAuthorize_Example example = ExampleUtils.parseExample(hfsecUserAuthorize, HfsecUserAuthorize_Example.class);
                List<HfsecUserAuthorize> list = iHfsecUserAuthorizeSV.getHfsecUserAuthorizeListByExample(example);
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
    * 搜索一个用户授权
    * @param  hfsecUserAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfsecUserAuthorize") HfsecUserAuthorize  hfsecUserAuthorize){
        logger.debug("request : {}",  hfsecUserAuthorize);
        try{
            HfsecUserAuthorize result = null;
            if(hfsecUserAuthorize.getHfsecUserAuthorizeId() != null) {
                result =  iHfsecUserAuthorizeSV.getHfsecUserAuthorizeByPK(hfsecUserAuthorize.getHfsecUserAuthorizeId());
            }else {
                HfsecUserAuthorize_Example example = ExampleUtils.parseExample( hfsecUserAuthorize, HfsecUserAuthorize_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfsecUserAuthorize> list =  iHfsecUserAuthorizeSV.getHfsecUserAuthorizeListByExample(example);
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
    * 创建用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfsecUserAuthorize") HfsecUserAuthorize hfsecUserAuthorize) {
        logger.debug("request : {}", hfsecUserAuthorize);
        try {
            ControllerHelper.setDefaultValue(hfsecUserAuthorize, "hfsecUserAuthorizeId");
            int result = iHfsecUserAuthorizeSV.create(hfsecUserAuthorize);
            if(result > 0) {
                return ResultData.success(hfsecUserAuthorize);
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
    * 批量维护用户授权
    * @param hfsecUserAuthorizes
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfsecUserAuthorize[] hfsecUserAuthorizes) {
        logger.debug("request : {}", hfsecUserAuthorizes);

        try {
            ControllerHelper.setDefaultValue(hfsecUserAuthorizes, "hfsecUserAuthorizeId");
            ControllerHelper.reorderProperty(hfsecUserAuthorizes);

            int result = iHfsecUserAuthorizeSV.batchOperate(hfsecUserAuthorizes);
            if(result > 0) {
                return ResultData.success(hfsecUserAuthorizes);
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
    * 更新用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfsecUserAuthorize") HfsecUserAuthorize hfsecUserAuthorize) {
        logger.debug("request : {}", hfsecUserAuthorize);
        try {
            ControllerHelper.setDefaultValue(hfsecUserAuthorize, "hfsecUserAuthorizeId");
            int result = iHfsecUserAuthorizeSV.update(hfsecUserAuthorize);
            if(result > 0) {
                return ResultData.success(hfsecUserAuthorize);
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
    * 创建或更新用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/saveOrUpdateByAjax.json")
    @ResponseBody
    public ResultData saveOrUpdate(@ModelAttribute("hfsecUserAuthorize") HfsecUserAuthorize hfsecUserAuthorize) {
        logger.debug("request : {}", hfsecUserAuthorize);
        try {
            ControllerHelper.setDefaultValue(hfsecUserAuthorize, "hfsecUserAuthorizeId");
            int result = iHfsecUserAuthorizeSV.batchOperate(new HfsecUserAuthorize[]{hfsecUserAuthorize});
            if(result > 0) {
                return ResultData.success(hfsecUserAuthorize);
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
    * 删除用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfsecUserAuthorize") HfsecUserAuthorize hfsecUserAuthorize) {
        logger.debug("request : {}", hfsecUserAuthorize);

        try {
            ControllerHelper.setDefaultValue(hfsecUserAuthorize, "hfsecUserAuthorizeId");
            int result = iHfsecUserAuthorizeSV.delete(hfsecUserAuthorize);
            if(result > 0) {
                return ResultData.success(hfsecUserAuthorize);
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
 	
	public IHfsecUserAuthorizeSV getIHfsecUserAuthorizeSV(){
		return iHfsecUserAuthorizeSV;
	}
	//setter
	public void setIHfsecUserAuthorizeSV(IHfsecUserAuthorizeSV iHfsecUserAuthorizeSV){
    	this.iHfsecUserAuthorizeSV = iHfsecUserAuthorizeSV;
    }
}
