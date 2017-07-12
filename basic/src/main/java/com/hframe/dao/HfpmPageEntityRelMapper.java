package com.hframe.dao;

import com.hframe.domain.model.HfpmPageEntityRel;
import com.hframe.domain.model.HfpmPageEntityRel_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmPageEntityRelMapper {
    int countByExample(HfpmPageEntityRel_Example example);

    int deleteByExample(HfpmPageEntityRel_Example example);

    int deleteByPrimaryKey(Long hfpmPageEntityRelId);

    int insert(HfpmPageEntityRel record);

    int insertSelective(HfpmPageEntityRel record);

    List<HfpmPageEntityRel> selectByExample(HfpmPageEntityRel_Example example);

    HfpmPageEntityRel selectByPrimaryKey(Long hfpmPageEntityRelId);

    int updateByExampleSelective(@Param("record") HfpmPageEntityRel record, @Param("example") HfpmPageEntityRel_Example example);

    int updateByExample(@Param("record") HfpmPageEntityRel record, @Param("example") HfpmPageEntityRel_Example example);

    int updateByPrimaryKeySelective(HfpmPageEntityRel record);

    int updateByPrimaryKey(HfpmPageEntityRel record);
}