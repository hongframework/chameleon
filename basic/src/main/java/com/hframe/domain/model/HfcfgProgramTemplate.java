package com.hframe.domain.model;

import java.util.Date;

public class HfcfgProgramTemplate {
    private Long hfcfgProgramTemplateId;

    private String programTemplateName;

    private String programTemplateCode;

    private String programTemplateDesc;

    private String templateUrl;

    private String snapshotUrl;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfcfgProgramTemplate(Long hfcfgProgramTemplateId, String programTemplateName, String programTemplateCode, String programTemplateDesc, String templateUrl, String snapshotUrl, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfcfgProgramTemplateId = hfcfgProgramTemplateId;
        this.programTemplateName = programTemplateName;
        this.programTemplateCode = programTemplateCode;
        this.programTemplateDesc = programTemplateDesc;
        this.templateUrl = templateUrl;
        this.snapshotUrl = snapshotUrl;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfcfgProgramTemplateId() {
        return hfcfgProgramTemplateId;
    }

    public String getProgramTemplateName() {
        return programTemplateName;
    }

    public String getProgramTemplateCode() {
        return programTemplateCode;
    }

    public String getProgramTemplateDesc() {
        return programTemplateDesc;
    }

    public String getTemplateUrl() {
        return templateUrl;
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

    public void setHfcfgProgramTemplateId(Long hfcfgProgramTemplateId) {
        this.hfcfgProgramTemplateId=hfcfgProgramTemplateId;
    }

    public void setProgramTemplateName(String programTemplateName) {
        this.programTemplateName=programTemplateName;
    }

    public void setProgramTemplateCode(String programTemplateCode) {
        this.programTemplateCode=programTemplateCode;
    }

    public void setProgramTemplateDesc(String programTemplateDesc) {
        this.programTemplateDesc=programTemplateDesc;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl=templateUrl;
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

    public HfcfgProgramTemplate() {
        super();
    }
}