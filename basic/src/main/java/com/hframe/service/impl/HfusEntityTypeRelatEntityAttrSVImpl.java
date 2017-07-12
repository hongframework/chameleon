package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfusEntityTypeRelatEntityAttr;
import com.hframe.domain.model.HfusEntityTypeRelatEntityAttr_Example;
import com.hframe.dao.HfusEntityTypeRelatEntityAttrMapper;
import com.hframe.service.interfaces.IHfusEntityTypeRelatEntityAttrSV;

@Service("iHfusEntityTypeRelatEntityAttrSV")
public class HfusEntityTypeRelatEntityAttrSVImpl  implements IHfusEntityTypeRelatEntityAttrSV {

	@Resource
	private HfusEntityTypeRelatEntityAttrMapper hfusEntityTypeRelatEntityAttrMapper;
  
    /**
    * 创建常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @return
    * @throws Exception
    */
    public int create(HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr) throws Exception {
        return hfusEntityTypeRelatEntityAttrMapper.insertSelective(hfusEntityTypeRelatEntityAttr);
    }

    /**
    * 批量维护常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusEntityTypeRelatEntityAttr[] hfusEntityTypeRelatEntityAttrs) throws  Exception{
        int result = 0;
        if(hfusEntityTypeRelatEntityAttrs != null) {
            for (HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr : hfusEntityTypeRelatEntityAttrs) {
                if(hfusEntityTypeRelatEntityAttr.getHfusEntityTypeRelatEntityAttrId() == null) {
                    result += this.create(hfusEntityTypeRelatEntityAttr);
                }else {
                    result += this.update(hfusEntityTypeRelatEntityAttr);
                }
            }
        }
        return result;
    }

    /**
    * 更新常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @return
    * @throws Exception
    */
    public int update(HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr) throws  Exception {
        return hfusEntityTypeRelatEntityAttrMapper.updateByPrimaryKeySelective(hfusEntityTypeRelatEntityAttr);
    }

    /**
    * 通过查询对象更新常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr, HfusEntityTypeRelatEntityAttr_Example example) throws  Exception {
        return hfusEntityTypeRelatEntityAttrMapper.updateByExampleSelective(hfusEntityTypeRelatEntityAttr, example);
    }

    /**
    * 删除常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttr
    * @return
    * @throws Exception
    */
    public int delete(HfusEntityTypeRelatEntityAttr hfusEntityTypeRelatEntityAttr) throws  Exception {
        return hfusEntityTypeRelatEntityAttrMapper.deleteByPrimaryKey(hfusEntityTypeRelatEntityAttr.getHfusEntityTypeRelatEntityAttrId());
    }

    /**
    * 删除常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfusEntityTypeRelatEntityAttrId) throws  Exception {
        return hfusEntityTypeRelatEntityAttrMapper.deleteByPrimaryKey(hfusEntityTypeRelatEntityAttrId);
    }

    /**
    * 查找所有常用实体类型关联属性
    * @return
    */
    public List<HfusEntityTypeRelatEntityAttr> getHfusEntityTypeRelatEntityAttrAll()  throws  Exception {
        return hfusEntityTypeRelatEntityAttrMapper.selectByExample(new HfusEntityTypeRelatEntityAttr_Example());
    }

    /**
    * 通过常用实体类型关联属性ID查询常用实体类型关联属性
    * @param hfusEntityTypeRelatEntityAttrId
    * @return
    * @throws Exception
    */
    public HfusEntityTypeRelatEntityAttr getHfusEntityTypeRelatEntityAttrByPK(long hfusEntityTypeRelatEntityAttrId)  throws  Exception {
        return hfusEntityTypeRelatEntityAttrMapper.selectByPrimaryKey(hfusEntityTypeRelatEntityAttrId);
    }

    /**
    * 通过MAP参数查询常用实体类型关联属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusEntityTypeRelatEntityAttr> getHfusEntityTypeRelatEntityAttrListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询常用实体类型关联属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusEntityTypeRelatEntityAttr> getHfusEntityTypeRelatEntityAttrListByExample(HfusEntityTypeRelatEntityAttr_Example example) throws  Exception {
        return hfusEntityTypeRelatEntityAttrMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询常用实体类型关联属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusEntityTypeRelatEntityAttrCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询常用实体类型关联属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusEntityTypeRelatEntityAttrCountByExample(HfusEntityTypeRelatEntityAttr_Example example) throws  Exception {
        return hfusEntityTypeRelatEntityAttrMapper.countByExample(example);
    }


  	//getter
 	
	public HfusEntityTypeRelatEntityAttrMapper getHfusEntityTypeRelatEntityAttrMapper(){
		return hfusEntityTypeRelatEntityAttrMapper;
	}
	//setter
	public void setHfusEntityTypeRelatEntityAttrMapper(HfusEntityTypeRelatEntityAttrMapper hfusEntityTypeRelatEntityAttrMapper){
    	this.hfusEntityTypeRelatEntityAttrMapper = hfusEntityTypeRelatEntityAttrMapper;
    }
}
