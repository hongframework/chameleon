package com.hframe.domain.model;

import java.util.Date;

public class HfusEntityAttr {
    private Long hfusEntityAttrId;

    private String hfusEntityAttrName;

    private String hfusEntityAttrCode;

    private String hfusEntityAttrDesc;

    private Integer attrType;

    private String size;

    private Integer ispk;

    private Integer nullable;

    private Integer isBusiAttr;

    private Integer isRedundantAttr;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfusEntityAttr(Long hfusEntityAttrId, String hfusEntityAttrName, String hfusEntityAttrCode, String hfusEntityAttrDesc, Integer attrType, String size, Integer ispk, Integer nullable, Integer isBusiAttr, Integer isRedundantAttr, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfusEntityAttrId = hfusEntityAttrId;
        this.hfusEntityAttrName = hfusEntityAttrName;
        this.hfusEntityAttrCode = hfusEntityAttrCode;
        this.hfusEntityAttrDesc = hfusEntityAttrDesc;
        this.attrType = attrType;
        this.size = size;
        this.ispk = ispk;
        this.nullable = nullable;
        this.isBusiAttr = isBusiAttr;
        this.isRedundantAttr = isRedundantAttr;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfusEntityAttrId() {
        return hfusEntityAttrId;
    }

    public String getHfusEntityAttrName() {
        return hfusEntityAttrName;
    }

    public String getHfusEntityAttrCode() {
        return hfusEntityAttrCode;
    }

    public String getHfusEntityAttrDesc() {
        return hfusEntityAttrDesc;
    }

    public Integer getAttrType() {
        return attrType;
    }

    public String getSize() {
        return size;
    }

    public Integer getIspk() {
        return ispk;
    }

    public Integer getNullable() {
        return nullable;
    }

    public Integer getIsBusiAttr() {
        return isBusiAttr;
    }

    public Integer getIsRedundantAttr() {
        return isRedundantAttr;
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

    public void setHfusEntityAttrId(Long hfusEntityAttrId) {
        this.hfusEntityAttrId=hfusEntityAttrId;
    }

    public void setHfusEntityAttrName(String hfusEntityAttrName) {
        this.hfusEntityAttrName=hfusEntityAttrName;
    }

    public void setHfusEntityAttrCode(String hfusEntityAttrCode) {
        this.hfusEntityAttrCode=hfusEntityAttrCode;
    }

    public void setHfusEntityAttrDesc(String hfusEntityAttrDesc) {
        this.hfusEntityAttrDesc=hfusEntityAttrDesc;
    }

    public void setAttrType(Integer attrType) {
        this.attrType=attrType;
    }

    public void setSize(String size) {
        this.size=size;
    }

    public void setIspk(Integer ispk) {
        this.ispk=ispk;
    }

    public void setNullable(Integer nullable) {
        this.nullable=nullable;
    }

    public void setIsBusiAttr(Integer isBusiAttr) {
        this.isBusiAttr=isBusiAttr;
    }

    public void setIsRedundantAttr(Integer isRedundantAttr) {
        this.isRedundantAttr=isRedundantAttr;
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

    public HfusEntityAttr() {
        super();
    }
}