package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfsecOrganize;
import com.hframe.domain.model.HfsecOrganize_Example;


public interface IHfsecOrganizeSV   {

  
    /**
    * 创建组织
    * @param hfsecOrganize
    * @return
    * @throws Exception
    */
    public int create(HfsecOrganize hfsecOrganize) throws  Exception;

    /**
    * 批量维护组织
    * @param hfsecOrganizes
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecOrganize[] hfsecOrganizes) throws  Exception;
    /**
    * 更新组织
    * @param hfsecOrganize
    * @return
    * @throws Exception
    */
    public int update(HfsecOrganize hfsecOrganize) throws  Exception;

    /**
    * 通过查询对象更新组织
    * @param hfsecOrganize
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecOrganize hfsecOrganize, HfsecOrganize_Example example) throws  Exception;

    /**
    * 删除组织
    * @param hfsecOrganize
    * @return
    * @throws Exception
    */
    public int delete(HfsecOrganize hfsecOrganize) throws  Exception;


    /**
    * 删除组织
    * @param hfsecOrganizeId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecOrganizeId) throws  Exception;


    /**
    * 查找所有组织
    * @return
    */
    public List<HfsecOrganize> getHfsecOrganizeAll()  throws  Exception;

    /**
    * 通过组织ID查询组织
    * @param hfsecOrganizeId
    * @return
    * @throws Exception
    */
    public HfsecOrganize getHfsecOrganizeByPK(long hfsecOrganizeId)  throws  Exception;

    /**
    * 通过MAP参数查询组织
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecOrganize> getHfsecOrganizeListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询组织
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecOrganize> getHfsecOrganizeListByExample(HfsecOrganize_Example example) throws  Exception;

    /**
    * 通过父级组织ID查询组织树
    * @param hfsecOrganize
    * @return
    * @throws Exception
    */
    public Map<Long, List<HfsecOrganize>> getHfsecOrganizeTreeByParentId(HfsecOrganize hfsecOrganize, HfsecOrganize_Example example)  throws  Exception;

    /**
    * 通过MAP参数查询组织数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecOrganizeCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询组织数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecOrganizeCountByExample(HfsecOrganize_Example example) throws  Exception;


 }
