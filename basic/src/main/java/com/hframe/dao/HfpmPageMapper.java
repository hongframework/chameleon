package com.hframe.dao;

import com.hframe.domain.model.HfpmPage;
import com.hframe.domain.model.HfpmPage_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmPageMapper {
    int countByExample(HfpmPage_Example example);

    int deleteByExample(HfpmPage_Example example);

    int deleteByPrimaryKey(Long hfpmPageId);

    int insert(HfpmPage record);

    int insertSelective(HfpmPage record);

    List<HfpmPage> selectByExample(HfpmPage_Example example);

    HfpmPage selectByPrimaryKey(Long hfpmPageId);

    int updateByExampleSelective(@Param("record") HfpmPage record, @Param("example") HfpmPage_Example example);

    int updateByExample(@Param("record") HfpmPage record, @Param("example") HfpmPage_Example example);

    int updateByPrimaryKeySelective(HfpmPage record);

    int updateByPrimaryKey(HfpmPage record);
}