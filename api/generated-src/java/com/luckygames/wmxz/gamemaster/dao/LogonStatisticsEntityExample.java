package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LogonStatisticsEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogonStatisticsEntityExample() {
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

        public Criteria andLogonCountIsNull() {
            addCriterion("logon_count is null");
            return (Criteria) this;
        }

        public Criteria andLogonCountIsNotNull() {
            addCriterion("logon_count is not null");
            return (Criteria) this;
        }

        public Criteria andLogonCountEqualTo(Integer value) {
            addCriterion("logon_count =", value, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonCountNotEqualTo(Integer value) {
            addCriterion("logon_count <>", value, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonCountGreaterThan(Integer value) {
            addCriterion("logon_count >", value, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("logon_count >=", value, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonCountLessThan(Integer value) {
            addCriterion("logon_count <", value, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonCountLessThanOrEqualTo(Integer value) {
            addCriterion("logon_count <=", value, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonCountIn(List<Integer> values) {
            addCriterion("logon_count in", values, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonCountNotIn(List<Integer> values) {
            addCriterion("logon_count not in", values, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonCountBetween(Integer value1, Integer value2) {
            addCriterion("logon_count between", value1, value2, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonCountNotBetween(Integer value1, Integer value2) {
            addCriterion("logon_count not between", value1, value2, "logonCount");
            return (Criteria) this;
        }

        public Criteria andLogonNumberIsNull() {
            addCriterion("logon_number is null");
            return (Criteria) this;
        }

        public Criteria andLogonNumberIsNotNull() {
            addCriterion("logon_number is not null");
            return (Criteria) this;
        }

        public Criteria andLogonNumberEqualTo(Integer value) {
            addCriterion("logon_number =", value, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andLogonNumberNotEqualTo(Integer value) {
            addCriterion("logon_number <>", value, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andLogonNumberGreaterThan(Integer value) {
            addCriterion("logon_number >", value, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andLogonNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("logon_number >=", value, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andLogonNumberLessThan(Integer value) {
            addCriterion("logon_number <", value, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andLogonNumberLessThanOrEqualTo(Integer value) {
            addCriterion("logon_number <=", value, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andLogonNumberIn(List<Integer> values) {
            addCriterion("logon_number in", values, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andLogonNumberNotIn(List<Integer> values) {
            addCriterion("logon_number not in", values, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andLogonNumberBetween(Integer value1, Integer value2) {
            addCriterion("logon_number between", value1, value2, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andLogonNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("logon_number not between", value1, value2, "logonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberIsNull() {
            addCriterion("avg_logon_number is null");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberIsNotNull() {
            addCriterion("avg_logon_number is not null");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberEqualTo(BigDecimal value) {
            addCriterion("avg_logon_number =", value, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberNotEqualTo(BigDecimal value) {
            addCriterion("avg_logon_number <>", value, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberGreaterThan(BigDecimal value) {
            addCriterion("avg_logon_number >", value, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_logon_number >=", value, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberLessThan(BigDecimal value) {
            addCriterion("avg_logon_number <", value, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_logon_number <=", value, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberIn(List<BigDecimal> values) {
            addCriterion("avg_logon_number in", values, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberNotIn(List<BigDecimal> values) {
            addCriterion("avg_logon_number not in", values, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_logon_number between", value1, value2, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andAvgLogonNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_logon_number not between", value1, value2, "avgLogonNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountIsNull() {
            addCriterion("old_player_count is null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountIsNotNull() {
            addCriterion("old_player_count is not null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountEqualTo(Integer value) {
            addCriterion("old_player_count =", value, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountNotEqualTo(Integer value) {
            addCriterion("old_player_count <>", value, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountGreaterThan(Integer value) {
            addCriterion("old_player_count >", value, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_player_count >=", value, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountLessThan(Integer value) {
            addCriterion("old_player_count <", value, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountLessThanOrEqualTo(Integer value) {
            addCriterion("old_player_count <=", value, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountIn(List<Integer> values) {
            addCriterion("old_player_count in", values, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountNotIn(List<Integer> values) {
            addCriterion("old_player_count not in", values, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountBetween(Integer value1, Integer value2) {
            addCriterion("old_player_count between", value1, value2, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("old_player_count not between", value1, value2, "oldPlayerCount");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeIsNull() {
            addCriterion("old_player_online_time is null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeIsNotNull() {
            addCriterion("old_player_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeEqualTo(Integer value) {
            addCriterion("old_player_online_time =", value, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeNotEqualTo(Integer value) {
            addCriterion("old_player_online_time <>", value, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeGreaterThan(Integer value) {
            addCriterion("old_player_online_time >", value, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_player_online_time >=", value, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeLessThan(Integer value) {
            addCriterion("old_player_online_time <", value, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeLessThanOrEqualTo(Integer value) {
            addCriterion("old_player_online_time <=", value, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeIn(List<Integer> values) {
            addCriterion("old_player_online_time in", values, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeNotIn(List<Integer> values) {
            addCriterion("old_player_online_time not in", values, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeBetween(Integer value1, Integer value2) {
            addCriterion("old_player_online_time between", value1, value2, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerOnlineTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("old_player_online_time not between", value1, value2, "oldPlayerOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeIsNull() {
            addCriterion("old_player_avg_online_time is null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeIsNotNull() {
            addCriterion("old_player_avg_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeEqualTo(BigDecimal value) {
            addCriterion("old_player_avg_online_time =", value, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeNotEqualTo(BigDecimal value) {
            addCriterion("old_player_avg_online_time <>", value, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeGreaterThan(BigDecimal value) {
            addCriterion("old_player_avg_online_time >", value, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_player_avg_online_time >=", value, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeLessThan(BigDecimal value) {
            addCriterion("old_player_avg_online_time <", value, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_player_avg_online_time <=", value, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeIn(List<BigDecimal> values) {
            addCriterion("old_player_avg_online_time in", values, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeNotIn(List<BigDecimal> values) {
            addCriterion("old_player_avg_online_time not in", values, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_player_avg_online_time between", value1, value2, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerAvgOnlineTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_player_avg_online_time not between", value1, value2, "oldPlayerAvgOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuIsNull() {
            addCriterion("old_player_arpu is null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuIsNotNull() {
            addCriterion("old_player_arpu is not null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuEqualTo(BigDecimal value) {
            addCriterion("old_player_arpu =", value, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuNotEqualTo(BigDecimal value) {
            addCriterion("old_player_arpu <>", value, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuGreaterThan(BigDecimal value) {
            addCriterion("old_player_arpu >", value, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_player_arpu >=", value, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuLessThan(BigDecimal value) {
            addCriterion("old_player_arpu <", value, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_player_arpu <=", value, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuIn(List<BigDecimal> values) {
            addCriterion("old_player_arpu in", values, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuNotIn(List<BigDecimal> values) {
            addCriterion("old_player_arpu not in", values, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_player_arpu between", value1, value2, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andOldPlayerArpuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_player_arpu not between", value1, value2, "oldPlayerArpu");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountIsNull() {
            addCriterion("active_player_count is null");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountIsNotNull() {
            addCriterion("active_player_count is not null");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountEqualTo(Integer value) {
            addCriterion("active_player_count =", value, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountNotEqualTo(Integer value) {
            addCriterion("active_player_count <>", value, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountGreaterThan(Integer value) {
            addCriterion("active_player_count >", value, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_player_count >=", value, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountLessThan(Integer value) {
            addCriterion("active_player_count <", value, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountLessThanOrEqualTo(Integer value) {
            addCriterion("active_player_count <=", value, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountIn(List<Integer> values) {
            addCriterion("active_player_count in", values, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountNotIn(List<Integer> values) {
            addCriterion("active_player_count not in", values, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountBetween(Integer value1, Integer value2) {
            addCriterion("active_player_count between", value1, value2, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andActivePlayerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("active_player_count not between", value1, value2, "activePlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountIsNull() {
            addCriterion("loyal_player_count is null");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountIsNotNull() {
            addCriterion("loyal_player_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountEqualTo(Integer value) {
            addCriterion("loyal_player_count =", value, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountNotEqualTo(Integer value) {
            addCriterion("loyal_player_count <>", value, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountGreaterThan(Integer value) {
            addCriterion("loyal_player_count >", value, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("loyal_player_count >=", value, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountLessThan(Integer value) {
            addCriterion("loyal_player_count <", value, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountLessThanOrEqualTo(Integer value) {
            addCriterion("loyal_player_count <=", value, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountIn(List<Integer> values) {
            addCriterion("loyal_player_count in", values, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountNotIn(List<Integer> values) {
            addCriterion("loyal_player_count not in", values, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountBetween(Integer value1, Integer value2) {
            addCriterion("loyal_player_count between", value1, value2, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andLoyalPlayerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("loyal_player_count not between", value1, value2, "loyalPlayerCount");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationIsNull() {
            addCriterion("total_registration is null");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationIsNotNull() {
            addCriterion("total_registration is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationEqualTo(Integer value) {
            addCriterion("total_registration =", value, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationNotEqualTo(Integer value) {
            addCriterion("total_registration <>", value, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationGreaterThan(Integer value) {
            addCriterion("total_registration >", value, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_registration >=", value, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationLessThan(Integer value) {
            addCriterion("total_registration <", value, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationLessThanOrEqualTo(Integer value) {
            addCriterion("total_registration <=", value, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationIn(List<Integer> values) {
            addCriterion("total_registration in", values, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationNotIn(List<Integer> values) {
            addCriterion("total_registration not in", values, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationBetween(Integer value1, Integer value2) {
            addCriterion("total_registration between", value1, value2, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andTotalRegistrationNotBetween(Integer value1, Integer value2) {
            addCriterion("total_registration not between", value1, value2, "totalRegistration");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentIsNull() {
            addCriterion("old_player_equipment is null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentIsNotNull() {
            addCriterion("old_player_equipment is not null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentEqualTo(Integer value) {
            addCriterion("old_player_equipment =", value, "oldPlayerEquipment");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentNotEqualTo(Integer value) {
            addCriterion("old_player_equipment <>", value, "oldPlayerEquipment");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentGreaterThan(Integer value) {
            addCriterion("old_player_equipment >", value, "oldPlayerEquipment");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_player_equipment >=", value, "oldPlayerEquipment");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentLessThan(Integer value) {
            addCriterion("old_player_equipment <", value, "oldPlayerEquipment");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentLessThanOrEqualTo(Integer value) {
            addCriterion("old_player_equipment <=", value, "oldPlayerEquipment");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentIn(List<Integer> values) {
            addCriterion("old_player_equipment in", values, "oldPlayerEquipment");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentNotIn(List<Integer> values) {
            addCriterion("old_player_equipment not in", values, "oldPlayerEquipment");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentBetween(Integer value1, Integer value2) {
            addCriterion("old_player_equipment between", value1, value2, "oldPlayerEquipment");
            return (Criteria) this;
        }

        public Criteria andOldPlayerEquipmentNotBetween(Integer value1, Integer value2) {
            addCriterion("old_player_equipment not between", value1, value2, "oldPlayerEquipment");
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