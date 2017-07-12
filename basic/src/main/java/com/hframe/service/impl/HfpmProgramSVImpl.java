package com.hframe.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hframe.domain.model.HfpmProgram;
import com.hframe.domain.model.HfpmProgram_Example;
import com.hframe.dao.HfpmProgramMapper;
import com.hframe.service.interfaces.IHfpmProgramSV;

@Service("iHfpmProgramSV")
public class HfpmProgramSVImpl  implements IHfpmProgramSV {

	@Resource
	private HfpmProgramMapper hfpmProgramMapper;
  
    /**
    * 创建项目
    * @param hfpmProgram
    * @return
    * @throws Exception
    */
    public int create(HfpmProgram hfpmProgram) throws Exception {
        return hfpmProgramMapper.insertSelective(hfpmProgram);
    }

    /**
    * 批量维护项目
    * @param hfpmPrograms
    * @return
    * @throws Exception
    */
    public int batchOperate(HfpmProgram[] hfpmPrograms) throws  Exception{
        int result = 0;
        if(hfpmPrograms != null) {
            for (HfpmProgram hfpmProgram : hfpmPrograms) {
                if(hfpmProgram.getHfpmProgramId() == null) {
                    result += this.create(hfpmProgram);
                }else {
                    result += this.update(hfpmProgram);
                }
            }
        }
        return result;
    }

    /**
    * 更新项目
    * @param hfpmProgram
    * @return
    * @throws Exception
    */
    public int update(HfpmProgram hfpmProgram) throws  Exception {
        return hfpmProgramMapper.updateByPrimaryKeySelective(hfpmProgram);
    }

    /**
    * 通过查询对象更新项目
    * @param hfpmProgram
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfpmProgram hfpmProgram, HfpmProgram_Example example) throws  Exception {
        return hfpmProgramMapper.updateByExampleSelective(hfpmProgram, example);
    }

    /**
    * 删除项目
    * @param hfpmProgram
    * @return
    * @throws Exception
    */
    public int delete(HfpmProgram hfpmProgram) throws  Exception {
        return hfpmProgramMapper.deleteByPrimaryKey(hfpmProgram.getHfpmProgramId());
    }

    /**
    * 删除项目
    * @param hfpmProgramId
    * @return
    * @throws Exception
    */
    public int delete(long hfpmProgramId) throws  Exception {
        return hfpmProgramMapper.deleteByPrimaryKey(hfpmProgramId);
    }

    /**
    * 查找所有项目
    * @return
    */
    public List<HfpmProgram> getHfpmProgramAll()  throws  Exception {
        return hfpmProgramMapper.selectByExample(new HfpmProgram_Example());
    }

    /**
    * 通过项目ID查询项目
    * @param hfpmProgramId
    * @return
    * @throws Exception
    */
    public HfpmProgram getHfpmProgramByPK(long hfpmProgramId)  throws  Exception {
        return hfpmProgramMapper.selectByPrimaryKey(hfpmProgramId);
    }

    /**
    * 通过MAP参数查询项目
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfpmProgram> getHfpmProgramListByParam(Map<String, Object> params)  throws  Exception {
        return null;
    }



    /**
    * 通过查询对象查询项目
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfpmProgram> getHfpmProgramListByExample(HfpmProgram_Example example) throws  Exception {
        return hfpmProgramMapper.selectByExample(example);
    }

    /**
    * 通过MAP参数查询项目数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfpmProgramCountByParam(Map<String, Object> params)  throws  Exception {
        return 0;
    }

    /**
    * 通过查询对象查询项目数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfpmProgramCountByExample(HfpmProgram_Example example) throws  Exception {
        return hfpmProgramMapper.countByExample(example);
    }


  	//getter
 	
	public HfpmProgramMapper getHfpmProgramMapper(){
		return hfpmProgramMapper;
	}
	//setter
	public void setHfpmProgramMapper(HfpmProgramMapper hfpmProgramMapper){
    	this.hfpmProgramMapper = hfpmProgramMapper;
    }
}
