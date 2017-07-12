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
import com.hframe.domain.model.HfcfgDbConnect;
import com.hframe.domain.model.HfcfgDbConnect_Example;
import com.hframe.service.interfaces.IHfcfgDbConnectSV;

@Controller
@RequestMapping(value = "/hframe/hfcfgDbConnect")
public class HfcfgDbConnectController   {
    private static final Logger logger = LoggerFactory.getLogger(HfcfgDbConnectController.class);

	@Resource
	private IHfcfgDbConnectSV iHfcfgDbConnectSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示列表
     * @param hfcfgDbConnect
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfcfgDbConnect") HfcfgDbConnect hfcfgDbConnect,
                                      @ModelAttribute("example") HfcfgDbConnect_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfcfgDbConnect, example, pagination);
        try{
            ExampleUtils.parseExample(hfcfgDbConnect, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfcfgDbConnect> list = iHfcfgDbConnectSV.getHfcfgDbConnectListByExample(example);
            pagination.setTotalCount(iHfcfgDbConnectSV.getHfcfgDbConnectCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示明细
     * @param hfcfgDbConnect
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfcfgDbConnect") HfcfgDbConnect hfcfgDbConnect){
        logger.debug("request : {},{}", hfcfgDbConnect.getHfcfgDbConnectId(), hfcfgDbConnect);
        try{
            HfcfgDbConnect result = iHfcfgDbConnectSV.getHfcfgDbConnectByPK(hfcfgDbConnect.getHfcfgDbConnectId());
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
    * @param  hfcfgDbConnect
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfcfgDbConnect") HfcfgDbConnect  hfcfgDbConnect){
        logger.debug("request : {}",  hfcfgDbConnect);
        try{
            HfcfgDbConnect result = null;
            if(hfcfgDbConnect.getHfcfgDbConnectId() != null) {
                result =  iHfcfgDbConnectSV.getHfcfgDbConnectByPK(hfcfgDbConnect.getHfcfgDbConnectId());
            }else {
                HfcfgDbConnect_Example example = ExampleUtils.parseExample( hfcfgDbConnect, HfcfgDbConnect_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfcfgDbConnect> list =  iHfcfgDbConnectSV.getHfcfgDbConnectListByExample(example);
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
    * @param hfcfgDbConnect
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfcfgDbConnect") HfcfgDbConnect hfcfgDbConnect) {
        logger.debug("request : {}", hfcfgDbConnect);
        try {
            ControllerHelper.setDefaultValue(hfcfgDbConnect, "hfcfgDbConnectId");
            int result = iHfcfgDbConnectSV.create(hfcfgDbConnect);
            if(result > 0) {
                return ResultData.success(hfcfgDbConnect);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护
    * @param hfcfgDbConnects
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfcfgDbConnect[] hfcfgDbConnects) {
        logger.debug("request : {}", hfcfgDbConnects);

        try {
            ControllerHelper.setDefaultValue(hfcfgDbConnects, "hfcfgDbConnectId");
            ControllerHelper.reorderProperty(hfcfgDbConnects);

            int result = iHfcfgDbConnectSV.batchOperate(hfcfgDbConnects);
            if(result > 0) {
                return ResultData.success(hfcfgDbConnects);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新
    * @param hfcfgDbConnect
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfcfgDbConnect") HfcfgDbConnect hfcfgDbConnect) {
        logger.debug("request : {}", hfcfgDbConnect);
        try {
            ControllerHelper.setDefaultValue(hfcfgDbConnect, "hfcfgDbConnectId");
            int result = iHfcfgDbConnectSV.update(hfcfgDbConnect);
            if(result > 0) {
                return ResultData.success(hfcfgDbConnect);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除
    * @param hfcfgDbConnect
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfcfgDbConnect") HfcfgDbConnect hfcfgDbConnect) {
        logger.debug("request : {}", hfcfgDbConnect);

        try {
            ControllerHelper.setDefaultValue(hfcfgDbConnect, "hfcfgDbConnectId");
            int result = iHfcfgDbConnectSV.delete(hfcfgDbConnect);
            if(result > 0) {
                return ResultData.success(hfcfgDbConnect);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfcfgDbConnectSV getIHfcfgDbConnectSV(){
		return iHfcfgDbConnectSV;
	}
	//setter
	public void setIHfcfgDbConnectSV(IHfcfgDbConnectSV iHfcfgDbConnectSV){
    	this.iHfcfgDbConnectSV = iHfcfgDbConnectSV;
    }
}
