package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmPageEvent;
import com.hframe.domain.model.HfpmPageEvent_Example;


public interface IHfpmPageEventSV   {

  
    /**
    * 创建页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Exception
    */
    public int create(HfpmPageEvent hfpmPageEvent) throws  Exception;

    /**
    * 批量维护页面事件
    * @param hfpmPageEvents
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPageEvent[] hfpmPageEvents) throws  Exception;
    /**
    * 更新页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Exception
    */
    public int update(HfpmPageEvent hfpmPageEvent) throws  Exception;

    /**
    * 通过查询对象更新页面事件
    * @param hfpmPageEvent
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPageEvent hfpmPageEvent, HfpmPageEvent_Example example) throws  Exception;

    /**
    * 删除页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Exception
    */
    public int delete(HfpmPageEvent hfpmPageEvent) throws  Exception;


    /**
    * 删除页面事件
    * @param hfpmPageEventId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageEventId) throws  Exception;


    /**
    * 查找所有页面事件
    * @return
    */
    public List<HfpmPageEvent> getHfpmPageEventAll()  throws  Exception;

    /**
    * 通过页面事件ID查询页面事件
    * @param hfpmPageEventId
    * @return
    * @throws Exception
    */
    public HfpmPageEvent getHfpmPageEventByPK(long hfpmPageEventId)  throws  Exception;

    /**
    * 通过MAP参数查询页面事件
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPageEvent> getHfpmPageEventListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询页面事件
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPageEvent> getHfpmPageEventListByExample(HfpmPageEvent_Example example) throws  Exception;


    /**
    * 通过MAP参数查询页面事件数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageEventCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询页面事件数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageEventCountByExample(HfpmPageEvent_Example example) throws  Exception;


 }
