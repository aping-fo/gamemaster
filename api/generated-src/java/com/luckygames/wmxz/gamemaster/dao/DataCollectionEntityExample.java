package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataCollectionEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCollectionEntityExample() {
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

        public Criteria andRegisterNumberIsNull() {
            addCriterion("register_number is null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberIsNotNull() {
            addCriterion("register_number is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberEqualTo(Long value) {
            addCriterion("register_number =", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberNotEqualTo(Long value) {
            addCriterion("register_number <>", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberGreaterThan(Long value) {
            addCriterion("register_number >", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("register_number >=", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberLessThan(Long value) {
            addCriterion("register_number <", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberLessThanOrEqualTo(Long value) {
            addCriterion("register_number <=", value, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberIn(List<Long> values) {
            addCriterion("register_number in", values, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberNotIn(List<Long> values) {
            addCriterion("register_number not in", values, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberBetween(Long value1, Long value2) {
            addCriterion("register_number between", value1, value2, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRegisterNumberNotBetween(Long value1, Long value2) {
            addCriterion("register_number not between", value1, value2, "registerNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberIsNull() {
            addCriterion("role_number is null");
            return (Criteria) this;
        }

        public Criteria andRoleNumberIsNotNull() {
            addCriterion("role_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNumberEqualTo(Long value) {
            addCriterion("role_number =", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberNotEqualTo(Long value) {
            addCriterion("role_number <>", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberGreaterThan(Long value) {
            addCriterion("role_number >", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("role_number >=", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberLessThan(Long value) {
            addCriterion("role_number <", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberLessThanOrEqualTo(Long value) {
            addCriterion("role_number <=", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberIn(List<Long> values) {
            addCriterion("role_number in", values, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberNotIn(List<Long> values) {
            addCriterion("role_number not in", values, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberBetween(Long value1, Long value2) {
            addCriterion("role_number between", value1, value2, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberNotBetween(Long value1, Long value2) {
            addCriterion("role_number not between", value1, value2, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberIsNull() {
            addCriterion("login_number is null");
            return (Criteria) this;
        }

        public Criteria andLoginNumberIsNotNull() {
            addCriterion("login_number is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNumberEqualTo(Long value) {
            addCriterion("login_number =", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberNotEqualTo(Long value) {
            addCriterion("login_number <>", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberGreaterThan(Long value) {
            addCriterion("login_number >", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("login_number >=", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberLessThan(Long value) {
            addCriterion("login_number <", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberLessThanOrEqualTo(Long value) {
            addCriterion("login_number <=", value, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberIn(List<Long> values) {
            addCriterion("login_number in", values, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberNotIn(List<Long> values) {
            addCriterion("login_number not in", values, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberBetween(Long value1, Long value2) {
            addCriterion("login_number between", value1, value2, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andLoginNumberNotBetween(Long value1, Long value2) {
            addCriterion("login_number not between", value1, value2, "loginNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberIsNull() {
            addCriterion("active_number is null");
            return (Criteria) this;
        }

        public Criteria andActiveNumberIsNotNull() {
            addCriterion("active_number is not null");
            return (Criteria) this;
        }

        public Criteria andActiveNumberEqualTo(Long value) {
            addCriterion("active_number =", value, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberNotEqualTo(Long value) {
            addCriterion("active_number <>", value, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberGreaterThan(Long value) {
            addCriterion("active_number >", value, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("active_number >=", value, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberLessThan(Long value) {
            addCriterion("active_number <", value, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberLessThanOrEqualTo(Long value) {
            addCriterion("active_number <=", value, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberIn(List<Long> values) {
            addCriterion("active_number in", values, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberNotIn(List<Long> values) {
            addCriterion("active_number not in", values, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberBetween(Long value1, Long value2) {
            addCriterion("active_number between", value1, value2, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andActiveNumberNotBetween(Long value1, Long value2) {
            addCriterion("active_number not between", value1, value2, "activeNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberIsNull() {
            addCriterion("old_player_number is null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberIsNotNull() {
            addCriterion("old_player_number is not null");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberEqualTo(Long value) {
            addCriterion("old_player_number =", value, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberNotEqualTo(Long value) {
            addCriterion("old_player_number <>", value, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberGreaterThan(Long value) {
            addCriterion("old_player_number >", value, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("old_player_number >=", value, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberLessThan(Long value) {
            addCriterion("old_player_number <", value, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberLessThanOrEqualTo(Long value) {
            addCriterion("old_player_number <=", value, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberIn(List<Long> values) {
            addCriterion("old_player_number in", values, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberNotIn(List<Long> values) {
            addCriterion("old_player_number not in", values, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberBetween(Long value1, Long value2) {
            addCriterion("old_player_number between", value1, value2, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andOldPlayerNumberNotBetween(Long value1, Long value2) {
            addCriterion("old_player_number not between", value1, value2, "oldPlayerNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberIsNull() {
            addCriterion("pay_number is null");
            return (Criteria) this;
        }

        public Criteria andPayNumberIsNotNull() {
            addCriterion("pay_number is not null");
            return (Criteria) this;
        }

        public Criteria andPayNumberEqualTo(Long value) {
            addCriterion("pay_number =", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberNotEqualTo(Long value) {
            addCriterion("pay_number <>", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberGreaterThan(Long value) {
            addCriterion("pay_number >", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_number >=", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberLessThan(Long value) {
            addCriterion("pay_number <", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberLessThanOrEqualTo(Long value) {
            addCriterion("pay_number <=", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberIn(List<Long> values) {
            addCriterion("pay_number in", values, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberNotIn(List<Long> values) {
            addCriterion("pay_number not in", values, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberBetween(Long value1, Long value2) {
            addCriterion("pay_number between", value1, value2, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberNotBetween(Long value1, Long value2) {
            addCriterion("pay_number not between", value1, value2, "payNumber");
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

        public Criteria andRechargeAmountEqualTo(Long value) {
            addCriterion("recharge_amount =", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotEqualTo(Long value) {
            addCriterion("recharge_amount <>", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThan(Long value) {
            addCriterion("recharge_amount >", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("recharge_amount >=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThan(Long value) {
            addCriterion("recharge_amount <", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("recharge_amount <=", value, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountIn(List<Long> values) {
            addCriterion("recharge_amount in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotIn(List<Long> values) {
            addCriterion("recharge_amount not in", values, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountBetween(Long value1, Long value2) {
            addCriterion("recharge_amount between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andRechargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("recharge_amount not between", value1, value2, "rechargeAmount");
            return (Criteria) this;
        }

        public Criteria andPayRateIsNull() {
            addCriterion("pay_rate is null");
            return (Criteria) this;
        }

        public Criteria andPayRateIsNotNull() {
            addCriterion("pay_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPayRateEqualTo(BigDecimal value) {
            addCriterion("pay_rate =", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateNotEqualTo(BigDecimal value) {
            addCriterion("pay_rate <>", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateGreaterThan(BigDecimal value) {
            addCriterion("pay_rate >", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_rate >=", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateLessThan(BigDecimal value) {
            addCriterion("pay_rate <", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_rate <=", value, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateIn(List<BigDecimal> values) {
            addCriterion("pay_rate in", values, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateNotIn(List<BigDecimal> values) {
            addCriterion("pay_rate not in", values, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_rate between", value1, value2, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_rate not between", value1, value2, "payRate");
            return (Criteria) this;
        }

        public Criteria andPayArpuIsNull() {
            addCriterion("pay_arpu is null");
            return (Criteria) this;
        }

        public Criteria andPayArpuIsNotNull() {
            addCriterion("pay_arpu is not null");
            return (Criteria) this;
        }

        public Criteria andPayArpuEqualTo(BigDecimal value) {
            addCriterion("pay_arpu =", value, "payArpu");
            return (Criteria) this;
        }

        public Criteria andPayArpuNotEqualTo(BigDecimal value) {
            addCriterion("pay_arpu <>", value, "payArpu");
            return (Criteria) this;
        }

        public Criteria andPayArpuGreaterThan(BigDecimal value) {
            addCriterion("pay_arpu >", value, "payArpu");
            return (Criteria) this;
        }

        public Criteria andPayArpuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_arpu >=", value, "payArpu");
            return (Criteria) this;
        }

        public Criteria andPayArpuLessThan(BigDecimal value) {
            addCriterion("pay_arpu <", value, "payArpu");
            return (Criteria) this;
        }

        public Criteria andPayArpuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_arpu <=", value, "payArpu");
            return (Criteria) this;
        }

        public Criteria andPayArpuIn(List<BigDecimal> values) {
            addCriterion("pay_arpu in", values, "payArpu");
            return (Criteria) this;
        }

        public Criteria andPayArpuNotIn(List<BigDecimal> values) {
            addCriterion("pay_arpu not in", values, "payArpu");
            return (Criteria) this;
        }

        public Criteria andPayArpuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_arpu between", value1, value2, "payArpu");
            return (Criteria) this;
        }

        public Criteria andPayArpuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_arpu not between", value1, value2, "payArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberIsNull() {
            addCriterion("new_pay_number is null");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberIsNotNull() {
            addCriterion("new_pay_number is not null");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberEqualTo(Long value) {
            addCriterion("new_pay_number =", value, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberNotEqualTo(Long value) {
            addCriterion("new_pay_number <>", value, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberGreaterThan(Long value) {
            addCriterion("new_pay_number >", value, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("new_pay_number >=", value, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberLessThan(Long value) {
            addCriterion("new_pay_number <", value, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberLessThanOrEqualTo(Long value) {
            addCriterion("new_pay_number <=", value, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberIn(List<Long> values) {
            addCriterion("new_pay_number in", values, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberNotIn(List<Long> values) {
            addCriterion("new_pay_number not in", values, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberBetween(Long value1, Long value2) {
            addCriterion("new_pay_number between", value1, value2, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayNumberNotBetween(Long value1, Long value2) {
            addCriterion("new_pay_number not between", value1, value2, "newPayNumber");
            return (Criteria) this;
        }

        public Criteria andNewPayRateIsNull() {
            addCriterion("new_pay_rate is null");
            return (Criteria) this;
        }

        public Criteria andNewPayRateIsNotNull() {
            addCriterion("new_pay_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNewPayRateEqualTo(BigDecimal value) {
            addCriterion("new_pay_rate =", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateNotEqualTo(BigDecimal value) {
            addCriterion("new_pay_rate <>", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateGreaterThan(BigDecimal value) {
            addCriterion("new_pay_rate >", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_pay_rate >=", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateLessThan(BigDecimal value) {
            addCriterion("new_pay_rate <", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_pay_rate <=", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateIn(List<BigDecimal> values) {
            addCriterion("new_pay_rate in", values, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateNotIn(List<BigDecimal> values) {
            addCriterion("new_pay_rate not in", values, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_pay_rate between", value1, value2, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_pay_rate not between", value1, value2, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountIsNull() {
            addCriterion("new_recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountIsNotNull() {
            addCriterion("new_recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountEqualTo(Long value) {
            addCriterion("new_recharge_amount =", value, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountNotEqualTo(Long value) {
            addCriterion("new_recharge_amount <>", value, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountGreaterThan(Long value) {
            addCriterion("new_recharge_amount >", value, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("new_recharge_amount >=", value, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountLessThan(Long value) {
            addCriterion("new_recharge_amount <", value, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("new_recharge_amount <=", value, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountIn(List<Long> values) {
            addCriterion("new_recharge_amount in", values, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountNotIn(List<Long> values) {
            addCriterion("new_recharge_amount not in", values, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountBetween(Long value1, Long value2) {
            addCriterion("new_recharge_amount between", value1, value2, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewRechargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("new_recharge_amount not between", value1, value2, "newRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuIsNull() {
            addCriterion("new_pay_arpu is null");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuIsNotNull() {
            addCriterion("new_pay_arpu is not null");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuEqualTo(BigDecimal value) {
            addCriterion("new_pay_arpu =", value, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuNotEqualTo(BigDecimal value) {
            addCriterion("new_pay_arpu <>", value, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuGreaterThan(BigDecimal value) {
            addCriterion("new_pay_arpu >", value, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_pay_arpu >=", value, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuLessThan(BigDecimal value) {
            addCriterion("new_pay_arpu <", value, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_pay_arpu <=", value, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuIn(List<BigDecimal> values) {
            addCriterion("new_pay_arpu in", values, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuNotIn(List<BigDecimal> values) {
            addCriterion("new_pay_arpu not in", values, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_pay_arpu between", value1, value2, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andNewPayArpuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_pay_arpu not between", value1, value2, "newPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberIsNull() {
            addCriterion("old_pay_number is null");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberIsNotNull() {
            addCriterion("old_pay_number is not null");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberEqualTo(Long value) {
            addCriterion("old_pay_number =", value, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberNotEqualTo(Long value) {
            addCriterion("old_pay_number <>", value, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberGreaterThan(Long value) {
            addCriterion("old_pay_number >", value, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("old_pay_number >=", value, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberLessThan(Long value) {
            addCriterion("old_pay_number <", value, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberLessThanOrEqualTo(Long value) {
            addCriterion("old_pay_number <=", value, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberIn(List<Long> values) {
            addCriterion("old_pay_number in", values, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberNotIn(List<Long> values) {
            addCriterion("old_pay_number not in", values, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberBetween(Long value1, Long value2) {
            addCriterion("old_pay_number between", value1, value2, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldPayNumberNotBetween(Long value1, Long value2) {
            addCriterion("old_pay_number not between", value1, value2, "oldPayNumber");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountIsNull() {
            addCriterion("old_recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountIsNotNull() {
            addCriterion("old_recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountEqualTo(Long value) {
            addCriterion("old_recharge_amount =", value, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountNotEqualTo(Long value) {
            addCriterion("old_recharge_amount <>", value, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountGreaterThan(Long value) {
            addCriterion("old_recharge_amount >", value, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("old_recharge_amount >=", value, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountLessThan(Long value) {
            addCriterion("old_recharge_amount <", value, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("old_recharge_amount <=", value, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountIn(List<Long> values) {
            addCriterion("old_recharge_amount in", values, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountNotIn(List<Long> values) {
            addCriterion("old_recharge_amount not in", values, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountBetween(Long value1, Long value2) {
            addCriterion("old_recharge_amount between", value1, value2, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldRechargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("old_recharge_amount not between", value1, value2, "oldRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andOldPayRateIsNull() {
            addCriterion("old_pay_rate is null");
            return (Criteria) this;
        }

        public Criteria andOldPayRateIsNotNull() {
            addCriterion("old_pay_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOldPayRateEqualTo(BigDecimal value) {
            addCriterion("old_pay_rate =", value, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayRateNotEqualTo(BigDecimal value) {
            addCriterion("old_pay_rate <>", value, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayRateGreaterThan(BigDecimal value) {
            addCriterion("old_pay_rate >", value, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_pay_rate >=", value, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayRateLessThan(BigDecimal value) {
            addCriterion("old_pay_rate <", value, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_pay_rate <=", value, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayRateIn(List<BigDecimal> values) {
            addCriterion("old_pay_rate in", values, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayRateNotIn(List<BigDecimal> values) {
            addCriterion("old_pay_rate not in", values, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_pay_rate between", value1, value2, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_pay_rate not between", value1, value2, "oldPayRate");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuIsNull() {
            addCriterion("old_pay_arpu is null");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuIsNotNull() {
            addCriterion("old_pay_arpu is not null");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuEqualTo(BigDecimal value) {
            addCriterion("old_pay_arpu =", value, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuNotEqualTo(BigDecimal value) {
            addCriterion("old_pay_arpu <>", value, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuGreaterThan(BigDecimal value) {
            addCriterion("old_pay_arpu >", value, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("old_pay_arpu >=", value, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuLessThan(BigDecimal value) {
            addCriterion("old_pay_arpu <", value, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("old_pay_arpu <=", value, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuIn(List<BigDecimal> values) {
            addCriterion("old_pay_arpu in", values, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuNotIn(List<BigDecimal> values) {
            addCriterion("old_pay_arpu not in", values, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_pay_arpu between", value1, value2, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andOldPayArpuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("old_pay_arpu not between", value1, value2, "oldPayArpu");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgIsNull() {
            addCriterion("next_day_avg is null");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgIsNotNull() {
            addCriterion("next_day_avg is not null");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgEqualTo(BigDecimal value) {
            addCriterion("next_day_avg =", value, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgNotEqualTo(BigDecimal value) {
            addCriterion("next_day_avg <>", value, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgGreaterThan(BigDecimal value) {
            addCriterion("next_day_avg >", value, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("next_day_avg >=", value, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgLessThan(BigDecimal value) {
            addCriterion("next_day_avg <", value, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("next_day_avg <=", value, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgIn(List<BigDecimal> values) {
            addCriterion("next_day_avg in", values, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgNotIn(List<BigDecimal> values) {
            addCriterion("next_day_avg not in", values, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("next_day_avg between", value1, value2, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andNextDayAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("next_day_avg not between", value1, value2, "nextDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgIsNull() {
            addCriterion("three_day_avg is null");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgIsNotNull() {
            addCriterion("three_day_avg is not null");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgEqualTo(BigDecimal value) {
            addCriterion("three_day_avg =", value, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgNotEqualTo(BigDecimal value) {
            addCriterion("three_day_avg <>", value, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgGreaterThan(BigDecimal value) {
            addCriterion("three_day_avg >", value, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("three_day_avg >=", value, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgLessThan(BigDecimal value) {
            addCriterion("three_day_avg <", value, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("three_day_avg <=", value, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgIn(List<BigDecimal> values) {
            addCriterion("three_day_avg in", values, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgNotIn(List<BigDecimal> values) {
            addCriterion("three_day_avg not in", values, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("three_day_avg between", value1, value2, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andThreeDayAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("three_day_avg not between", value1, value2, "threeDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgIsNull() {
            addCriterion("seven_day_avg is null");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgIsNotNull() {
            addCriterion("seven_day_avg is not null");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgEqualTo(BigDecimal value) {
            addCriterion("seven_day_avg =", value, "sevenDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgNotEqualTo(BigDecimal value) {
            addCriterion("seven_day_avg <>", value, "sevenDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgGreaterThan(BigDecimal value) {
            addCriterion("seven_day_avg >", value, "sevenDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seven_day_avg >=", value, "sevenDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgLessThan(BigDecimal value) {
            addCriterion("seven_day_avg <", value, "sevenDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seven_day_avg <=", value, "sevenDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgIn(List<BigDecimal> values) {
            addCriterion("seven_day_avg in", values, "sevenDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgNotIn(List<BigDecimal> values) {
            addCriterion("seven_day_avg not in", values, "sevenDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seven_day_avg between", value1, value2, "sevenDayAvg");
            return (Criteria) this;
        }

        public Criteria andSevenDayAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seven_day_avg not between", value1, value2, "sevenDayAvg");
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

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageIdIsNull() {
            addCriterion("package_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageIdIsNotNull() {
            addCriterion("package_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageIdEqualTo(Integer value) {
            addCriterion("package_id =", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotEqualTo(Integer value) {
            addCriterion("package_id <>", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThan(Integer value) {
            addCriterion("package_id >", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_id >=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThan(Integer value) {
            addCriterion("package_id <", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_id <=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdIn(List<Integer> values) {
            addCriterion("package_id in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotIn(List<Integer> values) {
            addCriterion("package_id not in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdBetween(Integer value1, Integer value2) {
            addCriterion("package_id between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_id not between", value1, value2, "packageId");
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