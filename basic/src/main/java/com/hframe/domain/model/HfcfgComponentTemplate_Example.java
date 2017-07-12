package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfcfgComponentTemplate_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfcfgComponentTemplate_Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHfcfgComponentTemplateIdIsNull() {
            addCriterion("hfcfg_component_template_id is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdIsNotNull() {
            addCriterion("hfcfg_component_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdEqualTo(Long value) {
            addCriterion("hfcfg_component_template_id =", value, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdNotEqualTo(Long value) {
            addCriterion("hfcfg_component_template_id <>", value, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdGreaterThan(Long value) {
            addCriterion("hfcfg_component_template_id >", value, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfcfg_component_template_id >=", value, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdLessThan(Long value) {
            addCriterion("hfcfg_component_template_id <", value, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("hfcfg_component_template_id <=", value, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdIn(List<Long> values) {
            addCriterion("hfcfg_component_template_id in", values, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdNotIn(List<Long> values) {
            addCriterion("hfcfg_component_template_id not in", values, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdBetween(Long value1, Long value2) {
            addCriterion("hfcfg_component_template_id between", value1, value2, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("hfcfg_component_template_id not between", value1, value2, "hfcfgComponentTemplateId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeIsNull() {
            addCriterion("hfcfg_component_template_code is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeIsNotNull() {
            addCriterion("hfcfg_component_template_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeEqualTo(String value) {
            addCriterion("hfcfg_component_template_code =", value, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeNotEqualTo(String value) {
            addCriterion("hfcfg_component_template_code <>", value, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeGreaterThan(String value) {
            addCriterion("hfcfg_component_template_code >", value, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfcfg_component_template_code >=", value, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeLessThan(String value) {
            addCriterion("hfcfg_component_template_code <", value, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("hfcfg_component_template_code <=", value, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeLike(String value) {
            addCriterion("hfcfg_component_template_code like", value, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeNotLike(String value) {
            addCriterion("hfcfg_component_template_code not like", value, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeIn(List<String> values) {
            addCriterion("hfcfg_component_template_code in", values, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeNotIn(List<String> values) {
            addCriterion("hfcfg_component_template_code not in", values, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeBetween(String value1, String value2) {
            addCriterion("hfcfg_component_template_code between", value1, value2, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateCodeNotBetween(String value1, String value2) {
            addCriterion("hfcfg_component_template_code not between", value1, value2, "hfcfgComponentTemplateCode");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNull() {
            addCriterion("modifier_id is null");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNotNull() {
            addCriterion("modifier_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifierIdEqualTo(Long value) {
            addCriterion("modifier_id =", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotEqualTo(Long value) {
            addCriterion("modifier_id <>", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThan(Long value) {
            addCriterion("modifier_id >", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("modifier_id >=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThan(Long value) {
            addCriterion("modifier_id <", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThanOrEqualTo(Long value) {
            addCriterion("modifier_id <=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdIn(List<Long> values) {
            addCriterion("modifier_id in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotIn(List<Long> values) {
            addCriterion("modifier_id not in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdBetween(Long value1, Long value2) {
            addCriterion("modifier_id between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotBetween(Long value1, Long value2) {
            addCriterion("modifier_id not between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeIsNull() {
            addCriterion("hfcfg_component_template_type is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeIsNotNull() {
            addCriterion("hfcfg_component_template_type is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeEqualTo(Byte value) {
            addCriterion("hfcfg_component_template_type =", value, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeNotEqualTo(Byte value) {
            addCriterion("hfcfg_component_template_type <>", value, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeGreaterThan(Byte value) {
            addCriterion("hfcfg_component_template_type >", value, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("hfcfg_component_template_type >=", value, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeLessThan(Byte value) {
            addCriterion("hfcfg_component_template_type <", value, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("hfcfg_component_template_type <=", value, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeIn(List<Byte> values) {
            addCriterion("hfcfg_component_template_type in", values, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeNotIn(List<Byte> values) {
            addCriterion("hfcfg_component_template_type not in", values, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeBetween(Byte value1, Byte value2) {
            addCriterion("hfcfg_component_template_type between", value1, value2, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("hfcfg_component_template_type not between", value1, value2, "hfcfgComponentTemplateType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescIsNull() {
            addCriterion("hfcfg_component_template_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescIsNotNull() {
            addCriterion("hfcfg_component_template_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescEqualTo(String value) {
            addCriterion("hfcfg_component_template_desc =", value, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescNotEqualTo(String value) {
            addCriterion("hfcfg_component_template_desc <>", value, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescGreaterThan(String value) {
            addCriterion("hfcfg_component_template_desc >", value, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescGreaterThanOrEqualTo(String value) {
            addCriterion("hfcfg_component_template_desc >=", value, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescLessThan(String value) {
            addCriterion("hfcfg_component_template_desc <", value, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescLessThanOrEqualTo(String value) {
            addCriterion("hfcfg_component_template_desc <=", value, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescLike(String value) {
            addCriterion("hfcfg_component_template_desc like", value, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescNotLike(String value) {
            addCriterion("hfcfg_component_template_desc not like", value, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescIn(List<String> values) {
            addCriterion("hfcfg_component_template_desc in", values, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescNotIn(List<String> values) {
            addCriterion("hfcfg_component_template_desc not in", values, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescBetween(String value1, String value2) {
            addCriterion("hfcfg_component_template_desc between", value1, value2, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateDescNotBetween(String value1, String value2) {
            addCriterion("hfcfg_component_template_desc not between", value1, value2, "hfcfgComponentTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameIsNull() {
            addCriterion("hfcfg_component_template_name is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameIsNotNull() {
            addCriterion("hfcfg_component_template_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameEqualTo(String value) {
            addCriterion("hfcfg_component_template_name =", value, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameNotEqualTo(String value) {
            addCriterion("hfcfg_component_template_name <>", value, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameGreaterThan(String value) {
            addCriterion("hfcfg_component_template_name >", value, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfcfg_component_template_name >=", value, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameLessThan(String value) {
            addCriterion("hfcfg_component_template_name <", value, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("hfcfg_component_template_name <=", value, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameLike(String value) {
            addCriterion("hfcfg_component_template_name like", value, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameNotLike(String value) {
            addCriterion("hfcfg_component_template_name not like", value, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameIn(List<String> values) {
            addCriterion("hfcfg_component_template_name in", values, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameNotIn(List<String> values) {
            addCriterion("hfcfg_component_template_name not in", values, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameBetween(String value1, String value2) {
            addCriterion("hfcfg_component_template_name between", value1, value2, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgComponentTemplateNameNotBetween(String value1, String value2) {
            addCriterion("hfcfg_component_template_name not between", value1, value2, "hfcfgComponentTemplateName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}