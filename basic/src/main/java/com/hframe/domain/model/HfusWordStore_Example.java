package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfusWordStore_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfusWordStore_Example() {
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

        public Criteria andHfusWordStoreIdIsNull() {
            addCriterion("hfus_word_store_id is null");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdIsNotNull() {
            addCriterion("hfus_word_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdEqualTo(Long value) {
            addCriterion("hfus_word_store_id =", value, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdNotEqualTo(Long value) {
            addCriterion("hfus_word_store_id <>", value, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdGreaterThan(Long value) {
            addCriterion("hfus_word_store_id >", value, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfus_word_store_id >=", value, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdLessThan(Long value) {
            addCriterion("hfus_word_store_id <", value, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("hfus_word_store_id <=", value, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdIn(List<Long> values) {
            addCriterion("hfus_word_store_id in", values, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdNotIn(List<Long> values) {
            addCriterion("hfus_word_store_id not in", values, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdBetween(Long value1, Long value2) {
            addCriterion("hfus_word_store_id between", value1, value2, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andHfusWordStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("hfus_word_store_id not between", value1, value2, "hfusWordStoreId");
            return (Criteria) this;
        }

        public Criteria andChineseCharsIsNull() {
            addCriterion("chinese_chars is null");
            return (Criteria) this;
        }

        public Criteria andChineseCharsIsNotNull() {
            addCriterion("chinese_chars is not null");
            return (Criteria) this;
        }

        public Criteria andChineseCharsEqualTo(String value) {
            addCriterion("chinese_chars =", value, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsNotEqualTo(String value) {
            addCriterion("chinese_chars <>", value, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsGreaterThan(String value) {
            addCriterion("chinese_chars >", value, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_chars >=", value, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsLessThan(String value) {
            addCriterion("chinese_chars <", value, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsLessThanOrEqualTo(String value) {
            addCriterion("chinese_chars <=", value, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsLike(String value) {
            addCriterion("chinese_chars like", value, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsNotLike(String value) {
            addCriterion("chinese_chars not like", value, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsIn(List<String> values) {
            addCriterion("chinese_chars in", values, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsNotIn(List<String> values) {
            addCriterion("chinese_chars not in", values, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsBetween(String value1, String value2) {
            addCriterion("chinese_chars between", value1, value2, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andChineseCharsNotBetween(String value1, String value2) {
            addCriterion("chinese_chars not between", value1, value2, "chineseChars");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNull() {
            addCriterion("english_name is null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNotNull() {
            addCriterion("english_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameEqualTo(String value) {
            addCriterion("english_name =", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotEqualTo(String value) {
            addCriterion("english_name <>", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThan(String value) {
            addCriterion("english_name >", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("english_name >=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThan(String value) {
            addCriterion("english_name <", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("english_name <=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLike(String value) {
            addCriterion("english_name like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLike(String value) {
            addCriterion("english_name not like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIn(List<String> values) {
            addCriterion("english_name in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotIn(List<String> values) {
            addCriterion("english_name not in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameBetween(String value1, String value2) {
            addCriterion("english_name between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotBetween(String value1, String value2) {
            addCriterion("english_name not between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameIsNull() {
            addCriterion("english_short_name is null");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameIsNotNull() {
            addCriterion("english_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameEqualTo(String value) {
            addCriterion("english_short_name =", value, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameNotEqualTo(String value) {
            addCriterion("english_short_name <>", value, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameGreaterThan(String value) {
            addCriterion("english_short_name >", value, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("english_short_name >=", value, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameLessThan(String value) {
            addCriterion("english_short_name <", value, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameLessThanOrEqualTo(String value) {
            addCriterion("english_short_name <=", value, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameLike(String value) {
            addCriterion("english_short_name like", value, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameNotLike(String value) {
            addCriterion("english_short_name not like", value, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameIn(List<String> values) {
            addCriterion("english_short_name in", values, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameNotIn(List<String> values) {
            addCriterion("english_short_name not in", values, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameBetween(String value1, String value2) {
            addCriterion("english_short_name between", value1, value2, "englishShortName");
            return (Criteria) this;
        }

        public Criteria andEnglishShortNameNotBetween(String value1, String value2) {
            addCriterion("english_short_name not between", value1, value2, "englishShortName");
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