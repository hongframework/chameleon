package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfsecRole;
import com.hframe.domain.model.HfsecRole_Example;
import com.hframe.dao.HfsecRoleMapper;
import com.hframe.service.interfaces.IHfsecRoleSV;

@Service("iHfsecRoleSV")
public class HfsecRoleSVImpl  implements IHfsecRoleSV {

	@Resource
	private HfsecRoleMapper hfsecRoleMapper;
  


    /**
    * 创建角色
    * @param hfsecRole
    * @return
    * @throws Exception
    */
    public int create(HfsecRole hfsecRole) throws Exception {
        return hfsecRoleMapper.insertSelective(hfsecRole);
    }

    /**
    * 批量维护角色
    * @param hfsecRoles
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecRole[] hfsecRoles) throws  Exception{
        int result = 0;
        if(hfsecRoles != null) {
            for (HfsecRole hfsecRole : hfsecRoles) {
                if(hfsecRole.getHfsecRoleId() == null) {
                    result += this.create(hfsecRole);
                }else {
                    result += this.update(hfsecRole);
                }
            }
        }
        return result;
    }

    /**
    * 更新角色
    * @param hfsecRole
    * @return
    * @throws Exception
    */
    public int update(HfsecRole hfsecRole) throws  Exception {
        return hfsecRoleMapper.updateByPrimaryKeySelective(hfsecRole);
    }

    /**
    * 通过查询对象更新角色
    * @param hfsecRole
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecRole hfsecRole, HfsecRole_Example example) throws  Exception {
        return hfsecRoleMapper.updateByExampleSelective(hfsecRole, example);
    }

    /**
    * 删除角色
    * @param hfsecRole
    * @return
    * @throws Exception
    */
    public int delete(HfsecRole hfsecRole) throws  Exception {
        return hfsecRoleMapper.deleteByPrimaryKey(hfsecRole.getHfsecRoleId());
    }

    /**
    * 删除角色
    * @param hfsecRoleId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecRoleId) throws  Exception {
        return hfsecRoleMapper.deleteByPrimaryKey(hfsecRoleId);
    }

    /**
    * 查找所有角色
    * @return
    */
    public List<HfsecRole> getHfsecRoleAll()  throws  Exception {
        return hfsecRoleMapper.selectByExample(new HfsecRole_Example());
    }

    /**
    * 通过角色ID查询角色
    * @param hfsecRoleId
    * @return
    * @throws Exception
    */
    public HfsecRole getHfsecRoleByPK(long hfsecRoleId)  throws  Exception {
        return hfsecRoleMapper.selectByPrimaryKey(hfsecRoleId);
    }


    /**
    * 通过MAP参数查询角色
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecRole> getHfsecRoleListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询角色
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecRole> getHfsecRoleListByExample(HfsecRole_Example example) throws  Exception {
        return hfsecRoleMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询角色数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecRoleCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询角色数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecRoleCountByExample(HfsecRole_Example example) throws  Exception {
        return hfsecRoleMapper.countByExample(example);
    }


  	//getter
 	
	public HfsecRoleMapper getHfsecRoleMapper(){
		return hfsecRoleMapper;
	}
	//setter
	public void setHfsecRoleMapper(HfsecRoleMapper hfsecRoleMapper){
    	this.hfsecRoleMapper = hfsecRoleMapper;
    }
}
