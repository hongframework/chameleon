package com.hframe.dao;

import com.hframe.domain.model.HfcfgPageTemplateElements;
import com.hframe.domain.model.HfcfgPageTemplateElements_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfcfgPageTemplateElementsMapper {
    int countByExample(HfcfgPageTemplateElements_Example example);

    int deleteByExample(HfcfgPageTemplateElements_Example example);

    int deleteByPrimaryKey(Long hfcfgPageTemplateElementsId);

    int insert(HfcfgPageTemplateElements record);

    int insertSelective(HfcfgPageTemplateElements record);

    List<HfcfgPageTemplateElements> selectByExample(HfcfgPageTemplateElements_Example example);

    HfcfgPageTemplateElements selectByPrimaryKey(Long hfcfgPageTemplateElementsId);

    int updateByExampleSelective(@Param("record") HfcfgPageTemplateElements record, @Param("example") HfcfgPageTemplateElements_Example example);

    int updateByExample(@Param("record") HfcfgPageTemplateElements record, @Param("example") HfcfgPageTemplateElements_Example example);

    int updateByPrimaryKeySelective(HfcfgPageTemplateElements record);

    int updateByPrimaryKey(HfcfgPageTemplateElements record);
}