package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfpmModule;
import com.hframe.domain.model.HfpmModule_Example;
import com.hframe.dao.HfpmModuleMapper;
import com.hframe.service.interfaces.IHfpmModuleSV;

@Service("iHfpmModuleSV")
public class HfpmModuleSVImpl  implements IHfpmModuleSV {

	@Resource
	private HfpmModuleMapper hfpmModuleMapper;
  
    /**
    * 创建模块
    * @param hfpmModule
    * @return
    * @throws Exception
    */
    public int create(HfpmModule hfpmModule) throws Exception {
        return hfpmModuleMapper.insertSelective(hfpmModule);
    }

    /**
    * 批量维护模块
    * @param hfpmModules
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmModule[] hfpmModules) throws  Exception{
        int result = 0;
        if(hfpmModules != null) {
            for (HfpmModule hfpmModule : hfpmModules) {
                if(hfpmModule.getHfpmModuleId() == null) {
                    result += this.create(hfpmModule);
                }else {
                    result += this.update(hfpmModule);
                }
            }
        }
        return result;
    }

    /**
    * 更新模块
    * @param hfpmModule
    * @return
    * @throws Exception
    */
    public int update(HfpmModule hfpmModule) throws  Exception {
        return hfpmModuleMapper.updateByPrimaryKeySelective(hfpmModule);
    }

    /**
    * 通过查询对象更新模块
    * @param hfpmModule
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmModule hfpmModule, HfpmModule_Example example) throws  Exception {
        return hfpmModuleMapper.updateByExampleSelective(hfpmModule, example);
    }

    /**
    * 删除模块
    * @param hfpmModule
    * @return
    * @throws Exception
    */
    public int delete(HfpmModule hfpmModule) throws  Exception {
        return hfpmModuleMapper.deleteByPrimaryKey(hfpmModule.getHfpmModuleId());
    }

    /**
    * 删除模块
    * @param hfpmModuleId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmModuleId) throws  Exception {
        return hfpmModuleMapper.deleteByPrimaryKey(hfpmModuleId);
    }

    /**
    * 查找所有模块
    * @return
    */
    public List<HfpmModule> getHfpmModuleAll()  throws  Exception {
        return hfpmModuleMapper.selectByExample(new HfpmModule_Example());
    }

    /**
    * 通过模块ID查询模块
    * @param hfpmModuleId
    * @return
    * @throws Exception
    */
    public HfpmModule getHfpmModuleByPK(long hfpmModuleId)  throws  Exception {
        return hfpmModuleMapper.selectByPrimaryKey(hfpmModuleId);
    }

    /**
    * 通过MAP参数查询模块
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmModule> getHfpmModuleListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询模块
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmModule> getHfpmModuleListByExample(HfpmModule_Example example) throws  Exception {
        return hfpmModuleMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询模块数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmModuleCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询模块数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmModuleCountByExample(HfpmModule_Example example) throws  Exception {
        return hfpmModuleMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmModuleMapper getHfpmModuleMapper(){
		return hfpmModuleMapper;
	}
	//setter
	public void setHfpmModuleMapper(HfpmModuleMapper hfpmModuleMapper){
    	this.hfpmModuleMapper = hfpmModuleMapper;
    }
}
