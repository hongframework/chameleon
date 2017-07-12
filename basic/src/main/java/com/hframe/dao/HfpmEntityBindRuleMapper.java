package com.hframe.dao;

import com.hframe.domain.model.HfpmEntityBindRule;
import com.hframe.domain.model.HfpmEntityBindRule_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmEntityBindRuleMapper {
    int countByExample(HfpmEntityBindRule_Example example);

    int deleteByExample(HfpmEntityBindRule_Example example);

    int deleteByPrimaryKey(Long hfpmEntityBindRuleId);

    int insert(HfpmEntityBindRule record);

    int insertSelective(HfpmEntityBindRule record);

    List<HfpmEntityBindRule> selectByExample(HfpmEntityBindRule_Example example);

    HfpmEntityBindRule selectByPrimaryKey(Long hfpmEntityBindRuleId);

    int updateByExampleSelective(@Param("record") HfpmEntityBindRule record, @Param("example") HfpmEntityBindRule_Example example);

    int updateByExample(@Param("record") HfpmEntityBindRule record, @Param("example") HfpmEntityBindRule_Example example);

    int updateByPrimaryKeySelective(HfpmEntityBindRule record);

    int updateByPrimaryKey(HfpmEntityBindRule record);
}