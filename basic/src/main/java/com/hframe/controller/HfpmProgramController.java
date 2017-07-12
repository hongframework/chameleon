package com.hframe.controller;

import com.hframe.domain.model.HfpmProgram;
import com.hframe.domain.model.HfpmProgram_Example;
import com.hframe.service.interfaces.IHfpmProgramSV;
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
@RequestMapping(value = "/hframe/hfpmProgram")
public class HfpmProgramController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmProgramController.class);

	@Resource
	private IHfpmProgramSV iHfpmProgramSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示项目列表
     * @param hfpmProgram
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmProgram") HfpmProgram hfpmProgram,
                                      @ModelAttribute("example") HfpmProgram_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmProgram, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmProgram, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmProgram> list = iHfpmProgramSV.getHfpmProgramListByExample(example);
            pagination.setTotalCount(iHfpmProgramSV.getHfpmProgramCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示项目明细
     * @param hfpmProgram
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmProgram") HfpmProgram hfpmProgram){
        logger.debug("request : {},{}", hfpmProgram.getHfpmProgramId(), hfpmProgram);
        try{
            HfpmProgram result = iHfpmProgramSV.getHfpmProgramByPK(hfpmProgram.getHfpmProgramId());
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
    * 创建项目
    * @param hfpmProgram
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmProgram") HfpmProgram hfpmProgram) {
        logger.debug("request : {}", hfpmProgram);
        try {
            ControllerHelper.setDefaultValue(hfpmProgram, "hfpmProgramId");
            int result = iHfpmProgramSV.create(hfpmProgram);
            if(result > 0) {
                return ResultData.success(hfpmProgram);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护项目
    * @param hfpmPrograms
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmProgram[] hfpmPrograms) {
        logger.debug("request : {}", hfpmPrograms);

        try {
            ControllerHelper.setDefaultValue(hfpmPrograms, "hfpmProgramId");
            ControllerHelper.reorderProperty(hfpmPrograms);

            int result = iHfpmProgramSV.batchOperate(hfpmPrograms);
            if(result > 0) {
                return ResultData.success(hfpmPrograms);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新项目
    * @param hfpmProgram
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmProgram") HfpmProgram hfpmProgram) {
        logger.debug("request : {}", hfpmProgram);
        try {
            ControllerHelper.setDefaultValue(hfpmProgram, "hfpmProgramId");
            int result = iHfpmProgramSV.update(hfpmProgram);
            if(result > 0) {
                return ResultData.success(hfpmProgram);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除项目
    * @param hfpmProgram
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmProgram") HfpmProgram hfpmProgram) {
        logger.debug("request : {}", hfpmProgram);

        try {
            ControllerHelper.setDefaultValue(hfpmProgram, "hfpmProgramId");
            int result = iHfpmProgramSV.delete(hfpmProgram);
            if(result > 0) {
                return ResultData.success(hfpmProgram);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmProgramSV getIHfpmProgramSV(){
		return iHfpmProgramSV;
	}
	//setter
	public void setIHfpmProgramSV(IHfpmProgramSV iHfpmProgramSV){
    	this.iHfpmProgramSV = iHfpmProgramSV;
    }
}
