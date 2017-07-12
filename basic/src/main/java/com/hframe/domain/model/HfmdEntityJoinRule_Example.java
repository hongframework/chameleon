package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.List;

public class HfmdEntityJoinRule_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfmdEntityJoinRule_Example() {
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

        public Criteria andHfmdEntityJoinRuleIdIsNull() {
            addCriterion("hfmd_entity_join_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdIsNotNull() {
            addCriterion("hfmd_entity_join_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdEqualTo(Long value) {
            addCriterion("hfmd_entity_join_rule_id =", value, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdNotEqualTo(Long value) {
            addCriterion("hfmd_entity_join_rule_id <>", value, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdGreaterThan(Long value) {
            addCriterion("hfmd_entity_join_rule_id >", value, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfmd_entity_join_rule_id >=", value, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdLessThan(Long value) {
            addCriterion("hfmd_entity_join_rule_id <", value, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("hfmd_entity_join_rule_id <=", value, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdIn(List<Long> values) {
            addCriterion("hfmd_entity_join_rule_id in", values, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdNotIn(List<Long> values) {
            addCriterion("hfmd_entity_join_rule_id not in", values, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdBetween(Long value1, Long value2) {
            addCriterion("hfmd_entity_join_rule_id between", value1, value2, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityJoinRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("hfmd_entity_join_rule_id not between", value1, value2, "hfmdEntityJoinRuleId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdIsNull() {
            addCriterion("source_hfmd_entity_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdIsNotNull() {
            addCriterion("source_hfmd_entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdEqualTo(Long value) {
            addCriterion("source_hfmd_entity_id =", value, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdNotEqualTo(Long value) {
            addCriterion("source_hfmd_entity_id <>", value, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdGreaterThan(Long value) {
            addCriterion("source_hfmd_entity_id >", value, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_hfmd_entity_id >=", value, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdLessThan(Long value) {
            addCriterion("source_hfmd_entity_id <", value, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("source_hfmd_entity_id <=", value, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdIn(List<Long> values) {
            addCriterion("source_hfmd_entity_id in", values, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdNotIn(List<Long> values) {
            addCriterion("source_hfmd_entity_id not in", values, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdBetween(Long value1, Long value2) {
            addCriterion("source_hfmd_entity_id between", value1, value2, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("source_hfmd_entity_id not between", value1, value2, "sourceHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdIsNull() {
            addCriterion("source_hfmd_entity_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdIsNotNull() {
            addCriterion("source_hfmd_entity_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdEqualTo(Long value) {
            addCriterion("source_hfmd_entity_attr_id =", value, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdNotEqualTo(Long value) {
            addCriterion("source_hfmd_entity_attr_id <>", value, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdGreaterThan(Long value) {
            addCriterion("source_hfmd_entity_attr_id >", value, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_hfmd_entity_attr_id >=", value, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdLessThan(Long value) {
            addCriterion("source_hfmd_entity_attr_id <", value, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("source_hfmd_entity_attr_id <=", value, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdIn(List<Long> values) {
            addCriterion("source_hfmd_entity_attr_id in", values, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdNotIn(List<Long> values) {
            addCriterion("source_hfmd_entity_attr_id not in", values, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdBetween(Long value1, Long value2) {
            addCriterion("source_hfmd_entity_attr_id between", value1, value2, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("source_hfmd_entity_attr_id not between", value1, value2, "sourceHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueIsNull() {
            addCriterion("source_hfmd_entity_attr_value is null");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueIsNotNull() {
            addCriterion("source_hfmd_entity_attr_value is not null");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueEqualTo(String value) {
            addCriterion("source_hfmd_entity_attr_value =", value, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueNotEqualTo(String value) {
            addCriterion("source_hfmd_entity_attr_value <>", value, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueGreaterThan(String value) {
            addCriterion("source_hfmd_entity_attr_value >", value, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("source_hfmd_entity_attr_value >=", value, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueLessThan(String value) {
            addCriterion("source_hfmd_entity_attr_value <", value, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueLessThanOrEqualTo(String value) {
            addCriterion("source_hfmd_entity_attr_value <=", value, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueLike(String value) {
            addCriterion("source_hfmd_entity_attr_value like", value, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueNotLike(String value) {
            addCriterion("source_hfmd_entity_attr_value not like", value, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueIn(List<String> values) {
            addCriterion("source_hfmd_entity_attr_value in", values, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueNotIn(List<String> values) {
            addCriterion("source_hfmd_entity_attr_value not in", values, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueBetween(String value1, String value2) {
            addCriterion("source_hfmd_entity_attr_value between", value1, value2, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andSourceHfmdEntityAttrValueNotBetween(String value1, String value2) {
            addCriterion("source_hfmd_entity_attr_value not between", value1, value2, "sourceHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andJoinTypeIsNull() {
            addCriterion("join_type is null");
            return (Criteria) this;
        }

        public Criteria andJoinTypeIsNotNull() {
            addCriterion("join_type is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTypeEqualTo(Byte value) {
            addCriterion("join_type =", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeNotEqualTo(Byte value) {
            addCriterion("join_type <>", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeGreaterThan(Byte value) {
            addCriterion("join_type >", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("join_type >=", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeLessThan(Byte value) {
            addCriterion("join_type <", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeLessThanOrEqualTo(Byte value) {
            addCriterion("join_type <=", value, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeIn(List<Byte> values) {
            addCriterion("join_type in", values, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeNotIn(List<Byte> values) {
            addCriterion("join_type not in", values, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeBetween(Byte value1, Byte value2) {
            addCriterion("join_type between", value1, value2, "joinType");
            return (Criteria) this;
        }

        public Criteria andJoinTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("join_type not between", value1, value2, "joinType");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdIsNull() {
            addCriterion("target_hfmd_entity_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdIsNotNull() {
            addCriterion("target_hfmd_entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdEqualTo(Long value) {
            addCriterion("target_hfmd_entity_id =", value, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdNotEqualTo(Long value) {
            addCriterion("target_hfmd_entity_id <>", value, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdGreaterThan(Long value) {
            addCriterion("target_hfmd_entity_id >", value, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_hfmd_entity_id >=", value, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdLessThan(Long value) {
            addCriterion("target_hfmd_entity_id <", value, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("target_hfmd_entity_id <=", value, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdIn(List<Long> values) {
            addCriterion("target_hfmd_entity_id in", values, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdNotIn(List<Long> values) {
            addCriterion("target_hfmd_entity_id not in", values, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdBetween(Long value1, Long value2) {
            addCriterion("target_hfmd_entity_id between", value1, value2, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("target_hfmd_entity_id not between", value1, value2, "targetHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdIsNull() {
            addCriterion("target_hfmd_entity_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdIsNotNull() {
            addCriterion("target_hfmd_entity_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdEqualTo(Long value) {
            addCriterion("target_hfmd_entity_attr_id =", value, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdNotEqualTo(Long value) {
            addCriterion("target_hfmd_entity_attr_id <>", value, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdGreaterThan(Long value) {
            addCriterion("target_hfmd_entity_attr_id >", value, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_hfmd_entity_attr_id >=", value, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdLessThan(Long value) {
            addCriterion("target_hfmd_entity_attr_id <", value, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("target_hfmd_entity_attr_id <=", value, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdIn(List<Long> values) {
            addCriterion("target_hfmd_entity_attr_id in", values, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdNotIn(List<Long> values) {
            addCriterion("target_hfmd_entity_attr_id not in", values, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdBetween(Long value1, Long value2) {
            addCriterion("target_hfmd_entity_attr_id between", value1, value2, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("target_hfmd_entity_attr_id not between", value1, value2, "targetHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueIsNull() {
            addCriterion("target_hfmd_entity_attr_value is null");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueIsNotNull() {
            addCriterion("target_hfmd_entity_attr_value is not null");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueEqualTo(String value) {
            addCriterion("target_hfmd_entity_attr_value =", value, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueNotEqualTo(String value) {
            addCriterion("target_hfmd_entity_attr_value <>", value, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueGreaterThan(String value) {
            addCriterion("target_hfmd_entity_attr_value >", value, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("target_hfmd_entity_attr_value >=", value, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueLessThan(String value) {
            addCriterion("target_hfmd_entity_attr_value <", value, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueLessThanOrEqualTo(String value) {
            addCriterion("target_hfmd_entity_attr_value <=", value, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueLike(String value) {
            addCriterion("target_hfmd_entity_attr_value like", value, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueNotLike(String value) {
            addCriterion("target_hfmd_entity_attr_value not like", value, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueIn(List<String> values) {
            addCriterion("target_hfmd_entity_attr_value in", values, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueNotIn(List<String> values) {
            addCriterion("target_hfmd_entity_attr_value not in", values, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueBetween(String value1, String value2) {
            addCriterion("target_hfmd_entity_attr_value between", value1, value2, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andTargetHfmdEntityAttrValueNotBetween(String value1, String value2) {
            addCriterion("target_hfmd_entity_attr_value not between", value1, value2, "targetHfmdEntityAttrValue");
            return (Criteria) this;
        }

        public Criteria andEditableIsNull() {
            addCriterion("editable is null");
            return (Criteria) this;
        }

        public Criteria andEditableIsNotNull() {
            addCriterion("editable is not null");
            return (Criteria) this;
        }

        public Criteria andEditableEqualTo(Byte value) {
            addCriterion("editable =", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotEqualTo(Byte value) {
            addCriterion("editable <>", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableGreaterThan(Byte value) {
            addCriterion("editable >", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableGreaterThanOrEqualTo(Byte value) {
            addCriterion("editable >=", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLessThan(Byte value) {
            addCriterion("editable <", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLessThanOrEqualTo(Byte value) {
            addCriterion("editable <=", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableIn(List<Byte> values) {
            addCriterion("editable in", values, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotIn(List<Byte> values) {
            addCriterion("editable not in", values, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableBetween(Byte value1, Byte value2) {
            addCriterion("editable between", value1, value2, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotBetween(Byte value1, Byte value2) {
            addCriterion("editable not between", value1, value2, "editable");
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