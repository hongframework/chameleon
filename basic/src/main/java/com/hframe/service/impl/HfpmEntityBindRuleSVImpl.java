package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfpmEntityBindRule;
import com.hframe.domain.model.HfpmEntityBindRule_Example;
import com.hframe.dao.HfpmEntityBindRuleMapper;
import com.hframe.service.interfaces.IHfpmEntityBindRuleSV;

@Service("iHfpmEntityBindRuleSV")
public class HfpmEntityBindRuleSVImpl  implements IHfpmEntityBindRuleSV {

	@Resource
	private HfpmEntityBindRuleMapper hfpmEntityBindRuleMapper;
  
    /**
    * 创建实体捆绑规则
    * @param hfpmEntityBindRule
    * @return
    * @throws Exception
    */
    public int create(HfpmEntityBindRule hfpmEntityBindRule) throws Exception {
        return hfpmEntityBindRuleMapper.insertSelective(hfpmEntityBindRule);
    }

    /**
    * 批量维护实体捆绑规则
    * @param hfpmEntityBindRules
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmEntityBindRule[] hfpmEntityBindRules) throws  Exception{
        int result = 0;
        if(hfpmEntityBindRules != null) {
            for (HfpmEntityBindRule hfpmEntityBindRule : hfpmEntityBindRules) {
                if(hfpmEntityBindRule.getHfpmEntityBindRuleId() == null) {
                    result += this.create(hfpmEntityBindRule);
                }else {
                    result += this.update(hfpmEntityBindRule);
                }
            }
        }
        return result;
    }

    /**
    * 更新实体捆绑规则
    * @param hfpmEntityBindRule
    * @return
    * @throws Exception
    */
    public int update(HfpmEntityBindRule hfpmEntityBindRule) throws  Exception {
        return hfpmEntityBindRuleMapper.updateByPrimaryKeySelective(hfpmEntityBindRule);
    }

    /**
    * 通过查询对象更新实体捆绑规则
    * @param hfpmEntityBindRule
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmEntityBindRule hfpmEntityBindRule, HfpmEntityBindRule_Example example) throws  Exception {
        return hfpmEntityBindRuleMapper.updateByExampleSelective(hfpmEntityBindRule, example);
    }

    /**
    * 删除实体捆绑规则
    * @param hfpmEntityBindRule
    * @return
    * @throws Exception
    */
    public int delete(HfpmEntityBindRule hfpmEntityBindRule) throws  Exception {
        return hfpmEntityBindRuleMapper.deleteByPrimaryKey(hfpmEntityBindRule.getHfpmEntityBindRuleId());
    }

    /**
    * 删除实体捆绑规则
    * @param hfpmEntityBindRuleId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmEntityBindRuleId) throws  Exception {
        return hfpmEntityBindRuleMapper.deleteByPrimaryKey(hfpmEntityBindRuleId);
    }

    /**
    * 查找所有实体捆绑规则
    * @return
    */
    public List<HfpmEntityBindRule> getHfpmEntityBindRuleAll()  throws  Exception {
        return hfpmEntityBindRuleMapper.selectByExample(new HfpmEntityBindRule_Example());
    }

    /**
    * 通过实体捆绑规则ID查询实体捆绑规则
    * @param hfpmEntityBindRuleId
    * @return
    * @throws Exception
    */
    public HfpmEntityBindRule getHfpmEntityBindRuleByPK(long hfpmEntityBindRuleId)  throws  Exception {
        return hfpmEntityBindRuleMapper.selectByPrimaryKey(hfpmEntityBindRuleId);
    }

    /**
    * 通过MAP参数查询实体捆绑规则
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmEntityBindRule> getHfpmEntityBindRuleListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询实体捆绑规则
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmEntityBindRule> getHfpmEntityBindRuleListByExample(HfpmEntityBindRule_Example example) throws  Exception {
        return hfpmEntityBindRuleMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询实体捆绑规则数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmEntityBindRuleCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询实体捆绑规则数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmEntityBindRuleCountByExample(HfpmEntityBindRule_Example example) throws  Exception {
        return hfpmEntityBindRuleMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmEntityBindRuleMapper getHfpmEntityBindRuleMapper(){
		return hfpmEntityBindRuleMapper;
	}
	//setter
	public void setHfpmEntityBindRuleMapper(HfpmEntityBindRuleMapper hfpmEntityBindRuleMapper){
    	this.hfpmEntityBindRuleMapper = hfpmEntityBindRuleMapper;
    }
}
