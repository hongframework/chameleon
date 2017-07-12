package com.hframe.dao;

import com.hframe.domain.model.HfusEntityAttr;
import com.hframe.domain.model.HfusEntityAttr_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfusEntityAttrMapper {
    int countByExample(HfusEntityAttr_Example example);

    int deleteByExample(HfusEntityAttr_Example example);

    int deleteByPrimaryKey(Long hfusEntityAttrId);

    int insert(HfusEntityAttr record);

    int insertSelective(HfusEntityAttr record);

    List<HfusEntityAttr> selectByExample(HfusEntityAttr_Example example);

    HfusEntityAttr selectByPrimaryKey(Long hfusEntityAttrId);

    int updateByExampleSelective(@Param("record") HfusEntityAttr record, @Param("example") HfusEntityAttr_Example example);

    int updateByExample(@Param("record") HfusEntityAttr record, @Param("example") HfusEntityAttr_Example example);

    int updateByPrimaryKeySelective(HfusEntityAttr record);

    int updateByPrimaryKey(HfusEntityAttr record);
}