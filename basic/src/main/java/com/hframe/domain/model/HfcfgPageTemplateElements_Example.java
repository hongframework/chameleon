package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfcfgPageTemplateElements_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfcfgPageTemplateElements_Example() {
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

        public Criteria andHfcfgPageTemplateElementsIdIsNull() {
            addCriterion("hfcfg_page_template_elements_id is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdIsNotNull() {
            addCriterion("hfcfg_page_template_elements_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdEqualTo(Long value) {
            addCriterion("hfcfg_page_template_elements_id =", value, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdNotEqualTo(Long value) {
            addCriterion("hfcfg_page_template_elements_id <>", value, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdGreaterThan(Long value) {
            addCriterion("hfcfg_page_template_elements_id >", value, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfcfg_page_template_elements_id >=", value, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdLessThan(Long value) {
            addCriterion("hfcfg_page_template_elements_id <", value, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdLessThanOrEqualTo(Long value) {
            addCriterion("hfcfg_page_template_elements_id <=", value, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdIn(List<Long> values) {
            addCriterion("hfcfg_page_template_elements_id in", values, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdNotIn(List<Long> values) {
            addCriterion("hfcfg_page_template_elements_id not in", values, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdBetween(Long value1, Long value2) {
            addCriterion("hfcfg_page_template_elements_id between", value1, value2, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsIdNotBetween(Long value1, Long value2) {
            addCriterion("hfcfg_page_template_elements_id not between", value1, value2, "hfcfgPageTemplateElementsId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdIsNull() {
            addCriterion("hfcfg_page_template_id is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdIsNotNull() {
            addCriterion("hfcfg_page_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdEqualTo(Long value) {
            addCriterion("hfcfg_page_template_id =", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdNotEqualTo(Long value) {
            addCriterion("hfcfg_page_template_id <>", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdGreaterThan(Long value) {
            addCriterion("hfcfg_page_template_id >", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfcfg_page_template_id >=", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdLessThan(Long value) {
            addCriterion("hfcfg_page_template_id <", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("hfcfg_page_template_id <=", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdIn(List<Long> values) {
            addCriterion("hfcfg_page_template_id in", values, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdNotIn(List<Long> values) {
            addCriterion("hfcfg_page_template_id not in", values, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdBetween(Long value1, Long value2) {
            addCriterion("hfcfg_page_template_id between", value1, value2, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("hfcfg_page_template_id not between", value1, value2, "hfcfgPageTemplateId");
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

        public Criteria andHfcfgPageTemplateElementsTypeIsNull() {
            addCriterion("hfcfg_page_template_elements_type is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeIsNotNull() {
            addCriterion("hfcfg_page_template_elements_type is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeEqualTo(Byte value) {
            addCriterion("hfcfg_page_template_elements_type =", value, "hfcfgPageTemplateElementsType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeNotEqualTo(Byte value) {
            addCriterion("hfcfg_page_template_elements_type <>", value, "hfcfgPageTemplateElementsType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeGreaterThan(Byte value) {
            addCriterion("hfcfg_page_template_elements_type >", value, "hfcfgPageTemplateElementsType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("hfcfg_page_template_elements_type >=", value, "hfcfgPageTemplateElementsType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeLessThan(Byte value) {
            addCriterion("hfcfg_page_template_elements_type <", value, "hfcfgPageTemplateElementsType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("hfcfg_page_template_elements_type <=", value, "hfcfgPageTemplateElementsType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeIn(List<Byte> values) {
            addCriterion("hfcfg_page_template_elements_type in", values, "hfcfgPageTemplateElementsType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeNotIn(List<Byte> values) {
            addCriterion("hfcfg_page_template_elements_type not in", values, "hfcfgPageTemplateElementsType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeBetween(Byte value1, Byte value2) {
            addCriterion("hfcfg_page_template_elements_type between", value1, value2, "hfcfgPageTemplateElementsType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateElementsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("hfcfg_page_template_elements_type not between", value1, value2, "hfcfgPageTemplateElementsType");
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

        public Criteria andEventExtendIsNull() {
            addCriterion("event_extend is null");
            return (Criteria) this;
        }

        public Criteria andEventExtendIsNotNull() {
            addCriterion("event_extend is not null");
            return (Criteria) this;
        }

        public Criteria andEventExtendEqualTo(Byte value) {
            addCriterion("event_extend =", value, "eventExtend");
            return (Criteria) this;
        }

        public Criteria andEventExtendNotEqualTo(Byte value) {
            addCriterion("event_extend <>", value, "eventExtend");
            return (Criteria) this;
        }

        public Criteria andEventExtendGreaterThan(Byte value) {
            addCriterion("event_extend >", value, "eventExtend");
            return (Criteria) this;
        }

        public Criteria andEventExtendGreaterThanOrEqualTo(Byte value) {
            addCriterion("event_extend >=", value, "eventExtend");
            return (Criteria) this;
        }

        public Criteria andEventExtendLessThan(Byte value) {
            addCriterion("event_extend <", value, "eventExtend");
            return (Criteria) this;
        }

        public Criteria andEventExtendLessThanOrEqualTo(Byte value) {
            addCriterion("event_extend <=", value, "eventExtend");
            return (Criteria) this;
        }

        public Criteria andEventExtendIn(List<Byte> values) {
            addCriterion("event_extend in", values, "eventExtend");
            return (Criteria) this;
        }

        public Criteria andEventExtendNotIn(List<Byte> values) {
            addCriterion("event_extend not in", values, "eventExtend");
            return (Criteria) this;
        }

        public Criteria andEventExtendBetween(Byte value1, Byte value2) {
            addCriterion("event_extend between", value1, value2, "eventExtend");
            return (Criteria) this;
        }

        public Criteria andEventExtendNotBetween(Byte value1, Byte value2) {
            addCriterion("event_extend not between", value1, value2, "eventExtend");
            return (Criteria) this;
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