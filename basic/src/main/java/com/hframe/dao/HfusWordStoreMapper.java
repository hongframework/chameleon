package com.hframe.dao;

import com.hframe.domain.model.HfusWordStore;
import com.hframe.domain.model.HfusWordStore_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfusWordStoreMapper {
    int countByExample(HfusWordStore_Example example);

    int deleteByExample(HfusWordStore_Example example);

    int deleteByPrimaryKey(Long hfusWordStoreId);

    int insert(HfusWordStore record);

    int insertSelective(HfusWordStore record);

    List<HfusWordStore> selectByExample(HfusWordStore_Example example);

    HfusWordStore selectByPrimaryKey(Long hfusWordStoreId);

    int updateByExampleSelective(@Param("record") HfusWordStore record, @Param("example") HfusWordStore_Example example);

    int updateByExample(@Param("record") HfusWordStore record, @Param("example") HfusWordStore_Example example);

    int updateByPrimaryKeySelective(HfusWordStore record);

    int updateByPrimaryKey(HfusWordStore record);
}