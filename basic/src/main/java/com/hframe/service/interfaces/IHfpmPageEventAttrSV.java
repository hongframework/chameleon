package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmPageEventAttr;
import com.hframe.domain.model.HfpmPageEventAttr_Example;


public interface IHfpmPageEventAttrSV   {

  
    /**
    * 创建事件属性
    * @param hfpmPageEventAttr
    * @return
    * @throws Exception
    */
    public int create(HfpmPageEventAttr hfpmPageEventAttr) throws  Exception;

    /**
    * 批量维护事件属性
    * @param hfpmPageEventAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPageEventAttr[] hfpmPageEventAttrs) throws  Exception;
    /**
    * 更新事件属性
    * @param hfpmPageEventAttr
    * @return
    * @throws Exception
    */
    public int update(HfpmPageEventAttr hfpmPageEventAttr) throws  Exception;

    /**
    * 通过查询对象更新事件属性
    * @param hfpmPageEventAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPageEventAttr hfpmPageEventAttr, HfpmPageEventAttr_Example example) throws  Exception;

    /**
    * 删除事件属性
    * @param hfpmPageEventAttr
    * @return
    * @throws Exception
    */
    public int delete(HfpmPageEventAttr hfpmPageEventAttr) throws  Exception;


    /**
    * 删除事件属性
    * @param hfpmPageEventAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageEventAttrId) throws  Exception;


    /**
    * 查找所有事件属性
    * @return
    */
    public List<HfpmPageEventAttr> getHfpmPageEventAttrAll()  throws  Exception;

    /**
    * 通过事件属性ID查询事件属性
    * @param hfpmPageEventAttrId
    * @return
    * @throws Exception
    */
    public HfpmPageEventAttr getHfpmPageEventAttrByPK(long hfpmPageEventAttrId)  throws  Exception;

    /**
    * 通过MAP参数查询事件属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPageEventAttr> getHfpmPageEventAttrListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询事件属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPageEventAttr> getHfpmPageEventAttrListByExample(HfpmPageEventAttr_Example example) throws  Exception;

    /**
    * 通过MAP参数查询事件属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageEventAttrCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询事件属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageEventAttrCountByExample(HfpmPageEventAttr_Example example) throws  Exception;


 }
