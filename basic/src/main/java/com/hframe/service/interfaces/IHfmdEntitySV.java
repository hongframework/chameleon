package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfmdEntity;
import com.hframe.domain.model.HfmdEntity_Example;


public interface IHfmdEntitySV   {

  
    /**
    * 创建实体
    * @param hfmdEntity
    * @return
    * @throws Exception
    */
    public int create(HfmdEntity hfmdEntity) throws  Exception;

    /**
    * 批量维护实体
    * @param hfmdEntitys
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEntity[] hfmdEntitys) throws  Exception;
    /**
    * 更新实体
    * @param hfmdEntity
    * @return
    * @throws Exception
    */
    public int update(HfmdEntity hfmdEntity) throws  Exception;

    /**
    * 通过查询对象更新实体
    * @param hfmdEntity
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEntity hfmdEntity, HfmdEntity_Example example) throws  Exception;

    /**
    * 删除实体
    * @param hfmdEntity
    * @return
    * @throws Exception
    */
    public int delete(HfmdEntity hfmdEntity) throws  Exception;


    /**
    * 删除实体
    * @param hfmdEntityId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEntityId) throws  Exception;


    /**
    * 查找所有实体
    * @return
    */
    public List<HfmdEntity> getHfmdEntityAll()  throws  Exception;

    /**
    * 通过实体ID查询实体
    * @param hfmdEntityId
    * @return
    * @throws Exception
    */
    public HfmdEntity getHfmdEntityByPK(long hfmdEntityId)  throws  Exception;

    /**
    * 通过MAP参数查询实体
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEntity> getHfmdEntityListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEntity> getHfmdEntityListByExample(HfmdEntity_Example example) throws  Exception;

    /**
    * 通过MAP参数查询实体数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEntityCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEntityCountByExample(HfmdEntity_Example example) throws  Exception;


 }
