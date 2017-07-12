package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfcfgProgramTemplate;
import com.hframe.domain.model.HfcfgProgramTemplate_Example;


public interface IHfcfgProgramTemplateSV   {

  
    /**
    * 创建项目模板
    * @param hfcfgProgramTemplate
    * @return
    * @throws Exception
    */
    public int create(HfcfgProgramTemplate hfcfgProgramTemplate) throws  Exception;

    /**
    * 批量维护项目模板
    * @param hfcfgProgramTemplates
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgProgramTemplate[] hfcfgProgramTemplates) throws  Exception;
    /**
    * 更新项目模板
    * @param hfcfgProgramTemplate
    * @return
    * @throws Exception
    */
    public int update(HfcfgProgramTemplate hfcfgProgramTemplate) throws  Exception;

    /**
    * 通过查询对象更新项目模板
    * @param hfcfgProgramTemplate
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgProgramTemplate hfcfgProgramTemplate, HfcfgProgramTemplate_Example example) throws  Exception;

    /**
    * 删除项目模板
    * @param hfcfgProgramTemplate
    * @return
    * @throws Exception
    */
    public int delete(HfcfgProgramTemplate hfcfgProgramTemplate) throws  Exception;


    /**
    * 删除项目模板
    * @param hfcfgProgramTemplateId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgProgramTemplateId) throws  Exception;


    /**
    * 查找所有项目模板
    * @return
    */
    public List<HfcfgProgramTemplate> getHfcfgProgramTemplateAll()  throws  Exception;

    /**
    * 通过项目模板ID查询项目模板
    * @param hfcfgProgramTemplateId
    * @return
    * @throws Exception
    */
    public HfcfgProgramTemplate getHfcfgProgramTemplateByPK(long hfcfgProgramTemplateId)  throws  Exception;

    /**
    * 通过MAP参数查询项目模板
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgProgramTemplate> getHfcfgProgramTemplateListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询项目模板
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgProgramTemplate> getHfcfgProgramTemplateListByExample(HfcfgProgramTemplate_Example example) throws  Exception;

    /**
    * 通过MAP参数查询项目模板数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgProgramTemplateCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询项目模板数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgProgramTemplateCountByExample(HfcfgProgramTemplate_Example example) throws  Exception;


 }
