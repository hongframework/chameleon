package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfusEntityStore_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfusEntityStore_Example() {
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

        public Criteria andHfusEntityStoreIdIsNull() {
            addCriterion("hfus_entity_store_id is null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdIsNotNull() {
            addCriterion("hfus_entity_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdEqualTo(Long value) {
            addCriterion("hfus_entity_store_id =", value, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdNotEqualTo(Long value) {
            addCriterion("hfus_entity_store_id <>", value, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdGreaterThan(Long value) {
            addCriterion("hfus_entity_store_id >", value, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfus_entity_store_id >=", value, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdLessThan(Long value) {
            addCriterion("hfus_entity_store_id <", value, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("hfus_entity_store_id <=", value, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdIn(List<Long> values) {
            addCriterion("hfus_entity_store_id in", values, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdNotIn(List<Long> values) {
            addCriterion("hfus_entity_store_id not in", values, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdBetween(Long value1, Long value2) {
            addCriterion("hfus_entity_store_id between", value1, value2, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("hfus_entity_store_id not between", value1, value2, "hfusEntityStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameIsNull() {
            addCriterion("hfus_entity_store_name is null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameIsNotNull() {
            addCriterion("hfus_entity_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameEqualTo(String value) {
            addCriterion("hfus_entity_store_name =", value, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameNotEqualTo(String value) {
            addCriterion("hfus_entity_store_name <>", value, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameGreaterThan(String value) {
            addCriterion("hfus_entity_store_name >", value, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfus_entity_store_name >=", value, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameLessThan(String value) {
            addCriterion("hfus_entity_store_name <", value, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameLessThanOrEqualTo(String value) {
            addCriterion("hfus_entity_store_name <=", value, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameLike(String value) {
            addCriterion("hfus_entity_store_name like", value, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameNotLike(String value) {
            addCriterion("hfus_entity_store_name not like", value, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameIn(List<String> values) {
            addCriterion("hfus_entity_store_name in", values, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameNotIn(List<String> values) {
            addCriterion("hfus_entity_store_name not in", values, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameBetween(String value1, String value2) {
            addCriterion("hfus_entity_store_name between", value1, value2, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreNameNotBetween(String value1, String value2) {
            addCriterion("hfus_entity_store_name not between", value1, value2, "hfusEntityStoreName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeIsNull() {
            addCriterion("hfus_entity_store_code is null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeIsNotNull() {
            addCriterion("hfus_entity_store_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeEqualTo(String value) {
            addCriterion("hfus_entity_store_code =", value, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeNotEqualTo(String value) {
            addCriterion("hfus_entity_store_code <>", value, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeGreaterThan(String value) {
            addCriterion("hfus_entity_store_code >", value, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfus_entity_store_code >=", value, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeLessThan(String value) {
            addCriterion("hfus_entity_store_code <", value, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeLessThanOrEqualTo(String value) {
            addCriterion("hfus_entity_store_code <=", value, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeLike(String value) {
            addCriterion("hfus_entity_store_code like", value, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeNotLike(String value) {
            addCriterion("hfus_entity_store_code not like", value, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeIn(List<String> values) {
            addCriterion("hfus_entity_store_code in", values, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeNotIn(List<String> values) {
            addCriterion("hfus_entity_store_code not in", values, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeBetween(String value1, String value2) {
            addCriterion("hfus_entity_store_code between", value1, value2, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreCodeNotBetween(String value1, String value2) {
            addCriterion("hfus_entity_store_code not between", value1, value2, "hfusEntityStoreCode");
            return (Criteria) this;
        }

        public Criteria andEntityGroupIsNull() {
            addCriterion("entity_group is null");
            return (Criteria) this;
        }

        public Criteria andEntityGroupIsNotNull() {
            addCriterion("entity_group is not null");
            return (Criteria) this;
        }

        public Criteria andEntityGroupEqualTo(Byte value) {
            addCriterion("entity_group =", value, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andEntityGroupNotEqualTo(Byte value) {
            addCriterion("entity_group <>", value, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andEntityGroupGreaterThan(Byte value) {
            addCriterion("entity_group >", value, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andEntityGroupGreaterThanOrEqualTo(Byte value) {
            addCriterion("entity_group >=", value, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andEntityGroupLessThan(Byte value) {
            addCriterion("entity_group <", value, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andEntityGroupLessThanOrEqualTo(Byte value) {
            addCriterion("entity_group <=", value, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andEntityGroupIn(List<Byte> values) {
            addCriterion("entity_group in", values, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andEntityGroupNotIn(List<Byte> values) {
            addCriterion("entity_group not in", values, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andEntityGroupBetween(Byte value1, Byte value2) {
            addCriterion("entity_group between", value1, value2, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andEntityGroupNotBetween(Byte value1, Byte value2) {
            addCriterion("entity_group not between", value1, value2, "entityGroup");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeIsNull() {
            addCriterion("hfus_entity_store_type is null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeIsNotNull() {
            addCriterion("hfus_entity_store_type is not null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeEqualTo(Byte value) {
            addCriterion("hfus_entity_store_type =", value, "hfusEntityStoreType");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeNotEqualTo(Byte value) {
            addCriterion("hfus_entity_store_type <>", value, "hfusEntityStoreType");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeGreaterThan(Byte value) {
            addCriterion("hfus_entity_store_type >", value, "hfusEntityStoreType");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("hfus_entity_store_type >=", value, "hfusEntityStoreType");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeLessThan(Byte value) {
            addCriterion("hfus_entity_store_type <", value, "hfusEntityStoreType");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeLessThanOrEqualTo(Byte value) {
            addCriterion("hfus_entity_store_type <=", value, "hfusEntityStoreType");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeIn(List<Byte> values) {
            addCriterion("hfus_entity_store_type in", values, "hfusEntityStoreType");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeNotIn(List<Byte> values) {
            addCriterion("hfus_entity_store_type not in", values, "hfusEntityStoreType");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeBetween(Byte value1, Byte value2) {
            addCriterion("hfus_entity_store_type between", value1, value2, "hfusEntityStoreType");
            return (Criteria) this;
        }

        public Criteria andHfusEntityStoreTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("hfus_entity_store_type not between", value1, value2, "hfusEntityStoreType");
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