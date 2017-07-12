package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfcfgLoginPage;
import com.hframe.domain.model.HfcfgLoginPage_Example;


public interface IHfcfgLoginPageSV   {

  
    /**
    * 创建登陆页
    * @param hfcfgLoginPage
    * @return
    * @throws Exception
    */
    public int create(HfcfgLoginPage hfcfgLoginPage) throws  Exception;

    /**
    * 批量维护登陆页
    * @param hfcfgLoginPages
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgLoginPage[] hfcfgLoginPages) throws  Exception;
    /**
    * 更新登陆页
    * @param hfcfgLoginPage
    * @return
    * @throws Exception
    */
    public int update(HfcfgLoginPage hfcfgLoginPage) throws  Exception;

    /**
    * 通过查询对象更新登陆页
    * @param hfcfgLoginPage
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgLoginPage hfcfgLoginPage, HfcfgLoginPage_Example example) throws  Exception;

    /**
    * 删除登陆页
    * @param hfcfgLoginPage
    * @return
    * @throws Exception
    */
    public int delete(HfcfgLoginPage hfcfgLoginPage) throws  Exception;


    /**
    * 删除登陆页
    * @param hfcfgLoginPageId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgLoginPageId) throws  Exception;


    /**
    * 查找所有登陆页
    * @return
    */
    public List<HfcfgLoginPage> getHfcfgLoginPageAll()  throws  Exception;

    /**
    * 通过登陆页ID查询登陆页
    * @param hfcfgLoginPageId
    * @return
    * @throws Exception
    */
    public HfcfgLoginPage getHfcfgLoginPageByPK(long hfcfgLoginPageId)  throws  Exception;

    /**
    * 通过MAP参数查询登陆页
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgLoginPage> getHfcfgLoginPageListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询登陆页
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgLoginPage> getHfcfgLoginPageListByExample(HfcfgLoginPage_Example example) throws  Exception;

    /**
    * 通过MAP参数查询登陆页数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgLoginPageCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询登陆页数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgLoginPageCountByExample(HfcfgLoginPage_Example example) throws  Exception;


 }
