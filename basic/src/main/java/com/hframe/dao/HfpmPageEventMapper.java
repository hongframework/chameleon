package com.hframe.dao;

import com.hframe.domain.model.HfpmPageEvent;
import com.hframe.domain.model.HfpmPageEvent_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmPageEventMapper {
    int countByExample(HfpmPageEvent_Example example);

    int deleteByExample(HfpmPageEvent_Example example);

    int deleteByPrimaryKey(Long hfpmPageEventId);

    int insert(HfpmPageEvent record);

    int insertSelective(HfpmPageEvent record);

    List<HfpmPageEvent> selectByExample(HfpmPageEvent_Example example);

    HfpmPageEvent selectByPrimaryKey(Long hfpmPageEventId);

    int updateByExampleSelective(@Param("record") HfpmPageEvent record, @Param("example") HfpmPageEvent_Example example);

    int updateByExample(@Param("record") HfpmPageEvent record, @Param("example") HfpmPageEvent_Example example);

    int updateByPrimaryKeySelective(HfpmPageEvent record);

    int updateByPrimaryKey(HfpmPageEvent record);
}