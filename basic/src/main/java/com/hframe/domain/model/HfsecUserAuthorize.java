package com.hframe.domain.model;

import java.util.Date;

public class HfsecUserAuthorize {
    private Long hfsecUserAuthorizeId;

    private Long hfsecUserId;

    private Long hfsecOrganizeId;

    private Long hfsecRoleId;

    private Byte status;

    private Long creatorId;

    private Date createTime;

    private Long modifierId;

    private Date modifyTime;

    public HfsecUserAuthorize(Long hfsecUserAuthorizeId, Long hfsecUserId, Long hfsecOrganizeId, Long hfsecRoleId, Byte status, Long creatorId, Date createTime, Long modifierId, Date modifyTime) {
        this.hfsecUserAuthorizeId = hfsecUserAuthorizeId;
        this.hfsecUserId = hfsecUserId;
        this.hfsecOrganizeId = hfsecOrganizeId;
        this.hfsecRoleId = hfsecRoleId;
        this.status = status;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.modifierId = modifierId;
        this.modifyTime = modifyTime;
    }

    public Long getHfsecUserAuthorizeId() {
        return hfsecUserAuthorizeId;
    }

    public Long getHfsecUserId() {
        return hfsecUserId;
    }

    public Long getHfsecOrganizeId() {
        return hfsecOrganizeId;
    }

    public Long getHfsecRoleId() {
        return hfsecRoleId;
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

    public void setHfsecUserAuthorizeId(Long hfsecUserAuthorizeId) {
        this.hfsecUserAuthorizeId=hfsecUserAuthorizeId;
    }

    public void setHfsecUserId(Long hfsecUserId) {
        this.hfsecUserId=hfsecUserId;
    }

    public void setHfsecOrganizeId(Long hfsecOrganizeId) {
        this.hfsecOrganizeId=hfsecOrganizeId;
    }

    public void setHfsecRoleId(Long hfsecRoleId) {
        this.hfsecRoleId=hfsecRoleId;
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

    public HfsecUserAuthorize() {
        super();
    }
}