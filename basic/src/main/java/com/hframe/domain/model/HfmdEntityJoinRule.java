package com.hframe.domain.model;

public class HfmdEntityJoinRule {
    private Long hfmdEntityJoinRuleId;

    private Long sourceHfmdEntityId;

    private Long sourceHfmdEntityAttrId;

    private String sourceHfmdEntityAttrValue;

    private Byte joinType;

    private Long targetHfmdEntityId;

    private Long targetHfmdEntityAttrId;

    private String targetHfmdEntityAttrValue;

    private Byte editable;

    public HfmdEntityJoinRule(Long hfmdEntityJoinRuleId, Long sourceHfmdEntityId, Long sourceHfmdEntityAttrId, String sourceHfmdEntityAttrValue, Byte joinType, Long targetHfmdEntityId, Long targetHfmdEntityAttrId, String targetHfmdEntityAttrValue, Byte editable) {
        this.hfmdEntityJoinRuleId = hfmdEntityJoinRuleId;
        this.sourceHfmdEntityId = sourceHfmdEntityId;
        this.sourceHfmdEntityAttrId = sourceHfmdEntityAttrId;
        this.sourceHfmdEntityAttrValue = sourceHfmdEntityAttrValue;
        this.joinType = joinType;
        this.targetHfmdEntityId = targetHfmdEntityId;
        this.targetHfmdEntityAttrId = targetHfmdEntityAttrId;
        this.targetHfmdEntityAttrValue = targetHfmdEntityAttrValue;
        this.editable = editable;
    }

    public Long getHfmdEntityJoinRuleId() {
        return hfmdEntityJoinRuleId;
    }

    public Long getSourceHfmdEntityId() {
        return sourceHfmdEntityId;
    }

    public Long getSourceHfmdEntityAttrId() {
        return sourceHfmdEntityAttrId;
    }

    public String getSourceHfmdEntityAttrValue() {
        return sourceHfmdEntityAttrValue;
    }

    public Byte getJoinType() {
        return joinType;
    }

    public Long getTargetHfmdEntityId() {
        return targetHfmdEntityId;
    }

    public Long getTargetHfmdEntityAttrId() {
        return targetHfmdEntityAttrId;
    }

    public String getTargetHfmdEntityAttrValue() {
        return targetHfmdEntityAttrValue;
    }

    public Byte getEditable() {
        return editable;
    }

    public void setHfmdEntityJoinRuleId(Long hfmdEntityJoinRuleId) {
        this.hfmdEntityJoinRuleId=hfmdEntityJoinRuleId;
    }

    public void setSourceHfmdEntityId(Long sourceHfmdEntityId) {
        this.sourceHfmdEntityId=sourceHfmdEntityId;
    }

    public void setSourceHfmdEntityAttrId(Long sourceHfmdEntityAttrId) {
        this.sourceHfmdEntityAttrId=sourceHfmdEntityAttrId;
    }

    public void setSourceHfmdEntityAttrValue(String sourceHfmdEntityAttrValue) {
        this.sourceHfmdEntityAttrValue=sourceHfmdEntityAttrValue;
    }

    public void setJoinType(Byte joinType) {
        this.joinType=joinType;
    }

    public void setTargetHfmdEntityId(Long targetHfmdEntityId) {
        this.targetHfmdEntityId=targetHfmdEntityId;
    }

    public void setTargetHfmdEntityAttrId(Long targetHfmdEntityAttrId) {
        this.targetHfmdEntityAttrId=targetHfmdEntityAttrId;
    }

    public void setTargetHfmdEntityAttrValue(String targetHfmdEntityAttrValue) {
        this.targetHfmdEntityAttrValue=targetHfmdEntityAttrValue;
    }

    public void setEditable(Byte editable) {
        this.editable=editable;
    }

    public HfmdEntityJoinRule() {
        super();
    }
}