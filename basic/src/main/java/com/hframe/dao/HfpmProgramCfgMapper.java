package com.hframe.dao;

import com.hframe.domain.model.HfpmProgramCfg;
import com.hframe.domain.model.HfpmProgramCfg_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmProgramCfgMapper {
    int countByExample(HfpmProgramCfg_Example example);

    int deleteByExample(HfpmProgramCfg_Example example);

    int deleteByPrimaryKey(Long hfpmProgramCfgId);

    int insert(HfpmProgramCfg record);

    int insertSelective(HfpmProgramCfg record);

    List<HfpmProgramCfg> selectByExample(HfpmProgramCfg_Example example);

    HfpmProgramCfg selectByPrimaryKey(Long hfpmProgramCfgId);

    int updateByExampleSelective(@Param("record") HfpmProgramCfg record, @Param("example") HfpmProgramCfg_Example example);

    int updateByExample(@Param("record") HfpmProgramCfg record, @Param("example") HfpmProgramCfg_Example example);

    int updateByPrimaryKeySelective(HfpmProgramCfg record);

    int updateByPrimaryKey(HfpmProgramCfg record);
}