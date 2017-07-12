package com.hframe.controller;

import com.hframework.beans.controller.Pagination;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.util.ExampleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.ServletRequestDataBinder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import com.hframework.web.ControllerHelper;
import com.hframe.domain.model.HfpmTest;
import com.hframe.domain.model.HfpmTest_Example;
import com.hframe.service.interfaces.IHfpmTestSV;

@Controller
@RequestMapping(value = "/hframe/hfpmTest")
public class HfpmTestController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmTestController.class);

	@Resource
	private IHfpmTestSV iHfpmTestSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示列表
     * @param hfpmTest
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmTest") HfpmTest hfpmTest,
                                      @ModelAttribute("example") HfpmTest_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmTest, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmTest, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmTest> list = iHfpmTestSV.getHfpmTestListByExample(example);
            pagination.setTotalCount(iHfpmTestSV.getHfpmTestCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示明细
     * @param hfpmTest
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmTest") HfpmTest hfpmTest){
        logger.debug("request : {},{}", hfpmTest.getHfpmTestId(), hfpmTest);
        try{
            HfpmTest result = iHfpmTestSV.getHfpmTestByPK(hfpmTest.getHfpmTestId());
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
    * 搜索一个
    * @param  hfpmTest
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfpmTest") HfpmTest  hfpmTest){
        logger.debug("request : {}",  hfpmTest);
        try{
            HfpmTest result = null;
            if(hfpmTest.getHfpmTestId() != null) {
                result =  iHfpmTestSV.getHfpmTestByPK(hfpmTest.getHfpmTestId());
            }else {
                HfpmTest_Example example = ExampleUtils.parseExample( hfpmTest, HfpmTest_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfpmTest> list =  iHfpmTestSV.getHfpmTestListByExample(example);
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
    * 创建
    * @param hfpmTest
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmTest") HfpmTest hfpmTest) {
        logger.debug("request : {}", hfpmTest);
        try {
            ControllerHelper.setDefaultValue(hfpmTest, "hfpmTestId");
            int result = iHfpmTestSV.create(hfpmTest);
            if(result > 0) {
                return ResultData.success(hfpmTest);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护
    * @param hfpmTests
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmTest[] hfpmTests) {
        logger.debug("request : {}", hfpmTests);

        try {
            ControllerHelper.setDefaultValue(hfpmTests, "hfpmTestId");
            ControllerHelper.reorderProperty(hfpmTests);

            int result = iHfpmTestSV.batchOperate(hfpmTests);
            if(result > 0) {
                return ResultData.success(hfpmTests);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新
    * @param hfpmTest
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmTest") HfpmTest hfpmTest) {
        logger.debug("request : {}", hfpmTest);
        try {
            ControllerHelper.setDefaultValue(hfpmTest, "hfpmTestId");
            int result = iHfpmTestSV.update(hfpmTest);
            if(result > 0) {
                return ResultData.success(hfpmTest);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除
    * @param hfpmTest
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmTest") HfpmTest hfpmTest) {
        logger.debug("request : {}", hfpmTest);

        try {
            ControllerHelper.setDefaultValue(hfpmTest, "hfpmTestId");
            int result = iHfpmTestSV.delete(hfpmTest);
            if(result > 0) {
                return ResultData.success(hfpmTest);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmTestSV getIHfpmTestSV(){
		return iHfpmTestSV;
	}
	//setter
	public void setIHfpmTestSV(IHfpmTestSV iHfpmTestSV){
    	this.iHfpmTestSV = iHfpmTestSV;
    }
}
