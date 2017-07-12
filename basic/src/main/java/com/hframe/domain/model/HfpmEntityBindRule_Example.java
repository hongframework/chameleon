package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfpmEntityBindRule_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfpmEntityBindRule_Example() {
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

        public Criteria andHfpmEntityBindRuleIdIsNull() {
            addCriterion("hfpm_entity_bind_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdIsNotNull() {
            addCriterion("hfpm_entity_bind_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdEqualTo(Long value) {
            addCriterion("hfpm_entity_bind_rule_id =", value, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdNotEqualTo(Long value) {
            addCriterion("hfpm_entity_bind_rule_id <>", value, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdGreaterThan(Long value) {
            addCriterion("hfpm_entity_bind_rule_id >", value, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfpm_entity_bind_rule_id >=", value, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdLessThan(Long value) {
            addCriterion("hfpm_entity_bind_rule_id <", value, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("hfpm_entity_bind_rule_id <=", value, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdIn(List<Long> values) {
            addCriterion("hfpm_entity_bind_rule_id in", values, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdNotIn(List<Long> values) {
            addCriterion("hfpm_entity_bind_rule_id not in", values, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdBetween(Long value1, Long value2) {
            addCriterion("hfpm_entity_bind_rule_id between", value1, value2, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andHfpmEntityBindRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("hfpm_entity_bind_rule_id not between", value1, value2, "hfpmEntityBindRuleId");
            return (Criteria) this;
        }

        public Criteria andBindTypeIsNull() {
            addCriterion("bind_type is null");
            return (Criteria) this;
        }

        public Criteria andBindTypeIsNotNull() {
            addCriterion("bind_type is not null");
            return (Criteria) this;
        }

        public Criteria andBindTypeEqualTo(Integer value) {
            addCriterion("bind_type =", value, "bindType");
            return (Criteria) this;
        }

        public Criteria andBindTypeNotEqualTo(Integer value) {
            addCriterion("bind_type <>", value, "bindType");
            return (Criteria) this;
        }

        public Criteria andBindTypeGreaterThan(Integer value) {
            addCriterion("bind_type >", value, "bindType");
            return (Criteria) this;
        }

        public Criteria andBindTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bind_type >=", value, "bindType");
            return (Criteria) this;
        }

        public Criteria andBindTypeLessThan(Integer value) {
            addCriterion("bind_type <", value, "bindType");
            return (Criteria) this;
        }

        public Criteria andBindTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bind_type <=", value, "bindType");
            return (Criteria) this;
        }

        public Criteria andBindTypeIn(List<Integer> values) {
            addCriterion("bind_type in", values, "bindType");
            return (Criteria) this;
        }

        public Criteria andBindTypeNotIn(List<Integer> values) {
            addCriterion("bind_type not in", values, "bindType");
            return (Criteria) this;
        }

        public Criteria andBindTypeBetween(Integer value1, Integer value2) {
            addCriterion("bind_type between", value1, value2, "bindType");
            return (Criteria) this;
        }

        public Criteria andBindTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bind_type not between", value1, value2, "bindType");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdIsNull() {
            addCriterion("src_hfmd_entity_id is null");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdIsNotNull() {
            addCriterion("src_hfmd_entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdEqualTo(Long value) {
            addCriterion("src_hfmd_entity_id =", value, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdNotEqualTo(Long value) {
            addCriterion("src_hfmd_entity_id <>", value, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdGreaterThan(Long value) {
            addCriterion("src_hfmd_entity_id >", value, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("src_hfmd_entity_id >=", value, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdLessThan(Long value) {
            addCriterion("src_hfmd_entity_id <", value, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("src_hfmd_entity_id <=", value, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdIn(List<Long> values) {
            addCriterion("src_hfmd_entity_id in", values, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdNotIn(List<Long> values) {
            addCriterion("src_hfmd_entity_id not in", values, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdBetween(Long value1, Long value2) {
            addCriterion("src_hfmd_entity_id between", value1, value2, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("src_hfmd_entity_id not between", value1, value2, "srcHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdIsNull() {
            addCriterion("src_hfmd_entity_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdIsNotNull() {
            addCriterion("src_hfmd_entity_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdEqualTo(Long value) {
            addCriterion("src_hfmd_entity_attr_id =", value, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdNotEqualTo(Long value) {
            addCriterion("src_hfmd_entity_attr_id <>", value, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdGreaterThan(Long value) {
            addCriterion("src_hfmd_entity_attr_id >", value, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("src_hfmd_entity_attr_id >=", value, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdLessThan(Long value) {
            addCriterion("src_hfmd_entity_attr_id <", value, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("src_hfmd_entity_attr_id <=", value, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdIn(List<Long> values) {
            addCriterion("src_hfmd_entity_attr_id in", values, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdNotIn(List<Long> values) {
            addCriterion("src_hfmd_entity_attr_id not in", values, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdBetween(Long value1, Long value2) {
            addCriterion("src_hfmd_entity_attr_id between", value1, value2, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andSrcHfmdEntityAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("src_hfmd_entity_attr_id not between", value1, value2, "srcHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdIsNull() {
            addCriterion("dest_hfmd_entity_id is null");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdIsNotNull() {
            addCriterion("dest_hfmd_entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdEqualTo(Long value) {
            addCriterion("dest_hfmd_entity_id =", value, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdNotEqualTo(Long value) {
            addCriterion("dest_hfmd_entity_id <>", value, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdGreaterThan(Long value) {
            addCriterion("dest_hfmd_entity_id >", value, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dest_hfmd_entity_id >=", value, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdLessThan(Long value) {
            addCriterion("dest_hfmd_entity_id <", value, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("dest_hfmd_entity_id <=", value, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdIn(List<Long> values) {
            addCriterion("dest_hfmd_entity_id in", values, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdNotIn(List<Long> values) {
            addCriterion("dest_hfmd_entity_id not in", values, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdBetween(Long value1, Long value2) {
            addCriterion("dest_hfmd_entity_id between", value1, value2, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("dest_hfmd_entity_id not between", value1, value2, "destHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdIsNull() {
            addCriterion("dest_hfmd_entity_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdIsNotNull() {
            addCriterion("dest_hfmd_entity_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdEqualTo(Long value) {
            addCriterion("dest_hfmd_entity_attr_id =", value, "destHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdNotEqualTo(Long value) {
            addCriterion("dest_hfmd_entity_attr_id <>", value, "destHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdGreaterThan(Long value) {
            addCriterion("dest_hfmd_entity_attr_id >", value, "destHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dest_hfmd_entity_attr_id >=", value, "destHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdLessThan(Long value) {
            addCriterion("dest_hfmd_entity_attr_id <", value, "destHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("dest_hfmd_entity_attr_id <=", value, "destHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdIn(List<Long> values) {
            addCriterion("dest_hfmd_entity_attr_id in", values, "destHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdNotIn(List<Long> values) {
            addCriterion("dest_hfmd_entity_attr_id not in", values, "destHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdBetween(Long value1, Long value2) {
            addCriterion("dest_hfmd_entity_attr_id between", value1, value2, "destHfmdEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andDestHfmdEntityAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("dest_hfmd_entity_attr_id not between", value1, value2, "destHfmdEntityAttrId");
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