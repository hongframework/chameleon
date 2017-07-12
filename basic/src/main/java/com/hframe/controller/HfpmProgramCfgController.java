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
import com.hframe.domain.model.HfpmProgramCfg;
import com.hframe.domain.model.HfpmProgramCfg_Example;
import com.hframe.service.interfaces.IHfpmProgramCfgSV;

@Controller
@RequestMapping(value = "/hframe/hfpmProgramCfg")
public class HfpmProgramCfgController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmProgramCfgController.class);

	@Resource
	private IHfpmProgramCfgSV iHfpmProgramCfgSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示项目设置列表
     * @param hfpmProgramCfg
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmProgramCfg") HfpmProgramCfg hfpmProgramCfg,
                                      @ModelAttribute("example") HfpmProgramCfg_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmProgramCfg, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmProgramCfg, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmProgramCfg> list = iHfpmProgramCfgSV.getHfpmProgramCfgListByExample(example);
            pagination.setTotalCount(iHfpmProgramCfgSV.getHfpmProgramCfgCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示项目设置明细
     * @param hfpmProgramCfg
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmProgramCfg") HfpmProgramCfg hfpmProgramCfg){
        logger.debug("request : {},{}", hfpmProgramCfg.getHfpmProgramCfgId(), hfpmProgramCfg);
        try{
            HfpmProgramCfg result = null;
            if(hfpmProgramCfg.getHfpmProgramCfgId() != null) {
                result = iHfpmProgramCfgSV.getHfpmProgramCfgByPK(hfpmProgramCfg.getHfpmProgramCfgId());
            }else {
                HfpmProgramCfg_Example example = ExampleUtils.parseExample(hfpmProgramCfg, HfpmProgramCfg_Example.class);
                List<HfpmProgramCfg> list = iHfpmProgramCfgSV.getHfpmProgramCfgListByExample(example);
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
    * 搜索一个项目设置
    * @param  hfpmProgramCfg
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfpmProgramCfg") HfpmProgramCfg  hfpmProgramCfg){
        logger.debug("request : {}",  hfpmProgramCfg);
        try{
            HfpmProgramCfg result = null;
            if(hfpmProgramCfg.getHfpmProgramCfgId() != null) {
                result =  iHfpmProgramCfgSV.getHfpmProgramCfgByPK(hfpmProgramCfg.getHfpmProgramCfgId());
            }else {
                HfpmProgramCfg_Example example = ExampleUtils.parseExample( hfpmProgramCfg, HfpmProgramCfg_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfpmProgramCfg> list =  iHfpmProgramCfgSV.getHfpmProgramCfgListByExample(example);
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
    * 创建项目设置
    * @param hfpmProgramCfg
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmProgramCfg") HfpmProgramCfg hfpmProgramCfg) {
        logger.debug("request : {}", hfpmProgramCfg);
        try {
            ControllerHelper.setDefaultValue(hfpmProgramCfg, "hfpmProgramCfgId");
            int result = iHfpmProgramCfgSV.create(hfpmProgramCfg);
            if(result > 0) {
                return ResultData.success(hfpmProgramCfg);
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
    * 批量维护项目设置
    * @param hfpmProgramCfgs
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmProgramCfg[] hfpmProgramCfgs) {
        logger.debug("request : {}", hfpmProgramCfgs);

        try {
            ControllerHelper.setDefaultValue(hfpmProgramCfgs, "hfpmProgramCfgId");
            ControllerHelper.reorderProperty(hfpmProgramCfgs);

            int result = iHfpmProgramCfgSV.batchOperate(hfpmProgramCfgs);
            if(result > 0) {
                return ResultData.success(hfpmProgramCfgs);
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
    * 更新项目设置
    * @param hfpmProgramCfg
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmProgramCfg") HfpmProgramCfg hfpmProgramCfg) {
        logger.debug("request : {}", hfpmProgramCfg);
        try {
            ControllerHelper.setDefaultValue(hfpmProgramCfg, "hfpmProgramCfgId");
            int result = iHfpmProgramCfgSV.update(hfpmProgramCfg);
            if(result > 0) {
                return ResultData.success(hfpmProgramCfg);
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
    * 创建或更新项目设置
    * @param hfpmProgramCfg
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/saveOrUpdateByAjax.json")
    @ResponseBody
    public ResultData saveOrUpdate(@ModelAttribute("hfpmProgramCfg") HfpmProgramCfg hfpmProgramCfg) {
        logger.debug("request : {}", hfpmProgramCfg);
        try {
            ControllerHelper.setDefaultValue(hfpmProgramCfg, "hfpmProgramCfgId");
            int result = iHfpmProgramCfgSV.batchOperate(new HfpmProgramCfg[]{hfpmProgramCfg});
            if(result > 0) {
                return ResultData.success(hfpmProgramCfg);
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
    * 删除项目设置
    * @param hfpmProgramCfg
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmProgramCfg") HfpmProgramCfg hfpmProgramCfg) {
        logger.debug("request : {}", hfpmProgramCfg);

        try {
            ControllerHelper.setDefaultValue(hfpmProgramCfg, "hfpmProgramCfgId");
            int result = iHfpmProgramCfgSV.delete(hfpmProgramCfg);
            if(result > 0) {
                return ResultData.success(hfpmProgramCfg);
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
 	
	public IHfpmProgramCfgSV getIHfpmProgramCfgSV(){
		return iHfpmProgramCfgSV;
	}
	//setter
	public void setIHfpmProgramCfgSV(IHfpmProgramCfgSV iHfpmProgramCfgSV){
    	this.iHfpmProgramCfgSV = iHfpmProgramCfgSV;
    }
}
