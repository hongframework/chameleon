package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfcfgProgramTemplate;
import com.hframe.domain.model.HfcfgProgramTemplate_Example;
import com.hframe.dao.HfcfgProgramTemplateMapper;
import com.hframe.service.interfaces.IHfcfgProgramTemplateSV;

@Service("iHfcfgProgramTemplateSV")
public class HfcfgProgramTemplateSVImpl  implements IHfcfgProgramTemplateSV {

	@Resource
	private HfcfgProgramTemplateMapper hfcfgProgramTemplateMapper;
  
    /**
    * 创建项目模板
    * @param hfcfgProgramTemplate
    * @return
    * @throws Exception
    */
    public int create(HfcfgProgramTemplate hfcfgProgramTemplate) throws Exception {
        return hfcfgProgramTemplateMapper.insertSelective(hfcfgProgramTemplate);
    }

    /**
    * 批量维护项目模板
    * @param hfcfgProgramTemplates
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgProgramTemplate[] hfcfgProgramTemplates) throws  Exception{
        int result = 0;
        if(hfcfgProgramTemplates != null) {
            for (HfcfgProgramTemplate hfcfgProgramTemplate : hfcfgProgramTemplates) {
                if(hfcfgProgramTemplate.getHfcfgProgramTemplateId() == null) {
                    result += this.create(hfcfgProgramTemplate);
                }else {
                    result += this.update(hfcfgProgramTemplate);
                }
            }
        }
        return result;
    }

    /**
    * 更新项目模板
    * @param hfcfgProgramTemplate
    * @return
    * @throws Exception
    */
    public int update(HfcfgProgramTemplate hfcfgProgramTemplate) throws  Exception {
        return hfcfgProgramTemplateMapper.updateByPrimaryKeySelective(hfcfgProgramTemplate);
    }

    /**
    * 通过查询对象更新项目模板
    * @param hfcfgProgramTemplate
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgProgramTemplate hfcfgProgramTemplate, HfcfgProgramTemplate_Example example) throws  Exception {
        return hfcfgProgramTemplateMapper.updateByExampleSelective(hfcfgProgramTemplate, example);
    }

    /**
    * 删除项目模板
    * @param hfcfgProgramTemplate
    * @return
    * @throws Exception
    */
    public int delete(HfcfgProgramTemplate hfcfgProgramTemplate) throws  Exception {
        return hfcfgProgramTemplateMapper.deleteByPrimaryKey(hfcfgProgramTemplate.getHfcfgProgramTemplateId());
    }

    /**
    * 删除项目模板
    * @param hfcfgProgramTemplateId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgProgramTemplateId) throws  Exception {
        return hfcfgProgramTemplateMapper.deleteByPrimaryKey(hfcfgProgramTemplateId);
    }

    /**
    * 查找所有项目模板
    * @return
    */
    public List<HfcfgProgramTemplate> getHfcfgProgramTemplateAll()  throws  Exception {
        return hfcfgProgramTemplateMapper.selectByExample(new HfcfgProgramTemplate_Example());
    }

    /**
    * 通过项目模板ID查询项目模板
    * @param hfcfgProgramTemplateId
    * @return
    * @throws Exception
    */
    public HfcfgProgramTemplate getHfcfgProgramTemplateByPK(long hfcfgProgramTemplateId)  throws  Exception {
        return hfcfgProgramTemplateMapper.selectByPrimaryKey(hfcfgProgramTemplateId);
    }

    /**
    * 通过MAP参数查询项目模板
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgProgramTemplate> getHfcfgProgramTemplateListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询项目模板
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgProgramTemplate> getHfcfgProgramTemplateListByExample(HfcfgProgramTemplate_Example example) throws  Exception {
        return hfcfgProgramTemplateMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询项目模板数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgProgramTemplateCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询项目模板数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgProgramTemplateCountByExample(HfcfgProgramTemplate_Example example) throws  Exception {
        return hfcfgProgramTemplateMapper.countByExample(example);
    }


  	//getter
 	
	public HfcfgProgramTemplateMapper getHfcfgProgramTemplateMapper(){
		return hfcfgProgramTemplateMapper;
	}
	//setter
	public void setHfcfgProgramTemplateMapper(HfcfgProgramTemplateMapper hfcfgProgramTemplateMapper){
    	this.hfcfgProgramTemplateMapper = hfcfgProgramTemplateMapper;
    }
}
