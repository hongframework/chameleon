package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfpmPageEventAttr;
import com.hframe.domain.model.HfpmPageEventAttr_Example;
import com.hframe.dao.HfpmPageEventAttrMapper;
import com.hframe.service.interfaces.IHfpmPageEventAttrSV;

@Service("iHfpmPageEventAttrSV")
public class HfpmPageEventAttrSVImpl  implements IHfpmPageEventAttrSV {

	@Resource
	private HfpmPageEventAttrMapper hfpmPageEventAttrMapper;
  
    /**
    * 创建事件属性
    * @param hfpmPageEventAttr
    * @return
    * @throws Exception
    */
    public int create(HfpmPageEventAttr hfpmPageEventAttr) throws Exception {
        return hfpmPageEventAttrMapper.insertSelective(hfpmPageEventAttr);
    }

    /**
    * 批量维护事件属性
    * @param hfpmPageEventAttrs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPageEventAttr[] hfpmPageEventAttrs) throws  Exception{
        int result = 0;
        if(hfpmPageEventAttrs != null) {
            for (HfpmPageEventAttr hfpmPageEventAttr : hfpmPageEventAttrs) {
                if(hfpmPageEventAttr.getHfpmPageEventAttrId() == null) {
                    result += this.create(hfpmPageEventAttr);
                }else {
                    result += this.update(hfpmPageEventAttr);
                }
            }
        }
        return result;
    }

    /**
    * 更新事件属性
    * @param hfpmPageEventAttr
    * @return
    * @throws Exception
    */
    public int update(HfpmPageEventAttr hfpmPageEventAttr) throws  Exception {
        return hfpmPageEventAttrMapper.updateByPrimaryKeySelective(hfpmPageEventAttr);
    }

    /**
    * 通过查询对象更新事件属性
    * @param hfpmPageEventAttr
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPageEventAttr hfpmPageEventAttr, HfpmPageEventAttr_Example example) throws  Exception {
        return hfpmPageEventAttrMapper.updateByExampleSelective(hfpmPageEventAttr, example);
    }

    /**
    * 删除事件属性
    * @param hfpmPageEventAttr
    * @return
    * @throws Exception
    */
    public int delete(HfpmPageEventAttr hfpmPageEventAttr) throws  Exception {
        return hfpmPageEventAttrMapper.deleteByPrimaryKey(hfpmPageEventAttr.getHfpmPageEventAttrId());
    }

    /**
    * 删除事件属性
    * @param hfpmPageEventAttrId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageEventAttrId) throws  Exception {
        return hfpmPageEventAttrMapper.deleteByPrimaryKey(hfpmPageEventAttrId);
    }

    /**
    * 查找所有事件属性
    * @return
    */
    public List<HfpmPageEventAttr> getHfpmPageEventAttrAll()  throws  Exception {
        return hfpmPageEventAttrMapper.selectByExample(new HfpmPageEventAttr_Example());
    }

    /**
    * 通过事件属性ID查询事件属性
    * @param hfpmPageEventAttrId
    * @return
    * @throws Exception
    */
    public HfpmPageEventAttr getHfpmPageEventAttrByPK(long hfpmPageEventAttrId)  throws  Exception {
        return hfpmPageEventAttrMapper.selectByPrimaryKey(hfpmPageEventAttrId);
    }

    /**
    * 通过MAP参数查询事件属性
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPageEventAttr> getHfpmPageEventAttrListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询事件属性
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPageEventAttr> getHfpmPageEventAttrListByExample(HfpmPageEventAttr_Example example) throws  Exception {
        return hfpmPageEventAttrMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询事件属性数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageEventAttrCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询事件属性数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageEventAttrCountByExample(HfpmPageEventAttr_Example example) throws  Exception {
        return hfpmPageEventAttrMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmPageEventAttrMapper getHfpmPageEventAttrMapper(){
		return hfpmPageEventAttrMapper;
	}
	//setter
	public void setHfpmPageEventAttrMapper(HfpmPageEventAttrMapper hfpmPageEventAttrMapper){
    	this.hfpmPageEventAttrMapper = hfpmPageEventAttrMapper;
    }
}
