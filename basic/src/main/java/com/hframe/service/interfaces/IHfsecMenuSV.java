package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfsecMenu;
import com.hframe.domain.model.HfsecMenu_Example;


public interface IHfsecMenuSV   {

  
    /**
    * 创建菜单
    * @param hfsecMenu
    * @return
    * @throws Exception
    */
    public int create(HfsecMenu hfsecMenu) throws  Exception;

    /**
    * 批量维护菜单
    * @param hfsecMenus
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecMenu[] hfsecMenus) throws  Exception;
    /**
    * 更新菜单
    * @param hfsecMenu
    * @return
    * @throws Exception
    */
    public int update(HfsecMenu hfsecMenu) throws  Exception;

    /**
    * 通过查询对象更新菜单
    * @param hfsecMenu
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecMenu hfsecMenu, HfsecMenu_Example example) throws  Exception;

    /**
    * 删除菜单
    * @param hfsecMenu
    * @return
    * @throws Exception
    */
    public int delete(HfsecMenu hfsecMenu) throws  Exception;


    /**
    * 删除菜单
    * @param hfsecMenuId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecMenuId) throws  Exception;


    /**
    * 查找所有菜单
    * @return
    */
    public List<HfsecMenu> getHfsecMenuAll()  throws  Exception;

    /**
    * 通过菜单ID查询菜单
    * @param hfsecMenuId
    * @return
    * @throws Exception
    */
    public HfsecMenu getHfsecMenuByPK(long hfsecMenuId)  throws  Exception;

    /**
    * 通过MAP参数查询菜单
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecMenu> getHfsecMenuListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询菜单
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecMenu> getHfsecMenuListByExample(HfsecMenu_Example example) throws  Exception;

    /**
    * 通过父级菜单ID查询菜单树
    * @param hfsecMenu
    * @return
    * @throws Exception
    */
    public Map<Long, List<HfsecMenu>> getHfsecMenuTreeByParentId(HfsecMenu hfsecMenu, HfsecMenu_Example example)  throws  Exception;

    /**
    * 通过MAP参数查询菜单数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecMenuCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询菜单数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecMenuCountByExample(HfsecMenu_Example example) throws  Exception;


 }
