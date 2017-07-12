package com.hframe.service.interfaces;

import java.util.*;
import com.hframe.domain.model.HfcfgProgramSkin;
import com.hframe.domain.model.HfcfgProgramSkin_Example;


public interface IHfcfgProgramSkinSV   {

  
    /**
    * 创建皮肤
    * @param hfcfgProgramSkin
    * @return
    * @throws Exception
    */
    public int create(HfcfgProgramSkin hfcfgProgramSkin) throws  Exception;

    /**
    * 批量维护皮肤
    * @param hfcfgProgramSkins
    * @return
    * @throws Exception
    */
    public int batchOperate(HfcfgProgramSkin[] hfcfgProgramSkins) throws  Exception;
    /**
    * 更新皮肤
    * @param hfcfgProgramSkin
    * @return
    * @throws Exception
    */
    public int update(HfcfgProgramSkin hfcfgProgramSkin) throws  Exception;

    /**
    * 通过查询对象更新皮肤
    * @param hfcfgProgramSkin
    * @param example
    * @return
    * @throws Exception
    */
    public int updateByExample(HfcfgProgramSkin hfcfgProgramSkin, HfcfgProgramSkin_Example example) throws  Exception;

    /**
    * 删除皮肤
    * @param hfcfgProgramSkin
    * @return
    * @throws Exception
    */
    public int delete(HfcfgProgramSkin hfcfgProgramSkin) throws  Exception;


    /**
    * 删除皮肤
    * @param hfcfgProgramSkinId
    * @return
    * @throws Exception
    */
    public int delete(long hfcfgProgramSkinId) throws  Exception;


    /**
    * 查找所有皮肤
    * @return
    */
    public List<HfcfgProgramSkin> getHfcfgProgramSkinAll()  throws  Exception;

    /**
    * 通过皮肤ID查询皮肤
    * @param hfcfgProgramSkinId
    * @return
    * @throws Exception
    */
    public HfcfgProgramSkin getHfcfgProgramSkinByPK(long hfcfgProgramSkinId)  throws  Exception;

    /**
    * 通过MAP参数查询皮肤
    * @param params
    * @return
    * @throws Exception
    */
    public List<HfcfgProgramSkin> getHfcfgProgramSkinListByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询皮肤
    * @param example
    * @return
    * @throws Exception
    */
    public List<HfcfgProgramSkin> getHfcfgProgramSkinListByExample(HfcfgProgramSkin_Example example) throws  Exception;

    /**
    * 通过MAP参数查询皮肤数量
    * @param params
    * @return
    * @throws Exception
    */
    public int getHfcfgProgramSkinCountByParam(Map<String, Object> params)  throws  Exception;


    /**
    * 通过查询对象查询皮肤数量
    * @param example
    * @return
    * @throws Exception
    */
    public int getHfcfgProgramSkinCountByExample(HfcfgProgramSkin_Example example) throws  Exception;


 }
