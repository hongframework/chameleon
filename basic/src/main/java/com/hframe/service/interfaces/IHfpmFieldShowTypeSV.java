package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmFieldShowType;
import com.hframe.domain.model.HfpmFieldShowType_Example;


public interface IHfpmFieldShowTypeSV   {

  
    /**
    * 创建列展示类型
    * @param hfpmFieldShowType
    * @return
    * @throws Exception
    */
    public int create(HfpmFieldShowType hfpmFieldShowType) throws  Exception;

    /**
    * 批量维护列展示类型
    * @param hfpmFieldShowTypes
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmFieldShowType[] hfpmFieldShowTypes) throws  Exception;
    /**
    * 更新列展示类型
    * @param hfpmFieldShowType
    * @return
    * @throws Exception
    */
    public int update(HfpmFieldShowType hfpmFieldShowType) throws  Exception;

    /**
    * 通过查询对象更新列展示类型
    * @param hfpmFieldShowType
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmFieldShowType hfpmFieldShowType, HfpmFieldShowType_Example example) throws  Exception;

    /**
    * 删除列展示类型
    * @param hfpmFieldShowType
    * @return
    * @throws Exception
    */
    public int delete(HfpmFieldShowType hfpmFieldShowType) throws  Exception;


    /**
    * 删除列展示类型
    * @param hfpmFieldShowTypeId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmFieldShowTypeId) throws  Exception;


    /**
    * 查找所有列展示类型
    * @return
    */
    public List<HfpmFieldShowType> getHfpmFieldShowTypeAll()  throws  Exception;

    /**
    * 通过列展示类型ID查询列展示类型
    * @param hfpmFieldShowTypeId
    * @return
    * @throws Exception
    */
    public HfpmFieldShowType getHfpmFieldShowTypeByPK(long hfpmFieldShowTypeId)  throws  Exception;

    /**
    * 通过MAP参数查询列展示类型
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmFieldShowType> getHfpmFieldShowTypeListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询列展示类型
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmFieldShowType> getHfpmFieldShowTypeListByExample(HfpmFieldShowType_Example example) throws  Exception;

    /**
    * 通过MAP参数查询列展示类型数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmFieldShowTypeCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询列展示类型数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmFieldShowTypeCountByExample(HfpmFieldShowType_Example example) throws  Exception;


 }
