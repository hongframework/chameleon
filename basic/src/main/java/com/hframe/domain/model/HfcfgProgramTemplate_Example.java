package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfcfgProgramTemplate_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfcfgProgramTemplate_Example() {
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

        public Criteria andProgramTemplateNameIsNull() {
            addCriterion("program_template_name is null");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameIsNotNull() {
            addCriterion("program_template_name is not null");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameEqualTo(String value) {
            addCriterion("program_template_name =", value, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameNotEqualTo(String value) {
            addCriterion("program_template_name <>", value, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameGreaterThan(String value) {
            addCriterion("program_template_name >", value, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("program_template_name >=", value, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameLessThan(String value) {
            addCriterion("program_template_name <", value, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("program_template_name <=", value, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameLike(String value) {
            addCriterion("program_template_name like", value, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameNotLike(String value) {
            addCriterion("program_template_name not like", value, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameIn(List<String> values) {
            addCriterion("program_template_name in", values, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameNotIn(List<String> values) {
            addCriterion("program_template_name not in", values, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameBetween(String value1, String value2) {
            addCriterion("program_template_name between", value1, value2, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateNameNotBetween(String value1, String value2) {
            addCriterion("program_template_name not between", value1, value2, "programTemplateName");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeIsNull() {
            addCriterion("program_template_code is null");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeIsNotNull() {
            addCriterion("program_template_code is not null");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeEqualTo(String value) {
            addCriterion("program_template_code =", value, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeNotEqualTo(String value) {
            addCriterion("program_template_code <>", value, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeGreaterThan(String value) {
            addCriterion("program_template_code >", value, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("program_template_code >=", value, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeLessThan(String value) {
            addCriterion("program_template_code <", value, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("program_template_code <=", value, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeLike(String value) {
            addCriterion("program_template_code like", value, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeNotLike(String value) {
            addCriterion("program_template_code not like", value, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeIn(List<String> values) {
            addCriterion("program_template_code in", values, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeNotIn(List<String> values) {
            addCriterion("program_template_code not in", values, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeBetween(String value1, String value2) {
            addCriterion("program_template_code between", value1, value2, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateCodeNotBetween(String value1, String value2) {
            addCriterion("program_template_code not between", value1, value2, "programTemplateCode");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescIsNull() {
            addCriterion("program_template_desc is null");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescIsNotNull() {
            addCriterion("program_template_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescEqualTo(String value) {
            addCriterion("program_template_desc =", value, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescNotEqualTo(String value) {
            addCriterion("program_template_desc <>", value, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescGreaterThan(String value) {
            addCriterion("program_template_desc >", value, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescGreaterThanOrEqualTo(String value) {
            addCriterion("program_template_desc >=", value, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescLessThan(String value) {
            addCriterion("program_template_desc <", value, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescLessThanOrEqualTo(String value) {
            addCriterion("program_template_desc <=", value, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescLike(String value) {
            addCriterion("program_template_desc like", value, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescNotLike(String value) {
            addCriterion("program_template_desc not like", value, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescIn(List<String> values) {
            addCriterion("program_template_desc in", values, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescNotIn(List<String> values) {
            addCriterion("program_template_desc not in", values, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescBetween(String value1, String value2) {
            addCriterion("program_template_desc between", value1, value2, "programTemplateDesc");
            return (Criteria) this;
        }

        public Criteria andProgramTemplateDescNotBetween(String value1, String value2) {
            addCriterion("program_template_desc not between", value1, value2, "programTemplateDesc");
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