package com.hframe.dao;

import com.hframe.domain.model.HfpmFieldShowType;
import com.hframe.domain.model.HfpmFieldShowType_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmFieldShowTypeMapper {
    int countByExample(HfpmFieldShowType_Example example);

    int deleteByExample(HfpmFieldShowType_Example example);

    int deleteByPrimaryKey(Long hfpmFieldShowTypeId);

    int insert(HfpmFieldShowType record);

    int insertSelective(HfpmFieldShowType record);

    List<HfpmFieldShowType> selectByExample(HfpmFieldShowType_Example example);

    HfpmFieldShowType selectByPrimaryKey(Long hfpmFieldShowTypeId);

    int updateByExampleSelective(@Param("record") HfpmFieldShowType record, @Param("example") HfpmFieldShowType_Example example);

    int updateByExample(@Param("record") HfpmFieldShowType record, @Param("example") HfpmFieldShowType_Example example);

    int updateByPrimaryKeySelective(HfpmFieldShowType record);

    int updateByPrimaryKey(HfpmFieldShowType record);
}