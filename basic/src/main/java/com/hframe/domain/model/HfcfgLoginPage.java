package com.hframe.domain.model;

import java.util.Date;

public class HfcfgLoginPage {
    private Long hfcfgLoginPageId;

    private String hfcfgLoginPageName;

    private String hfcfgLoginPageCode;

    private String snapshotUrl;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfcfgLoginPage(Long hfcfgLoginPageId, String hfcfgLoginPageName, String hfcfgLoginPageCode, String snapshotUrl, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfcfgLoginPageId = hfcfgLoginPageId;
        this.hfcfgLoginPageName = hfcfgLoginPageName;
        this.hfcfgLoginPageCode = hfcfgLoginPageCode;
        this.snapshotUrl = snapshotUrl;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfcfgLoginPageId() {
        return hfcfgLoginPageId;
    }

    public String getHfcfgLoginPageName() {
        return hfcfgLoginPageName;
    }

    public String getHfcfgLoginPageCode() {
        return hfcfgLoginPageCode;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
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

    public void setHfcfgLoginPageId(Long hfcfgLoginPageId) {
        this.hfcfgLoginPageId=hfcfgLoginPageId;
    }

    public void setHfcfgLoginPageName(String hfcfgLoginPageName) {
        this.hfcfgLoginPageName=hfcfgLoginPageName;
    }

    public void setHfcfgLoginPageCode(String hfcfgLoginPageCode) {
        this.hfcfgLoginPageCode=hfcfgLoginPageCode;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl=snapshotUrl;
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

    public HfcfgLoginPage() {
        super();
    }
}