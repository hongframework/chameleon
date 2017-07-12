package com.hframe.controller;

import com.hframe.domain.model.HfsecMenu;
import com.hframe.domain.model.HfsecMenu_Example;
import com.hframe.service.interfaces.IHfsecMenuSV;
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
import java.util.Map;

@Controller
@RequestMapping(value = "/hframe/hfsecMenu")
public class HfsecMenuController   {
    private static final Logger logger = LoggerFactory.getLogger(HfsecMenuController.class);

	@Resource
	private IHfsecMenuSV iHfsecMenuSV;
  





    @InitBinder
    protected void initBinder(HttpServletRequest request,
        ServletRequestDataBinder binder) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor editor = new CustomDateEditor(df, false);
        binder.registerCustomEditor(Date.class, editor);
    }

    /**
     * 查询展示菜单列表
     * @param hfsecMenu
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryListByAjax.json")
    @ResponseBody
    public ResultData list(@ModelAttribute("hfsecMenu") HfsecMenu hfsecMenu,
                                      @ModelAttribute("example") HfsecMenu_Example example, Pagination pagination){
        logger.debug("request : {},{},{}", hfsecMenu, example, pagination);
        try{
            ExampleUtils.parseExample(hfsecMenu, example);
            //设置分页信息
            example.setLimitStart(pagination.getStartIndex());
            example.setLimitEnd(pagination.getEndIndex());

            final List< HfsecMenu> list = iHfsecMenuSV.getHfsecMenuListByExample(example);
            pagination.setTotalCount(iHfsecMenuSV.getHfsecMenuCountByExample(example));

            return ResultData.success().add("list",list).add("pagination",pagination);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }


    /**
    * 查询展示菜单树
    * @param hfsecMenu
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/queryTeeByAjax.json")
    @ResponseBody
    public ResultData tree(@ModelAttribute("hfsecMenu") HfsecMenu hfsecMenu,
                           @ModelAttribute("example") HfsecMenu_Example example){
        logger.debug("request : {},{}", hfsecMenu, example);
        try{
            ExampleUtils.parseExample(hfsecMenu, example);

            Map<Long, List< HfsecMenu>> treeMap =
                    iHfsecMenuSV.getHfsecMenuTreeByParentId(hfsecMenu, example);

            return ResultData.success(treeMap);
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }

    /**
     * 搜索一个菜单
     * @param hfsecMenu
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/searchOneByAjax.json")
    @ResponseBody
    public ResultData search(@ModelAttribute("hfsecMenu") HfsecMenu hfsecMenu){
        logger.debug("request : {},{}", hfsecMenu.getHfsecMenuId(), hfsecMenu);
        try{
            HfsecMenu result = null;
            if(hfsecMenu.getHfsecMenuId() != null) {
                result = iHfsecMenuSV.getHfsecMenuByPK(hfsecMenu.getHfsecMenuId());
            }else {
                HfsecMenu_Example example = ExampleUtils.parseExample(hfsecMenu, HfsecMenu_Example.class);
                example.setLimitStart(0);
                example.setLimitEnd(1);

                List<HfsecMenu> hfsecMenuListByExample = iHfsecMenuSV.getHfsecMenuListByExample(example);
                if(hfsecMenuListByExample != null && hfsecMenuListByExample.size() > 0) {
                    result = hfsecMenuListByExample.get(0);
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
     * 查询展示菜单明细
     * @param hfsecMenu
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/queryOneByAjax.json")
    @ResponseBody
    public ResultData detail(@ModelAttribute("hfsecMenu") HfsecMenu hfsecMenu){
        logger.debug("request : {},{}", hfsecMenu.getHfsecMenuId(), hfsecMenu);
        try{
            HfsecMenu result = null;
            if(hfsecMenu.getHfsecMenuId() != null) {
                result = iHfsecMenuSV.getHfsecMenuByPK(hfsecMenu.getHfsecMenuId());
            }else {
                HfsecMenu_Example example = ExampleUtils.parseExample(hfsecMenu, HfsecMenu_Example.class);
                List<HfsecMenu> list = iHfsecMenuSV.getHfsecMenuListByExample(example);
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
    * 创建菜单
    * @param hfsecMenu
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createByAjax.json")
    @ResponseBody
    public ResultData create(@ModelAttribute("hfsecMenu") HfsecMenu hfsecMenu) {
        logger.debug("request : {}", hfsecMenu);
        try {
            ControllerHelper.setDefaultValue(hfsecMenu, "hfsecMenuId");
            int result = iHfsecMenuSV.create(hfsecMenu);
            if(result > 0) {
                return ResultData.success(hfsecMenu);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 批量维护菜单
    * @param hfsecMenus
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/createsByAjax.json")
    @ResponseBody
    public ResultData batchCreate(@RequestBody HfsecMenu[] hfsecMenus) {
        logger.debug("request : {}", hfsecMenus);

        try {
            ControllerHelper.setDefaultValue(hfsecMenus, "hfsecMenuId");
            ControllerHelper.reorderProperty(hfsecMenus);

            int result = iHfsecMenuSV.batchOperate(hfsecMenus);
            if(result > 0) {
                return ResultData.success(hfsecMenus);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 更新菜单
    * @param hfsecMenu
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/updateByAjax.json")
    @ResponseBody
    public ResultData update(@ModelAttribute("hfsecMenu") HfsecMenu hfsecMenu) {
        logger.debug("request : {}", hfsecMenu);
        try {
            ControllerHelper.setDefaultValue(hfsecMenu, "hfsecMenuId");
            int result = iHfsecMenuSV.update(hfsecMenu);
            if(result > 0) {
                return ResultData.success(hfsecMenu);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
        return ResultData.error(ResultCode.UNKNOW);
    }

    /**
    * 删除菜单
    * @param hfsecMenu
    * @return
    * @throws Throwable
    */
    @RequestMapping(value = "/deleteByAjax.json")
    @ResponseBody
    public ResultData delete(@ModelAttribute("hfsecMenu") HfsecMenu hfsecMenu) {
        logger.debug("request : {}", hfsecMenu);

        try {
            ControllerHelper.setDefaultValue(hfsecMenu, "hfsecMenuId");
            int result = iHfsecMenuSV.delete(hfsecMenu);
            if(result > 0) {
                return ResultData.success(hfsecMenu);
            }else {
                return ResultData.error(ResultCode.RECODE_IS_NOT_EXISTS);
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }
    }
  	//getter
 	
	public IHfsecMenuSV getIHfsecMenuSV(){
		return iHfsecMenuSV;
	}
	//setter
	public void setIHfsecMenuSV(IHfsecMenuSV iHfsecMenuSV){
    	this.iHfsecMenuSV = iHfsecMenuSV;
    }
}
