package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfmdEntityAttr;
import com.hframe.domain.model.HfmdEntityAttr_Example;


public interface IHfmdEntityAttrSV   {

  
    /**
    * 创建实体属性
    * @param hfmdEntityAttr
    * @return
    * @throws Exception
    */
    public int create(HfmdEntityAttr hfmdEntityAttr) throws  Exception;

    /**
    * 批量维护实体属性
    * @param hfmdEntityAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEntityAttr[] hfmdEntityAttrs) throws  Exception;
    /**
    * 更新实体属性
    * @param hfmdEntityAttr
    * @return
    * @throws Exception
    */
    public int update(HfmdEntityAttr hfmdEntityAttr) throws  Exception;

    /**
    * 通过查询对象更新实体属性
    * @param hfmdEntityAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEntityAttr hfmdEntityAttr, HfmdEntityAttr_Example example) throws  Exception;

    /**
    * 删除实体属性
    * @param hfmdEntityAttr
    * @return
    * @throws Exception
    */
    public int delete(HfmdEntityAttr hfmdEntityAttr) throws  Exception;


    /**
    * 删除实体属性
    * @param hfmdEntityAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEntityAttrId) throws  Exception;


    /**
    * 查找所有实体属性
    * @return
    */
    public List<HfmdEntityAttr> getHfmdEntityAttrAll()  throws  Exception;

    /**
    * 通过实体属性ID查询实体属性
    * @param hfmdEntityAttrId
    * @return
    * @throws Exception
    */
    public HfmdEntityAttr getHfmdEntityAttrByPK(long hfmdEntityAttrId)  throws  Exception;

    /**
    * 通过MAP参数查询实体属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEntityAttr> getHfmdEntityAttrListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEntityAttr> getHfmdEntityAttrListByExample(HfmdEntityAttr_Example example) throws  Exception;

    /**
    * 通过MAP参数查询实体属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEntityAttrCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEntityAttrCountByExample(HfmdEntityAttr_Example example) throws  Exception;


 }
