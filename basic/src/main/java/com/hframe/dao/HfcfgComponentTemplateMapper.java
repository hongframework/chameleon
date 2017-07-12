package com.hframe.dao;

import com.hframe.domain.model.HfcfgComponentTemplate;
import com.hframe.domain.model.HfcfgComponentTemplate_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfcfgComponentTemplateMapper {
    int countByExample(HfcfgComponentTemplate_Example example);

    int deleteByExample(HfcfgComponentTemplate_Example example);

    int deleteByPrimaryKey(Long hfcfgComponentTemplateId);

    int insert(HfcfgComponentTemplate record);

    int insertSelective(HfcfgComponentTemplate record);

    List<HfcfgComponentTemplate> selectByExample(HfcfgComponentTemplate_Example example);

    HfcfgComponentTemplate selectByPrimaryKey(Long hfcfgComponentTemplateId);

    int updateByExampleSelective(@Param("record") HfcfgComponentTemplate record, @Param("example") HfcfgComponentTemplate_Example example);

    int updateByExample(@Param("record") HfcfgComponentTemplate record, @Param("example") HfcfgComponentTemplate_Example example);

    int updateByPrimaryKeySelective(HfcfgComponentTemplate record);

    int updateByPrimaryKey(HfcfgComponentTemplate record);
}