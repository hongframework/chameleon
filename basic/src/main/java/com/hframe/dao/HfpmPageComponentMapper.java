package com.hframe.dao;

import com.hframe.domain.model.HfpmPageComponent;
import com.hframe.domain.model.HfpmPageComponent_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmPageComponentMapper {
    int countByExample(HfpmPageComponent_Example example);

    int deleteByExample(HfpmPageComponent_Example example);

    int deleteByPrimaryKey(Long hfpmPageComponentId);

    int insert(HfpmPageComponent record);

    int insertSelective(HfpmPageComponent record);

    List<HfpmPageComponent> selectByExample(HfpmPageComponent_Example example);

    HfpmPageComponent selectByPrimaryKey(Long hfpmPageComponentId);

    int updateByExampleSelective(@Param("record") HfpmPageComponent record, @Param("example") HfpmPageComponent_Example example);

    int updateByExample(@Param("record") HfpmPageComponent record, @Param("example") HfpmPageComponent_Example example);

    int updateByPrimaryKeySelective(HfpmPageComponent record);

    int updateByPrimaryKey(HfpmPageComponent record);
}