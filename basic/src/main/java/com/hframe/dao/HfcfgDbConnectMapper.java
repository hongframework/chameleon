package com.hframe.dao;

import com.hframe.domain.model.HfcfgDbConnect;
import com.hframe.domain.model.HfcfgDbConnect_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfcfgDbConnectMapper {
    int countByExample(HfcfgDbConnect_Example example);

    int deleteByExample(HfcfgDbConnect_Example example);

    int deleteByPrimaryKey(Long hfcfgDbConnectId);

    int insert(HfcfgDbConnect record);

    int insertSelective(HfcfgDbConnect record);

    List<HfcfgDbConnect> selectByExample(HfcfgDbConnect_Example example);

    HfcfgDbConnect selectByPrimaryKey(Long hfcfgDbConnectId);

    int updateByExampleSelective(@Param("record") HfcfgDbConnect record, @Param("example") HfcfgDbConnect_Example example);

    int updateByExample(@Param("record") HfcfgDbConnect record, @Param("example") HfcfgDbConnect_Example example);

    int updateByPrimaryKeySelective(HfcfgDbConnect record);

    int updateByPrimaryKey(HfcfgDbConnect record);
}