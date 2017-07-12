package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfmdEnumClass_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfmdEnumClass_Example() {
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

        public Criteria andHfmdEnumClassNameIsNull() {
            addCriterion("hfmd_enum_class_name is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameIsNotNull() {
            addCriterion("hfmd_enum_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameEqualTo(String value) {
            addCriterion("hfmd_enum_class_name =", value, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameNotEqualTo(String value) {
            addCriterion("hfmd_enum_class_name <>", value, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameGreaterThan(String value) {
            addCriterion("hfmd_enum_class_name >", value, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfmd_enum_class_name >=", value, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameLessThan(String value) {
            addCriterion("hfmd_enum_class_name <", value, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameLessThanOrEqualTo(String value) {
            addCriterion("hfmd_enum_class_name <=", value, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameLike(String value) {
            addCriterion("hfmd_enum_class_name like", value, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameNotLike(String value) {
            addCriterion("hfmd_enum_class_name not like", value, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameIn(List<String> values) {
            addCriterion("hfmd_enum_class_name in", values, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameNotIn(List<String> values) {
            addCriterion("hfmd_enum_class_name not in", values, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameBetween(String value1, String value2) {
            addCriterion("hfmd_enum_class_name between", value1, value2, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassNameNotBetween(String value1, String value2) {
            addCriterion("hfmd_enum_class_name not between", value1, value2, "hfmdEnumClassName");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeIsNull() {
            addCriterion("hfmd_enum_class_code is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeIsNotNull() {
            addCriterion("hfmd_enum_class_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeEqualTo(String value) {
            addCriterion("hfmd_enum_class_code =", value, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeNotEqualTo(String value) {
            addCriterion("hfmd_enum_class_code <>", value, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeGreaterThan(String value) {
            addCriterion("hfmd_enum_class_code >", value, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfmd_enum_class_code >=", value, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeLessThan(String value) {
            addCriterion("hfmd_enum_class_code <", value, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeLessThanOrEqualTo(String value) {
            addCriterion("hfmd_enum_class_code <=", value, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeLike(String value) {
            addCriterion("hfmd_enum_class_code like", value, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeNotLike(String value) {
            addCriterion("hfmd_enum_class_code not like", value, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeIn(List<String> values) {
            addCriterion("hfmd_enum_class_code in", values, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeNotIn(List<String> values) {
            addCriterion("hfmd_enum_class_code not in", values, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeBetween(String value1, String value2) {
            addCriterion("hfmd_enum_class_code between", value1, value2, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassCodeNotBetween(String value1, String value2) {
            addCriterion("hfmd_enum_class_code not between", value1, value2, "hfmdEnumClassCode");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescIsNull() {
            addCriterion("hfmd_enum_class_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescIsNotNull() {
            addCriterion("hfmd_enum_class_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescEqualTo(String value) {
            addCriterion("hfmd_enum_class_desc =", value, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescNotEqualTo(String value) {
            addCriterion("hfmd_enum_class_desc <>", value, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescGreaterThan(String value) {
            addCriterion("hfmd_enum_class_desc >", value, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescGreaterThanOrEqualTo(String value) {
            addCriterion("hfmd_enum_class_desc >=", value, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescLessThan(String value) {
            addCriterion("hfmd_enum_class_desc <", value, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescLessThanOrEqualTo(String value) {
            addCriterion("hfmd_enum_class_desc <=", value, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescLike(String value) {
            addCriterion("hfmd_enum_class_desc like", value, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescNotLike(String value) {
            addCriterion("hfmd_enum_class_desc not like", value, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescIn(List<String> values) {
            addCriterion("hfmd_enum_class_desc in", values, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescNotIn(List<String> values) {
            addCriterion("hfmd_enum_class_desc not in", values, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescBetween(String value1, String value2) {
            addCriterion("hfmd_enum_class_desc between", value1, value2, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andHfmdEnumClassDescNotBetween(String value1, String value2) {
            addCriterion("hfmd_enum_class_desc not between", value1, value2, "hfmdEnumClassDesc");
            return (Criteria) this;
        }

        public Criteria andExt1IsNull() {
            addCriterion("ext1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("ext1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("ext1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("ext1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("ext1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("ext1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("ext1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("ext1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("ext1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("ext1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("ext1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("ext1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("ext1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("ext1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("ext2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("ext2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("ext2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("ext2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("ext2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("ext2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("ext2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("ext2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("ext2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("ext2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("ext2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("ext2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("ext2 not between", value1, value2, "ext2");
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