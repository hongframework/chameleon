package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmPage;
import com.hframe.domain.model.HfpmPage_Example;


public interface IHfpmPageSV   {

  
    /**
    * 创建椤甸潰
    * @param hfpmPage
    * @return
    * @throws Exception
    */
    public int create(HfpmPage hfpmPage) throws  Exception;

    /**
    * 批量维护椤甸潰
    * @param hfpmPages
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPage[] hfpmPages) throws  Exception;
    /**
    * 更新椤甸潰
    * @param hfpmPage
    * @return
    * @throws Exception
    */
    public int update(HfpmPage hfpmPage) throws  Exception;

    /**
    * 通过查询对象更新椤甸潰
    * @param hfpmPage
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPage hfpmPage, HfpmPage_Example example) throws  Exception;

    /**
    * 删除椤甸潰
    * @param hfpmPage
    * @return
    * @throws Exception
    */
    public int delete(HfpmPage hfpmPage) throws  Exception;


    /**
    * 删除椤甸潰
    * @param hfpmPageId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageId) throws  Exception;


    /**
    * 查找所有椤甸潰
    * @return
    */
    public List<HfpmPage> getHfpmPageAll()  throws  Exception;

    /**
    * 通过椤甸潰ID查询椤甸潰
    * @param hfpmPageId
    * @return
    * @throws Exception
    */
    public HfpmPage getHfpmPageByPK(long hfpmPageId)  throws  Exception;

    /**
    * 通过MAP参数查询椤甸潰
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPage> getHfpmPageListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询椤甸潰
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPage> getHfpmPageListByExample(HfpmPage_Example example) throws  Exception;


    /**
    * 通过MAP参数查询椤甸潰数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询椤甸潰数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageCountByExample(HfpmPage_Example example) throws  Exception;


 }
