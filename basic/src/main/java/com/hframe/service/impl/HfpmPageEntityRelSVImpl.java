package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfpmPageEntityRel;
import com.hframe.domain.model.HfpmPageEntityRel_Example;
import com.hframe.dao.HfpmPageEntityRelMapper;
import com.hframe.service.interfaces.IHfpmPageEntityRelSV;

@Service("iHfpmPageEntityRelSV")
public class HfpmPageEntityRelSVImpl  implements IHfpmPageEntityRelSV {

	@Resource
	private HfpmPageEntityRelMapper hfpmPageEntityRelMapper;
  
    /**
    * 创建页面关联实体
    * @param hfpmPageEntityRel
    * @return
    * @throws Exception
    */
    public int create(HfpmPageEntityRel hfpmPageEntityRel) throws Exception {
        return hfpmPageEntityRelMapper.insertSelective(hfpmPageEntityRel);
    }

    /**
    * 批量维护页面关联实体
    * @param hfpmPageEntityRels
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPageEntityRel[] hfpmPageEntityRels) throws  Exception{
        int result = 0;
        if(hfpmPageEntityRels != null) {
            for (HfpmPageEntityRel hfpmPageEntityRel : hfpmPageEntityRels) {
                if(hfpmPageEntityRel.getHfpmPageEntityRelId() == null) {
                    result += this.create(hfpmPageEntityRel);
                }else {
                    result += this.update(hfpmPageEntityRel);
                }
            }
        }
        return result;
    }

    /**
    * 更新页面关联实体
    * @param hfpmPageEntityRel
    * @return
    * @throws Exception
    */
    public int update(HfpmPageEntityRel hfpmPageEntityRel) throws  Exception {
        return hfpmPageEntityRelMapper.updateByPrimaryKeySelective(hfpmPageEntityRel);
    }

    /**
    * 通过查询对象更新页面关联实体
    * @param hfpmPageEntityRel
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPageEntityRel hfpmPageEntityRel, HfpmPageEntityRel_Example example) throws  Exception {
        return hfpmPageEntityRelMapper.updateByExampleSelective(hfpmPageEntityRel, example);
    }

    /**
    * 删除页面关联实体
    * @param hfpmPageEntityRel
    * @return
    * @throws Exception
    */
    public int delete(HfpmPageEntityRel hfpmPageEntityRel) throws  Exception {
        return hfpmPageEntityRelMapper.deleteByPrimaryKey(hfpmPageEntityRel.getHfpmPageEntityRelId());
    }

    /**
    * 删除页面关联实体
    * @param hfpmPageEntityRelId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageEntityRelId) throws  Exception {
        return hfpmPageEntityRelMapper.deleteByPrimaryKey(hfpmPageEntityRelId);
    }

    /**
    * 查找所有页面关联实体
    * @return
    */
    public List<HfpmPageEntityRel> getHfpmPageEntityRelAll()  throws  Exception {
        return hfpmPageEntityRelMapper.selectByExample(new HfpmPageEntityRel_Example());
    }

    /**
    * 通过页面关联实体ID查询页面关联实体
    * @param hfpmPageEntityRelId
    * @return
    * @throws Exception
    */
    public HfpmPageEntityRel getHfpmPageEntityRelByPK(long hfpmPageEntityRelId)  throws  Exception {
        return hfpmPageEntityRelMapper.selectByPrimaryKey(hfpmPageEntityRelId);
    }

    /**
    * 通过MAP参数查询页面关联实体
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPageEntityRel> getHfpmPageEntityRelListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询页面关联实体
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPageEntityRel> getHfpmPageEntityRelListByExample(HfpmPageEntityRel_Example example) throws  Exception {
        return hfpmPageEntityRelMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询页面关联实体数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageEntityRelCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询页面关联实体数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageEntityRelCountByExample(HfpmPageEntityRel_Example example) throws  Exception {
        return hfpmPageEntityRelMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmPageEntityRelMapper getHfpmPageEntityRelMapper(){
		return hfpmPageEntityRelMapper;
	}
	//setter
	public void setHfpmPageEntityRelMapper(HfpmPageEntityRelMapper hfpmPageEntityRelMapper){
    	this.hfpmPageEntityRelMapper = hfpmPageEntityRelMapper;
    }
}
