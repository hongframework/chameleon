package com.hframe.dao;

import com.hframe.domain.model.HfcfgLoginPage;
import com.hframe.domain.model.HfcfgLoginPage_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfcfgLoginPageMapper {
    int countByExample(HfcfgLoginPage_Example example);

    int deleteByExample(HfcfgLoginPage_Example example);

    int deleteByPrimaryKey(Long hfcfgLoginPageId);

    int insert(HfcfgLoginPage record);

    int insertSelective(HfcfgLoginPage record);

    List<HfcfgLoginPage> selectByExample(HfcfgLoginPage_Example example);

    HfcfgLoginPage selectByPrimaryKey(Long hfcfgLoginPageId);

    int updateByExampleSelective(@Param("record") HfcfgLoginPage record, @Param("example") HfcfgLoginPage_Example example);

    int updateByExample(@Param("record") HfcfgLoginPage record, @Param("example") HfcfgLoginPage_Example example);

    int updateByPrimaryKeySelective(HfcfgLoginPage record);

    int updateByPrimaryKey(HfcfgLoginPage record);
}