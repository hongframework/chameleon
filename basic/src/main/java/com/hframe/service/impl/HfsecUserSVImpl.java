package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfsecUser;
import com.hframe.domain.model.HfsecUser_Example;
import com.hframe.dao.HfsecUserMapper;
import com.hframe.service.interfaces.IHfsecUserSV;

@Service("iHfsecUserSV")
public class HfsecUserSVImpl  implements IHfsecUserSV {

	@Resource
	private HfsecUserMapper hfsecUserMapper;
  


    /**
    * 创建用户
    * @param hfsecUser
    * @return
    * @throws Exception
    */
    public int create(HfsecUser hfsecUser) throws Exception {
        return hfsecUserMapper.insertSelective(hfsecUser);
    }

    /**
    * 批量维护用户
    * @param hfsecUsers
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecUser[] hfsecUsers) throws  Exception{
        int result = 0;
        if(hfsecUsers != null) {
            for (HfsecUser hfsecUser : hfsecUsers) {
                if(hfsecUser.getHfsecUserId() == null) {
                    result += this.create(hfsecUser);
                }else {
                    result += this.update(hfsecUser);
                }
            }
        }
        return result;
    }

    /**
    * 更新用户
    * @param hfsecUser
    * @return
    * @throws Exception
    */
    public int update(HfsecUser hfsecUser) throws  Exception {
        return hfsecUserMapper.updateByPrimaryKeySelective(hfsecUser);
    }

    /**
    * 通过查询对象更新用户
    * @param hfsecUser
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecUser hfsecUser, HfsecUser_Example example) throws  Exception {
        return hfsecUserMapper.updateByExampleSelective(hfsecUser, example);
    }

    /**
    * 删除用户
    * @param hfsecUser
    * @return
    * @throws Exception
    */
    public int delete(HfsecUser hfsecUser) throws  Exception {
        return hfsecUserMapper.deleteByPrimaryKey(hfsecUser.getHfsecUserId());
    }

    /**
    * 删除用户
    * @param hfsecUserId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecUserId) throws  Exception {
        return hfsecUserMapper.deleteByPrimaryKey(hfsecUserId);
    }

    /**
    * 查找所有用户
    * @return
    */
    public List<HfsecUser> getHfsecUserAll()  throws  Exception {
        return hfsecUserMapper.selectByExample(new HfsecUser_Example());
    }

    /**
    * 通过用户ID查询用户
    * @param hfsecUserId
    * @return
    * @throws Exception
    */
    public HfsecUser getHfsecUserByPK(long hfsecUserId)  throws  Exception {
        return hfsecUserMapper.selectByPrimaryKey(hfsecUserId);
    }


    /**
    * 通过MAP参数查询用户
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecUser> getHfsecUserListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询用户
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecUser> getHfsecUserListByExample(HfsecUser_Example example) throws  Exception {
        return hfsecUserMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询用户数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecUserCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询用户数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecUserCountByExample(HfsecUser_Example example) throws  Exception {
        return hfsecUserMapper.countByExample(example);
    }


  	//getter
 	
	public HfsecUserMapper getHfsecUserMapper(){
		return hfsecUserMapper;
	}
	//setter
	public void setHfsecUserMapper(HfsecUserMapper hfsecUserMapper){
    	this.hfsecUserMapper = hfsecUserMapper;
    }
}
