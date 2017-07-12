package com.hframe.dao;

import com.hframe.domain.model.HfcfgPageTemplate;
import com.hframe.domain.model.HfcfgPageTemplate_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfcfgPageTemplateMapper {
    int countByExample(HfcfgPageTemplate_Example example);

    int deleteByExample(HfcfgPageTemplate_Example example);

    int deleteByPrimaryKey(Long hfcfgPageTemplateId);

    int insert(HfcfgPageTemplate record);

    int insertSelective(HfcfgPageTemplate record);

    List<HfcfgPageTemplate> selectByExample(HfcfgPageTemplate_Example example);

    HfcfgPageTemplate selectByPrimaryKey(Long hfcfgPageTemplateId);

    int updateByExampleSelective(@Param("record") HfcfgPageTemplate record, @Param("example") HfcfgPageTemplate_Example example);

    int updateByExample(@Param("record") HfcfgPageTemplate record, @Param("example") HfcfgPageTemplate_Example example);

    int updateByPrimaryKeySelective(HfcfgPageTemplate record);

    int updateByPrimaryKey(HfcfgPageTemplate record);
}