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
import com.hframe.domain.model.HfsecUser;
import com.hframe.domain.model.HfsecUser_Example;
import com.hframe.service.interfaces.IHfsecUserSV;

@Controller
@RequestMapping(value = "/hframe/hfsecUser")
public class HfsecUserController   {
    private static final Logger logger = LoggerFactory.getLogger(HfsecUserController.class);

	@Resource
	private IHfsecUserSV iHfsecUserSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示用户列表
     * @param hfsecUser
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfsecUser") HfsecUser hfsecUser,
                                      @ModelAttribute("example") HfsecUser_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfsecUser, example, pagination);
        try{
            ExampleUtils.parseExample(hfsecUser, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfsecUser> list = iHfsecUserSV.getHfsecUserListByExample(example);
            pagination.setTotalCount(iHfsecUserSV.getHfsecUserCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示用户明细
     * @param hfsecUser
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfsecUser") HfsecUser hfsecUser){
        logger.debug("request : {},{}", hfsecUser.getHfsecUserId(), hfsecUser);
        try{
            HfsecUser result = null;
            if(hfsecUser.getHfsecUserId() != null) {
                result = iHfsecUserSV.getHfsecUserByPK(hfsecUser.getHfsecUserId());
            }else {
                HfsecUser_Example example = ExampleUtils.parseExample(hfsecUser, HfsecUser_Example.class);
                List<HfsecUser> list = iHfsecUserSV.getHfsecUserListByExample(example);
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
    * 搜索一个用户
    * @param  hfsecUser
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfsecUser") HfsecUser  hfsecUser){
        logger.debug("request : {}",  hfsecUser);
        try{
            HfsecUser result = null;
            if(hfsecUser.getHfsecUserId() != null) {
                result =  iHfsecUserSV.getHfsecUserByPK(hfsecUser.getHfsecUserId());
            }else {
                HfsecUser_Example example = ExampleUtils.parseExample( hfsecUser, HfsecUser_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfsecUser> list =  iHfsecUserSV.getHfsecUserListByExample(example);
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
    * 创建用户
    * @param hfsecUser
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfsecUser") HfsecUser hfsecUser) {
        logger.debug("request : {}", hfsecUser);
        try {
            ControllerHelper.setDefaultValue(hfsecUser, "hfsecUserId");
            int result = iHfsecUserSV.create(hfsecUser);
            if(result > 0) {
                return ResultData.success(hfsecUser);
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
    * 批量维护用户
    * @param hfsecUsers
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfsecUser[] hfsecUsers) {
        logger.debug("request : {}", hfsecUsers);

        try {
            ControllerHelper.setDefaultValue(hfsecUsers, "hfsecUserId");
            ControllerHelper.reorderProperty(hfsecUsers);

            int result = iHfsecUserSV.batchOperate(hfsecUsers);
            if(result > 0) {
                return ResultData.success(hfsecUsers);
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
    * 更新用户
    * @param hfsecUser
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfsecUser") HfsecUser hfsecUser) {
        logger.debug("request : {}", hfsecUser);
        try {
            ControllerHelper.setDefaultValue(hfsecUser, "hfsecUserId");
            int result = iHfsecUserSV.update(hfsecUser);
            if(result > 0) {
                return ResultData.success(hfsecUser);
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
    * 创建或更新用户
    * @param hfsecUser
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/saveOrUpdateByAjax.json")
    @ResponseBody
    public ResultData saveOrUpdate(@ModelAttribute("hfsecUser") HfsecUser hfsecUser) {
        logger.debug("request : {}", hfsecUser);
        try {
            ControllerHelper.setDefaultValue(hfsecUser, "hfsecUserId");
            int result = iHfsecUserSV.batchOperate(new HfsecUser[]{hfsecUser});
            if(result > 0) {
                return ResultData.success(hfsecUser);
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
    * 删除用户
    * @param hfsecUser
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfsecUser") HfsecUser hfsecUser) {
        logger.debug("request : {}", hfsecUser);

        try {
            ControllerHelper.setDefaultValue(hfsecUser, "hfsecUserId");
            int result = iHfsecUserSV.delete(hfsecUser);
            if(result > 0) {
                return ResultData.success(hfsecUser);
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
 	
	public IHfsecUserSV getIHfsecUserSV(){
		return iHfsecUserSV;
	}
	//setter
	public void setIHfsecUserSV(IHfsecUserSV iHfsecUserSV){
    	this.iHfsecUserSV = iHfsecUserSV;
    }
}
