package com.hframe.dao;

import com.hframe.domain.model.HfusPageEvent;
import com.hframe.domain.model.HfusPageEvent_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfusPageEventMapper {
    int countByExample(HfusPageEvent_Example example);

    int deleteByExample(HfusPageEvent_Example example);

    int deleteByPrimaryKey(Long hfusPageEventId);

    int insert(HfusPageEvent record);

    int insertSelective(HfusPageEvent record);

    List<HfusPageEvent> selectByExample(HfusPageEvent_Example example);

    HfusPageEvent selectByPrimaryKey(Long hfusPageEventId);

    int updateByExampleSelective(@Param("record") HfusPageEvent record, @Param("example") HfusPageEvent_Example example);

    int updateByExample(@Param("record") HfusPageEvent record, @Param("example") HfusPageEvent_Example example);

    int updateByPrimaryKeySelective(HfusPageEvent record);

    int updateByPrimaryKey(HfusPageEvent record);
}