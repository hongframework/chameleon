package com.hframe.dao;

import com.hframe.domain.model.HfsecUser;
import com.hframe.domain.model.HfsecUser_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfsecUserMapper {
    int countByExample(HfsecUser_Example example);

    int deleteByExample(HfsecUser_Example example);

    int deleteByPrimaryKey(Long hfsecUserId);

    int insert(HfsecUser record);

    int insertSelective(HfsecUser record);

    List<HfsecUser> selectByExample(HfsecUser_Example example);

    HfsecUser selectByPrimaryKey(Long hfsecUserId);

    int updateByExampleSelective(@Param("record") HfsecUser record, @Param("example") HfsecUser_Example example);

    int updateByExample(@Param("record") HfsecUser record, @Param("example") HfsecUser_Example example);

    int updateByPrimaryKeySelective(HfsecUser record);

    int updateByPrimaryKey(HfsecUser record);
}