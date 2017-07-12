package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfcfgPageTemplate;
import com.hframe.domain.model.HfcfgPageTemplate_Example;
import com.hframe.dao.HfcfgPageTemplateMapper;
import com.hframe.service.interfaces.IHfcfgPageTemplateSV;

@Service("iHfcfgPageTemplateSV")
public class HfcfgPageTemplateSVImpl  implements IHfcfgPageTemplateSV {

	@Resource
	private HfcfgPageTemplateMapper hfcfgPageTemplateMapper;
  
    /**
    * 创建页面模板
    * @param hfcfgPageTemplate
    * @return
    * @throws Exception
    */
    public int create(HfcfgPageTemplate hfcfgPageTemplate) throws Exception {
        return hfcfgPageTemplateMapper.insertSelective(hfcfgPageTemplate);
    }

    /**
    * 批量维护页面模板
    * @param hfcfgPageTemplates
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgPageTemplate[] hfcfgPageTemplates) throws  Exception{
        int result = 0;
        if(hfcfgPageTemplates != null) {
            for (HfcfgPageTemplate hfcfgPageTemplate : hfcfgPageTemplates) {
                if(hfcfgPageTemplate.getHfcfgPageTemplateId() == null) {
                    result += this.create(hfcfgPageTemplate);
                }else {
                    result += this.update(hfcfgPageTemplate);
                }
            }
        }
        return result;
    }

    /**
    * 更新页面模板
    * @param hfcfgPageTemplate
    * @return
    * @throws Exception
    */
    public int update(HfcfgPageTemplate hfcfgPageTemplate) throws  Exception {
        return hfcfgPageTemplateMapper.updateByPrimaryKeySelective(hfcfgPageTemplate);
    }

    /**
    * 通过查询对象更新页面模板
    * @param hfcfgPageTemplate
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgPageTemplate hfcfgPageTemplate, HfcfgPageTemplate_Example example) throws  Exception {
        return hfcfgPageTemplateMapper.updateByExampleSelective(hfcfgPageTemplate, example);
    }

    /**
    * 删除页面模板
    * @param hfcfgPageTemplate
    * @return
    * @throws Exception
    */
    public int delete(HfcfgPageTemplate hfcfgPageTemplate) throws  Exception {
        return hfcfgPageTemplateMapper.deleteByPrimaryKey(hfcfgPageTemplate.getHfcfgPageTemplateId());
    }

    /**
    * 删除页面模板
    * @param hfcfgPageTemplateId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgPageTemplateId) throws  Exception {
        return hfcfgPageTemplateMapper.deleteByPrimaryKey(hfcfgPageTemplateId);
    }

    /**
    * 查找所有页面模板
    * @return
    */
    public List<HfcfgPageTemplate> getHfcfgPageTemplateAll()  throws  Exception {
        return hfcfgPageTemplateMapper.selectByExample(new HfcfgPageTemplate_Example());
    }

    /**
    * 通过页面模板ID查询页面模板
    * @param hfcfgPageTemplateId
    * @return
    * @throws Exception
    */
    public HfcfgPageTemplate getHfcfgPageTemplateByPK(long hfcfgPageTemplateId)  throws  Exception {
        return hfcfgPageTemplateMapper.selectByPrimaryKey(hfcfgPageTemplateId);
    }

    /**
    * 通过MAP参数查询页面模板
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgPageTemplate> getHfcfgPageTemplateListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询页面模板
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgPageTemplate> getHfcfgPageTemplateListByExample(HfcfgPageTemplate_Example example) throws  Exception {
        return hfcfgPageTemplateMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询页面模板数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgPageTemplateCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询页面模板数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgPageTemplateCountByExample(HfcfgPageTemplate_Example example) throws  Exception {
        return hfcfgPageTemplateMapper.countByExample(example);
    }


  	//getter
 	
	public HfcfgPageTemplateMapper getHfcfgPageTemplateMapper(){
		return hfcfgPageTemplateMapper;
	}
	//setter
	public void setHfcfgPageTemplateMapper(HfcfgPageTemplateMapper hfcfgPageTemplateMapper){
    	this.hfcfgPageTemplateMapper = hfcfgPageTemplateMapper;
    }
}
