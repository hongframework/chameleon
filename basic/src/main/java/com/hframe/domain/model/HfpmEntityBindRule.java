package com.hframe.domain.model;

import java.util.Date;

public class HfpmEntityBindRule {
    private Long hfpmEntityBindRuleId;

    private Integer bindType;

    private Long srcHfmdEntityId;

    private Long srcHfmdEntityAttrId;

    private Long destHfmdEntityId;

    private Long destHfmdEntityAttrId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfpmEntityBindRule(Long hfpmEntityBindRuleId, Integer bindType, Long srcHfmdEntityId, Long srcHfmdEntityAttrId, Long destHfmdEntityId, Long destHfmdEntityAttrId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfpmEntityBindRuleId = hfpmEntityBindRuleId;
        this.bindType = bindType;
        this.srcHfmdEntityId = srcHfmdEntityId;
        this.srcHfmdEntityAttrId = srcHfmdEntityAttrId;
        this.destHfmdEntityId = destHfmdEntityId;
        this.destHfmdEntityAttrId = destHfmdEntityAttrId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfpmEntityBindRuleId() {
        return hfpmEntityBindRuleId;
    }

    public Integer getBindType() {
        return bindType;
    }

    public Long getSrcHfmdEntityId() {
        return srcHfmdEntityId;
    }

    public Long getSrcHfmdEntityAttrId() {
        return srcHfmdEntityAttrId;
    }

    public Long getDestHfmdEntityId() {
        return destHfmdEntityId;
    }

    public Long getDestHfmdEntityAttrId() {
        return destHfmdEntityAttrId;
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

    public void setHfpmEntityBindRuleId(Long hfpmEntityBindRuleId) {
        this.hfpmEntityBindRuleId=hfpmEntityBindRuleId;
    }

    public void setBindType(Integer bindType) {
        this.bindType=bindType;
    }

    public void setSrcHfmdEntityId(Long srcHfmdEntityId) {
        this.srcHfmdEntityId=srcHfmdEntityId;
    }

    public void setSrcHfmdEntityAttrId(Long srcHfmdEntityAttrId) {
        this.srcHfmdEntityAttrId=srcHfmdEntityAttrId;
    }

    public void setDestHfmdEntityId(Long destHfmdEntityId) {
        this.destHfmdEntityId=destHfmdEntityId;
    }

    public void setDestHfmdEntityAttrId(Long destHfmdEntityAttrId) {
        this.destHfmdEntityAttrId=destHfmdEntityAttrId;
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

    public HfpmEntityBindRule() {
        super();
    }
}