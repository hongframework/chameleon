package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfpmModule_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfpmModule_Example() {
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

        public Criteria andHfpmModuleNameIsNull() {
            addCriterion("hfpm_module_name is null");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameIsNotNull() {
            addCriterion("hfpm_module_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameEqualTo(String value) {
            addCriterion("hfpm_module_name =", value, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameNotEqualTo(String value) {
            addCriterion("hfpm_module_name <>", value, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameGreaterThan(String value) {
            addCriterion("hfpm_module_name >", value, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_module_name >=", value, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameLessThan(String value) {
            addCriterion("hfpm_module_name <", value, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameLessThanOrEqualTo(String value) {
            addCriterion("hfpm_module_name <=", value, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameLike(String value) {
            addCriterion("hfpm_module_name like", value, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameNotLike(String value) {
            addCriterion("hfpm_module_name not like", value, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameIn(List<String> values) {
            addCriterion("hfpm_module_name in", values, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameNotIn(List<String> values) {
            addCriterion("hfpm_module_name not in", values, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameBetween(String value1, String value2) {
            addCriterion("hfpm_module_name between", value1, value2, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleNameNotBetween(String value1, String value2) {
            addCriterion("hfpm_module_name not between", value1, value2, "hfpmModuleName");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeIsNull() {
            addCriterion("hfpm_module_code is null");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeIsNotNull() {
            addCriterion("hfpm_module_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeEqualTo(String value) {
            addCriterion("hfpm_module_code =", value, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeNotEqualTo(String value) {
            addCriterion("hfpm_module_code <>", value, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeGreaterThan(String value) {
            addCriterion("hfpm_module_code >", value, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_module_code >=", value, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeLessThan(String value) {
            addCriterion("hfpm_module_code <", value, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeLessThanOrEqualTo(String value) {
            addCriterion("hfpm_module_code <=", value, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeLike(String value) {
            addCriterion("hfpm_module_code like", value, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeNotLike(String value) {
            addCriterion("hfpm_module_code not like", value, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeIn(List<String> values) {
            addCriterion("hfpm_module_code in", values, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeNotIn(List<String> values) {
            addCriterion("hfpm_module_code not in", values, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeBetween(String value1, String value2) {
            addCriterion("hfpm_module_code between", value1, value2, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleCodeNotBetween(String value1, String value2) {
            addCriterion("hfpm_module_code not between", value1, value2, "hfpmModuleCode");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescIsNull() {
            addCriterion("hfpm_module_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescIsNotNull() {
            addCriterion("hfpm_module_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescEqualTo(String value) {
            addCriterion("hfpm_module_desc =", value, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescNotEqualTo(String value) {
            addCriterion("hfpm_module_desc <>", value, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescGreaterThan(String value) {
            addCriterion("hfpm_module_desc >", value, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_module_desc >=", value, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescLessThan(String value) {
            addCriterion("hfpm_module_desc <", value, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescLessThanOrEqualTo(String value) {
            addCriterion("hfpm_module_desc <=", value, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescLike(String value) {
            addCriterion("hfpm_module_desc like", value, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescNotLike(String value) {
            addCriterion("hfpm_module_desc not like", value, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescIn(List<String> values) {
            addCriterion("hfpm_module_desc in", values, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescNotIn(List<String> values) {
            addCriterion("hfpm_module_desc not in", values, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescBetween(String value1, String value2) {
            addCriterion("hfpm_module_desc between", value1, value2, "hfpmModuleDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmModuleDescNotBetween(String value1, String value2) {
            addCriterion("hfpm_module_desc not between", value1, value2, "hfpmModuleDesc");
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