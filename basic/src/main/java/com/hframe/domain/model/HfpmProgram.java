package com.hframe.domain.model;

import java.util.Date;

public class HfpmProgram {
    private Long hfpmProgramId;

    private String hfpmProgramName;

    private String hfpmProgramCode;

    private String hfpmProgramDesc;

    private Long opId;
//
//    @JsonSerialize(using = DateJsonSerializer.class)
//    @JsonDeserialize(using = DateJsonDeserializer.class)
    private Date createTime;

    private Long modifyOpId;

//    @JsonSerialize(using = DateJsonSerializer.class)
//    @JsonDeserialize(using = DateJsonDeserializer.class)
    private Date modifyTime;

    private Integer delFlag;

    private String ownerCode;

    public HfpmProgram() {
        super();
    }

    public HfpmProgram(Long hfpmProgramId, String hfpmProgramName, String hfpmProgramCode, String hfpmProgramDesc, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag, String ownerCode) {
        this.hfpmProgramId = hfpmProgramId;
        this.hfpmProgramName = hfpmProgramName;
        this.hfpmProgramCode = hfpmProgramCode;
        this.hfpmProgramDesc = hfpmProgramDesc;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
        this.ownerCode = ownerCode;
    }

    public Long getHfpmProgramId() {
        return hfpmProgramId;
    }

    public String getHfpmProgramName() {
        return hfpmProgramName;
    }

    public String getHfpmProgramCode() {
        return hfpmProgramCode;
    }

    public String getHfpmProgramDesc() {
        return hfpmProgramDesc;
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

    public void setHfpmProgramId(Long hfpmProgramId) {
        this.hfpmProgramId=hfpmProgramId;
    }

    public void setHfpmProgramName(String hfpmProgramName) {
        this.hfpmProgramName=hfpmProgramName;
    }

    public void setHfpmProgramCode(String hfpmProgramCode) {
        this.hfpmProgramCode=hfpmProgramCode;
    }

    public void setHfpmProgramDesc(String hfpmProgramDesc) {
        this.hfpmProgramDesc=hfpmProgramDesc;
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

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }
}