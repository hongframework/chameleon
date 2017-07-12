package com.hframe.domain.model;

import java.util.Date;

public class HfpmProgramCfg {
    private Long hfpmProgramCfgId;

    private String showName;

    private Long hfcfgProgramTemplateId;

    private Long hfcfgProgramSkinId;

    private Long hfcfgLoginPageId;

    private String bgImgUrl;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    private Long hfcfgDbConnectId;

    private Long hfpmProgramId;

    private String dataEntityName;

    private String dictionarys;

    private String funcAuthPath;

    private String funcEntityName;

    private String userAuthPath;

    private String userEntityName;

    private Long superAuthFilterEntity;

    private Long superAuthFilterField;

    private String superAuthFilterFieldValue;

    private String userLoginDataSet;

    public HfpmProgramCfg(Long hfpmProgramCfgId, String showName, Long hfcfgProgramTemplateId, Long hfcfgProgramSkinId, Long hfcfgLoginPageId, String bgImgUrl, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag, Long hfcfgDbConnectId, Long hfpmProgramId, String dataEntityName, String dictionarys, String funcAuthPath, String funcEntityName, String userAuthPath, String userEntityName, Long superAuthFilterEntity, Long superAuthFilterField, String superAuthFilterFieldValue, String userLoginDataSet) {
        this.hfpmProgramCfgId = hfpmProgramCfgId;
        this.showName = showName;
        this.hfcfgProgramTemplateId = hfcfgProgramTemplateId;
        this.hfcfgProgramSkinId = hfcfgProgramSkinId;
        this.hfcfgLoginPageId = hfcfgLoginPageId;
        this.bgImgUrl = bgImgUrl;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
        this.hfcfgDbConnectId = hfcfgDbConnectId;
        this.hfpmProgramId = hfpmProgramId;
        this.dataEntityName = dataEntityName;
        this.dictionarys = dictionarys;
        this.funcAuthPath = funcAuthPath;
        this.funcEntityName = funcEntityName;
        this.userAuthPath = userAuthPath;
        this.userEntityName = userEntityName;
        this.superAuthFilterEntity = superAuthFilterEntity;
        this.superAuthFilterField = superAuthFilterField;
        this.superAuthFilterFieldValue = superAuthFilterFieldValue;
        this.userLoginDataSet = userLoginDataSet;
    }

    public Long getHfpmProgramCfgId() {
        return hfpmProgramCfgId;
    }

    public String getShowName() {
        return showName;
    }

    public Long getHfcfgProgramTemplateId() {
        return hfcfgProgramTemplateId;
    }

    public Long getHfcfgProgramSkinId() {
        return hfcfgProgramSkinId;
    }

    public Long getHfcfgLoginPageId() {
        return hfcfgLoginPageId;
    }

    public String getBgImgUrl() {
        return bgImgUrl;
    }

    public Long getOpId() {
        return opId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Long getModifyOpId() {
        return modifyOpId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public Long getHfcfgDbConnectId() {
        return hfcfgDbConnectId;
    }

    public Long getHfpmProgramId() {
        return hfpmProgramId;
    }

    public String getDataEntityName() {
        return dataEntityName;
    }

    public String getDictionarys() {
        return dictionarys;
    }

    public String getFuncAuthPath() {
        return funcAuthPath;
    }

    public String getFuncEntityName() {
        return funcEntityName;
    }

    public String getUserAuthPath() {
        return userAuthPath;
    }

    public String getUserEntityName() {
        return userEntityName;
    }

    public Long getSuperAuthFilterEntity() {
        return superAuthFilterEntity;
    }

    public Long getSuperAuthFilterField() {
        return superAuthFilterField;
    }

    public String getSuperAuthFilterFieldValue() {
        return superAuthFilterFieldValue;
    }

    public String getUserLoginDataSet() {
        return userLoginDataSet;
    }

    public void setHfpmProgramCfgId(Long hfpmProgramCfgId) {
        this.hfpmProgramCfgId=hfpmProgramCfgId;
    }

    public void setShowName(String showName) {
        this.showName=showName;
    }

    public void setHfcfgProgramTemplateId(Long hfcfgProgramTemplateId) {
        this.hfcfgProgramTemplateId=hfcfgProgramTemplateId;
    }

    public void setHfcfgProgramSkinId(Long hfcfgProgramSkinId) {
        this.hfcfgProgramSkinId=hfcfgProgramSkinId;
    }

    public void setHfcfgLoginPageId(Long hfcfgLoginPageId) {
        this.hfcfgLoginPageId=hfcfgLoginPageId;
    }

    public void setBgImgUrl(String bgImgUrl) {
        this.bgImgUrl=bgImgUrl;
    }

    public void setOpId(Long opId) {
        this.opId=opId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime=createTime;
    }

    public void setModifyOpId(Long modifyOpId) {
        this.modifyOpId=modifyOpId;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime=modifyTime;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag=delFlag;
    }

    public void setHfcfgDbConnectId(Long hfcfgDbConnectId) {
        this.hfcfgDbConnectId=hfcfgDbConnectId;
    }

    public void setHfpmProgramId(Long hfpmProgramId) {
        this.hfpmProgramId=hfpmProgramId;
    }

    public void setDataEntityName(String dataEntityName) {
        this.dataEntityName=dataEntityName;
    }

    public void setDictionarys(String dictionarys) {
        this.dictionarys=dictionarys;
    }

    public void setFuncAuthPath(String funcAuthPath) {
        this.funcAuthPath=funcAuthPath;
    }

    public void setFuncEntityName(String funcEntityName) {
        this.funcEntityName=funcEntityName;
    }

    public void setUserAuthPath(String userAuthPath) {
        this.userAuthPath=userAuthPath;
    }

    public void setUserEntityName(String userEntityName) {
        this.userEntityName=userEntityName;
    }

    public void setSuperAuthFilterEntity(Long superAuthFilterEntity) {
        this.superAuthFilterEntity=superAuthFilterEntity;
    }

    public void setSuperAuthFilterField(Long superAuthFilterField) {
        this.superAuthFilterField=superAuthFilterField;
    }

    public void setSuperAuthFilterFieldValue(String superAuthFilterFieldValue) {
        this.superAuthFilterFieldValue=superAuthFilterFieldValue;
    }

    public void setUserLoginDataSet(String userLoginDataSet) {
        this.userLoginDataSet=userLoginDataSet;
    }

    public HfpmProgramCfg() {
        super();
    }
}