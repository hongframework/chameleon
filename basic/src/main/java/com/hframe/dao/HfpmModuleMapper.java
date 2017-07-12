package com.hframe.dao;

import com.hframe.domain.model.HfpmModule;
import com.hframe.domain.model.HfpmModule_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmModuleMapper {
    int countByExample(HfpmModule_Example example);

    int deleteByExample(HfpmModule_Example example);

    int deleteByPrimaryKey(Long hfpmModuleId);

    int insert(HfpmModule record);

    int insertSelective(HfpmModule record);

    List<HfpmModule> selectByExample(HfpmModule_Example example);

    HfpmModule selectByPrimaryKey(Long hfpmModuleId);

    int updateByExampleSelective(@Param("record") HfpmModule record, @Param("example") HfpmModule_Example example);

    int updateByExample(@Param("record") HfpmModule record, @Param("example") HfpmModule_Example example);

    int updateByPrimaryKeySelective(HfpmModule record);

    int updateByPrimaryKey(HfpmModule record);
}