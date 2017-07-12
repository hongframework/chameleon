package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfsecRole;
import com.hframe.domain.model.HfsecRole_Example;


public interface IHfsecRoleSV   {

  
    /**
    * 创建角色
    * @param hfsecRole
    * @return
    * @throws Exception
    */
    public int create(HfsecRole hfsecRole) throws  Exception;

    /**
    * 批量维护角色
    * @param hfsecRoles
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecRole[] hfsecRoles) throws  Exception;
    /**
    * 更新角色
    * @param hfsecRole
    * @return
    * @throws Exception
    */
    public int update(HfsecRole hfsecRole) throws  Exception;

    /**
    * 通过查询对象更新角色
    * @param hfsecRole
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecRole hfsecRole, HfsecRole_Example example) throws  Exception;

    /**
    * 删除角色
    * @param hfsecRole
    * @return
    * @throws Exception
    */
    public int delete(HfsecRole hfsecRole) throws  Exception;


    /**
    * 删除角色
    * @param hfsecRoleId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecRoleId) throws  Exception;


    /**
    * 查找所有角色
    * @return
    */
    public List<HfsecRole> getHfsecRoleAll()  throws  Exception;

    /**
    * 通过角色ID查询角色
    * @param hfsecRoleId
    * @return
    * @throws Exception
    */
    public HfsecRole getHfsecRoleByPK(long hfsecRoleId)  throws  Exception;

    /**
    * 通过MAP参数查询角色
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecRole> getHfsecRoleListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询角色
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecRole> getHfsecRoleListByExample(HfsecRole_Example example) throws  Exception;


    /**
    * 通过MAP参数查询角色数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecRoleCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询角色数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecRoleCountByExample(HfsecRole_Example example) throws  Exception;


 }
