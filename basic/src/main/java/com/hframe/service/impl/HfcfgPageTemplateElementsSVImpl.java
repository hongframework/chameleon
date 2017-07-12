package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfcfgPageTemplateElements;
import com.hframe.domain.model.HfcfgPageTemplateElements_Example;
import com.hframe.dao.HfcfgPageTemplateElementsMapper;
import com.hframe.service.interfaces.IHfcfgPageTemplateElementsSV;

@Service("iHfcfgPageTemplateElementsSV")
public class HfcfgPageTemplateElementsSVImpl  implements IHfcfgPageTemplateElementsSV {

	@Resource
	private HfcfgPageTemplateElementsMapper hfcfgPageTemplateElementsMapper;
  


    /**
    * 创建
    * @param hfcfgPageTemplateElements
    * @return
    * @throws Exception
    */
    public int create(HfcfgPageTemplateElements hfcfgPageTemplateElements) throws Exception {
        return hfcfgPageTemplateElementsMapper.insertSelective(hfcfgPageTemplateElements);
    }

    /**
    * 批量维护
    * @param hfcfgPageTemplateElementss
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgPageTemplateElements[] hfcfgPageTemplateElementss) throws  Exception{
        int result = 0;
        if(hfcfgPageTemplateElementss != null) {
            for (HfcfgPageTemplateElements hfcfgPageTemplateElements : hfcfgPageTemplateElementss) {
                if(hfcfgPageTemplateElements.getHfcfgPageTemplateElementsId() == null) {
                    result += this.create(hfcfgPageTemplateElements);
                }else {
                    result += this.update(hfcfgPageTemplateElements);
                }
            }
        }
        return result;
    }

    /**
     * 更新
     * @param hfcfgPageTemplateElements
    * @return
    * @throws Exception
    */
    public int update(HfcfgPageTemplateElements hfcfgPageTemplateElements) throws  Exception {
        return hfcfgPageTemplateElementsMapper.updateByPrimaryKeySelective(hfcfgPageTemplateElements);
    }

    /**
    * 通过查询对象更新
    * @param hfcfgPageTemplateElements
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgPageTemplateElements hfcfgPageTemplateElements, HfcfgPageTemplateElements_Example example) throws  Exception {
        return hfcfgPageTemplateElementsMapper.updateByExampleSelective(hfcfgPageTemplateElements, example);
    }

    /**
    * 删除
    * @param hfcfgPageTemplateElements
    * @return
    * @throws Exception
    */
    public int delete(HfcfgPageTemplateElements hfcfgPageTemplateElements) throws  Exception {
        return hfcfgPageTemplateElementsMapper.deleteByPrimaryKey(hfcfgPageTemplateElements.getHfcfgPageTemplateElementsId());
    }

    /**
    * 删除
    * @param hfcfgPageTemplateElementsId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgPageTemplateElementsId) throws  Exception {
        return hfcfgPageTemplateElementsMapper.deleteByPrimaryKey(hfcfgPageTemplateElementsId);
    }

    /**
    * 查找所有
    * @return
    */
    public List<HfcfgPageTemplateElements> getHfcfgPageTemplateElementsAll()  throws  Exception {
        return hfcfgPageTemplateElementsMapper.selectByExample(new HfcfgPageTemplateElements_Example());
    }

    /**
    * 通过ID查询
    * @param hfcfgPageTemplateElementsId
    * @return
    * @throws Exception
    */
    public HfcfgPageTemplateElements getHfcfgPageTemplateElementsByPK(long hfcfgPageTemplateElementsId)  throws  Exception {
        return hfcfgPageTemplateElementsMapper.selectByPrimaryKey(hfcfgPageTemplateElementsId);
    }


    /**
    * 通过MAP参数查询
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgPageTemplateElements> getHfcfgPageTemplateElementsListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgPageTemplateElements> getHfcfgPageTemplateElementsListByExample(HfcfgPageTemplateElements_Example example) throws  Exception {
        return hfcfgPageTemplateElementsMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgPageTemplateElementsCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgPageTemplateElementsCountByExample(HfcfgPageTemplateElements_Example example) throws  Exception {
        return hfcfgPageTemplateElementsMapper.countByExample(example);
    }


  	//getter
 	
	public HfcfgPageTemplateElementsMapper getHfcfgPageTemplateElementsMapper(){
		return hfcfgPageTemplateElementsMapper;
	}
	//setter
	public void setHfcfgPageTemplateElementsMapper(HfcfgPageTemplateElementsMapper hfcfgPageTemplateElementsMapper){
    	this.hfcfgPageTemplateElementsMapper = hfcfgPageTemplateElementsMapper;
    }
}
