package com.hframe.domain.model;

import java.util.Date;

public class HfusWordStore {
    private Long hfusWordStoreId;

    private String chineseChars;

    private String englishName;

    private String englishShortName;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfusWordStore(Long hfusWordStoreId, String chineseChars, String englishName, String englishShortName, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfusWordStoreId = hfusWordStoreId;
        this.chineseChars = chineseChars;
        this.englishName = englishName;
        this.englishShortName = englishShortName;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfusWordStoreId() {
        return hfusWordStoreId;
    }

    public String getChineseChars() {
        return chineseChars;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getEnglishShortName() {
        return englishShortName;
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

    public void setHfusWordStoreId(Long hfusWordStoreId) {
        this.hfusWordStoreId=hfusWordStoreId;
    }

    public void setChineseChars(String chineseChars) {
        this.chineseChars=chineseChars;
    }

    public void setEnglishName(String englishName) {
        this.englishName=englishName;
    }

    public void setEnglishShortName(String englishShortName) {
        this.englishShortName=englishShortName;
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

    public HfusWordStore() {
        super();
    }
}