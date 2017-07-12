package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfusEntityTypeRelatEntityAttr;
import com.hframe.domain.model.HfusEntityTypeRelatEntityAttr_Example;


public interface IHfusEntityTypeRelatEntityAttrSV   {

  
    /**
    * 创建常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @return
    * @throws Exception
    */
    public int create(HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr) throws  Exception;

    /**
    * 批量维护常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusEntityTypeRelatEntityAttr[] hfusEntityTypeRelatEntityAttrs) throws  Exception;
    /**
    * 更新常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @return
    * @throws Exception
    */
    public int update(HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr) throws  Exception;

    /**
    * 通过查询对象更新常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr, HfusEntityTypeRelatEntityAttr_Example example) throws  Exception;

    /**
    * 删除常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @return
    * @throws Exception
    */
    public int delete(HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr) throws  Exception;


    /**
    * 删除常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfusEntityTypeRelatEntityAttrId) throws  Exception;


    /**
    * 查找所有常用实体类型关联属性
    * @return
    */
    public List<HfusEntityTypeRelatEntityAttr> getHfusEntityTypeRelatEntityAttrAll()  throws  Exception;

    /**
    * 通过常用实体类型关联属性ID查询常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttrId
    * @return
    * @throws Exception
    */
    public HfusEntityTypeRelatEntityAttr getHfusEntityTypeRelatEntityAttrByPK(long hfusEntityTypeRelatEntityAttrId)  throws  Exception;

    /**
    * 通过MAP参数查询常用实体类型关联属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusEntityTypeRelatEntityAttr> getHfusEntityTypeRelatEntityAttrListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用实体类型关联属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusEntityTypeRelatEntityAttr> getHfusEntityTypeRelatEntityAttrListByExample(HfusEntityTypeRelatEntityAttr_Example example) throws  Exception;

    /**
    * 通过MAP参数查询常用实体类型关联属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusEntityTypeRelatEntityAttrCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用实体类型关联属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusEntityTypeRelatEntityAttrCountByExample(HfusEntityTypeRelatEntityAttr_Example example) throws  Exception;


 }
