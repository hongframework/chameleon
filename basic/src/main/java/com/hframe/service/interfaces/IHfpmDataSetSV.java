package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmDataSet;
import com.hframe.domain.model.HfpmDataSet_Example;


public interface IHfpmDataSetSV   {

  
    /**
    * 创建数据集
    * @param hfpmDataSet
    * @return
    * @throws Exception
    */
    public int create(HfpmDataSet hfpmDataSet) throws  Exception;

    /**
    * 批量维护数据集
    * @param hfpmDataSets
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmDataSet[] hfpmDataSets) throws  Exception;
    /**
    * 更新数据集
    * @param hfpmDataSet
    * @return
    * @throws Exception
    */
    public int update(HfpmDataSet hfpmDataSet) throws  Exception;

    /**
    * 通过查询对象更新数据集
    * @param hfpmDataSet
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmDataSet hfpmDataSet, HfpmDataSet_Example example) throws  Exception;

    /**
    * 删除数据集
    * @param hfpmDataSet
    * @return
    * @throws Exception
    */
    public int delete(HfpmDataSet hfpmDataSet) throws  Exception;


    /**
    * 删除数据集
    * @param hfpmDataSetId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmDataSetId) throws  Exception;


    /**
    * 查找所有数据集
    * @return
    */
    public List<HfpmDataSet> getHfpmDataSetAll()  throws  Exception;

    /**
    * 通过数据集ID查询数据集
    * @param hfpmDataSetId
    * @return
    * @throws Exception
    */
    public HfpmDataSet getHfpmDataSetByPK(long hfpmDataSetId)  throws  Exception;

    /**
    * 通过MAP参数查询数据集
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmDataSet> getHfpmDataSetListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询数据集
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmDataSet> getHfpmDataSetListByExample(HfpmDataSet_Example example) throws  Exception;

    /**
    * 通过MAP参数查询数据集数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmDataSetCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询数据集数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmDataSetCountByExample(HfpmDataSet_Example example) throws  Exception;


 }
