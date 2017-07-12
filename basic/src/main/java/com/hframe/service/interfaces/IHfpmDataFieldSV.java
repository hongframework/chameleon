package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmDataField;
import com.hframe.domain.model.HfpmDataField_Example;


public interface IHfpmDataFieldSV   {

  
    /**
    * 创建数据列
    * @param hfpmDataField
    * @return
    * @throws Exception
    */
    public int create(HfpmDataField hfpmDataField) throws  Exception;

    /**
    * 批量维护数据列
    * @param hfpmDataFields
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmDataField[] hfpmDataFields) throws  Exception;
    /**
    * 更新数据列
    * @param hfpmDataField
    * @return
    * @throws Exception
    */
    public int update(HfpmDataField hfpmDataField) throws  Exception;

    /**
    * 通过查询对象更新数据列
    * @param hfpmDataField
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmDataField hfpmDataField, HfpmDataField_Example example) throws  Exception;

    /**
    * 删除数据列
    * @param hfpmDataField
    * @return
    * @throws Exception
    */
    public int delete(HfpmDataField hfpmDataField) throws  Exception;


    /**
    * 删除数据列
    * @param hfpmDataFieldId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmDataFieldId) throws  Exception;


    /**
    * 查找所有数据列
    * @return
    */
    public List<HfpmDataField> getHfpmDataFieldAll()  throws  Exception;

    /**
    * 通过数据列ID查询数据列
    * @param hfpmDataFieldId
    * @return
    * @throws Exception
    */
    public HfpmDataField getHfpmDataFieldByPK(long hfpmDataFieldId)  throws  Exception;

    /**
    * 通过MAP参数查询数据列
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmDataField> getHfpmDataFieldListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询数据列
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmDataField> getHfpmDataFieldListByExample(HfpmDataField_Example example) throws  Exception;


    /**
    * 通过MAP参数查询数据列数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmDataFieldCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询数据列数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmDataFieldCountByExample(HfpmDataField_Example example) throws  Exception;


 }
