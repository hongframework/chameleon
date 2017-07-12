package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmPageCfg;
import com.hframe.domain.model.HfpmPageCfg_Example;


public interface IHfpmPageCfgSV   {

  
    /**
    * 创建页面配置
    * @param hfpmPageCfg
    * @return
    * @throws Exception
    */
    public int create(HfpmPageCfg hfpmPageCfg) throws  Exception;

    /**
    * 批量维护页面配置
    * @param hfpmPageCfgs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPageCfg[] hfpmPageCfgs) throws  Exception;
    /**
    * 更新页面配置
    * @param hfpmPageCfg
    * @return
    * @throws Exception
    */
    public int update(HfpmPageCfg hfpmPageCfg) throws  Exception;

    /**
    * 通过查询对象更新页面配置
    * @param hfpmPageCfg
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPageCfg hfpmPageCfg, HfpmPageCfg_Example example) throws  Exception;

    /**
    * 删除页面配置
    * @param hfpmPageCfg
    * @return
    * @throws Exception
    */
    public int delete(HfpmPageCfg hfpmPageCfg) throws  Exception;


    /**
    * 删除页面配置
    * @param hfpmPageCfgId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageCfgId) throws  Exception;


    /**
    * 查找所有页面配置
    * @return
    */
    public List<HfpmPageCfg> getHfpmPageCfgAll()  throws  Exception;

    /**
    * 通过页面配置ID查询页面配置
    * @param hfpmPageCfgId
    * @return
    * @throws Exception
    */
    public HfpmPageCfg getHfpmPageCfgByPK(long hfpmPageCfgId)  throws  Exception;

    /**
    * 通过MAP参数查询页面配置
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPageCfg> getHfpmPageCfgListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询页面配置
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPageCfg> getHfpmPageCfgListByExample(HfpmPageCfg_Example example) throws  Exception;

    /**
    * 通过MAP参数查询页面配置数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageCfgCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询页面配置数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageCfgCountByExample(HfpmPageCfg_Example example) throws  Exception;


 }
