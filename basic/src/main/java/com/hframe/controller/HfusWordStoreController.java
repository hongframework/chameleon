package com.hframe.controller;

import com.hframe.domain.model.HfusWordStore;
import com.hframe.domain.model.HfusWordStore_Example;
import com.hframe.service.interfaces.IHfusWordStoreSV;
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
@RequestMapping(value = "/hframe/hfusWordStore")
public class HfusWordStoreController   {
    private static final Logger logger = LoggerFactory.getLogger(HfusWordStoreController.class);

	@Resource
	private IHfusWordStoreSV iHfusWordStoreSV;
  




    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示单词库列表
     * @param hfusWordStore
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfusWordStore") HfusWordStore hfusWordStore,
                                      @ModelAttribute("example") HfusWordStore_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfusWordStore, example, pagination);
        try{
            ExampleUtils.parseExample(hfusWordStore, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfusWordStore> list = iHfusWordStoreSV.getHfusWordStoreListByExample(example);
            pagination.setTotalCount(iHfusWordStoreSV.getHfusWordStoreCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 查询展示单词库明细
     * @param hfusWordStore
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfusWordStore") HfusWordStore hfusWordStore){
        logger.debug("request : {},{}", hfusWordStore.getHfusWordStoreId(), hfusWordStore);
        try{
            HfusWordStore result = iHfusWordStoreSV.getHfusWordStoreByPK(hfusWordStore.getHfusWordStoreId());
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
    * 创建单词库
    * @param hfusWordStore
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfusWordStore") HfusWordStore hfusWordStore) {
        logger.debug("request : {}", hfusWordStore);
        try {
            ControllerHelper.setDefaultValue(hfusWordStore, "hfusWordStoreId");
            int result = iHfusWordStoreSV.create(hfusWordStore);
            if(result > 0) {
                return ResultData.success(hfusWordStore);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护单词库
    * @param hfusWordStores
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfusWordStore[] hfusWordStores) {
        logger.debug("request : {}", hfusWordStores);

        try {
            ControllerHelper.setDefaultValue(hfusWordStores, "hfusWordStoreId");
            ControllerHelper.reorderProperty(hfusWordStores);

            int result = iHfusWordStoreSV.batchOperate(hfusWordStores);
            if(result > 0) {
                return ResultData.success(hfusWordStores);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新单词库
    * @param hfusWordStore
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfusWordStore") HfusWordStore hfusWordStore) {
        logger.debug("request : {}", hfusWordStore);
        try {
            ControllerHelper.setDefaultValue(hfusWordStore, "hfusWordStoreId");
            int result = iHfusWordStoreSV.update(hfusWordStore);
            if(result > 0) {
                return ResultData.success(hfusWordStore);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除单词库
    * @param hfusWordStore
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfusWordStore") HfusWordStore hfusWordStore) {
        logger.debug("request : {}", hfusWordStore);

        try {
            ControllerHelper.setDefaultValue(hfusWordStore, "hfusWordStoreId");
            int result = iHfusWordStoreSV.delete(hfusWordStore);
            if(result > 0) {
                return ResultData.success(hfusWordStore);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfusWordStoreSV getIHfusWordStoreSV(){
		return iHfusWordStoreSV;
	}
	//setter
	public void setIHfusWordStoreSV(IHfusWordStoreSV iHfusWordStoreSV){
    	this.iHfusWordStoreSV = iHfusWordStoreSV;
    }
}
