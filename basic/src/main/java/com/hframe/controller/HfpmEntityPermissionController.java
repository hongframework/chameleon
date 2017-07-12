package com.hframe.controller;

import com.hframe.domain.model.HfpmEntityPermission;
import com.hframe.domain.model.HfpmEntityPermission_Example;
import com.hframe.service.interfaces.IHfpmEntityPermissionSV;
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
@RequestMapping(value = "/hframe/hfpmEntityPermission")
public class HfpmEntityPermissionController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmEntityPermissionController.class);

	@Resource
	private IHfpmEntityPermissionSV iHfpmEntityPermissionSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示实体权限列表
     * @param hfpmEntityPermission
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmEntityPermission") HfpmEntityPermission hfpmEntityPermission,
                                      @ModelAttribute("example") HfpmEntityPermission_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmEntityPermission, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmEntityPermission, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmEntityPermission> list = iHfpmEntityPermissionSV.getHfpmEntityPermissionListByExample(example);
            pagination.setTotalCount(iHfpmEntityPermissionSV.getHfpmEntityPermissionCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示实体权限明细
     * @param hfpmEntityPermission
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmEntityPermission") HfpmEntityPermission hfpmEntityPermission){
        logger.debug("request : {},{}", hfpmEntityPermission.getHfpmEntityPermissionId(), hfpmEntityPermission);
        try{
            HfpmEntityPermission result = iHfpmEntityPermissionSV.getHfpmEntityPermissionByPK(hfpmEntityPermission.getHfpmEntityPermissionId());
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
    * 创建实体权限
    * @param hfpmEntityPermission
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmEntityPermission") HfpmEntityPermission hfpmEntityPermission) {
        logger.debug("request : {}", hfpmEntityPermission);
        try {
            ControllerHelper.setDefaultValue(hfpmEntityPermission, "hfpmEntityPermissionId");
            int result = iHfpmEntityPermissionSV.create(hfpmEntityPermission);
            if(result > 0) {
                return ResultData.success(hfpmEntityPermission);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护实体权限
    * @param hfpmEntityPermissions
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmEntityPermission[] hfpmEntityPermissions) {
        logger.debug("request : {}", hfpmEntityPermissions);

        try {
            ControllerHelper.setDefaultValue(hfpmEntityPermissions, "hfpmEntityPermissionId");
            ControllerHelper.reorderProperty(hfpmEntityPermissions);

            int result = iHfpmEntityPermissionSV.batchOperate(hfpmEntityPermissions);
            if(result > 0) {
                return ResultData.success(hfpmEntityPermissions);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新实体权限
    * @param hfpmEntityPermission
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmEntityPermission") HfpmEntityPermission hfpmEntityPermission) {
        logger.debug("request : {}", hfpmEntityPermission);
        try {
            ControllerHelper.setDefaultValue(hfpmEntityPermission, "hfpmEntityPermissionId");
            int result = iHfpmEntityPermissionSV.update(hfpmEntityPermission);
            if(result > 0) {
                return ResultData.success(hfpmEntityPermission);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除实体权限
    * @param hfpmEntityPermission
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmEntityPermission") HfpmEntityPermission hfpmEntityPermission) {
        logger.debug("request : {}", hfpmEntityPermission);

        try {
            ControllerHelper.setDefaultValue(hfpmEntityPermission, "hfpmEntityPermissionId");
            int result = iHfpmEntityPermissionSV.delete(hfpmEntityPermission);
            if(result > 0) {
                return ResultData.success(hfpmEntityPermission);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmEntityPermissionSV getIHfpmEntityPermissionSV(){
		return iHfpmEntityPermissionSV;
	}
	//setter
	public void setIHfpmEntityPermissionSV(IHfpmEntityPermissionSV iHfpmEntityPermissionSV){
    	this.iHfpmEntityPermissionSV = iHfpmEntityPermissionSV;
    }
}
