package com.hframe.dao;

import com.hframe.domain.model.HfpmPageCfg;
import com.hframe.domain.model.HfpmPageCfg_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmPageCfgMapper {
    int countByExample(HfpmPageCfg_Example example);

    int deleteByExample(HfpmPageCfg_Example example);

    int deleteByPrimaryKey(Long hfpmPageCfgId);

    int insert(HfpmPageCfg record);

    int insertSelective(HfpmPageCfg record);

    List<HfpmPageCfg> selectByExample(HfpmPageCfg_Example example);

    HfpmPageCfg selectByPrimaryKey(Long hfpmPageCfgId);

    int updateByExampleSelective(@Param("record") HfpmPageCfg record, @Param("example") HfpmPageCfg_Example example);

    int updateByExample(@Param("record") HfpmPageCfg record, @Param("example") HfpmPageCfg_Example example);

    int updateByPrimaryKeySelective(HfpmPageCfg record);

    int updateByPrimaryKey(HfpmPageCfg record);
}