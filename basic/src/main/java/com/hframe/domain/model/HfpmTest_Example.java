package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.List;

public class HfpmTest_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfpmTest_Example() {
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

        public Criteria andHfpmTestIdIsNull() {
            addCriterion("hfpm_test_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdIsNotNull() {
            addCriterion("hfpm_test_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdEqualTo(Long value) {
            addCriterion("hfpm_test_id =", value, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdNotEqualTo(Long value) {
            addCriterion("hfpm_test_id <>", value, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdGreaterThan(Long value) {
            addCriterion("hfpm_test_id >", value, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfpm_test_id >=", value, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdLessThan(Long value) {
            addCriterion("hfpm_test_id <", value, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdLessThanOrEqualTo(Long value) {
            addCriterion("hfpm_test_id <=", value, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdIn(List<Long> values) {
            addCriterion("hfpm_test_id in", values, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdNotIn(List<Long> values) {
            addCriterion("hfpm_test_id not in", values, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdBetween(Long value1, Long value2) {
            addCriterion("hfpm_test_id between", value1, value2, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestIdNotBetween(Long value1, Long value2) {
            addCriterion("hfpm_test_id not between", value1, value2, "hfpmTestId");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeIsNull() {
            addCriterion("hfpm_test_code is null");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeIsNotNull() {
            addCriterion("hfpm_test_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeEqualTo(String value) {
            addCriterion("hfpm_test_code =", value, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeNotEqualTo(String value) {
            addCriterion("hfpm_test_code <>", value, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeGreaterThan(String value) {
            addCriterion("hfpm_test_code >", value, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_test_code >=", value, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeLessThan(String value) {
            addCriterion("hfpm_test_code <", value, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeLessThanOrEqualTo(String value) {
            addCriterion("hfpm_test_code <=", value, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeLike(String value) {
            addCriterion("hfpm_test_code like", value, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeNotLike(String value) {
            addCriterion("hfpm_test_code not like", value, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeIn(List<String> values) {
            addCriterion("hfpm_test_code in", values, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeNotIn(List<String> values) {
            addCriterion("hfpm_test_code not in", values, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeBetween(String value1, String value2) {
            addCriterion("hfpm_test_code between", value1, value2, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestCodeNotBetween(String value1, String value2) {
            addCriterion("hfpm_test_code not between", value1, value2, "hfpmTestCode");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameIsNull() {
            addCriterion("hfpm_test_name is null");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameIsNotNull() {
            addCriterion("hfpm_test_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameEqualTo(String value) {
            addCriterion("hfpm_test_name =", value, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameNotEqualTo(String value) {
            addCriterion("hfpm_test_name <>", value, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameGreaterThan(String value) {
            addCriterion("hfpm_test_name >", value, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_test_name >=", value, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameLessThan(String value) {
            addCriterion("hfpm_test_name <", value, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameLessThanOrEqualTo(String value) {
            addCriterion("hfpm_test_name <=", value, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameLike(String value) {
            addCriterion("hfpm_test_name like", value, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameNotLike(String value) {
            addCriterion("hfpm_test_name not like", value, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameIn(List<String> values) {
            addCriterion("hfpm_test_name in", values, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameNotIn(List<String> values) {
            addCriterion("hfpm_test_name not in", values, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameBetween(String value1, String value2) {
            addCriterion("hfpm_test_name between", value1, value2, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmTestNameNotBetween(String value1, String value2) {
            addCriterion("hfpm_test_name not between", value1, value2, "hfpmTestName");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdIsNull() {
            addCriterion("hfpm_program_cfg_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdIsNotNull() {
            addCriterion("hfpm_program_cfg_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdEqualTo(Long value) {
            addCriterion("hfpm_program_cfg_id =", value, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdNotEqualTo(Long value) {
            addCriterion("hfpm_program_cfg_id <>", value, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdGreaterThan(Long value) {
            addCriterion("hfpm_program_cfg_id >", value, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfpm_program_cfg_id >=", value, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdLessThan(Long value) {
            addCriterion("hfpm_program_cfg_id <", value, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdLessThanOrEqualTo(Long value) {
            addCriterion("hfpm_program_cfg_id <=", value, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdIn(List<Long> values) {
            addCriterion("hfpm_program_cfg_id in", values, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdNotIn(List<Long> values) {
            addCriterion("hfpm_program_cfg_id not in", values, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdBetween(Long value1, Long value2) {
            addCriterion("hfpm_program_cfg_id between", value1, value2, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfpmProgramCfgIdNotBetween(Long value1, Long value2) {
            addCriterion("hfpm_program_cfg_id not between", value1, value2, "hfpmProgramCfgId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdIsNull() {
            addCriterion("hfcfg_program_template_id is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdIsNotNull() {
            addCriterion("hfcfg_program_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdEqualTo(Long value) {
            addCriterion("hfcfg_program_template_id =", value, "hfcfgProgramTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdNotEqualTo(Long value) {
            addCriterion("hfcfg_program_template_id <>", value, "hfcfgProgramTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdGreaterThan(Long value) {
            addCriterion("hfcfg_program_template_id >", value, "hfcfgProgramTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfcfg_program_template_id >=", value, "hfcfgProgramTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdLessThan(Long value) {
            addCriterion("hfcfg_program_template_id <", value, "hfcfgProgramTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("hfcfg_program_template_id <=", value, "hfcfgProgramTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdIn(List<Long> values) {
            addCriterion("hfcfg_program_template_id in", values, "hfcfgProgramTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdNotIn(List<Long> values) {
            addCriterion("hfcfg_program_template_id not in", values, "hfcfgProgramTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdBetween(Long value1, Long value2) {
            addCriterion("hfcfg_program_template_id between", value1, value2, "hfcfgProgramTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("hfcfg_program_template_id not between", value1, value2, "hfcfgProgramTemplateId");
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