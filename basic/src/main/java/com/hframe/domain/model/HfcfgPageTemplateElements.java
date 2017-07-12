package com.hframe.domain.model;

import java.util.Date;

public class HfcfgPageTemplateElements {
    private Long hfcfgPageTemplateElementsId;

    private Long hfcfgPageTemplateId;

    private Date modifyTime;

    private Byte hfcfgPageTemplateElementsType;

    private Long modifierId;

    private Date createTime;

    private Long creatorId;

    private Byte eventExtend;

    private Long hfcfgComponentTemplateId;

    public HfcfgPageTemplateElements(Long hfcfgPageTemplateElementsId, Long hfcfgPageTemplateId, Date modifyTime, Byte hfcfgPageTemplateElementsType, Long modifierId, Date createTime, Long creatorId, Byte eventExtend, Long hfcfgComponentTemplateId) {
        this.hfcfgPageTemplateElementsId = hfcfgPageTemplateElementsId;
        this.hfcfgPageTemplateId = hfcfgPageTemplateId;
        this.modifyTime = modifyTime;
        this.hfcfgPageTemplateElementsType = hfcfgPageTemplateElementsType;
        this.modifierId = modifierId;
        this.createTime = createTime;
        this.creatorId = creatorId;
        this.eventExtend = eventExtend;
        this.hfcfgComponentTemplateId = hfcfgComponentTemplateId;
    }

    public Long getHfcfgPageTemplateElementsId() {
        return hfcfgPageTemplateElementsId;
    }

    public Long getHfcfgPageTemplateId() {
        return hfcfgPageTemplateId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public Byte getHfcfgPageTemplateElementsType() {
        return hfcfgPageTemplateElementsType;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public Byte getEventExtend() {
        return eventExtend;
    }

    public Long getHfcfgComponentTemplateId() {
        return hfcfgComponentTemplateId;
    }

    public void setHfcfgPageTemplateElementsId(Long hfcfgPageTemplateElementsId) {
        this.hfcfgPageTemplateElementsId=hfcfgPageTemplateElementsId;
    }

    public void setHfcfgPageTemplateId(Long hfcfgPageTemplateId) {
        this.hfcfgPageTemplateId=hfcfgPageTemplateId;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime=modifyTime;
    }

    public void setHfcfgPageTemplateElementsType(Byte hfcfgPageTemplateElementsType) {
        this.hfcfgPageTemplateElementsType=hfcfgPageTemplateElementsType;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId=modifierId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime=createTime;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId=creatorId;
    }

    public void setEventExtend(Byte eventExtend) {
        this.eventExtend=eventExtend;
    }

    public void setHfcfgComponentTemplateId(Long hfcfgComponentTemplateId) {
        this.hfcfgComponentTemplateId=hfcfgComponentTemplateId;
    }

    public HfcfgPageTemplateElements() {
        super();
    }
}