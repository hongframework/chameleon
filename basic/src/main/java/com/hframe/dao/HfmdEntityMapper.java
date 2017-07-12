package com.hframe.dao;

import com.hframe.domain.model.HfmdEntity;
import com.hframe.domain.model.HfmdEntity_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfmdEntityMapper {
    int countByExample(HfmdEntity_Example example);

    int deleteByExample(HfmdEntity_Example example);

    int deleteByPrimaryKey(Long hfmdEntityId);

    int insert(HfmdEntity record);

    int insertSelective(HfmdEntity record);

    List<HfmdEntity> selectByExample(HfmdEntity_Example example);

    HfmdEntity selectByPrimaryKey(Long hfmdEntityId);

    int updateByExampleSelective(@Param("record") HfmdEntity record, @Param("example") HfmdEntity_Example example);

    int updateByExample(@Param("record") HfmdEntity record, @Param("example") HfmdEntity_Example example);

    int updateByPrimaryKeySelective(HfmdEntity record);

    int updateByPrimaryKey(HfmdEntity record);
}