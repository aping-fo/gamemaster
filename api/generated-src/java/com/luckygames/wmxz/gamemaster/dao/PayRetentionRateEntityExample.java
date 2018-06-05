package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayRetentionRateEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayRetentionRateEntityExample() {
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

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(Date value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(Date value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(Date value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(Date value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(Date value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(Date value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<Date> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<Date> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(Date value1, Date value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(Date value1, Date value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNull() {
            addCriterion("user_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCountIsNotNull() {
            addCriterion("user_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountEqualTo(Integer value) {
            addCriterion("user_count =", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotEqualTo(Integer value) {
            addCriterion("user_count <>", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThan(Integer value) {
            addCriterion("user_count >", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_count >=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThan(Integer value) {
            addCriterion("user_count <", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_count <=", value, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountIn(List<Integer> values) {
            addCriterion("user_count in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotIn(List<Integer> values) {
            addCriterion("user_count not in", values, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountBetween(Integer value1, Integer value2) {
            addCriterion("user_count between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_count not between", value1, value2, "userCount");
            return (Criteria) this;
        }

        public Criteria andOneDayIsNull() {
            addCriterion("one_day is null");
            return (Criteria) this;
        }

        public Criteria andOneDayIsNotNull() {
            addCriterion("one_day is not null");
            return (Criteria) this;
        }

        public Criteria andOneDayEqualTo(BigDecimal value) {
            addCriterion("one_day =", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayNotEqualTo(BigDecimal value) {
            addCriterion("one_day <>", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayGreaterThan(BigDecimal value) {
            addCriterion("one_day >", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("one_day >=", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayLessThan(BigDecimal value) {
            addCriterion("one_day <", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("one_day <=", value, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayIn(List<BigDecimal> values) {
            addCriterion("one_day in", values, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayNotIn(List<BigDecimal> values) {
            addCriterion("one_day not in", values, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_day between", value1, value2, "oneDay");
            return (Criteria) this;
        }

        public Criteria andOneDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_day not between", value1, value2, "oneDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayIsNull() {
            addCriterion("two_day is null");
            return (Criteria) this;
        }

        public Criteria andTwoDayIsNotNull() {
            addCriterion("two_day is not null");
            return (Criteria) this;
        }

        public Criteria andTwoDayEqualTo(BigDecimal value) {
            addCriterion("two_day =", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayNotEqualTo(BigDecimal value) {
            addCriterion("two_day <>", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayGreaterThan(BigDecimal value) {
            addCriterion("two_day >", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("two_day >=", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayLessThan(BigDecimal value) {
            addCriterion("two_day <", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("two_day <=", value, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayIn(List<BigDecimal> values) {
            addCriterion("two_day in", values, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayNotIn(List<BigDecimal> values) {
            addCriterion("two_day not in", values, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("two_day between", value1, value2, "twoDay");
            return (Criteria) this;
        }

        public Criteria andTwoDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("two_day not between", value1, value2, "twoDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayIsNull() {
            addCriterion("three_day is null");
            return (Criteria) this;
        }

        public Criteria andThreeDayIsNotNull() {
            addCriterion("three_day is not null");
            return (Criteria) this;
        }

        public Criteria andThreeDayEqualTo(BigDecimal value) {
            addCriterion("three_day =", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayNotEqualTo(BigDecimal value) {
            addCriterion("three_day <>", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayGreaterThan(BigDecimal value) {
            addCriterion("three_day >", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("three_day >=", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayLessThan(BigDecimal value) {
            addCriterion("three_day <", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("three_day <=", value, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayIn(List<BigDecimal> values) {
            addCriterion("three_day in", values, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayNotIn(List<BigDecimal> values) {
            addCriterion("three_day not in", values, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("three_day between", value1, value2, "threeDay");
            return (Criteria) this;
        }

        public Criteria andThreeDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("three_day not between", value1, value2, "threeDay");
            return (Criteria) this;
        }

        public Criteria andFourDayIsNull() {
            addCriterion("four_day is null");
            return (Criteria) this;
        }

        public Criteria andFourDayIsNotNull() {
            addCriterion("four_day is not null");
            return (Criteria) this;
        }

        public Criteria andFourDayEqualTo(BigDecimal value) {
            addCriterion("four_day =", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayNotEqualTo(BigDecimal value) {
            addCriterion("four_day <>", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayGreaterThan(BigDecimal value) {
            addCriterion("four_day >", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("four_day >=", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayLessThan(BigDecimal value) {
            addCriterion("four_day <", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("four_day <=", value, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayIn(List<BigDecimal> values) {
            addCriterion("four_day in", values, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayNotIn(List<BigDecimal> values) {
            addCriterion("four_day not in", values, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("four_day between", value1, value2, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFourDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("four_day not between", value1, value2, "fourDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayIsNull() {
            addCriterion("five_day is null");
            return (Criteria) this;
        }

        public Criteria andFiveDayIsNotNull() {
            addCriterion("five_day is not null");
            return (Criteria) this;
        }

        public Criteria andFiveDayEqualTo(BigDecimal value) {
            addCriterion("five_day =", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayNotEqualTo(BigDecimal value) {
            addCriterion("five_day <>", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayGreaterThan(BigDecimal value) {
            addCriterion("five_day >", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("five_day >=", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayLessThan(BigDecimal value) {
            addCriterion("five_day <", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("five_day <=", value, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayIn(List<BigDecimal> values) {
            addCriterion("five_day in", values, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayNotIn(List<BigDecimal> values) {
            addCriterion("five_day not in", values, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("five_day between", value1, value2, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andFiveDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("five_day not between", value1, value2, "fiveDay");
            return (Criteria) this;
        }

        public Criteria andSixDayIsNull() {
            addCriterion("six_day is null");
            return (Criteria) this;
        }

        public Criteria andSixDayIsNotNull() {
            addCriterion("six_day is not null");
            return (Criteria) this;
        }

        public Criteria andSixDayEqualTo(BigDecimal value) {
            addCriterion("six_day =", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayNotEqualTo(BigDecimal value) {
            addCriterion("six_day <>", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayGreaterThan(BigDecimal value) {
            addCriterion("six_day >", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("six_day >=", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayLessThan(BigDecimal value) {
            addCriterion("six_day <", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("six_day <=", value, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayIn(List<BigDecimal> values) {
            addCriterion("six_day in", values, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayNotIn(List<BigDecimal> values) {
            addCriterion("six_day not in", values, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("six_day between", value1, value2, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSixDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("six_day not between", value1, value2, "sixDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayIsNull() {
            addCriterion("seven_day is null");
            return (Criteria) this;
        }

        public Criteria andSevenDayIsNotNull() {
            addCriterion("seven_day is not null");
            return (Criteria) this;
        }

        public Criteria andSevenDayEqualTo(BigDecimal value) {
            addCriterion("seven_day =", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayNotEqualTo(BigDecimal value) {
            addCriterion("seven_day <>", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayGreaterThan(BigDecimal value) {
            addCriterion("seven_day >", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seven_day >=", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayLessThan(BigDecimal value) {
            addCriterion("seven_day <", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seven_day <=", value, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayIn(List<BigDecimal> values) {
            addCriterion("seven_day in", values, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayNotIn(List<BigDecimal> values) {
            addCriterion("seven_day not in", values, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seven_day between", value1, value2, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andSevenDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seven_day not between", value1, value2, "sevenDay");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksIsNull() {
            addCriterion("two_weeks is null");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksIsNotNull() {
            addCriterion("two_weeks is not null");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksEqualTo(BigDecimal value) {
            addCriterion("two_weeks =", value, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksNotEqualTo(BigDecimal value) {
            addCriterion("two_weeks <>", value, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksGreaterThan(BigDecimal value) {
            addCriterion("two_weeks >", value, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("two_weeks >=", value, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksLessThan(BigDecimal value) {
            addCriterion("two_weeks <", value, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksLessThanOrEqualTo(BigDecimal value) {
            addCriterion("two_weeks <=", value, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksIn(List<BigDecimal> values) {
            addCriterion("two_weeks in", values, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksNotIn(List<BigDecimal> values) {
            addCriterion("two_weeks not in", values, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("two_weeks between", value1, value2, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andTwoWeeksNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("two_weeks not between", value1, value2, "twoWeeks");
            return (Criteria) this;
        }

        public Criteria andOneMonthIsNull() {
            addCriterion("one_month is null");
            return (Criteria) this;
        }

        public Criteria andOneMonthIsNotNull() {
            addCriterion("one_month is not null");
            return (Criteria) this;
        }

        public Criteria andOneMonthEqualTo(BigDecimal value) {
            addCriterion("one_month =", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotEqualTo(BigDecimal value) {
            addCriterion("one_month <>", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthGreaterThan(BigDecimal value) {
            addCriterion("one_month >", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("one_month >=", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthLessThan(BigDecimal value) {
            addCriterion("one_month <", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("one_month <=", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthIn(List<BigDecimal> values) {
            addCriterion("one_month in", values, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotIn(List<BigDecimal> values) {
            addCriterion("one_month not in", values, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_month between", value1, value2, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("one_month not between", value1, value2, "oneMonth");
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