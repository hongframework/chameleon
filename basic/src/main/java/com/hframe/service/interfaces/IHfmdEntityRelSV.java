package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfmdEntityRel;
import com.hframe.domain.model.HfmdEntityRel_Example;


public interface IHfmdEntityRelSV   {

  
    /**
    * 创建实体关系
    * @param hfmdEntityRel
    * @return
    * @throws Exception
    */
    public int create(HfmdEntityRel hfmdEntityRel) throws  Exception;

    /**
    * 批量维护实体关系
    * @param hfmdEntityRels
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEntityRel[] hfmdEntityRels) throws  Exception;
    /**
    * 更新实体关系
    * @param hfmdEntityRel
    * @return
    * @throws Exception
    */
    public int update(HfmdEntityRel hfmdEntityRel) throws  Exception;

    /**
    * 通过查询对象更新实体关系
    * @param hfmdEntityRel
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEntityRel hfmdEntityRel, HfmdEntityRel_Example example) throws  Exception;

    /**
    * 删除实体关系
    * @param hfmdEntityRel
    * @return
    * @throws Exception
    */
    public int delete(HfmdEntityRel hfmdEntityRel) throws  Exception;


    /**
    * 删除实体关系
    * @param hfmdEntityRelId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEntityRelId) throws  Exception;


    /**
    * 查找所有实体关系
    * @return
    */
    public List<HfmdEntityRel> getHfmdEntityRelAll()  throws  Exception;

    /**
    * 通过实体关系ID查询实体关系
    * @param hfmdEntityRelId
    * @return
    * @throws Exception
    */
    public HfmdEntityRel getHfmdEntityRelByPK(long hfmdEntityRelId)  throws  Exception;

    /**
    * 通过MAP参数查询实体关系
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEntityRel> getHfmdEntityRelListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体关系
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEntityRel> getHfmdEntityRelListByExample(HfmdEntityRel_Example example) throws  Exception;

    /**
    * 通过MAP参数查询实体关系数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEntityRelCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体关系数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEntityRelCountByExample(HfmdEntityRel_Example example) throws  Exception;


 }
