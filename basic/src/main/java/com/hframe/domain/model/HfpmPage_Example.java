package com.hframe.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfpmPage_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfpmPage_Example() {
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

        public Criteria andHfpmPageIdIsNull() {
            addCriterion("hfpm_page_id is null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdIsNotNull() {
            addCriterion("hfpm_page_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdEqualTo(Long value) {
            addCriterion("hfpm_page_id =", value, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdNotEqualTo(Long value) {
            addCriterion("hfpm_page_id <>", value, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdGreaterThan(Long value) {
            addCriterion("hfpm_page_id >", value, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfpm_page_id >=", value, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdLessThan(Long value) {
            addCriterion("hfpm_page_id <", value, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdLessThanOrEqualTo(Long value) {
            addCriterion("hfpm_page_id <=", value, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdIn(List<Long> values) {
            addCriterion("hfpm_page_id in", values, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdNotIn(List<Long> values) {
            addCriterion("hfpm_page_id not in", values, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdBetween(Long value1, Long value2) {
            addCriterion("hfpm_page_id between", value1, value2, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageIdNotBetween(Long value1, Long value2) {
            addCriterion("hfpm_page_id not between", value1, value2, "hfpmPageId");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeIsNull() {
            addCriterion("hfpm_page_code is null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeIsNotNull() {
            addCriterion("hfpm_page_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeEqualTo(String value) {
            addCriterion("hfpm_page_code =", value, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeNotEqualTo(String value) {
            addCriterion("hfpm_page_code <>", value, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeGreaterThan(String value) {
            addCriterion("hfpm_page_code >", value, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_page_code >=", value, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeLessThan(String value) {
            addCriterion("hfpm_page_code <", value, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeLessThanOrEqualTo(String value) {
            addCriterion("hfpm_page_code <=", value, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeLike(String value) {
            addCriterion("hfpm_page_code like", value, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeNotLike(String value) {
            addCriterion("hfpm_page_code not like", value, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeIn(List<String> values) {
            addCriterion("hfpm_page_code in", values, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeNotIn(List<String> values) {
            addCriterion("hfpm_page_code not in", values, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeBetween(String value1, String value2) {
            addCriterion("hfpm_page_code between", value1, value2, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageCodeNotBetween(String value1, String value2) {
            addCriterion("hfpm_page_code not between", value1, value2, "hfpmPageCode");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameIsNull() {
            addCriterion("hfpm_page_name is null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameIsNotNull() {
            addCriterion("hfpm_page_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameEqualTo(String value) {
            addCriterion("hfpm_page_name =", value, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameNotEqualTo(String value) {
            addCriterion("hfpm_page_name <>", value, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameGreaterThan(String value) {
            addCriterion("hfpm_page_name >", value, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_page_name >=", value, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameLessThan(String value) {
            addCriterion("hfpm_page_name <", value, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameLessThanOrEqualTo(String value) {
            addCriterion("hfpm_page_name <=", value, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameLike(String value) {
            addCriterion("hfpm_page_name like", value, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameNotLike(String value) {
            addCriterion("hfpm_page_name not like", value, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameIn(List<String> values) {
            addCriterion("hfpm_page_name in", values, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameNotIn(List<String> values) {
            addCriterion("hfpm_page_name not in", values, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameBetween(String value1, String value2) {
            addCriterion("hfpm_page_name between", value1, value2, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageNameNotBetween(String value1, String value2) {
            addCriterion("hfpm_page_name not between", value1, value2, "hfpmPageName");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeIsNull() {
            addCriterion("hfpm_page_type is null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeIsNotNull() {
            addCriterion("hfpm_page_type is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeEqualTo(Integer value) {
            addCriterion("hfpm_page_type =", value, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeNotEqualTo(Integer value) {
            addCriterion("hfpm_page_type <>", value, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeGreaterThan(Integer value) {
            addCriterion("hfpm_page_type >", value, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hfpm_page_type >=", value, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeLessThan(Integer value) {
            addCriterion("hfpm_page_type <", value, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("hfpm_page_type <=", value, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeIn(List<Integer> values) {
            addCriterion("hfpm_page_type in", values, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeNotIn(List<Integer> values) {
            addCriterion("hfpm_page_type not in", values, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeBetween(Integer value1, Integer value2) {
            addCriterion("hfpm_page_type between", value1, value2, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("hfpm_page_type not between", value1, value2, "hfpmPageType");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescIsNull() {
            addCriterion("hfpm_page_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescIsNotNull() {
            addCriterion("hfpm_page_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescEqualTo(String value) {
            addCriterion("hfpm_page_desc =", value, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescNotEqualTo(String value) {
            addCriterion("hfpm_page_desc <>", value, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescGreaterThan(String value) {
            addCriterion("hfpm_page_desc >", value, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescGreaterThanOrEqualTo(String value) {
            addCriterion("hfpm_page_desc >=", value, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescLessThan(String value) {
            addCriterion("hfpm_page_desc <", value, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescLessThanOrEqualTo(String value) {
            addCriterion("hfpm_page_desc <=", value, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescLike(String value) {
            addCriterion("hfpm_page_desc like", value, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescNotLike(String value) {
            addCriterion("hfpm_page_desc not like", value, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescIn(List<String> values) {
            addCriterion("hfpm_page_desc in", values, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescNotIn(List<String> values) {
            addCriterion("hfpm_page_desc not in", values, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescBetween(String value1, String value2) {
            addCriterion("hfpm_page_desc between", value1, value2, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andHfpmPageDescNotBetween(String value1, String value2) {
            addCriterion("hfpm_page_desc not between", value1, value2, "hfpmPageDesc");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdIsNull() {
            addCriterion("parent_hfpm_page_id is null");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdIsNotNull() {
            addCriterion("parent_hfpm_page_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdEqualTo(Long value) {
            addCriterion("parent_hfpm_page_id =", value, "parentHfpmPageId");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdNotEqualTo(Long value) {
            addCriterion("parent_hfpm_page_id <>", value, "parentHfpmPageId");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdGreaterThan(Long value) {
            addCriterion("parent_hfpm_page_id >", value, "parentHfpmPageId");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_hfpm_page_id >=", value, "parentHfpmPageId");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdLessThan(Long value) {
            addCriterion("parent_hfpm_page_id <", value, "parentHfpmPageId");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_hfpm_page_id <=", value, "parentHfpmPageId");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdIn(List<Long> values) {
            addCriterion("parent_hfpm_page_id in", values, "parentHfpmPageId");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdNotIn(List<Long> values) {
            addCriterion("parent_hfpm_page_id not in", values, "parentHfpmPageId");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdBetween(Long value1, Long value2) {
            addCriterion("parent_hfpm_page_id between", value1, value2, "parentHfpmPageId");
            return (Criteria) this;
        }

        public Criteria andParentHfpmPageIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_hfpm_page_id not between", value1, value2, "parentHfpmPageId");
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

        public Criteria andHfcfgPageTemplateIdIsNull() {
            addCriterion("hfcfg_page_template_id is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdIsNotNull() {
            addCriterion("hfcfg_page_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdEqualTo(Long value) {
            addCriterion("hfcfg_page_template_id =", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdNotEqualTo(Long value) {
            addCriterion("hfcfg_page_template_id <>", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdGreaterThan(Long value) {
            addCriterion("hfcfg_page_template_id >", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfcfg_page_template_id >=", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdLessThan(Long value) {
            addCriterion("hfcfg_page_template_id <", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("hfcfg_page_template_id <=", value, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdIn(List<Long> values) {
            addCriterion("hfcfg_page_template_id in", values, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdNotIn(List<Long> values) {
            addCriterion("hfcfg_page_template_id not in", values, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdBetween(Long value1, Long value2) {
            addCriterion("hfcfg_page_template_id between", value1, value2, "hfcfgPageTemplateId");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("hfcfg_page_template_id not between", value1, value2, "hfcfgPageTemplateId");
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