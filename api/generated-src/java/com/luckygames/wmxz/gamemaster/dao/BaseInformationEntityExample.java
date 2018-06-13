package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseInformationEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseInformationEntityExample() {
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

        public Criteria andCharIdIsNull() {
            addCriterion("char_id is null");
            return (Criteria) this;
        }

        public Criteria andCharIdIsNotNull() {
            addCriterion("char_id is not null");
            return (Criteria) this;
        }

        public Criteria andCharIdEqualTo(Integer value) {
            addCriterion("char_id =", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdNotEqualTo(Integer value) {
            addCriterion("char_id <>", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdGreaterThan(Integer value) {
            addCriterion("char_id >", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("char_id >=", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdLessThan(Integer value) {
            addCriterion("char_id <", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdLessThanOrEqualTo(Integer value) {
            addCriterion("char_id <=", value, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdIn(List<Integer> values) {
            addCriterion("char_id in", values, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdNotIn(List<Integer> values) {
            addCriterion("char_id not in", values, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdBetween(Integer value1, Integer value2) {
            addCriterion("char_id between", value1, value2, "charId");
            return (Criteria) this;
        }

        public Criteria andCharIdNotBetween(Integer value1, Integer value2) {
            addCriterion("char_id not between", value1, value2, "charId");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andCharNameIsNull() {
            addCriterion("char_name is null");
            return (Criteria) this;
        }

        public Criteria andCharNameIsNotNull() {
            addCriterion("char_name is not null");
            return (Criteria) this;
        }

        public Criteria andCharNameEqualTo(String value) {
            addCriterion("char_name =", value, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameNotEqualTo(String value) {
            addCriterion("char_name <>", value, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameGreaterThan(String value) {
            addCriterion("char_name >", value, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameGreaterThanOrEqualTo(String value) {
            addCriterion("char_name >=", value, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameLessThan(String value) {
            addCriterion("char_name <", value, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameLessThanOrEqualTo(String value) {
            addCriterion("char_name <=", value, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameLike(String value) {
            addCriterion("char_name like", value, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameNotLike(String value) {
            addCriterion("char_name not like", value, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameIn(List<String> values) {
            addCriterion("char_name in", values, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameNotIn(List<String> values) {
            addCriterion("char_name not in", values, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameBetween(String value1, String value2) {
            addCriterion("char_name between", value1, value2, "charName");
            return (Criteria) this;
        }

        public Criteria andCharNameNotBetween(String value1, String value2) {
            addCriterion("char_name not between", value1, value2, "charName");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`level` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`level` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("`level` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("`level` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("`level` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("`level` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("`level` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("`level` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("`level` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("`level` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("`level` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("`level` not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andSlaughterIsNull() {
            addCriterion("slaughter is null");
            return (Criteria) this;
        }

        public Criteria andSlaughterIsNotNull() {
            addCriterion("slaughter is not null");
            return (Criteria) this;
        }

        public Criteria andSlaughterEqualTo(Integer value) {
            addCriterion("slaughter =", value, "slaughter");
            return (Criteria) this;
        }

        public Criteria andSlaughterNotEqualTo(Integer value) {
            addCriterion("slaughter <>", value, "slaughter");
            return (Criteria) this;
        }

        public Criteria andSlaughterGreaterThan(Integer value) {
            addCriterion("slaughter >", value, "slaughter");
            return (Criteria) this;
        }

        public Criteria andSlaughterGreaterThanOrEqualTo(Integer value) {
            addCriterion("slaughter >=", value, "slaughter");
            return (Criteria) this;
        }

        public Criteria andSlaughterLessThan(Integer value) {
            addCriterion("slaughter <", value, "slaughter");
            return (Criteria) this;
        }

        public Criteria andSlaughterLessThanOrEqualTo(Integer value) {
            addCriterion("slaughter <=", value, "slaughter");
            return (Criteria) this;
        }

        public Criteria andSlaughterIn(List<Integer> values) {
            addCriterion("slaughter in", values, "slaughter");
            return (Criteria) this;
        }

        public Criteria andSlaughterNotIn(List<Integer> values) {
            addCriterion("slaughter not in", values, "slaughter");
            return (Criteria) this;
        }

        public Criteria andSlaughterBetween(Integer value1, Integer value2) {
            addCriterion("slaughter between", value1, value2, "slaughter");
            return (Criteria) this;
        }

        public Criteria andSlaughterNotBetween(Integer value1, Integer value2) {
            addCriterion("slaughter not between", value1, value2, "slaughter");
            return (Criteria) this;
        }

        public Criteria andKillingNumberIsNull() {
            addCriterion("killing_number is null");
            return (Criteria) this;
        }

        public Criteria andKillingNumberIsNotNull() {
            addCriterion("killing_number is not null");
            return (Criteria) this;
        }

        public Criteria andKillingNumberEqualTo(Integer value) {
            addCriterion("killing_number =", value, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andKillingNumberNotEqualTo(Integer value) {
            addCriterion("killing_number <>", value, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andKillingNumberGreaterThan(Integer value) {
            addCriterion("killing_number >", value, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andKillingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("killing_number >=", value, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andKillingNumberLessThan(Integer value) {
            addCriterion("killing_number <", value, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andKillingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("killing_number <=", value, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andKillingNumberIn(List<Integer> values) {
            addCriterion("killing_number in", values, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andKillingNumberNotIn(List<Integer> values) {
            addCriterion("killing_number not in", values, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andKillingNumberBetween(Integer value1, Integer value2) {
            addCriterion("killing_number between", value1, value2, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andKillingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("killing_number not between", value1, value2, "killingNumber");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("VIP_level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("VIP_level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(Integer value) {
            addCriterion("VIP_level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(Integer value) {
            addCriterion("VIP_level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(Integer value) {
            addCriterion("VIP_level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIP_level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(Integer value) {
            addCriterion("VIP_level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(Integer value) {
            addCriterion("VIP_level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<Integer> values) {
            addCriterion("VIP_level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<Integer> values) {
            addCriterion("VIP_level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(Integer value1, Integer value2) {
            addCriterion("VIP_level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("VIP_level not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityIsNull() {
            addCriterion("account_authority is null");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityIsNotNull() {
            addCriterion("account_authority is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityEqualTo(Integer value) {
            addCriterion("account_authority =", value, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityNotEqualTo(Integer value) {
            addCriterion("account_authority <>", value, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityGreaterThan(Integer value) {
            addCriterion("account_authority >", value, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_authority >=", value, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityLessThan(Integer value) {
            addCriterion("account_authority <", value, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("account_authority <=", value, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityIn(List<Integer> values) {
            addCriterion("account_authority in", values, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityNotIn(List<Integer> values) {
            addCriterion("account_authority not in", values, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("account_authority between", value1, value2, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andAccountAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("account_authority not between", value1, value2, "accountAuthority");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andCombatPowerIsNull() {
            addCriterion("combat_power is null");
            return (Criteria) this;
        }

        public Criteria andCombatPowerIsNotNull() {
            addCriterion("combat_power is not null");
            return (Criteria) this;
        }

        public Criteria andCombatPowerEqualTo(Integer value) {
            addCriterion("combat_power =", value, "combatPower");
            return (Criteria) this;
        }

        public Criteria andCombatPowerNotEqualTo(Integer value) {
            addCriterion("combat_power <>", value, "combatPower");
            return (Criteria) this;
        }

        public Criteria andCombatPowerGreaterThan(Integer value) {
            addCriterion("combat_power >", value, "combatPower");
            return (Criteria) this;
        }

        public Criteria andCombatPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("combat_power >=", value, "combatPower");
            return (Criteria) this;
        }

        public Criteria andCombatPowerLessThan(Integer value) {
            addCriterion("combat_power <", value, "combatPower");
            return (Criteria) this;
        }

        public Criteria andCombatPowerLessThanOrEqualTo(Integer value) {
            addCriterion("combat_power <=", value, "combatPower");
            return (Criteria) this;
        }

        public Criteria andCombatPowerIn(List<Integer> values) {
            addCriterion("combat_power in", values, "combatPower");
            return (Criteria) this;
        }

        public Criteria andCombatPowerNotIn(List<Integer> values) {
            addCriterion("combat_power not in", values, "combatPower");
            return (Criteria) this;
        }

        public Criteria andCombatPowerBetween(Integer value1, Integer value2) {
            addCriterion("combat_power between", value1, value2, "combatPower");
            return (Criteria) this;
        }

        public Criteria andCombatPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("combat_power not between", value1, value2, "combatPower");
            return (Criteria) this;
        }

        public Criteria andGangsIsNull() {
            addCriterion("gangs is null");
            return (Criteria) this;
        }

        public Criteria andGangsIsNotNull() {
            addCriterion("gangs is not null");
            return (Criteria) this;
        }

        public Criteria andGangsEqualTo(String value) {
            addCriterion("gangs =", value, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsNotEqualTo(String value) {
            addCriterion("gangs <>", value, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsGreaterThan(String value) {
            addCriterion("gangs >", value, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsGreaterThanOrEqualTo(String value) {
            addCriterion("gangs >=", value, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsLessThan(String value) {
            addCriterion("gangs <", value, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsLessThanOrEqualTo(String value) {
            addCriterion("gangs <=", value, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsLike(String value) {
            addCriterion("gangs like", value, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsNotLike(String value) {
            addCriterion("gangs not like", value, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsIn(List<String> values) {
            addCriterion("gangs in", values, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsNotIn(List<String> values) {
            addCriterion("gangs not in", values, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsBetween(String value1, String value2) {
            addCriterion("gangs between", value1, value2, "gangs");
            return (Criteria) this;
        }

        public Criteria andGangsNotBetween(String value1, String value2) {
            addCriterion("gangs not between", value1, value2, "gangs");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("`exp` is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("`exp` is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(Integer value) {
            addCriterion("`exp` =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(Integer value) {
            addCriterion("`exp` <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(Integer value) {
            addCriterion("`exp` >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("`exp` >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(Integer value) {
            addCriterion("`exp` <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(Integer value) {
            addCriterion("`exp` <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<Integer> values) {
            addCriterion("`exp` in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<Integer> values) {
            addCriterion("`exp` not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(Integer value1, Integer value2) {
            addCriterion("`exp` between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(Integer value1, Integer value2) {
            addCriterion("`exp` not between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureIsNull() {
            addCriterion("recharge_treasure is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureIsNotNull() {
            addCriterion("recharge_treasure is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureEqualTo(Integer value) {
            addCriterion("recharge_treasure =", value, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureNotEqualTo(Integer value) {
            addCriterion("recharge_treasure <>", value, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureGreaterThan(Integer value) {
            addCriterion("recharge_treasure >", value, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_treasure >=", value, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureLessThan(Integer value) {
            addCriterion("recharge_treasure <", value, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_treasure <=", value, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureIn(List<Integer> values) {
            addCriterion("recharge_treasure in", values, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureNotIn(List<Integer> values) {
            addCriterion("recharge_treasure not in", values, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureBetween(Integer value1, Integer value2) {
            addCriterion("recharge_treasure between", value1, value2, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeTreasureNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_treasure not between", value1, value2, "rechargeTreasure");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberIsNull() {
            addCriterion("recharge_number is null");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberIsNotNull() {
            addCriterion("recharge_number is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberEqualTo(Integer value) {
            addCriterion("recharge_number =", value, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberNotEqualTo(Integer value) {
            addCriterion("recharge_number <>", value, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberGreaterThan(Integer value) {
            addCriterion("recharge_number >", value, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_number >=", value, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberLessThan(Integer value) {
            addCriterion("recharge_number <", value, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_number <=", value, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberIn(List<Integer> values) {
            addCriterion("recharge_number in", values, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberNotIn(List<Integer> values) {
            addCriterion("recharge_number not in", values, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberBetween(Integer value1, Integer value2) {
            addCriterion("recharge_number between", value1, value2, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andRechargeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_number not between", value1, value2, "rechargeNumber");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeIsNull() {
            addCriterion("first_charge_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeIsNotNull() {
            addCriterion("first_charge_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeEqualTo(Date value) {
            addCriterion("first_charge_time =", value, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeNotEqualTo(Date value) {
            addCriterion("first_charge_time <>", value, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeGreaterThan(Date value) {
            addCriterion("first_charge_time >", value, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_charge_time >=", value, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeLessThan(Date value) {
            addCriterion("first_charge_time <", value, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_charge_time <=", value, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeIn(List<Date> values) {
            addCriterion("first_charge_time in", values, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeNotIn(List<Date> values) {
            addCriterion("first_charge_time not in", values, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeBetween(Date value1, Date value2) {
            addCriterion("first_charge_time between", value1, value2, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstChargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_charge_time not between", value1, value2, "firstChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeIsNull() {
            addCriterion("last_charge_time is null");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeIsNotNull() {
            addCriterion("last_charge_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeEqualTo(Date value) {
            addCriterion("last_charge_time =", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeNotEqualTo(Date value) {
            addCriterion("last_charge_time <>", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeGreaterThan(Date value) {
            addCriterion("last_charge_time >", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_charge_time >=", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeLessThan(Date value) {
            addCriterion("last_charge_time <", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_charge_time <=", value, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeIn(List<Date> values) {
            addCriterion("last_charge_time in", values, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeNotIn(List<Date> values) {
            addCriterion("last_charge_time not in", values, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeBetween(Date value1, Date value2) {
            addCriterion("last_charge_time between", value1, value2, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andLastChargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_charge_time not between", value1, value2, "lastChargeTime");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysIsNull() {
            addCriterion("non_recharge_days is null");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysIsNotNull() {
            addCriterion("non_recharge_days is not null");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysEqualTo(Integer value) {
            addCriterion("non_recharge_days =", value, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysNotEqualTo(Integer value) {
            addCriterion("non_recharge_days <>", value, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysGreaterThan(Integer value) {
            addCriterion("non_recharge_days >", value, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("non_recharge_days >=", value, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysLessThan(Integer value) {
            addCriterion("non_recharge_days <", value, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysLessThanOrEqualTo(Integer value) {
            addCriterion("non_recharge_days <=", value, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysIn(List<Integer> values) {
            addCriterion("non_recharge_days in", values, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysNotIn(List<Integer> values) {
            addCriterion("non_recharge_days not in", values, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysBetween(Integer value1, Integer value2) {
            addCriterion("non_recharge_days between", value1, value2, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andNonRechargeDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("non_recharge_days not between", value1, value2, "nonRechargeDays");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureIsNull() {
            addCriterion("surplus_treasure is null");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureIsNotNull() {
            addCriterion("surplus_treasure is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureEqualTo(Integer value) {
            addCriterion("surplus_treasure =", value, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureNotEqualTo(Integer value) {
            addCriterion("surplus_treasure <>", value, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureGreaterThan(Integer value) {
            addCriterion("surplus_treasure >", value, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_treasure >=", value, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureLessThan(Integer value) {
            addCriterion("surplus_treasure <", value, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_treasure <=", value, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureIn(List<Integer> values) {
            addCriterion("surplus_treasure in", values, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureNotIn(List<Integer> values) {
            addCriterion("surplus_treasure not in", values, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureBetween(Integer value1, Integer value2) {
            addCriterion("surplus_treasure between", value1, value2, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusTreasureNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_treasure not between", value1, value2, "surplusTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureIsNull() {
            addCriterion("consumes_treasure is null");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureIsNotNull() {
            addCriterion("consumes_treasure is not null");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureEqualTo(Integer value) {
            addCriterion("consumes_treasure =", value, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureNotEqualTo(Integer value) {
            addCriterion("consumes_treasure <>", value, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureGreaterThan(Integer value) {
            addCriterion("consumes_treasure >", value, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumes_treasure >=", value, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureLessThan(Integer value) {
            addCriterion("consumes_treasure <", value, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureLessThanOrEqualTo(Integer value) {
            addCriterion("consumes_treasure <=", value, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureIn(List<Integer> values) {
            addCriterion("consumes_treasure in", values, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureNotIn(List<Integer> values) {
            addCriterion("consumes_treasure not in", values, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureBetween(Integer value1, Integer value2) {
            addCriterion("consumes_treasure between", value1, value2, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesTreasureNotBetween(Integer value1, Integer value2) {
            addCriterion("consumes_treasure not between", value1, value2, "consumesTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureIsNull() {
            addCriterion("surplus_binding_treasure is null");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureIsNotNull() {
            addCriterion("surplus_binding_treasure is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureEqualTo(Integer value) {
            addCriterion("surplus_binding_treasure =", value, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureNotEqualTo(Integer value) {
            addCriterion("surplus_binding_treasure <>", value, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureGreaterThan(Integer value) {
            addCriterion("surplus_binding_treasure >", value, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_binding_treasure >=", value, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureLessThan(Integer value) {
            addCriterion("surplus_binding_treasure <", value, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_binding_treasure <=", value, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureIn(List<Integer> values) {
            addCriterion("surplus_binding_treasure in", values, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureNotIn(List<Integer> values) {
            addCriterion("surplus_binding_treasure not in", values, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureBetween(Integer value1, Integer value2) {
            addCriterion("surplus_binding_treasure between", value1, value2, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingTreasureNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_binding_treasure not between", value1, value2, "surplusBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureIsNull() {
            addCriterion("consumes_binding_treasure is null");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureIsNotNull() {
            addCriterion("consumes_binding_treasure is not null");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureEqualTo(Integer value) {
            addCriterion("consumes_binding_treasure =", value, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureNotEqualTo(Integer value) {
            addCriterion("consumes_binding_treasure <>", value, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureGreaterThan(Integer value) {
            addCriterion("consumes_binding_treasure >", value, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumes_binding_treasure >=", value, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureLessThan(Integer value) {
            addCriterion("consumes_binding_treasure <", value, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureLessThanOrEqualTo(Integer value) {
            addCriterion("consumes_binding_treasure <=", value, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureIn(List<Integer> values) {
            addCriterion("consumes_binding_treasure in", values, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureNotIn(List<Integer> values) {
            addCriterion("consumes_binding_treasure not in", values, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureBetween(Integer value1, Integer value2) {
            addCriterion("consumes_binding_treasure between", value1, value2, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingTreasureNotBetween(Integer value1, Integer value2) {
            addCriterion("consumes_binding_treasure not between", value1, value2, "consumesBindingTreasure");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyIsNull() {
            addCriterion("surplus_money is null");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyIsNotNull() {
            addCriterion("surplus_money is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyEqualTo(Integer value) {
            addCriterion("surplus_money =", value, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyNotEqualTo(Integer value) {
            addCriterion("surplus_money <>", value, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyGreaterThan(Integer value) {
            addCriterion("surplus_money >", value, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_money >=", value, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyLessThan(Integer value) {
            addCriterion("surplus_money <", value, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_money <=", value, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyIn(List<Integer> values) {
            addCriterion("surplus_money in", values, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyNotIn(List<Integer> values) {
            addCriterion("surplus_money not in", values, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyBetween(Integer value1, Integer value2) {
            addCriterion("surplus_money between", value1, value2, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_money not between", value1, value2, "surplusMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyIsNull() {
            addCriterion("consumes_money is null");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyIsNotNull() {
            addCriterion("consumes_money is not null");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyEqualTo(Integer value) {
            addCriterion("consumes_money =", value, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyNotEqualTo(Integer value) {
            addCriterion("consumes_money <>", value, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyGreaterThan(Integer value) {
            addCriterion("consumes_money >", value, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumes_money >=", value, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyLessThan(Integer value) {
            addCriterion("consumes_money <", value, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("consumes_money <=", value, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyIn(List<Integer> values) {
            addCriterion("consumes_money in", values, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyNotIn(List<Integer> values) {
            addCriterion("consumes_money not in", values, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyBetween(Integer value1, Integer value2) {
            addCriterion("consumes_money between", value1, value2, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("consumes_money not between", value1, value2, "consumesMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyIsNull() {
            addCriterion("surplus_binding_money is null");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyIsNotNull() {
            addCriterion("surplus_binding_money is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyEqualTo(Integer value) {
            addCriterion("surplus_binding_money =", value, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyNotEqualTo(Integer value) {
            addCriterion("surplus_binding_money <>", value, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyGreaterThan(Integer value) {
            addCriterion("surplus_binding_money >", value, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_binding_money >=", value, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyLessThan(Integer value) {
            addCriterion("surplus_binding_money <", value, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_binding_money <=", value, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyIn(List<Integer> values) {
            addCriterion("surplus_binding_money in", values, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyNotIn(List<Integer> values) {
            addCriterion("surplus_binding_money not in", values, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyBetween(Integer value1, Integer value2) {
            addCriterion("surplus_binding_money between", value1, value2, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andSurplusBindingMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_binding_money not between", value1, value2, "surplusBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyIsNull() {
            addCriterion("consumes_binding_money is null");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyIsNotNull() {
            addCriterion("consumes_binding_money is not null");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyEqualTo(Integer value) {
            addCriterion("consumes_binding_money =", value, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyNotEqualTo(Integer value) {
            addCriterion("consumes_binding_money <>", value, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyGreaterThan(Integer value) {
            addCriterion("consumes_binding_money >", value, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumes_binding_money >=", value, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyLessThan(Integer value) {
            addCriterion("consumes_binding_money <", value, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("consumes_binding_money <=", value, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyIn(List<Integer> values) {
            addCriterion("consumes_binding_money in", values, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyNotIn(List<Integer> values) {
            addCriterion("consumes_binding_money not in", values, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyBetween(Integer value1, Integer value2) {
            addCriterion("consumes_binding_money between", value1, value2, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andConsumesBindingMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("consumes_binding_money not between", value1, value2, "consumesBindingMoney");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentIsNull() {
            addCriterion("network_environment is null");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentIsNotNull() {
            addCriterion("network_environment is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentEqualTo(String value) {
            addCriterion("network_environment =", value, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentNotEqualTo(String value) {
            addCriterion("network_environment <>", value, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentGreaterThan(String value) {
            addCriterion("network_environment >", value, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentGreaterThanOrEqualTo(String value) {
            addCriterion("network_environment >=", value, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentLessThan(String value) {
            addCriterion("network_environment <", value, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentLessThanOrEqualTo(String value) {
            addCriterion("network_environment <=", value, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentLike(String value) {
            addCriterion("network_environment like", value, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentNotLike(String value) {
            addCriterion("network_environment not like", value, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentIn(List<String> values) {
            addCriterion("network_environment in", values, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentNotIn(List<String> values) {
            addCriterion("network_environment not in", values, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentBetween(String value1, String value2) {
            addCriterion("network_environment between", value1, value2, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andNetworkEnvironmentNotBetween(String value1, String value2) {
            addCriterion("network_environment not between", value1, value2, "networkEnvironment");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIsNull() {
            addCriterion("system_version is null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIsNotNull() {
            addCriterion("system_version is not null");
            return (Criteria) this;
        }

        public Criteria andSystemVersionEqualTo(String value) {
            addCriterion("system_version =", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotEqualTo(String value) {
            addCriterion("system_version <>", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionGreaterThan(String value) {
            addCriterion("system_version >", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionGreaterThanOrEqualTo(String value) {
            addCriterion("system_version >=", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLessThan(String value) {
            addCriterion("system_version <", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLessThanOrEqualTo(String value) {
            addCriterion("system_version <=", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionLike(String value) {
            addCriterion("system_version like", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotLike(String value) {
            addCriterion("system_version not like", value, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionIn(List<String> values) {
            addCriterion("system_version in", values, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotIn(List<String> values) {
            addCriterion("system_version not in", values, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionBetween(String value1, String value2) {
            addCriterion("system_version between", value1, value2, "systemVersion");
            return (Criteria) this;
        }

        public Criteria andSystemVersionNotBetween(String value1, String value2) {
            addCriterion("system_version not between", value1, value2, "systemVersion");
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