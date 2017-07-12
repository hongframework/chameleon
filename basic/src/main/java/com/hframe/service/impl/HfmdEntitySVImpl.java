package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfmdEntity;
import com.hframe.domain.model.HfmdEntity_Example;
import com.hframe.dao.HfmdEntityMapper;
import com.hframe.service.interfaces.IHfmdEntitySV;

@Service("iHfmdEntitySV")
public class HfmdEntitySVImpl  implements IHfmdEntitySV {

	@Resource
	private HfmdEntityMapper hfmdEntityMapper;
  
    /**
    * 创建实体
    * @param hfmdEntity
    * @return
    * @throws Exception
    */
    public int create(HfmdEntity hfmdEntity) throws Exception {
        return hfmdEntityMapper.insertSelective(hfmdEntity);
    }

    /**
    * 批量维护实体
    * @param hfmdEntitys
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEntity[] hfmdEntitys) throws  Exception{
        int result = 0;
        if(hfmdEntitys != null) {
            for (HfmdEntity hfmdEntity : hfmdEntitys) {
                if(hfmdEntity.getHfmdEntityId() == null) {
                    result += this.create(hfmdEntity);
                }else {
                    result += this.update(hfmdEntity);
                }
            }
        }
        return result;
    }

    /**
    * 更新实体
    * @param hfmdEntity
    * @return
    * @throws Exception
    */
    public int update(HfmdEntity hfmdEntity) throws  Exception {
        return hfmdEntityMapper.updateByPrimaryKeySelective(hfmdEntity);
    }

    /**
    * 通过查询对象更新实体
    * @param hfmdEntity
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEntity hfmdEntity, HfmdEntity_Example example) throws  Exception {
        return hfmdEntityMapper.updateByExampleSelective(hfmdEntity, example);
    }

    /**
    * 删除实体
    * @param hfmdEntity
    * @return
    * @throws Exception
    */
    public int delete(HfmdEntity hfmdEntity) throws  Exception {
        return hfmdEntityMapper.deleteByPrimaryKey(hfmdEntity.getHfmdEntityId());
    }

    /**
    * 删除实体
    * @param hfmdEntityId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEntityId) throws  Exception {
        return hfmdEntityMapper.deleteByPrimaryKey(hfmdEntityId);
    }

    /**
    * 查找所有实体
    * @return
    */
    public List<HfmdEntity> getHfmdEntityAll()  throws  Exception {
        return hfmdEntityMapper.selectByExample(new HfmdEntity_Example());
    }

    /**
    * 通过实体ID查询实体
    * @param hfmdEntityId
    * @return
    * @throws Exception
    */
    public HfmdEntity getHfmdEntityByPK(long hfmdEntityId)  throws  Exception {
        return hfmdEntityMapper.selectByPrimaryKey(hfmdEntityId);
    }

    /**
    * 通过MAP参数查询实体
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEntity> getHfmdEntityListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询实体
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEntity> getHfmdEntityListByExample(HfmdEntity_Example example) throws  Exception {
        return hfmdEntityMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询实体数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEntityCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询实体数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEntityCountByExample(HfmdEntity_Example example) throws  Exception {
        return hfmdEntityMapper.countByExample(example);
    }


  	//getter
 	
	public HfmdEntityMapper getHfmdEntityMapper(){
		return hfmdEntityMapper;
	}
	//setter
	public void setHfmdEntityMapper(HfmdEntityMapper hfmdEntityMapper){
    	this.hfmdEntityMapper = hfmdEntityMapper;
    }
}
