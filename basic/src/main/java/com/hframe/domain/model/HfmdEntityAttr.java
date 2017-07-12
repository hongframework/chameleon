package com.hframe.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class HfmdEntityAttr {
    private Long hfmdEntityAttrId;

    private String hfmdEntityAttrName;

    private String hfmdEntityAttrCode;

    private String hfmdEntityAttrDesc;

    private Integer attrType;

    private String size;

    private Integer ispk;

    private Integer nullable;

    private Integer isBusiAttr;

    private Integer isRedundantAttr;

    private Long relHfmdEntityAttrId;

    private Long hfmdEnumClassId;

    private BigDecimal pri;

    private Long hfpmProgramId;

    private Long hfpmModuleId;

    private Long hfmdEntityId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfmdEntityAttr(Long hfmdEntityAttrId, String hfmdEntityAttrName, String hfmdEntityAttrCode, String hfmdEntityAttrDesc, Integer attrType, String size, Integer ispk, Integer nullable, Integer isBusiAttr, Integer isRedundantAttr, Long relHfmdEntityAttrId, Long hfmdEnumClassId, BigDecimal pri, Long hfpmProgramId, Long hfpmModuleId, Long hfmdEntityId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfmdEntityAttrId = hfmdEntityAttrId;
        this.hfmdEntityAttrName = hfmdEntityAttrName;
        this.hfmdEntityAttrCode = hfmdEntityAttrCode;
        this.hfmdEntityAttrDesc = hfmdEntityAttrDesc;
        this.attrType = attrType;
        this.size = size;
        this.ispk = ispk;
        this.nullable = nullable;
        this.isBusiAttr = isBusiAttr;
        this.isRedundantAttr = isRedundantAttr;
        this.relHfmdEntityAttrId = relHfmdEntityAttrId;
        this.hfmdEnumClassId = hfmdEnumClassId;
        this.pri = pri;
        this.hfpmProgramId = hfpmProgramId;
        this.hfpmModuleId = hfpmModuleId;
        this.hfmdEntityId = hfmdEntityId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfmdEntityAttrId() {
        return hfmdEntityAttrId;
    }

    public String getHfmdEntityAttrName() {
        return hfmdEntityAttrName;
    }

    public String getHfmdEntityAttrCode() {
        return hfmdEntityAttrCode;
    }

    public String getHfmdEntityAttrDesc() {
        return hfmdEntityAttrDesc;
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

    public Long getRelHfmdEntityAttrId() {
        return relHfmdEntityAttrId;
    }

    public Long getHfmdEnumClassId() {
        return hfmdEnumClassId;
    }

    public BigDecimal getPri() {
        return pri;
    }

    public Long getHfpmProgramId() {
        return hfpmProgramId;
    }

    public Long getHfpmModuleId() {
        return hfpmModuleId;
    }

    public Long getHfmdEntityId() {
        return hfmdEntityId;
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

    public void setHfmdEntityAttrId(Long hfmdEntityAttrId) {
        this.hfmdEntityAttrId=hfmdEntityAttrId;
    }

    public void setHfmdEntityAttrName(String hfmdEntityAttrName) {
        this.hfmdEntityAttrName=hfmdEntityAttrName;
    }

    public void setHfmdEntityAttrCode(String hfmdEntityAttrCode) {
        this.hfmdEntityAttrCode=hfmdEntityAttrCode;
    }

    public void setHfmdEntityAttrDesc(String hfmdEntityAttrDesc) {
        this.hfmdEntityAttrDesc=hfmdEntityAttrDesc;
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

    public void setRelHfmdEntityAttrId(Long relHfmdEntityAttrId) {
        this.relHfmdEntityAttrId=relHfmdEntityAttrId;
    }

    public void setHfmdEnumClassId(Long hfmdEnumClassId) {
        this.hfmdEnumClassId=hfmdEnumClassId;
    }

    public void setPri(BigDecimal pri) {
        this.pri=pri;
    }

    public void setHfpmProgramId(Long hfpmProgramId) {
        this.hfpmProgramId=hfpmProgramId;
    }

    public void setHfpmModuleId(Long hfpmModuleId) {
        this.hfpmModuleId=hfpmModuleId;
    }

    public void setHfmdEntityId(Long hfmdEntityId) {
        this.hfmdEntityId=hfmdEntityId;
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

    public HfmdEntityAttr() {
        super();
    }
}