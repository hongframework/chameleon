package com.hframe.domain.model;

import java.util.Date;

public class HfcfgPageTemplate {
    private Long hfcfgPageTemplateId;

    private Integer hfcfgPageTemplateType;

    private String hfcfgPageTemplateName;

    private String hfcfgPageTemplateCode;

    private String hfcfgPageTemplateDesc;

    private String templateUrl;

    private String snapshotUrl;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfcfgPageTemplate(Long hfcfgPageTemplateId, Integer hfcfgPageTemplateType, String hfcfgPageTemplateName, String hfcfgPageTemplateCode, String hfcfgPageTemplateDesc, String templateUrl, String snapshotUrl, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfcfgPageTemplateId = hfcfgPageTemplateId;
        this.hfcfgPageTemplateType = hfcfgPageTemplateType;
        this.hfcfgPageTemplateName = hfcfgPageTemplateName;
        this.hfcfgPageTemplateCode = hfcfgPageTemplateCode;
        this.hfcfgPageTemplateDesc = hfcfgPageTemplateDesc;
        this.templateUrl = templateUrl;
        this.snapshotUrl = snapshotUrl;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfcfgPageTemplateId() {
        return hfcfgPageTemplateId;
    }

    public Integer getHfcfgPageTemplateType() {
        return hfcfgPageTemplateType;
    }

    public String getHfcfgPageTemplateName() {
        return hfcfgPageTemplateName;
    }

    public String getHfcfgPageTemplateCode() {
        return hfcfgPageTemplateCode;
    }

    public String getHfcfgPageTemplateDesc() {
        return hfcfgPageTemplateDesc;
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

    public void setHfcfgPageTemplateId(Long hfcfgPageTemplateId) {
        this.hfcfgPageTemplateId=hfcfgPageTemplateId;
    }

    public void setHfcfgPageTemplateType(Integer hfcfgPageTemplateType) {
        this.hfcfgPageTemplateType=hfcfgPageTemplateType;
    }

    public void setHfcfgPageTemplateName(String hfcfgPageTemplateName) {
        this.hfcfgPageTemplateName=hfcfgPageTemplateName;
    }

    public void setHfcfgPageTemplateCode(String hfcfgPageTemplateCode) {
        this.hfcfgPageTemplateCode=hfcfgPageTemplateCode;
    }

    public void setHfcfgPageTemplateDesc(String hfcfgPageTemplateDesc) {
        this.hfcfgPageTemplateDesc=hfcfgPageTemplateDesc;
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

    public HfcfgPageTemplate() {
        super();
    }
}