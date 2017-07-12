package com.hframe.domain.model;

import java.util.Date;

public class HfusProgramEntityAttr {
    private Long hfusProgramEntityAttrId;

    private Long hfpmProgramId;

    private Long hfmdEntityId;

    private Long hfmdEntityAttrId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfusProgramEntityAttr(Long hfusProgramEntityAttrId, Long hfpmProgramId, Long hfmdEntityId, Long hfmdEntityAttrId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfusProgramEntityAttrId = hfusProgramEntityAttrId;
        this.hfpmProgramId = hfpmProgramId;
        this.hfmdEntityId = hfmdEntityId;
        this.hfmdEntityAttrId = hfmdEntityAttrId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfusProgramEntityAttrId() {
        return hfusProgramEntityAttrId;
    }

    public Long getHfpmProgramId() {
        return hfpmProgramId;
    }

    public Long getHfmdEntityId() {
        return hfmdEntityId;
    }

    public Long getHfmdEntityAttrId() {
        return hfmdEntityAttrId;
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

    public void setHfusProgramEntityAttrId(Long hfusProgramEntityAttrId) {
        this.hfusProgramEntityAttrId=hfusProgramEntityAttrId;
    }

    public void setHfpmProgramId(Long hfpmProgramId) {
        this.hfpmProgramId=hfpmProgramId;
    }

    public void setHfmdEntityId(Long hfmdEntityId) {
        this.hfmdEntityId=hfmdEntityId;
    }

    public void setHfmdEntityAttrId(Long hfmdEntityAttrId) {
        this.hfmdEntityAttrId=hfmdEntityAttrId;
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

    public HfusProgramEntityAttr() {
        super();
    }
}