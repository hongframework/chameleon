package com.hframe.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfmdEntityAttr_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfmdEntityAttr_Example() {
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

        public Criteria andHfmdEntityAttrNameIsNull() {
            addCriterion("hfmd_entity_attr_name is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameIsNotNull() {
            addCriterion("hfmd_entity_attr_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameEqualTo(String value) {
            addCriterion("hfmd_entity_attr_name =", value, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameNotEqualTo(String value) {
            addCriterion("hfmd_entity_attr_name <>", value, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameGreaterThan(String value) {
            addCriterion("hfmd_entity_attr_name >", value, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfmd_entity_attr_name >=", value, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameLessThan(String value) {
            addCriterion("hfmd_entity_attr_name <", value, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameLessThanOrEqualTo(String value) {
            addCriterion("hfmd_entity_attr_name <=", value, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameLike(String value) {
            addCriterion("hfmd_entity_attr_name like", value, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameNotLike(String value) {
            addCriterion("hfmd_entity_attr_name not like", value, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameIn(List<String> values) {
            addCriterion("hfmd_entity_attr_name in", values, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameNotIn(List<String> values) {
            addCriterion("hfmd_entity_attr_name not in", values, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameBetween(String value1, String value2) {
            addCriterion("hfmd_entity_attr_name between", value1, value2, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrNameNotBetween(String value1, String value2) {
            addCriterion("hfmd_entity_attr_name not between", value1, value2, "hfmdEntityAttrName");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeIsNull() {
            addCriterion("hfmd_entity_attr_code is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeIsNotNull() {
            addCriterion("hfmd_entity_attr_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeEqualTo(String value) {
            addCriterion("hfmd_entity_attr_code =", value, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeNotEqualTo(String value) {
            addCriterion("hfmd_entity_attr_code <>", value, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeGreaterThan(String value) {
            addCriterion("hfmd_entity_attr_code >", value, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfmd_entity_attr_code >=", value, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeLessThan(String value) {
            addCriterion("hfmd_entity_attr_code <", value, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeLessThanOrEqualTo(String value) {
            addCriterion("hfmd_entity_attr_code <=", value, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeLike(String value) {
            addCriterion("hfmd_entity_attr_code like", value, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeNotLike(String value) {
            addCriterion("hfmd_entity_attr_code not like", value, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeIn(List<String> values) {
            addCriterion("hfmd_entity_attr_code in", values, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeNotIn(List<String> values) {
            addCriterion("hfmd_entity_attr_code not in", values, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeBetween(String value1, String value2) {
            addCriterion("hfmd_entity_attr_code between", value1, value2, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrCodeNotBetween(String value1, String value2) {
            addCriterion("hfmd_entity_attr_code not between", value1, value2, "hfmdEntityAttrCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescIsNull() {
            addCriterion("hfmd_entity_attr_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescIsNotNull() {
            addCriterion("hfmd_entity_attr_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescEqualTo(String value) {
            addCriterion("hfmd_entity_attr_desc =", value, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescNotEqualTo(String value) {
            addCriterion("hfmd_entity_attr_desc <>", value, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescGreaterThan(String value) {
            addCriterion("hfmd_entity_attr_desc >", value, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescGreaterThanOrEqualTo(String value) {
            addCriterion("hfmd_entity_attr_desc >=", value, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescLessThan(String value) {
            addCriterion("hfmd_entity_attr_desc <", value, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescLessThanOrEqualTo(String value) {
            addCriterion("hfmd_entity_attr_desc <=", value, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescLike(String value) {
            addCriterion("hfmd_entity_attr_desc like", value, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescNotLike(String value) {
            addCriterion("hfmd_entity_attr_desc not like", value, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescIn(List<String> values) {
            addCriterion("hfmd_entity_attr_desc in", values, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescNotIn(List<String> values) {
            addCriterion("hfmd_entity_attr_desc not in", values, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescBetween(String value1, String value2) {
            addCriterion("hfmd_entity_attr_desc between", value1, value2, "hfmdEntityAttrDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityAttrDescNotBetween(String value1, String value2) {
            addCriterion("hfmd_entity_attr_desc not between", value1, value2, "hfmdEntityAttrDesc");
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

        public Criteria andRelHfmdEntityAttrIdIsNull() {
            addCriterion("rel_hfmd_entity_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdIsNotNull() {
            addCriterion("rel_hfmd_entity_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdEqualTo(Long value) {
            addCriterion("rel_hfmd_entity_attr_id =", value, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdNotEqualTo(Long value) {
            addCriterion("rel_hfmd_entity_attr_id <>", value, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdGreaterThan(Long value) {
            addCriterion("rel_hfmd_entity_attr_id >", value, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rel_hfmd_entity_attr_id >=", value, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdLessThan(Long value) {
            addCriterion("rel_hfmd_entity_attr_id <", value, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("rel_hfmd_entity_attr_id <=", value, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdIn(List<Long> values) {
            addCriterion("rel_hfmd_entity_attr_id in", values, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdNotIn(List<Long> values) {
            addCriterion("rel_hfmd_entity_attr_id not in", values, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdBetween(Long value1, Long value2) {
            addCriterion("rel_hfmd_entity_attr_id between", value1, value2, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("rel_hfmd_entity_attr_id not between", value1, value2, "relHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdIsNull() {
            addCriterion("hfmd_enum_class_id is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdIsNotNull() {
            addCriterion("hfmd_enum_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdEqualTo(Long value) {
            addCriterion("hfmd_enum_class_id =", value, "hfmdEnumClassId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdNotEqualTo(Long value) {
            addCriterion("hfmd_enum_class_id <>", value, "hfmdEnumClassId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdGreaterThan(Long value) {
            addCriterion("hfmd_enum_class_id >", value, "hfmdEnumClassId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfmd_enum_class_id >=", value, "hfmdEnumClassId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdLessThan(Long value) {
            addCriterion("hfmd_enum_class_id <", value, "hfmdEnumClassId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdLessThanOrEqualTo(Long value) {
            addCriterion("hfmd_enum_class_id <=", value, "hfmdEnumClassId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdIn(List<Long> values) {
            addCriterion("hfmd_enum_class_id in", values, "hfmdEnumClassId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdNotIn(List<Long> values) {
            addCriterion("hfmd_enum_class_id not in", values, "hfmdEnumClassId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdBetween(Long value1, Long value2) {
            addCriterion("hfmd_enum_class_id between", value1, value2, "hfmdEnumClassId");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassIdNotBetween(Long value1, Long value2) {
            addCriterion("hfmd_enum_class_id not between", value1, value2, "hfmdEnumClassId");
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

        public Criteria andHfpmProgramIdIsNull() {
            addCriterion("hfpm_program_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdIsNotNull() {
            addCriterion("hfpm_program_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdEqualTo(Long value) {
            addCriterion("hfpm_program_id =", value, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdNotEqualTo(Long value) {
            addCriterion("hfpm_program_id <>", value, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdGreaterThan(Long value) {
            addCriterion("hfpm_program_id >", value, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfpm_program_id >=", value, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdLessThan(Long value) {
            addCriterion("hfpm_program_id <", value, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdLessThanOrEqualTo(Long value) {
            addCriterion("hfpm_program_id <=", value, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdIn(List<Long> values) {
            addCriterion("hfpm_program_id in", values, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdNotIn(List<Long> values) {
            addCriterion("hfpm_program_id not in", values, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdBetween(Long value1, Long value2) {
            addCriterion("hfpm_program_id between", value1, value2, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramIdNotBetween(Long value1, Long value2) {
            addCriterion("hfpm_program_id not between", value1, value2, "hfpmProgramId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdIsNull() {
            addCriterion("hfpm_module_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdIsNotNull() {
            addCriterion("hfpm_module_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdEqualTo(Long value) {
            addCriterion("hfpm_module_id =", value, "hfpmModuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdNotEqualTo(Long value) {
            addCriterion("hfpm_module_id <>", value, "hfpmModuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdGreaterThan(Long value) {
            addCriterion("hfpm_module_id >", value, "hfpmModuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfpm_module_id >=", value, "hfpmModuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdLessThan(Long value) {
            addCriterion("hfpm_module_id <", value, "hfpmModuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdLessThanOrEqualTo(Long value) {
            addCriterion("hfpm_module_id <=", value, "hfpmModuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdIn(List<Long> values) {
            addCriterion("hfpm_module_id in", values, "hfpmModuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdNotIn(List<Long> values) {
            addCriterion("hfpm_module_id not in", values, "hfpmModuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdBetween(Long value1, Long value2) {
            addCriterion("hfpm_module_id between", value1, value2, "hfpmModuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleIdNotBetween(Long value1, Long value2) {
            addCriterion("hfpm_module_id not between", value1, value2, "hfpmModuleId");
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