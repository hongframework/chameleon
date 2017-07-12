package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfcfgDbConnect;
import com.hframe.domain.model.HfcfgDbConnect_Example;
import com.hframe.dao.HfcfgDbConnectMapper;
import com.hframe.service.interfaces.IHfcfgDbConnectSV;

@Service("iHfcfgDbConnectSV")
public class HfcfgDbConnectSVImpl  implements IHfcfgDbConnectSV {

	@Resource
	private HfcfgDbConnectMapper hfcfgDbConnectMapper;
  


    /**
    * 创建
    * @param hfcfgDbConnect
    * @return
    * @throws Exception
    */
    public int create(HfcfgDbConnect hfcfgDbConnect) throws Exception {
        return hfcfgDbConnectMapper.insertSelective(hfcfgDbConnect);
    }

    /**
    * 批量维护
    * @param hfcfgDbConnects
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgDbConnect[] hfcfgDbConnects) throws  Exception{
        int result = 0;
        if(hfcfgDbConnects != null) {
            for (HfcfgDbConnect hfcfgDbConnect : hfcfgDbConnects) {
                if(hfcfgDbConnect.getHfcfgDbConnectId() == null) {
                    result += this.create(hfcfgDbConnect);
                }else {
                    result += this.update(hfcfgDbConnect);
                }
            }
        }
        return result;
    }

    /**
    * 更新
    * @param hfcfgDbConnect
    * @return
    * @throws Exception
    */
    public int update(HfcfgDbConnect hfcfgDbConnect) throws  Exception {
        return hfcfgDbConnectMapper.updateByPrimaryKeySelective(hfcfgDbConnect);
    }

    /**
    * 通过查询对象更新
    * @param hfcfgDbConnect
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgDbConnect hfcfgDbConnect, HfcfgDbConnect_Example example) throws  Exception {
        return hfcfgDbConnectMapper.updateByExampleSelective(hfcfgDbConnect, example);
    }

    /**
    * 删除
    * @param hfcfgDbConnect
    * @return
    * @throws Exception
    */
    public int delete(HfcfgDbConnect hfcfgDbConnect) throws  Exception {
        return hfcfgDbConnectMapper.deleteByPrimaryKey(hfcfgDbConnect.getHfcfgDbConnectId());
    }

    /**
    * 删除
    * @param hfcfgDbConnectId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgDbConnectId) throws  Exception {
        return hfcfgDbConnectMapper.deleteByPrimaryKey(hfcfgDbConnectId);
    }

    /**
    * 查找所有
    * @return
    */
    public List<HfcfgDbConnect> getHfcfgDbConnectAll()  throws  Exception {
        return hfcfgDbConnectMapper.selectByExample(new HfcfgDbConnect_Example());
    }

    /**
    * 通过ID查询
    * @param hfcfgDbConnectId
    * @return
    * @throws Exception
    */
    public HfcfgDbConnect getHfcfgDbConnectByPK(long hfcfgDbConnectId)  throws  Exception {
        return hfcfgDbConnectMapper.selectByPrimaryKey(hfcfgDbConnectId);
    }


    /**
    * 通过MAP参数查询
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgDbConnect> getHfcfgDbConnectListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgDbConnect> getHfcfgDbConnectListByExample(HfcfgDbConnect_Example example) throws  Exception {
        return hfcfgDbConnectMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgDbConnectCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgDbConnectCountByExample(HfcfgDbConnect_Example example) throws  Exception {
        return hfcfgDbConnectMapper.countByExample(example);
    }


  	//getter
 	
	public HfcfgDbConnectMapper getHfcfgDbConnectMapper(){
		return hfcfgDbConnectMapper;
	}
	//setter
	public void setHfcfgDbConnectMapper(HfcfgDbConnectMapper hfcfgDbConnectMapper){
    	this.hfcfgDbConnectMapper = hfcfgDbConnectMapper;
    }
}
