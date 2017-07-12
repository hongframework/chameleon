package com.hframe.domain.model;

import java.util.Date;

public class HfcfgComponentTemplate {
    private Long hfcfgComponentTemplateId;

    private Long creatorId;

    private String hfcfgComponentTemplateCode;

    private Long modifierId;

    private Byte hfcfgComponentTemplateType;

    private Date createTime;

    private String hfcfgComponentTemplateDesc;

    private Date modifyTime;

    private String hfcfgComponentTemplateName;

    public HfcfgComponentTemplate(Long hfcfgComponentTemplateId, Long creatorId, String hfcfgComponentTemplateCode, Long modifierId, Byte hfcfgComponentTemplateType, Date createTime, String hfcfgComponentTemplateDesc, Date modifyTime, String hfcfgComponentTemplateName) {
        this.hfcfgComponentTemplateId = hfcfgComponentTemplateId;
        this.creatorId = creatorId;
        this.hfcfgComponentTemplateCode = hfcfgComponentTemplateCode;
        this.modifierId = modifierId;
        this.hfcfgComponentTemplateType = hfcfgComponentTemplateType;
        this.createTime = createTime;
        this.hfcfgComponentTemplateDesc = hfcfgComponentTemplateDesc;
        this.modifyTime = modifyTime;
        this.hfcfgComponentTemplateName = hfcfgComponentTemplateName;
    }

    public Long getHfcfgComponentTemplateId() {
        return hfcfgComponentTemplateId;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public String getHfcfgComponentTemplateCode() {
        return hfcfgComponentTemplateCode;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public Byte getHfcfgComponentTemplateType() {
        return hfcfgComponentTemplateType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getHfcfgComponentTemplateDesc() {
        return hfcfgComponentTemplateDesc;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public String getHfcfgComponentTemplateName() {
        return hfcfgComponentTemplateName;
    }

    public void setHfcfgComponentTemplateId(Long hfcfgComponentTemplateId) {
        this.hfcfgComponentTemplateId=hfcfgComponentTemplateId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId=creatorId;
    }

    public void setHfcfgComponentTemplateCode(String hfcfgComponentTemplateCode) {
        this.hfcfgComponentTemplateCode=hfcfgComponentTemplateCode;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId=modifierId;
    }

    public void setHfcfgComponentTemplateType(Byte hfcfgComponentTemplateType) {
        this.hfcfgComponentTemplateType=hfcfgComponentTemplateType;
    }

    public void setCreateTime(Date createTime) {
        this.createTime=createTime;
    }

    public void setHfcfgComponentTemplateDesc(String hfcfgComponentTemplateDesc) {
        this.hfcfgComponentTemplateDesc=hfcfgComponentTemplateDesc;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime=modifyTime;
    }

    public void setHfcfgComponentTemplateName(String hfcfgComponentTemplateName) {
        this.hfcfgComponentTemplateName=hfcfgComponentTemplateName;
    }

    public HfcfgComponentTemplate() {
        super();
    }
}