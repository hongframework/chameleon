package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfusEntityAttr;
import com.hframe.domain.model.HfusEntityAttr_Example;


public interface IHfusEntityAttrSV   {

  
    /**
    * 创建常用实体属性
    * @param hfusEntityAttr
    * @return
    * @throws Exception
    */
    public int create(HfusEntityAttr hfusEntityAttr) throws  Exception;

    /**
    * 批量维护常用实体属性
    * @param hfusEntityAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusEntityAttr[] hfusEntityAttrs) throws  Exception;
    /**
    * 更新常用实体属性
    * @param hfusEntityAttr
    * @return
    * @throws Exception
    */
    public int update(HfusEntityAttr hfusEntityAttr) throws  Exception;

    /**
    * 通过查询对象更新常用实体属性
    * @param hfusEntityAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusEntityAttr hfusEntityAttr, HfusEntityAttr_Example example) throws  Exception;

    /**
    * 删除常用实体属性
    * @param hfusEntityAttr
    * @return
    * @throws Exception
    */
    public int delete(HfusEntityAttr hfusEntityAttr) throws  Exception;


    /**
    * 删除常用实体属性
    * @param hfusEntityAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfusEntityAttrId) throws  Exception;


    /**
    * 查找所有常用实体属性
    * @return
    */
    public List<HfusEntityAttr> getHfusEntityAttrAll()  throws  Exception;

    /**
    * 通过常用实体属性ID查询常用实体属性
    * @param hfusEntityAttrId
    * @return
    * @throws Exception
    */
    public HfusEntityAttr getHfusEntityAttrByPK(long hfusEntityAttrId)  throws  Exception;

    /**
    * 通过MAP参数查询常用实体属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusEntityAttr> getHfusEntityAttrListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用实体属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusEntityAttr> getHfusEntityAttrListByExample(HfusEntityAttr_Example example) throws  Exception;

    /**
    * 通过MAP参数查询常用实体属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusEntityAttrCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用实体属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusEntityAttrCountByExample(HfusEntityAttr_Example example) throws  Exception;


 }
