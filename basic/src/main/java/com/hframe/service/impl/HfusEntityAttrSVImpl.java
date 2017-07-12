package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfusEntityAttr;
import com.hframe.domain.model.HfusEntityAttr_Example;
import com.hframe.dao.HfusEntityAttrMapper;
import com.hframe.service.interfaces.IHfusEntityAttrSV;

@Service("iHfusEntityAttrSV")
public class HfusEntityAttrSVImpl  implements IHfusEntityAttrSV {

	@Resource
	private HfusEntityAttrMapper hfusEntityAttrMapper;
  
    /**
    * 创建常用实体属性
    * @param hfusEntityAttr
    * @return
    * @throws Exception
    */
    public int create(HfusEntityAttr hfusEntityAttr) throws Exception {
        return hfusEntityAttrMapper.insertSelective(hfusEntityAttr);
    }

    /**
    * 批量维护常用实体属性
    * @param hfusEntityAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusEntityAttr[] hfusEntityAttrs) throws  Exception{
        int result = 0;
        if(hfusEntityAttrs != null) {
            for (HfusEntityAttr hfusEntityAttr : hfusEntityAttrs) {
                if(hfusEntityAttr.getHfusEntityAttrId() == null) {
                    result += this.create(hfusEntityAttr);
                }else {
                    result += this.update(hfusEntityAttr);
                }
            }
        }
        return result;
    }

    /**
    * 更新常用实体属性
    * @param hfusEntityAttr
    * @return
    * @throws Exception
    */
    public int update(HfusEntityAttr hfusEntityAttr) throws  Exception {
        return hfusEntityAttrMapper.updateByPrimaryKeySelective(hfusEntityAttr);
    }

    /**
    * 通过查询对象更新常用实体属性
    * @param hfusEntityAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusEntityAttr hfusEntityAttr, HfusEntityAttr_Example example) throws  Exception {
        return hfusEntityAttrMapper.updateByExampleSelective(hfusEntityAttr, example);
    }

    /**
    * 删除常用实体属性
    * @param hfusEntityAttr
    * @return
    * @throws Exception
    */
    public int delete(HfusEntityAttr hfusEntityAttr) throws  Exception {
        return hfusEntityAttrMapper.deleteByPrimaryKey(hfusEntityAttr.getHfusEntityAttrId());
    }

    /**
    * 删除常用实体属性
    * @param hfusEntityAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfusEntityAttrId) throws  Exception {
        return hfusEntityAttrMapper.deleteByPrimaryKey(hfusEntityAttrId);
    }

    /**
    * 查找所有常用实体属性
    * @return
    */
    public List<HfusEntityAttr> getHfusEntityAttrAll()  throws  Exception {
        return hfusEntityAttrMapper.selectByExample(new HfusEntityAttr_Example());
    }

    /**
    * 通过常用实体属性ID查询常用实体属性
    * @param hfusEntityAttrId
    * @return
    * @throws Exception
    */
    public HfusEntityAttr getHfusEntityAttrByPK(long hfusEntityAttrId)  throws  Exception {
        return hfusEntityAttrMapper.selectByPrimaryKey(hfusEntityAttrId);
    }

    /**
    * 通过MAP参数查询常用实体属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusEntityAttr> getHfusEntityAttrListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询常用实体属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusEntityAttr> getHfusEntityAttrListByExample(HfusEntityAttr_Example example) throws  Exception {
        return hfusEntityAttrMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询常用实体属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusEntityAttrCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询常用实体属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusEntityAttrCountByExample(HfusEntityAttr_Example example) throws  Exception {
        return hfusEntityAttrMapper.countByExample(example);
    }


  	//getter
 	
	public HfusEntityAttrMapper getHfusEntityAttrMapper(){
		return hfusEntityAttrMapper;
	}
	//setter
	public void setHfusEntityAttrMapper(HfusEntityAttrMapper hfusEntityAttrMapper){
    	this.hfusEntityAttrMapper = hfusEntityAttrMapper;
    }
}
