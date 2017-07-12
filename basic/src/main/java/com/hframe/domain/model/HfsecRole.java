package com.hframe.domain.model;

import java.util.Date;

public class HfsecRole {
    private Long hfsecRoleId;

    private String hfsecRoleCode;

    private String hfsecRoleName;

    private Byte hfsecRoleType;

    private Byte status;

    private Long creatorId;

    private Date createTime;

    private Long modifierId;

    private Date modifyTime;

    public HfsecRole(Long hfsecRoleId, String hfsecRoleCode, String hfsecRoleName, Byte hfsecRoleType, Byte status, Long creatorId, Date createTime, Long modifierId, Date modifyTime) {
        this.hfsecRoleId = hfsecRoleId;
        this.hfsecRoleCode = hfsecRoleCode;
        this.hfsecRoleName = hfsecRoleName;
        this.hfsecRoleType = hfsecRoleType;
        this.status = status;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.modifierId = modifierId;
        this.modifyTime = modifyTime;
    }

    public Long getHfsecRoleId() {
        return hfsecRoleId;
    }

    public String getHfsecRoleCode() {
        return hfsecRoleCode;
    }

    public String getHfsecRoleName() {
        return hfsecRoleName;
    }

    public Byte getHfsecRoleType() {
        return hfsecRoleType;
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

    public void setHfsecRoleId(Long hfsecRoleId) {
        this.hfsecRoleId=hfsecRoleId;
    }

    public void setHfsecRoleCode(String hfsecRoleCode) {
        this.hfsecRoleCode=hfsecRoleCode;
    }

    public void setHfsecRoleName(String hfsecRoleName) {
        this.hfsecRoleName=hfsecRoleName;
    }

    public void setHfsecRoleType(Byte hfsecRoleType) {
        this.hfsecRoleType=hfsecRoleType;
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

    public HfsecRole() {
        super();
    }
}