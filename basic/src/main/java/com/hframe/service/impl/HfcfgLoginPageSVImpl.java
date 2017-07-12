package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfcfgLoginPage;
import com.hframe.domain.model.HfcfgLoginPage_Example;
import com.hframe.dao.HfcfgLoginPageMapper;
import com.hframe.service.interfaces.IHfcfgLoginPageSV;

@Service("iHfcfgLoginPageSV")
public class HfcfgLoginPageSVImpl  implements IHfcfgLoginPageSV {

	@Resource
	private HfcfgLoginPageMapper hfcfgLoginPageMapper;
  
    /**
    * 创建登陆页
    * @param hfcfgLoginPage
    * @return
    * @throws Exception
    */
    public int create(HfcfgLoginPage hfcfgLoginPage) throws Exception {
        return hfcfgLoginPageMapper.insertSelective(hfcfgLoginPage);
    }

    /**
    * 批量维护登陆页
    * @param hfcfgLoginPages
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgLoginPage[] hfcfgLoginPages) throws  Exception{
        int result = 0;
        if(hfcfgLoginPages != null) {
            for (HfcfgLoginPage hfcfgLoginPage : hfcfgLoginPages) {
                if(hfcfgLoginPage.getHfcfgLoginPageId() == null) {
                    result += this.create(hfcfgLoginPage);
                }else {
                    result += this.update(hfcfgLoginPage);
                }
            }
        }
        return result;
    }

    /**
    * 更新登陆页
    * @param hfcfgLoginPage
    * @return
    * @throws Exception
    */
    public int update(HfcfgLoginPage hfcfgLoginPage) throws  Exception {
        return hfcfgLoginPageMapper.updateByPrimaryKeySelective(hfcfgLoginPage);
    }

    /**
    * 通过查询对象更新登陆页
    * @param hfcfgLoginPage
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgLoginPage hfcfgLoginPage, HfcfgLoginPage_Example example) throws  Exception {
        return hfcfgLoginPageMapper.updateByExampleSelective(hfcfgLoginPage, example);
    }

    /**
    * 删除登陆页
    * @param hfcfgLoginPage
    * @return
    * @throws Exception
    */
    public int delete(HfcfgLoginPage hfcfgLoginPage) throws  Exception {
        return hfcfgLoginPageMapper.deleteByPrimaryKey(hfcfgLoginPage.getHfcfgLoginPageId());
    }

    /**
    * 删除登陆页
    * @param hfcfgLoginPageId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgLoginPageId) throws  Exception {
        return hfcfgLoginPageMapper.deleteByPrimaryKey(hfcfgLoginPageId);
    }

    /**
    * 查找所有登陆页
    * @return
    */
    public List<HfcfgLoginPage> getHfcfgLoginPageAll()  throws  Exception {
        return hfcfgLoginPageMapper.selectByExample(new HfcfgLoginPage_Example());
    }

    /**
    * 通过登陆页ID查询登陆页
    * @param hfcfgLoginPageId
    * @return
    * @throws Exception
    */
    public HfcfgLoginPage getHfcfgLoginPageByPK(long hfcfgLoginPageId)  throws  Exception {
        return hfcfgLoginPageMapper.selectByPrimaryKey(hfcfgLoginPageId);
    }

    /**
    * 通过MAP参数查询登陆页
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgLoginPage> getHfcfgLoginPageListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询登陆页
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgLoginPage> getHfcfgLoginPageListByExample(HfcfgLoginPage_Example example) throws  Exception {
        return hfcfgLoginPageMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询登陆页数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgLoginPageCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询登陆页数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgLoginPageCountByExample(HfcfgLoginPage_Example example) throws  Exception {
        return hfcfgLoginPageMapper.countByExample(example);
    }


  	//getter
 	
	public HfcfgLoginPageMapper getHfcfgLoginPageMapper(){
		return hfcfgLoginPageMapper;
	}
	//setter
	public void setHfcfgLoginPageMapper(HfcfgLoginPageMapper hfcfgLoginPageMapper){
    	this.hfcfgLoginPageMapper = hfcfgLoginPageMapper;
    }
}
