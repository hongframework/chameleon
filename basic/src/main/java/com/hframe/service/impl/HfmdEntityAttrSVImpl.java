package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfmdEntityAttr;
import com.hframe.domain.model.HfmdEntityAttr_Example;
import com.hframe.dao.HfmdEntityAttrMapper;
import com.hframe.service.interfaces.IHfmdEntityAttrSV;

@Service("iHfmdEntityAttrSV")
public class HfmdEntityAttrSVImpl  implements IHfmdEntityAttrSV {

	@Resource
	private HfmdEntityAttrMapper hfmdEntityAttrMapper;
  
    /**
    * 创建实体属性
    * @param hfmdEntityAttr
    * @return
    * @throws Exception
    */
    public int create(HfmdEntityAttr hfmdEntityAttr) throws Exception {
        return hfmdEntityAttrMapper.insertSelective(hfmdEntityAttr);
    }

    /**
    * 批量维护实体属性
    * @param hfmdEntityAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEntityAttr[] hfmdEntityAttrs) throws  Exception{
        int result = 0;
        if(hfmdEntityAttrs != null) {
            for (HfmdEntityAttr hfmdEntityAttr : hfmdEntityAttrs) {
                if(hfmdEntityAttr.getHfmdEntityAttrId() == null) {
                    result += this.create(hfmdEntityAttr);
                }else {
                    result += this.update(hfmdEntityAttr);
                }
            }
        }
        return result;
    }

    /**
    * 更新实体属性
    * @param hfmdEntityAttr
    * @return
    * @throws Exception
    */
    public int update(HfmdEntityAttr hfmdEntityAttr) throws  Exception {
        return hfmdEntityAttrMapper.updateByPrimaryKeySelective(hfmdEntityAttr);
    }

    /**
    * 通过查询对象更新实体属性
    * @param hfmdEntityAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEntityAttr hfmdEntityAttr, HfmdEntityAttr_Example example) throws  Exception {
        return hfmdEntityAttrMapper.updateByExampleSelective(hfmdEntityAttr, example);
    }

    /**
    * 删除实体属性
    * @param hfmdEntityAttr
    * @return
    * @throws Exception
    */
    public int delete(HfmdEntityAttr hfmdEntityAttr) throws  Exception {
        return hfmdEntityAttrMapper.deleteByPrimaryKey(hfmdEntityAttr.getHfmdEntityAttrId());
    }

    /**
    * 删除实体属性
    * @param hfmdEntityAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEntityAttrId) throws  Exception {
        return hfmdEntityAttrMapper.deleteByPrimaryKey(hfmdEntityAttrId);
    }

    /**
    * 查找所有实体属性
    * @return
    */
    public List<HfmdEntityAttr> getHfmdEntityAttrAll()  throws  Exception {
        return hfmdEntityAttrMapper.selectByExample(new HfmdEntityAttr_Example());
    }

    /**
    * 通过实体属性ID查询实体属性
    * @param hfmdEntityAttrId
    * @return
    * @throws Exception
    */
    public HfmdEntityAttr getHfmdEntityAttrByPK(long hfmdEntityAttrId)  throws  Exception {
        return hfmdEntityAttrMapper.selectByPrimaryKey(hfmdEntityAttrId);
    }

    /**
    * 通过MAP参数查询实体属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEntityAttr> getHfmdEntityAttrListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询实体属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEntityAttr> getHfmdEntityAttrListByExample(HfmdEntityAttr_Example example) throws  Exception {
        return hfmdEntityAttrMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询实体属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEntityAttrCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询实体属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEntityAttrCountByExample(HfmdEntityAttr_Example example) throws  Exception {
        return hfmdEntityAttrMapper.countByExample(example);
    }


  	//getter
 	
	public HfmdEntityAttrMapper getHfmdEntityAttrMapper(){
		return hfmdEntityAttrMapper;
	}
	//setter
	public void setHfmdEntityAttrMapper(HfmdEntityAttrMapper hfmdEntityAttrMapper){
    	this.hfmdEntityAttrMapper = hfmdEntityAttrMapper;
    }
}
