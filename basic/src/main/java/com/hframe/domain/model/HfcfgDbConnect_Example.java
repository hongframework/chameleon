package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfcfgDbConnect_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfcfgDbConnect_Example() {
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

        public Criteria andHfcfgDbConnectIdIsNull() {
            addCriterion("hfcfg_db_connect_id is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdIsNotNull() {
            addCriterion("hfcfg_db_connect_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdEqualTo(Long value) {
            addCriterion("hfcfg_db_connect_id =", value, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdNotEqualTo(Long value) {
            addCriterion("hfcfg_db_connect_id <>", value, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdGreaterThan(Long value) {
            addCriterion("hfcfg_db_connect_id >", value, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfcfg_db_connect_id >=", value, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdLessThan(Long value) {
            addCriterion("hfcfg_db_connect_id <", value, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdLessThanOrEqualTo(Long value) {
            addCriterion("hfcfg_db_connect_id <=", value, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdIn(List<Long> values) {
            addCriterion("hfcfg_db_connect_id in", values, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdNotIn(List<Long> values) {
            addCriterion("hfcfg_db_connect_id not in", values, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdBetween(Long value1, Long value2) {
            addCriterion("hfcfg_db_connect_id between", value1, value2, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectIdNotBetween(Long value1, Long value2) {
            addCriterion("hfcfg_db_connect_id not between", value1, value2, "hfcfgDbConnectId");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameIsNull() {
            addCriterion("hfcfg_db_connect_name is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameIsNotNull() {
            addCriterion("hfcfg_db_connect_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameEqualTo(String value) {
            addCriterion("hfcfg_db_connect_name =", value, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameNotEqualTo(String value) {
            addCriterion("hfcfg_db_connect_name <>", value, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameGreaterThan(String value) {
            addCriterion("hfcfg_db_connect_name >", value, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfcfg_db_connect_name >=", value, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameLessThan(String value) {
            addCriterion("hfcfg_db_connect_name <", value, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameLessThanOrEqualTo(String value) {
            addCriterion("hfcfg_db_connect_name <=", value, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameLike(String value) {
            addCriterion("hfcfg_db_connect_name like", value, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameNotLike(String value) {
            addCriterion("hfcfg_db_connect_name not like", value, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameIn(List<String> values) {
            addCriterion("hfcfg_db_connect_name in", values, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameNotIn(List<String> values) {
            addCriterion("hfcfg_db_connect_name not in", values, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameBetween(String value1, String value2) {
            addCriterion("hfcfg_db_connect_name between", value1, value2, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectNameNotBetween(String value1, String value2) {
            addCriterion("hfcfg_db_connect_name not between", value1, value2, "hfcfgDbConnectName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
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

        public Criteria andHfcfgDbConnectCodeIsNull() {
            addCriterion("hfcfg_db_connect_code is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeIsNotNull() {
            addCriterion("hfcfg_db_connect_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeEqualTo(String value) {
            addCriterion("hfcfg_db_connect_code =", value, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeNotEqualTo(String value) {
            addCriterion("hfcfg_db_connect_code <>", value, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeGreaterThan(String value) {
            addCriterion("hfcfg_db_connect_code >", value, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfcfg_db_connect_code >=", value, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeLessThan(String value) {
            addCriterion("hfcfg_db_connect_code <", value, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeLessThanOrEqualTo(String value) {
            addCriterion("hfcfg_db_connect_code <=", value, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeLike(String value) {
            addCriterion("hfcfg_db_connect_code like", value, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeNotLike(String value) {
            addCriterion("hfcfg_db_connect_code not like", value, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeIn(List<String> values) {
            addCriterion("hfcfg_db_connect_code in", values, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeNotIn(List<String> values) {
            addCriterion("hfcfg_db_connect_code not in", values, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeBetween(String value1, String value2) {
            addCriterion("hfcfg_db_connect_code between", value1, value2, "hfcfgDbConnectCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgDbConnectCodeNotBetween(String value1, String value2) {
            addCriterion("hfcfg_db_connect_code not between", value1, value2, "hfcfgDbConnectCode");
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