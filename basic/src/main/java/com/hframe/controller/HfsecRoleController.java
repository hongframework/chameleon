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
import com.hframe.domain.model.HfsecRole;
import com.hframe.domain.model.HfsecRole_Example;
import com.hframe.service.interfaces.IHfsecRoleSV;

@Controller
@RequestMapping(value = "/hframe/hfsecRole")
public class HfsecRoleController   {
    private static final Logger logger = LoggerFactory.getLogger(HfsecRoleController.class);

	@Resource
	private IHfsecRoleSV iHfsecRoleSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示角色列表
     * @param hfsecRole
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfsecRole") HfsecRole hfsecRole,
                                      @ModelAttribute("example") HfsecRole_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfsecRole, example, pagination);
        try{
            ExampleUtils.parseExample(hfsecRole, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfsecRole> list = iHfsecRoleSV.getHfsecRoleListByExample(example);
            pagination.setTotalCount(iHfsecRoleSV.getHfsecRoleCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示角色明细
     * @param hfsecRole
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfsecRole") HfsecRole hfsecRole){
        logger.debug("request : {},{}", hfsecRole.getHfsecRoleId(), hfsecRole);
        try{
            HfsecRole result = null;
            if(hfsecRole.getHfsecRoleId() != null) {
                result = iHfsecRoleSV.getHfsecRoleByPK(hfsecRole.getHfsecRoleId());
            }else {
                HfsecRole_Example example = ExampleUtils.parseExample(hfsecRole, HfsecRole_Example.class);
                List<HfsecRole> list = iHfsecRoleSV.getHfsecRoleListByExample(example);
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
    * 搜索一个角色
    * @param  hfsecRole
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfsecRole") HfsecRole  hfsecRole){
        logger.debug("request : {}",  hfsecRole);
        try{
            HfsecRole result = null;
            if(hfsecRole.getHfsecRoleId() != null) {
                result =  iHfsecRoleSV.getHfsecRoleByPK(hfsecRole.getHfsecRoleId());
            }else {
                HfsecRole_Example example = ExampleUtils.parseExample( hfsecRole, HfsecRole_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfsecRole> list =  iHfsecRoleSV.getHfsecRoleListByExample(example);
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
    * 创建角色
    * @param hfsecRole
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfsecRole") HfsecRole hfsecRole) {
        logger.debug("request : {}", hfsecRole);
        try {
            ControllerHelper.setDefaultValue(hfsecRole, "hfsecRoleId");
            int result = iHfsecRoleSV.create(hfsecRole);
            if(result > 0) {
                return ResultData.success(hfsecRole);
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
    * 批量维护角色
    * @param hfsecRoles
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfsecRole[] hfsecRoles) {
        logger.debug("request : {}", hfsecRoles);

        try {
            ControllerHelper.setDefaultValue(hfsecRoles, "hfsecRoleId");
            ControllerHelper.reorderProperty(hfsecRoles);

            int result = iHfsecRoleSV.batchOperate(hfsecRoles);
            if(result > 0) {
                return ResultData.success(hfsecRoles);
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
    * 更新角色
    * @param hfsecRole
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfsecRole") HfsecRole hfsecRole) {
        logger.debug("request : {}", hfsecRole);
        try {
            ControllerHelper.setDefaultValue(hfsecRole, "hfsecRoleId");
            int result = iHfsecRoleSV.update(hfsecRole);
            if(result > 0) {
                return ResultData.success(hfsecRole);
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
    * 创建或更新角色
    * @param hfsecRole
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/saveOrUpdateByAjax.json")
    @ResponseBody
    public ResultData saveOrUpdate(@ModelAttribute("hfsecRole") HfsecRole hfsecRole) {
        logger.debug("request : {}", hfsecRole);
        try {
            ControllerHelper.setDefaultValue(hfsecRole, "hfsecRoleId");
            int result = iHfsecRoleSV.batchOperate(new HfsecRole[]{hfsecRole});
            if(result > 0) {
                return ResultData.success(hfsecRole);
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
    * 删除角色
    * @param hfsecRole
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfsecRole") HfsecRole hfsecRole) {
        logger.debug("request : {}", hfsecRole);

        try {
            ControllerHelper.setDefaultValue(hfsecRole, "hfsecRoleId");
            int result = iHfsecRoleSV.delete(hfsecRole);
            if(result > 0) {
                return ResultData.success(hfsecRole);
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
 	
	public IHfsecRoleSV getIHfsecRoleSV(){
		return iHfsecRoleSV;
	}
	//setter
	public void setIHfsecRoleSV(IHfsecRoleSV iHfsecRoleSV){
    	this.iHfsecRoleSV = iHfsecRoleSV;
    }
}
