package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfpmDataSet_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfpmDataSet_Example() {
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

        public Criteria andHfpmDataSetNameIsNull() {
            addCriterion("hfpm_data_set_name is null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameIsNotNull() {
            addCriterion("hfpm_data_set_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameEqualTo(String value) {
            addCriterion("hfpm_data_set_name =", value, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameNotEqualTo(String value) {
            addCriterion("hfpm_data_set_name <>", value, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameGreaterThan(String value) {
            addCriterion("hfpm_data_set_name >", value, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_data_set_name >=", value, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameLessThan(String value) {
            addCriterion("hfpm_data_set_name <", value, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameLessThanOrEqualTo(String value) {
            addCriterion("hfpm_data_set_name <=", value, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameLike(String value) {
            addCriterion("hfpm_data_set_name like", value, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameNotLike(String value) {
            addCriterion("hfpm_data_set_name not like", value, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameIn(List<String> values) {
            addCriterion("hfpm_data_set_name in", values, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameNotIn(List<String> values) {
            addCriterion("hfpm_data_set_name not in", values, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameBetween(String value1, String value2) {
            addCriterion("hfpm_data_set_name between", value1, value2, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetNameNotBetween(String value1, String value2) {
            addCriterion("hfpm_data_set_name not between", value1, value2, "hfpmDataSetName");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeIsNull() {
            addCriterion("hfpm_data_set_code is null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeIsNotNull() {
            addCriterion("hfpm_data_set_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeEqualTo(String value) {
            addCriterion("hfpm_data_set_code =", value, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeNotEqualTo(String value) {
            addCriterion("hfpm_data_set_code <>", value, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeGreaterThan(String value) {
            addCriterion("hfpm_data_set_code >", value, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_data_set_code >=", value, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeLessThan(String value) {
            addCriterion("hfpm_data_set_code <", value, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeLessThanOrEqualTo(String value) {
            addCriterion("hfpm_data_set_code <=", value, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeLike(String value) {
            addCriterion("hfpm_data_set_code like", value, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeNotLike(String value) {
            addCriterion("hfpm_data_set_code not like", value, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeIn(List<String> values) {
            addCriterion("hfpm_data_set_code in", values, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeNotIn(List<String> values) {
            addCriterion("hfpm_data_set_code not in", values, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeBetween(String value1, String value2) {
            addCriterion("hfpm_data_set_code between", value1, value2, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andHfpmDataSetCodeNotBetween(String value1, String value2) {
            addCriterion("hfpm_data_set_code not between", value1, value2, "hfpmDataSetCode");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdIsNull() {
            addCriterion("main_hfmd_entity_id is null");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdIsNotNull() {
            addCriterion("main_hfmd_entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdEqualTo(Long value) {
            addCriterion("main_hfmd_entity_id =", value, "mainHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdNotEqualTo(Long value) {
            addCriterion("main_hfmd_entity_id <>", value, "mainHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdGreaterThan(Long value) {
            addCriterion("main_hfmd_entity_id >", value, "mainHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("main_hfmd_entity_id >=", value, "mainHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdLessThan(Long value) {
            addCriterion("main_hfmd_entity_id <", value, "mainHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("main_hfmd_entity_id <=", value, "mainHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdIn(List<Long> values) {
            addCriterion("main_hfmd_entity_id in", values, "mainHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdNotIn(List<Long> values) {
            addCriterion("main_hfmd_entity_id not in", values, "mainHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdBetween(Long value1, Long value2) {
            addCriterion("main_hfmd_entity_id between", value1, value2, "mainHfmdEntityId");
            return (Criteria) this;
        }

        public Criteria andMainHfmdEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("main_hfmd_entity_id not between", value1, value2, "mainHfmdEntityId");
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