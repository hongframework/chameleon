package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfcfgPageTemplate_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfcfgPageTemplate_Example() {
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

        public Criteria andHfcfgPageTemplateTypeIsNull() {
            addCriterion("hfcfg_page_template_type is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeIsNotNull() {
            addCriterion("hfcfg_page_template_type is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeEqualTo(Integer value) {
            addCriterion("hfcfg_page_template_type =", value, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeNotEqualTo(Integer value) {
            addCriterion("hfcfg_page_template_type <>", value, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeGreaterThan(Integer value) {
            addCriterion("hfcfg_page_template_type >", value, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hfcfg_page_template_type >=", value, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeLessThan(Integer value) {
            addCriterion("hfcfg_page_template_type <", value, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("hfcfg_page_template_type <=", value, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeIn(List<Integer> values) {
            addCriterion("hfcfg_page_template_type in", values, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeNotIn(List<Integer> values) {
            addCriterion("hfcfg_page_template_type not in", values, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeBetween(Integer value1, Integer value2) {
            addCriterion("hfcfg_page_template_type between", value1, value2, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("hfcfg_page_template_type not between", value1, value2, "hfcfgPageTemplateType");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameIsNull() {
            addCriterion("hfcfg_page_template_name is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameIsNotNull() {
            addCriterion("hfcfg_page_template_name is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameEqualTo(String value) {
            addCriterion("hfcfg_page_template_name =", value, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameNotEqualTo(String value) {
            addCriterion("hfcfg_page_template_name <>", value, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameGreaterThan(String value) {
            addCriterion("hfcfg_page_template_name >", value, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("hfcfg_page_template_name >=", value, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameLessThan(String value) {
            addCriterion("hfcfg_page_template_name <", value, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("hfcfg_page_template_name <=", value, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameLike(String value) {
            addCriterion("hfcfg_page_template_name like", value, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameNotLike(String value) {
            addCriterion("hfcfg_page_template_name not like", value, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameIn(List<String> values) {
            addCriterion("hfcfg_page_template_name in", values, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameNotIn(List<String> values) {
            addCriterion("hfcfg_page_template_name not in", values, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameBetween(String value1, String value2) {
            addCriterion("hfcfg_page_template_name between", value1, value2, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateNameNotBetween(String value1, String value2) {
            addCriterion("hfcfg_page_template_name not between", value1, value2, "hfcfgPageTemplateName");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeIsNull() {
            addCriterion("hfcfg_page_template_code is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeIsNotNull() {
            addCriterion("hfcfg_page_template_code is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeEqualTo(String value) {
            addCriterion("hfcfg_page_template_code =", value, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeNotEqualTo(String value) {
            addCriterion("hfcfg_page_template_code <>", value, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeGreaterThan(String value) {
            addCriterion("hfcfg_page_template_code >", value, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hfcfg_page_template_code >=", value, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeLessThan(String value) {
            addCriterion("hfcfg_page_template_code <", value, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("hfcfg_page_template_code <=", value, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeLike(String value) {
            addCriterion("hfcfg_page_template_code like", value, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeNotLike(String value) {
            addCriterion("hfcfg_page_template_code not like", value, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeIn(List<String> values) {
            addCriterion("hfcfg_page_template_code in", values, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeNotIn(List<String> values) {
            addCriterion("hfcfg_page_template_code not in", values, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeBetween(String value1, String value2) {
            addCriterion("hfcfg_page_template_code between", value1, value2, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateCodeNotBetween(String value1, String value2) {
            addCriterion("hfcfg_page_template_code not between", value1, value2, "hfcfgPageTemplateCode");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescIsNull() {
            addCriterion("hfcfg_page_template_desc is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescIsNotNull() {
            addCriterion("hfcfg_page_template_desc is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescEqualTo(String value) {
            addCriterion("hfcfg_page_template_desc =", value, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescNotEqualTo(String value) {
            addCriterion("hfcfg_page_template_desc <>", value, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescGreaterThan(String value) {
            addCriterion("hfcfg_page_template_desc >", value, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescGreaterThanOrEqualTo(String value) {
            addCriterion("hfcfg_page_template_desc >=", value, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescLessThan(String value) {
            addCriterion("hfcfg_page_template_desc <", value, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescLessThanOrEqualTo(String value) {
            addCriterion("hfcfg_page_template_desc <=", value, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescLike(String value) {
            addCriterion("hfcfg_page_template_desc like", value, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescNotLike(String value) {
            addCriterion("hfcfg_page_template_desc not like", value, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescIn(List<String> values) {
            addCriterion("hfcfg_page_template_desc in", values, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescNotIn(List<String> values) {
            addCriterion("hfcfg_page_template_desc not in", values, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescBetween(String value1, String value2) {
            addCriterion("hfcfg_page_template_desc between", value1, value2, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andHfcfgPageTemplateDescNotBetween(String value1, String value2) {
            addCriterion("hfcfg_page_template_desc not between", value1, value2, "hfcfgPageTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlIsNull() {
            addCriterion("template_url is null");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlIsNotNull() {
            addCriterion("template_url is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlEqualTo(String value) {
            addCriterion("template_url =", value, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlNotEqualTo(String value) {
            addCriterion("template_url <>", value, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlGreaterThan(String value) {
            addCriterion("template_url >", value, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlGreaterThanOrEqualTo(String value) {
            addCriterion("template_url >=", value, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlLessThan(String value) {
            addCriterion("template_url <", value, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlLessThanOrEqualTo(String value) {
            addCriterion("template_url <=", value, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlLike(String value) {
            addCriterion("template_url like", value, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlNotLike(String value) {
            addCriterion("template_url not like", value, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlIn(List<String> values) {
            addCriterion("template_url in", values, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlNotIn(List<String> values) {
            addCriterion("template_url not in", values, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlBetween(String value1, String value2) {
            addCriterion("template_url between", value1, value2, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andTemplateUrlNotBetween(String value1, String value2) {
            addCriterion("template_url not between", value1, value2, "templateUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlIsNull() {
            addCriterion("snapshot_url is null");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlIsNotNull() {
            addCriterion("snapshot_url is not null");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlEqualTo(String value) {
            addCriterion("snapshot_url =", value, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlNotEqualTo(String value) {
            addCriterion("snapshot_url <>", value, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlGreaterThan(String value) {
            addCriterion("snapshot_url >", value, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlGreaterThanOrEqualTo(String value) {
            addCriterion("snapshot_url >=", value, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlLessThan(String value) {
            addCriterion("snapshot_url <", value, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlLessThanOrEqualTo(String value) {
            addCriterion("snapshot_url <=", value, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlLike(String value) {
            addCriterion("snapshot_url like", value, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlNotLike(String value) {
            addCriterion("snapshot_url not like", value, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlIn(List<String> values) {
            addCriterion("snapshot_url in", values, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlNotIn(List<String> values) {
            addCriterion("snapshot_url not in", values, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlBetween(String value1, String value2) {
            addCriterion("snapshot_url between", value1, value2, "snapshotUrl");
            return (Criteria) this;
        }

        public Criteria andSnapshotUrlNotBetween(String value1, String value2) {
            addCriterion("snapshot_url not between", value1, value2, "snapshotUrl");
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