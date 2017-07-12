package com.hframe.dao;

import com.hframe.domain.model.HfmdEntityRel;
import com.hframe.domain.model.HfmdEntityRel_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfmdEntityRelMapper {
    int countByExample(HfmdEntityRel_Example example);

    int deleteByExample(HfmdEntityRel_Example example);

    int deleteByPrimaryKey(Long hfmdEntityRelId);

    int insert(HfmdEntityRel record);

    int insertSelective(HfmdEntityRel record);

    List<HfmdEntityRel> selectByExample(HfmdEntityRel_Example example);

    HfmdEntityRel selectByPrimaryKey(Long hfmdEntityRelId);

    int updateByExampleSelective(@Param("record") HfmdEntityRel record, @Param("example") HfmdEntityRel_Example example);

    int updateByExample(@Param("record") HfmdEntityRel record, @Param("example") HfmdEntityRel_Example example);

    int updateByPrimaryKeySelective(HfmdEntityRel record);

    int updateByPrimaryKey(HfmdEntityRel record);
}