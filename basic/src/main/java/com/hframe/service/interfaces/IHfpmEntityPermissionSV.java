package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmEntityPermission;
import com.hframe.domain.model.HfpmEntityPermission_Example;


public interface IHfpmEntityPermissionSV   {

  
    /**
    * 创建实体权限
    * @param hfpmEntityPermission
    * @return
    * @throws Exception
    */
    public int create(HfpmEntityPermission hfpmEntityPermission) throws  Exception;

    /**
    * 批量维护实体权限
    * @param hfpmEntityPermissions
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmEntityPermission[] hfpmEntityPermissions) throws  Exception;
    /**
    * 更新实体权限
    * @param hfpmEntityPermission
    * @return
    * @throws Exception
    */
    public int update(HfpmEntityPermission hfpmEntityPermission) throws  Exception;

    /**
    * 通过查询对象更新实体权限
    * @param hfpmEntityPermission
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmEntityPermission hfpmEntityPermission, HfpmEntityPermission_Example example) throws  Exception;

    /**
    * 删除实体权限
    * @param hfpmEntityPermission
    * @return
    * @throws Exception
    */
    public int delete(HfpmEntityPermission hfpmEntityPermission) throws  Exception;


    /**
    * 删除实体权限
    * @param hfpmEntityPermissionId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmEntityPermissionId) throws  Exception;


    /**
    * 查找所有实体权限
    * @return
    */
    public List<HfpmEntityPermission> getHfpmEntityPermissionAll()  throws  Exception;

    /**
    * 通过实体权限ID查询实体权限
    * @param hfpmEntityPermissionId
    * @return
    * @throws Exception
    */
    public HfpmEntityPermission getHfpmEntityPermissionByPK(long hfpmEntityPermissionId)  throws  Exception;

    /**
    * 通过MAP参数查询实体权限
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmEntityPermission> getHfpmEntityPermissionListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体权限
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmEntityPermission> getHfpmEntityPermissionListByExample(HfpmEntityPermission_Example example) throws  Exception;

    /**
    * 通过MAP参数查询实体权限数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmEntityPermissionCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体权限数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmEntityPermissionCountByExample(HfpmEntityPermission_Example example) throws  Exception;


 }
