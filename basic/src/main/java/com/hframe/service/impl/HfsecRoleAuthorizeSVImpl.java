package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframework.common.util.ExampleUtils;
import com.hframe.domain.model.HfsecRoleAuthorize;
import com.hframe.domain.model.HfsecRoleAuthorize_Example;
import com.hframe.dao.HfsecRoleAuthorizeMapper;
import com.hframe.service.interfaces.IHfsecRoleAuthorizeSV;

@Service("iHfsecRoleAuthorizeSV")
public class HfsecRoleAuthorizeSVImpl  implements IHfsecRoleAuthorizeSV {

	@Resource
	private HfsecRoleAuthorizeMapper hfsecRoleAuthorizeMapper;
  


    /**
    * 创建角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Exception
    */
    public int create(HfsecRoleAuthorize hfsecRoleAuthorize) throws Exception {
        return hfsecRoleAuthorizeMapper.insertSelective(hfsecRoleAuthorize);
    }

    /**
    * 批量维护角色授权
    * @param hfsecRoleAuthorizes
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecRoleAuthorize[] hfsecRoleAuthorizes) throws  Exception{
        int result = 0;
        if(hfsecRoleAuthorizes != null) {
            for (HfsecRoleAuthorize hfsecRoleAuthorize : hfsecRoleAuthorizes) {
                if(hfsecRoleAuthorize.getHfsecRoleAuthorizeId() == null) {
                    result += this.create(hfsecRoleAuthorize);
                }else {
                    result += this.update(hfsecRoleAuthorize);
                }
            }
        }
        return result;
    }

    /**
    * 更新角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Exception
    */
    public int update(HfsecRoleAuthorize hfsecRoleAuthorize) throws  Exception {
        return hfsecRoleAuthorizeMapper.updateByPrimaryKeySelective(hfsecRoleAuthorize);
    }

    /**
    * 通过查询对象更新角色授权
    * @param hfsecRoleAuthorize
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecRoleAuthorize hfsecRoleAuthorize, HfsecRoleAuthorize_Example example) throws  Exception {
        return hfsecRoleAuthorizeMapper.updateByExampleSelective(hfsecRoleAuthorize, example);
    }

    /**
    * 删除角色授权
    * @param hfsecRoleAuthorize
    * @return
    * @throws Exception
    */
    public int delete(HfsecRoleAuthorize hfsecRoleAuthorize) throws  Exception {
        return hfsecRoleAuthorizeMapper.deleteByPrimaryKey(hfsecRoleAuthorize.getHfsecRoleAuthorizeId());
    }

    /**
    * 删除角色授权
    * @param hfsecRoleAuthorizeId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecRoleAuthorizeId) throws  Exception {
        return hfsecRoleAuthorizeMapper.deleteByPrimaryKey(hfsecRoleAuthorizeId);
    }

    /**
    * 查找所有角色授权
    * @return
    */
    public List<HfsecRoleAuthorize> getHfsecRoleAuthorizeAll()  throws  Exception {
        return hfsecRoleAuthorizeMapper.selectByExample(new HfsecRoleAuthorize_Example());
    }

    /**
    * 通过角色授权ID查询角色授权
    * @param hfsecRoleAuthorizeId
    * @return
    * @throws Exception
    */
    public HfsecRoleAuthorize getHfsecRoleAuthorizeByPK(long hfsecRoleAuthorizeId)  throws  Exception {
        return hfsecRoleAuthorizeMapper.selectByPrimaryKey(hfsecRoleAuthorizeId);
    }


    /**
    * 通过MAP参数查询角色授权
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecRoleAuthorize> getHfsecRoleAuthorizeListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询角色授权
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecRoleAuthorize> getHfsecRoleAuthorizeListByExample(HfsecRoleAuthorize_Example example) throws  Exception {
        return hfsecRoleAuthorizeMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询角色授权数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecRoleAuthorizeCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询角色授权数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecRoleAuthorizeCountByExample(HfsecRoleAuthorize_Example example) throws  Exception {
        return hfsecRoleAuthorizeMapper.countByExample(example);
    }


  	//getter
 	
	public HfsecRoleAuthorizeMapper getHfsecRoleAuthorizeMapper(){
		return hfsecRoleAuthorizeMapper;
	}
	//setter
	public void setHfsecRoleAuthorizeMapper(HfsecRoleAuthorizeMapper hfsecRoleAuthorizeMapper){
    	this.hfsecRoleAuthorizeMapper = hfsecRoleAuthorizeMapper;
    }
}
