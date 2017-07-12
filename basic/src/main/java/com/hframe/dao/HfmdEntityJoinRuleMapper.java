package com.hframe.dao;

import com.hframe.domain.model.HfmdEntityJoinRule;
import com.hframe.domain.model.HfmdEntityJoinRule_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfmdEntityJoinRuleMapper {
    int countByExample(HfmdEntityJoinRule_Example example);

    int deleteByExample(HfmdEntityJoinRule_Example example);

    int deleteByPrimaryKey(Long hfmdEntityJoinRuleId);

    int insert(HfmdEntityJoinRule record);

    int insertSelective(HfmdEntityJoinRule record);

    List<HfmdEntityJoinRule> selectByExample(HfmdEntityJoinRule_Example example);

    HfmdEntityJoinRule selectByPrimaryKey(Long hfmdEntityJoinRuleId);

    int updateByExampleSelective(@Param("record") HfmdEntityJoinRule record, @Param("example") HfmdEntityJoinRule_Example example);

    int updateByExample(@Param("record") HfmdEntityJoinRule record, @Param("example") HfmdEntityJoinRule_Example example);

    int updateByPrimaryKeySelective(HfmdEntityJoinRule record);

    int updateByPrimaryKey(HfmdEntityJoinRule record);
}