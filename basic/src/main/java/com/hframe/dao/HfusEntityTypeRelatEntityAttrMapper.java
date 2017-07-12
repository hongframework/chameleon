package com.hframe.dao;

import com.hframe.domain.model.HfusEntityTypeRelatEntityAttr;
import com.hframe.domain.model.HfusEntityTypeRelatEntityAttr_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfusEntityTypeRelatEntityAttrMapper {
    int countByExample(HfusEntityTypeRelatEntityAttr_Example example);

    int deleteByExample(HfusEntityTypeRelatEntityAttr_Example example);

    int deleteByPrimaryKey(Long hfusEntityTypeRelatEntityAttrId);

    int insert(HfusEntityTypeRelatEntityAttr record);

    int insertSelective(HfusEntityTypeRelatEntityAttr record);

    List<HfusEntityTypeRelatEntityAttr> selectByExample(HfusEntityTypeRelatEntityAttr_Example example);

    HfusEntityTypeRelatEntityAttr selectByPrimaryKey(Long hfusEntityTypeRelatEntityAttrId);

    int updateByExampleSelective(@Param("record") HfusEntityTypeRelatEntityAttr record, @Param("example") HfusEntityTypeRelatEntityAttr_Example example);

    int updateByExample(@Param("record") HfusEntityTypeRelatEntityAttr record, @Param("example") HfusEntityTypeRelatEntityAttr_Example example);

    int updateByPrimaryKeySelective(HfusEntityTypeRelatEntityAttr record);

    int updateByPrimaryKey(HfusEntityTypeRelatEntityAttr record);
}