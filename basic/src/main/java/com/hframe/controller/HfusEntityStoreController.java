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
import com.hframe.domain.model.HfusEntityStore;
import com.hframe.domain.model.HfusEntityStore_Example;
import com.hframe.service.interfaces.IHfusEntityStoreSV;

@Controller
@RequestMapping(value = "/hframe/hfusEntityStore")
public class HfusEntityStoreController   {
    private static final Logger logger = LoggerFactory.getLogger(HfusEntityStoreController.class);

	@Resource
	private IHfusEntityStoreSV iHfusEntityStoreSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示常用实体库列表
     * @param hfusEntityStore
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfusEntityStore") HfusEntityStore hfusEntityStore,
                                      @ModelAttribute("example") HfusEntityStore_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfusEntityStore, example, pagination);
        try{
            ExampleUtils.parseExample(hfusEntityStore, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfusEntityStore> list = iHfusEntityStoreSV.getHfusEntityStoreListByExample(example);
            pagination.setTotalCount(iHfusEntityStoreSV.getHfusEntityStoreCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }



    /**
     * 查询展示常用实体库明细
     * @param hfusEntityStore
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfusEntityStore") HfusEntityStore hfusEntityStore){
        logger.debug("request : {},{}", hfusEntityStore.getHfusEntityStoreId(), hfusEntityStore);
        try{
            HfusEntityStore result = null;
            if(hfusEntityStore.getHfusEntityStoreId() != null) {
                result = iHfusEntityStoreSV.getHfusEntityStoreByPK(hfusEntityStore.getHfusEntityStoreId());
            }else {
                HfusEntityStore_Example example = ExampleUtils.parseExample(hfusEntityStore, HfusEntityStore_Example.class);
                List<HfusEntityStore> list = iHfusEntityStoreSV.getHfusEntityStoreListByExample(example);
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
    * 搜索一个常用实体库
    * @param  hfusEntityStore
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute(" hfusEntityStore") HfusEntityStore  hfusEntityStore){
        logger.debug("request : {}",  hfusEntityStore);
        try{
            HfusEntityStore result = null;
            if(hfusEntityStore.getHfusEntityStoreId() != null) {
                result =  iHfusEntityStoreSV.getHfusEntityStoreByPK(hfusEntityStore.getHfusEntityStoreId());
            }else {
                HfusEntityStore_Example example = ExampleUtils.parseExample( hfusEntityStore, HfusEntityStore_Example.class);

                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfusEntityStore> list =  iHfusEntityStoreSV.getHfusEntityStoreListByExample(example);
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
    * 创建常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfusEntityStore") HfusEntityStore hfusEntityStore) {
        logger.debug("request : {}", hfusEntityStore);
        try {
            ControllerHelper.setDefaultValue(hfusEntityStore, "hfusEntityStoreId");
            int result = iHfusEntityStoreSV.create(hfusEntityStore);
            if(result > 0) {
                return ResultData.success(hfusEntityStore);
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
    * 批量维护常用实体库
    * @param hfusEntityStores
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfusEntityStore[] hfusEntityStores) {
        logger.debug("request : {}", hfusEntityStores);

        try {
            ControllerHelper.setDefaultValue(hfusEntityStores, "hfusEntityStoreId");
            ControllerHelper.reorderProperty(hfusEntityStores);

            int result = iHfusEntityStoreSV.batchOperate(hfusEntityStores);
            if(result > 0) {
                return ResultData.success(hfusEntityStores);
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
    * 更新常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfusEntityStore") HfusEntityStore hfusEntityStore) {
        logger.debug("request : {}", hfusEntityStore);
        try {
            ControllerHelper.setDefaultValue(hfusEntityStore, "hfusEntityStoreId");
            int result = iHfusEntityStoreSV.update(hfusEntityStore);
            if(result > 0) {
                return ResultData.success(hfusEntityStore);
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
    * 创建或更新常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/saveOrUpdateByAjax.json")
    @ResponseBody
    public ResultData saveOrUpdate(@ModelAttribute("hfusEntityStore") HfusEntityStore hfusEntityStore) {
        logger.debug("request : {}", hfusEntityStore);
        try {
            ControllerHelper.setDefaultValue(hfusEntityStore, "hfusEntityStoreId");
            int result = iHfusEntityStoreSV.batchOperate(new HfusEntityStore[]{hfusEntityStore});
            if(result > 0) {
                return ResultData.success(hfusEntityStore);
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
    * 删除常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfusEntityStore") HfusEntityStore hfusEntityStore) {
        logger.debug("request : {}", hfusEntityStore);

        try {
            ControllerHelper.setDefaultValue(hfusEntityStore, "hfusEntityStoreId");
            int result = iHfusEntityStoreSV.delete(hfusEntityStore);
            if(result > 0) {
                return ResultData.success(hfusEntityStore);
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
 	
	public IHfusEntityStoreSV getIHfusEntityStoreSV(){
		return iHfusEntityStoreSV;
	}
	//setter
	public void setIHfusEntityStoreSV(IHfusEntityStoreSV iHfusEntityStoreSV){
    	this.iHfusEntityStoreSV = iHfusEntityStoreSV;
    }
}
