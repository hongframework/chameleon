package com.hframe.dao;

import com.hframe.domain.model.HfusEntityStore;
import com.hframe.domain.model.HfusEntityStore_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfusEntityStoreMapper {
    int countByExample(HfusEntityStore_Example example);

    int deleteByExample(HfusEntityStore_Example example);

    int deleteByPrimaryKey(Long hfusEntityStoreId);

    int insert(HfusEntityStore record);

    int insertSelective(HfusEntityStore record);

    List<HfusEntityStore> selectByExampleWithBLOBs(HfusEntityStore_Example example);

    List<HfusEntityStore> selectByExample(HfusEntityStore_Example example);

    HfusEntityStore selectByPrimaryKey(Long hfusEntityStoreId);

    int updateByExampleSelective(@Param("record") HfusEntityStore record, @Param("example") HfusEntityStore_Example example);

    int updateByExampleWithBLOBs(@Param("record") HfusEntityStore record, @Param("example") HfusEntityStore_Example example);

    int updateByExample(@Param("record") HfusEntityStore record, @Param("example") HfusEntityStore_Example example);

    int updateByPrimaryKeySelective(HfusEntityStore record);

    int updateByPrimaryKeyWithBLOBs(HfusEntityStore record);

    int updateByPrimaryKey(HfusEntityStore record);
}