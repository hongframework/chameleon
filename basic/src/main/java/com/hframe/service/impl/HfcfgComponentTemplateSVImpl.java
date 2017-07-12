package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.google.common.collect.Lists;
import com.hframe.domain.model.HfcfgComponentTemplate;
import com.hframe.domain.model.HfcfgComponentTemplate_Example;
import com.hframe.dao.HfcfgComponentTemplateMapper;
import com.hframe.service.interfaces.IHfcfgComponentTemplateSV;

@Service("iHfcfgComponentTemplateSV")
public class HfcfgComponentTemplateSVImpl  implements IHfcfgComponentTemplateSV {

	@Resource
	private HfcfgComponentTemplateMapper hfcfgComponentTemplateMapper;
  


    /**
    * 创建
    * @param hfcfgComponentTemplate
    * @return
    * @throws Exception
    */
    public int create(HfcfgComponentTemplate hfcfgComponentTemplate) throws Exception {
        return hfcfgComponentTemplateMapper.insertSelective(hfcfgComponentTemplate);
    }

    /**
    * 批量维护
    * @param hfcfgComponentTemplates
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgComponentTemplate[] hfcfgComponentTemplates) throws  Exception{
        int result = 0;
        if(hfcfgComponentTemplates != null) {
            for (HfcfgComponentTemplate hfcfgComponentTemplate : hfcfgComponentTemplates) {
                if(hfcfgComponentTemplate.getHfcfgComponentTemplateId() == null){
                    result += this.create(hfcfgComponentTemplate);
                }else {
                    result += this.update(hfcfgComponentTemplate);
                }
            }
        }
        return result;
    }

    /**
     * 更新
     * @param hfcfgComponentTemplate
    * @return
    * @throws Exception
    */
    public int update(HfcfgComponentTemplate hfcfgComponentTemplate) throws  Exception {
        return hfcfgComponentTemplateMapper.updateByPrimaryKeySelective(hfcfgComponentTemplate);
    }

    /**
    * 通过查询对象更新
    * @param hfcfgComponentTemplate
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgComponentTemplate hfcfgComponentTemplate, HfcfgComponentTemplate_Example example) throws  Exception {
        return hfcfgComponentTemplateMapper.updateByExampleSelective(hfcfgComponentTemplate, example);
    }

    /**
    * 删除
    * @param hfcfgComponentTemplate
    * @return
    * @throws Exception
    */
    public int delete(HfcfgComponentTemplate hfcfgComponentTemplate) throws  Exception {
        return hfcfgComponentTemplateMapper.deleteByPrimaryKey(hfcfgComponentTemplate.getHfcfgComponentTemplateId());
    }

    /**
    * 删除
    * @param hfcfgComponentTemplateId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgComponentTemplateId) throws  Exception {
        return hfcfgComponentTemplateMapper.deleteByPrimaryKey(hfcfgComponentTemplateId);
    }

    /**
    * 查找所有
    * @return
    */
    public List<HfcfgComponentTemplate> getHfcfgComponentTemplateAll()  throws  Exception {
        return hfcfgComponentTemplateMapper.selectByExample(new HfcfgComponentTemplate_Example());
    }

    /**
    * 通过ID查询
    * @param hfcfgComponentTemplateId
    * @return
    * @throws Exception
    */
    public HfcfgComponentTemplate getHfcfgComponentTemplateByPK(long hfcfgComponentTemplateId)  throws  Exception {
        return hfcfgComponentTemplateMapper.selectByPrimaryKey(hfcfgComponentTemplateId);
    }


    /**
    * 通过MAP参数查询
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgComponentTemplate> getHfcfgComponentTemplateListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgComponentTemplate> getHfcfgComponentTemplateListByExample(HfcfgComponentTemplate_Example example) throws  Exception {
        return hfcfgComponentTemplateMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgComponentTemplateCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgComponentTemplateCountByExample(HfcfgComponentTemplate_Example example) throws  Exception {
        return hfcfgComponentTemplateMapper.countByExample(example);
    }


  	//getter
 	
	public HfcfgComponentTemplateMapper getHfcfgComponentTemplateMapper(){
		return hfcfgComponentTemplateMapper;
	}
	//setter
	public void setHfcfgComponentTemplateMapper(HfcfgComponentTemplateMapper hfcfgComponentTemplateMapper){
    	this.hfcfgComponentTemplateMapper = hfcfgComponentTemplateMapper;
    }
}
