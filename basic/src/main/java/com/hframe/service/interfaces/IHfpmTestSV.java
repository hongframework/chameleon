package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmTest;
import com.hframe.domain.model.HfpmTest_Example;


public interface IHfpmTestSV   {

  
    /**
    * 创建
    * @param hfpmTest
    * @return
    * @throws Exception
    */
    public int create(HfpmTest hfpmTest) throws  Exception;

    /**
    * 批量维护
    * @param hfpmTests
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmTest[] hfpmTests) throws  Exception;
    /**
    * 更新
    * @param hfpmTest
    * @return
    * @throws Exception
    */
    public int update(HfpmTest hfpmTest) throws  Exception;

    /**
    * 通过查询对象更新
    * @param hfpmTest
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmTest hfpmTest, HfpmTest_Example example) throws  Exception;

    /**
    * 删除
    * @param hfpmTest
    * @return
    * @throws Exception
    */
    public int delete(HfpmTest hfpmTest) throws  Exception;


    /**
    * 删除
    * @param hfpmTestId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmTestId) throws  Exception;


    /**
    * 查找所有
    * @return
    */
    public List<HfpmTest> getHfpmTestAll()  throws  Exception;

    /**
    * 通过ID查询
    * @param hfpmTestId
    * @return
    * @throws Exception
    */
    public HfpmTest getHfpmTestByPK(long hfpmTestId)  throws  Exception;

    /**
    * 通过MAP参数查询
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmTest> getHfpmTestListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmTest> getHfpmTestListByExample(HfpmTest_Example example) throws  Exception;


    /**
    * 通过MAP参数查询数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmTestCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmTestCountByExample(HfpmTest_Example example) throws  Exception;


 }
