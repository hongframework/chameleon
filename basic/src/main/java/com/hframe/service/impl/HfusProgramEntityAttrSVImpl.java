package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfusProgramEntityAttr;
import com.hframe.domain.model.HfusProgramEntityAttr_Example;
import com.hframe.dao.HfusProgramEntityAttrMapper;
import com.hframe.service.interfaces.IHfusProgramEntityAttrSV;

@Service("iHfusProgramEntityAttrSV")
public class HfusProgramEntityAttrSVImpl  implements IHfusProgramEntityAttrSV {

	@Resource
	private HfusProgramEntityAttrMapper hfusProgramEntityAttrMapper;
  
    /**
    * 创建常用项目实体属性
    * @param hfusProgramEntityAttr
    * @return
    * @throws Exception
    */
    public int create(HfusProgramEntityAttr hfusProgramEntityAttr) throws Exception {
        return hfusProgramEntityAttrMapper.insertSelective(hfusProgramEntityAttr);
    }

    /**
    * 批量维护常用项目实体属性
    * @param hfusProgramEntityAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusProgramEntityAttr[] hfusProgramEntityAttrs) throws  Exception{
        int result = 0;
        if(hfusProgramEntityAttrs != null) {
            for (HfusProgramEntityAttr hfusProgramEntityAttr : hfusProgramEntityAttrs) {
                if(hfusProgramEntityAttr.getHfusProgramEntityAttrId() == null) {
                    result += this.create(hfusProgramEntityAttr);
                }else {
                    result += this.update(hfusProgramEntityAttr);
                }
            }
        }
        return result;
    }

    /**
    * 更新常用项目实体属性
    * @param hfusProgramEntityAttr
    * @return
    * @throws Exception
    */
    public int update(HfusProgramEntityAttr hfusProgramEntityAttr) throws  Exception {
        return hfusProgramEntityAttrMapper.updateByPrimaryKeySelective(hfusProgramEntityAttr);
    }

    /**
    * 通过查询对象更新常用项目实体属性
    * @param hfusProgramEntityAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusProgramEntityAttr hfusProgramEntityAttr, HfusProgramEntityAttr_Example example) throws  Exception {
        return hfusProgramEntityAttrMapper.updateByExampleSelective(hfusProgramEntityAttr, example);
    }

    /**
    * 删除常用项目实体属性
    * @param hfusProgramEntityAttr
    * @return
    * @throws Exception
    */
    public int delete(HfusProgramEntityAttr hfusProgramEntityAttr) throws  Exception {
        return hfusProgramEntityAttrMapper.deleteByPrimaryKey(hfusProgramEntityAttr.getHfusProgramEntityAttrId());
    }

    /**
    * 删除常用项目实体属性
    * @param hfusProgramEntityAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfusProgramEntityAttrId) throws  Exception {
        return hfusProgramEntityAttrMapper.deleteByPrimaryKey(hfusProgramEntityAttrId);
    }

    /**
    * 查找所有常用项目实体属性
    * @return
    */
    public List<HfusProgramEntityAttr> getHfusProgramEntityAttrAll()  throws  Exception {
        return hfusProgramEntityAttrMapper.selectByExample(new HfusProgramEntityAttr_Example());
    }

    /**
    * 通过常用项目实体属性ID查询常用项目实体属性
    * @param hfusProgramEntityAttrId
    * @return
    * @throws Exception
    */
    public HfusProgramEntityAttr getHfusProgramEntityAttrByPK(long hfusProgramEntityAttrId)  throws  Exception {
        return hfusProgramEntityAttrMapper.selectByPrimaryKey(hfusProgramEntityAttrId);
    }

    /**
    * 通过MAP参数查询常用项目实体属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusProgramEntityAttr> getHfusProgramEntityAttrListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询常用项目实体属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusProgramEntityAttr> getHfusProgramEntityAttrListByExample(HfusProgramEntityAttr_Example example) throws  Exception {
        return hfusProgramEntityAttrMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询常用项目实体属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusProgramEntityAttrCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询常用项目实体属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusProgramEntityAttrCountByExample(HfusProgramEntityAttr_Example example) throws  Exception {
        return hfusProgramEntityAttrMapper.countByExample(example);
    }


  	//getter
 	
	public HfusProgramEntityAttrMapper getHfusProgramEntityAttrMapper(){
		return hfusProgramEntityAttrMapper;
	}
	//setter
	public void setHfusProgramEntityAttrMapper(HfusProgramEntityAttrMapper hfusProgramEntityAttrMapper){
    	this.hfusProgramEntityAttrMapper = hfusProgramEntityAttrMapper;
    }
}
