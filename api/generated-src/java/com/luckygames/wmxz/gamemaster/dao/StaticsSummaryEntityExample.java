package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaticsSummaryEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaticsSummaryEntityExample() {
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

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(String value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(String value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(String value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(String value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(String value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(String value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLike(String value) {
            addCriterion("report_date like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotLike(String value) {
            addCriterion("report_date not like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<String> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<String> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(String value1, String value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(String value1, String value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andPlayerCountIsNull() {
            addCriterion("player_count is null");
            return (Criteria) this;
        }

        public Criteria andPlayerCountIsNotNull() {
            addCriterion("player_count is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerCountEqualTo(Integer value) {
            addCriterion("player_count =", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountNotEqualTo(Integer value) {
            addCriterion("player_count <>", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountGreaterThan(Integer value) {
            addCriterion("player_count >", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("player_count >=", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountLessThan(Integer value) {
            addCriterion("player_count <", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountLessThanOrEqualTo(Integer value) {
            addCriterion("player_count <=", value, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountIn(List<Integer> values) {
            addCriterion("player_count in", values, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountNotIn(List<Integer> values) {
            addCriterion("player_count not in", values, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountBetween(Integer value1, Integer value2) {
            addCriterion("player_count between", value1, value2, "playerCount");
            return (Criteria) this;
        }

        public Criteria andPlayerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("player_count not between", value1, value2, "playerCount");
            return (Criteria) this;
        }

        public Criteria andCharCountIsNull() {
            addCriterion("char_count is null");
            return (Criteria) this;
        }

        public Criteria andCharCountIsNotNull() {
            addCriterion("char_count is not null");
            return (Criteria) this;
        }

        public Criteria andCharCountEqualTo(Integer value) {
            addCriterion("char_count =", value, "charCount");
            return (Criteria) this;
        }

        public Criteria andCharCountNotEqualTo(Integer value) {
            addCriterion("char_count <>", value, "charCount");
            return (Criteria) this;
        }

        public Criteria andCharCountGreaterThan(Integer value) {
            addCriterion("char_count >", value, "charCount");
            return (Criteria) this;
        }

        public Criteria andCharCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("char_count >=", value, "charCount");
            return (Criteria) this;
        }

        public Criteria andCharCountLessThan(Integer value) {
            addCriterion("char_count <", value, "charCount");
            return (Criteria) this;
        }

        public Criteria andCharCountLessThanOrEqualTo(Integer value) {
            addCriterion("char_count <=", value, "charCount");
            return (Criteria) this;
        }

        public Criteria andCharCountIn(List<Integer> values) {
            addCriterion("char_count in", values, "charCount");
            return (Criteria) this;
        }

        public Criteria andCharCountNotIn(List<Integer> values) {
            addCriterion("char_count not in", values, "charCount");
            return (Criteria) this;
        }

        public Criteria andCharCountBetween(Integer value1, Integer value2) {
            addCriterion("char_count between", value1, value2, "charCount");
            return (Criteria) this;
        }

        public Criteria andCharCountNotBetween(Integer value1, Integer value2) {
            addCriterion("char_count not between", value1, value2, "charCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("login_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("login_count =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("login_count <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("login_count >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_count >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("login_count <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("login_count <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("login_count in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("login_count not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("login_count between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_count not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountIsNull() {
            addCriterion("online_count is null");
            return (Criteria) this;
        }

        public Criteria andOnlineCountIsNotNull() {
            addCriterion("online_count is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineCountEqualTo(Integer value) {
            addCriterion("online_count =", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountNotEqualTo(Integer value) {
            addCriterion("online_count <>", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountGreaterThan(Integer value) {
            addCriterion("online_count >", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_count >=", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountLessThan(Integer value) {
            addCriterion("online_count <", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountLessThanOrEqualTo(Integer value) {
            addCriterion("online_count <=", value, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountIn(List<Integer> values) {
            addCriterion("online_count in", values, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountNotIn(List<Integer> values) {
            addCriterion("online_count not in", values, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountBetween(Integer value1, Integer value2) {
            addCriterion("online_count between", value1, value2, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("online_count not between", value1, value2, "onlineCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountIsNull() {
            addCriterion("active_char_count is null");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountIsNotNull() {
            addCriterion("active_char_count is not null");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountEqualTo(Integer value) {
            addCriterion("active_char_count =", value, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountNotEqualTo(Integer value) {
            addCriterion("active_char_count <>", value, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountGreaterThan(Integer value) {
            addCriterion("active_char_count >", value, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_char_count >=", value, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountLessThan(Integer value) {
            addCriterion("active_char_count <", value, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountLessThanOrEqualTo(Integer value) {
            addCriterion("active_char_count <=", value, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountIn(List<Integer> values) {
            addCriterion("active_char_count in", values, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountNotIn(List<Integer> values) {
            addCriterion("active_char_count not in", values, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountBetween(Integer value1, Integer value2) {
            addCriterion("active_char_count between", value1, value2, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andActiveCharCountNotBetween(Integer value1, Integer value2) {
            addCriterion("active_char_count not between", value1, value2, "activeCharCount");
            return (Criteria) this;
        }

        public Criteria andRechargeSumIsNull() {
            addCriterion("recharge_sum is null");
            return (Criteria) this;
        }

        public Criteria andRechargeSumIsNotNull() {
            addCriterion("recharge_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeSumEqualTo(BigDecimal value) {
            addCriterion("recharge_sum =", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumNotEqualTo(BigDecimal value) {
            addCriterion("recharge_sum <>", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumGreaterThan(BigDecimal value) {
            addCriterion("recharge_sum >", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_sum >=", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumLessThan(BigDecimal value) {
            addCriterion("recharge_sum <", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_sum <=", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumIn(List<BigDecimal> values) {
            addCriterion("recharge_sum in", values, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumNotIn(List<BigDecimal> values) {
            addCriterion("recharge_sum not in", values, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_sum between", value1, value2, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_sum not between", value1, value2, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeCountIsNull() {
            addCriterion("recharge_count is null");
            return (Criteria) this;
        }

        public Criteria andRechargeCountIsNotNull() {
            addCriterion("recharge_count is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeCountEqualTo(Integer value) {
            addCriterion("recharge_count =", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountNotEqualTo(Integer value) {
            addCriterion("recharge_count <>", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountGreaterThan(Integer value) {
            addCriterion("recharge_count >", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_count >=", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountLessThan(Integer value) {
            addCriterion("recharge_count <", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_count <=", value, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountIn(List<Integer> values) {
            addCriterion("recharge_count in", values, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountNotIn(List<Integer> values) {
            addCriterion("recharge_count not in", values, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountBetween(Integer value1, Integer value2) {
            addCriterion("recharge_count between", value1, value2, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andRechargeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_count not between", value1, value2, "rechargeCount");
            return (Criteria) this;
        }

        public Criteria andArpuIsNull() {
            addCriterion("arpu is null");
            return (Criteria) this;
        }

        public Criteria andArpuIsNotNull() {
            addCriterion("arpu is not null");
            return (Criteria) this;
        }

        public Criteria andArpuEqualTo(BigDecimal value) {
            addCriterion("arpu =", value, "arpu");
            return (Criteria) this;
        }

        public Criteria andArpuNotEqualTo(BigDecimal value) {
            addCriterion("arpu <>", value, "arpu");
            return (Criteria) this;
        }

        public Criteria andArpuGreaterThan(BigDecimal value) {
            addCriterion("arpu >", value, "arpu");
            return (Criteria) this;
        }

        public Criteria andArpuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("arpu >=", value, "arpu");
            return (Criteria) this;
        }

        public Criteria andArpuLessThan(BigDecimal value) {
            addCriterion("arpu <", value, "arpu");
            return (Criteria) this;
        }

        public Criteria andArpuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("arpu <=", value, "arpu");
            return (Criteria) this;
        }

        public Criteria andArpuIn(List<BigDecimal> values) {
            addCriterion("arpu in", values, "arpu");
            return (Criteria) this;
        }

        public Criteria andArpuNotIn(List<BigDecimal> values) {
            addCriterion("arpu not in", values, "arpu");
            return (Criteria) this;
        }

        public Criteria andArpuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arpu between", value1, value2, "arpu");
            return (Criteria) this;
        }

        public Criteria andArpuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("arpu not between", value1, value2, "arpu");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountIsNull() {
            addCriterion("new_recharge_count is null");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountIsNotNull() {
            addCriterion("new_recharge_count is not null");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountEqualTo(Integer value) {
            addCriterion("new_recharge_count =", value, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountNotEqualTo(Integer value) {
            addCriterion("new_recharge_count <>", value, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountGreaterThan(Integer value) {
            addCriterion("new_recharge_count >", value, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_recharge_count >=", value, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountLessThan(Integer value) {
            addCriterion("new_recharge_count <", value, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountLessThanOrEqualTo(Integer value) {
            addCriterion("new_recharge_count <=", value, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountIn(List<Integer> values) {
            addCriterion("new_recharge_count in", values, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountNotIn(List<Integer> values) {
            addCriterion("new_recharge_count not in", values, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountBetween(Integer value1, Integer value2) {
            addCriterion("new_recharge_count between", value1, value2, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("new_recharge_count not between", value1, value2, "newRechargeCount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateIsNull() {
            addCriterion("new_recharge_rate is null");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateIsNotNull() {
            addCriterion("new_recharge_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateEqualTo(BigDecimal value) {
            addCriterion("new_recharge_rate =", value, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateNotEqualTo(BigDecimal value) {
            addCriterion("new_recharge_rate <>", value, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateGreaterThan(BigDecimal value) {
            addCriterion("new_recharge_rate >", value, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_recharge_rate >=", value, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateLessThan(BigDecimal value) {
            addCriterion("new_recharge_rate <", value, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_recharge_rate <=", value, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateIn(List<BigDecimal> values) {
            addCriterion("new_recharge_rate in", values, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateNotIn(List<BigDecimal> values) {
            addCriterion("new_recharge_rate not in", values, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_recharge_rate between", value1, value2, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_recharge_rate not between", value1, value2, "newRechargeRate");
            return (Criteria) this;
        }

        public Criteria andStay2dIsNull() {
            addCriterion("stay2d is null");
            return (Criteria) this;
        }

        public Criteria andStay2dIsNotNull() {
            addCriterion("stay2d is not null");
            return (Criteria) this;
        }

        public Criteria andStay2dEqualTo(BigDecimal value) {
            addCriterion("stay2d =", value, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay2dNotEqualTo(BigDecimal value) {
            addCriterion("stay2d <>", value, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay2dGreaterThan(BigDecimal value) {
            addCriterion("stay2d >", value, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay2dGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stay2d >=", value, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay2dLessThan(BigDecimal value) {
            addCriterion("stay2d <", value, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay2dLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stay2d <=", value, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay2dIn(List<BigDecimal> values) {
            addCriterion("stay2d in", values, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay2dNotIn(List<BigDecimal> values) {
            addCriterion("stay2d not in", values, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay2dBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stay2d between", value1, value2, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay2dNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stay2d not between", value1, value2, "stay2d");
            return (Criteria) this;
        }

        public Criteria andStay3dIsNull() {
            addCriterion("stay3d is null");
            return (Criteria) this;
        }

        public Criteria andStay3dIsNotNull() {
            addCriterion("stay3d is not null");
            return (Criteria) this;
        }

        public Criteria andStay3dEqualTo(BigDecimal value) {
            addCriterion("stay3d =", value, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay3dNotEqualTo(BigDecimal value) {
            addCriterion("stay3d <>", value, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay3dGreaterThan(BigDecimal value) {
            addCriterion("stay3d >", value, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay3dGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stay3d >=", value, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay3dLessThan(BigDecimal value) {
            addCriterion("stay3d <", value, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay3dLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stay3d <=", value, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay3dIn(List<BigDecimal> values) {
            addCriterion("stay3d in", values, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay3dNotIn(List<BigDecimal> values) {
            addCriterion("stay3d not in", values, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay3dBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stay3d between", value1, value2, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay3dNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stay3d not between", value1, value2, "stay3d");
            return (Criteria) this;
        }

        public Criteria andStay7dIsNull() {
            addCriterion("stay7d is null");
            return (Criteria) this;
        }

        public Criteria andStay7dIsNotNull() {
            addCriterion("stay7d is not null");
            return (Criteria) this;
        }

        public Criteria andStay7dEqualTo(BigDecimal value) {
            addCriterion("stay7d =", value, "stay7d");
            return (Criteria) this;
        }

        public Criteria andStay7dNotEqualTo(BigDecimal value) {
            addCriterion("stay7d <>", value, "stay7d");
            return (Criteria) this;
        }

        public Criteria andStay7dGreaterThan(BigDecimal value) {
            addCriterion("stay7d >", value, "stay7d");
            return (Criteria) this;
        }

        public Criteria andStay7dGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stay7d >=", value, "stay7d");
            return (Criteria) this;
        }

        public Criteria andStay7dLessThan(BigDecimal value) {
            addCriterion("stay7d <", value, "stay7d");
            return (Criteria) this;
        }

        public Criteria andStay7dLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stay7d <=", value, "stay7d");
            return (Criteria) this;
        }

        public Criteria andStay7dIn(List<BigDecimal> values) {
            addCriterion("stay7d in", values, "stay7d");
            return (Criteria) this;
        }

        public Criteria andStay7dNotIn(List<BigDecimal> values) {
            addCriterion("stay7d not in", values, "stay7d");
            return (Criteria) this;
        }

        public Criteria andStay7dBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stay7d between", value1, value2, "stay7d");
            return (Criteria) this;
        }

        public Criteria andStay7dNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stay7d not between", value1, value2, "stay7d");
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