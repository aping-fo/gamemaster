package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RechargeDailyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RechargeDailyExample() {
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

        public Criteria andRechargeSumIsNull() {
            addCriterion("recharge_sum is null");
            return (Criteria) this;
        }

        public Criteria andRechargeSumIsNotNull() {
            addCriterion("recharge_sum is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeSumEqualTo(Integer value) {
            addCriterion("recharge_sum =", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumNotEqualTo(Integer value) {
            addCriterion("recharge_sum <>", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumGreaterThan(Integer value) {
            addCriterion("recharge_sum >", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_sum >=", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumLessThan(Integer value) {
            addCriterion("recharge_sum <", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_sum <=", value, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumIn(List<Integer> values) {
            addCriterion("recharge_sum in", values, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumNotIn(List<Integer> values) {
            addCriterion("recharge_sum not in", values, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumBetween(Integer value1, Integer value2) {
            addCriterion("recharge_sum between", value1, value2, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeSumNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_sum not between", value1, value2, "rechargeSum");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNull() {
            addCriterion("recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIsNotNull() {
            addCriterion("recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountEqualTo(BigDecimal value) {
            addCriterion("recharge_amount =", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotEqualTo(BigDecimal value) {
            addCriterion("recharge_amount <>", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThan(BigDecimal value) {
            addCriterion("recharge_amount >", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_amount >=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThan(BigDecimal value) {
            addCriterion("recharge_amount <", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_amount <=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIn(List<BigDecimal> values) {
            addCriterion("recharge_amount in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotIn(List<BigDecimal> values) {
            addCriterion("recharge_amount not in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_amount between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_amount not between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andAppendSumIsNull() {
            addCriterion("append_sum is null");
            return (Criteria) this;
        }

        public Criteria andAppendSumIsNotNull() {
            addCriterion("append_sum is not null");
            return (Criteria) this;
        }

        public Criteria andAppendSumEqualTo(Integer value) {
            addCriterion("append_sum =", value, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendSumNotEqualTo(Integer value) {
            addCriterion("append_sum <>", value, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendSumGreaterThan(Integer value) {
            addCriterion("append_sum >", value, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("append_sum >=", value, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendSumLessThan(Integer value) {
            addCriterion("append_sum <", value, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendSumLessThanOrEqualTo(Integer value) {
            addCriterion("append_sum <=", value, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendSumIn(List<Integer> values) {
            addCriterion("append_sum in", values, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendSumNotIn(List<Integer> values) {
            addCriterion("append_sum not in", values, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendSumBetween(Integer value1, Integer value2) {
            addCriterion("append_sum between", value1, value2, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendSumNotBetween(Integer value1, Integer value2) {
            addCriterion("append_sum not between", value1, value2, "appendSum");
            return (Criteria) this;
        }

        public Criteria andAppendAmountIsNull() {
            addCriterion("append_amount is null");
            return (Criteria) this;
        }

        public Criteria andAppendAmountIsNotNull() {
            addCriterion("append_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAppendAmountEqualTo(BigDecimal value) {
            addCriterion("append_amount =", value, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andAppendAmountNotEqualTo(BigDecimal value) {
            addCriterion("append_amount <>", value, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andAppendAmountGreaterThan(BigDecimal value) {
            addCriterion("append_amount >", value, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andAppendAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("append_amount >=", value, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andAppendAmountLessThan(BigDecimal value) {
            addCriterion("append_amount <", value, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andAppendAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("append_amount <=", value, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andAppendAmountIn(List<BigDecimal> values) {
            addCriterion("append_amount in", values, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andAppendAmountNotIn(List<BigDecimal> values) {
            addCriterion("append_amount not in", values, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andAppendAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("append_amount between", value1, value2, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andAppendAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("append_amount not between", value1, value2, "appendAmount");
            return (Criteria) this;
        }

        public Criteria andGoldSumIsNull() {
            addCriterion("gold_sum is null");
            return (Criteria) this;
        }

        public Criteria andGoldSumIsNotNull() {
            addCriterion("gold_sum is not null");
            return (Criteria) this;
        }

        public Criteria andGoldSumEqualTo(Integer value) {
            addCriterion("gold_sum =", value, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldSumNotEqualTo(Integer value) {
            addCriterion("gold_sum <>", value, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldSumGreaterThan(Integer value) {
            addCriterion("gold_sum >", value, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("gold_sum >=", value, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldSumLessThan(Integer value) {
            addCriterion("gold_sum <", value, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldSumLessThanOrEqualTo(Integer value) {
            addCriterion("gold_sum <=", value, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldSumIn(List<Integer> values) {
            addCriterion("gold_sum in", values, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldSumNotIn(List<Integer> values) {
            addCriterion("gold_sum not in", values, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldSumBetween(Integer value1, Integer value2) {
            addCriterion("gold_sum between", value1, value2, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldSumNotBetween(Integer value1, Integer value2) {
            addCriterion("gold_sum not between", value1, value2, "goldSum");
            return (Criteria) this;
        }

        public Criteria andGoldAppendIsNull() {
            addCriterion("gold_append is null");
            return (Criteria) this;
        }

        public Criteria andGoldAppendIsNotNull() {
            addCriterion("gold_append is not null");
            return (Criteria) this;
        }

        public Criteria andGoldAppendEqualTo(Integer value) {
            addCriterion("gold_append =", value, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andGoldAppendNotEqualTo(Integer value) {
            addCriterion("gold_append <>", value, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andGoldAppendGreaterThan(Integer value) {
            addCriterion("gold_append >", value, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andGoldAppendGreaterThanOrEqualTo(Integer value) {
            addCriterion("gold_append >=", value, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andGoldAppendLessThan(Integer value) {
            addCriterion("gold_append <", value, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andGoldAppendLessThanOrEqualTo(Integer value) {
            addCriterion("gold_append <=", value, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andGoldAppendIn(List<Integer> values) {
            addCriterion("gold_append in", values, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andGoldAppendNotIn(List<Integer> values) {
            addCriterion("gold_append not in", values, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andGoldAppendBetween(Integer value1, Integer value2) {
            addCriterion("gold_append between", value1, value2, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andGoldAppendNotBetween(Integer value1, Integer value2) {
            addCriterion("gold_append not between", value1, value2, "goldAppend");
            return (Criteria) this;
        }

        public Criteria andApruSumIsNull() {
            addCriterion("apru_sum is null");
            return (Criteria) this;
        }

        public Criteria andApruSumIsNotNull() {
            addCriterion("apru_sum is not null");
            return (Criteria) this;
        }

        public Criteria andApruSumEqualTo(BigDecimal value) {
            addCriterion("apru_sum =", value, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruSumNotEqualTo(BigDecimal value) {
            addCriterion("apru_sum <>", value, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruSumGreaterThan(BigDecimal value) {
            addCriterion("apru_sum >", value, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apru_sum >=", value, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruSumLessThan(BigDecimal value) {
            addCriterion("apru_sum <", value, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apru_sum <=", value, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruSumIn(List<BigDecimal> values) {
            addCriterion("apru_sum in", values, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruSumNotIn(List<BigDecimal> values) {
            addCriterion("apru_sum not in", values, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apru_sum between", value1, value2, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apru_sum not between", value1, value2, "apruSum");
            return (Criteria) this;
        }

        public Criteria andApruAppendIsNull() {
            addCriterion("apru_append is null");
            return (Criteria) this;
        }

        public Criteria andApruAppendIsNotNull() {
            addCriterion("apru_append is not null");
            return (Criteria) this;
        }

        public Criteria andApruAppendEqualTo(BigDecimal value) {
            addCriterion("apru_append =", value, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andApruAppendNotEqualTo(BigDecimal value) {
            addCriterion("apru_append <>", value, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andApruAppendGreaterThan(BigDecimal value) {
            addCriterion("apru_append >", value, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andApruAppendGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apru_append >=", value, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andApruAppendLessThan(BigDecimal value) {
            addCriterion("apru_append <", value, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andApruAppendLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apru_append <=", value, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andApruAppendIn(List<BigDecimal> values) {
            addCriterion("apru_append in", values, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andApruAppendNotIn(List<BigDecimal> values) {
            addCriterion("apru_append not in", values, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andApruAppendBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apru_append between", value1, value2, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andApruAppendNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apru_append not between", value1, value2, "apruAppend");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Status value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Status value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Status value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Status value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Status value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Status value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Status> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Status> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Status value1, Status value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Status value1, Status value2) {
            addCriterion("status not between", value1, value2, "status");
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