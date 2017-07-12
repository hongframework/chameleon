package com.hframe.domain.model;

import java.util.Date;

public class HfpmPageComponent {
    private Long hfpmPageComponentId;

    private String hfpmPageComponentName;

    private Integer hfpmPageComponentType;

    private Long hfpmPageId;

    private Long hfpmDataSetId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    private Long hfcfgComponentTemplateId;

    public HfpmPageComponent(Long hfpmPageComponentId, String hfpmPageComponentName, Integer hfpmPageComponentType, Long hfpmPageId, Long hfpmDataSetId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag, Long hfcfgComponentTemplateId) {
        this.hfpmPageComponentId = hfpmPageComponentId;
        this.hfpmPageComponentName = hfpmPageComponentName;
        this.hfpmPageComponentType = hfpmPageComponentType;
        this.hfpmPageId = hfpmPageId;
        this.hfpmDataSetId = hfpmDataSetId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
        this.hfcfgComponentTemplateId = hfcfgComponentTemplateId;
    }

    public Long getHfpmPageComponentId() {
        return hfpmPageComponentId;
    }

    public String getHfpmPageComponentName() {
        return hfpmPageComponentName;
    }

    public Integer getHfpmPageComponentType() {
        return hfpmPageComponentType;
    }

    public Long getHfpmPageId() {
        return hfpmPageId;
    }

    public Long getHfpmDataSetId() {
        return hfpmDataSetId;
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

    public Long getHfcfgComponentTemplateId() {
        return hfcfgComponentTemplateId;
    }

    public void setHfpmPageComponentId(Long hfpmPageComponentId) {
        this.hfpmPageComponentId=hfpmPageComponentId;
    }

    public void setHfpmPageComponentName(String hfpmPageComponentName) {
        this.hfpmPageComponentName=hfpmPageComponentName;
    }

    public void setHfpmPageComponentType(Integer hfpmPageComponentType) {
        this.hfpmPageComponentType=hfpmPageComponentType;
    }

    public void setHfpmPageId(Long hfpmPageId) {
        this.hfpmPageId=hfpmPageId;
    }

    public void setHfpmDataSetId(Long hfpmDataSetId) {
        this.hfpmDataSetId=hfpmDataSetId;
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

    public void setHfcfgComponentTemplateId(Long hfcfgComponentTemplateId) {
        this.hfcfgComponentTemplateId=hfcfgComponentTemplateId;
    }

    public HfpmPageComponent() {
        super();
    }
}