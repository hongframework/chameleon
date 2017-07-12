package com.hframe.domain.model;

import java.util.Date;

public class HfpmPageEntityRel {
    private Long hfpmPageEntityRelId;

    private Long hfpmPageId;

    private Long hfmdEntityId;

    private Integer isMainEntity;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfpmPageEntityRel(Long hfpmPageEntityRelId, Long hfpmPageId, Long hfmdEntityId, Integer isMainEntity, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfpmPageEntityRelId = hfpmPageEntityRelId;
        this.hfpmPageId = hfpmPageId;
        this.hfmdEntityId = hfmdEntityId;
        this.isMainEntity = isMainEntity;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfpmPageEntityRelId() {
        return hfpmPageEntityRelId;
    }

    public Long getHfpmPageId() {
        return hfpmPageId;
    }

    public Long getHfmdEntityId() {
        return hfmdEntityId;
    }

    public Integer getIsMainEntity() {
        return isMainEntity;
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

    public void setHfpmPageEntityRelId(Long hfpmPageEntityRelId) {
        this.hfpmPageEntityRelId=hfpmPageEntityRelId;
    }

    public void setHfpmPageId(Long hfpmPageId) {
        this.hfpmPageId=hfpmPageId;
    }

    public void setHfmdEntityId(Long hfmdEntityId) {
        this.hfmdEntityId=hfmdEntityId;
    }

    public void setIsMainEntity(Integer isMainEntity) {
        this.isMainEntity=isMainEntity;
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

    public HfpmPageEntityRel() {
        super();
    }
}