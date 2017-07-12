package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfmdEntityRel;
import com.hframe.domain.model.HfmdEntityRel_Example;
import com.hframe.dao.HfmdEntityRelMapper;
import com.hframe.service.interfaces.IHfmdEntityRelSV;

@Service("iHfmdEntityRelSV")
public class HfmdEntityRelSVImpl  implements IHfmdEntityRelSV {

	@Resource
	private HfmdEntityRelMapper hfmdEntityRelMapper;
  
    /**
    * 创建实体关系
    * @param hfmdEntityRel
    * @return
    * @throws Exception
    */
    public int create(HfmdEntityRel hfmdEntityRel) throws Exception {
        return hfmdEntityRelMapper.insertSelective(hfmdEntityRel);
    }

    /**
    * 批量维护实体关系
    * @param hfmdEntityRels
    * @return
    * @throws Exception
    */
    public int batchOperate(HfmdEntityRel[] hfmdEntityRels) throws  Exception{
        int result = 0;
        if(hfmdEntityRels != null) {
            for (HfmdEntityRel hfmdEntityRel : hfmdEntityRels) {
                if(hfmdEntityRel.getHfmdEntityRelId() == null) {
                    result += this.create(hfmdEntityRel);
                }else {
                    result += this.update(hfmdEntityRel);
                }
            }
        }
        return result;
    }

    /**
    * 更新实体关系
    * @param hfmdEntityRel
    * @return
    * @throws Exception
    */
    public int update(HfmdEntityRel hfmdEntityRel) throws  Exception {
        return hfmdEntityRelMapper.updateByPrimaryKeySelective(hfmdEntityRel);
    }

    /**
    * 通过查询对象更新实体关系
    * @param hfmdEntityRel
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfmdEntityRel hfmdEntityRel, HfmdEntityRel_Example example) throws  Exception {
        return hfmdEntityRelMapper.updateByExampleSelective(hfmdEntityRel, example);
    }

    /**
    * 删除实体关系
    * @param hfmdEntityRel
    * @return
    * @throws Exception
    */
    public int delete(HfmdEntityRel hfmdEntityRel) throws  Exception {
        return hfmdEntityRelMapper.deleteByPrimaryKey(hfmdEntityRel.getHfmdEntityRelId());
    }

    /**
    * 删除实体关系
    * @param hfmdEntityRelId
    * @return
    * @throws Exception
    */
    public int delete(long hfmdEntityRelId) throws  Exception {
        return hfmdEntityRelMapper.deleteByPrimaryKey(hfmdEntityRelId);
    }

    /**
    * 查找所有实体关系
    * @return
    */
    public List<HfmdEntityRel> getHfmdEntityRelAll()  throws  Exception {
        return hfmdEntityRelMapper.selectByExample(new HfmdEntityRel_Example());
    }

    /**
    * 通过实体关系ID查询实体关系
    * @param hfmdEntityRelId
    * @return
    * @throws Exception
    */
    public HfmdEntityRel getHfmdEntityRelByPK(long hfmdEntityRelId)  throws  Exception {
        return hfmdEntityRelMapper.selectByPrimaryKey(hfmdEntityRelId);
    }

    /**
    * 通过MAP参数查询实体关系
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfmdEntityRel> getHfmdEntityRelListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询实体关系
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfmdEntityRel> getHfmdEntityRelListByExample(HfmdEntityRel_Example example) throws  Exception {
        return hfmdEntityRelMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询实体关系数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfmdEntityRelCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询实体关系数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfmdEntityRelCountByExample(HfmdEntityRel_Example example) throws  Exception {
        return hfmdEntityRelMapper.countByExample(example);
    }


  	//getter
 	
	public HfmdEntityRelMapper getHfmdEntityRelMapper(){
		return hfmdEntityRelMapper;
	}
	//setter
	public void setHfmdEntityRelMapper(HfmdEntityRelMapper hfmdEntityRelMapper){
    	this.hfmdEntityRelMapper = hfmdEntityRelMapper;
    }
}
