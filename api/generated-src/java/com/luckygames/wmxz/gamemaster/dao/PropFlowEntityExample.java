package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PropFlowEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropFlowEntityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andStatusEqualTo(Status value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Status value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Status value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Status value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Status value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Status value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Status> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Status> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Status value1, Status value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Status value1, Status value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Long value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Long value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Long value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Long value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Long value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Long> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Long> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Long value1, Long value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Long value1, Long value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNull() {
            addCriterion("`server_name` is null");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNotNull() {
            addCriterion("`server_name` is not null");
            return (Criteria) this;
        }

        public Criteria andServerNameEqualTo(String value) {
            addCriterion("`server_name` =", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotEqualTo(String value) {
            addCriterion("`server_name` <>", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThan(String value) {
            addCriterion("`server_name` >", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThanOrEqualTo(String value) {
            addCriterion("`server_name` >=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThan(String value) {
            addCriterion("`server_name` <", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThanOrEqualTo(String value) {
            addCriterion("`server_name` <=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLike(String value) {
            addCriterion("`server_name` like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotLike(String value) {
            addCriterion("`server_name` not like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameIn(List<String> values) {
            addCriterion("`server_name` in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotIn(List<String> values) {
            addCriterion("`server_name` not in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameBetween(String value1, String value2) {
            addCriterion("`server_name` between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotBetween(String value1, String value2) {
            addCriterion("`server_name` not between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeIsNull() {
            addCriterion("strengthening_grade is null");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeIsNotNull() {
            addCriterion("strengthening_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeEqualTo(Integer value) {
            addCriterion("strengthening_grade =", value, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeNotEqualTo(Integer value) {
            addCriterion("strengthening_grade <>", value, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeGreaterThan(Integer value) {
            addCriterion("strengthening_grade >", value, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("strengthening_grade >=", value, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeLessThan(Integer value) {
            addCriterion("strengthening_grade <", value, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeLessThanOrEqualTo(Integer value) {
            addCriterion("strengthening_grade <=", value, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeIn(List<Integer> values) {
            addCriterion("strengthening_grade in", values, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeNotIn(List<Integer> values) {
            addCriterion("strengthening_grade not in", values, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeBetween(Integer value1, Integer value2) {
            addCriterion("strengthening_grade between", value1, value2, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("strengthening_grade not between", value1, value2, "strengtheningGrade");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionIsNull() {
            addCriterion("strengthening_degree_completion is null");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionIsNotNull() {
            addCriterion("strengthening_degree_completion is not null");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionEqualTo(BigDecimal value) {
            addCriterion("strengthening_degree_completion =", value, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionNotEqualTo(BigDecimal value) {
            addCriterion("strengthening_degree_completion <>", value, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionGreaterThan(BigDecimal value) {
            addCriterion("strengthening_degree_completion >", value, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("strengthening_degree_completion >=", value, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionLessThan(BigDecimal value) {
            addCriterion("strengthening_degree_completion <", value, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("strengthening_degree_completion <=", value, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionIn(List<BigDecimal> values) {
            addCriterion("strengthening_degree_completion in", values, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionNotIn(List<BigDecimal> values) {
            addCriterion("strengthening_degree_completion not in", values, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("strengthening_degree_completion between", value1, value2, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andStrengtheningDegreeCompletionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("strengthening_degree_completion not between", value1, value2, "strengtheningDegreeCompletion");
            return (Criteria) this;
        }

        public Criteria andLuckyValueIsNull() {
            addCriterion("lucky_value is null");
            return (Criteria) this;
        }

        public Criteria andLuckyValueIsNotNull() {
            addCriterion("lucky_value is not null");
            return (Criteria) this;
        }

        public Criteria andLuckyValueEqualTo(Integer value) {
            addCriterion("lucky_value =", value, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andLuckyValueNotEqualTo(Integer value) {
            addCriterion("lucky_value <>", value, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andLuckyValueGreaterThan(Integer value) {
            addCriterion("lucky_value >", value, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andLuckyValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("lucky_value >=", value, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andLuckyValueLessThan(Integer value) {
            addCriterion("lucky_value <", value, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andLuckyValueLessThanOrEqualTo(Integer value) {
            addCriterion("lucky_value <=", value, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andLuckyValueIn(List<Integer> values) {
            addCriterion("lucky_value in", values, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andLuckyValueNotIn(List<Integer> values) {
            addCriterion("lucky_value not in", values, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andLuckyValueBetween(Integer value1, Integer value2) {
            addCriterion("lucky_value between", value1, value2, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andLuckyValueNotBetween(Integer value1, Integer value2) {
            addCriterion("lucky_value not between", value1, value2, "luckyValue");
            return (Criteria) this;
        }

        public Criteria andSetIsNull() {
            addCriterion("`set` is null");
            return (Criteria) this;
        }

        public Criteria andSetIsNotNull() {
            addCriterion("`set` is not null");
            return (Criteria) this;
        }

        public Criteria andSetEqualTo(String value) {
            addCriterion("`set` =", value, "set");
            return (Criteria) this;
        }

        public Criteria andSetNotEqualTo(String value) {
            addCriterion("`set` <>", value, "set");
            return (Criteria) this;
        }

        public Criteria andSetGreaterThan(String value) {
            addCriterion("`set` >", value, "set");
            return (Criteria) this;
        }

        public Criteria andSetGreaterThanOrEqualTo(String value) {
            addCriterion("`set` >=", value, "set");
            return (Criteria) this;
        }

        public Criteria andSetLessThan(String value) {
            addCriterion("`set` <", value, "set");
            return (Criteria) this;
        }

        public Criteria andSetLessThanOrEqualTo(String value) {
            addCriterion("`set` <=", value, "set");
            return (Criteria) this;
        }

        public Criteria andSetLike(String value) {
            addCriterion("`set` like", value, "set");
            return (Criteria) this;
        }

        public Criteria andSetNotLike(String value) {
            addCriterion("`set` not like", value, "set");
            return (Criteria) this;
        }

        public Criteria andSetIn(List<String> values) {
            addCriterion("`set` in", values, "set");
            return (Criteria) this;
        }

        public Criteria andSetNotIn(List<String> values) {
            addCriterion("`set` not in", values, "set");
            return (Criteria) this;
        }

        public Criteria andSetBetween(String value1, String value2) {
            addCriterion("`set` between", value1, value2, "set");
            return (Criteria) this;
        }

        public Criteria andSetNotBetween(String value1, String value2) {
            addCriterion("`set` not between", value1, value2, "set");
            return (Criteria) this;
        }

        public Criteria andClearIsNull() {
            addCriterion("clear is null");
            return (Criteria) this;
        }

        public Criteria andClearIsNotNull() {
            addCriterion("clear is not null");
            return (Criteria) this;
        }

        public Criteria andClearEqualTo(String value) {
            addCriterion("clear =", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearNotEqualTo(String value) {
            addCriterion("clear <>", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearGreaterThan(String value) {
            addCriterion("clear >", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearGreaterThanOrEqualTo(String value) {
            addCriterion("clear >=", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearLessThan(String value) {
            addCriterion("clear <", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearLessThanOrEqualTo(String value) {
            addCriterion("clear <=", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearLike(String value) {
            addCriterion("clear like", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearNotLike(String value) {
            addCriterion("clear not like", value, "clear");
            return (Criteria) this;
        }

        public Criteria andClearIn(List<String> values) {
            addCriterion("clear in", values, "clear");
            return (Criteria) this;
        }

        public Criteria andClearNotIn(List<String> values) {
            addCriterion("clear not in", values, "clear");
            return (Criteria) this;
        }

        public Criteria andClearBetween(String value1, String value2) {
            addCriterion("clear between", value1, value2, "clear");
            return (Criteria) this;
        }

        public Criteria andClearNotBetween(String value1, String value2) {
            addCriterion("clear not between", value1, value2, "clear");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeIsNull() {
            addCriterion("ultimate_attribute is null");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeIsNotNull() {
            addCriterion("ultimate_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeEqualTo(String value) {
            addCriterion("ultimate_attribute =", value, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeNotEqualTo(String value) {
            addCriterion("ultimate_attribute <>", value, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeGreaterThan(String value) {
            addCriterion("ultimate_attribute >", value, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("ultimate_attribute >=", value, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeLessThan(String value) {
            addCriterion("ultimate_attribute <", value, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeLessThanOrEqualTo(String value) {
            addCriterion("ultimate_attribute <=", value, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeLike(String value) {
            addCriterion("ultimate_attribute like", value, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeNotLike(String value) {
            addCriterion("ultimate_attribute not like", value, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeIn(List<String> values) {
            addCriterion("ultimate_attribute in", values, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeNotIn(List<String> values) {
            addCriterion("ultimate_attribute not in", values, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeBetween(String value1, String value2) {
            addCriterion("ultimate_attribute between", value1, value2, "ultimateAttribute");
            return (Criteria) this;
        }

        public Criteria andUltimateAttributeNotBetween(String value1, String value2) {
            addCriterion("ultimate_attribute not between", value1, value2, "ultimateAttribute");
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