package com.hframe.dao;

import com.hframe.domain.model.HfcfgProgramSkin;
import com.hframe.domain.model.HfcfgProgramSkin_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfcfgProgramSkinMapper {
    int countByExample(HfcfgProgramSkin_Example example);

    int deleteByExample(HfcfgProgramSkin_Example example);

    int deleteByPrimaryKey(Long hfcfgProgramSkinId);

    int insert(HfcfgProgramSkin record);

    int insertSelective(HfcfgProgramSkin record);

    List<HfcfgProgramSkin> selectByExample(HfcfgProgramSkin_Example example);

    HfcfgProgramSkin selectByPrimaryKey(Long hfcfgProgramSkinId);

    int updateByExampleSelective(@Param("record") HfcfgProgramSkin record, @Param("example") HfcfgProgramSkin_Example example);

    int updateByExample(@Param("record") HfcfgProgramSkin record, @Param("example") HfcfgProgramSkin_Example example);

    int updateByPrimaryKeySelective(HfcfgProgramSkin record);

    int updateByPrimaryKey(HfcfgProgramSkin record);
}