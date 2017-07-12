package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfmdEntityJoinRule;
import com.hframe.domain.model.HfmdEntityJoinRule_Example;
import com.hframe.dao.HfmdEntityJoinRuleMapper;
import com.hframe.service.interfaces.IHfmdEntityJoinRuleSV;

@Service("iHfmdEntityJoinRuleSV")
public class HfmdEntityJoinRuleSVImpl  implements IHfmdEntityJoinRuleSV {

	@Resource
	private HfmdEntityJoinRuleMapper hfmdEntityJoinRuleMapper;
  


    /**
    * 创建实体属性连带规则
    * @param hfmdEntityJoinRule
    * @return
    * @throws Exception
    */
    public int create(HfmdEntityJoinRule hfmdEntityJoinRule) throws Exception {
        return hfmdEntityJoinRuleMapper.insertSelective(hfmdEntityJoinRule);
    }

    /**
    * 批量维护实体属性连带规则
    * @param hfmdEntityJoinRules
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEntityJoinRule[] hfmdEntityJoinRules) throws  Exception{
        int result = 0;
        if(hfmdEntityJoinRules != null) {
            for (HfmdEntityJoinRule hfmdEntityJoinRule : hfmdEntityJoinRules) {
                if(hfmdEntityJoinRule.getHfmdEntityJoinRuleId() == null) {
                    result += this.create(hfmdEntityJoinRule);
                }else {
                    result += this.update(hfmdEntityJoinRule);
                }
            }
        }
        return result;
    }

    /**
    * 更新实体属性连带规则
    * @param hfmdEntityJoinRule
    * @return
    * @throws Exception
    */
    public int update(HfmdEntityJoinRule hfmdEntityJoinRule) throws  Exception {
        return hfmdEntityJoinRuleMapper.updateByPrimaryKeySelective(hfmdEntityJoinRule);
    }

    /**
    * 通过查询对象更新实体属性连带规则
    * @param hfmdEntityJoinRule
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEntityJoinRule hfmdEntityJoinRule, HfmdEntityJoinRule_Example example) throws  Exception {
        return hfmdEntityJoinRuleMapper.updateByExampleSelective(hfmdEntityJoinRule, example);
    }

    /**
    * 删除实体属性连带规则
    * @param hfmdEntityJoinRule
    * @return
    * @throws Exception
    */
    public int delete(HfmdEntityJoinRule hfmdEntityJoinRule) throws  Exception {
        return hfmdEntityJoinRuleMapper.deleteByPrimaryKey(hfmdEntityJoinRule.getHfmdEntityJoinRuleId());
    }

    /**
    * 删除实体属性连带规则
    * @param hfmdEntityJoinRuleId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEntityJoinRuleId) throws  Exception {
        return hfmdEntityJoinRuleMapper.deleteByPrimaryKey(hfmdEntityJoinRuleId);
    }

    /**
    * 查找所有实体属性连带规则
    * @return
    */
    public List<HfmdEntityJoinRule> getHfmdEntityJoinRuleAll()  throws  Exception {
        return hfmdEntityJoinRuleMapper.selectByExample(new HfmdEntityJoinRule_Example());
    }

    /**
    * 通过实体属性连带规则ID查询实体属性连带规则
    * @param hfmdEntityJoinRuleId
    * @return
    * @throws Exception
    */
    public HfmdEntityJoinRule getHfmdEntityJoinRuleByPK(long hfmdEntityJoinRuleId)  throws  Exception {
        return hfmdEntityJoinRuleMapper.selectByPrimaryKey(hfmdEntityJoinRuleId);
    }


    /**
    * 通过MAP参数查询实体属性连带规则
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEntityJoinRule> getHfmdEntityJoinRuleListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询实体属性连带规则
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEntityJoinRule> getHfmdEntityJoinRuleListByExample(HfmdEntityJoinRule_Example example) throws  Exception {
        return hfmdEntityJoinRuleMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询实体属性连带规则数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEntityJoinRuleCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询实体属性连带规则数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEntityJoinRuleCountByExample(HfmdEntityJoinRule_Example example) throws  Exception {
        return hfmdEntityJoinRuleMapper.countByExample(example);
    }


  	//getter
 	
	public HfmdEntityJoinRuleMapper getHfmdEntityJoinRuleMapper(){
		return hfmdEntityJoinRuleMapper;
	}
	//setter
	public void setHfmdEntityJoinRuleMapper(HfmdEntityJoinRuleMapper hfmdEntityJoinRuleMapper){
    	this.hfmdEntityJoinRuleMapper = hfmdEntityJoinRuleMapper;
    }
}
