package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfsecUserAuthorize;
import com.hframe.domain.model.HfsecUserAuthorize_Example;


public interface IHfsecUserAuthorizeSV   {

  
    /**
    * 创建用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Exception
    */
    public int create(HfsecUserAuthorize hfsecUserAuthorize) throws  Exception;

    /**
    * 批量维护用户授权
    * @param hfsecUserAuthorizes
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecUserAuthorize[] hfsecUserAuthorizes) throws  Exception;
    /**
    * 更新用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Exception
    */
    public int update(HfsecUserAuthorize hfsecUserAuthorize) throws  Exception;

    /**
    * 通过查询对象更新用户授权
    * @param hfsecUserAuthorize
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecUserAuthorize hfsecUserAuthorize, HfsecUserAuthorize_Example example) throws  Exception;

    /**
    * 删除用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Exception
    */
    public int delete(HfsecUserAuthorize hfsecUserAuthorize) throws  Exception;


    /**
    * 删除用户授权
    * @param hfsecUserAuthorizeId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecUserAuthorizeId) throws  Exception;


    /**
    * 查找所有用户授权
    * @return
    */
    public List<HfsecUserAuthorize> getHfsecUserAuthorizeAll()  throws  Exception;

    /**
    * 通过用户授权ID查询用户授权
    * @param hfsecUserAuthorizeId
    * @return
    * @throws Exception
    */
    public HfsecUserAuthorize getHfsecUserAuthorizeByPK(long hfsecUserAuthorizeId)  throws  Exception;

    /**
    * 通过MAP参数查询用户授权
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecUserAuthorize> getHfsecUserAuthorizeListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询用户授权
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecUserAuthorize> getHfsecUserAuthorizeListByExample(HfsecUserAuthorize_Example example) throws  Exception;


    /**
    * 通过MAP参数查询用户授权数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecUserAuthorizeCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询用户授权数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecUserAuthorizeCountByExample(HfsecUserAuthorize_Example example) throws  Exception;


 }
