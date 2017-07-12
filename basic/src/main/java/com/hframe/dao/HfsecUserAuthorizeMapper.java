package com.hframe.dao;

import com.hframe.domain.model.HfsecUserAuthorize;
import com.hframe.domain.model.HfsecUserAuthorize_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfsecUserAuthorizeMapper {
    int countByExample(HfsecUserAuthorize_Example example);

    int deleteByExample(HfsecUserAuthorize_Example example);

    int deleteByPrimaryKey(Long hfsecUserAuthorizeId);

    int insert(HfsecUserAuthorize record);

    int insertSelective(HfsecUserAuthorize record);

    List<HfsecUserAuthorize> selectByExample(HfsecUserAuthorize_Example example);

    HfsecUserAuthorize selectByPrimaryKey(Long hfsecUserAuthorizeId);

    int updateByExampleSelective(@Param("record") HfsecUserAuthorize record, @Param("example") HfsecUserAuthorize_Example example);

    int updateByExample(@Param("record") HfsecUserAuthorize record, @Param("example") HfsecUserAuthorize_Example example);

    int updateByPrimaryKeySelective(HfsecUserAuthorize record);

    int updateByPrimaryKey(HfsecUserAuthorize record);
}