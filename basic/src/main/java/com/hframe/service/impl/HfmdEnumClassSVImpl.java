package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfmdEnumClass;
import com.hframe.domain.model.HfmdEnumClass_Example;
import com.hframe.dao.HfmdEnumClassMapper;
import com.hframe.service.interfaces.IHfmdEnumClassSV;

@Service("iHfmdEnumClassSV")
public class HfmdEnumClassSVImpl  implements IHfmdEnumClassSV {

	@Resource
	private HfmdEnumClassMapper hfmdEnumClassMapper;
  
    /**
    * 创建枚举组
    * @param hfmdEnumClass
    * @return
    * @throws Exception
    */
    public int create(HfmdEnumClass hfmdEnumClass) throws Exception {
        return hfmdEnumClassMapper.insertSelective(hfmdEnumClass);
    }

    /**
    * 批量维护枚举组
    * @param hfmdEnumClasss
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEnumClass[] hfmdEnumClasss) throws  Exception{
        int result = 0;
        if(hfmdEnumClasss != null) {
            for (HfmdEnumClass hfmdEnumClass : hfmdEnumClasss) {
                if(hfmdEnumClass.getHfmdEnumClassId() == null) {
                    result += this.create(hfmdEnumClass);
                }else {
                    result += this.update(hfmdEnumClass);
                }
            }
        }
        return result;
    }

    /**
    * 更新枚举组
    * @param hfmdEnumClass
    * @return
    * @throws Exception
    */
    public int update(HfmdEnumClass hfmdEnumClass) throws  Exception {
        return hfmdEnumClassMapper.updateByPrimaryKeySelective(hfmdEnumClass);
    }

    /**
    * 通过查询对象更新枚举组
    * @param hfmdEnumClass
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEnumClass hfmdEnumClass, HfmdEnumClass_Example example) throws  Exception {
        return hfmdEnumClassMapper.updateByExampleSelective(hfmdEnumClass, example);
    }

    /**
    * 删除枚举组
    * @param hfmdEnumClass
    * @return
    * @throws Exception
    */
    public int delete(HfmdEnumClass hfmdEnumClass) throws  Exception {
        return hfmdEnumClassMapper.deleteByPrimaryKey(hfmdEnumClass.getHfmdEnumClassId());
    }

    /**
    * 删除枚举组
    * @param hfmdEnumClassId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEnumClassId) throws  Exception {
        return hfmdEnumClassMapper.deleteByPrimaryKey(hfmdEnumClassId);
    }

    /**
    * 查找所有枚举组
    * @return
    */
    public List<HfmdEnumClass> getHfmdEnumClassAll()  throws  Exception {
        return hfmdEnumClassMapper.selectByExample(new HfmdEnumClass_Example());
    }

    /**
    * 通过枚举组ID查询枚举组
    * @param hfmdEnumClassId
    * @return
    * @throws Exception
    */
    public HfmdEnumClass getHfmdEnumClassByPK(long hfmdEnumClassId)  throws  Exception {
        return hfmdEnumClassMapper.selectByPrimaryKey(hfmdEnumClassId);
    }

    /**
    * 通过MAP参数查询枚举组
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEnumClass> getHfmdEnumClassListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询枚举组
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEnumClass> getHfmdEnumClassListByExample(HfmdEnumClass_Example example) throws  Exception {
        return hfmdEnumClassMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询枚举组数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEnumClassCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询枚举组数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEnumClassCountByExample(HfmdEnumClass_Example example) throws  Exception {
        return hfmdEnumClassMapper.countByExample(example);
    }


  	//getter
 	
	public HfmdEnumClassMapper getHfmdEnumClassMapper(){
		return hfmdEnumClassMapper;
	}
	//setter
	public void setHfmdEnumClassMapper(HfmdEnumClassMapper hfmdEnumClassMapper){
    	this.hfmdEnumClassMapper = hfmdEnumClassMapper;
    }
}
