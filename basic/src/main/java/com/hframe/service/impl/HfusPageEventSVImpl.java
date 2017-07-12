package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfusPageEvent;
import com.hframe.domain.model.HfusPageEvent_Example;
import com.hframe.dao.HfusPageEventMapper;
import com.hframe.service.interfaces.IHfusPageEventSV;

@Service("iHfusPageEventSV")
public class HfusPageEventSVImpl  implements IHfusPageEventSV {

	@Resource
	private HfusPageEventMapper hfusPageEventMapper;
  
    /**
    * 创建常用页面事件
    * @param hfusPageEvent
    * @return
    * @throws Exception
    */
    public int create(HfusPageEvent hfusPageEvent) throws Exception {
        return hfusPageEventMapper.insertSelective(hfusPageEvent);
    }

    /**
    * 批量维护常用页面事件
    * @param hfusPageEvents
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusPageEvent[] hfusPageEvents) throws  Exception{
        int result = 0;
        if(hfusPageEvents != null) {
            for (HfusPageEvent hfusPageEvent : hfusPageEvents) {
                if(hfusPageEvent.getHfusPageEventId() == null) {
                    result += this.create(hfusPageEvent);
                }else {
                    result += this.update(hfusPageEvent);
                }
            }
        }
        return result;
    }

    /**
    * 更新常用页面事件
    * @param hfusPageEvent
    * @return
    * @throws Exception
    */
    public int update(HfusPageEvent hfusPageEvent) throws  Exception {
        return hfusPageEventMapper.updateByPrimaryKeySelective(hfusPageEvent);
    }

    /**
    * 通过查询对象更新常用页面事件
    * @param hfusPageEvent
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusPageEvent hfusPageEvent, HfusPageEvent_Example example) throws  Exception {
        return hfusPageEventMapper.updateByExampleSelective(hfusPageEvent, example);
    }

    /**
    * 删除常用页面事件
    * @param hfusPageEvent
    * @return
    * @throws Exception
    */
    public int delete(HfusPageEvent hfusPageEvent) throws  Exception {
        return hfusPageEventMapper.deleteByPrimaryKey(hfusPageEvent.getHfusPageEventId());
    }

    /**
    * 删除常用页面事件
    * @param hfusPageEventId
    * @return
    * @throws Exception
    */
    public int delete(long hfusPageEventId) throws  Exception {
        return hfusPageEventMapper.deleteByPrimaryKey(hfusPageEventId);
    }

    /**
    * 查找所有常用页面事件
    * @return
    */
    public List<HfusPageEvent> getHfusPageEventAll()  throws  Exception {
        return hfusPageEventMapper.selectByExample(new HfusPageEvent_Example());
    }

    /**
    * 通过常用页面事件ID查询常用页面事件
    * @param hfusPageEventId
    * @return
    * @throws Exception
    */
    public HfusPageEvent getHfusPageEventByPK(long hfusPageEventId)  throws  Exception {
        return hfusPageEventMapper.selectByPrimaryKey(hfusPageEventId);
    }

    /**
    * 通过MAP参数查询常用页面事件
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusPageEvent> getHfusPageEventListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询常用页面事件
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusPageEvent> getHfusPageEventListByExample(HfusPageEvent_Example example) throws  Exception {
        return hfusPageEventMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询常用页面事件数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusPageEventCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询常用页面事件数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusPageEventCountByExample(HfusPageEvent_Example example) throws  Exception {
        return hfusPageEventMapper.countByExample(example);
    }


  	//getter
 	
	public HfusPageEventMapper getHfusPageEventMapper(){
		return hfusPageEventMapper;
	}
	//setter
	public void setHfusPageEventMapper(HfusPageEventMapper hfusPageEventMapper){
    	this.hfusPageEventMapper = hfusPageEventMapper;
    }
}
