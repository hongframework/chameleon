package com.hframe.dao;

import com.hframe.domain.model.HfmdEnumClass;
import com.hframe.domain.model.HfmdEnumClass_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfmdEnumClassMapper {
    int countByExample(HfmdEnumClass_Example example);

    int deleteByExample(HfmdEnumClass_Example example);

    int deleteByPrimaryKey(Long hfmdEnumClassId);

    int insert(HfmdEnumClass record);

    int insertSelective(HfmdEnumClass record);

    List<HfmdEnumClass> selectByExample(HfmdEnumClass_Example example);

    HfmdEnumClass selectByPrimaryKey(Long hfmdEnumClassId);

    int updateByExampleSelective(@Param("record") HfmdEnumClass record, @Param("example") HfmdEnumClass_Example example);

    int updateByExample(@Param("record") HfmdEnumClass record, @Param("example") HfmdEnumClass_Example example);

    int updateByPrimaryKeySelective(HfmdEnumClass record);

    int updateByPrimaryKey(HfmdEnumClass record);
}