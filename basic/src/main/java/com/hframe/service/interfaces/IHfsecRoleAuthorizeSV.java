package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfsecRoleAuthorize;
import com.hframe.domain.model.HfsecRoleAuthorize_Example;


public interface IHfsecRoleAuthorizeSV   {

  
    /**
    * 创建角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Exception
    */
    public int create(HfsecRoleAuthorize hfsecRoleAuthorize) throws  Exception;

    /**
    * 批量维护角色授权
    * @param hfsecRoleAuthorizes
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecRoleAuthorize[] hfsecRoleAuthorizes) throws  Exception;
    /**
    * 更新角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Exception
    */
    public int update(HfsecRoleAuthorize hfsecRoleAuthorize) throws  Exception;

    /**
    * 通过查询对象更新角色授权
    * @param hfsecRoleAuthorize
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecRoleAuthorize hfsecRoleAuthorize, HfsecRoleAuthorize_Example example) throws  Exception;

    /**
    * 删除角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Exception
    */
    public int delete(HfsecRoleAuthorize hfsecRoleAuthorize) throws  Exception;


    /**
    * 删除角色授权
    * @param hfsecRoleAuthorizeId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecRoleAuthorizeId) throws  Exception;


    /**
    * 查找所有角色授权
    * @return
    */
    public List<HfsecRoleAuthorize> getHfsecRoleAuthorizeAll()  throws  Exception;

    /**
    * 通过角色授权ID查询角色授权
    * @param hfsecRoleAuthorizeId
    * @return
    * @throws Exception
    */
    public HfsecRoleAuthorize getHfsecRoleAuthorizeByPK(long hfsecRoleAuthorizeId)  throws  Exception;

    /**
    * 通过MAP参数查询角色授权
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecRoleAuthorize> getHfsecRoleAuthorizeListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询角色授权
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecRoleAuthorize> getHfsecRoleAuthorizeListByExample(HfsecRoleAuthorize_Example example) throws  Exception;


    /**
    * 通过MAP参数查询角色授权数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecRoleAuthorizeCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询角色授权数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecRoleAuthorizeCountByExample(HfsecRoleAuthorize_Example example) throws  Exception;


 }
