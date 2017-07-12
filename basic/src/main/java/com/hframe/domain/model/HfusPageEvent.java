package com.hframe.domain.model;

import java.util.Date;

public class HfusPageEvent {
    private Long hfusPageEventId;

    private String hfpmEventName;

    private Integer hfpmEventType;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfusPageEvent(Long hfusPageEventId, String hfpmEventName, Integer hfpmEventType, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfusPageEventId = hfusPageEventId;
        this.hfpmEventName = hfpmEventName;
        this.hfpmEventType = hfpmEventType;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfusPageEventId() {
        return hfusPageEventId;
    }

    public String getHfpmEventName() {
        return hfpmEventName;
    }

    public Integer getHfpmEventType() {
        return hfpmEventType;
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

    public void setHfusPageEventId(Long hfusPageEventId) {
        this.hfusPageEventId=hfusPageEventId;
    }

    public void setHfpmEventName(String hfpmEventName) {
        this.hfpmEventName=hfpmEventName;
    }

    public void setHfpmEventType(Integer hfpmEventType) {
        this.hfpmEventType=hfpmEventType;
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

    public HfusPageEvent() {
        super();
    }
}