package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfcfgPageTemplateElements;
import com.hframe.domain.model.HfcfgPageTemplateElements_Example;


public interface IHfcfgPageTemplateElementsSV   {

  
    /**
    * 创建
    * @param hfcfgPageTemplateElements
    * @return
    * @throws Exception
    */
    public int create(HfcfgPageTemplateElements hfcfgPageTemplateElements) throws  Exception;

    /**
    * 批量维护
    * @param hfcfgPageTemplateElementss
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgPageTemplateElements[] hfcfgPageTemplateElementss) throws  Exception;
    /**
    * 更新
    * @param hfcfgPageTemplateElements
    * @return
    * @throws Exception
    */
    public int update(HfcfgPageTemplateElements hfcfgPageTemplateElements) throws  Exception;

    /**
    * 通过查询对象更新
    * @param hfcfgPageTemplateElements
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgPageTemplateElements hfcfgPageTemplateElements, HfcfgPageTemplateElements_Example example) throws  Exception;

    /**
    * 删除
    * @param hfcfgPageTemplateElements
    * @return
    * @throws Exception
    */
    public int delete(HfcfgPageTemplateElements hfcfgPageTemplateElements) throws  Exception;


    /**
    * 删除
    * @param hfcfgPageTemplateElementsId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgPageTemplateElementsId) throws  Exception;


    /**
    * 查找所有
    * @return
    */
    public List<HfcfgPageTemplateElements> getHfcfgPageTemplateElementsAll()  throws  Exception;

    /**
    * 通过ID查询
    * @param hfcfgPageTemplateElementsId
    * @return
    * @throws Exception
    */
    public HfcfgPageTemplateElements getHfcfgPageTemplateElementsByPK(long hfcfgPageTemplateElementsId)  throws  Exception;

    /**
    * 通过MAP参数查询
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgPageTemplateElements> getHfcfgPageTemplateElementsListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgPageTemplateElements> getHfcfgPageTemplateElementsListByExample(HfcfgPageTemplateElements_Example example) throws  Exception;


    /**
    * 通过MAP参数查询数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgPageTemplateElementsCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgPageTemplateElementsCountByExample(HfcfgPageTemplateElements_Example example) throws  Exception;


 }
