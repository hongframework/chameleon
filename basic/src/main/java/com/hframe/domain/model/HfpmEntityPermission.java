package com.hframe.domain.model;

import java.util.Date;

public class HfpmEntityPermission {
    private Long hfpmEntityPermissionId;

    private Long hfmdEntityId;

    private Long hfmdEntityAttrId;

    private Integer valueType;

    private String value;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfpmEntityPermission(Long hfpmEntityPermissionId, Long hfmdEntityId, Long hfmdEntityAttrId, Integer valueType, String value, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfpmEntityPermissionId = hfpmEntityPermissionId;
        this.hfmdEntityId = hfmdEntityId;
        this.hfmdEntityAttrId = hfmdEntityAttrId;
        this.valueType = valueType;
        this.value = value;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfpmEntityPermissionId() {
        return hfpmEntityPermissionId;
    }

    public Long getHfmdEntityId() {
        return hfmdEntityId;
    }

    public Long getHfmdEntityAttrId() {
        return hfmdEntityAttrId;
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

    public void setHfpmEntityPermissionId(Long hfpmEntityPermissionId) {
        this.hfpmEntityPermissionId=hfpmEntityPermissionId;
    }

    public void setHfmdEntityId(Long hfmdEntityId) {
        this.hfmdEntityId=hfmdEntityId;
    }

    public void setHfmdEntityAttrId(Long hfmdEntityAttrId) {
        this.hfmdEntityAttrId=hfmdEntityAttrId;
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

    public HfpmEntityPermission() {
        super();
    }
}