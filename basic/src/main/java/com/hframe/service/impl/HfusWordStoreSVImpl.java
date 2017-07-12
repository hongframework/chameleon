package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfusWordStore;
import com.hframe.domain.model.HfusWordStore_Example;
import com.hframe.dao.HfusWordStoreMapper;
import com.hframe.service.interfaces.IHfusWordStoreSV;

@Service("iHfusWordStoreSV")
public class HfusWordStoreSVImpl  implements IHfusWordStoreSV {

	@Resource
	private HfusWordStoreMapper hfusWordStoreMapper;
  
    /**
    * 创建单词库
    * @param hfusWordStore
    * @return
    * @throws Exception
    */
    public int create(HfusWordStore hfusWordStore) throws Exception {
        return hfusWordStoreMapper.insertSelective(hfusWordStore);
    }

    /**
    * 批量维护单词库
    * @param hfusWordStores
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusWordStore[] hfusWordStores) throws  Exception{
        int result = 0;
        if(hfusWordStores != null) {
            for (HfusWordStore hfusWordStore : hfusWordStores) {
                if(hfusWordStore.getHfusWordStoreId() == null) {
                    result += this.create(hfusWordStore);
                }else {
                    result += this.update(hfusWordStore);
                }
            }
        }
        return result;
    }

    /**
    * 更新单词库
    * @param hfusWordStore
    * @return
    * @throws Exception
    */
    public int update(HfusWordStore hfusWordStore) throws  Exception {
        return hfusWordStoreMapper.updateByPrimaryKeySelective(hfusWordStore);
    }

    /**
    * 通过查询对象更新单词库
    * @param hfusWordStore
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusWordStore hfusWordStore, HfusWordStore_Example example) throws  Exception {
        return hfusWordStoreMapper.updateByExampleSelective(hfusWordStore, example);
    }

    /**
    * 删除单词库
    * @param hfusWordStore
    * @return
    * @throws Exception
    */
    public int delete(HfusWordStore hfusWordStore) throws  Exception {
        return hfusWordStoreMapper.deleteByPrimaryKey(hfusWordStore.getHfusWordStoreId());
    }

    /**
    * 删除单词库
    * @param hfusWordStoreId
    * @return
    * @throws Exception
    */
    public int delete(long hfusWordStoreId) throws  Exception {
        return hfusWordStoreMapper.deleteByPrimaryKey(hfusWordStoreId);
    }

    /**
    * 查找所有单词库
    * @return
    */
    public List<HfusWordStore> getHfusWordStoreAll()  throws  Exception {
        return hfusWordStoreMapper.selectByExample(new HfusWordStore_Example());
    }

    /**
    * 通过单词库ID查询单词库
    * @param hfusWordStoreId
    * @return
    * @throws Exception
    */
    public HfusWordStore getHfusWordStoreByPK(long hfusWordStoreId)  throws  Exception {
        return hfusWordStoreMapper.selectByPrimaryKey(hfusWordStoreId);
    }

    /**
    * 通过MAP参数查询单词库
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusWordStore> getHfusWordStoreListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询单词库
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusWordStore> getHfusWordStoreListByExample(HfusWordStore_Example example) throws  Exception {
        return hfusWordStoreMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询单词库数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusWordStoreCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询单词库数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusWordStoreCountByExample(HfusWordStore_Example example) throws  Exception {
        return hfusWordStoreMapper.countByExample(example);
    }


  	//getter
 	
	public HfusWordStoreMapper getHfusWordStoreMapper(){
		return hfusWordStoreMapper;
	}
	//setter
	public void setHfusWordStoreMapper(HfusWordStoreMapper hfusWordStoreMapper){
    	this.hfusWordStoreMapper = hfusWordStoreMapper;
    }
}
