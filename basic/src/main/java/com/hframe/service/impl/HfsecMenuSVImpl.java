package com.hframe.service.impl;

import java.util.*;

import com.hframework.common.util.BeanUtils;
import com.hframework.common.util.ExampleUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfsecMenu;
import com.hframe.domain.model.HfsecMenu_Example;
import com.hframe.dao.HfsecMenuMapper;
import com.hframe.service.interfaces.IHfsecMenuSV;

@Service("iHfsecMenuSV")
public class HfsecMenuSVImpl  implements IHfsecMenuSV {

	@Resource
	private HfsecMenuMapper hfsecMenuMapper;
  


    /**
    * 创建菜单
    * @param hfsecMenu
    * @return
    * @throws Exception
    */
    public int create(HfsecMenu hfsecMenu) throws Exception {
        return hfsecMenuMapper.insertSelective(hfsecMenu);
    }

    /**
    * 批量维护菜单
    * @param hfsecMenus
    * @return
    * @throws Exception
    */
    public int batchOperate(HfsecMenu[] hfsecMenus) throws  Exception{
        int result = 0;
        if(hfsecMenus != null) {
            for (HfsecMenu hfsecMenu : hfsecMenus) {
                if(hfsecMenu.getHfsecMenuId() == null) {
                    result += this.create(hfsecMenu);
                }else {
                    result += this.update(hfsecMenu);
                }
            }
        }
        return result;
    }

    /**
    * 更新菜单
    * @param hfsecMenu
    * @return
    * @throws Exception
    */
    public int update(HfsecMenu hfsecMenu) throws  Exception {
        return hfsecMenuMapper.updateByPrimaryKeySelective(hfsecMenu);
    }

    /**
    * 通过查询对象更新菜单
    * @param hfsecMenu
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfsecMenu hfsecMenu, HfsecMenu_Example example) throws  Exception {
        return hfsecMenuMapper.updateByExampleSelective(hfsecMenu, example);
    }

    /**
    * 删除菜单
    * @param hfsecMenu
    * @return
    * @throws Exception
    */
    public int delete(HfsecMenu hfsecMenu) throws  Exception {
        return hfsecMenuMapper.deleteByPrimaryKey(hfsecMenu.getHfsecMenuId());
    }

    /**
    * 删除菜单
    * @param hfsecMenuId
    * @return
    * @throws Exception
    */
    public int delete(long hfsecMenuId) throws  Exception {
        return hfsecMenuMapper.deleteByPrimaryKey(hfsecMenuId);
    }

    /**
    * 查找所有菜单
    * @return
    */
    public List<HfsecMenu> getHfsecMenuAll()  throws  Exception {
        return hfsecMenuMapper.selectByExample(new HfsecMenu_Example());
    }

    /**
    * 通过菜单ID查询菜单
    * @param hfsecMenuId
    * @return
    * @throws Exception
    */
    public HfsecMenu getHfsecMenuByPK(long hfsecMenuId)  throws  Exception {
        return hfsecMenuMapper.selectByPrimaryKey(hfsecMenuId);
    }

    /**
    * 通过父级菜单ID查询菜单树
    * @param hfsecMenu
    * @return
    * @throws Exception
    */
    public Map<Long, List<HfsecMenu>> getHfsecMenuTreeByParentId(HfsecMenu hfsecMenu, HfsecMenu_Example example)  throws  Exception {

        Map<Long, List<HfsecMenu>> result = new HashMap<Long, List<HfsecMenu>>();

        fillHfsecMenuTreeCascade(result, Lists.newArrayList(hfsecMenu.getParentHfsecMenuId() ==null ? -1 : hfsecMenu.getParentHfsecMenuId()), example);
        return result;
    }

    private void fillHfsecMenuTreeCascade(Map<Long, List<HfsecMenu>> result, List<Long> parentIds, HfsecMenu_Example templateExample) throws Exception {
        if(parentIds.size() == 0) {
            return ;
        }
        if(templateExample == null) {
            templateExample = new HfsecMenu_Example();
        }
        HfsecMenu_Example example = ExampleUtils.clone(templateExample);
        if(example.getOredCriteria() != null && example.getOredCriteria().size() > 0) {
            example.getOredCriteria().get(0).andParentHfsecMenuIdIn(parentIds);
        }else {
            example.createCriteria().andParentHfsecMenuIdIn(parentIds);
        }

        List<HfsecMenu> hfsecMenus = hfsecMenuMapper.selectByExample(example);
        if(hfsecMenus == null || hfsecMenus.size() == 0) {
            return;
        }

        if(parentIds.size() == 1) {
            result.put(parentIds.get(0), hfsecMenus);
        }else {
            for (HfsecMenu hfsecMenu : hfsecMenus) {
                Long parentId = hfsecMenu.getParentHfsecMenuId();
                if(!result.containsKey(parentId)) {
                    result.put(parentId, new ArrayList<HfsecMenu>());
                }
                result.get(parentId).add(hfsecMenu);
            }
        }

        List subIds = new ArrayList();
        for (HfsecMenu hfsecMenu : hfsecMenus) {
            subIds.add(hfsecMenu.getHfsecMenuId());
        }

        fillHfsecMenuTreeCascade(result,subIds, templateExample);
    }

    /**
    * 通过MAP参数查询菜单
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfsecMenu> getHfsecMenuListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询菜单
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfsecMenu> getHfsecMenuListByExample(HfsecMenu_Example example) throws  Exception {
        return hfsecMenuMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询菜单数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfsecMenuCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询菜单数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfsecMenuCountByExample(HfsecMenu_Example example) throws  Exception {
        return hfsecMenuMapper.countByExample(example);
    }


  	//getter
 	
	public HfsecMenuMapper getHfsecMenuMapper(){
		return hfsecMenuMapper;
	}
	//setter
	public void setHfsecMenuMapper(HfsecMenuMapper hfsecMenuMapper){
    	this.hfsecMenuMapper = hfsecMenuMapper;
    }
}
