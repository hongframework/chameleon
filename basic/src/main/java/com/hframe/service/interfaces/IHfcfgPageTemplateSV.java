package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfcfgPageTemplate;
import com.hframe.domain.model.HfcfgPageTemplate_Example;


public interface IHfcfgPageTemplateSV   {

  
    /**
    * 创建页面模板
    * @param hfcfgPageTemplate
    * @return
    * @throws Exception
    */
    public int create(HfcfgPageTemplate hfcfgPageTemplate) throws  Exception;

    /**
    * 批量维护页面模板
    * @param hfcfgPageTemplates
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgPageTemplate[] hfcfgPageTemplates) throws  Exception;
    /**
    * 更新页面模板
    * @param hfcfgPageTemplate
    * @return
    * @throws Exception
    */
    public int update(HfcfgPageTemplate hfcfgPageTemplate) throws  Exception;

    /**
    * 通过查询对象更新页面模板
    * @param hfcfgPageTemplate
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgPageTemplate hfcfgPageTemplate, HfcfgPageTemplate_Example example) throws  Exception;

    /**
    * 删除页面模板
    * @param hfcfgPageTemplate
    * @return
    * @throws Exception
    */
    public int delete(HfcfgPageTemplate hfcfgPageTemplate) throws  Exception;


    /**
    * 删除页面模板
    * @param hfcfgPageTemplateId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgPageTemplateId) throws  Exception;


    /**
    * 查找所有页面模板
    * @return
    */
    public List<HfcfgPageTemplate> getHfcfgPageTemplateAll()  throws  Exception;

    /**
    * 通过页面模板ID查询页面模板
    * @param hfcfgPageTemplateId
    * @return
    * @throws Exception
    */
    public HfcfgPageTemplate getHfcfgPageTemplateByPK(long hfcfgPageTemplateId)  throws  Exception;

    /**
    * 通过MAP参数查询页面模板
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgPageTemplate> getHfcfgPageTemplateListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询页面模板
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgPageTemplate> getHfcfgPageTemplateListByExample(HfcfgPageTemplate_Example example) throws  Exception;

    /**
    * 通过MAP参数查询页面模板数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgPageTemplateCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询页面模板数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgPageTemplateCountByExample(HfcfgPageTemplate_Example example) throws  Exception;


 }
