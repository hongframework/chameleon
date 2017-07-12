package com.hframe.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfpmDataField_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfpmDataField_Example() {
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

        public Criteria andHfpmDataFieldIdIsNull() {
            addCriterion("hfpm_data_field_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdIsNotNull() {
            addCriterion("hfpm_data_field_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdEqualTo(Long value) {
            addCriterion("hfpm_data_field_id =", value, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdNotEqualTo(Long value) {
            addCriterion("hfpm_data_field_id <>", value, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdGreaterThan(Long value) {
            addCriterion("hfpm_data_field_id >", value, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfpm_data_field_id >=", value, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdLessThan(Long value) {
            addCriterion("hfpm_data_field_id <", value, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdLessThanOrEqualTo(Long value) {
            addCriterion("hfpm_data_field_id <=", value, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdIn(List<Long> values) {
            addCriterion("hfpm_data_field_id in", values, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdNotIn(List<Long> values) {
            addCriterion("hfpm_data_field_id not in", values, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdBetween(Long value1, Long value2) {
            addCriterion("hfpm_data_field_id between", value1, value2, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldIdNotBetween(Long value1, Long value2) {
            addCriterion("hfpm_data_field_id not between", value1, value2, "hfpmDataFieldId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeIsNull() {
            addCriterion("hfpm_data_field_code is null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeIsNotNull() {
            addCriterion("hfpm_data_field_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeEqualTo(String value) {
            addCriterion("hfpm_data_field_code =", value, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeNotEqualTo(String value) {
            addCriterion("hfpm_data_field_code <>", value, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeGreaterThan(String value) {
            addCriterion("hfpm_data_field_code >", value, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_data_field_code >=", value, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeLessThan(String value) {
            addCriterion("hfpm_data_field_code <", value, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeLessThanOrEqualTo(String value) {
            addCriterion("hfpm_data_field_code <=", value, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeLike(String value) {
            addCriterion("hfpm_data_field_code like", value, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeNotLike(String value) {
            addCriterion("hfpm_data_field_code not like", value, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeIn(List<String> values) {
            addCriterion("hfpm_data_field_code in", values, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeNotIn(List<String> values) {
            addCriterion("hfpm_data_field_code not in", values, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeBetween(String value1, String value2) {
            addCriterion("hfpm_data_field_code between", value1, value2, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldCodeNotBetween(String value1, String value2) {
            addCriterion("hfpm_data_field_code not between", value1, value2, "hfpmDataFieldCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdIsNull() {
            addCriterion("hfpm_field_show_type_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdIsNotNull() {
            addCriterion("hfpm_field_show_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdEqualTo(String value) {
            addCriterion("hfpm_field_show_type_id =", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdNotEqualTo(String value) {
            addCriterion("hfpm_field_show_type_id <>", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdGreaterThan(String value) {
            addCriterion("hfpm_field_show_type_id >", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_field_show_type_id >=", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdLessThan(String value) {
            addCriterion("hfpm_field_show_type_id <", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdLessThanOrEqualTo(String value) {
            addCriterion("hfpm_field_show_type_id <=", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdLike(String value) {
            addCriterion("hfpm_field_show_type_id like", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdNotLike(String value) {
            addCriterion("hfpm_field_show_type_id not like", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdIn(List<String> values) {
            addCriterion("hfpm_field_show_type_id in", values, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdNotIn(List<String> values) {
            addCriterion("hfpm_field_show_type_id not in", values, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdBetween(String value1, String value2) {
            addCriterion("hfpm_field_show_type_id between", value1, value2, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdNotBetween(String value1, String value2) {
            addCriterion("hfpm_field_show_type_id not between", value1, value2, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeIsNull() {
            addCriterion("field_show_code is null");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeIsNotNull() {
            addCriterion("field_show_code is not null");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeEqualTo(String value) {
            addCriterion("field_show_code =", value, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeNotEqualTo(String value) {
            addCriterion("field_show_code <>", value, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeGreaterThan(String value) {
            addCriterion("field_show_code >", value, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeGreaterThanOrEqualTo(String value) {
            addCriterion("field_show_code >=", value, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeLessThan(String value) {
            addCriterion("field_show_code <", value, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeLessThanOrEqualTo(String value) {
            addCriterion("field_show_code <=", value, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeLike(String value) {
            addCriterion("field_show_code like", value, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeNotLike(String value) {
            addCriterion("field_show_code not like", value, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeIn(List<String> values) {
            addCriterion("field_show_code in", values, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeNotIn(List<String> values) {
            addCriterion("field_show_code not in", values, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeBetween(String value1, String value2) {
            addCriterion("field_show_code between", value1, value2, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andFieldShowCodeNotBetween(String value1, String value2) {
            addCriterion("field_show_code not between", value1, value2, "fieldShowCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdIsNull() {
            addCriterion("hfmd_entity_id is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdIsNotNull() {
            addCriterion("hfmd_entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdEqualTo(Long value) {
            addCriterion("hfmd_entity_id =", value, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdNotEqualTo(Long value) {
            addCriterion("hfmd_entity_id <>", value, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdGreaterThan(Long value) {
            addCriterion("hfmd_entity_id >", value, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfmd_entity_id >=", value, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdLessThan(Long value) {
            addCriterion("hfmd_entity_id <", value, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("hfmd_entity_id <=", value, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdIn(List<Long> values) {
            addCriterion("hfmd_entity_id in", values, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdNotIn(List<Long> values) {
            addCriterion("hfmd_entity_id not in", values, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdBetween(Long value1, Long value2) {
            addCriterion("hfmd_entity_id between", value1, value2, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("hfmd_entity_id not between", value1, value2, "hfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdIsNull() {
            addCriterion("hfmd_entity_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdIsNotNull() {
            addCriterion("hfmd_entity_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdEqualTo(Long value) {
            addCriterion("hfmd_entity_attr_id =", value, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdNotEqualTo(Long value) {
            addCriterion("hfmd_entity_attr_id <>", value, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdGreaterThan(Long value) {
            addCriterion("hfmd_entity_attr_id >", value, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfmd_entity_attr_id >=", value, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdLessThan(Long value) {
            addCriterion("hfmd_entity_attr_id <", value, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("hfmd_entity_attr_id <=", value, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdIn(List<Long> values) {
            addCriterion("hfmd_entity_attr_id in", values, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdNotIn(List<Long> values) {
            addCriterion("hfmd_entity_attr_id not in", values, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdBetween(Long value1, Long value2) {
            addCriterion("hfmd_entity_attr_id between", value1, value2, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("hfmd_entity_attr_id not between", value1, value2, "hfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodIsNull() {
            addCriterion("data_get_method is null");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodIsNotNull() {
            addCriterion("data_get_method is not null");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodEqualTo(Integer value) {
            addCriterion("data_get_method =", value, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodNotEqualTo(Integer value) {
            addCriterion("data_get_method <>", value, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodGreaterThan(Integer value) {
            addCriterion("data_get_method >", value, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_get_method >=", value, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodLessThan(Integer value) {
            addCriterion("data_get_method <", value, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodLessThanOrEqualTo(Integer value) {
            addCriterion("data_get_method <=", value, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodIn(List<Integer> values) {
            addCriterion("data_get_method in", values, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodNotIn(List<Integer> values) {
            addCriterion("data_get_method not in", values, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodBetween(Integer value1, Integer value2) {
            addCriterion("data_get_method between", value1, value2, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andDataGetMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("data_get_method not between", value1, value2, "dataGetMethod");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameIsNull() {
            addCriterion("hfpm_data_field_name is null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameIsNotNull() {
            addCriterion("hfpm_data_field_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameEqualTo(String value) {
            addCriterion("hfpm_data_field_name =", value, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameNotEqualTo(String value) {
            addCriterion("hfpm_data_field_name <>", value, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameGreaterThan(String value) {
            addCriterion("hfpm_data_field_name >", value, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_data_field_name >=", value, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameLessThan(String value) {
            addCriterion("hfpm_data_field_name <", value, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameLessThanOrEqualTo(String value) {
            addCriterion("hfpm_data_field_name <=", value, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameLike(String value) {
            addCriterion("hfpm_data_field_name like", value, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameNotLike(String value) {
            addCriterion("hfpm_data_field_name not like", value, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameIn(List<String> values) {
            addCriterion("hfpm_data_field_name in", values, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameNotIn(List<String> values) {
            addCriterion("hfpm_data_field_name not in", values, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameBetween(String value1, String value2) {
            addCriterion("hfpm_data_field_name between", value1, value2, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataFieldNameNotBetween(String value1, String value2) {
            addCriterion("hfpm_data_field_name not between", value1, value2, "hfpmDataFieldName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdIsNull() {
            addCriterion("hfpm_data_set_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdIsNotNull() {
            addCriterion("hfpm_data_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdEqualTo(Long value) {
            addCriterion("hfpm_data_set_id =", value, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdNotEqualTo(Long value) {
            addCriterion("hfpm_data_set_id <>", value, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdGreaterThan(Long value) {
            addCriterion("hfpm_data_set_id >", value, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfpm_data_set_id >=", value, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdLessThan(Long value) {
            addCriterion("hfpm_data_set_id <", value, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdLessThanOrEqualTo(Long value) {
            addCriterion("hfpm_data_set_id <=", value, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdIn(List<Long> values) {
            addCriterion("hfpm_data_set_id in", values, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdNotIn(List<Long> values) {
            addCriterion("hfpm_data_set_id not in", values, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdBetween(Long value1, Long value2) {
            addCriterion("hfpm_data_set_id between", value1, value2, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetIdNotBetween(Long value1, Long value2) {
            addCriterion("hfpm_data_set_id not between", value1, value2, "hfpmDataSetId");
            return (Criteria) this;
        }

        public Criteria andPriIsNull() {
            addCriterion("pri is null");
            return (Criteria) this;
        }

        public Criteria andPriIsNotNull() {
            addCriterion("pri is not null");
            return (Criteria) this;
        }

        public Criteria andPriEqualTo(BigDecimal value) {
            addCriterion("pri =", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotEqualTo(BigDecimal value) {
            addCriterion("pri <>", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThan(BigDecimal value) {
            addCriterion("pri >", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pri >=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThan(BigDecimal value) {
            addCriterion("pri <", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pri <=", value, "pri");
            return (Criteria) this;
        }

        public Criteria andPriIn(List<BigDecimal> values) {
            addCriterion("pri in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotIn(List<BigDecimal> values) {
            addCriterion("pri not in", values, "pri");
            return (Criteria) this;
        }

        public Criteria andPriBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pri between", value1, value2, "pri");
            return (Criteria) this;
        }

        public Criteria andPriNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pri not between", value1, value2, "pri");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNull() {
            addCriterion("op_id is null");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNotNull() {
            addCriterion("op_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpIdEqualTo(Long value) {
            addCriterion("op_id =", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotEqualTo(Long value) {
            addCriterion("op_id <>", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThan(Long value) {
            addCriterion("op_id >", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("op_id >=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThan(Long value) {
            addCriterion("op_id <", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThanOrEqualTo(Long value) {
            addCriterion("op_id <=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdIn(List<Long> values) {
            addCriterion("op_id in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotIn(List<Long> values) {
            addCriterion("op_id not in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdBetween(Long value1, Long value2) {
            addCriterion("op_id between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotBetween(Long value1, Long value2) {
            addCriterion("op_id not between", value1, value2, "opId");
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

        public Criteria andModifyOpIdIsNull() {
            addCriterion("modify_op_id is null");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdIsNotNull() {
            addCriterion("modify_op_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdEqualTo(Long value) {
            addCriterion("modify_op_id =", value, "modifyOpId");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdNotEqualTo(Long value) {
            addCriterion("modify_op_id <>", value, "modifyOpId");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdGreaterThan(Long value) {
            addCriterion("modify_op_id >", value, "modifyOpId");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("modify_op_id >=", value, "modifyOpId");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdLessThan(Long value) {
            addCriterion("modify_op_id <", value, "modifyOpId");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdLessThanOrEqualTo(Long value) {
            addCriterion("modify_op_id <=", value, "modifyOpId");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdIn(List<Long> values) {
            addCriterion("modify_op_id in", values, "modifyOpId");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdNotIn(List<Long> values) {
            addCriterion("modify_op_id not in", values, "modifyOpId");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdBetween(Long value1, Long value2) {
            addCriterion("modify_op_id between", value1, value2, "modifyOpId");
            return (Criteria) this;
        }

        public Criteria andModifyOpIdNotBetween(Long value1, Long value2) {
            addCriterion("modify_op_id not between", value1, value2, "modifyOpId");
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

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthIsNull() {
            addCriterion("create_edit_auth is null");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthIsNotNull() {
            addCriterion("create_edit_auth is not null");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthEqualTo(Byte value) {
            addCriterion("create_edit_auth =", value, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthNotEqualTo(Byte value) {
            addCriterion("create_edit_auth <>", value, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthGreaterThan(Byte value) {
            addCriterion("create_edit_auth >", value, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthGreaterThanOrEqualTo(Byte value) {
            addCriterion("create_edit_auth >=", value, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthLessThan(Byte value) {
            addCriterion("create_edit_auth <", value, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthLessThanOrEqualTo(Byte value) {
            addCriterion("create_edit_auth <=", value, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthIn(List<Byte> values) {
            addCriterion("create_edit_auth in", values, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthNotIn(List<Byte> values) {
            addCriterion("create_edit_auth not in", values, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthBetween(Byte value1, Byte value2) {
            addCriterion("create_edit_auth between", value1, value2, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andCreateEditAuthNotBetween(Byte value1, Byte value2) {
            addCriterion("create_edit_auth not between", value1, value2, "createEditAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthIsNull() {
            addCriterion("detail_show_auth is null");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthIsNotNull() {
            addCriterion("detail_show_auth is not null");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthEqualTo(Byte value) {
            addCriterion("detail_show_auth =", value, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthNotEqualTo(Byte value) {
            addCriterion("detail_show_auth <>", value, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthGreaterThan(Byte value) {
            addCriterion("detail_show_auth >", value, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthGreaterThanOrEqualTo(Byte value) {
            addCriterion("detail_show_auth >=", value, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthLessThan(Byte value) {
            addCriterion("detail_show_auth <", value, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthLessThanOrEqualTo(Byte value) {
            addCriterion("detail_show_auth <=", value, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthIn(List<Byte> values) {
            addCriterion("detail_show_auth in", values, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthNotIn(List<Byte> values) {
            addCriterion("detail_show_auth not in", values, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthBetween(Byte value1, Byte value2) {
            addCriterion("detail_show_auth between", value1, value2, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andDetailShowAuthNotBetween(Byte value1, Byte value2) {
            addCriterion("detail_show_auth not between", value1, value2, "detailShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthIsNull() {
            addCriterion("list_show_auth is null");
            return (Criteria) this;
        }

        public Criteria andListShowAuthIsNotNull() {
            addCriterion("list_show_auth is not null");
            return (Criteria) this;
        }

        public Criteria andListShowAuthEqualTo(Byte value) {
            addCriterion("list_show_auth =", value, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthNotEqualTo(Byte value) {
            addCriterion("list_show_auth <>", value, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthGreaterThan(Byte value) {
            addCriterion("list_show_auth >", value, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthGreaterThanOrEqualTo(Byte value) {
            addCriterion("list_show_auth >=", value, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthLessThan(Byte value) {
            addCriterion("list_show_auth <", value, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthLessThanOrEqualTo(Byte value) {
            addCriterion("list_show_auth <=", value, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthIn(List<Byte> values) {
            addCriterion("list_show_auth in", values, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthNotIn(List<Byte> values) {
            addCriterion("list_show_auth not in", values, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthBetween(Byte value1, Byte value2) {
            addCriterion("list_show_auth between", value1, value2, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andListShowAuthNotBetween(Byte value1, Byte value2) {
            addCriterion("list_show_auth not between", value1, value2, "listShowAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthIsNull() {
            addCriterion("update_edit_auth is null");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthIsNotNull() {
            addCriterion("update_edit_auth is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthEqualTo(Byte value) {
            addCriterion("update_edit_auth =", value, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthNotEqualTo(Byte value) {
            addCriterion("update_edit_auth <>", value, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthGreaterThan(Byte value) {
            addCriterion("update_edit_auth >", value, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthGreaterThanOrEqualTo(Byte value) {
            addCriterion("update_edit_auth >=", value, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthLessThan(Byte value) {
            addCriterion("update_edit_auth <", value, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthLessThanOrEqualTo(Byte value) {
            addCriterion("update_edit_auth <=", value, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthIn(List<Byte> values) {
            addCriterion("update_edit_auth in", values, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthNotIn(List<Byte> values) {
            addCriterion("update_edit_auth not in", values, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthBetween(Byte value1, Byte value2) {
            addCriterion("update_edit_auth between", value1, value2, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andUpdateEditAuthNotBetween(Byte value1, Byte value2) {
            addCriterion("update_edit_auth not between", value1, value2, "updateEditAuth");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdIsNull() {
            addCriterion("workfow_model_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdIsNotNull() {
            addCriterion("workfow_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdEqualTo(String value) {
            addCriterion("workfow_model_id =", value, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdNotEqualTo(String value) {
            addCriterion("workfow_model_id <>", value, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdGreaterThan(String value) {
            addCriterion("workfow_model_id >", value, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdGreaterThanOrEqualTo(String value) {
            addCriterion("workfow_model_id >=", value, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdLessThan(String value) {
            addCriterion("workfow_model_id <", value, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdLessThanOrEqualTo(String value) {
            addCriterion("workfow_model_id <=", value, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdLike(String value) {
            addCriterion("workfow_model_id like", value, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdNotLike(String value) {
            addCriterion("workfow_model_id not like", value, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdIn(List<String> values) {
            addCriterion("workfow_model_id in", values, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdNotIn(List<String> values) {
            addCriterion("workfow_model_id not in", values, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdBetween(String value1, String value2) {
            addCriterion("workfow_model_id between", value1, value2, "workfowModelId");
            return (Criteria) this;
        }

        public Criteria andWorkfowModelIdNotBetween(String value1, String value2) {
            addCriterion("workfow_model_id not between", value1, value2, "workfowModelId");
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