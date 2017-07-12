package com.hframe.dao;

import com.hframe.domain.model.HfpmDataSet;
import com.hframe.domain.model.HfpmDataSet_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmDataSetMapper {
    int countByExample(HfpmDataSet_Example example);

    int deleteByExample(HfpmDataSet_Example example);

    int deleteByPrimaryKey(Long hfpmDataSetId);

    int insert(HfpmDataSet record);

    int insertSelective(HfpmDataSet record);

    List<HfpmDataSet> selectByExample(HfpmDataSet_Example example);

    HfpmDataSet selectByPrimaryKey(Long hfpmDataSetId);

    int updateByExampleSelective(@Param("record") HfpmDataSet record, @Param("example") HfpmDataSet_Example example);

    int updateByExample(@Param("record") HfpmDataSet record, @Param("example") HfpmDataSet_Example example);

    int updateByPrimaryKeySelective(HfpmDataSet record);

    int updateByPrimaryKey(HfpmDataSet record);
}