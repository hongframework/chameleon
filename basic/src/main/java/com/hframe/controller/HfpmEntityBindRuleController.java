package com.hframe.controller;

import com.hframe.domain.model.HfpmEntityBindRule;
import com.hframe.domain.model.HfpmEntityBindRule_Example;
import com.hframe.service.interfaces.IHfpmEntityBindRuleSV;
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
@RequestMapping(value = "/hframe/hfpmEntityBindRule")
public class HfpmEntityBindRuleController   {
    private static final Logger logger = LoggerFactory.getLogger(HfpmEntityBindRuleController.class);

	@Resource
	private IHfpmEntityBindRuleSV iHfpmEntityBindRuleSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示实体捆绑规则列表
     * @param hfpmEntityBindRule
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfpmEntityBindRule") HfpmEntityBindRule hfpmEntityBindRule,
                                      @ModelAttribute("example") HfpmEntityBindRule_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfpmEntityBindRule, example, pagination);
        try{
            ExampleUtils.parseExample(hfpmEntityBindRule, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfpmEntityBindRule> list = iHfpmEntityBindRuleSV.getHfpmEntityBindRuleListByExample(example);
            pagination.setTotalCount(iHfpmEntityBindRuleSV.getHfpmEntityBindRuleCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示实体捆绑规则明细
     * @param hfpmEntityBindRule
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfpmEntityBindRule") HfpmEntityBindRule hfpmEntityBindRule){
        logger.debug("request : {},{}", hfpmEntityBindRule.getHfpmEntityBindRuleId(), hfpmEntityBindRule);
        try{
            HfpmEntityBindRule result = iHfpmEntityBindRuleSV.getHfpmEntityBindRuleByPK(hfpmEntityBindRule.getHfpmEntityBindRuleId());
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
    * 创建实体捆绑规则
    * @param hfpmEntityBindRule
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfpmEntityBindRule") HfpmEntityBindRule hfpmEntityBindRule) {
        logger.debug("request : {}", hfpmEntityBindRule);
        try {
            ControllerHelper.setDefaultValue(hfpmEntityBindRule, "hfpmEntityBindRuleId");
            int result = iHfpmEntityBindRuleSV.create(hfpmEntityBindRule);
            if(result > 0) {
                return ResultData.success(hfpmEntityBindRule);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护实体捆绑规则
    * @param hfpmEntityBindRules
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfpmEntityBindRule[] hfpmEntityBindRules) {
        logger.debug("request : {}", hfpmEntityBindRules);

        try {
            ControllerHelper.setDefaultValue(hfpmEntityBindRules, "hfpmEntityBindRuleId");
            ControllerHelper.reorderProperty(hfpmEntityBindRules);

            int result = iHfpmEntityBindRuleSV.batchOperate(hfpmEntityBindRules);
            if(result > 0) {
                return ResultData.success(hfpmEntityBindRules);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新实体捆绑规则
    * @param hfpmEntityBindRule
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfpmEntityBindRule") HfpmEntityBindRule hfpmEntityBindRule) {
        logger.debug("request : {}", hfpmEntityBindRule);
        try {
            ControllerHelper.setDefaultValue(hfpmEntityBindRule, "hfpmEntityBindRuleId");
            int result = iHfpmEntityBindRuleSV.update(hfpmEntityBindRule);
            if(result > 0) {
                return ResultData.success(hfpmEntityBindRule);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除实体捆绑规则
    * @param hfpmEntityBindRule
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfpmEntityBindRule") HfpmEntityBindRule hfpmEntityBindRule) {
        logger.debug("request : {}", hfpmEntityBindRule);

        try {
            ControllerHelper.setDefaultValue(hfpmEntityBindRule, "hfpmEntityBindRuleId");
            int result = iHfpmEntityBindRuleSV.delete(hfpmEntityBindRule);
            if(result > 0) {
                return ResultData.success(hfpmEntityBindRule);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfpmEntityBindRuleSV getIHfpmEntityBindRuleSV(){
		return iHfpmEntityBindRuleSV;
	}
	//setter
	public void setIHfpmEntityBindRuleSV(IHfpmEntityBindRuleSV iHfpmEntityBindRuleSV){
    	this.iHfpmEntityBindRuleSV = iHfpmEntityBindRuleSV;
    }
}
