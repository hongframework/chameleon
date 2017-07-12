package com.hframework.controller;

import com.hframework.base.service.DataSetLoaderService;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.web.context.WebContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * User: zhangqh6
 * Date: 2016/5/11 0:16:16
 */
@Controller
@RequestMapping(value = "/context")
public class ContextController {
    private static final Logger logger = LoggerFactory.getLogger(ContextController.class);

    @Resource
    private DataSetLoaderService dataSetLoaderService;

    /**
     * 重新加载（全量）
     * @return
     */
    @RequestMapping(value = "/reload/full.json")
    @ResponseBody
    public ResultData full(HttpServletRequest request){
        logger.debug("request : {}");
        try{
            dataSetLoaderService.load(request.getSession().getServletContext());
            WebContext.reload();
            return ResultData.success();
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 重新加载（全量）
     * @return
     */
    @RequestMapping(value = "/model_diff.json")
    @ResponseBody
    public ResultData getModelDiff(HttpServletRequest request){
        logger.debug("request : {}");
        try{
            dataSetLoaderService.load(request.getSession().getServletContext());
            WebContext.reload();
            return ResultData.success();
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }


}
