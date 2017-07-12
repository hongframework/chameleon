package com.hframe.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class HfmdEnum {
    private Long hfmdEnumId;

    private String hfmdEnumValue;

    private String hfmdEnumText;

    private String hfmdEnumDesc;

    private Integer isDefault;

    private BigDecimal pri;

    private String ext1;

    private String ext2;

    private Long hfmdEnumClassId;

    private String hfmdEnumClassCode;

    private Long hfpmProgramId;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    public HfmdEnum(Long hfmdEnumId, String hfmdEnumValue, String hfmdEnumText, String hfmdEnumDesc, Integer isDefault, BigDecimal pri, String ext1, String ext2, Long hfmdEnumClassId, String hfmdEnumClassCode, Long hfpmProgramId, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag) {
        this.hfmdEnumId = hfmdEnumId;
        this.hfmdEnumValue = hfmdEnumValue;
        this.hfmdEnumText = hfmdEnumText;
        this.hfmdEnumDesc = hfmdEnumDesc;
        this.isDefault = isDefault;
        this.pri = pri;
        this.ext1 = ext1;
        this.ext2 = ext2;
        this.hfmdEnumClassId = hfmdEnumClassId;
        this.hfmdEnumClassCode = hfmdEnumClassCode;
        this.hfpmProgramId = hfpmProgramId;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfmdEnumId() {
        return hfmdEnumId;
    }

    public String getHfmdEnumValue() {
        return hfmdEnumValue;
    }

    public String getHfmdEnumText() {
        return hfmdEnumText;
    }

    public String getHfmdEnumDesc() {
        return hfmdEnumDesc;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public BigDecimal getPri() {
        return pri;
    }

    public String getExt1() {
        return ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public Long getHfmdEnumClassId() {
        return hfmdEnumClassId;
    }

    public String getHfmdEnumClassCode() {
        return hfmdEnumClassCode;
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

    public void setHfmdEnumId(Long hfmdEnumId) {
        this.hfmdEnumId=hfmdEnumId;
    }

    public void setHfmdEnumValue(String hfmdEnumValue) {
        this.hfmdEnumValue=hfmdEnumValue;
    }

    public void setHfmdEnumText(String hfmdEnumText) {
        this.hfmdEnumText=hfmdEnumText;
    }

    public void setHfmdEnumDesc(String hfmdEnumDesc) {
        this.hfmdEnumDesc=hfmdEnumDesc;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault=isDefault;
    }

    public void setPri(BigDecimal pri) {
        this.pri=pri;
    }

    public void setExt1(String ext1) {
        this.ext1=ext1;
    }

    public void setExt2(String ext2) {
        this.ext2=ext2;
    }

    public void setHfmdEnumClassId(Long hfmdEnumClassId) {
        this.hfmdEnumClassId=hfmdEnumClassId;
    }

    public void setHfmdEnumClassCode(String hfmdEnumClassCode) {
        this.hfmdEnumClassCode=hfmdEnumClassCode;
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

    public HfmdEnum() {
        super();
    }
}