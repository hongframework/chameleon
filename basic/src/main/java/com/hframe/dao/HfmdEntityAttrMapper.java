package com.hframe.dao;

import com.hframe.domain.model.HfmdEntityAttr;
import com.hframe.domain.model.HfmdEntityAttr_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfmdEntityAttrMapper {
    int countByExample(HfmdEntityAttr_Example example);

    int deleteByExample(HfmdEntityAttr_Example example);

    int deleteByPrimaryKey(Long hfmdEntityAttrId);

    int insert(HfmdEntityAttr record);

    int insertSelective(HfmdEntityAttr record);

    List<HfmdEntityAttr> selectByExample(HfmdEntityAttr_Example example);

    HfmdEntityAttr selectByPrimaryKey(Long hfmdEntityAttrId);

    int updateByExampleSelective(@Param("record") HfmdEntityAttr record, @Param("example") HfmdEntityAttr_Example example);

    int updateByExample(@Param("record") HfmdEntityAttr record, @Param("example") HfmdEntityAttr_Example example);

    int updateByPrimaryKeySelective(HfmdEntityAttr record);

    int updateByPrimaryKey(HfmdEntityAttr record);
}