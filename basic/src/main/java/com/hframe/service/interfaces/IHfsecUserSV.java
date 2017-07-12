package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfsecUser;
import com.hframe.domain.model.HfsecUser_Example;


public interface IHfsecUserSV   {

  
    /**
    * 创建用户
    * @param hfsecUser
    * @return
    * @throws Exception
    */
    public int create(HfsecUser hfsecUser) throws  Exception;

    /**
    * 批量维护用户
    * @param hfsecUsers
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecUser[] hfsecUsers) throws  Exception;
    /**
    * 更新用户
    * @param hfsecUser
    * @return
    * @throws Exception
    */
    public int update(HfsecUser hfsecUser) throws  Exception;

    /**
    * 通过查询对象更新用户
    * @param hfsecUser
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecUser hfsecUser, HfsecUser_Example example) throws  Exception;

    /**
    * 删除用户
    * @param hfsecUser
    * @return
    * @throws Exception
    */
    public int delete(HfsecUser hfsecUser) throws  Exception;


    /**
    * 删除用户
    * @param hfsecUserId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecUserId) throws  Exception;


    /**
    * 查找所有用户
    * @return
    */
    public List<HfsecUser> getHfsecUserAll()  throws  Exception;

    /**
    * 通过用户ID查询用户
    * @param hfsecUserId
    * @return
    * @throws Exception
    */
    public HfsecUser getHfsecUserByPK(long hfsecUserId)  throws  Exception;

    /**
    * 通过MAP参数查询用户
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecUser> getHfsecUserListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询用户
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecUser> getHfsecUserListByExample(HfsecUser_Example example) throws  Exception;


    /**
    * 通过MAP参数查询用户数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecUserCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询用户数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecUserCountByExample(HfsecUser_Example example) throws  Exception;


 }
