package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfpmPageComponent;
import com.hframe.domain.model.HfpmPageComponent_Example;
import com.hframe.dao.HfpmPageComponentMapper;
import com.hframe.service.interfaces.IHfpmPageComponentSV;

@Service("iHfpmPageComponentSV")
public class HfpmPageComponentSVImpl  implements IHfpmPageComponentSV {

	@Resource
	private HfpmPageComponentMapper hfpmPageComponentMapper;
  


    /**
    * 创建椤甸潰缁勪欢
    * @param hfpmPageComponent
    * @return
    * @throws Exception
    */
    public int create(HfpmPageComponent hfpmPageComponent) throws Exception {
        return hfpmPageComponentMapper.insertSelective(hfpmPageComponent);
    }

    /**
    * 批量维护椤甸潰缁勪欢
    * @param hfpmPageComponents
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPageComponent[] hfpmPageComponents) throws  Exception{
        int result = 0;
        if(hfpmPageComponents != null) {
            for (HfpmPageComponent hfpmPageComponent : hfpmPageComponents) {
                if(hfpmPageComponent.getHfpmPageComponentId() == null) {
                    result += this.create(hfpmPageComponent);
                }else {
                    result += this.update(hfpmPageComponent);
                }
            }
        }
        return result;
    }

    /**
    * 更新椤甸潰缁勪欢
    * @param hfpmPageComponent
    * @return
    * @throws Exception
    */
    public int update(HfpmPageComponent hfpmPageComponent) throws  Exception {
        return hfpmPageComponentMapper.updateByPrimaryKeySelective(hfpmPageComponent);
    }

    /**
    * 通过查询对象更新椤甸潰缁勪欢
    * @param hfpmPageComponent
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPageComponent hfpmPageComponent, HfpmPageComponent_Example example) throws  Exception {
        return hfpmPageComponentMapper.updateByExampleSelective(hfpmPageComponent, example);
    }

    /**
    * 删除椤甸潰缁勪欢
    * @param hfpmPageComponent
    * @return
    * @throws Exception
    */
    public int delete(HfpmPageComponent hfpmPageComponent) throws  Exception {
        return hfpmPageComponentMapper.deleteByPrimaryKey(hfpmPageComponent.getHfpmPageComponentId());
    }

    /**
    * 删除椤甸潰缁勪欢
    * @param hfpmPageComponentId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageComponentId) throws  Exception {
        return hfpmPageComponentMapper.deleteByPrimaryKey(hfpmPageComponentId);
    }

    /**
    * 查找所有椤甸潰缁勪欢
    * @return
    */
    public List<HfpmPageComponent> getHfpmPageComponentAll()  throws  Exception {
        return hfpmPageComponentMapper.selectByExample(new HfpmPageComponent_Example());
    }

    /**
    * 通过椤甸潰缁勪欢ID查询椤甸潰缁勪欢
    * @param hfpmPageComponentId
    * @return
    * @throws Exception
    */
    public HfpmPageComponent getHfpmPageComponentByPK(long hfpmPageComponentId)  throws  Exception {
        return hfpmPageComponentMapper.selectByPrimaryKey(hfpmPageComponentId);
    }


    /**
    * 通过MAP参数查询椤甸潰缁勪欢
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPageComponent> getHfpmPageComponentListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询椤甸潰缁勪欢
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPageComponent> getHfpmPageComponentListByExample(HfpmPageComponent_Example example) throws  Exception {
        return hfpmPageComponentMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询椤甸潰缁勪欢数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageComponentCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询椤甸潰缁勪欢数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageComponentCountByExample(HfpmPageComponent_Example example) throws  Exception {
        return hfpmPageComponentMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmPageComponentMapper getHfpmPageComponentMapper(){
		return hfpmPageComponentMapper;
	}
	//setter
	public void setHfpmPageComponentMapper(HfpmPageComponentMapper hfpmPageComponentMapper){
    	this.hfpmPageComponentMapper = hfpmPageComponentMapper;
    }
}
