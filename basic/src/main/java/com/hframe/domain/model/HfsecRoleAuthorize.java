package com.hframe.domain.model;

import java.util.Date;

public class HfsecRoleAuthorize {
    private Long hfsecRoleAuthorizeId;

    private Byte hfsecRoleAuthorizeType;

    private Long hfsecRoleId;

    private Long hfsecMenuId;

    private Byte status;

    private Long creatorId;

    private Date createTime;

    private Long modifierId;

    private Date modifyTime;

    private String operateEventList;

    public HfsecRoleAuthorize(Long hfsecRoleAuthorizeId, Byte hfsecRoleAuthorizeType, Long hfsecRoleId, Long hfsecMenuId, Byte status, Long creatorId, Date createTime, Long modifierId, Date modifyTime, String operateEventList) {
        this.hfsecRoleAuthorizeId = hfsecRoleAuthorizeId;
        this.hfsecRoleAuthorizeType = hfsecRoleAuthorizeType;
        this.hfsecRoleId = hfsecRoleId;
        this.hfsecMenuId = hfsecMenuId;
        this.status = status;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.modifierId = modifierId;
        this.modifyTime = modifyTime;
        this.operateEventList = operateEventList;
    }

    public Long getHfsecRoleAuthorizeId() {
        return hfsecRoleAuthorizeId;
    }

    public Byte getHfsecRoleAuthorizeType() {
        return hfsecRoleAuthorizeType;
    }

    public Long getHfsecRoleId() {
        return hfsecRoleId;
    }

    public Long getHfsecMenuId() {
        return hfsecMenuId;
    }

    public Byte getStatus() {
        return status;
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

    public String getOperateEventList() {
        return operateEventList;
    }

    public void setHfsecRoleAuthorizeId(Long hfsecRoleAuthorizeId) {
        this.hfsecRoleAuthorizeId=hfsecRoleAuthorizeId;
    }

    public void setHfsecRoleAuthorizeType(Byte hfsecRoleAuthorizeType) {
        this.hfsecRoleAuthorizeType=hfsecRoleAuthorizeType;
    }

    public void setHfsecRoleId(Long hfsecRoleId) {
        this.hfsecRoleId=hfsecRoleId;
    }

    public void setHfsecMenuId(Long hfsecMenuId) {
        this.hfsecMenuId=hfsecMenuId;
    }

    public void setStatus(Byte status) {
        this.status=status;
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

    public void setOperateEventList(String operateEventList) {
        this.operateEventList=operateEventList;
    }

    public HfsecRoleAuthorize() {
        super();
    }
}