package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfcfgProgramSkin;
import com.hframe.domain.model.HfcfgProgramSkin_Example;
import com.hframe.dao.HfcfgProgramSkinMapper;
import com.hframe.service.interfaces.IHfcfgProgramSkinSV;

@Service("iHfcfgProgramSkinSV")
public class HfcfgProgramSkinSVImpl  implements IHfcfgProgramSkinSV {

	@Resource
	private HfcfgProgramSkinMapper hfcfgProgramSkinMapper;
  
    /**
    * 创建皮肤
    * @param hfcfgProgramSkin
    * @return
    * @throws Exception
    */
    public int create(HfcfgProgramSkin hfcfgProgramSkin) throws Exception {
        return hfcfgProgramSkinMapper.insertSelective(hfcfgProgramSkin);
    }

    /**
    * 批量维护皮肤
    * @param hfcfgProgramSkins
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgProgramSkin[] hfcfgProgramSkins) throws  Exception{
        int result = 0;
        if(hfcfgProgramSkins != null) {
            for (HfcfgProgramSkin hfcfgProgramSkin : hfcfgProgramSkins) {
                if(hfcfgProgramSkin.getHfcfgProgramSkinId() == null) {
                    result += this.create(hfcfgProgramSkin);
                }else {
                    result += this.update(hfcfgProgramSkin);
                }
            }
        }
        return result;
    }

    /**
    * 更新皮肤
    * @param hfcfgProgramSkin
    * @return
    * @throws Exception
    */
    public int update(HfcfgProgramSkin hfcfgProgramSkin) throws  Exception {
        return hfcfgProgramSkinMapper.updateByPrimaryKeySelective(hfcfgProgramSkin);
    }

    /**
    * 通过查询对象更新皮肤
    * @param hfcfgProgramSkin
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgProgramSkin hfcfgProgramSkin, HfcfgProgramSkin_Example example) throws  Exception {
        return hfcfgProgramSkinMapper.updateByExampleSelective(hfcfgProgramSkin, example);
    }

    /**
    * 删除皮肤
    * @param hfcfgProgramSkin
    * @return
    * @throws Exception
    */
    public int delete(HfcfgProgramSkin hfcfgProgramSkin) throws  Exception {
        return hfcfgProgramSkinMapper.deleteByPrimaryKey(hfcfgProgramSkin.getHfcfgProgramSkinId());
    }

    /**
    * 删除皮肤
    * @param hfcfgProgramSkinId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgProgramSkinId) throws  Exception {
        return hfcfgProgramSkinMapper.deleteByPrimaryKey(hfcfgProgramSkinId);
    }

    /**
    * 查找所有皮肤
    * @return
    */
    public List<HfcfgProgramSkin> getHfcfgProgramSkinAll()  throws  Exception {
        return hfcfgProgramSkinMapper.selectByExample(new HfcfgProgramSkin_Example());
    }

    /**
    * 通过皮肤ID查询皮肤
    * @param hfcfgProgramSkinId
    * @return
    * @throws Exception
    */
    public HfcfgProgramSkin getHfcfgProgramSkinByPK(long hfcfgProgramSkinId)  throws  Exception {
        return hfcfgProgramSkinMapper.selectByPrimaryKey(hfcfgProgramSkinId);
    }

    /**
    * 通过MAP参数查询皮肤
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgProgramSkin> getHfcfgProgramSkinListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询皮肤
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgProgramSkin> getHfcfgProgramSkinListByExample(HfcfgProgramSkin_Example example) throws  Exception {
        return hfcfgProgramSkinMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询皮肤数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgProgramSkinCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询皮肤数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgProgramSkinCountByExample(HfcfgProgramSkin_Example example) throws  Exception {
        return hfcfgProgramSkinMapper.countByExample(example);
    }


  	//getter
 	
	public HfcfgProgramSkinMapper getHfcfgProgramSkinMapper(){
		return hfcfgProgramSkinMapper;
	}
	//setter
	public void setHfcfgProgramSkinMapper(HfcfgProgramSkinMapper hfcfgProgramSkinMapper){
    	this.hfcfgProgramSkinMapper = hfcfgProgramSkinMapper;
    }
}
