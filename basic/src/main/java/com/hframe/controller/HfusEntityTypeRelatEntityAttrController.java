package com.hframe.controller;

import com.hframe.domain.model.HfusEntityTypeRelatEntityAttr;
import com.hframe.domain.model.HfusEntityTypeRelatEntityAttr_Example;
import com.hframe.service.interfaces.IHfusEntityTypeRelatEntityAttrSV;
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
@RequestMapping(value = "/hframe/hfusEntityTypeRelatEntityAttr")
public class HfusEntityTypeRelatEntityAttrController   {
    private static final Logger logger = LoggerFactory.getLogger(HfusEntityTypeRelatEntityAttrController.class);

	@Resource
	private IHfusEntityTypeRelatEntityAttrSV iHfusEntityTypeRelatEntityAttrSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示常用实体类型关联属性列表
     * @param hfusEntityTypeRelatEntityAttr
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfusEntityTypeRelatEntityAttr") HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr,
                                      @ModelAttribute("example") HfusEntityTypeRelatEntityAttr_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfusEntityTypeRelatEntityAttr, example, pagination);
        try{
            ExampleUtils.parseExample(hfusEntityTypeRelatEntityAttr, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfusEntityTypeRelatEntityAttr> list = iHfusEntityTypeRelatEntityAttrSV.getHfusEntityTypeRelatEntityAttrListByExample(example);
            pagination.setTotalCount(iHfusEntityTypeRelatEntityAttrSV.getHfusEntityTypeRelatEntityAttrCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示常用实体类型关联属性明细
     * @param hfusEntityTypeRelatEntityAttr
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfusEntityTypeRelatEntityAttr") HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr){
        logger.debug("request : {},{}", hfusEntityTypeRelatEntityAttr.getHfusEntityTypeRelatEntityAttrId(), hfusEntityTypeRelatEntityAttr);
        try{
            HfusEntityTypeRelatEntityAttr result = iHfusEntityTypeRelatEntityAttrSV.getHfusEntityTypeRelatEntityAttrByPK(hfusEntityTypeRelatEntityAttr.getHfusEntityTypeRelatEntityAttrId());
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
    * 创建常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfusEntityTypeRelatEntityAttr") HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr) {
        logger.debug("request : {}", hfusEntityTypeRelatEntityAttr);
        try {
            ControllerHelper.setDefaultValue(hfusEntityTypeRelatEntityAttr, "hfusEntityTypeRelatEntityAttrId");
            int result = iHfusEntityTypeRelatEntityAttrSV.create(hfusEntityTypeRelatEntityAttr);
            if(result > 0) {
                return ResultData.success(hfusEntityTypeRelatEntityAttr);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttrs
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfusEntityTypeRelatEntityAttr[] hfusEntityTypeRelatEntityAttrs) {
        logger.debug("request : {}", hfusEntityTypeRelatEntityAttrs);

        try {
            ControllerHelper.setDefaultValue(hfusEntityTypeRelatEntityAttrs, "hfusEntityTypeRelatEntityAttrId");
            ControllerHelper.reorderProperty(hfusEntityTypeRelatEntityAttrs);

            int result = iHfusEntityTypeRelatEntityAttrSV.batchOperate(hfusEntityTypeRelatEntityAttrs);
            if(result > 0) {
                return ResultData.success(hfusEntityTypeRelatEntityAttrs);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfusEntityTypeRelatEntityAttr") HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr) {
        logger.debug("request : {}", hfusEntityTypeRelatEntityAttr);
        try {
            ControllerHelper.setDefaultValue(hfusEntityTypeRelatEntityAttr, "hfusEntityTypeRelatEntityAttrId");
            int result = iHfusEntityTypeRelatEntityAttrSV.update(hfusEntityTypeRelatEntityAttr);
            if(result > 0) {
                return ResultData.success(hfusEntityTypeRelatEntityAttr);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfusEntityTypeRelatEntityAttr") HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr) {
        logger.debug("request : {}", hfusEntityTypeRelatEntityAttr);

        try {
            ControllerHelper.setDefaultValue(hfusEntityTypeRelatEntityAttr, "hfusEntityTypeRelatEntityAttrId");
            int result = iHfusEntityTypeRelatEntityAttrSV.delete(hfusEntityTypeRelatEntityAttr);
            if(result > 0) {
                return ResultData.success(hfusEntityTypeRelatEntityAttr);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfusEntityTypeRelatEntityAttrSV getIHfusEntityTypeRelatEntityAttrSV(){
		return iHfusEntityTypeRelatEntityAttrSV;
	}
	//setter
	public void setIHfusEntityTypeRelatEntityAttrSV(IHfusEntityTypeRelatEntityAttrSV iHfusEntityTypeRelatEntityAttrSV){
    	this.iHfusEntityTypeRelatEntityAttrSV = iHfusEntityTypeRelatEntityAttrSV;
    }
}
