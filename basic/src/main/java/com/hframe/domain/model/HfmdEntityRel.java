package com.hframe.domain.model;

import java.util.Date;

public class HfmdEntityRel {
    private Long hfmdEntityRelId;

    private Long hfmdEntityId;

    private Integer hfmdEntityRelType;

    private Integer hfmdEntityRelLevel;

    private String hfmdEntityRelDesc;

    private Long relHfmdEntityId;

    private Long relEntityAttrId;

    private Long hfpmProgramId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfmdEntityRel(Long hfmdEntityRelId, Long hfmdEntityId, Integer hfmdEntityRelType, Integer hfmdEntityRelLevel, String hfmdEntityRelDesc, Long relHfmdEntityId, Long relEntityAttrId, Long hfpmProgramId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfmdEntityRelId = hfmdEntityRelId;
        this.hfmdEntityId = hfmdEntityId;
        this.hfmdEntityRelType = hfmdEntityRelType;
        this.hfmdEntityRelLevel = hfmdEntityRelLevel;
        this.hfmdEntityRelDesc = hfmdEntityRelDesc;
        this.relHfmdEntityId = relHfmdEntityId;
        this.relEntityAttrId = relEntityAttrId;
        this.hfpmProgramId = hfpmProgramId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfmdEntityRelId() {
        return hfmdEntityRelId;
    }

    public Long getHfmdEntityId() {
        return hfmdEntityId;
    }

    public Integer getHfmdEntityRelType() {
        return hfmdEntityRelType;
    }

    public Integer getHfmdEntityRelLevel() {
        return hfmdEntityRelLevel;
    }

    public String getHfmdEntityRelDesc() {
        return hfmdEntityRelDesc;
    }

    public Long getRelHfmdEntityId() {
        return relHfmdEntityId;
    }

    public Long getRelEntityAttrId() {
        return relEntityAttrId;
    }

    public Long getHfpmProgramId() {
        return hfpmProgramId;
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

    public void setHfmdEntityRelId(Long hfmdEntityRelId) {
        this.hfmdEntityRelId=hfmdEntityRelId;
    }

    public void setHfmdEntityId(Long hfmdEntityId) {
        this.hfmdEntityId=hfmdEntityId;
    }

    public void setHfmdEntityRelType(Integer hfmdEntityRelType) {
        this.hfmdEntityRelType=hfmdEntityRelType;
    }

    public void setHfmdEntityRelLevel(Integer hfmdEntityRelLevel) {
        this.hfmdEntityRelLevel=hfmdEntityRelLevel;
    }

    public void setHfmdEntityRelDesc(String hfmdEntityRelDesc) {
        this.hfmdEntityRelDesc=hfmdEntityRelDesc;
    }

    public void setRelHfmdEntityId(Long relHfmdEntityId) {
        this.relHfmdEntityId=relHfmdEntityId;
    }

    public void setRelEntityAttrId(Long relEntityAttrId) {
        this.relEntityAttrId=relEntityAttrId;
    }

    public void setHfpmProgramId(Long hfpmProgramId) {
        this.hfpmProgramId=hfpmProgramId;
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

    public HfmdEntityRel() {
        super();
    }
}