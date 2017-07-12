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
import com.hframe.domain.model.HfsecOrganize;
import com.hframe.domain.model.HfsecOrganize_Example;
import com.hframe.service.interfaces.IHfsecOrganizeSV;

@Controller
@RequestMapping(value = "/hframe/hfsecOrganize")
public class HfsecOrganizeController   {
    private static final Logger logger = LoggerFactory.getLogger(HfsecOrganizeController.class);

	@Resource
	private IHfsecOrganizeSV iHfsecOrganizeSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示组织列表
     * @param hfsecOrganize
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfsecOrganize") HfsecOrganize hfsecOrganize,
                                      @ModelAttribute("example") HfsecOrganize_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfsecOrganize, example, pagination);
        try{
            ExampleUtils.parseExample(hfsecOrganize, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfsecOrganize> list = iHfsecOrganizeSV.getHfsecOrganizeListByExample(example);
            pagination.setTotalCount(iHfsecOrganizeSV.getHfsecOrganizeCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }


    /**
    * 查询展示组织树
    * @param hfsecOrganize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/queryTeeByAjax.json")
    @ResponseBody
    public ResultData tree(@ModelAttribute("hfsecOrganize") HfsecOrganize hfsecOrganize,
                         @ModelAttribute("example") HfsecOrganize_Example example){
        logger.debug("request : {},{}", hfsecOrganize, example);
        try{
            ExampleUtils.parseExample(hfsecOrganize, example);

            Map<Long, List< HfsecOrganize>> treeMap =
                    iHfsecOrganizeSV.getHfsecOrganizeTreeByParentId(hfsecOrganize, example);

            return ResultData.success(treeMap);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示组织明细
     * @param hfsecOrganize
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfsecOrganize") HfsecOrganize hfsecOrganize){
        logger.debug("request : {},{}", hfsecOrganize.getHfsecOrganizeId(), hfsecOrganize);
        try{
            HfsecOrganize result = null;
            if(hfsecOrganize.getHfsecOrganizeId() != null) {
                result = iHfsecOrganizeSV.getHfsecOrganizeByPK(hfsecOrganize.getHfsecOrganizeId());
            }else {
                HfsecOrganize_Example example = ExampleUtils.parseExample(hfsecOrganize, HfsecOrganize_Example.class);
                List<HfsecOrganize> list = iHfsecOrganizeSV.getHfsecOrganizeListByExample(example);
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
    * 搜索一个组织
    * @param  hfsecOrganize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfsecOrganize") HfsecOrganize  hfsecOrganize){
        logger.debug("request : {}",  hfsecOrganize);
        try{
            HfsecOrganize result = null;
            if(hfsecOrganize.getHfsecOrganizeId() != null) {
                result =  iHfsecOrganizeSV.getHfsecOrganizeByPK(hfsecOrganize.getHfsecOrganizeId());
            }else {
                HfsecOrganize_Example example = ExampleUtils.parseExample( hfsecOrganize, HfsecOrganize_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfsecOrganize> list =  iHfsecOrganizeSV.getHfsecOrganizeListByExample(example);
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
    * 创建组织
    * @param hfsecOrganize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfsecOrganize") HfsecOrganize hfsecOrganize) {
        logger.debug("request : {}", hfsecOrganize);
        try {
            ControllerHelper.setDefaultValue(hfsecOrganize, "hfsecOrganizeId");
            int result = iHfsecOrganizeSV.create(hfsecOrganize);
            if(result > 0) {
                return ResultData.success(hfsecOrganize);
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
    * 批量维护组织
    * @param hfsecOrganizes
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfsecOrganize[] hfsecOrganizes) {
        logger.debug("request : {}", hfsecOrganizes);

        try {
            ControllerHelper.setDefaultValue(hfsecOrganizes, "hfsecOrganizeId");
            ControllerHelper.reorderProperty(hfsecOrganizes);

            int result = iHfsecOrganizeSV.batchOperate(hfsecOrganizes);
            if(result > 0) {
                return ResultData.success(hfsecOrganizes);
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
    * 更新组织
    * @param hfsecOrganize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfsecOrganize") HfsecOrganize hfsecOrganize) {
        logger.debug("request : {}", hfsecOrganize);
        try {
            ControllerHelper.setDefaultValue(hfsecOrganize, "hfsecOrganizeId");
            int result = iHfsecOrganizeSV.update(hfsecOrganize);
            if(result > 0) {
                return ResultData.success(hfsecOrganize);
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
    * 创建或更新组织
    * @param hfsecOrganize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/saveOrUpdateByAjax.json")
    @ResponseBody
    public ResultData saveOrUpdate(@ModelAttribute("hfsecOrganize") HfsecOrganize hfsecOrganize) {
        logger.debug("request : {}", hfsecOrganize);
        try {
            ControllerHelper.setDefaultValue(hfsecOrganize, "hfsecOrganizeId");
            int result = iHfsecOrganizeSV.batchOperate(new HfsecOrganize[]{hfsecOrganize});
            if(result > 0) {
                return ResultData.success(hfsecOrganize);
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
    * 删除组织
    * @param hfsecOrganize
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfsecOrganize") HfsecOrganize hfsecOrganize) {
        logger.debug("request : {}", hfsecOrganize);

        try {
            ControllerHelper.setDefaultValue(hfsecOrganize, "hfsecOrganizeId");
            int result = iHfsecOrganizeSV.delete(hfsecOrganize);
            if(result > 0) {
                return ResultData.success(hfsecOrganize);
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
 	
	public IHfsecOrganizeSV getIHfsecOrganizeSV(){
		return iHfsecOrganizeSV;
	}
	//setter
	public void setIHfsecOrganizeSV(IHfsecOrganizeSV iHfsecOrganizeSV){
    	this.iHfsecOrganizeSV = iHfsecOrganizeSV;
    }
}
