package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfpmPageCfg;
import com.hframe.domain.model.HfpmPageCfg_Example;
import com.hframe.dao.HfpmPageCfgMapper;
import com.hframe.service.interfaces.IHfpmPageCfgSV;

@Service("iHfpmPageCfgSV")
public class HfpmPageCfgSVImpl  implements IHfpmPageCfgSV {

	@Resource
	private HfpmPageCfgMapper hfpmPageCfgMapper;
  
    /**
    * 创建页面配置
    * @param hfpmPageCfg
    * @return
    * @throws Exception
    */
    public int create(HfpmPageCfg hfpmPageCfg) throws Exception {
        return hfpmPageCfgMapper.insertSelective(hfpmPageCfg);
    }

    /**
    * 批量维护页面配置
    * @param hfpmPageCfgs
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmPageCfg[] hfpmPageCfgs) throws  Exception{
        int result = 0;
        if(hfpmPageCfgs != null) {
            for (HfpmPageCfg hfpmPageCfg : hfpmPageCfgs) {
                if(hfpmPageCfg.getHfpmPageCfgId() == null) {
                    result += this.create(hfpmPageCfg);
                }else {
                    result += this.update(hfpmPageCfg);
                }
            }
        }
        return result;
    }

    /**
    * 更新页面配置
    * @param hfpmPageCfg
    * @return
    * @throws Exception
    */
    public int update(HfpmPageCfg hfpmPageCfg) throws  Exception {
        return hfpmPageCfgMapper.updateByPrimaryKeySelective(hfpmPageCfg);
    }

    /**
    * 通过查询对象更新页面配置
    * @param hfpmPageCfg
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmPageCfg hfpmPageCfg, HfpmPageCfg_Example example) throws  Exception {
        return hfpmPageCfgMapper.updateByExampleSelective(hfpmPageCfg, example);
    }

    /**
    * 删除页面配置
    * @param hfpmPageCfg
    * @return
    * @throws Exception
    */
    public int delete(HfpmPageCfg hfpmPageCfg) throws  Exception {
        return hfpmPageCfgMapper.deleteByPrimaryKey(hfpmPageCfg.getHfpmPageCfgId());
    }

    /**
    * 删除页面配置
    * @param hfpmPageCfgId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmPageCfgId) throws  Exception {
        return hfpmPageCfgMapper.deleteByPrimaryKey(hfpmPageCfgId);
    }

    /**
    * 查找所有页面配置
    * @return
    */
    public List<HfpmPageCfg> getHfpmPageCfgAll()  throws  Exception {
        return hfpmPageCfgMapper.selectByExample(new HfpmPageCfg_Example());
    }

    /**
    * 通过页面配置ID查询页面配置
    * @param hfpmPageCfgId
    * @return
    * @throws Exception
    */
    public HfpmPageCfg getHfpmPageCfgByPK(long hfpmPageCfgId)  throws  Exception {
        return hfpmPageCfgMapper.selectByPrimaryKey(hfpmPageCfgId);
    }

    /**
    * 通过MAP参数查询页面配置
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmPageCfg> getHfpmPageCfgListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询页面配置
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmPageCfg> getHfpmPageCfgListByExample(HfpmPageCfg_Example example) throws  Exception {
        return hfpmPageCfgMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询页面配置数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmPageCfgCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询页面配置数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmPageCfgCountByExample(HfpmPageCfg_Example example) throws  Exception {
        return hfpmPageCfgMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmPageCfgMapper getHfpmPageCfgMapper(){
		return hfpmPageCfgMapper;
	}
	//setter
	public void setHfpmPageCfgMapper(HfpmPageCfgMapper hfpmPageCfgMapper){
    	this.hfpmPageCfgMapper = hfpmPageCfgMapper;
    }
}
