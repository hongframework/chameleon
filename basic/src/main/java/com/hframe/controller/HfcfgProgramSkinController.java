package com.hframe.controller;

import com.hframe.domain.model.HfcfgProgramSkin;
import com.hframe.domain.model.HfcfgProgramSkin_Example;
import com.hframe.service.interfaces.IHfcfgProgramSkinSV;
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
@RequestMapping(value = "/hframe/hfcfgProgramSkin")
public class HfcfgProgramSkinController   {
    private static final Logger logger = LoggerFactory.getLogger(HfcfgProgramSkinController.class);

	@Resource
	private IHfcfgProgramSkinSV iHfcfgProgramSkinSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示皮肤列表
     * @param hfcfgProgramSkin
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfcfgProgramSkin") HfcfgProgramSkin hfcfgProgramSkin,
                                      @ModelAttribute("example") HfcfgProgramSkin_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfcfgProgramSkin, example, pagination);
        try{
            ExampleUtils.parseExample(hfcfgProgramSkin, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfcfgProgramSkin> list = iHfcfgProgramSkinSV.getHfcfgProgramSkinListByExample(example);
            pagination.setTotalCount(iHfcfgProgramSkinSV.getHfcfgProgramSkinCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示皮肤明细
     * @param hfcfgProgramSkin
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfcfgProgramSkin") HfcfgProgramSkin hfcfgProgramSkin){
        logger.debug("request : {},{}", hfcfgProgramSkin.getHfcfgProgramSkinId(), hfcfgProgramSkin);
        try{
            HfcfgProgramSkin result = iHfcfgProgramSkinSV.getHfcfgProgramSkinByPK(hfcfgProgramSkin.getHfcfgProgramSkinId());
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
    * 创建皮肤
    * @param hfcfgProgramSkin
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfcfgProgramSkin") HfcfgProgramSkin hfcfgProgramSkin) {
        logger.debug("request : {}", hfcfgProgramSkin);
        try {
            ControllerHelper.setDefaultValue(hfcfgProgramSkin, "hfcfgProgramSkinId");
            int result = iHfcfgProgramSkinSV.create(hfcfgProgramSkin);
            if(result > 0) {
                return ResultData.success(hfcfgProgramSkin);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护皮肤
    * @param hfcfgProgramSkins
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfcfgProgramSkin[] hfcfgProgramSkins) {
        logger.debug("request : {}", hfcfgProgramSkins);

        try {
            ControllerHelper.setDefaultValue(hfcfgProgramSkins, "hfcfgProgramSkinId");
            ControllerHelper.reorderProperty(hfcfgProgramSkins);

            int result = iHfcfgProgramSkinSV.batchOperate(hfcfgProgramSkins);
            if(result > 0) {
                return ResultData.success(hfcfgProgramSkins);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新皮肤
    * @param hfcfgProgramSkin
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfcfgProgramSkin") HfcfgProgramSkin hfcfgProgramSkin) {
        logger.debug("request : {}", hfcfgProgramSkin);
        try {
            ControllerHelper.setDefaultValue(hfcfgProgramSkin, "hfcfgProgramSkinId");
            int result = iHfcfgProgramSkinSV.update(hfcfgProgramSkin);
            if(result > 0) {
                return ResultData.success(hfcfgProgramSkin);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除皮肤
    * @param hfcfgProgramSkin
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfcfgProgramSkin") HfcfgProgramSkin hfcfgProgramSkin) {
        logger.debug("request : {}", hfcfgProgramSkin);

        try {
            ControllerHelper.setDefaultValue(hfcfgProgramSkin, "hfcfgProgramSkinId");
            int result = iHfcfgProgramSkinSV.delete(hfcfgProgramSkin);
            if(result > 0) {
                return ResultData.success(hfcfgProgramSkin);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfcfgProgramSkinSV getIHfcfgProgramSkinSV(){
		return iHfcfgProgramSkinSV;
	}
	//setter
	public void setIHfcfgProgramSkinSV(IHfcfgProgramSkinSV iHfcfgProgramSkinSV){
    	this.iHfcfgProgramSkinSV = iHfcfgProgramSkinSV;
    }
}
