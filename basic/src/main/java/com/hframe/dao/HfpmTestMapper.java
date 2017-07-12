package com.hframe.dao;

import com.hframe.domain.model.HfpmTest;
import com.hframe.domain.model.HfpmTest_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmTestMapper {
    int countByExample(HfpmTest_Example example);

    int deleteByExample(HfpmTest_Example example);

    int deleteByPrimaryKey(Long hfpmTestId);

    int insert(HfpmTest record);

    int insertSelective(HfpmTest record);

    List<HfpmTest> selectByExample(HfpmTest_Example example);

    HfpmTest selectByPrimaryKey(Long hfpmTestId);

    int updateByExampleSelective(@Param("record") HfpmTest record, @Param("example") HfpmTest_Example example);

    int updateByExample(@Param("record") HfpmTest record, @Param("example") HfpmTest_Example example);

    int updateByPrimaryKeySelective(HfpmTest record);

    int updateByPrimaryKey(HfpmTest record);
}