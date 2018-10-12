package com.luckygames.wmxz.gamemaster.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProhibitionEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProhibitionEntityExample() {
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

        public Criteria andClosureTypeIsNull() {
            addCriterion("closure_type is null");
            return (Criteria) this;
        }

        public Criteria andClosureTypeIsNotNull() {
            addCriterion("closure_type is not null");
            return (Criteria) this;
        }

        public Criteria andClosureTypeEqualTo(Integer value) {
            addCriterion("closure_type =", value, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureTypeNotEqualTo(Integer value) {
            addCriterion("closure_type <>", value, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureTypeGreaterThan(Integer value) {
            addCriterion("closure_type >", value, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("closure_type >=", value, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureTypeLessThan(Integer value) {
            addCriterion("closure_type <", value, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureTypeLessThanOrEqualTo(Integer value) {
            addCriterion("closure_type <=", value, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureTypeIn(List<Integer> values) {
            addCriterion("closure_type in", values, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureTypeNotIn(List<Integer> values) {
            addCriterion("closure_type not in", values, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureTypeBetween(Integer value1, Integer value2) {
            addCriterion("closure_type between", value1, value2, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("closure_type not between", value1, value2, "closureType");
            return (Criteria) this;
        }

        public Criteria andClosureWayIsNull() {
            addCriterion("closure_way is null");
            return (Criteria) this;
        }

        public Criteria andClosureWayIsNotNull() {
            addCriterion("closure_way is not null");
            return (Criteria) this;
        }

        public Criteria andClosureWayEqualTo(Integer value) {
            addCriterion("closure_way =", value, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureWayNotEqualTo(Integer value) {
            addCriterion("closure_way <>", value, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureWayGreaterThan(Integer value) {
            addCriterion("closure_way >", value, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("closure_way >=", value, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureWayLessThan(Integer value) {
            addCriterion("closure_way <", value, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureWayLessThanOrEqualTo(Integer value) {
            addCriterion("closure_way <=", value, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureWayIn(List<Integer> values) {
            addCriterion("closure_way in", values, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureWayNotIn(List<Integer> values) {
            addCriterion("closure_way not in", values, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureWayBetween(Integer value1, Integer value2) {
            addCriterion("closure_way between", value1, value2, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureWayNotBetween(Integer value1, Integer value2) {
            addCriterion("closure_way not between", value1, value2, "closureWay");
            return (Criteria) this;
        }

        public Criteria andClosureAccountIsNull() {
            addCriterion("closure_account is null");
            return (Criteria) this;
        }

        public Criteria andClosureAccountIsNotNull() {
            addCriterion("closure_account is not null");
            return (Criteria) this;
        }

        public Criteria andClosureAccountEqualTo(String value) {
            addCriterion("closure_account =", value, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountNotEqualTo(String value) {
            addCriterion("closure_account <>", value, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountGreaterThan(String value) {
            addCriterion("closure_account >", value, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountGreaterThanOrEqualTo(String value) {
            addCriterion("closure_account >=", value, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountLessThan(String value) {
            addCriterion("closure_account <", value, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountLessThanOrEqualTo(String value) {
            addCriterion("closure_account <=", value, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountLike(String value) {
            addCriterion("closure_account like", value, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountNotLike(String value) {
            addCriterion("closure_account not like", value, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountIn(List<String> values) {
            addCriterion("closure_account in", values, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountNotIn(List<String> values) {
            addCriterion("closure_account not in", values, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountBetween(String value1, String value2) {
            addCriterion("closure_account between", value1, value2, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureAccountNotBetween(String value1, String value2) {
            addCriterion("closure_account not between", value1, value2, "closureAccount");
            return (Criteria) this;
        }

        public Criteria andClosureTimeIsNull() {
            addCriterion("closure_time is null");
            return (Criteria) this;
        }

        public Criteria andClosureTimeIsNotNull() {
            addCriterion("closure_time is not null");
            return (Criteria) this;
        }

        public Criteria andClosureTimeEqualTo(Long value) {
            addCriterion("closure_time =", value, "closureTime");
            return (Criteria) this;
        }

        public Criteria andClosureTimeNotEqualTo(Long value) {
            addCriterion("closure_time <>", value, "closureTime");
            return (Criteria) this;
        }

        public Criteria andClosureTimeGreaterThan(Long value) {
            addCriterion("closure_time >", value, "closureTime");
            return (Criteria) this;
        }

        public Criteria andClosureTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("closure_time >=", value, "closureTime");
            return (Criteria) this;
        }

        public Criteria andClosureTimeLessThan(Long value) {
            addCriterion("closure_time <", value, "closureTime");
            return (Criteria) this;
        }

        public Criteria andClosureTimeLessThanOrEqualTo(Long value) {
            addCriterion("closure_time <=", value, "closureTime");
            return (Criteria) this;
        }

        public Criteria andClosureTimeIn(List<Long> values) {
            addCriterion("closure_time in", values, "closureTime");
            return (Criteria) this;
        }

        public Criteria andClosureTimeNotIn(List<Long> values) {
            addCriterion("closure_time not in", values, "closureTime");
            return (Criteria) this;
        }

        public Criteria andClosureTimeBetween(Long value1, Long value2) {
            addCriterion("closure_time between", value1, value2, "closureTime");
            return (Criteria) this;
        }

        public Criteria andClosureTimeNotBetween(Long value1, Long value2) {
            addCriterion("closure_time not between", value1, value2, "closureTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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