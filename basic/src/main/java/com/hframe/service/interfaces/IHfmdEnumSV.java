package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfmdEnum;
import com.hframe.domain.model.HfmdEnum_Example;


public interface IHfmdEnumSV   {

  
    /**
    * 创建枚举
    * @param hfmdEnum
    * @return
    * @throws Exception
    */
    public int create(HfmdEnum hfmdEnum) throws  Exception;

    /**
    * 批量维护枚举
    * @param hfmdEnums
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEnum[] hfmdEnums) throws  Exception;
    /**
    * 更新枚举
    * @param hfmdEnum
    * @return
    * @throws Exception
    */
    public int update(HfmdEnum hfmdEnum) throws  Exception;

    /**
    * 通过查询对象更新枚举
    * @param hfmdEnum
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEnum hfmdEnum, HfmdEnum_Example example) throws  Exception;

    /**
    * 删除枚举
    * @param hfmdEnum
    * @return
    * @throws Exception
    */
    public int delete(HfmdEnum hfmdEnum) throws  Exception;


    /**
    * 删除枚举
    * @param hfmdEnumId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEnumId) throws  Exception;


    /**
    * 查找所有枚举
    * @return
    */
    public List<HfmdEnum> getHfmdEnumAll()  throws  Exception;

    /**
    * 通过枚举ID查询枚举
    * @param hfmdEnumId
    * @return
    * @throws Exception
    */
    public HfmdEnum getHfmdEnumByPK(long hfmdEnumId)  throws  Exception;

    /**
    * 通过MAP参数查询枚举
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEnum> getHfmdEnumListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询枚举
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEnum> getHfmdEnumListByExample(HfmdEnum_Example example) throws  Exception;

    /**
    * 通过MAP参数查询枚举数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEnumCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询枚举数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEnumCountByExample(HfmdEnum_Example example) throws  Exception;


 }
