package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfusEntityStore;
import com.hframe.domain.model.HfusEntityStore_Example;


public interface IHfusEntityStoreSV   {

  
    /**
    * 创建常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Exception
    */
    public int create(HfusEntityStore hfusEntityStore) throws  Exception;

    /**
    * 批量维护常用实体库
    * @param hfusEntityStores
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusEntityStore[] hfusEntityStores) throws  Exception;
    /**
    * 更新常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Exception
    */
    public int update(HfusEntityStore hfusEntityStore) throws  Exception;

    /**
    * 通过查询对象更新常用实体库
    * @param hfusEntityStore
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusEntityStore hfusEntityStore, HfusEntityStore_Example example) throws  Exception;

    /**
    * 删除常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Exception
    */
    public int delete(HfusEntityStore hfusEntityStore) throws  Exception;


    /**
    * 删除常用实体库
    * @param hfusEntityStoreId
    * @return
    * @throws Exception
    */
    public int delete(long hfusEntityStoreId) throws  Exception;


    /**
    * 查找所有常用实体库
    * @return
    */
    public List<HfusEntityStore> getHfusEntityStoreAll()  throws  Exception;

    /**
    * 通过常用实体库ID查询常用实体库
    * @param hfusEntityStoreId
    * @return
    * @throws Exception
    */
    public HfusEntityStore getHfusEntityStoreByPK(long hfusEntityStoreId)  throws  Exception;

    /**
    * 通过MAP参数查询常用实体库
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusEntityStore> getHfusEntityStoreListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用实体库
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusEntityStore> getHfusEntityStoreListByExample(HfusEntityStore_Example example) throws  Exception;


    /**
    * 通过MAP参数查询常用实体库数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusEntityStoreCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用实体库数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusEntityStoreCountByExample(HfusEntityStore_Example example) throws  Exception;


 }
