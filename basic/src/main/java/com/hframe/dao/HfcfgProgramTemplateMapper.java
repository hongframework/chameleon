package com.hframe.dao;

import com.hframe.domain.model.HfcfgProgramTemplate;
import com.hframe.domain.model.HfcfgProgramTemplate_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfcfgProgramTemplateMapper {
    int countByExample(HfcfgProgramTemplate_Example example);

    int deleteByExample(HfcfgProgramTemplate_Example example);

    int deleteByPrimaryKey(Long hfcfgProgramTemplateId);

    int insert(HfcfgProgramTemplate record);

    int insertSelective(HfcfgProgramTemplate record);

    List<HfcfgProgramTemplate> selectByExample(HfcfgProgramTemplate_Example example);

    HfcfgProgramTemplate selectByPrimaryKey(Long hfcfgProgramTemplateId);

    int updateByExampleSelective(@Param("record") HfcfgProgramTemplate record, @Param("example") HfcfgProgramTemplate_Example example);

    int updateByExample(@Param("record") HfcfgProgramTemplate record, @Param("example") HfcfgProgramTemplate_Example example);

    int updateByPrimaryKeySelective(HfcfgProgramTemplate record);

    int updateByPrimaryKey(HfcfgProgramTemplate record);
}