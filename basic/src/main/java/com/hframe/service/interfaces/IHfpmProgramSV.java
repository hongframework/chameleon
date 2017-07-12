package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmProgram;
import com.hframe.domain.model.HfpmProgram_Example;


public interface IHfpmProgramSV   {

  
    /**
    * 创建项目
    * @param hfpmProgram
    * @return
    * @throws Exception
    */
    public int create(HfpmProgram hfpmProgram) throws  Exception;

    /**
    * 批量维护项目
    * @param hfpmPrograms
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmProgram[] hfpmPrograms) throws  Exception;
    /**
    * 更新项目
    * @param hfpmProgram
    * @return
    * @throws Exception
    */
    public int update(HfpmProgram hfpmProgram) throws  Exception;

    /**
    * 通过查询对象更新项目
    * @param hfpmProgram
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmProgram hfpmProgram, HfpmProgram_Example example) throws  Exception;

    /**
    * 删除项目
    * @param hfpmProgram
    * @return
    * @throws Exception
    */
    public int delete(HfpmProgram hfpmProgram) throws  Exception;


    /**
    * 删除项目
    * @param hfpmProgramId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmProgramId) throws  Exception;


    /**
    * 查找所有项目
    * @return
    */
    public List<HfpmProgram> getHfpmProgramAll()  throws  Exception;

    /**
    * 通过项目ID查询项目
    * @param hfpmProgramId
    * @return
    * @throws Exception
    */
    public HfpmProgram getHfpmProgramByPK(long hfpmProgramId)  throws  Exception;

    /**
    * 通过MAP参数查询项目
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmProgram> getHfpmProgramListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询项目
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmProgram> getHfpmProgramListByExample(HfpmProgram_Example example) throws  Exception;

    /**
    * 通过MAP参数查询项目数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmProgramCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询项目数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmProgramCountByExample(HfpmProgram_Example example) throws  Exception;


 }
