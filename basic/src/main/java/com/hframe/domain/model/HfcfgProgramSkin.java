package com.hframe.domain.model;

import java.util.Date;

public class HfcfgProgramSkin {
    private Long hfcfgProgramSkinId;

    private String programSkinName;

    private String programSkinCode;

    private String snapshotUrl;

    private Long programTemplateId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfcfgProgramSkin(Long hfcfgProgramSkinId, String programSkinName, String programSkinCode, String snapshotUrl, Long programTemplateId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfcfgProgramSkinId = hfcfgProgramSkinId;
        this.programSkinName = programSkinName;
        this.programSkinCode = programSkinCode;
        this.snapshotUrl = snapshotUrl;
        this.programTemplateId = programTemplateId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfcfgProgramSkinId() {
        return hfcfgProgramSkinId;
    }

    public String getProgramSkinName() {
        return programSkinName;
    }

    public String getProgramSkinCode() {
        return programSkinCode;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public Long getProgramTemplateId() {
        return programTemplateId;
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

    public void setHfcfgProgramSkinId(Long hfcfgProgramSkinId) {
        this.hfcfgProgramSkinId=hfcfgProgramSkinId;
    }

    public void setProgramSkinName(String programSkinName) {
        this.programSkinName=programSkinName;
    }

    public void setProgramSkinCode(String programSkinCode) {
        this.programSkinCode=programSkinCode;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl=snapshotUrl;
    }

    public void setProgramTemplateId(Long programTemplateId) {
        this.programTemplateId=programTemplateId;
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

    public HfcfgProgramSkin() {
        super();
    }
}