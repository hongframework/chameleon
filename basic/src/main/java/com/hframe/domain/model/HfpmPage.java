package com.hframe.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class HfpmPage {
    private Long hfpmPageId;

    private String hfpmPageCode;

    private String hfpmPageName;

    private Integer hfpmPageType;

    private String hfpmPageDesc;

    private Long parentHfpmPageId;

    private Long hfpmProgramId;

    private Long hfpmModuleId;

    private BigDecimal pri;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    private Long hfpmDataSetId;

    private Long hfcfgPageTemplateId;

    public HfpmPage(Long hfpmPageId, String hfpmPageCode, String hfpmPageName, Integer hfpmPageType, String hfpmPageDesc, Long parentHfpmPageId, Long hfpmProgramId, Long hfpmModuleId, BigDecimal pri, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag, Long hfpmDataSetId, Long hfcfgPageTemplateId) {
        this.hfpmPageId = hfpmPageId;
        this.hfpmPageCode = hfpmPageCode;
        this.hfpmPageName = hfpmPageName;
        this.hfpmPageType = hfpmPageType;
        this.hfpmPageDesc = hfpmPageDesc;
        this.parentHfpmPageId = parentHfpmPageId;
        this.hfpmProgramId = hfpmProgramId;
        this.hfpmModuleId = hfpmModuleId;
        this.pri = pri;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
        this.hfpmDataSetId = hfpmDataSetId;
        this.hfcfgPageTemplateId = hfcfgPageTemplateId;
    }

    public Long getHfpmPageId() {
        return hfpmPageId;
    }

    public String getHfpmPageCode() {
        return hfpmPageCode;
    }

    public String getHfpmPageName() {
        return hfpmPageName;
    }

    public Integer getHfpmPageType() {
        return hfpmPageType;
    }

    public String getHfpmPageDesc() {
        return hfpmPageDesc;
    }

    public Long getParentHfpmPageId() {
        return parentHfpmPageId;
    }

    public Long getHfpmProgramId() {
        return hfpmProgramId;
    }

    public Long getHfpmModuleId() {
        return hfpmModuleId;
    }

    public BigDecimal getPri() {
        return pri;
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

    public Long getHfpmDataSetId() {
        return hfpmDataSetId;
    }

    public Long getHfcfgPageTemplateId() {
        return hfcfgPageTemplateId;
    }

    public void setHfpmPageId(Long hfpmPageId) {
        this.hfpmPageId=hfpmPageId;
    }

    public void setHfpmPageCode(String hfpmPageCode) {
        this.hfpmPageCode=hfpmPageCode;
    }

    public void setHfpmPageName(String hfpmPageName) {
        this.hfpmPageName=hfpmPageName;
    }

    public void setHfpmPageType(Integer hfpmPageType) {
        this.hfpmPageType=hfpmPageType;
    }

    public void setHfpmPageDesc(String hfpmPageDesc) {
        this.hfpmPageDesc=hfpmPageDesc;
    }

    public void setParentHfpmPageId(Long parentHfpmPageId) {
        this.parentHfpmPageId=parentHfpmPageId;
    }

    public void setHfpmProgramId(Long hfpmProgramId) {
        this.hfpmProgramId=hfpmProgramId;
    }

    public void setHfpmModuleId(Long hfpmModuleId) {
        this.hfpmModuleId=hfpmModuleId;
    }

    public void setPri(BigDecimal pri) {
        this.pri=pri;
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

    public void setHfpmDataSetId(Long hfpmDataSetId) {
        this.hfpmDataSetId=hfpmDataSetId;
    }

    public void setHfcfgPageTemplateId(Long hfcfgPageTemplateId) {
        this.hfcfgPageTemplateId=hfcfgPageTemplateId;
    }

    public HfpmPage() {
        super();
    }
}