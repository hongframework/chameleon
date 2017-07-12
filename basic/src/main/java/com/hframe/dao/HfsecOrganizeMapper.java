package com.hframe.dao;

import com.hframe.domain.model.HfsecOrganize;
import com.hframe.domain.model.HfsecOrganize_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfsecOrganizeMapper {
    int countByExample(HfsecOrganize_Example example);

    int deleteByExample(HfsecOrganize_Example example);

    int deleteByPrimaryKey(Long hfsecOrganizeId);

    int insert(HfsecOrganize record);

    int insertSelective(HfsecOrganize record);

    List<HfsecOrganize> selectByExample(HfsecOrganize_Example example);

    HfsecOrganize selectByPrimaryKey(Long hfsecOrganizeId);

    int updateByExampleSelective(@Param("record") HfsecOrganize record, @Param("example") HfsecOrganize_Example example);

    int updateByExample(@Param("record") HfsecOrganize record, @Param("example") HfsecOrganize_Example example);

    int updateByPrimaryKeySelective(HfsecOrganize record);

    int updateByPrimaryKey(HfsecOrganize record);
}