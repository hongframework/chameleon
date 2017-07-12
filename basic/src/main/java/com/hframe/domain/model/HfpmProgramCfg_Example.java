package com.hframe.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HfpmProgramCfg_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public HfpmProgramCfg_Example() {
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

        public Criteria andShowNameIsNull() {
            addCriterion("show_name is null");
            return (Criteria) this;
        }

        public Criteria andShowNameIsNotNull() {
            addCriterion("show_name is not null");
            return (Criteria) this;
        }

        public Criteria andShowNameEqualTo(String value) {
            addCriterion("show_name =", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotEqualTo(String value) {
            addCriterion("show_name <>", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThan(String value) {
            addCriterion("show_name >", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThanOrEqualTo(String value) {
            addCriterion("show_name >=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThan(String value) {
            addCriterion("show_name <", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThanOrEqualTo(String value) {
            addCriterion("show_name <=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLike(String value) {
            addCriterion("show_name like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotLike(String value) {
            addCriterion("show_name not like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameIn(List<String> values) {
            addCriterion("show_name in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotIn(List<String> values) {
            addCriterion("show_name not in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameBetween(String value1, String value2) {
            addCriterion("show_name between", value1, value2, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotBetween(String value1, String value2) {
            addCriterion("show_name not between", value1, value2, "showName");
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

        public Criteria andHfcfgProgramSkinIdIsNull() {
            addCriterion("hfcfg_program_skin_id is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdIsNotNull() {
            addCriterion("hfcfg_program_skin_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdEqualTo(Long value) {
            addCriterion("hfcfg_program_skin_id =", value, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdNotEqualTo(Long value) {
            addCriterion("hfcfg_program_skin_id <>", value, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdGreaterThan(Long value) {
            addCriterion("hfcfg_program_skin_id >", value, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfcfg_program_skin_id >=", value, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdLessThan(Long value) {
            addCriterion("hfcfg_program_skin_id <", value, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdLessThanOrEqualTo(Long value) {
            addCriterion("hfcfg_program_skin_id <=", value, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdIn(List<Long> values) {
            addCriterion("hfcfg_program_skin_id in", values, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdNotIn(List<Long> values) {
            addCriterion("hfcfg_program_skin_id not in", values, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdBetween(Long value1, Long value2) {
            addCriterion("hfcfg_program_skin_id between", value1, value2, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgProgramSkinIdNotBetween(Long value1, Long value2) {
            addCriterion("hfcfg_program_skin_id not between", value1, value2, "hfcfgProgramSkinId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdIsNull() {
            addCriterion("hfcfg_login_page_id is null");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdIsNotNull() {
            addCriterion("hfcfg_login_page_id is not null");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdEqualTo(Long value) {
            addCriterion("hfcfg_login_page_id =", value, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdNotEqualTo(Long value) {
            addCriterion("hfcfg_login_page_id <>", value, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdGreaterThan(Long value) {
            addCriterion("hfcfg_login_page_id >", value, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hfcfg_login_page_id >=", value, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdLessThan(Long value) {
            addCriterion("hfcfg_login_page_id <", value, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdLessThanOrEqualTo(Long value) {
            addCriterion("hfcfg_login_page_id <=", value, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdIn(List<Long> values) {
            addCriterion("hfcfg_login_page_id in", values, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdNotIn(List<Long> values) {
            addCriterion("hfcfg_login_page_id not in", values, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdBetween(Long value1, Long value2) {
            addCriterion("hfcfg_login_page_id between", value1, value2, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andHfcfgLoginPageIdNotBetween(Long value1, Long value2) {
            addCriterion("hfcfg_login_page_id not between", value1, value2, "hfcfgLoginPageId");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlIsNull() {
            addCriterion("bg_img_url is null");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlIsNotNull() {
            addCriterion("bg_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlEqualTo(String value) {
            addCriterion("bg_img_url =", value, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlNotEqualTo(String value) {
            addCriterion("bg_img_url <>", value, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlGreaterThan(String value) {
            addCriterion("bg_img_url >", value, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bg_img_url >=", value, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlLessThan(String value) {
            addCriterion("bg_img_url <", value, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlLessThanOrEqualTo(String value) {
            addCriterion("bg_img_url <=", value, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlLike(String value) {
            addCriterion("bg_img_url like", value, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlNotLike(String value) {
            addCriterion("bg_img_url not like", value, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlIn(List<String> values) {
            addCriterion("bg_img_url in", values, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlNotIn(List<String> values) {
            addCriterion("bg_img_url not in", values, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlBetween(String value1, String value2) {
            addCriterion("bg_img_url between", value1, value2, "bgImgUrl");
            return (Criteria) this;
        }

        public Criteria andBgImgUrlNotBetween(String value1, String value2) {
            addCriterion("bg_img_url not between", value1, value2, "bgImgUrl");
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

        public Criteria andDataEntityNameIsNull() {
            addCriterion("data_entity_name is null");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameIsNotNull() {
            addCriterion("data_entity_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameEqualTo(String value) {
            addCriterion("data_entity_name =", value, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameNotEqualTo(String value) {
            addCriterion("data_entity_name <>", value, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameGreaterThan(String value) {
            addCriterion("data_entity_name >", value, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_entity_name >=", value, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameLessThan(String value) {
            addCriterion("data_entity_name <", value, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameLessThanOrEqualTo(String value) {
            addCriterion("data_entity_name <=", value, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameLike(String value) {
            addCriterion("data_entity_name like", value, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameNotLike(String value) {
            addCriterion("data_entity_name not like", value, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameIn(List<String> values) {
            addCriterion("data_entity_name in", values, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameNotIn(List<String> values) {
            addCriterion("data_entity_name not in", values, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameBetween(String value1, String value2) {
            addCriterion("data_entity_name between", value1, value2, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDataEntityNameNotBetween(String value1, String value2) {
            addCriterion("data_entity_name not between", value1, value2, "dataEntityName");
            return (Criteria) this;
        }

        public Criteria andDictionarysIsNull() {
            addCriterion("dictionarys is null");
            return (Criteria) this;
        }

        public Criteria andDictionarysIsNotNull() {
            addCriterion("dictionarys is not null");
            return (Criteria) this;
        }

        public Criteria andDictionarysEqualTo(String value) {
            addCriterion("dictionarys =", value, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysNotEqualTo(String value) {
            addCriterion("dictionarys <>", value, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysGreaterThan(String value) {
            addCriterion("dictionarys >", value, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysGreaterThanOrEqualTo(String value) {
            addCriterion("dictionarys >=", value, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysLessThan(String value) {
            addCriterion("dictionarys <", value, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysLessThanOrEqualTo(String value) {
            addCriterion("dictionarys <=", value, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysLike(String value) {
            addCriterion("dictionarys like", value, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysNotLike(String value) {
            addCriterion("dictionarys not like", value, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysIn(List<String> values) {
            addCriterion("dictionarys in", values, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysNotIn(List<String> values) {
            addCriterion("dictionarys not in", values, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysBetween(String value1, String value2) {
            addCriterion("dictionarys between", value1, value2, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andDictionarysNotBetween(String value1, String value2) {
            addCriterion("dictionarys not between", value1, value2, "dictionarys");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathIsNull() {
            addCriterion("func_auth_path is null");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathIsNotNull() {
            addCriterion("func_auth_path is not null");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathEqualTo(String value) {
            addCriterion("func_auth_path =", value, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathNotEqualTo(String value) {
            addCriterion("func_auth_path <>", value, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathGreaterThan(String value) {
            addCriterion("func_auth_path >", value, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathGreaterThanOrEqualTo(String value) {
            addCriterion("func_auth_path >=", value, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathLessThan(String value) {
            addCriterion("func_auth_path <", value, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathLessThanOrEqualTo(String value) {
            addCriterion("func_auth_path <=", value, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathLike(String value) {
            addCriterion("func_auth_path like", value, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathNotLike(String value) {
            addCriterion("func_auth_path not like", value, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathIn(List<String> values) {
            addCriterion("func_auth_path in", values, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathNotIn(List<String> values) {
            addCriterion("func_auth_path not in", values, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathBetween(String value1, String value2) {
            addCriterion("func_auth_path between", value1, value2, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncAuthPathNotBetween(String value1, String value2) {
            addCriterion("func_auth_path not between", value1, value2, "funcAuthPath");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameIsNull() {
            addCriterion("func_entity_name is null");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameIsNotNull() {
            addCriterion("func_entity_name is not null");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameEqualTo(String value) {
            addCriterion("func_entity_name =", value, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameNotEqualTo(String value) {
            addCriterion("func_entity_name <>", value, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameGreaterThan(String value) {
            addCriterion("func_entity_name >", value, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameGreaterThanOrEqualTo(String value) {
            addCriterion("func_entity_name >=", value, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameLessThan(String value) {
            addCriterion("func_entity_name <", value, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameLessThanOrEqualTo(String value) {
            addCriterion("func_entity_name <=", value, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameLike(String value) {
            addCriterion("func_entity_name like", value, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameNotLike(String value) {
            addCriterion("func_entity_name not like", value, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameIn(List<String> values) {
            addCriterion("func_entity_name in", values, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameNotIn(List<String> values) {
            addCriterion("func_entity_name not in", values, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameBetween(String value1, String value2) {
            addCriterion("func_entity_name between", value1, value2, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andFuncEntityNameNotBetween(String value1, String value2) {
            addCriterion("func_entity_name not between", value1, value2, "funcEntityName");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathIsNull() {
            addCriterion("user_auth_path is null");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathIsNotNull() {
            addCriterion("user_auth_path is not null");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathEqualTo(String value) {
            addCriterion("user_auth_path =", value, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathNotEqualTo(String value) {
            addCriterion("user_auth_path <>", value, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathGreaterThan(String value) {
            addCriterion("user_auth_path >", value, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathGreaterThanOrEqualTo(String value) {
            addCriterion("user_auth_path >=", value, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathLessThan(String value) {
            addCriterion("user_auth_path <", value, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathLessThanOrEqualTo(String value) {
            addCriterion("user_auth_path <=", value, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathLike(String value) {
            addCriterion("user_auth_path like", value, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathNotLike(String value) {
            addCriterion("user_auth_path not like", value, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathIn(List<String> values) {
            addCriterion("user_auth_path in", values, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathNotIn(List<String> values) {
            addCriterion("user_auth_path not in", values, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathBetween(String value1, String value2) {
            addCriterion("user_auth_path between", value1, value2, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserAuthPathNotBetween(String value1, String value2) {
            addCriterion("user_auth_path not between", value1, value2, "userAuthPath");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameIsNull() {
            addCriterion("user_entity_name is null");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameIsNotNull() {
            addCriterion("user_entity_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameEqualTo(String value) {
            addCriterion("user_entity_name =", value, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameNotEqualTo(String value) {
            addCriterion("user_entity_name <>", value, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameGreaterThan(String value) {
            addCriterion("user_entity_name >", value, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_entity_name >=", value, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameLessThan(String value) {
            addCriterion("user_entity_name <", value, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameLessThanOrEqualTo(String value) {
            addCriterion("user_entity_name <=", value, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameLike(String value) {
            addCriterion("user_entity_name like", value, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameNotLike(String value) {
            addCriterion("user_entity_name not like", value, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameIn(List<String> values) {
            addCriterion("user_entity_name in", values, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameNotIn(List<String> values) {
            addCriterion("user_entity_name not in", values, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameBetween(String value1, String value2) {
            addCriterion("user_entity_name between", value1, value2, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andUserEntityNameNotBetween(String value1, String value2) {
            addCriterion("user_entity_name not between", value1, value2, "userEntityName");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityIsNull() {
            addCriterion("super_auth_filter_entity is null");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityIsNotNull() {
            addCriterion("super_auth_filter_entity is not null");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityEqualTo(Long value) {
            addCriterion("super_auth_filter_entity =", value, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityNotEqualTo(Long value) {
            addCriterion("super_auth_filter_entity <>", value, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityGreaterThan(Long value) {
            addCriterion("super_auth_filter_entity >", value, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityGreaterThanOrEqualTo(Long value) {
            addCriterion("super_auth_filter_entity >=", value, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityLessThan(Long value) {
            addCriterion("super_auth_filter_entity <", value, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityLessThanOrEqualTo(Long value) {
            addCriterion("super_auth_filter_entity <=", value, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityIn(List<Long> values) {
            addCriterion("super_auth_filter_entity in", values, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityNotIn(List<Long> values) {
            addCriterion("super_auth_filter_entity not in", values, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityBetween(Long value1, Long value2) {
            addCriterion("super_auth_filter_entity between", value1, value2, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterEntityNotBetween(Long value1, Long value2) {
            addCriterion("super_auth_filter_entity not between", value1, value2, "superAuthFilterEntity");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldIsNull() {
            addCriterion("super_auth_filter_field is null");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldIsNotNull() {
            addCriterion("super_auth_filter_field is not null");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldEqualTo(Long value) {
            addCriterion("super_auth_filter_field =", value, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldNotEqualTo(Long value) {
            addCriterion("super_auth_filter_field <>", value, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldGreaterThan(Long value) {
            addCriterion("super_auth_filter_field >", value, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldGreaterThanOrEqualTo(Long value) {
            addCriterion("super_auth_filter_field >=", value, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldLessThan(Long value) {
            addCriterion("super_auth_filter_field <", value, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldLessThanOrEqualTo(Long value) {
            addCriterion("super_auth_filter_field <=", value, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldIn(List<Long> values) {
            addCriterion("super_auth_filter_field in", values, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldNotIn(List<Long> values) {
            addCriterion("super_auth_filter_field not in", values, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldBetween(Long value1, Long value2) {
            addCriterion("super_auth_filter_field between", value1, value2, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldNotBetween(Long value1, Long value2) {
            addCriterion("super_auth_filter_field not between", value1, value2, "superAuthFilterField");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueIsNull() {
            addCriterion("super_auth_filter_field_value is null");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueIsNotNull() {
            addCriterion("super_auth_filter_field_value is not null");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueEqualTo(String value) {
            addCriterion("super_auth_filter_field_value =", value, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueNotEqualTo(String value) {
            addCriterion("super_auth_filter_field_value <>", value, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueGreaterThan(String value) {
            addCriterion("super_auth_filter_field_value >", value, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueGreaterThanOrEqualTo(String value) {
            addCriterion("super_auth_filter_field_value >=", value, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueLessThan(String value) {
            addCriterion("super_auth_filter_field_value <", value, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueLessThanOrEqualTo(String value) {
            addCriterion("super_auth_filter_field_value <=", value, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueLike(String value) {
            addCriterion("super_auth_filter_field_value like", value, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueNotLike(String value) {
            addCriterion("super_auth_filter_field_value not like", value, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueIn(List<String> values) {
            addCriterion("super_auth_filter_field_value in", values, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueNotIn(List<String> values) {
            addCriterion("super_auth_filter_field_value not in", values, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueBetween(String value1, String value2) {
            addCriterion("super_auth_filter_field_value between", value1, value2, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andSuperAuthFilterFieldValueNotBetween(String value1, String value2) {
            addCriterion("super_auth_filter_field_value not between", value1, value2, "superAuthFilterFieldValue");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetIsNull() {
            addCriterion("user_login_data_set is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetIsNotNull() {
            addCriterion("user_login_data_set is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetEqualTo(String value) {
            addCriterion("user_login_data_set =", value, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetNotEqualTo(String value) {
            addCriterion("user_login_data_set <>", value, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetGreaterThan(String value) {
            addCriterion("user_login_data_set >", value, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_data_set >=", value, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetLessThan(String value) {
            addCriterion("user_login_data_set <", value, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetLessThanOrEqualTo(String value) {
            addCriterion("user_login_data_set <=", value, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetLike(String value) {
            addCriterion("user_login_data_set like", value, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetNotLike(String value) {
            addCriterion("user_login_data_set not like", value, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetIn(List<String> values) {
            addCriterion("user_login_data_set in", values, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetNotIn(List<String> values) {
            addCriterion("user_login_data_set not in", values, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetBetween(String value1, String value2) {
            addCriterion("user_login_data_set between", value1, value2, "userLoginDataSet");
            return (Criteria) this;
        }

        public Criteria andUserLoginDataSetNotBetween(String value1, String value2) {
            addCriterion("user_login_data_set not between", value1, value2, "userLoginDataSet");
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