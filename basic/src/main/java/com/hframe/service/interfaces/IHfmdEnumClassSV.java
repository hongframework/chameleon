package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfmdEnumClass;
import com.hframe.domain.model.HfmdEnumClass_Example;


public interface IHfmdEnumClassSV   {

  
    /**
    * 创建枚举组
    * @param hfmdEnumClass
    * @return
    * @throws Exception
    */
    public int create(HfmdEnumClass hfmdEnumClass) throws  Exception;

    /**
    * 批量维护枚举组
    * @param hfmdEnumClasss
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEnumClass[] hfmdEnumClasss) throws  Exception;
    /**
    * 更新枚举组
    * @param hfmdEnumClass
    * @return
    * @throws Exception
    */
    public int update(HfmdEnumClass hfmdEnumClass) throws  Exception;

    /**
    * 通过查询对象更新枚举组
    * @param hfmdEnumClass
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEnumClass hfmdEnumClass, HfmdEnumClass_Example example) throws  Exception;

    /**
    * 删除枚举组
    * @param hfmdEnumClass
    * @return
    * @throws Exception
    */
    public int delete(HfmdEnumClass hfmdEnumClass) throws  Exception;


    /**
    * 删除枚举组
    * @param hfmdEnumClassId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEnumClassId) throws  Exception;


    /**
    * 查找所有枚举组
    * @return
    */
    public List<HfmdEnumClass> getHfmdEnumClassAll()  throws  Exception;

    /**
    * 通过枚举组ID查询枚举组
    * @param hfmdEnumClassId
    * @return
    * @throws Exception
    */
    public HfmdEnumClass getHfmdEnumClassByPK(long hfmdEnumClassId)  throws  Exception;

    /**
    * 通过MAP参数查询枚举组
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEnumClass> getHfmdEnumClassListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询枚举组
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEnumClass> getHfmdEnumClassListByExample(HfmdEnumClass_Example example) throws  Exception;

    /**
    * 通过MAP参数查询枚举组数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEnumClassCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询枚举组数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEnumClassCountByExample(HfmdEnumClass_Example example) throws  Exception;


 }
