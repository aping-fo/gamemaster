package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivationCodeEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivationCodeEntityExample() {
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

        public Criteria andInvalidTimeIsNull() {
            addCriterion("invalid_time is null");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIsNotNull() {
            addCriterion("invalid_time is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeEqualTo(String value) {
            addCriterion("invalid_time =", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotEqualTo(String value) {
            addCriterion("invalid_time <>", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeGreaterThan(String value) {
            addCriterion("invalid_time >", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeGreaterThanOrEqualTo(String value) {
            addCriterion("invalid_time >=", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeLessThan(String value) {
            addCriterion("invalid_time <", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeLessThanOrEqualTo(String value) {
            addCriterion("invalid_time <=", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeLike(String value) {
            addCriterion("invalid_time like", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotLike(String value) {
            addCriterion("invalid_time not like", value, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeIn(List<String> values) {
            addCriterion("invalid_time in", values, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotIn(List<String> values) {
            addCriterion("invalid_time not in", values, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeBetween(String value1, String value2) {
            addCriterion("invalid_time between", value1, value2, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andInvalidTimeNotBetween(String value1, String value2) {
            addCriterion("invalid_time not between", value1, value2, "invalidTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeIsNull() {
            addCriterion("overdue_time is null");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeIsNotNull() {
            addCriterion("overdue_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeEqualTo(String value) {
            addCriterion("overdue_time =", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeNotEqualTo(String value) {
            addCriterion("overdue_time <>", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeGreaterThan(String value) {
            addCriterion("overdue_time >", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_time >=", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeLessThan(String value) {
            addCriterion("overdue_time <", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeLessThanOrEqualTo(String value) {
            addCriterion("overdue_time <=", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeLike(String value) {
            addCriterion("overdue_time like", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeNotLike(String value) {
            addCriterion("overdue_time not like", value, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeIn(List<String> values) {
            addCriterion("overdue_time in", values, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeNotIn(List<String> values) {
            addCriterion("overdue_time not in", values, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeBetween(String value1, String value2) {
            addCriterion("overdue_time between", value1, value2, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andOverdueTimeNotBetween(String value1, String value2) {
            addCriterion("overdue_time not between", value1, value2, "overdueTime");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(Integer value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(Integer value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(Integer value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(Integer value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(Integer value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(Integer value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<Integer> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<Integer> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(Integer value1, Integer value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(Integer value1, Integer value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andUniversalIsNull() {
            addCriterion("universal is null");
            return (Criteria) this;
        }

        public Criteria andUniversalIsNotNull() {
            addCriterion("universal is not null");
            return (Criteria) this;
        }

        public Criteria andUniversalEqualTo(Integer value) {
            addCriterion("universal =", value, "universal");
            return (Criteria) this;
        }

        public Criteria andUniversalNotEqualTo(Integer value) {
            addCriterion("universal <>", value, "universal");
            return (Criteria) this;
        }

        public Criteria andUniversalGreaterThan(Integer value) {
            addCriterion("universal >", value, "universal");
            return (Criteria) this;
        }

        public Criteria andUniversalGreaterThanOrEqualTo(Integer value) {
            addCriterion("universal >=", value, "universal");
            return (Criteria) this;
        }

        public Criteria andUniversalLessThan(Integer value) {
            addCriterion("universal <", value, "universal");
            return (Criteria) this;
        }

        public Criteria andUniversalLessThanOrEqualTo(Integer value) {
            addCriterion("universal <=", value, "universal");
            return (Criteria) this;
        }

        public Criteria andUniversalIn(List<Integer> values) {
            addCriterion("universal in", values, "universal");
            return (Criteria) this;
        }

        public Criteria andUniversalNotIn(List<Integer> values) {
            addCriterion("universal not in", values, "universal");
            return (Criteria) this;
        }

        public Criteria andUniversalBetween(Integer value1, Integer value2) {
            addCriterion("universal between", value1, value2, "universal");
            return (Criteria) this;
        }

        public Criteria andUniversalNotBetween(Integer value1, Integer value2) {
            addCriterion("universal not between", value1, value2, "universal");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNull() {
            addCriterion("use_time is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("use_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeEqualTo(String value) {
            addCriterion("use_time =", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotEqualTo(String value) {
            addCriterion("use_time <>", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThan(String value) {
            addCriterion("use_time >", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("use_time >=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThan(String value) {
            addCriterion("use_time <", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(String value) {
            addCriterion("use_time <=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLike(String value) {
            addCriterion("use_time like", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotLike(String value) {
            addCriterion("use_time not like", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIn(List<String> values) {
            addCriterion("use_time in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotIn(List<String> values) {
            addCriterion("use_time not in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeBetween(String value1, String value2) {
            addCriterion("use_time between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotBetween(String value1, String value2) {
            addCriterion("use_time not between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdIsNull() {
            addCriterion("use_player_id is null");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdIsNotNull() {
            addCriterion("use_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdEqualTo(Integer value) {
            addCriterion("use_player_id =", value, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdNotEqualTo(Integer value) {
            addCriterion("use_player_id <>", value, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdGreaterThan(Integer value) {
            addCriterion("use_player_id >", value, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_player_id >=", value, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdLessThan(Integer value) {
            addCriterion("use_player_id <", value, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("use_player_id <=", value, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdIn(List<Integer> values) {
            addCriterion("use_player_id in", values, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdNotIn(List<Integer> values) {
            addCriterion("use_player_id not in", values, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("use_player_id between", value1, value2, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("use_player_id not between", value1, value2, "usePlayerId");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameIsNull() {
            addCriterion("use_player_name is null");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameIsNotNull() {
            addCriterion("use_player_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameEqualTo(String value) {
            addCriterion("use_player_name =", value, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameNotEqualTo(String value) {
            addCriterion("use_player_name <>", value, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameGreaterThan(String value) {
            addCriterion("use_player_name >", value, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("use_player_name >=", value, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameLessThan(String value) {
            addCriterion("use_player_name <", value, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameLessThanOrEqualTo(String value) {
            addCriterion("use_player_name <=", value, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameLike(String value) {
            addCriterion("use_player_name like", value, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameNotLike(String value) {
            addCriterion("use_player_name not like", value, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameIn(List<String> values) {
            addCriterion("use_player_name in", values, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameNotIn(List<String> values) {
            addCriterion("use_player_name not in", values, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameBetween(String value1, String value2) {
            addCriterion("use_player_name between", value1, value2, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerNameNotBetween(String value1, String value2) {
            addCriterion("use_player_name not between", value1, value2, "usePlayerName");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountIsNull() {
            addCriterion("use_player_account is null");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountIsNotNull() {
            addCriterion("use_player_account is not null");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountEqualTo(String value) {
            addCriterion("use_player_account =", value, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountNotEqualTo(String value) {
            addCriterion("use_player_account <>", value, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountGreaterThan(String value) {
            addCriterion("use_player_account >", value, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("use_player_account >=", value, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountLessThan(String value) {
            addCriterion("use_player_account <", value, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountLessThanOrEqualTo(String value) {
            addCriterion("use_player_account <=", value, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountLike(String value) {
            addCriterion("use_player_account like", value, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountNotLike(String value) {
            addCriterion("use_player_account not like", value, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountIn(List<String> values) {
            addCriterion("use_player_account in", values, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountNotIn(List<String> values) {
            addCriterion("use_player_account not in", values, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountBetween(String value1, String value2) {
            addCriterion("use_player_account between", value1, value2, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUsePlayerAccountNotBetween(String value1, String value2) {
            addCriterion("use_player_account not between", value1, value2, "usePlayerAccount");
            return (Criteria) this;
        }

        public Criteria andUseServerIdIsNull() {
            addCriterion("use_server_id is null");
            return (Criteria) this;
        }

        public Criteria andUseServerIdIsNotNull() {
            addCriterion("use_server_id is not null");
            return (Criteria) this;
        }

        public Criteria andUseServerIdEqualTo(String value) {
            addCriterion("use_server_id =", value, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdNotEqualTo(String value) {
            addCriterion("use_server_id <>", value, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdGreaterThan(String value) {
            addCriterion("use_server_id >", value, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdGreaterThanOrEqualTo(String value) {
            addCriterion("use_server_id >=", value, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdLessThan(String value) {
            addCriterion("use_server_id <", value, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdLessThanOrEqualTo(String value) {
            addCriterion("use_server_id <=", value, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdLike(String value) {
            addCriterion("use_server_id like", value, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdNotLike(String value) {
            addCriterion("use_server_id not like", value, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdIn(List<String> values) {
            addCriterion("use_server_id in", values, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdNotIn(List<String> values) {
            addCriterion("use_server_id not in", values, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdBetween(String value1, String value2) {
            addCriterion("use_server_id between", value1, value2, "useServerId");
            return (Criteria) this;
        }

        public Criteria andUseServerIdNotBetween(String value1, String value2) {
            addCriterion("use_server_id not between", value1, value2, "useServerId");
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

        public Criteria andRewardsIsNull() {
            addCriterion("rewards is null");
            return (Criteria) this;
        }

        public Criteria andRewardsIsNotNull() {
            addCriterion("rewards is not null");
            return (Criteria) this;
        }

        public Criteria andRewardsEqualTo(String value) {
            addCriterion("rewards =", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsNotEqualTo(String value) {
            addCriterion("rewards <>", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsGreaterThan(String value) {
            addCriterion("rewards >", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsGreaterThanOrEqualTo(String value) {
            addCriterion("rewards >=", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsLessThan(String value) {
            addCriterion("rewards <", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsLessThanOrEqualTo(String value) {
            addCriterion("rewards <=", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsLike(String value) {
            addCriterion("rewards like", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsNotLike(String value) {
            addCriterion("rewards not like", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsIn(List<String> values) {
            addCriterion("rewards in", values, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsNotIn(List<String> values) {
            addCriterion("rewards not in", values, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsBetween(String value1, String value2) {
            addCriterion("rewards between", value1, value2, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsNotBetween(String value1, String value2) {
            addCriterion("rewards not between", value1, value2, "rewards");
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