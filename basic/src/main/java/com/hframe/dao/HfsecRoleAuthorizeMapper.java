package com.hframe.dao;

import com.hframe.domain.model.HfsecRoleAuthorize;
import com.hframe.domain.model.HfsecRoleAuthorize_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfsecRoleAuthorizeMapper {
    int countByExample(HfsecRoleAuthorize_Example example);

    int deleteByExample(HfsecRoleAuthorize_Example example);

    int deleteByPrimaryKey(Long hfsecRoleAuthorizeId);

    int insert(HfsecRoleAuthorize record);

    int insertSelective(HfsecRoleAuthorize record);

    List<HfsecRoleAuthorize> selectByExample(HfsecRoleAuthorize_Example example);

    HfsecRoleAuthorize selectByPrimaryKey(Long hfsecRoleAuthorizeId);

    int updateByExampleSelective(@Param("record") HfsecRoleAuthorize record, @Param("example") HfsecRoleAuthorize_Example example);

    int updateByExample(@Param("record") HfsecRoleAuthorize record, @Param("example") HfsecRoleAuthorize_Example example);

    int updateByPrimaryKeySelective(HfsecRoleAuthorize record);

    int updateByPrimaryKey(HfsecRoleAuthorize record);
}