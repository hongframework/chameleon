package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfsecOrganize;
import com.hframe.domain.model.HfsecOrganize_Example;
import com.hframe.dao.HfsecOrganizeMapper;
import com.hframe.service.interfaces.IHfsecOrganizeSV;

@Service("iHfsecOrganizeSV")
public class HfsecOrganizeSVImpl  implements IHfsecOrganizeSV {

	@Resource
	private HfsecOrganizeMapper hfsecOrganizeMapper;
  


    /**
    * 创建组织
    * @param hfsecOrganize
    * @return
    * @throws Exception
    */
    public int create(HfsecOrganize hfsecOrganize) throws Exception {
        return hfsecOrganizeMapper.insertSelective(hfsecOrganize);
    }

    /**
    * 批量维护组织
    * @param hfsecOrganizes
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecOrganize[] hfsecOrganizes) throws  Exception{
        int result = 0;
        if(hfsecOrganizes != null) {
            for (HfsecOrganize hfsecOrganize : hfsecOrganizes) {
                if(hfsecOrganize.getHfsecOrganizeId() == null) {
                    result += this.create(hfsecOrganize);
                }else {
                    result += this.update(hfsecOrganize);
                }
            }
        }
        return result;
    }

    /**
    * 更新组织
    * @param hfsecOrganize
    * @return
    * @throws Exception
    */
    public int update(HfsecOrganize hfsecOrganize) throws  Exception {
        return hfsecOrganizeMapper.updateByPrimaryKeySelective(hfsecOrganize);
    }

    /**
    * 通过查询对象更新组织
    * @param hfsecOrganize
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecOrganize hfsecOrganize, HfsecOrganize_Example example) throws  Exception {
        return hfsecOrganizeMapper.updateByExampleSelective(hfsecOrganize, example);
    }

    /**
    * 删除组织
    * @param hfsecOrganize
    * @return
    * @throws Exception
    */
    public int delete(HfsecOrganize hfsecOrganize) throws  Exception {
        return hfsecOrganizeMapper.deleteByPrimaryKey(hfsecOrganize.getHfsecOrganizeId());
    }

    /**
    * 删除组织
    * @param hfsecOrganizeId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecOrganizeId) throws  Exception {
        return hfsecOrganizeMapper.deleteByPrimaryKey(hfsecOrganizeId);
    }

    /**
    * 查找所有组织
    * @return
    */
    public List<HfsecOrganize> getHfsecOrganizeAll()  throws  Exception {
        return hfsecOrganizeMapper.selectByExample(new HfsecOrganize_Example());
    }

    /**
    * 通过组织ID查询组织
    * @param hfsecOrganizeId
    * @return
    * @throws Exception
    */
    public HfsecOrganize getHfsecOrganizeByPK(long hfsecOrganizeId)  throws  Exception {
        return hfsecOrganizeMapper.selectByPrimaryKey(hfsecOrganizeId);
    }

    /**
    * 通过父级组织ID查询组织树
    * @param hfsecOrganize
    * @return
    * @throws Exception
    */
    public Map<Long, List<HfsecOrganize>> getHfsecOrganizeTreeByParentId(HfsecOrganize hfsecOrganize, HfsecOrganize_Example example)  throws  Exception {

        Map<Long, List<HfsecOrganize>> result = new HashMap<Long, List<HfsecOrganize>>();

        fillHfsecOrganizeTreeCascade(result, Lists.newArrayList(
                hfsecOrganize.getParentHfsecOrganizeId() == null ? -1 : hfsecOrganize.getParentHfsecOrganizeId() ), example);
        return result;
    }

    private void fillHfsecOrganizeTreeCascade(Map<Long, List<HfsecOrganize>> result, List<Long> parentIds, HfsecOrganize_Example example) {
        if(parentIds.size() == 0) {
            return ;
        }
        if(example == null) {
            example = new HfsecOrganize_Example();
        }

        if(example.getOredCriteria() == null || example.getOredCriteria().size() == 0) {
            example.createCriteria();
        }

        example.getOredCriteria().get(0).andParentHfsecOrganizeIdIn(parentIds);
        List<HfsecOrganize> hfsecOrganizes = hfsecOrganizeMapper.selectByExample(example);
        if(hfsecOrganizes == null || hfsecOrganizes.size() == 0) {
            return;
        }

        if(parentIds.size() == 1) {
            result.put(parentIds.get(0), hfsecOrganizes);
        }else {
            for (HfsecOrganize hfsecOrganize : hfsecOrganizes) {
                Long parentId = hfsecOrganize.getParentHfsecOrganizeId();
                if(!result.containsKey(parentId)) {
                    result.put(parentId, new ArrayList<HfsecOrganize>());
                }
                result.get(parentId).add(hfsecOrganize);
            }
        }

        List subIds = new ArrayList();
        for (HfsecOrganize hfsecOrganize : hfsecOrganizes) {
            subIds.add(hfsecOrganize.getHfsecOrganizeId());
        }

        fillHfsecOrganizeTreeCascade(result,subIds, null);
    }

    /**
    * 通过MAP参数查询组织
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecOrganize> getHfsecOrganizeListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询组织
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecOrganize> getHfsecOrganizeListByExample(HfsecOrganize_Example example) throws  Exception {
        return hfsecOrganizeMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询组织数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecOrganizeCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询组织数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecOrganizeCountByExample(HfsecOrganize_Example example) throws  Exception {
        return hfsecOrganizeMapper.countByExample(example);
    }


  	//getter
 	
	public HfsecOrganizeMapper getHfsecOrganizeMapper(){
		return hfsecOrganizeMapper;
	}
	//setter
	public void setHfsecOrganizeMapper(HfsecOrganizeMapper hfsecOrganizeMapper){
    	this.hfsecOrganizeMapper = hfsecOrganizeMapper;
    }
}
