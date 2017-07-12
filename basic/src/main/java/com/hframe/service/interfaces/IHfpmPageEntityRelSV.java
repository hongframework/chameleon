package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmPageEntityRel;
import com.hframe.domain.model.HfpmPageEntityRel_Example;


public interface IHfpmPageEntityRelSV   {

  
    /**
    * 创建页面关联实体
    * @param hfpmPageEntityRel
    * @return
    * @throws Exception
    */
    public int create(HfpmPageEntityRel hfpmPageEntityRel) throws  Exception;

    /**
    * 批量维护页面关联实体
    * @param hfpmPageEntityRels
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPageEntityRel[] hfpmPageEntityRels) throws  Exception;
    /**
    * 更新页面关联实体
    * @param hfpmPageEntityRel
    * @return
    * @throws Exception
    */
    public int update(HfpmPageEntityRel hfpmPageEntityRel) throws  Exception;

    /**
    * 通过查询对象更新页面关联实体
    * @param hfpmPageEntityRel
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPageEntityRel hfpmPageEntityRel, HfpmPageEntityRel_Example example) throws  Exception;

    /**
    * 删除页面关联实体
    * @param hfpmPageEntityRel
    * @return
    * @throws Exception
    */
    public int delete(HfpmPageEntityRel hfpmPageEntityRel) throws  Exception;


    /**
    * 删除页面关联实体
    * @param hfpmPageEntityRelId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageEntityRelId) throws  Exception;


    /**
    * 查找所有页面关联实体
    * @return
    */
    public List<HfpmPageEntityRel> getHfpmPageEntityRelAll()  throws  Exception;

    /**
    * 通过页面关联实体ID查询页面关联实体
    * @param hfpmPageEntityRelId
    * @return
    * @throws Exception
    */
    public HfpmPageEntityRel getHfpmPageEntityRelByPK(long hfpmPageEntityRelId)  throws  Exception;

    /**
    * 通过MAP参数查询页面关联实体
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPageEntityRel> getHfpmPageEntityRelListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询页面关联实体
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPageEntityRel> getHfpmPageEntityRelListByExample(HfpmPageEntityRel_Example example) throws  Exception;

    /**
    * 通过MAP参数查询页面关联实体数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageEntityRelCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询页面关联实体数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageEntityRelCountByExample(HfpmPageEntityRel_Example example) throws  Exception;


 }
