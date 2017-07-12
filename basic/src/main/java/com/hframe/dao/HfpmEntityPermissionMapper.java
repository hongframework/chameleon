package com.hframe.dao;

import com.hframe.domain.model.HfpmEntityPermission;
import com.hframe.domain.model.HfpmEntityPermission_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmEntityPermissionMapper {
    int countByExample(HfpmEntityPermission_Example example);

    int deleteByExample(HfpmEntityPermission_Example example);

    int deleteByPrimaryKey(Long hfpmEntityPermissionId);

    int insert(HfpmEntityPermission record);

    int insertSelective(HfpmEntityPermission record);

    List<HfpmEntityPermission> selectByExample(HfpmEntityPermission_Example example);

    HfpmEntityPermission selectByPrimaryKey(Long hfpmEntityPermissionId);

    int updateByExampleSelective(@Param("record") HfpmEntityPermission record, @Param("example") HfpmEntityPermission_Example example);

    int updateByExample(@Param("record") HfpmEntityPermission record, @Param("example") HfpmEntityPermission_Example example);

    int updateByPrimaryKeySelective(HfpmEntityPermission record);

    int updateByPrimaryKey(HfpmEntityPermission record);
}