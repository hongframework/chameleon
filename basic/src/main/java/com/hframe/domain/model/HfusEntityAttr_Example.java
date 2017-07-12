package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfusEntityAttr_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfusEntityAttr_Example() {
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

        public Criteria andHfusEntityAttrIdIsNull() {
            addCriterion("hfus_entity_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdIsNotNull() {
            addCriterion("hfus_entity_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdEqualTo(Long value) {
            addCriterion("hfus_entity_attr_id =", value, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdNotEqualTo(Long value) {
            addCriterion("hfus_entity_attr_id <>", value, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdGreaterThan(Long value) {
            addCriterion("hfus_entity_attr_id >", value, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfus_entity_attr_id >=", value, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdLessThan(Long value) {
            addCriterion("hfus_entity_attr_id <", value, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("hfus_entity_attr_id <=", value, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdIn(List<Long> values) {
            addCriterion("hfus_entity_attr_id in", values, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdNotIn(List<Long> values) {
            addCriterion("hfus_entity_attr_id not in", values, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdBetween(Long value1, Long value2) {
            addCriterion("hfus_entity_attr_id between", value1, value2, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("hfus_entity_attr_id not between", value1, value2, "hfusEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameIsNull() {
            addCriterion("hfus_entity_attr_name is null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameIsNotNull() {
            addCriterion("hfus_entity_attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameEqualTo(String value) {
            addCriterion("hfus_entity_attr_name =", value, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameNotEqualTo(String value) {
            addCriterion("hfus_entity_attr_name <>", value, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameGreaterThan(String value) {
            addCriterion("hfus_entity_attr_name >", value, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfus_entity_attr_name >=", value, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameLessThan(String value) {
            addCriterion("hfus_entity_attr_name <", value, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameLessThanOrEqualTo(String value) {
            addCriterion("hfus_entity_attr_name <=", value, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameLike(String value) {
            addCriterion("hfus_entity_attr_name like", value, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameNotLike(String value) {
            addCriterion("hfus_entity_attr_name not like", value, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameIn(List<String> values) {
            addCriterion("hfus_entity_attr_name in", values, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameNotIn(List<String> values) {
            addCriterion("hfus_entity_attr_name not in", values, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameBetween(String value1, String value2) {
            addCriterion("hfus_entity_attr_name between", value1, value2, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrNameNotBetween(String value1, String value2) {
            addCriterion("hfus_entity_attr_name not between", value1, value2, "hfusEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeIsNull() {
            addCriterion("hfus_entity_attr_code is null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeIsNotNull() {
            addCriterion("hfus_entity_attr_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeEqualTo(String value) {
            addCriterion("hfus_entity_attr_code =", value, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeNotEqualTo(String value) {
            addCriterion("hfus_entity_attr_code <>", value, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeGreaterThan(String value) {
            addCriterion("hfus_entity_attr_code >", value, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfus_entity_attr_code >=", value, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeLessThan(String value) {
            addCriterion("hfus_entity_attr_code <", value, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeLessThanOrEqualTo(String value) {
            addCriterion("hfus_entity_attr_code <=", value, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeLike(String value) {
            addCriterion("hfus_entity_attr_code like", value, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeNotLike(String value) {
            addCriterion("hfus_entity_attr_code not like", value, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeIn(List<String> values) {
            addCriterion("hfus_entity_attr_code in", values, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeNotIn(List<String> values) {
            addCriterion("hfus_entity_attr_code not in", values, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeBetween(String value1, String value2) {
            addCriterion("hfus_entity_attr_code between", value1, value2, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrCodeNotBetween(String value1, String value2) {
            addCriterion("hfus_entity_attr_code not between", value1, value2, "hfusEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescIsNull() {
            addCriterion("hfus_entity_attr_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescIsNotNull() {
            addCriterion("hfus_entity_attr_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescEqualTo(String value) {
            addCriterion("hfus_entity_attr_desc =", value, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescNotEqualTo(String value) {
            addCriterion("hfus_entity_attr_desc <>", value, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescGreaterThan(String value) {
            addCriterion("hfus_entity_attr_desc >", value, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescGreaterThanOrEqualTo(String value) {
            addCriterion("hfus_entity_attr_desc >=", value, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescLessThan(String value) {
            addCriterion("hfus_entity_attr_desc <", value, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescLessThanOrEqualTo(String value) {
            addCriterion("hfus_entity_attr_desc <=", value, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescLike(String value) {
            addCriterion("hfus_entity_attr_desc like", value, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescNotLike(String value) {
            addCriterion("hfus_entity_attr_desc not like", value, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescIn(List<String> values) {
            addCriterion("hfus_entity_attr_desc in", values, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescNotIn(List<String> values) {
            addCriterion("hfus_entity_attr_desc not in", values, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescBetween(String value1, String value2) {
            addCriterion("hfus_entity_attr_desc between", value1, value2, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfusEntityAttrDescNotBetween(String value1, String value2) {
            addCriterion("hfus_entity_attr_desc not between", value1, value2, "hfusEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNull() {
            addCriterion("attr_type is null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIsNotNull() {
            addCriterion("attr_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttrTypeEqualTo(Integer value) {
            addCriterion("attr_type =", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotEqualTo(Integer value) {
            addCriterion("attr_type <>", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThan(Integer value) {
            addCriterion("attr_type >", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("attr_type >=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThan(Integer value) {
            addCriterion("attr_type <", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeLessThanOrEqualTo(Integer value) {
            addCriterion("attr_type <=", value, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeIn(List<Integer> values) {
            addCriterion("attr_type in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotIn(List<Integer> values) {
            addCriterion("attr_type not in", values, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeBetween(Integer value1, Integer value2) {
            addCriterion("attr_type between", value1, value2, "attrType");
            return (Criteria) this;
        }

        public Criteria andAttrTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("attr_type not between", value1, value2, "attrType");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andIspkIsNull() {
            addCriterion("ispk is null");
            return (Criteria) this;
        }

        public Criteria andIspkIsNotNull() {
            addCriterion("ispk is not null");
            return (Criteria) this;
        }

        public Criteria andIspkEqualTo(Integer value) {
            addCriterion("ispk =", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkNotEqualTo(Integer value) {
            addCriterion("ispk <>", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkGreaterThan(Integer value) {
            addCriterion("ispk >", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkGreaterThanOrEqualTo(Integer value) {
            addCriterion("ispk >=", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkLessThan(Integer value) {
            addCriterion("ispk <", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkLessThanOrEqualTo(Integer value) {
            addCriterion("ispk <=", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkIn(List<Integer> values) {
            addCriterion("ispk in", values, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkNotIn(List<Integer> values) {
            addCriterion("ispk not in", values, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkBetween(Integer value1, Integer value2) {
            addCriterion("ispk between", value1, value2, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkNotBetween(Integer value1, Integer value2) {
            addCriterion("ispk not between", value1, value2, "ispk");
            return (Criteria) this;
        }

        public Criteria andNullableIsNull() {
            addCriterion("nullable is null");
            return (Criteria) this;
        }

        public Criteria andNullableIsNotNull() {
            addCriterion("nullable is not null");
            return (Criteria) this;
        }

        public Criteria andNullableEqualTo(Integer value) {
            addCriterion("nullable =", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableNotEqualTo(Integer value) {
            addCriterion("nullable <>", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableGreaterThan(Integer value) {
            addCriterion("nullable >", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableGreaterThanOrEqualTo(Integer value) {
            addCriterion("nullable >=", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableLessThan(Integer value) {
            addCriterion("nullable <", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableLessThanOrEqualTo(Integer value) {
            addCriterion("nullable <=", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableIn(List<Integer> values) {
            addCriterion("nullable in", values, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableNotIn(List<Integer> values) {
            addCriterion("nullable not in", values, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableBetween(Integer value1, Integer value2) {
            addCriterion("nullable between", value1, value2, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableNotBetween(Integer value1, Integer value2) {
            addCriterion("nullable not between", value1, value2, "nullable");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrIsNull() {
            addCriterion("is_busi_attr is null");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrIsNotNull() {
            addCriterion("is_busi_attr is not null");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrEqualTo(Integer value) {
            addCriterion("is_busi_attr =", value, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrNotEqualTo(Integer value) {
            addCriterion("is_busi_attr <>", value, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrGreaterThan(Integer value) {
            addCriterion("is_busi_attr >", value, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_busi_attr >=", value, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrLessThan(Integer value) {
            addCriterion("is_busi_attr <", value, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrLessThanOrEqualTo(Integer value) {
            addCriterion("is_busi_attr <=", value, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrIn(List<Integer> values) {
            addCriterion("is_busi_attr in", values, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrNotIn(List<Integer> values) {
            addCriterion("is_busi_attr not in", values, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrBetween(Integer value1, Integer value2) {
            addCriterion("is_busi_attr between", value1, value2, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsBusiAttrNotBetween(Integer value1, Integer value2) {
            addCriterion("is_busi_attr not between", value1, value2, "isBusiAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrIsNull() {
            addCriterion("is_redundant_attr is null");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrIsNotNull() {
            addCriterion("is_redundant_attr is not null");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrEqualTo(Integer value) {
            addCriterion("is_redundant_attr =", value, "isRedundantAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrNotEqualTo(Integer value) {
            addCriterion("is_redundant_attr <>", value, "isRedundantAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrGreaterThan(Integer value) {
            addCriterion("is_redundant_attr >", value, "isRedundantAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_redundant_attr >=", value, "isRedundantAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrLessThan(Integer value) {
            addCriterion("is_redundant_attr <", value, "isRedundantAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrLessThanOrEqualTo(Integer value) {
            addCriterion("is_redundant_attr <=", value, "isRedundantAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrIn(List<Integer> values) {
            addCriterion("is_redundant_attr in", values, "isRedundantAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrNotIn(List<Integer> values) {
            addCriterion("is_redundant_attr not in", values, "isRedundantAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrBetween(Integer value1, Integer value2) {
            addCriterion("is_redundant_attr between", value1, value2, "isRedundantAttr");
            return (Criteria) this;
        }

        public Criteria andIsRedundantAttrNotBetween(Integer value1, Integer value2) {
            addCriterion("is_redundant_attr not between", value1, value2, "isRedundantAttr");
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