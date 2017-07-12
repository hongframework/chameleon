package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfcfgDbConnect;
import com.hframe.domain.model.HfcfgDbConnect_Example;


public interface IHfcfgDbConnectSV   {

  
    /**
    * 创建
    * @param hfcfgDbConnect
    * @return
    * @throws Exception
    */
    public int create(HfcfgDbConnect hfcfgDbConnect) throws  Exception;

    /**
    * 批量维护
    * @param hfcfgDbConnects
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgDbConnect[] hfcfgDbConnects) throws  Exception;
    /**
    * 更新
    * @param hfcfgDbConnect
    * @return
    * @throws Exception
    */
    public int update(HfcfgDbConnect hfcfgDbConnect) throws  Exception;

    /**
    * 通过查询对象更新
    * @param hfcfgDbConnect
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgDbConnect hfcfgDbConnect, HfcfgDbConnect_Example example) throws  Exception;

    /**
    * 删除
    * @param hfcfgDbConnect
    * @return
    * @throws Exception
    */
    public int delete(HfcfgDbConnect hfcfgDbConnect) throws  Exception;


    /**
    * 删除
    * @param hfcfgDbConnectId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgDbConnectId) throws  Exception;


    /**
    * 查找所有
    * @return
    */
    public List<HfcfgDbConnect> getHfcfgDbConnectAll()  throws  Exception;

    /**
    * 通过ID查询
    * @param hfcfgDbConnectId
    * @return
    * @throws Exception
    */
    public HfcfgDbConnect getHfcfgDbConnectByPK(long hfcfgDbConnectId)  throws  Exception;

    /**
    * 通过MAP参数查询
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgDbConnect> getHfcfgDbConnectListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgDbConnect> getHfcfgDbConnectListByExample(HfcfgDbConnect_Example example) throws  Exception;


    /**
    * 通过MAP参数查询数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgDbConnectCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgDbConnectCountByExample(HfcfgDbConnect_Example example) throws  Exception;


 }
