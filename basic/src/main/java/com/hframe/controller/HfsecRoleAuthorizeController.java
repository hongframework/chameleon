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
import com.hframe.domain.model.HfsecRoleAuthorize;
import com.hframe.domain.model.HfsecRoleAuthorize_Example;
import com.hframe.service.interfaces.IHfsecRoleAuthorizeSV;

@Controller
@RequestMapping(value = "/hframe/hfsecRoleAuthorize")
public class HfsecRoleAuthorizeController   {
    private static final Logger logger = LoggerFactory.getLogger(HfsecRoleAuthorizeController.class);

	@Resource
	private IHfsecRoleAuthorizeSV iHfsecRoleAuthorizeSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示角色授权列表
     * @param hfsecRoleAuthorize
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfsecRoleAuthorize") HfsecRoleAuthorize hfsecRoleAuthorize,
                                      @ModelAttribute("example") HfsecRoleAuthorize_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfsecRoleAuthorize, example, pagination);
        try{
            ExampleUtils.parseExample(hfsecRoleAuthorize, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfsecRoleAuthorize> list = iHfsecRoleAuthorizeSV.getHfsecRoleAuthorizeListByExample(example);
            pagination.setTotalCount(iHfsecRoleAuthorizeSV.getHfsecRoleAuthorizeCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示角色授权明细
     * @param hfsecRoleAuthorize
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfsecRoleAuthorize") HfsecRoleAuthorize hfsecRoleAuthorize){
        logger.debug("request : {},{}", hfsecRoleAuthorize.getHfsecRoleAuthorizeId(), hfsecRoleAuthorize);
        try{
            HfsecRoleAuthorize result = null;
            if(hfsecRoleAuthorize.getHfsecRoleAuthorizeId() != null) {
                result = iHfsecRoleAuthorizeSV.getHfsecRoleAuthorizeByPK(hfsecRoleAuthorize.getHfsecRoleAuthorizeId());
            }else {
                HfsecRoleAuthorize_Example example = ExampleUtils.parseExample(hfsecRoleAuthorize, HfsecRoleAuthorize_Example.class);
                List<HfsecRoleAuthorize> list = iHfsecRoleAuthorizeSV.getHfsecRoleAuthorizeListByExample(example);
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
    * 搜索一个角色授权
    * @param  hfsecRoleAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfsecRoleAuthorize") HfsecRoleAuthorize  hfsecRoleAuthorize){
        logger.debug("request : {}",  hfsecRoleAuthorize);
        try{
            HfsecRoleAuthorize result = null;
            if(hfsecRoleAuthorize.getHfsecRoleAuthorizeId() != null) {
                result =  iHfsecRoleAuthorizeSV.getHfsecRoleAuthorizeByPK(hfsecRoleAuthorize.getHfsecRoleAuthorizeId());
            }else {
                HfsecRoleAuthorize_Example example = ExampleUtils.parseExample( hfsecRoleAuthorize, HfsecRoleAuthorize_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfsecRoleAuthorize> list =  iHfsecRoleAuthorizeSV.getHfsecRoleAuthorizeListByExample(example);
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
    * 创建角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfsecRoleAuthorize") HfsecRoleAuthorize hfsecRoleAuthorize) {
        logger.debug("request : {}", hfsecRoleAuthorize);
        try {
            ControllerHelper.setDefaultValue(hfsecRoleAuthorize, "hfsecRoleAuthorizeId");
            int result = iHfsecRoleAuthorizeSV.create(hfsecRoleAuthorize);
            if(result > 0) {
                return ResultData.success(hfsecRoleAuthorize);
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
    * 批量维护角色授权
    * @param hfsecRoleAuthorizes
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfsecRoleAuthorize[] hfsecRoleAuthorizes) {
        logger.debug("request : {}", hfsecRoleAuthorizes);

        try {
            ControllerHelper.setDefaultValue(hfsecRoleAuthorizes, "hfsecRoleAuthorizeId");
            ControllerHelper.reorderProperty(hfsecRoleAuthorizes);

            int result = iHfsecRoleAuthorizeSV.batchOperate(hfsecRoleAuthorizes);
            if(result > 0) {
                return ResultData.success(hfsecRoleAuthorizes);
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
    * 更新角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfsecRoleAuthorize") HfsecRoleAuthorize hfsecRoleAuthorize) {
        logger.debug("request : {}", hfsecRoleAuthorize);
        try {
            ControllerHelper.setDefaultValue(hfsecRoleAuthorize, "hfsecRoleAuthorizeId");
            int result = iHfsecRoleAuthorizeSV.update(hfsecRoleAuthorize);
            if(result > 0) {
                return ResultData.success(hfsecRoleAuthorize);
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
    * 创建或更新角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/saveOrUpdateByAjax.json")
    @ResponseBody
    public ResultData saveOrUpdate(@ModelAttribute("hfsecRoleAuthorize") HfsecRoleAuthorize hfsecRoleAuthorize) {
        logger.debug("request : {}", hfsecRoleAuthorize);
        try {
            ControllerHelper.setDefaultValue(hfsecRoleAuthorize, "hfsecRoleAuthorizeId");
            int result = iHfsecRoleAuthorizeSV.batchOperate(new HfsecRoleAuthorize[]{hfsecRoleAuthorize});
            if(result > 0) {
                return ResultData.success(hfsecRoleAuthorize);
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
    * 删除角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfsecRoleAuthorize") HfsecRoleAuthorize hfsecRoleAuthorize) {
        logger.debug("request : {}", hfsecRoleAuthorize);

        try {
            ControllerHelper.setDefaultValue(hfsecRoleAuthorize, "hfsecRoleAuthorizeId");
            int result = iHfsecRoleAuthorizeSV.delete(hfsecRoleAuthorize);
            if(result > 0) {
                return ResultData.success(hfsecRoleAuthorize);
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
 	
	public IHfsecRoleAuthorizeSV getIHfsecRoleAuthorizeSV(){
		return iHfsecRoleAuthorizeSV;
	}
	//setter
	public void setIHfsecRoleAuthorizeSV(IHfsecRoleAuthorizeSV iHfsecRoleAuthorizeSV){
    	this.iHfsecRoleAuthorizeSV = iHfsecRoleAuthorizeSV;
    }
}
