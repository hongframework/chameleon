package com.hframe.domain.model;

import java.util.Date;

public class HfpmFieldShowType {
    private Long hfpmFieldShowTypeId;

    private String hfpmFieldShowTypeCode;

    private String hfpmFieldShowTypeName;

    private String preStr;

    private String afterStr;

    private Integer colSpan;

    private Integer rowSpan;

    private Integer width;

    private Integer height;

    private String param1;

    private String param2;

    private String param3;

    private String param4;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfpmFieldShowType(Long hfpmFieldShowTypeId, String hfpmFieldShowTypeCode, String hfpmFieldShowTypeName, String preStr, String afterStr, Integer colSpan, Integer rowSpan, Integer width, Integer height, String param1, String param2, String param3, String param4, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfpmFieldShowTypeId = hfpmFieldShowTypeId;
        this.hfpmFieldShowTypeCode = hfpmFieldShowTypeCode;
        this.hfpmFieldShowTypeName = hfpmFieldShowTypeName;
        this.preStr = preStr;
        this.afterStr = afterStr;
        this.colSpan = colSpan;
        this.rowSpan = rowSpan;
        this.width = width;
        this.height = height;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfpmFieldShowTypeId() {
        return hfpmFieldShowTypeId;
    }

    public String getHfpmFieldShowTypeCode() {
        return hfpmFieldShowTypeCode;
    }

    public String getHfpmFieldShowTypeName() {
        return hfpmFieldShowTypeName;
    }

    public String getPreStr() {
        return preStr;
    }

    public String getAfterStr() {
        return afterStr;
    }

    public Integer getColSpan() {
        return colSpan;
    }

    public Integer getRowSpan() {
        return rowSpan;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getParam1() {
        return param1;
    }

    public String getParam2() {
        return param2;
    }

    public String getParam3() {
        return param3;
    }

    public String getParam4() {
        return param4;
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

    public void setHfpmFieldShowTypeId(Long hfpmFieldShowTypeId) {
        this.hfpmFieldShowTypeId=hfpmFieldShowTypeId;
    }

    public void setHfpmFieldShowTypeCode(String hfpmFieldShowTypeCode) {
        this.hfpmFieldShowTypeCode=hfpmFieldShowTypeCode;
    }

    public void setHfpmFieldShowTypeName(String hfpmFieldShowTypeName) {
        this.hfpmFieldShowTypeName=hfpmFieldShowTypeName;
    }

    public void setPreStr(String preStr) {
        this.preStr=preStr;
    }

    public void setAfterStr(String afterStr) {
        this.afterStr=afterStr;
    }

    public void setColSpan(Integer colSpan) {
        this.colSpan=colSpan;
    }

    public void setRowSpan(Integer rowSpan) {
        this.rowSpan=rowSpan;
    }

    public void setWidth(Integer width) {
        this.width=width;
    }

    public void setHeight(Integer height) {
        this.height=height;
    }

    public void setParam1(String param1) {
        this.param1=param1;
    }

    public void setParam2(String param2) {
        this.param2=param2;
    }

    public void setParam3(String param3) {
        this.param3=param3;
    }

    public void setParam4(String param4) {
        this.param4=param4;
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

    public HfpmFieldShowType() {
        super();
    }
}