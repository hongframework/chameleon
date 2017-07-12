package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmProgramCfg;
import com.hframe.domain.model.HfpmProgramCfg_Example;


public interface IHfpmProgramCfgSV   {

  
    /**
    * 创建项目设置
    * @param hfpmProgramCfg
    * @return
    * @throws Exception
    */
    public int create(HfpmProgramCfg hfpmProgramCfg) throws  Exception;

    /**
    * 批量维护项目设置
    * @param hfpmProgramCfgs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmProgramCfg[] hfpmProgramCfgs) throws  Exception;
    /**
    * 更新项目设置
    * @param hfpmProgramCfg
    * @return
    * @throws Exception
    */
    public int update(HfpmProgramCfg hfpmProgramCfg) throws  Exception;

    /**
    * 通过查询对象更新项目设置
    * @param hfpmProgramCfg
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmProgramCfg hfpmProgramCfg, HfpmProgramCfg_Example example) throws  Exception;

    /**
    * 删除项目设置
    * @param hfpmProgramCfg
    * @return
    * @throws Exception
    */
    public int delete(HfpmProgramCfg hfpmProgramCfg) throws  Exception;


    /**
    * 删除项目设置
    * @param hfpmProgramCfgId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmProgramCfgId) throws  Exception;


    /**
    * 查找所有项目设置
    * @return
    */
    public List<HfpmProgramCfg> getHfpmProgramCfgAll()  throws  Exception;

    /**
    * 通过项目设置ID查询项目设置
    * @param hfpmProgramCfgId
    * @return
    * @throws Exception
    */
    public HfpmProgramCfg getHfpmProgramCfgByPK(long hfpmProgramCfgId)  throws  Exception;

    /**
    * 通过MAP参数查询项目设置
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmProgramCfg> getHfpmProgramCfgListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询项目设置
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmProgramCfg> getHfpmProgramCfgListByExample(HfpmProgramCfg_Example example) throws  Exception;


    /**
    * 通过MAP参数查询项目设置数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmProgramCfgCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询项目设置数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmProgramCfgCountByExample(HfpmProgramCfg_Example example) throws  Exception;


 }
