package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfsecRoleAuthorize_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfsecRoleAuthorize_Example() {
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

        public Criteria andHfsecRoleAuthorizeIdIsNull() {
            addCriterion("hfsec_role_authorize_id is null");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdIsNotNull() {
            addCriterion("hfsec_role_authorize_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdEqualTo(Long value) {
            addCriterion("hfsec_role_authorize_id =", value, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdNotEqualTo(Long value) {
            addCriterion("hfsec_role_authorize_id <>", value, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdGreaterThan(Long value) {
            addCriterion("hfsec_role_authorize_id >", value, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfsec_role_authorize_id >=", value, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdLessThan(Long value) {
            addCriterion("hfsec_role_authorize_id <", value, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdLessThanOrEqualTo(Long value) {
            addCriterion("hfsec_role_authorize_id <=", value, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdIn(List<Long> values) {
            addCriterion("hfsec_role_authorize_id in", values, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdNotIn(List<Long> values) {
            addCriterion("hfsec_role_authorize_id not in", values, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdBetween(Long value1, Long value2) {
            addCriterion("hfsec_role_authorize_id between", value1, value2, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeIdNotBetween(Long value1, Long value2) {
            addCriterion("hfsec_role_authorize_id not between", value1, value2, "hfsecRoleAuthorizeId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeIsNull() {
            addCriterion("hfsec_role_authorize_type is null");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeIsNotNull() {
            addCriterion("hfsec_role_authorize_type is not null");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeEqualTo(Byte value) {
            addCriterion("hfsec_role_authorize_type =", value, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeNotEqualTo(Byte value) {
            addCriterion("hfsec_role_authorize_type <>", value, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeGreaterThan(Byte value) {
            addCriterion("hfsec_role_authorize_type >", value, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("hfsec_role_authorize_type >=", value, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeLessThan(Byte value) {
            addCriterion("hfsec_role_authorize_type <", value, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeLessThanOrEqualTo(Byte value) {
            addCriterion("hfsec_role_authorize_type <=", value, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeIn(List<Byte> values) {
            addCriterion("hfsec_role_authorize_type in", values, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeNotIn(List<Byte> values) {
            addCriterion("hfsec_role_authorize_type not in", values, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeBetween(Byte value1, Byte value2) {
            addCriterion("hfsec_role_authorize_type between", value1, value2, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleAuthorizeTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("hfsec_role_authorize_type not between", value1, value2, "hfsecRoleAuthorizeType");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdIsNull() {
            addCriterion("hfsec_role_id is null");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdIsNotNull() {
            addCriterion("hfsec_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdEqualTo(Long value) {
            addCriterion("hfsec_role_id =", value, "hfsecRoleId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdNotEqualTo(Long value) {
            addCriterion("hfsec_role_id <>", value, "hfsecRoleId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdGreaterThan(Long value) {
            addCriterion("hfsec_role_id >", value, "hfsecRoleId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfsec_role_id >=", value, "hfsecRoleId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdLessThan(Long value) {
            addCriterion("hfsec_role_id <", value, "hfsecRoleId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("hfsec_role_id <=", value, "hfsecRoleId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdIn(List<Long> values) {
            addCriterion("hfsec_role_id in", values, "hfsecRoleId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdNotIn(List<Long> values) {
            addCriterion("hfsec_role_id not in", values, "hfsecRoleId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdBetween(Long value1, Long value2) {
            addCriterion("hfsec_role_id between", value1, value2, "hfsecRoleId");
            return (Criteria) this;
        }

        public Criteria andHfsecRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("hfsec_role_id not between", value1, value2, "hfsecRoleId");
            return (Criteria) this;
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

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
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

        public Criteria andOperateEventListIsNull() {
            addCriterion("operate_event_list is null");
            return (Criteria) this;
        }

        public Criteria andOperateEventListIsNotNull() {
            addCriterion("operate_event_list is not null");
            return (Criteria) this;
        }

        public Criteria andOperateEventListEqualTo(String value) {
            addCriterion("operate_event_list =", value, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListNotEqualTo(String value) {
            addCriterion("operate_event_list <>", value, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListGreaterThan(String value) {
            addCriterion("operate_event_list >", value, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListGreaterThanOrEqualTo(String value) {
            addCriterion("operate_event_list >=", value, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListLessThan(String value) {
            addCriterion("operate_event_list <", value, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListLessThanOrEqualTo(String value) {
            addCriterion("operate_event_list <=", value, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListLike(String value) {
            addCriterion("operate_event_list like", value, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListNotLike(String value) {
            addCriterion("operate_event_list not like", value, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListIn(List<String> values) {
            addCriterion("operate_event_list in", values, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListNotIn(List<String> values) {
            addCriterion("operate_event_list not in", values, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListBetween(String value1, String value2) {
            addCriterion("operate_event_list between", value1, value2, "operateEventList");
            return (Criteria) this;
        }

        public Criteria andOperateEventListNotBetween(String value1, String value2) {
            addCriterion("operate_event_list not between", value1, value2, "operateEventList");
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