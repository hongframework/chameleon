package com.hframe.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class HfpmDataField {
    private Long hfpmDataFieldId;

    private String hfpmDataFieldCode;

    private String hfpmFieldShowTypeId;

    private String fieldShowCode;

    private Long hfmdEntityId;

    private Long hfmdEntityAttrId;

    private Integer dataGetMethod;

    private String hfpmDataFieldName;

    private Long hfpmDataSetId;

    private BigDecimal pri;

    private Long opId;

    private Date createTime;

    private Long modifyOpId;

    private Date modifyTime;

    private Integer delFlag;

    private Byte createEditAuth;

    private Byte detailShowAuth;

    private Byte listShowAuth;

    private Byte updateEditAuth;

    private String workfowModelId;

    public HfpmDataField(Long hfpmDataFieldId, String hfpmDataFieldCode, String hfpmFieldShowTypeId, String fieldShowCode, Long hfmdEntityId, Long hfmdEntityAttrId, Integer dataGetMethod, String hfpmDataFieldName, Long hfpmDataSetId, BigDecimal pri, Long opId, Date createTime, Long modifyOpId, Date modifyTime, Integer delFlag, Byte createEditAuth, Byte detailShowAuth, Byte listShowAuth, Byte updateEditAuth, String workfowModelId) {
        this.hfpmDataFieldId = hfpmDataFieldId;
        this.hfpmDataFieldCode = hfpmDataFieldCode;
        this.hfpmFieldShowTypeId = hfpmFieldShowTypeId;
        this.fieldShowCode = fieldShowCode;
        this.hfmdEntityId = hfmdEntityId;
        this.hfmdEntityAttrId = hfmdEntityAttrId;
        this.dataGetMethod = dataGetMethod;
        this.hfpmDataFieldName = hfpmDataFieldName;
        this.hfpmDataSetId = hfpmDataSetId;
        this.pri = pri;
        this.opId = opId;
        this.createTime = createTime;
        this.modifyOpId = modifyOpId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
        this.createEditAuth = createEditAuth;
        this.detailShowAuth = detailShowAuth;
        this.listShowAuth = listShowAuth;
        this.updateEditAuth = updateEditAuth;
        this.workfowModelId = workfowModelId;
    }

    public Long getHfpmDataFieldId() {
        return hfpmDataFieldId;
    }

    public String getHfpmDataFieldCode() {
        return hfpmDataFieldCode;
    }

    public String getHfpmFieldShowTypeId() {
        return hfpmFieldShowTypeId;
    }

    public String getFieldShowCode() {
        return fieldShowCode;
    }

    public Long getHfmdEntityId() {
        return hfmdEntityId;
    }

    public Long getHfmdEntityAttrId() {
        return hfmdEntityAttrId;
    }

    public Integer getDataGetMethod() {
        return dataGetMethod;
    }

    public String getHfpmDataFieldName() {
        return hfpmDataFieldName;
    }

    public Long getHfpmDataSetId() {
        return hfpmDataSetId;
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

    public Byte getCreateEditAuth() {
        return createEditAuth;
    }

    public Byte getDetailShowAuth() {
        return detailShowAuth;
    }

    public Byte getListShowAuth() {
        return listShowAuth;
    }

    public Byte getUpdateEditAuth() {
        return updateEditAuth;
    }

    public String getWorkfowModelId() {
        return workfowModelId;
    }

    public void setHfpmDataFieldId(Long hfpmDataFieldId) {
        this.hfpmDataFieldId=hfpmDataFieldId;
    }

    public void setHfpmDataFieldCode(String hfpmDataFieldCode) {
        this.hfpmDataFieldCode=hfpmDataFieldCode;
    }

    public void setHfpmFieldShowTypeId(String hfpmFieldShowTypeId) {
        this.hfpmFieldShowTypeId=hfpmFieldShowTypeId;
    }

    public void setFieldShowCode(String fieldShowCode) {
        this.fieldShowCode=fieldShowCode;
    }

    public void setHfmdEntityId(Long hfmdEntityId) {
        this.hfmdEntityId=hfmdEntityId;
    }

    public void setHfmdEntityAttrId(Long hfmdEntityAttrId) {
        this.hfmdEntityAttrId=hfmdEntityAttrId;
    }

    public void setDataGetMethod(Integer dataGetMethod) {
        this.dataGetMethod=dataGetMethod;
    }

    public void setHfpmDataFieldName(String hfpmDataFieldName) {
        this.hfpmDataFieldName=hfpmDataFieldName;
    }

    public void setHfpmDataSetId(Long hfpmDataSetId) {
        this.hfpmDataSetId=hfpmDataSetId;
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

    public void setCreateEditAuth(Byte createEditAuth) {
        this.createEditAuth=createEditAuth;
    }

    public void setDetailShowAuth(Byte detailShowAuth) {
        this.detailShowAuth=detailShowAuth;
    }

    public void setListShowAuth(Byte listShowAuth) {
        this.listShowAuth=listShowAuth;
    }

    public void setUpdateEditAuth(Byte updateEditAuth) {
        this.updateEditAuth=updateEditAuth;
    }

    public void setWorkfowModelId(String workfowModelId) {
        this.workfowModelId=workfowModelId;
    }

    public HfpmDataField() {
        super();
    }
}