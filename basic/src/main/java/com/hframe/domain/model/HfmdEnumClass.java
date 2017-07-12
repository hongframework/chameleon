package com.hframe.domain.model;

import java.util.Date;

public class HfmdEnumClass {
    private Long hfmdEnumClassId;

    private String hfmdEnumClassName;

    private String hfmdEnumClassCode;

    private String hfmdEnumClassDesc;

    private String ext1;

    private String ext2;

    private Long hfpmProgramId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfmdEnumClass(Long hfmdEnumClassId, String hfmdEnumClassName, String hfmdEnumClassCode, String hfmdEnumClassDesc, String ext1, String ext2, Long hfpmProgramId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfmdEnumClassId = hfmdEnumClassId;
        this.hfmdEnumClassName = hfmdEnumClassName;
        this.hfmdEnumClassCode = hfmdEnumClassCode;
        this.hfmdEnumClassDesc = hfmdEnumClassDesc;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.hfpmProgramId = hfpmProgramId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfmdEnumClassId() {
        return hfmdEnumClassId;
    }

    public String getHfmdEnumClassName() {
        return hfmdEnumClassName;
    }

    public String getHfmdEnumClassCode() {
        return hfmdEnumClassCode;
    }

    public String getHfmdEnumClassDesc() {
        return hfmdEnumClassDesc;
    }

    public String getExt1() {
        return ext1;
    }

    public String getExt2() {
        return ext2;
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

    public void setHfmdEnumClassId(Long hfmdEnumClassId) {
        this.hfmdEnumClassId=hfmdEnumClassId;
    }

    public void setHfmdEnumClassName(String hfmdEnumClassName) {
        this.hfmdEnumClassName=hfmdEnumClassName;
    }

    public void setHfmdEnumClassCode(String hfmdEnumClassCode) {
        this.hfmdEnumClassCode=hfmdEnumClassCode;
    }

    public void setHfmdEnumClassDesc(String hfmdEnumClassDesc) {
        this.hfmdEnumClassDesc=hfmdEnumClassDesc;
    }

    public void setExt1(String ext1) {
        this.ext1=ext1;
    }

    public void setExt2(String ext2) {
        this.ext2=ext2;
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

    public HfmdEnumClass() {
        super();
    }
}