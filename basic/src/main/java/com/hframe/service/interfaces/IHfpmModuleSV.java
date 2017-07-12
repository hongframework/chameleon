package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmModule;
import com.hframe.domain.model.HfpmModule_Example;


public interface IHfpmModuleSV   {

  
    /**
    * 创建模块
    * @param hfpmModule
    * @return
    * @throws Exception
    */
    public int create(HfpmModule hfpmModule) throws  Exception;

    /**
    * 批量维护模块
    * @param hfpmModules
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmModule[] hfpmModules) throws  Exception;
    /**
    * 更新模块
    * @param hfpmModule
    * @return
    * @throws Exception
    */
    public int update(HfpmModule hfpmModule) throws  Exception;

    /**
    * 通过查询对象更新模块
    * @param hfpmModule
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmModule hfpmModule, HfpmModule_Example example) throws  Exception;

    /**
    * 删除模块
    * @param hfpmModule
    * @return
    * @throws Exception
    */
    public int delete(HfpmModule hfpmModule) throws  Exception;


    /**
    * 删除模块
    * @param hfpmModuleId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmModuleId) throws  Exception;


    /**
    * 查找所有模块
    * @return
    */
    public List<HfpmModule> getHfpmModuleAll()  throws  Exception;

    /**
    * 通过模块ID查询模块
    * @param hfpmModuleId
    * @return
    * @throws Exception
    */
    public HfpmModule getHfpmModuleByPK(long hfpmModuleId)  throws  Exception;

    /**
    * 通过MAP参数查询模块
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmModule> getHfpmModuleListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询模块
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmModule> getHfpmModuleListByExample(HfpmModule_Example example) throws  Exception;

    /**
    * 通过MAP参数查询模块数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmModuleCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询模块数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmModuleCountByExample(HfpmModule_Example example) throws  Exception;


 }
