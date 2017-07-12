package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfmdEntityRel_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfmdEntityRel_Example() {
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

        public Criteria andHfmdEntityRelIdIsNull() {
            addCriterion("hfmd_entity_rel_id is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdIsNotNull() {
            addCriterion("hfmd_entity_rel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdEqualTo(Long value) {
            addCriterion("hfmd_entity_rel_id =", value, "hfmdEntityRelId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdNotEqualTo(Long value) {
            addCriterion("hfmd_entity_rel_id <>", value, "hfmdEntityRelId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdGreaterThan(Long value) {
            addCriterion("hfmd_entity_rel_id >", value, "hfmdEntityRelId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfmd_entity_rel_id >=", value, "hfmdEntityRelId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdLessThan(Long value) {
            addCriterion("hfmd_entity_rel_id <", value, "hfmdEntityRelId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdLessThanOrEqualTo(Long value) {
            addCriterion("hfmd_entity_rel_id <=", value, "hfmdEntityRelId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdIn(List<Long> values) {
            addCriterion("hfmd_entity_rel_id in", values, "hfmdEntityRelId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdNotIn(List<Long> values) {
            addCriterion("hfmd_entity_rel_id not in", values, "hfmdEntityRelId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdBetween(Long value1, Long value2) {
            addCriterion("hfmd_entity_rel_id between", value1, value2, "hfmdEntityRelId");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelIdNotBetween(Long value1, Long value2) {
            addCriterion("hfmd_entity_rel_id not between", value1, value2, "hfmdEntityRelId");
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

        public Criteria andHfmdEntityRelTypeIsNull() {
            addCriterion("hfmd_entity_rel_type is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeIsNotNull() {
            addCriterion("hfmd_entity_rel_type is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeEqualTo(Integer value) {
            addCriterion("hfmd_entity_rel_type =", value, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeNotEqualTo(Integer value) {
            addCriterion("hfmd_entity_rel_type <>", value, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeGreaterThan(Integer value) {
            addCriterion("hfmd_entity_rel_type >", value, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hfmd_entity_rel_type >=", value, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeLessThan(Integer value) {
            addCriterion("hfmd_entity_rel_type <", value, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeLessThanOrEqualTo(Integer value) {
            addCriterion("hfmd_entity_rel_type <=", value, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeIn(List<Integer> values) {
            addCriterion("hfmd_entity_rel_type in", values, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeNotIn(List<Integer> values) {
            addCriterion("hfmd_entity_rel_type not in", values, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeBetween(Integer value1, Integer value2) {
            addCriterion("hfmd_entity_rel_type between", value1, value2, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("hfmd_entity_rel_type not between", value1, value2, "hfmdEntityRelType");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelIsNull() {
            addCriterion("hfmd_entity_rel_level is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelIsNotNull() {
            addCriterion("hfmd_entity_rel_level is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelEqualTo(Integer value) {
            addCriterion("hfmd_entity_rel_level =", value, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelNotEqualTo(Integer value) {
            addCriterion("hfmd_entity_rel_level <>", value, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelGreaterThan(Integer value) {
            addCriterion("hfmd_entity_rel_level >", value, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("hfmd_entity_rel_level >=", value, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelLessThan(Integer value) {
            addCriterion("hfmd_entity_rel_level <", value, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelLessThanOrEqualTo(Integer value) {
            addCriterion("hfmd_entity_rel_level <=", value, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelIn(List<Integer> values) {
            addCriterion("hfmd_entity_rel_level in", values, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelNotIn(List<Integer> values) {
            addCriterion("hfmd_entity_rel_level not in", values, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelBetween(Integer value1, Integer value2) {
            addCriterion("hfmd_entity_rel_level between", value1, value2, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("hfmd_entity_rel_level not between", value1, value2, "hfmdEntityRelLevel");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescIsNull() {
            addCriterion("hfmd_entity_rel_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescIsNotNull() {
            addCriterion("hfmd_entity_rel_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescEqualTo(String value) {
            addCriterion("hfmd_entity_rel_desc =", value, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescNotEqualTo(String value) {
            addCriterion("hfmd_entity_rel_desc <>", value, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescGreaterThan(String value) {
            addCriterion("hfmd_entity_rel_desc >", value, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescGreaterThanOrEqualTo(String value) {
            addCriterion("hfmd_entity_rel_desc >=", value, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescLessThan(String value) {
            addCriterion("hfmd_entity_rel_desc <", value, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescLessThanOrEqualTo(String value) {
            addCriterion("hfmd_entity_rel_desc <=", value, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescLike(String value) {
            addCriterion("hfmd_entity_rel_desc like", value, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescNotLike(String value) {
            addCriterion("hfmd_entity_rel_desc not like", value, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescIn(List<String> values) {
            addCriterion("hfmd_entity_rel_desc in", values, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescNotIn(List<String> values) {
            addCriterion("hfmd_entity_rel_desc not in", values, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescBetween(String value1, String value2) {
            addCriterion("hfmd_entity_rel_desc between", value1, value2, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEntityRelDescNotBetween(String value1, String value2) {
            addCriterion("hfmd_entity_rel_desc not between", value1, value2, "hfmdEntityRelDesc");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdIsNull() {
            addCriterion("rel_hfmd_entity_id is null");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdIsNotNull() {
            addCriterion("rel_hfmd_entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdEqualTo(Long value) {
            addCriterion("rel_hfmd_entity_id =", value, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdNotEqualTo(Long value) {
            addCriterion("rel_hfmd_entity_id <>", value, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdGreaterThan(Long value) {
            addCriterion("rel_hfmd_entity_id >", value, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rel_hfmd_entity_id >=", value, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdLessThan(Long value) {
            addCriterion("rel_hfmd_entity_id <", value, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("rel_hfmd_entity_id <=", value, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdIn(List<Long> values) {
            addCriterion("rel_hfmd_entity_id in", values, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdNotIn(List<Long> values) {
            addCriterion("rel_hfmd_entity_id not in", values, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdBetween(Long value1, Long value2) {
            addCriterion("rel_hfmd_entity_id between", value1, value2, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelHfmdEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("rel_hfmd_entity_id not between", value1, value2, "relHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdIsNull() {
            addCriterion("rel_entity_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdIsNotNull() {
            addCriterion("rel_entity_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdEqualTo(Long value) {
            addCriterion("rel_entity_attr_id =", value, "relEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdNotEqualTo(Long value) {
            addCriterion("rel_entity_attr_id <>", value, "relEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdGreaterThan(Long value) {
            addCriterion("rel_entity_attr_id >", value, "relEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rel_entity_attr_id >=", value, "relEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdLessThan(Long value) {
            addCriterion("rel_entity_attr_id <", value, "relEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdLessThanOrEqualTo(Long value) {
            addCriterion("rel_entity_attr_id <=", value, "relEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdIn(List<Long> values) {
            addCriterion("rel_entity_attr_id in", values, "relEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdNotIn(List<Long> values) {
            addCriterion("rel_entity_attr_id not in", values, "relEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdBetween(Long value1, Long value2) {
            addCriterion("rel_entity_attr_id between", value1, value2, "relEntityAttrId");
            return (Criteria) this;
        }

        public Criteria andRelEntityAttrIdNotBetween(Long value1, Long value2) {
            addCriterion("rel_entity_attr_id not between", value1, value2, "relEntityAttrId");
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