package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfpmEntityBindRule;
import com.hframe.domain.model.HfpmEntityBindRule_Example;


public interface IHfpmEntityBindRuleSV   {

  
    /**
    * 创建实体捆绑规则
    * @param hfpmEntityBindRule
    * @return
    * @throws Exception
    */
    public int create(HfpmEntityBindRule hfpmEntityBindRule) throws  Exception;

    /**
    * 批量维护实体捆绑规则
    * @param hfpmEntityBindRules
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmEntityBindRule[] hfpmEntityBindRules) throws  Exception;
    /**
    * 更新实体捆绑规则
    * @param hfpmEntityBindRule
    * @return
    * @throws Exception
    */
    public int update(HfpmEntityBindRule hfpmEntityBindRule) throws  Exception;

    /**
    * 通过查询对象更新实体捆绑规则
    * @param hfpmEntityBindRule
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmEntityBindRule hfpmEntityBindRule, HfpmEntityBindRule_Example example) throws  Exception;

    /**
    * 删除实体捆绑规则
    * @param hfpmEntityBindRule
    * @return
    * @throws Exception
    */
    public int delete(HfpmEntityBindRule hfpmEntityBindRule) throws  Exception;


    /**
    * 删除实体捆绑规则
    * @param hfpmEntityBindRuleId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmEntityBindRuleId) throws  Exception;


    /**
    * 查找所有实体捆绑规则
    * @return
    */
    public List<HfpmEntityBindRule> getHfpmEntityBindRuleAll()  throws  Exception;

    /**
    * 通过实体捆绑规则ID查询实体捆绑规则
    * @param hfpmEntityBindRuleId
    * @return
    * @throws Exception
    */
    public HfpmEntityBindRule getHfpmEntityBindRuleByPK(long hfpmEntityBindRuleId)  throws  Exception;

    /**
    * 通过MAP参数查询实体捆绑规则
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmEntityBindRule> getHfpmEntityBindRuleListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体捆绑规则
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmEntityBindRule> getHfpmEntityBindRuleListByExample(HfpmEntityBindRule_Example example) throws  Exception;

    /**
    * 通过MAP参数查询实体捆绑规则数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmEntityBindRuleCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询实体捆绑规则数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmEntityBindRuleCountByExample(HfpmEntityBindRule_Example example) throws  Exception;


 }
