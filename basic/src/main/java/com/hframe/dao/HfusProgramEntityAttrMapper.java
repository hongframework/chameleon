package com.hframe.dao;

import com.hframe.domain.model.HfusProgramEntityAttr;
import com.hframe.domain.model.HfusProgramEntityAttr_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfusProgramEntityAttrMapper {
    int countByExample(HfusProgramEntityAttr_Example example);

    int deleteByExample(HfusProgramEntityAttr_Example example);

    int deleteByPrimaryKey(Long hfusProgramEntityAttrId);

    int insert(HfusProgramEntityAttr record);

    int insertSelective(HfusProgramEntityAttr record);

    List<HfusProgramEntityAttr> selectByExample(HfusProgramEntityAttr_Example example);

    HfusProgramEntityAttr selectByPrimaryKey(Long hfusProgramEntityAttrId);

    int updateByExampleSelective(@Param("record") HfusProgramEntityAttr record, @Param("example") HfusProgramEntityAttr_Example example);

    int updateByExample(@Param("record") HfusProgramEntityAttr record, @Param("example") HfusProgramEntityAttr_Example example);

    int updateByPrimaryKeySelective(HfusProgramEntityAttr record);

    int updateByPrimaryKey(HfusProgramEntityAttr record);
}