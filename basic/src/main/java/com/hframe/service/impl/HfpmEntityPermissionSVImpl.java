package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfpmEntityPermission;
import com.hframe.domain.model.HfpmEntityPermission_Example;
import com.hframe.dao.HfpmEntityPermissionMapper;
import com.hframe.service.interfaces.IHfpmEntityPermissionSV;

@Service("iHfpmEntityPermissionSV")
public class HfpmEntityPermissionSVImpl  implements IHfpmEntityPermissionSV {

	@Resource
	private HfpmEntityPermissionMapper hfpmEntityPermissionMapper;
  
    /**
    * 创建实体权限
    * @param hfpmEntityPermission
    * @return
    * @throws Exception
    */
    public int create(HfpmEntityPermission hfpmEntityPermission) throws Exception {
        return hfpmEntityPermissionMapper.insertSelective(hfpmEntityPermission);
    }

    /**
    * 批量维护实体权限
    * @param hfpmEntityPermissions
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmEntityPermission[] hfpmEntityPermissions) throws  Exception{
        int result = 0;
        if(hfpmEntityPermissions != null) {
            for (HfpmEntityPermission hfpmEntityPermission : hfpmEntityPermissions) {
                if(hfpmEntityPermission.getHfpmEntityPermissionId() == null) {
                    result += this.create(hfpmEntityPermission);
                }else {
                    result += this.update(hfpmEntityPermission);
                }
            }
        }
        return result;
    }

    /**
    * 更新实体权限
    * @param hfpmEntityPermission
    * @return
    * @throws Exception
    */
    public int update(HfpmEntityPermission hfpmEntityPermission) throws  Exception {
        return hfpmEntityPermissionMapper.updateByPrimaryKeySelective(hfpmEntityPermission);
    }

    /**
    * 通过查询对象更新实体权限
    * @param hfpmEntityPermission
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmEntityPermission hfpmEntityPermission, HfpmEntityPermission_Example example) throws  Exception {
        return hfpmEntityPermissionMapper.updateByExampleSelective(hfpmEntityPermission, example);
    }

    /**
    * 删除实体权限
    * @param hfpmEntityPermission
    * @return
    * @throws Exception
    */
    public int delete(HfpmEntityPermission hfpmEntityPermission) throws  Exception {
        return hfpmEntityPermissionMapper.deleteByPrimaryKey(hfpmEntityPermission.getHfpmEntityPermissionId());
    }

    /**
    * 删除实体权限
    * @param hfpmEntityPermissionId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmEntityPermissionId) throws  Exception {
        return hfpmEntityPermissionMapper.deleteByPrimaryKey(hfpmEntityPermissionId);
    }

    /**
    * 查找所有实体权限
    * @return
    */
    public List<HfpmEntityPermission> getHfpmEntityPermissionAll()  throws  Exception {
        return hfpmEntityPermissionMapper.selectByExample(new HfpmEntityPermission_Example());
    }

    /**
    * 通过实体权限ID查询实体权限
    * @param hfpmEntityPermissionId
    * @return
    * @throws Exception
    */
    public HfpmEntityPermission getHfpmEntityPermissionByPK(long hfpmEntityPermissionId)  throws  Exception {
        return hfpmEntityPermissionMapper.selectByPrimaryKey(hfpmEntityPermissionId);
    }

    /**
    * 通过MAP参数查询实体权限
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmEntityPermission> getHfpmEntityPermissionListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询实体权限
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmEntityPermission> getHfpmEntityPermissionListByExample(HfpmEntityPermission_Example example) throws  Exception {
        return hfpmEntityPermissionMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询实体权限数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmEntityPermissionCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询实体权限数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmEntityPermissionCountByExample(HfpmEntityPermission_Example example) throws  Exception {
        return hfpmEntityPermissionMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmEntityPermissionMapper getHfpmEntityPermissionMapper(){
		return hfpmEntityPermissionMapper;
	}
	//setter
	public void setHfpmEntityPermissionMapper(HfpmEntityPermissionMapper hfpmEntityPermissionMapper){
    	this.hfpmEntityPermissionMapper = hfpmEntityPermissionMapper;
    }
}
