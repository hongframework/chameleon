package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfcfgComponentTemplate;
import com.hframe.domain.model.HfcfgComponentTemplate_Example;


public interface IHfcfgComponentTemplateSV   {

  
    /**
    * 创建
    * @param hfcfgComponentTemplate
    * @return
    * @throws Exception
    */
    public int create(HfcfgComponentTemplate hfcfgComponentTemplate) throws  Exception;

    /**
    * 批量维护
    * @param hfcfgComponentTemplates
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgComponentTemplate[] hfcfgComponentTemplates) throws  Exception;
    /**
    * 更新
    * @param hfcfgComponentTemplate
    * @return
    * @throws Exception
    */
    public int update(HfcfgComponentTemplate hfcfgComponentTemplate) throws  Exception;

    /**
    * 通过查询对象更新
    * @param hfcfgComponentTemplate
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgComponentTemplate hfcfgComponentTemplate, HfcfgComponentTemplate_Example example) throws  Exception;

    /**
    * 删除
    * @param hfcfgComponentTemplate
    * @return
    * @throws Exception
    */
    public int delete(HfcfgComponentTemplate hfcfgComponentTemplate) throws  Exception;


    /**
    * 删除
    * @param hfcfgComponentTemplateId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgComponentTemplateId) throws  Exception;


    /**
    * 查找所有
    * @return
    */
    public List<HfcfgComponentTemplate> getHfcfgComponentTemplateAll()  throws  Exception;

    /**
    * 通过ID查询
    * @param hfcfgComponentTemplateId
    * @return
    * @throws Exception
    */
    public HfcfgComponentTemplate getHfcfgComponentTemplateByPK(long hfcfgComponentTemplateId)  throws  Exception;

    /**
    * 通过MAP参数查询
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgComponentTemplate> getHfcfgComponentTemplateListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgComponentTemplate> getHfcfgComponentTemplateListByExample(HfcfgComponentTemplate_Example example) throws  Exception;


    /**
    * 通过MAP参数查询数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgComponentTemplateCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgComponentTemplateCountByExample(HfcfgComponentTemplate_Example example) throws  Exception;


 }
