package com.hframe.domain.model;

import java.util.Date;

public class HfusEntityStore {
    private Long hfusEntityStoreId;

    private String hfusEntityStoreName;

    private String hfusEntityStoreCode;

    private Byte entityGroup;

    private Byte hfusEntityStoreType;

    private Long creatorId;

    private Date createTime;

    private Long modifierId;

    private Date modifyTime;

    private String sqlContent;

    public HfusEntityStore(Long hfusEntityStoreId, String hfusEntityStoreName, String hfusEntityStoreCode, Byte entityGroup, Byte hfusEntityStoreType, Long creatorId, Date createTime, Long modifierId, Date modifyTime, String sqlContent) {
        this.hfusEntityStoreId = hfusEntityStoreId;
        this.hfusEntityStoreName = hfusEntityStoreName;
        this.hfusEntityStoreCode = hfusEntityStoreCode;
        this.entityGroup = entityGroup;
        this.hfusEntityStoreType = hfusEntityStoreType;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.modifierId = modifierId;
        this.modifyTime = modifyTime;
        this.sqlContent = sqlContent;
    }

    public Long getHfusEntityStoreId() {
        return hfusEntityStoreId;
    }

    public String getHfusEntityStoreName() {
        return hfusEntityStoreName;
    }

    public String getHfusEntityStoreCode() {
        return hfusEntityStoreCode;
    }

    public Byte getEntityGroup() {
        return entityGroup;
    }

    public Byte getHfusEntityStoreType() {
        return hfusEntityStoreType;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public String getSqlContent() {
        return sqlContent;
    }

    public void setHfusEntityStoreId(Long hfusEntityStoreId) {
        this.hfusEntityStoreId=hfusEntityStoreId;
    }

    public void setHfusEntityStoreName(String hfusEntityStoreName) {
        this.hfusEntityStoreName=hfusEntityStoreName;
    }

    public void setHfusEntityStoreCode(String hfusEntityStoreCode) {
        this.hfusEntityStoreCode=hfusEntityStoreCode;
    }

    public void setEntityGroup(Byte entityGroup) {
        this.entityGroup=entityGroup;
    }

    public void setHfusEntityStoreType(Byte hfusEntityStoreType) {
        this.hfusEntityStoreType=hfusEntityStoreType;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId=creatorId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime=createTime;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId=modifierId;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime=modifyTime;
    }

    public void setSqlContent(String sqlContent) {
        this.sqlContent=sqlContent;
    }

    public HfusEntityStore() {
        super();
    }
}