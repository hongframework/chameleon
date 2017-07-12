package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfpmFieldShowType_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfpmFieldShowType_Example() {
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

        public Criteria andHfpmFieldShowTypeIdIsNull() {
            addCriterion("hfpm_field_show_type_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdIsNotNull() {
            addCriterion("hfpm_field_show_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdEqualTo(Long value) {
            addCriterion("hfpm_field_show_type_id =", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdNotEqualTo(Long value) {
            addCriterion("hfpm_field_show_type_id <>", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdGreaterThan(Long value) {
            addCriterion("hfpm_field_show_type_id >", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfpm_field_show_type_id >=", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdLessThan(Long value) {
            addCriterion("hfpm_field_show_type_id <", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("hfpm_field_show_type_id <=", value, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdIn(List<Long> values) {
            addCriterion("hfpm_field_show_type_id in", values, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdNotIn(List<Long> values) {
            addCriterion("hfpm_field_show_type_id not in", values, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdBetween(Long value1, Long value2) {
            addCriterion("hfpm_field_show_type_id between", value1, value2, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("hfpm_field_show_type_id not between", value1, value2, "hfpmFieldShowTypeId");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeIsNull() {
            addCriterion("hfpm_field_show_type_code is null");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeIsNotNull() {
            addCriterion("hfpm_field_show_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeEqualTo(String value) {
            addCriterion("hfpm_field_show_type_code =", value, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeNotEqualTo(String value) {
            addCriterion("hfpm_field_show_type_code <>", value, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeGreaterThan(String value) {
            addCriterion("hfpm_field_show_type_code >", value, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_field_show_type_code >=", value, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeLessThan(String value) {
            addCriterion("hfpm_field_show_type_code <", value, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("hfpm_field_show_type_code <=", value, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeLike(String value) {
            addCriterion("hfpm_field_show_type_code like", value, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeNotLike(String value) {
            addCriterion("hfpm_field_show_type_code not like", value, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeIn(List<String> values) {
            addCriterion("hfpm_field_show_type_code in", values, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeNotIn(List<String> values) {
            addCriterion("hfpm_field_show_type_code not in", values, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeBetween(String value1, String value2) {
            addCriterion("hfpm_field_show_type_code between", value1, value2, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeCodeNotBetween(String value1, String value2) {
            addCriterion("hfpm_field_show_type_code not between", value1, value2, "hfpmFieldShowTypeCode");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameIsNull() {
            addCriterion("hfpm_field_show_type_name is null");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameIsNotNull() {
            addCriterion("hfpm_field_show_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameEqualTo(String value) {
            addCriterion("hfpm_field_show_type_name =", value, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameNotEqualTo(String value) {
            addCriterion("hfpm_field_show_type_name <>", value, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameGreaterThan(String value) {
            addCriterion("hfpm_field_show_type_name >", value, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_field_show_type_name >=", value, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameLessThan(String value) {
            addCriterion("hfpm_field_show_type_name <", value, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameLessThanOrEqualTo(String value) {
            addCriterion("hfpm_field_show_type_name <=", value, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameLike(String value) {
            addCriterion("hfpm_field_show_type_name like", value, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameNotLike(String value) {
            addCriterion("hfpm_field_show_type_name not like", value, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameIn(List<String> values) {
            addCriterion("hfpm_field_show_type_name in", values, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameNotIn(List<String> values) {
            addCriterion("hfpm_field_show_type_name not in", values, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameBetween(String value1, String value2) {
            addCriterion("hfpm_field_show_type_name between", value1, value2, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andHfpmFieldShowTypeNameNotBetween(String value1, String value2) {
            addCriterion("hfpm_field_show_type_name not between", value1, value2, "hfpmFieldShowTypeName");
            return (Criteria) this;
        }

        public Criteria andPreStrIsNull() {
            addCriterion("pre_str is null");
            return (Criteria) this;
        }

        public Criteria andPreStrIsNotNull() {
            addCriterion("pre_str is not null");
            return (Criteria) this;
        }

        public Criteria andPreStrEqualTo(String value) {
            addCriterion("pre_str =", value, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrNotEqualTo(String value) {
            addCriterion("pre_str <>", value, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrGreaterThan(String value) {
            addCriterion("pre_str >", value, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrGreaterThanOrEqualTo(String value) {
            addCriterion("pre_str >=", value, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrLessThan(String value) {
            addCriterion("pre_str <", value, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrLessThanOrEqualTo(String value) {
            addCriterion("pre_str <=", value, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrLike(String value) {
            addCriterion("pre_str like", value, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrNotLike(String value) {
            addCriterion("pre_str not like", value, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrIn(List<String> values) {
            addCriterion("pre_str in", values, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrNotIn(List<String> values) {
            addCriterion("pre_str not in", values, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrBetween(String value1, String value2) {
            addCriterion("pre_str between", value1, value2, "preStr");
            return (Criteria) this;
        }

        public Criteria andPreStrNotBetween(String value1, String value2) {
            addCriterion("pre_str not between", value1, value2, "preStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrIsNull() {
            addCriterion("after_str is null");
            return (Criteria) this;
        }

        public Criteria andAfterStrIsNotNull() {
            addCriterion("after_str is not null");
            return (Criteria) this;
        }

        public Criteria andAfterStrEqualTo(String value) {
            addCriterion("after_str =", value, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrNotEqualTo(String value) {
            addCriterion("after_str <>", value, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrGreaterThan(String value) {
            addCriterion("after_str >", value, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrGreaterThanOrEqualTo(String value) {
            addCriterion("after_str >=", value, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrLessThan(String value) {
            addCriterion("after_str <", value, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrLessThanOrEqualTo(String value) {
            addCriterion("after_str <=", value, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrLike(String value) {
            addCriterion("after_str like", value, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrNotLike(String value) {
            addCriterion("after_str not like", value, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrIn(List<String> values) {
            addCriterion("after_str in", values, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrNotIn(List<String> values) {
            addCriterion("after_str not in", values, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrBetween(String value1, String value2) {
            addCriterion("after_str between", value1, value2, "afterStr");
            return (Criteria) this;
        }

        public Criteria andAfterStrNotBetween(String value1, String value2) {
            addCriterion("after_str not between", value1, value2, "afterStr");
            return (Criteria) this;
        }

        public Criteria andColSpanIsNull() {
            addCriterion("col_span is null");
            return (Criteria) this;
        }

        public Criteria andColSpanIsNotNull() {
            addCriterion("col_span is not null");
            return (Criteria) this;
        }

        public Criteria andColSpanEqualTo(Integer value) {
            addCriterion("col_span =", value, "colSpan");
            return (Criteria) this;
        }

        public Criteria andColSpanNotEqualTo(Integer value) {
            addCriterion("col_span <>", value, "colSpan");
            return (Criteria) this;
        }

        public Criteria andColSpanGreaterThan(Integer value) {
            addCriterion("col_span >", value, "colSpan");
            return (Criteria) this;
        }

        public Criteria andColSpanGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_span >=", value, "colSpan");
            return (Criteria) this;
        }

        public Criteria andColSpanLessThan(Integer value) {
            addCriterion("col_span <", value, "colSpan");
            return (Criteria) this;
        }

        public Criteria andColSpanLessThanOrEqualTo(Integer value) {
            addCriterion("col_span <=", value, "colSpan");
            return (Criteria) this;
        }

        public Criteria andColSpanIn(List<Integer> values) {
            addCriterion("col_span in", values, "colSpan");
            return (Criteria) this;
        }

        public Criteria andColSpanNotIn(List<Integer> values) {
            addCriterion("col_span not in", values, "colSpan");
            return (Criteria) this;
        }

        public Criteria andColSpanBetween(Integer value1, Integer value2) {
            addCriterion("col_span between", value1, value2, "colSpan");
            return (Criteria) this;
        }

        public Criteria andColSpanNotBetween(Integer value1, Integer value2) {
            addCriterion("col_span not between", value1, value2, "colSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanIsNull() {
            addCriterion("row_span is null");
            return (Criteria) this;
        }

        public Criteria andRowSpanIsNotNull() {
            addCriterion("row_span is not null");
            return (Criteria) this;
        }

        public Criteria andRowSpanEqualTo(Integer value) {
            addCriterion("row_span =", value, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanNotEqualTo(Integer value) {
            addCriterion("row_span <>", value, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanGreaterThan(Integer value) {
            addCriterion("row_span >", value, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanGreaterThanOrEqualTo(Integer value) {
            addCriterion("row_span >=", value, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanLessThan(Integer value) {
            addCriterion("row_span <", value, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanLessThanOrEqualTo(Integer value) {
            addCriterion("row_span <=", value, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanIn(List<Integer> values) {
            addCriterion("row_span in", values, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanNotIn(List<Integer> values) {
            addCriterion("row_span not in", values, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanBetween(Integer value1, Integer value2) {
            addCriterion("row_span between", value1, value2, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andRowSpanNotBetween(Integer value1, Integer value2) {
            addCriterion("row_span not between", value1, value2, "rowSpan");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andParam1IsNull() {
            addCriterion("param1 is null");
            return (Criteria) this;
        }

        public Criteria andParam1IsNotNull() {
            addCriterion("param1 is not null");
            return (Criteria) this;
        }

        public Criteria andParam1EqualTo(String value) {
            addCriterion("param1 =", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotEqualTo(String value) {
            addCriterion("param1 <>", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThan(String value) {
            addCriterion("param1 >", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThanOrEqualTo(String value) {
            addCriterion("param1 >=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThan(String value) {
            addCriterion("param1 <", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThanOrEqualTo(String value) {
            addCriterion("param1 <=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Like(String value) {
            addCriterion("param1 like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotLike(String value) {
            addCriterion("param1 not like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1In(List<String> values) {
            addCriterion("param1 in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotIn(List<String> values) {
            addCriterion("param1 not in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Between(String value1, String value2) {
            addCriterion("param1 between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotBetween(String value1, String value2) {
            addCriterion("param1 not between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam2IsNull() {
            addCriterion("param2 is null");
            return (Criteria) this;
        }

        public Criteria andParam2IsNotNull() {
            addCriterion("param2 is not null");
            return (Criteria) this;
        }

        public Criteria andParam2EqualTo(String value) {
            addCriterion("param2 =", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotEqualTo(String value) {
            addCriterion("param2 <>", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThan(String value) {
            addCriterion("param2 >", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThanOrEqualTo(String value) {
            addCriterion("param2 >=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThan(String value) {
            addCriterion("param2 <", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThanOrEqualTo(String value) {
            addCriterion("param2 <=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Like(String value) {
            addCriterion("param2 like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotLike(String value) {
            addCriterion("param2 not like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2In(List<String> values) {
            addCriterion("param2 in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotIn(List<String> values) {
            addCriterion("param2 not in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Between(String value1, String value2) {
            addCriterion("param2 between", value1, value2, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotBetween(String value1, String value2) {
            addCriterion("param2 not between", value1, value2, "param2");
            return (Criteria) this;
        }

        public Criteria andParam3IsNull() {
            addCriterion("param3 is null");
            return (Criteria) this;
        }

        public Criteria andParam3IsNotNull() {
            addCriterion("param3 is not null");
            return (Criteria) this;
        }

        public Criteria andParam3EqualTo(String value) {
            addCriterion("param3 =", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotEqualTo(String value) {
            addCriterion("param3 <>", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3GreaterThan(String value) {
            addCriterion("param3 >", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3GreaterThanOrEqualTo(String value) {
            addCriterion("param3 >=", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3LessThan(String value) {
            addCriterion("param3 <", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3LessThanOrEqualTo(String value) {
            addCriterion("param3 <=", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3Like(String value) {
            addCriterion("param3 like", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotLike(String value) {
            addCriterion("param3 not like", value, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3In(List<String> values) {
            addCriterion("param3 in", values, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotIn(List<String> values) {
            addCriterion("param3 not in", values, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3Between(String value1, String value2) {
            addCriterion("param3 between", value1, value2, "param3");
            return (Criteria) this;
        }

        public Criteria andParam3NotBetween(String value1, String value2) {
            addCriterion("param3 not between", value1, value2, "param3");
            return (Criteria) this;
        }

        public Criteria andParam4IsNull() {
            addCriterion("param4 is null");
            return (Criteria) this;
        }

        public Criteria andParam4IsNotNull() {
            addCriterion("param4 is not null");
            return (Criteria) this;
        }

        public Criteria andParam4EqualTo(String value) {
            addCriterion("param4 =", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotEqualTo(String value) {
            addCriterion("param4 <>", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4GreaterThan(String value) {
            addCriterion("param4 >", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4GreaterThanOrEqualTo(String value) {
            addCriterion("param4 >=", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4LessThan(String value) {
            addCriterion("param4 <", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4LessThanOrEqualTo(String value) {
            addCriterion("param4 <=", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4Like(String value) {
            addCriterion("param4 like", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotLike(String value) {
            addCriterion("param4 not like", value, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4In(List<String> values) {
            addCriterion("param4 in", values, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotIn(List<String> values) {
            addCriterion("param4 not in", values, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4Between(String value1, String value2) {
            addCriterion("param4 between", value1, value2, "param4");
            return (Criteria) this;
        }

        public Criteria andParam4NotBetween(String value1, String value2) {
            addCriterion("param4 not between", value1, value2, "param4");
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