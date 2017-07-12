package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframework.common.util.ExampleUtils;
import com.hframe.domain.model.HfusEntityStore;
import com.hframe.domain.model.HfusEntityStore_Example;
import com.hframe.dao.HfusEntityStoreMapper;
import com.hframe.service.interfaces.IHfusEntityStoreSV;

@Service("iHfusEntityStoreSV")
public class HfusEntityStoreSVImpl  implements IHfusEntityStoreSV {

	@Resource
	private HfusEntityStoreMapper hfusEntityStoreMapper;
  


    /**
    * 创建常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Exception
    */
    public int create(HfusEntityStore hfusEntityStore) throws Exception {
        return hfusEntityStoreMapper.insertSelective(hfusEntityStore);
    }

    /**
    * 批量维护常用实体库
    * @param hfusEntityStores
    * @return
    * @throws Exception
    */
    public int batchOperate(HfusEntityStore[] hfusEntityStores) throws  Exception{
        int result = 0;
        if(hfusEntityStores != null) {
            for (HfusEntityStore hfusEntityStore : hfusEntityStores) {
                if(hfusEntityStore.getHfusEntityStoreId() == null) {
                    result += this.create(hfusEntityStore);
                }else {
                    result += this.update(hfusEntityStore);
                }
            }
        }
        return result;
    }

    /**
    * 更新常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Exception
    */
    public int update(HfusEntityStore hfusEntityStore) throws  Exception {
        return hfusEntityStoreMapper.updateByPrimaryKeySelective(hfusEntityStore);
    }

    /**
    * 通过查询对象更新常用实体库
    * @param hfusEntityStore
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfusEntityStore hfusEntityStore, HfusEntityStore_Example example) throws  Exception {
        return hfusEntityStoreMapper.updateByExampleSelective(hfusEntityStore, example);
    }

    /**
    * 删除常用实体库
    * @param hfusEntityStore
    * @return
    * @throws Exception
    */
    public int delete(HfusEntityStore hfusEntityStore) throws  Exception {
        return hfusEntityStoreMapper.deleteByPrimaryKey(hfusEntityStore.getHfusEntityStoreId());
    }

    /**
    * 删除常用实体库
    * @param hfusEntityStoreId
    * @return
    * @throws Exception
    */
    public int delete(long hfusEntityStoreId) throws  Exception {
        return hfusEntityStoreMapper.deleteByPrimaryKey(hfusEntityStoreId);
    }

    /**
    * 查找所有常用实体库
    * @return
    */
    public List<HfusEntityStore> getHfusEntityStoreAll()  throws  Exception {
        return hfusEntityStoreMapper.selectByExampleWithBLOBs(new HfusEntityStore_Example());
    }

    /**
    * 通过常用实体库ID查询常用实体库
    * @param hfusEntityStoreId
    * @return
    * @throws Exception
    */
    public HfusEntityStore getHfusEntityStoreByPK(long hfusEntityStoreId)  throws  Exception {
        return hfusEntityStoreMapper.selectByPrimaryKey(hfusEntityStoreId);
    }


    /**
    * 通过MAP参数查询常用实体库
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfusEntityStore> getHfusEntityStoreListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询常用实体库
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfusEntityStore> getHfusEntityStoreListByExample(HfusEntityStore_Example example) throws  Exception {
        return hfusEntityStoreMapper.selectByExampleWithBLOBs(example);
    }

    /**
    * 通过MAP参数查询常用实体库数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfusEntityStoreCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询常用实体库数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfusEntityStoreCountByExample(HfusEntityStore_Example example) throws  Exception {
        return hfusEntityStoreMapper.countByExample(example);
    }


  	//getter
 	
	public HfusEntityStoreMapper getHfusEntityStoreMapper(){
		return hfusEntityStoreMapper;
	}
	//setter
	public void setHfusEntityStoreMapper(HfusEntityStoreMapper hfusEntityStoreMapper){
    	this.hfusEntityStoreMapper = hfusEntityStoreMapper;
    }
}
