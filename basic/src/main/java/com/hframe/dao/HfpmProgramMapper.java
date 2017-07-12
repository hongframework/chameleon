package com.hframe.dao;

import com.hframe.domain.model.HfpmProgram;
import com.hframe.domain.model.HfpmProgram_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmProgramMapper {
    int countByExample(HfpmProgram_Example example);

    int deleteByExample(HfpmProgram_Example example);

    int deleteByPrimaryKey(Long hfpmProgramId);

    int insert(HfpmProgram record);

    int insertSelective(HfpmProgram record);

    List<HfpmProgram> selectByExample(HfpmProgram_Example example);

    HfpmProgram selectByPrimaryKey(Long hfpmProgramId);

    int updateByExampleSelective(@Param("record") HfpmProgram record, @Param("example") HfpmProgram_Example example);

    int updateByExample(@Param("record") HfpmProgram record, @Param("example") HfpmProgram_Example example);

    int updateByPrimaryKeySelective(HfpmProgram record);

    int updateByPrimaryKey(HfpmProgram record);
}