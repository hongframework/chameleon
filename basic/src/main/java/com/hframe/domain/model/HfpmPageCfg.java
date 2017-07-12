package com.hframe.domain.model;

import java.util.Date;

public class HfpmPageCfg {
    private Long hfpmPageCfgId;

    private Long hfcfgPageTemplateId;

    private Long hfpmProgramCfgId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfpmPageCfg(Long hfpmPageCfgId, Long hfcfgPageTemplateId, Long hfpmProgramCfgId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfpmPageCfgId = hfpmPageCfgId;
        this.hfcfgPageTemplateId = hfcfgPageTemplateId;
        this.hfpmProgramCfgId = hfpmProgramCfgId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfpmPageCfgId() {
        return hfpmPageCfgId;
    }

    public Long getHfcfgPageTemplateId() {
        return hfcfgPageTemplateId;
    }

    public Long getHfpmProgramCfgId() {
        return hfpmProgramCfgId;
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

    public void setHfpmPageCfgId(Long hfpmPageCfgId) {
        this.hfpmPageCfgId=hfpmPageCfgId;
    }

    public void setHfcfgPageTemplateId(Long hfcfgPageTemplateId) {
        this.hfcfgPageTemplateId=hfcfgPageTemplateId;
    }

    public void setHfpmProgramCfgId(Long hfpmProgramCfgId) {
        this.hfpmProgramCfgId=hfpmProgramCfgId;
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

    public HfpmPageCfg() {
        super();
    }
}