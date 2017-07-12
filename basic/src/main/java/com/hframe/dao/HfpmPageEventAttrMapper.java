package com.hframe.dao;

import com.hframe.domain.model.HfpmPageEventAttr;
import com.hframe.domain.model.HfpmPageEventAttr_Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfpmPageEventAttrMapper {
    int countByExample(HfpmPageEventAttr_Example example);

    int deleteByExample(HfpmPageEventAttr_Example example);

    int deleteByPrimaryKey(Long hfpmPageEventAttrId);

    int insert(HfpmPageEventAttr record);

    int insertSelective(HfpmPageEventAttr record);

    List<HfpmPageEventAttr> selectByExample(HfpmPageEventAttr_Example example);

    HfpmPageEventAttr selectByPrimaryKey(Long hfpmPageEventAttrId);

    int updateByExampleSelective(@Param("record") HfpmPageEventAttr record, @Param("example") HfpmPageEventAttr_Example example);

    int updateByExample(@Param("record") HfpmPageEventAttr record, @Param("example") HfpmPageEventAttr_Example example);

    int updateByPrimaryKeySelective(HfpmPageEventAttr record);

    int updateByPrimaryKey(HfpmPageEventAttr record);
}