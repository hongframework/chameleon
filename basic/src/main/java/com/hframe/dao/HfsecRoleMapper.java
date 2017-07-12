package com.hframe.dao;

import com.hframe.domain.model.HfsecRole;
import com.hframe.domain.model.HfsecRole_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfsecRoleMapper {
    int countByExample(HfsecRole_Example example);

    int deleteByExample(HfsecRole_Example example);

    int deleteByPrimaryKey(Long hfsecRoleId);

    int insert(HfsecRole record);

    int insertSelective(HfsecRole record);

    List<HfsecRole> selectByExample(HfsecRole_Example example);

    HfsecRole selectByPrimaryKey(Long hfsecRoleId);

    int updateByExampleSelective(@Param("record") HfsecRole record, @Param("example") HfsecRole_Example example);

    int updateByExample(@Param("record") HfsecRole record, @Param("example") HfsecRole_Example example);

    int updateByPrimaryKeySelective(HfsecRole record);

    int updateByPrimaryKey(HfsecRole record);
}