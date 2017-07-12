package com.hframe.domain.model;

import java.util.Date;

public class HfusEntityTypeRelatEntityAttr {
    private Long hfusEntityTypeRelatEntityAttrId;

    private Integer entityType;

    private Long hfusEntityAttrId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfusEntityTypeRelatEntityAttr(Long hfusEntityTypeRelatEntityAttrId, Integer entityType, Long hfusEntityAttrId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfusEntityTypeRelatEntityAttrId = hfusEntityTypeRelatEntityAttrId;
        this.entityType = entityType;
        this.hfusEntityAttrId = hfusEntityAttrId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfusEntityTypeRelatEntityAttrId() {
        return hfusEntityTypeRelatEntityAttrId;
    }

    public Integer getEntityType() {
        return entityType;
    }

    public Long getHfusEntityAttrId() {
        return hfusEntityAttrId;
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

    public void setHfusEntityTypeRelatEntityAttrId(Long hfusEntityTypeRelatEntityAttrId) {
        this.hfusEntityTypeRelatEntityAttrId=hfusEntityTypeRelatEntityAttrId;
    }

    public void setEntityType(Integer entityType) {
        this.entityType=entityType;
    }

    public void setHfusEntityAttrId(Long hfusEntityAttrId) {
        this.hfusEntityAttrId=hfusEntityAttrId;
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

    public HfusEntityTypeRelatEntityAttr() {
        super();
    }
}