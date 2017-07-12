package com.hframe.domain.model;

import java.util.Date;

public class HfpmPageEventAttr {
    private Long hfpmPageEventAttrId;

    private Long hfpmPageEventId;

    private Integer hfpmPageEventAttrType;

    private Long hfmdEntityAttrId;

    private Long hfmdEntityId;

    private Integer valueType;

    private String value;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfpmPageEventAttr(Long hfpmPageEventAttrId, Long hfpmPageEventId, Integer hfpmPageEventAttrType, Long hfmdEntityAttrId, Long hfmdEntityId, Integer valueType, String value, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfpmPageEventAttrId = hfpmPageEventAttrId;
        this.hfpmPageEventId = hfpmPageEventId;
        this.hfpmPageEventAttrType = hfpmPageEventAttrType;
        this.hfmdEntityAttrId = hfmdEntityAttrId;
        this.hfmdEntityId = hfmdEntityId;
        this.valueType = valueType;
        this.value = value;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfpmPageEventAttrId() {
        return hfpmPageEventAttrId;
    }

    public Long getHfpmPageEventId() {
        return hfpmPageEventId;
    }

    public Integer getHfpmPageEventAttrType() {
        return hfpmPageEventAttrType;
    }

    public Long getHfmdEntityAttrId() {
        return hfmdEntityAttrId;
    }

    public Long getHfmdEntityId() {
        return hfmdEntityId;
    }

    public Integer getValueType() {
        return valueType;
    }

    public String getValue() {
        return value;
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

    public void setHfpmPageEventAttrId(Long hfpmPageEventAttrId) {
        this.hfpmPageEventAttrId=hfpmPageEventAttrId;
    }

    public void setHfpmPageEventId(Long hfpmPageEventId) {
        this.hfpmPageEventId=hfpmPageEventId;
    }

    public void setHfpmPageEventAttrType(Integer hfpmPageEventAttrType) {
        this.hfpmPageEventAttrType=hfpmPageEventAttrType;
    }

    public void setHfmdEntityAttrId(Long hfmdEntityAttrId) {
        this.hfmdEntityAttrId=hfmdEntityAttrId;
    }

    public void setHfmdEntityId(Long hfmdEntityId) {
        this.hfmdEntityId=hfmdEntityId;
    }

    public void setValueType(Integer valueType) {
        this.valueType=valueType;
    }

    public void setValue(String value) {
        this.value=value;
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

    public HfpmPageEventAttr() {
        super();
    }
}