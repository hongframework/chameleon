package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfpmDataSet;
import com.hframe.domain.model.HfpmDataSet_Example;
import com.hframe.dao.HfpmDataSetMapper;
import com.hframe.service.interfaces.IHfpmDataSetSV;

@Service("iHfpmDataSetSV")
public class HfpmDataSetSVImpl  implements IHfpmDataSetSV {

	@Resource
	private HfpmDataSetMapper hfpmDataSetMapper;
  
    /**
    * 创建数据集
    * @param hfpmDataSet
    * @return
    * @throws Exception
    */
    public int create(HfpmDataSet hfpmDataSet) throws Exception {
        return hfpmDataSetMapper.insertSelective(hfpmDataSet);
    }

    /**
    * 批量维护数据集
    * @param hfpmDataSets
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmDataSet[] hfpmDataSets) throws  Exception{
        int result = 0;
        if(hfpmDataSets != null) {
            for (HfpmDataSet hfpmDataSet : hfpmDataSets) {
                if(hfpmDataSet.getHfpmDataSetId() == null) {
                    result += this.create(hfpmDataSet);
                }else {
                    result += this.update(hfpmDataSet);
                }
            }
        }
        return result;
    }

    /**
    * 更新数据集
    * @param hfpmDataSet
    * @return
    * @throws Exception
    */
    public int update(HfpmDataSet hfpmDataSet) throws  Exception {
        return hfpmDataSetMapper.updateByPrimaryKeySelective(hfpmDataSet);
    }

    /**
    * 通过查询对象更新数据集
    * @param hfpmDataSet
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmDataSet hfpmDataSet, HfpmDataSet_Example example) throws  Exception {
        return hfpmDataSetMapper.updateByExampleSelective(hfpmDataSet, example);
    }

    /**
    * 删除数据集
    * @param hfpmDataSet
    * @return
    * @throws Exception
    */
    public int delete(HfpmDataSet hfpmDataSet) throws  Exception {
        return hfpmDataSetMapper.deleteByPrimaryKey(hfpmDataSet.getHfpmDataSetId());
    }

    /**
    * 删除数据集
    * @param hfpmDataSetId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmDataSetId) throws  Exception {
        return hfpmDataSetMapper.deleteByPrimaryKey(hfpmDataSetId);
    }

    /**
    * 查找所有数据集
    * @return
    */
    public List<HfpmDataSet> getHfpmDataSetAll()  throws  Exception {
        return hfpmDataSetMapper.selectByExample(new HfpmDataSet_Example());
    }

    /**
    * 通过数据集ID查询数据集
    * @param hfpmDataSetId
    * @return
    * @throws Exception
    */
    public HfpmDataSet getHfpmDataSetByPK(long hfpmDataSetId)  throws  Exception {
        return hfpmDataSetMapper.selectByPrimaryKey(hfpmDataSetId);
    }

    /**
    * 通过MAP参数查询数据集
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmDataSet> getHfpmDataSetListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询数据集
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmDataSet> getHfpmDataSetListByExample(HfpmDataSet_Example example) throws  Exception {
        return hfpmDataSetMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询数据集数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmDataSetCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询数据集数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmDataSetCountByExample(HfpmDataSet_Example example) throws  Exception {
        return hfpmDataSetMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmDataSetMapper getHfpmDataSetMapper(){
		return hfpmDataSetMapper;
	}
	//setter
	public void setHfpmDataSetMapper(HfpmDataSetMapper hfpmDataSetMapper){
    	this.hfpmDataSetMapper = hfpmDataSetMapper;
    }
}
