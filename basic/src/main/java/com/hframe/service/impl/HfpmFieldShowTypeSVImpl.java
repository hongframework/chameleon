package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfpmFieldShowType;
import com.hframe.domain.model.HfpmFieldShowType_Example;
import com.hframe.dao.HfpmFieldShowTypeMapper;
import com.hframe.service.interfaces.IHfpmFieldShowTypeSV;

@Service("iHfpmFieldShowTypeSV")
public class HfpmFieldShowTypeSVImpl  implements IHfpmFieldShowTypeSV {

	@Resource
	private HfpmFieldShowTypeMapper hfpmFieldShowTypeMapper;
  
    /**
    * 创建列展示类型
    * @param hfpmFieldShowType
    * @return
    * @throws Exception
    */
    public int create(HfpmFieldShowType hfpmFieldShowType) throws Exception {
        return hfpmFieldShowTypeMapper.insertSelective(hfpmFieldShowType);
    }

    /**
    * 批量维护列展示类型
    * @param hfpmFieldShowTypes
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmFieldShowType[] hfpmFieldShowTypes) throws  Exception{
        int result = 0;
        if(hfpmFieldShowTypes != null) {
            for (HfpmFieldShowType hfpmFieldShowType : hfpmFieldShowTypes) {
                if(hfpmFieldShowType.getHfpmFieldShowTypeId() == null) {
                    result += this.create(hfpmFieldShowType);
                }else {
                    result += this.update(hfpmFieldShowType);
                }
            }
        }
        return result;
    }

    /**
    * 更新列展示类型
    * @param hfpmFieldShowType
    * @return
    * @throws Exception
    */
    public int update(HfpmFieldShowType hfpmFieldShowType) throws  Exception {
        return hfpmFieldShowTypeMapper.updateByPrimaryKeySelective(hfpmFieldShowType);
    }

    /**
    * 通过查询对象更新列展示类型
    * @param hfpmFieldShowType
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmFieldShowType hfpmFieldShowType, HfpmFieldShowType_Example example) throws  Exception {
        return hfpmFieldShowTypeMapper.updateByExampleSelective(hfpmFieldShowType, example);
    }

    /**
    * 删除列展示类型
    * @param hfpmFieldShowType
    * @return
    * @throws Exception
    */
    public int delete(HfpmFieldShowType hfpmFieldShowType) throws  Exception {
        return hfpmFieldShowTypeMapper.deleteByPrimaryKey(hfpmFieldShowType.getHfpmFieldShowTypeId());
    }

    /**
    * 删除列展示类型
    * @param hfpmFieldShowTypeId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmFieldShowTypeId) throws  Exception {
        return hfpmFieldShowTypeMapper.deleteByPrimaryKey(hfpmFieldShowTypeId);
    }

    /**
    * 查找所有列展示类型
    * @return
    */
    public List<HfpmFieldShowType> getHfpmFieldShowTypeAll()  throws  Exception {
        return hfpmFieldShowTypeMapper.selectByExample(new HfpmFieldShowType_Example());
    }

    /**
    * 通过列展示类型ID查询列展示类型
    * @param hfpmFieldShowTypeId
    * @return
    * @throws Exception
    */
    public HfpmFieldShowType getHfpmFieldShowTypeByPK(long hfpmFieldShowTypeId)  throws  Exception {
        return hfpmFieldShowTypeMapper.selectByPrimaryKey(hfpmFieldShowTypeId);
    }

    /**
    * 通过MAP参数查询列展示类型
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmFieldShowType> getHfpmFieldShowTypeListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询列展示类型
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmFieldShowType> getHfpmFieldShowTypeListByExample(HfpmFieldShowType_Example example) throws  Exception {
        return hfpmFieldShowTypeMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询列展示类型数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmFieldShowTypeCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询列展示类型数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmFieldShowTypeCountByExample(HfpmFieldShowType_Example example) throws  Exception {
        return hfpmFieldShowTypeMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmFieldShowTypeMapper getHfpmFieldShowTypeMapper(){
		return hfpmFieldShowTypeMapper;
	}
	//setter
	public void setHfpmFieldShowTypeMapper(HfpmFieldShowTypeMapper hfpmFieldShowTypeMapper){
    	this.hfpmFieldShowTypeMapper = hfpmFieldShowTypeMapper;
    }
}
