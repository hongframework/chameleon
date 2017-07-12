package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfpmTest;
import com.hframe.domain.model.HfpmTest_Example;
import com.hframe.dao.HfpmTestMapper;
import com.hframe.service.interfaces.IHfpmTestSV;

@Service("iHfpmTestSV")
public class HfpmTestSVImpl  implements IHfpmTestSV {

	@Resource
	private HfpmTestMapper hfpmTestMapper;
  


    /**
    * 创建
    * @param hfpmTest
    * @return
    * @throws Exception
    */
    public int create(HfpmTest hfpmTest) throws Exception {
        return hfpmTestMapper.insertSelective(hfpmTest);
    }

    /**
    * 批量维护
    * @param hfpmTests
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmTest[] hfpmTests) throws  Exception{
        int result = 0;
        if(hfpmTests != null) {
            for (HfpmTest hfpmTest : hfpmTests) {
                if(hfpmTest.getHfpmTestId() == null) {
                    result += this.create(hfpmTest);
                }else {
                    result += this.update(hfpmTest);
                }
            }
        }
        return result;
    }

    /**
    * 更新
    * @param hfpmTest
    * @return
    * @throws Exception
    */
    public int update(HfpmTest hfpmTest) throws  Exception {
        return hfpmTestMapper.updateByPrimaryKeySelective(hfpmTest);
    }

    /**
    * 通过查询对象更新
    * @param hfpmTest
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmTest hfpmTest, HfpmTest_Example example) throws  Exception {
        return hfpmTestMapper.updateByExampleSelective(hfpmTest, example);
    }

    /**
    * 删除
    * @param hfpmTest
    * @return
    * @throws Exception
    */
    public int delete(HfpmTest hfpmTest) throws  Exception {
        return hfpmTestMapper.deleteByPrimaryKey(hfpmTest.getHfpmTestId());
    }

    /**
    * 删除
    * @param hfpmTestId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmTestId) throws  Exception {
        return hfpmTestMapper.deleteByPrimaryKey(hfpmTestId);
    }

    /**
    * 查找所有
    * @return
    */
    public List<HfpmTest> getHfpmTestAll()  throws  Exception {
        return hfpmTestMapper.selectByExample(new HfpmTest_Example());
    }

    /**
    * 通过ID查询
    * @param hfpmTestId
    * @return
    * @throws Exception
    */
    public HfpmTest getHfpmTestByPK(long hfpmTestId)  throws  Exception {
        return hfpmTestMapper.selectByPrimaryKey(hfpmTestId);
    }


    /**
    * 通过MAP参数查询
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmTest> getHfpmTestListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmTest> getHfpmTestListByExample(HfpmTest_Example example) throws  Exception {
        return hfpmTestMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmTestCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmTestCountByExample(HfpmTest_Example example) throws  Exception {
        return hfpmTestMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmTestMapper getHfpmTestMapper(){
		return hfpmTestMapper;
	}
	//setter
	public void setHfpmTestMapper(HfpmTestMapper hfpmTestMapper){
    	this.hfpmTestMapper = hfpmTestMapper;
    }
}
