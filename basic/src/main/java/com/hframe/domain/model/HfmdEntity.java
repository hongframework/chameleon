package com.hframe.domain.model;

import java.util.Date;

public class HfmdEntity {
    private Long hfmdEntityId;

    private String hfmdEntityName;

    private String hfmdEntityCode;

    private Integer hfmdEntityType;

    private String hfmdEntityDesc;

    private Long hfpmProgramId;

    private Long hfpmModuleId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfmdEntity(Long hfmdEntityId, String hfmdEntityName, String hfmdEntityCode, Integer hfmdEntityType, String hfmdEntityDesc, Long hfpmProgramId, Long hfpmModuleId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfmdEntityId = hfmdEntityId;
        this.hfmdEntityName = hfmdEntityName;
        this.hfmdEntityCode = hfmdEntityCode;
        this.hfmdEntityType = hfmdEntityType;
        this.hfmdEntityDesc = hfmdEntityDesc;
        this.hfpmProgramId = hfpmProgramId;
        this.hfpmModuleId = hfpmModuleId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfmdEntityId() {
        return hfmdEntityId;
    }

    public String getHfmdEntityName() {
        return hfmdEntityName;
    }

    public String getHfmdEntityCode() {
        return hfmdEntityCode;
    }

    public Integer getHfmdEntityType() {
        return hfmdEntityType;
    }

    public String getHfmdEntityDesc() {
        return hfmdEntityDesc;
    }

    public Long getHfpmProgramId() {
        return hfpmProgramId;
    }

    public Long getHfpmModuleId() {
        return hfpmModuleId;
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

    public void setHfmdEntityId(Long hfmdEntityId) {
        this.hfmdEntityId=hfmdEntityId;
    }

    public void setHfmdEntityName(String hfmdEntityName) {
        this.hfmdEntityName=hfmdEntityName;
    }

    public void setHfmdEntityCode(String hfmdEntityCode) {
        this.hfmdEntityCode=hfmdEntityCode;
    }

    public void setHfmdEntityType(Integer hfmdEntityType) {
        this.hfmdEntityType=hfmdEntityType;
    }

    public void setHfmdEntityDesc(String hfmdEntityDesc) {
        this.hfmdEntityDesc=hfmdEntityDesc;
    }

    public void setHfpmProgramId(Long hfpmProgramId) {
        this.hfpmProgramId=hfpmProgramId;
    }

    public void setHfpmModuleId(Long hfpmModuleId) {
        this.hfpmModuleId=hfpmModuleId;
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

    public HfmdEntity() {
        super();
    }
}