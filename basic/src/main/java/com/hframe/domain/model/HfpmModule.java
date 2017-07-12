package com.hframe.domain.model;

import java.util.Date;

public class HfpmModule {
    private Long hfpmModuleId;

    private String hfpmModuleName;

    private String hfpmModuleCode;

    private String hfpmModuleDesc;

    private Long hfpmProgramId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfpmModule(Long hfpmModuleId, String hfpmModuleName, String hfpmModuleCode, String hfpmModuleDesc, Long hfpmProgramId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfpmModuleId = hfpmModuleId;
        this.hfpmModuleName = hfpmModuleName;
        this.hfpmModuleCode = hfpmModuleCode;
        this.hfpmModuleDesc = hfpmModuleDesc;
        this.hfpmProgramId = hfpmProgramId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfpmModuleId() {
        return hfpmModuleId;
    }

    public String getHfpmModuleName() {
        return hfpmModuleName;
    }

    public String getHfpmModuleCode() {
        return hfpmModuleCode;
    }

    public String getHfpmModuleDesc() {
        return hfpmModuleDesc;
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

    public void setHfpmModuleId(Long hfpmModuleId) {
        this.hfpmModuleId=hfpmModuleId;
    }

    public void setHfpmModuleName(String hfpmModuleName) {
        this.hfpmModuleName=hfpmModuleName;
    }

    public void setHfpmModuleCode(String hfpmModuleCode) {
        this.hfpmModuleCode=hfpmModuleCode;
    }

    public void setHfpmModuleDesc(String hfpmModuleDesc) {
        this.hfpmModuleDesc=hfpmModuleDesc;
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

    public HfpmModule() {
        super();
    }
}