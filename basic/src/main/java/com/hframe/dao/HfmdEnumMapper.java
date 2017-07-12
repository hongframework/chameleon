package com.hframe.dao;

import com.hframe.domain.model.HfmdEnum;
import com.hframe.domain.model.HfmdEnum_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfmdEnumMapper {
    int countByExample(HfmdEnum_Example example);

    int deleteByExample(HfmdEnum_Example example);

    int deleteByPrimaryKey(Long hfmdEnumId);

    int insert(HfmdEnum record);

    int insertSelective(HfmdEnum record);

    List<HfmdEnum> selectByExample(HfmdEnum_Example example);

    HfmdEnum selectByPrimaryKey(Long hfmdEnumId);

    int updateByExampleSelective(@Param("record") HfmdEnum record, @Param("example") HfmdEnum_Example example);

    int updateByExample(@Param("record") HfmdEnum record, @Param("example") HfmdEnum_Example example);

    int updateByPrimaryKeySelective(HfmdEnum record);

    int updateByPrimaryKey(HfmdEnum record);
}