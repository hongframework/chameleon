package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfsecUserAuthorize;
import com.hframe.domain.model.HfsecUserAuthorize_Example;
import com.hframe.dao.HfsecUserAuthorizeMapper;
import com.hframe.service.interfaces.IHfsecUserAuthorizeSV;

@Service("iHfsecUserAuthorizeSV")
public class HfsecUserAuthorizeSVImpl  implements IHfsecUserAuthorizeSV {

	@Resource
	private HfsecUserAuthorizeMapper hfsecUserAuthorizeMapper;
  


    /**
    * 创建用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Exception
    */
    public int create(HfsecUserAuthorize hfsecUserAuthorize) throws Exception {
        return hfsecUserAuthorizeMapper.insertSelective(hfsecUserAuthorize);
    }

    /**
    * 批量维护用户授权
    * @param hfsecUserAuthorizes
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecUserAuthorize[] hfsecUserAuthorizes) throws  Exception{
        int result = 0;
        if(hfsecUserAuthorizes != null) {
            for (HfsecUserAuthorize hfsecUserAuthorize : hfsecUserAuthorizes) {
                if(hfsecUserAuthorize.getHfsecUserAuthorizeId() == null) {
                    result += this.create(hfsecUserAuthorize);
                }else {
                    result += this.update(hfsecUserAuthorize);
                }
            }
        }
        return result;
    }

    /**
    * 更新用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Exception
    */
    public int update(HfsecUserAuthorize hfsecUserAuthorize) throws  Exception {
        return hfsecUserAuthorizeMapper.updateByPrimaryKeySelective(hfsecUserAuthorize);
    }

    /**
    * 通过查询对象更新用户授权
    * @param hfsecUserAuthorize
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecUserAuthorize hfsecUserAuthorize, HfsecUserAuthorize_Example example) throws  Exception {
        return hfsecUserAuthorizeMapper.updateByExampleSelective(hfsecUserAuthorize, example);
    }

    /**
    * 删除用户授权
    * @param hfsecUserAuthorize
    * @return
    * @throws Exception
    */
    public int delete(HfsecUserAuthorize hfsecUserAuthorize) throws  Exception {
        return hfsecUserAuthorizeMapper.deleteByPrimaryKey(hfsecUserAuthorize.getHfsecUserAuthorizeId());
    }

    /**
    * 删除用户授权
    * @param hfsecUserAuthorizeId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecUserAuthorizeId) throws  Exception {
        return hfsecUserAuthorizeMapper.deleteByPrimaryKey(hfsecUserAuthorizeId);
    }

    /**
    * 查找所有用户授权
    * @return
    */
    public List<HfsecUserAuthorize> getHfsecUserAuthorizeAll()  throws  Exception {
        return hfsecUserAuthorizeMapper.selectByExample(new HfsecUserAuthorize_Example());
    }

    /**
    * 通过用户授权ID查询用户授权
    * @param hfsecUserAuthorizeId
    * @return
    * @throws Exception
    */
    public HfsecUserAuthorize getHfsecUserAuthorizeByPK(long hfsecUserAuthorizeId)  throws  Exception {
        return hfsecUserAuthorizeMapper.selectByPrimaryKey(hfsecUserAuthorizeId);
    }


    /**
    * 通过MAP参数查询用户授权
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecUserAuthorize> getHfsecUserAuthorizeListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询用户授权
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecUserAuthorize> getHfsecUserAuthorizeListByExample(HfsecUserAuthorize_Example example) throws  Exception {
        return hfsecUserAuthorizeMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询用户授权数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecUserAuthorizeCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询用户授权数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecUserAuthorizeCountByExample(HfsecUserAuthorize_Example example) throws  Exception {
        return hfsecUserAuthorizeMapper.countByExample(example);
    }


  	//getter
 	
	public HfsecUserAuthorizeMapper getHfsecUserAuthorizeMapper(){
		return hfsecUserAuthorizeMapper;
	}
	//setter
	public void setHfsecUserAuthorizeMapper(HfsecUserAuthorizeMapper hfsecUserAuthorizeMapper){
    	this.hfsecUserAuthorizeMapper = hfsecUserAuthorizeMapper;
    }
}
