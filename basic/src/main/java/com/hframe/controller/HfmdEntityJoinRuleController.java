package com.hframe.controller;

import com.hframe.domain.model.HfmdEntityJoinRule;
import com.hframe.domain.model.HfmdEntityJoinRule_Example;
import com.hframe.service.interfaces.IHfmdEntityJoinRuleSV;
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
@RequestMapping(value = "/hframe/hfmdEntityJoinRule")
public class HfmdEntityJoinRuleController   {
    private static final Logger logger = LoggerFactory.getLogger(HfmdEntityJoinRuleController.class);

	@Resource
	private IHfmdEntityJoinRuleSV iHfmdEntityJoinRuleSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示实体属性连带规则列表
     * @param hfmdEntityJoinRule
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfmdEntityJoinRule") HfmdEntityJoinRule hfmdEntityJoinRule,
                                      @ModelAttribute("example") HfmdEntityJoinRule_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfmdEntityJoinRule, example, pagination);
        try{
            ExampleUtils.parseExample(hfmdEntityJoinRule, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfmdEntityJoinRule> list = iHfmdEntityJoinRuleSV.getHfmdEntityJoinRuleListByExample(example);
            pagination.setTotalCount(iHfmdEntityJoinRuleSV.getHfmdEntityJoinRuleCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示实体属性连带规则明细
     * @param hfmdEntityJoinRule
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfmdEntityJoinRule") HfmdEntityJoinRule hfmdEntityJoinRule){
        logger.debug("request : {},{}", hfmdEntityJoinRule.getHfmdEntityJoinRuleId(), hfmdEntityJoinRule);
        try{
            HfmdEntityJoinRule result = iHfmdEntityJoinRuleSV.getHfmdEntityJoinRuleByPK(hfmdEntityJoinRule.getHfmdEntityJoinRuleId());
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
    * 搜索一个实体属性连带规则
    * @param  hfmdEntityJoinRule
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfmdEntityJoinRule") HfmdEntityJoinRule  hfmdEntityJoinRule){
        logger.debug("request : {}",  hfmdEntityJoinRule);
        try{
            HfmdEntityJoinRule result = null;
            if(hfmdEntityJoinRule.getHfmdEntityJoinRuleId() != null) {
                result =  iHfmdEntityJoinRuleSV.getHfmdEntityJoinRuleByPK(hfmdEntityJoinRule.getHfmdEntityJoinRuleId());
            }else {
                HfmdEntityJoinRule_Example example = ExampleUtils.parseExample( hfmdEntityJoinRule, HfmdEntityJoinRule_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfmdEntityJoinRule> list =  iHfmdEntityJoinRuleSV.getHfmdEntityJoinRuleListByExample(example);
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
    * 创建实体属性连带规则
    * @param hfmdEntityJoinRule
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfmdEntityJoinRule") HfmdEntityJoinRule hfmdEntityJoinRule) {
        logger.debug("request : {}", hfmdEntityJoinRule);
        try {
            ControllerHelper.setDefaultValue(hfmdEntityJoinRule, "hfmdEntityJoinRuleId");
            int result = iHfmdEntityJoinRuleSV.create(hfmdEntityJoinRule);
            if(result > 0) {
                return ResultData.success(hfmdEntityJoinRule);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护实体属性连带规则
    * @param hfmdEntityJoinRules
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfmdEntityJoinRule[] hfmdEntityJoinRules) {
        logger.debug("request : {}", hfmdEntityJoinRules);

        try {
            ControllerHelper.setDefaultValue(hfmdEntityJoinRules, "hfmdEntityJoinRuleId");
            ControllerHelper.reorderProperty(hfmdEntityJoinRules);

            int result = iHfmdEntityJoinRuleSV.batchOperate(hfmdEntityJoinRules);
            if(result > 0) {
                return ResultData.success(hfmdEntityJoinRules);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新实体属性连带规则
    * @param hfmdEntityJoinRule
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfmdEntityJoinRule") HfmdEntityJoinRule hfmdEntityJoinRule) {
        logger.debug("request : {}", hfmdEntityJoinRule);
        try {
            ControllerHelper.setDefaultValue(hfmdEntityJoinRule, "hfmdEntityJoinRuleId");
            int result = iHfmdEntityJoinRuleSV.update(hfmdEntityJoinRule);
            if(result > 0) {
                return ResultData.success(hfmdEntityJoinRule);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除实体属性连带规则
    * @param hfmdEntityJoinRule
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfmdEntityJoinRule") HfmdEntityJoinRule hfmdEntityJoinRule) {
        logger.debug("request : {}", hfmdEntityJoinRule);

        try {
            ControllerHelper.setDefaultValue(hfmdEntityJoinRule, "hfmdEntityJoinRuleId");
            int result = iHfmdEntityJoinRuleSV.delete(hfmdEntityJoinRule);
            if(result > 0) {
                return ResultData.success(hfmdEntityJoinRule);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfmdEntityJoinRuleSV getIHfmdEntityJoinRuleSV(){
		return iHfmdEntityJoinRuleSV;
	}
	//setter
	public void setIHfmdEntityJoinRuleSV(IHfmdEntityJoinRuleSV iHfmdEntityJoinRuleSV){
    	this.iHfmdEntityJoinRuleSV = iHfmdEntityJoinRuleSV;
    }
}
