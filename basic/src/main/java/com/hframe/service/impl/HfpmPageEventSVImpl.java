package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframework.common.util.ExampleUtils;
import com.hframe.domain.model.HfpmPageEvent;
import com.hframe.domain.model.HfpmPageEvent_Example;
import com.hframe.dao.HfpmPageEventMapper;
import com.hframe.service.interfaces.IHfpmPageEventSV;

@Service("iHfpmPageEventSV")
public class HfpmPageEventSVImpl  implements IHfpmPageEventSV {

	@Resource
	private HfpmPageEventMapper hfpmPageEventMapper;
  


    /**
    * 创建页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Exception
    */
    public int create(HfpmPageEvent hfpmPageEvent) throws Exception {
        return hfpmPageEventMapper.insertSelective(hfpmPageEvent);
    }

    /**
    * 批量维护页面事件
    * @param hfpmPageEvents
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPageEvent[] hfpmPageEvents) throws  Exception{
        int result = 0;
        if(hfpmPageEvents != null) {
            for (HfpmPageEvent hfpmPageEvent : hfpmPageEvents) {
                if(hfpmPageEvent.getHfpmPageEventId() == null) {
                    result += this.create(hfpmPageEvent);
                }else {
                    result += this.update(hfpmPageEvent);
                }
            }
        }
        return result;
    }

    /**
    * 更新页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Exception
    */
    public int update(HfpmPageEvent hfpmPageEvent) throws  Exception {
        return hfpmPageEventMapper.updateByPrimaryKeySelective(hfpmPageEvent);
    }

    /**
    * 通过查询对象更新页面事件
    * @param hfpmPageEvent
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPageEvent hfpmPageEvent, HfpmPageEvent_Example example) throws  Exception {
        return hfpmPageEventMapper.updateByExampleSelective(hfpmPageEvent, example);
    }

    /**
    * 删除页面事件
    * @param hfpmPageEvent
    * @return
    * @throws Exception
    */
    public int delete(HfpmPageEvent hfpmPageEvent) throws  Exception {
        return hfpmPageEventMapper.deleteByPrimaryKey(hfpmPageEvent.getHfpmPageEventId());
    }

    /**
    * 删除页面事件
    * @param hfpmPageEventId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageEventId) throws  Exception {
        return hfpmPageEventMapper.deleteByPrimaryKey(hfpmPageEventId);
    }

    /**
    * 查找所有页面事件
    * @return
    */
    public List<HfpmPageEvent> getHfpmPageEventAll()  throws  Exception {
        return hfpmPageEventMapper.selectByExample(new HfpmPageEvent_Example());
    }

    /**
    * 通过页面事件ID查询页面事件
    * @param hfpmPageEventId
    * @return
    * @throws Exception
    */
    public HfpmPageEvent getHfpmPageEventByPK(long hfpmPageEventId)  throws  Exception {
        return hfpmPageEventMapper.selectByPrimaryKey(hfpmPageEventId);
    }


    /**
    * 通过MAP参数查询页面事件
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPageEvent> getHfpmPageEventListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询页面事件
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPageEvent> getHfpmPageEventListByExample(HfpmPageEvent_Example example) throws  Exception {
        return hfpmPageEventMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询页面事件数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageEventCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询页面事件数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageEventCountByExample(HfpmPageEvent_Example example) throws  Exception {
        return hfpmPageEventMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmPageEventMapper getHfpmPageEventMapper(){
		return hfpmPageEventMapper;
	}
	//setter
	public void setHfpmPageEventMapper(HfpmPageEventMapper hfpmPageEventMapper){
    	this.hfpmPageEventMapper = hfpmPageEventMapper;
    }
}
