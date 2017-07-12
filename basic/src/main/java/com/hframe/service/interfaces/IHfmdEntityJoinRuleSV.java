package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfmdEntityJoinRule;
import com.hframe.domain.model.HfmdEntityJoinRule_Example;


public interface IHfmdEntityJoinRuleSV   {

  
    /**
    * 创建实体属性连带规则
    * @param hfmdEntityJoinRule
    * @return
    * @throws Exception
    */
    public int create(HfmdEntityJoinRule hfmdEntityJoinRule) throws  Exception;

    /**
    * 批量维护实体属性连带规则
    * @param hfmdEntityJoinRules
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEntityJoinRule[] hfmdEntityJoinRules) throws  Exception;
    /**
    * 更新实体属性连带规则
    * @param hfmdEntityJoinRule
    * @return
    * @throws Exception
    */
    public int update(HfmdEntityJoinRule hfmdEntityJoinRule) throws  Exception;

    /**
    * 通过查询对象更新实体属性连带规则
    * @param hfmdEntityJoinRule
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEntityJoinRule hfmdEntityJoinRule, HfmdEntityJoinRule_Example example) throws  Exception;

    /**
    * 删除实体属性连带规则
    * @param hfmdEntityJoinRule
    * @return
    * @throws Exception
    */
    public int delete(HfmdEntityJoinRule hfmdEntityJoinRule) throws  Exception;


    /**
    * 删除实体属性连带规则
    * @param hfmdEntityJoinRuleId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEntityJoinRuleId) throws  Exception;


    /**
    * 查找所有实体属性连带规则
    * @return
    */
    public List<HfmdEntityJoinRule> getHfmdEntityJoinRuleAll()  throws  Exception;

    /**
    * 通过实体属性连带规则ID查询实体属性连带规则
    * @param hfmdEntityJoinRuleId
    * @return
    * @throws Exception
    */
    public HfmdEntityJoinRule getHfmdEntityJoinRuleByPK(long hfmdEntityJoinRuleId)  throws  Exception;

    /**
    * 通过MAP参数查询实体属性连带规则
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEntityJoinRule> getHfmdEntityJoinRuleListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体属性连带规则
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEntityJoinRule> getHfmdEntityJoinRuleListByExample(HfmdEntityJoinRule_Example example) throws  Exception;


    /**
    * 通过MAP参数查询实体属性连带规则数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEntityJoinRuleCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体属性连带规则数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEntityJoinRuleCountByExample(HfmdEntityJoinRule_Example example) throws  Exception;


 }
