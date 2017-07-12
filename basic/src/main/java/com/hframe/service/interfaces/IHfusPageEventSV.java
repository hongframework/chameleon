package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfusPageEvent;
import com.hframe.domain.model.HfusPageEvent_Example;


public interface IHfusPageEventSV   {

  
    /**
    * 创建常用页面事件
    * @param hfusPageEvent
    * @return
    * @throws Exception
    */
    public int create(HfusPageEvent hfusPageEvent) throws  Exception;

    /**
    * 批量维护常用页面事件
    * @param hfusPageEvents
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusPageEvent[] hfusPageEvents) throws  Exception;
    /**
    * 更新常用页面事件
    * @param hfusPageEvent
    * @return
    * @throws Exception
    */
    public int update(HfusPageEvent hfusPageEvent) throws  Exception;

    /**
    * 通过查询对象更新常用页面事件
    * @param hfusPageEvent
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusPageEvent hfusPageEvent, HfusPageEvent_Example example) throws  Exception;

    /**
    * 删除常用页面事件
    * @param hfusPageEvent
    * @return
    * @throws Exception
    */
    public int delete(HfusPageEvent hfusPageEvent) throws  Exception;


    /**
    * 删除常用页面事件
    * @param hfusPageEventId
    * @return
    * @throws Exception
    */
    public int delete(long hfusPageEventId) throws  Exception;


    /**
    * 查找所有常用页面事件
    * @return
    */
    public List<HfusPageEvent> getHfusPageEventAll()  throws  Exception;

    /**
    * 通过常用页面事件ID查询常用页面事件
    * @param hfusPageEventId
    * @return
    * @throws Exception
    */
    public HfusPageEvent getHfusPageEventByPK(long hfusPageEventId)  throws  Exception;

    /**
    * 通过MAP参数查询常用页面事件
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusPageEvent> getHfusPageEventListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用页面事件
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusPageEvent> getHfusPageEventListByExample(HfusPageEvent_Example example) throws  Exception;

    /**
    * 通过MAP参数查询常用页面事件数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusPageEventCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询常用页面事件数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusPageEventCountByExample(HfusPageEvent_Example example) throws  Exception;


 }
