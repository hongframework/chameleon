package com.hframe.dao;

import com.hframe.domain.model.HfpmDataField;
import com.hframe.domain.model.HfpmDataField_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmDataFieldMapper {
    int countByExample(HfpmDataField_Example example);

    int deleteByExample(HfpmDataField_Example example);

    int deleteByPrimaryKey(Long hfpmDataFieldId);

    int insert(HfpmDataField record);

    int insertSelective(HfpmDataField record);

    List<HfpmDataField> selectByExample(HfpmDataField_Example example);

    HfpmDataField selectByPrimaryKey(Long hfpmDataFieldId);

    int updateByExampleSelective(@Param("record") HfpmDataField record, @Param("example") HfpmDataField_Example example);

    int updateByExample(@Param("record") HfpmDataField record, @Param("example") HfpmDataField_Example example);

    int updateByPrimaryKeySelective(HfpmDataField record);

    int updateByPrimaryKey(HfpmDataField record);
}