package com.hframe.controller;

import com.hframe.domain.model.HfmdEntity;
import com.hframe.domain.model.HfmdEntity_Example;
import com.hframe.service.interfaces.IHfmdEntitySV;
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
@RequestMapping(value = "/hframe/hfmdEntity")
public class HfmdEntityController   {
    private static final Logger logger = LoggerFactory.getLogger(HfmdEntityController.class);

	@Resource
	private IHfmdEntitySV iHfmdEntitySV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示实体列表
     * @param hfmdEntity
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfmdEntity") HfmdEntity hfmdEntity,
                                      @ModelAttribute("example") HfmdEntity_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfmdEntity, example, pagination);
        try{
            ExampleUtils.parseExample(hfmdEntity, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfmdEntity> list = iHfmdEntitySV.getHfmdEntityListByExample(example);
            pagination.setTotalCount(iHfmdEntitySV.getHfmdEntityCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示实体明细
     * @param hfmdEntity
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfmdEntity") HfmdEntity hfmdEntity){
        logger.debug("request : {},{}", hfmdEntity.getHfmdEntityId(), hfmdEntity);
        try{
            HfmdEntity result = iHfmdEntitySV.getHfmdEntityByPK(hfmdEntity.getHfmdEntityId());
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
    * 创建实体
    * @param hfmdEntity
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfmdEntity") HfmdEntity hfmdEntity) {
        logger.debug("request : {}", hfmdEntity);
        try {
            ControllerHelper.setDefaultValue(hfmdEntity, "hfmdEntityId");
            int result = iHfmdEntitySV.create(hfmdEntity);
            if(result > 0) {
                return ResultData.success(hfmdEntity);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护实体
    * @param hfmdEntitys
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfmdEntity[] hfmdEntitys) {
        logger.debug("request : {}", hfmdEntitys);

        try {
            ControllerHelper.setDefaultValue(hfmdEntitys, "hfmdEntityId");
            ControllerHelper.reorderProperty(hfmdEntitys);

            int result = iHfmdEntitySV.batchOperate(hfmdEntitys);
            if(result > 0) {
                return ResultData.success(hfmdEntitys);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新实体
    * @param hfmdEntity
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfmdEntity") HfmdEntity hfmdEntity) {
        logger.debug("request : {}", hfmdEntity);
        try {
            ControllerHelper.setDefaultValue(hfmdEntity, "hfmdEntityId");
            int result = iHfmdEntitySV.update(hfmdEntity);
            if(result > 0) {
                return ResultData.success(hfmdEntity);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除实体
    * @param hfmdEntity
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfmdEntity") HfmdEntity hfmdEntity) {
        logger.debug("request : {}", hfmdEntity);

        try {
            ControllerHelper.setDefaultValue(hfmdEntity, "hfmdEntityId");
            int result = iHfmdEntitySV.delete(hfmdEntity);
            if(result > 0) {
                return ResultData.success(hfmdEntity);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfmdEntitySV getIHfmdEntitySV(){
		return iHfmdEntitySV;
	}
	//setter
	public void setIHfmdEntitySV(IHfmdEntitySV iHfmdEntitySV){
    	this.iHfmdEntitySV = iHfmdEntitySV;
    }
}
