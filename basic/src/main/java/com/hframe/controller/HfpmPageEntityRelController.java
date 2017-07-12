package com.hframe.controller;

import com.hframe.domain.model.HfpmPageEntityRel;
import com.hframe.domain.model.HfpmPageEntityRel_Example;
import com.hframe.service.interfaces.IHfpmPageEntityRelSV;
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
@RequestMapping(value = "/hframe/hfpmPageEntityRel")
public class HfpmPageEntityRelController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmPageEntityRelController.class);

	@Resource
	private IHfpmPageEntityRelSV iHfpmPageEntityRelSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示页面关联实体列表
     * @param hfpmPageEntityRel
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmPageEntityRel") HfpmPageEntityRel hfpmPageEntityRel,
                                      @ModelAttribute("example") HfpmPageEntityRel_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmPageEntityRel, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmPageEntityRel, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmPageEntityRel> list = iHfpmPageEntityRelSV.getHfpmPageEntityRelListByExample(example);
            pagination.setTotalCount(iHfpmPageEntityRelSV.getHfpmPageEntityRelCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示页面关联实体明细
     * @param hfpmPageEntityRel
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmPageEntityRel") HfpmPageEntityRel hfpmPageEntityRel){
        logger.debug("request : {},{}", hfpmPageEntityRel.getHfpmPageEntityRelId(), hfpmPageEntityRel);
        try{
            HfpmPageEntityRel result = iHfpmPageEntityRelSV.getHfpmPageEntityRelByPK(hfpmPageEntityRel.getHfpmPageEntityRelId());
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
    * 创建页面关联实体
    * @param hfpmPageEntityRel
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmPageEntityRel") HfpmPageEntityRel hfpmPageEntityRel) {
        logger.debug("request : {}", hfpmPageEntityRel);
        try {
            ControllerHelper.setDefaultValue(hfpmPageEntityRel, "hfpmPageEntityRelId");
            int result = iHfpmPageEntityRelSV.create(hfpmPageEntityRel);
            if(result > 0) {
                return ResultData.success(hfpmPageEntityRel);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护页面关联实体
    * @param hfpmPageEntityRels
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmPageEntityRel[] hfpmPageEntityRels) {
        logger.debug("request : {}", hfpmPageEntityRels);

        try {
            ControllerHelper.setDefaultValue(hfpmPageEntityRels, "hfpmPageEntityRelId");
            ControllerHelper.reorderProperty(hfpmPageEntityRels);

            int result = iHfpmPageEntityRelSV.batchOperate(hfpmPageEntityRels);
            if(result > 0) {
                return ResultData.success(hfpmPageEntityRels);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新页面关联实体
    * @param hfpmPageEntityRel
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmPageEntityRel") HfpmPageEntityRel hfpmPageEntityRel) {
        logger.debug("request : {}", hfpmPageEntityRel);
        try {
            ControllerHelper.setDefaultValue(hfpmPageEntityRel, "hfpmPageEntityRelId");
            int result = iHfpmPageEntityRelSV.update(hfpmPageEntityRel);
            if(result > 0) {
                return ResultData.success(hfpmPageEntityRel);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除页面关联实体
    * @param hfpmPageEntityRel
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmPageEntityRel") HfpmPageEntityRel hfpmPageEntityRel) {
        logger.debug("request : {}", hfpmPageEntityRel);

        try {
            ControllerHelper.setDefaultValue(hfpmPageEntityRel, "hfpmPageEntityRelId");
            int result = iHfpmPageEntityRelSV.delete(hfpmPageEntityRel);
            if(result > 0) {
                return ResultData.success(hfpmPageEntityRel);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmPageEntityRelSV getIHfpmPageEntityRelSV(){
		return iHfpmPageEntityRelSV;
	}
	//setter
	public void setIHfpmPageEntityRelSV(IHfpmPageEntityRelSV iHfpmPageEntityRelSV){
    	this.iHfpmPageEntityRelSV = iHfpmPageEntityRelSV;
    }
}
