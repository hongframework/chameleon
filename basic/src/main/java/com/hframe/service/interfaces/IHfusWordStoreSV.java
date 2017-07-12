package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfusWordStore;
import com.hframe.domain.model.HfusWordStore_Example;


public interface IHfusWordStoreSV   {

  
    /**
    * 创建单词库
    * @param hfusWordStore
    * @return
    * @throws Exception
    */
    public int create(HfusWordStore hfusWordStore) throws  Exception;

    /**
    * 批量维护单词库
    * @param hfusWordStores
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusWordStore[] hfusWordStores) throws  Exception;
    /**
    * 更新单词库
    * @param hfusWordStore
    * @return
    * @throws Exception
    */
    public int update(HfusWordStore hfusWordStore) throws  Exception;

    /**
    * 通过查询对象更新单词库
    * @param hfusWordStore
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusWordStore hfusWordStore, HfusWordStore_Example example) throws  Exception;

    /**
    * 删除单词库
    * @param hfusWordStore
    * @return
    * @throws Exception
    */
    public int delete(HfusWordStore hfusWordStore) throws  Exception;


    /**
    * 删除单词库
    * @param hfusWordStoreId
    * @return
    * @throws Exception
    */
    public int delete(long hfusWordStoreId) throws  Exception;


    /**
    * 查找所有单词库
    * @return
    */
    public List<HfusWordStore> getHfusWordStoreAll()  throws  Exception;

    /**
    * 通过单词库ID查询单词库
    * @param hfusWordStoreId
    * @return
    * @throws Exception
    */
    public HfusWordStore getHfusWordStoreByPK(long hfusWordStoreId)  throws  Exception;

    /**
    * 通过MAP参数查询单词库
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusWordStore> getHfusWordStoreListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询单词库
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusWordStore> getHfusWordStoreListByExample(HfusWordStore_Example example) throws  Exception;

    /**
    * 通过MAP参数查询单词库数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusWordStoreCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询单词库数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusWordStoreCountByExample(HfusWordStore_Example example) throws  Exception;


 }
