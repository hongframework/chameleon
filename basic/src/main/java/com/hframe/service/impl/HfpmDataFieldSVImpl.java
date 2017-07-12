package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframework.common.util.ExampleUtils;
import com.hframe.domain.model.HfpmDataField;
import com.hframe.domain.model.HfpmDataField_Example;
import com.hframe.dao.HfpmDataFieldMapper;
import com.hframe.service.interfaces.IHfpmDataFieldSV;

@Service("iHfpmDataFieldSV")
public class HfpmDataFieldSVImpl  implements IHfpmDataFieldSV {

	@Resource
	private HfpmDataFieldMapper hfpmDataFieldMapper;
  


    /**
    * 创建数据列
    * @param hfpmDataField
    * @return
    * @throws Exception
    */
    public int create(HfpmDataField hfpmDataField) throws Exception {
        return hfpmDataFieldMapper.insertSelective(hfpmDataField);
    }

    /**
    * 批量维护数据列
    * @param hfpmDataFields
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmDataField[] hfpmDataFields) throws  Exception{
        int result = 0;
        if(hfpmDataFields != null) {
            for (HfpmDataField hfpmDataField : hfpmDataFields) {
                if(hfpmDataField.getHfpmDataFieldId() == null) {
                    result += this.create(hfpmDataField);
                }else {
                    result += this.update(hfpmDataField);
                }
            }
        }
        return result;
    }

    /**
    * 更新数据列
    * @param hfpmDataField
    * @return
    * @throws Exception
    */
    public int update(HfpmDataField hfpmDataField) throws  Exception {
        return hfpmDataFieldMapper.updateByPrimaryKeySelective(hfpmDataField);
    }

    /**
    * 通过查询对象更新数据列
    * @param hfpmDataField
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmDataField hfpmDataField, HfpmDataField_Example example) throws  Exception {
        return hfpmDataFieldMapper.updateByExampleSelective(hfpmDataField, example);
    }

    /**
    * 删除数据列
    * @param hfpmDataField
    * @return
    * @throws Exception
    */
    public int delete(HfpmDataField hfpmDataField) throws  Exception {
        return hfpmDataFieldMapper.deleteByPrimaryKey(hfpmDataField.getHfpmDataFieldId());
    }

    /**
    * 删除数据列
    * @param hfpmDataFieldId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmDataFieldId) throws  Exception {
        return hfpmDataFieldMapper.deleteByPrimaryKey(hfpmDataFieldId);
    }

    /**
    * 查找所有数据列
    * @return
    */
    public List<HfpmDataField> getHfpmDataFieldAll()  throws  Exception {
        return hfpmDataFieldMapper.selectByExample(new HfpmDataField_Example());
    }

    /**
    * 通过数据列ID查询数据列
    * @param hfpmDataFieldId
    * @return
    * @throws Exception
    */
    public HfpmDataField getHfpmDataFieldByPK(long hfpmDataFieldId)  throws  Exception {
        return hfpmDataFieldMapper.selectByPrimaryKey(hfpmDataFieldId);
    }


    /**
    * 通过MAP参数查询数据列
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmDataField> getHfpmDataFieldListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询数据列
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmDataField> getHfpmDataFieldListByExample(HfpmDataField_Example example) throws  Exception {
        return hfpmDataFieldMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询数据列数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmDataFieldCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询数据列数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmDataFieldCountByExample(HfpmDataField_Example example) throws  Exception {
        return hfpmDataFieldMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmDataFieldMapper getHfpmDataFieldMapper(){
		return hfpmDataFieldMapper;
	}
	//setter
	public void setHfpmDataFieldMapper(HfpmDataFieldMapper hfpmDataFieldMapper){
    	this.hfpmDataFieldMapper = hfpmDataFieldMapper;
    }
}
