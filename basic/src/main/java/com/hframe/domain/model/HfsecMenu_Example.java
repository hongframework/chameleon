package com.hframe.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfsecMenu_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfsecMenu_Example() {
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

//        protected void addCriterion(Criterion criterion) {
//            criteria.add(criterion);
//        }

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

        public Criteria andHfsecMenuIdIsNull() {
            addCriterion("hfsec_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdIsNotNull() {
            addCriterion("hfsec_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdEqualTo(Long value) {
            addCriterion("hfsec_menu_id =", value, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdNotEqualTo(Long value) {
            addCriterion("hfsec_menu_id <>", value, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdGreaterThan(Long value) {
            addCriterion("hfsec_menu_id >", value, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfsec_menu_id >=", value, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdLessThan(Long value) {
            addCriterion("hfsec_menu_id <", value, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdLessThanOrEqualTo(Long value) {
            addCriterion("hfsec_menu_id <=", value, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdIn(List<Long> values) {
            addCriterion("hfsec_menu_id in", values, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdNotIn(List<Long> values) {
            addCriterion("hfsec_menu_id not in", values, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdBetween(Long value1, Long value2) {
            addCriterion("hfsec_menu_id between", value1, value2, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuIdNotBetween(Long value1, Long value2) {
            addCriterion("hfsec_menu_id not between", value1, value2, "hfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeIsNull() {
            addCriterion("hfsec_menu_code is null");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeIsNotNull() {
            addCriterion("hfsec_menu_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeEqualTo(String value) {
            addCriterion("hfsec_menu_code =", value, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeNotEqualTo(String value) {
            addCriterion("hfsec_menu_code <>", value, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeGreaterThan(String value) {
            addCriterion("hfsec_menu_code >", value, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfsec_menu_code >=", value, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeLessThan(String value) {
            addCriterion("hfsec_menu_code <", value, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeLessThanOrEqualTo(String value) {
            addCriterion("hfsec_menu_code <=", value, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeLike(String value) {
            addCriterion("hfsec_menu_code like", value, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeNotLike(String value) {
            addCriterion("hfsec_menu_code not like", value, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeIn(List<String> values) {
            addCriterion("hfsec_menu_code in", values, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeNotIn(List<String> values) {
            addCriterion("hfsec_menu_code not in", values, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeBetween(String value1, String value2) {
            addCriterion("hfsec_menu_code between", value1, value2, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuCodeNotBetween(String value1, String value2) {
            addCriterion("hfsec_menu_code not between", value1, value2, "hfsecMenuCode");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameIsNull() {
            addCriterion("hfsec_menu_name is null");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameIsNotNull() {
            addCriterion("hfsec_menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameEqualTo(String value) {
            addCriterion("hfsec_menu_name =", value, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameNotEqualTo(String value) {
            addCriterion("hfsec_menu_name <>", value, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameGreaterThan(String value) {
            addCriterion("hfsec_menu_name >", value, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfsec_menu_name >=", value, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameLessThan(String value) {
            addCriterion("hfsec_menu_name <", value, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameLessThanOrEqualTo(String value) {
            addCriterion("hfsec_menu_name <=", value, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameLike(String value) {
            addCriterion("hfsec_menu_name like", value, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameNotLike(String value) {
            addCriterion("hfsec_menu_name not like", value, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameIn(List<String> values) {
            addCriterion("hfsec_menu_name in", values, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameNotIn(List<String> values) {
            addCriterion("hfsec_menu_name not in", values, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameBetween(String value1, String value2) {
            addCriterion("hfsec_menu_name between", value1, value2, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuNameNotBetween(String value1, String value2) {
            addCriterion("hfsec_menu_name not between", value1, value2, "hfsecMenuName");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescIsNull() {
            addCriterion("hfsec_menu_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescIsNotNull() {
            addCriterion("hfsec_menu_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescEqualTo(String value) {
            addCriterion("hfsec_menu_desc =", value, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescNotEqualTo(String value) {
            addCriterion("hfsec_menu_desc <>", value, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescGreaterThan(String value) {
            addCriterion("hfsec_menu_desc >", value, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescGreaterThanOrEqualTo(String value) {
            addCriterion("hfsec_menu_desc >=", value, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescLessThan(String value) {
            addCriterion("hfsec_menu_desc <", value, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescLessThanOrEqualTo(String value) {
            addCriterion("hfsec_menu_desc <=", value, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescLike(String value) {
            addCriterion("hfsec_menu_desc like", value, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescNotLike(String value) {
            addCriterion("hfsec_menu_desc not like", value, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescIn(List<String> values) {
            addCriterion("hfsec_menu_desc in", values, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescNotIn(List<String> values) {
            addCriterion("hfsec_menu_desc not in", values, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescBetween(String value1, String value2) {
            addCriterion("hfsec_menu_desc between", value1, value2, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andHfsecMenuDescNotBetween(String value1, String value2) {
            addCriterion("hfsec_menu_desc not between", value1, value2, "hfsecMenuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNull() {
            addCriterion("menu_level is null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNotNull() {
            addCriterion("menu_level is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelEqualTo(Integer value) {
            addCriterion("menu_level =", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotEqualTo(Integer value) {
            addCriterion("menu_level <>", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThan(Integer value) {
            addCriterion("menu_level >", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_level >=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThan(Integer value) {
            addCriterion("menu_level <", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThanOrEqualTo(Integer value) {
            addCriterion("menu_level <=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIn(List<Integer> values) {
            addCriterion("menu_level in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotIn(List<Integer> values) {
            addCriterion("menu_level not in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelBetween(Integer value1, Integer value2) {
            addCriterion("menu_level between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_level not between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdIsNull() {
            addCriterion("parent_hfsec_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdIsNotNull() {
            addCriterion("parent_hfsec_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdEqualTo(Long value) {
            addCriterion("parent_hfsec_menu_id =", value, "parentHfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdNotEqualTo(Long value) {
            addCriterion("parent_hfsec_menu_id <>", value, "parentHfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdGreaterThan(Long value) {
            addCriterion("parent_hfsec_menu_id >", value, "parentHfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_hfsec_menu_id >=", value, "parentHfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdLessThan(Long value) {
            addCriterion("parent_hfsec_menu_id <", value, "parentHfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_hfsec_menu_id <=", value, "parentHfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdIn(List<Long> values) {
            addCriterion("parent_hfsec_menu_id in", values, "parentHfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdNotIn(List<Long> values) {
            addCriterion("parent_hfsec_menu_id not in", values, "parentHfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdBetween(Long value1, Long value2) {
            addCriterion("parent_hfsec_menu_id between", value1, value2, "parentHfsecMenuId");
            return (Criteria) this;
        }

        public Criteria andParentHfsecMenuIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_hfsec_menu_id not between", value1, value2, "parentHfsecMenuId");
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

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
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

        public Criteria andModifierIdIsNull() {
            addCriterion("modifier_id is null");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNotNull() {
            addCriterion("modifier_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifierIdEqualTo(Long value) {
            addCriterion("modifier_id =", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotEqualTo(Long value) {
            addCriterion("modifier_id <>", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThan(Long value) {
            addCriterion("modifier_id >", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("modifier_id >=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThan(Long value) {
            addCriterion("modifier_id <", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThanOrEqualTo(Long value) {
            addCriterion("modifier_id <=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdIn(List<Long> values) {
            addCriterion("modifier_id in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotIn(List<Long> values) {
            addCriterion("modifier_id not in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdBetween(Long value1, Long value2) {
            addCriterion("modifier_id between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotBetween(Long value1, Long value2) {
            addCriterion("modifier_id not between", value1, value2, "modifierId");
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


//    public HfsecMenu_Example clone(){
//        HfsecMenu_Example example = new HfsecMenu_Example();
//        example.setDistinct(distinct);
//        example.setLimitEnd(limitEnd);
//        example.setLimitStart(limitStart);
//        example.setOrderByClause(orderByClause);
//
//        if(oredCriteria != null) {
//            for (Criteria criteria : oredCriteria) {
//                Criteria criteria1 = example.createCriteria();
//                List<Criterion> allCriteria = criteria.getAllCriteria();
//                for (Criterion criterion : allCriteria) {
//                    criteria1.addCriterion(criterion);
//                }
//            }
//        }
//        return example;
//    }
}