package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfusProgramEntityAttr;
import com.hframe.domain.model.HfusProgramEntityAttr_Example;


public interface IHfusProgramEntityAttrSV   {

  
    /**
    * 创建常用项目实体属性
    * @param hfusProgramEntityAttr
    * @return
    * @throws Exception
    */
    public int create(HfusProgramEntityAttr hfusProgramEntityAttr) throws  Exception;

    /**
    * 批量维护常用项目实体属性
    * @param hfusProgramEntityAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusProgramEntityAttr[] hfusProgramEntityAttrs) throws  Exception;
    /**
    * 更新常用项目实体属性
    * @param hfusProgramEntityAttr
    * @return
    * @throws Exception
    */
    public int update(HfusProgramEntityAttr hfusProgramEntityAttr) throws  Exception;

    /**
    * 通过查询对象更新常用项目实体属性
    * @param hfusProgramEntityAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusProgramEntityAttr hfusProgramEntityAttr, HfusProgramEntityAttr_Example example) throws  Exception;

    /**
    * 删除常用项目实体属性
    * @param hfusProgramEntityAttr
    * @return
    * @throws Exception
    */
    public int delete(HfusProgramEntityAttr hfusProgramEntityAttr) throws  Exception;


    /**
    * 删除常用项目实体属性
    * @param hfusProgramEntityAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfusProgramEntityAttrId) throws  Exception;


    /**
    * 查找所有常用项目实体属性
    * @return
    */
    public List<HfusProgramEntityAttr> getHfusProgramEntityAttrAll()  throws  Exception;

    /**
    * 通过常用项目实体属性ID查询常用项目实体属性
    * @param hfusProgramEntityAttrId
    * @return
    * @throws Exception
    */
    public HfusProgramEntityAttr getHfusProgramEntityAttrByPK(long hfusProgramEntityAttrId)  throws  Exception;

    /**
    * 通过MAP参数查询常用项目实体属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusProgramEntityAttr> getHfusProgramEntityAttrListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用项目实体属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusProgramEntityAttr> getHfusProgramEntityAttrListByExample(HfusProgramEntityAttr_Example example) throws  Exception;

    /**
    * 通过MAP参数查询常用项目实体属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusProgramEntityAttrCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用项目实体属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusProgramEntityAttrCountByExample(HfusProgramEntityAttr_Example example) throws  Exception;


 }
