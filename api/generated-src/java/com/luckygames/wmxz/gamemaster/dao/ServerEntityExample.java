package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServerEntityExample() {
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

        public Criteria andServerStateIsNull() {
            addCriterion("server_state is null");
            return (Criteria) this;
        }

        public Criteria andServerStateIsNotNull() {
            addCriterion("server_state is not null");
            return (Criteria) this;
        }

        public Criteria andServerStateEqualTo(Integer value) {
            addCriterion("server_state =", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateNotEqualTo(Integer value) {
            addCriterion("server_state <>", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateGreaterThan(Integer value) {
            addCriterion("server_state >", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_state >=", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateLessThan(Integer value) {
            addCriterion("server_state <", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateLessThanOrEqualTo(Integer value) {
            addCriterion("server_state <=", value, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateIn(List<Integer> values) {
            addCriterion("server_state in", values, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateNotIn(List<Integer> values) {
            addCriterion("server_state not in", values, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateBetween(Integer value1, Integer value2) {
            addCriterion("server_state between", value1, value2, "serverState");
            return (Criteria) this;
        }

        public Criteria andServerStateNotBetween(Integer value1, Integer value2) {
            addCriterion("server_state not between", value1, value2, "serverState");
            return (Criteria) this;
        }

        public Criteria andShowNumberIsNull() {
            addCriterion("show_number is null");
            return (Criteria) this;
        }

        public Criteria andShowNumberIsNotNull() {
            addCriterion("show_number is not null");
            return (Criteria) this;
        }

        public Criteria andShowNumberEqualTo(Integer value) {
            addCriterion("show_number =", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberNotEqualTo(Integer value) {
            addCriterion("show_number <>", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberGreaterThan(Integer value) {
            addCriterion("show_number >", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_number >=", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberLessThan(Integer value) {
            addCriterion("show_number <", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberLessThanOrEqualTo(Integer value) {
            addCriterion("show_number <=", value, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberIn(List<Integer> values) {
            addCriterion("show_number in", values, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberNotIn(List<Integer> values) {
            addCriterion("show_number not in", values, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberBetween(Integer value1, Integer value2) {
            addCriterion("show_number between", value1, value2, "showNumber");
            return (Criteria) this;
        }

        public Criteria andShowNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("show_number not between", value1, value2, "showNumber");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("`label` is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("`label` is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(Integer value) {
            addCriterion("`label` =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(Integer value) {
            addCriterion("`label` <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(Integer value) {
            addCriterion("`label` >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(Integer value) {
            addCriterion("`label` >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(Integer value) {
            addCriterion("`label` <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(Integer value) {
            addCriterion("`label` <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<Integer> values) {
            addCriterion("`label` in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<Integer> values) {
            addCriterion("`label` not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(Integer value1, Integer value2) {
            addCriterion("`label` between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(Integer value1, Integer value2) {
            addCriterion("`label` not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPayAddressIsNull() {
            addCriterion("pay_address is null");
            return (Criteria) this;
        }

        public Criteria andPayAddressIsNotNull() {
            addCriterion("pay_address is not null");
            return (Criteria) this;
        }

        public Criteria andPayAddressEqualTo(String value) {
            addCriterion("pay_address =", value, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressNotEqualTo(String value) {
            addCriterion("pay_address <>", value, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressGreaterThan(String value) {
            addCriterion("pay_address >", value, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pay_address >=", value, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressLessThan(String value) {
            addCriterion("pay_address <", value, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressLessThanOrEqualTo(String value) {
            addCriterion("pay_address <=", value, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressLike(String value) {
            addCriterion("pay_address like", value, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressNotLike(String value) {
            addCriterion("pay_address not like", value, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressIn(List<String> values) {
            addCriterion("pay_address in", values, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressNotIn(List<String> values) {
            addCriterion("pay_address not in", values, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressBetween(String value1, String value2) {
            addCriterion("pay_address between", value1, value2, "payAddress");
            return (Criteria) this;
        }

        public Criteria andPayAddressNotBetween(String value1, String value2) {
            addCriterion("pay_address not between", value1, value2, "payAddress");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(String value) {
            addCriterion("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(String value) {
            addCriterion("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(String value) {
            addCriterion("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(String value) {
            addCriterion("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(String value) {
            addCriterion("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLike(String value) {
            addCriterion("open_time like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotLike(String value) {
            addCriterion("open_time not like", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<String> values) {
            addCriterion("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<String> values) {
            addCriterion("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(String value1, String value2) {
            addCriterion("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(String value1, String value2) {
            addCriterion("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(String value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(String value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(String value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(String value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(String value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLike(String value) {
            addCriterion("close_time like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotLike(String value) {
            addCriterion("close_time not like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<String> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<String> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(String value1, String value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(String value1, String value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
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

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableIsNull() {
            addCriterion("white_list_enable is null");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableIsNotNull() {
            addCriterion("white_list_enable is not null");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableEqualTo(Integer value) {
            addCriterion("white_list_enable =", value, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableNotEqualTo(Integer value) {
            addCriterion("white_list_enable <>", value, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableGreaterThan(Integer value) {
            addCriterion("white_list_enable >", value, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("white_list_enable >=", value, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableLessThan(Integer value) {
            addCriterion("white_list_enable <", value, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableLessThanOrEqualTo(Integer value) {
            addCriterion("white_list_enable <=", value, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableIn(List<Integer> values) {
            addCriterion("white_list_enable in", values, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableNotIn(List<Integer> values) {
            addCriterion("white_list_enable not in", values, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableBetween(Integer value1, Integer value2) {
            addCriterion("white_list_enable between", value1, value2, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andWhiteListEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("white_list_enable not between", value1, value2, "whiteListEnable");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsIsNull() {
            addCriterion("maintenance_tips is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsIsNotNull() {
            addCriterion("maintenance_tips is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsEqualTo(String value) {
            addCriterion("maintenance_tips =", value, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsNotEqualTo(String value) {
            addCriterion("maintenance_tips <>", value, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsGreaterThan(String value) {
            addCriterion("maintenance_tips >", value, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsGreaterThanOrEqualTo(String value) {
            addCriterion("maintenance_tips >=", value, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsLessThan(String value) {
            addCriterion("maintenance_tips <", value, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsLessThanOrEqualTo(String value) {
            addCriterion("maintenance_tips <=", value, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsLike(String value) {
            addCriterion("maintenance_tips like", value, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsNotLike(String value) {
            addCriterion("maintenance_tips not like", value, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsIn(List<String> values) {
            addCriterion("maintenance_tips in", values, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsNotIn(List<String> values) {
            addCriterion("maintenance_tips not in", values, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsBetween(String value1, String value2) {
            addCriterion("maintenance_tips between", value1, value2, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andMaintenanceTipsNotBetween(String value1, String value2) {
            addCriterion("maintenance_tips not between", value1, value2, "maintenanceTips");
            return (Criteria) this;
        }

        public Criteria andGmPortIsNull() {
            addCriterion("gm_port is null");
            return (Criteria) this;
        }

        public Criteria andGmPortIsNotNull() {
            addCriterion("gm_port is not null");
            return (Criteria) this;
        }

        public Criteria andGmPortEqualTo(Integer value) {
            addCriterion("gm_port =", value, "gmPort");
            return (Criteria) this;
        }

        public Criteria andGmPortNotEqualTo(Integer value) {
            addCriterion("gm_port <>", value, "gmPort");
            return (Criteria) this;
        }

        public Criteria andGmPortGreaterThan(Integer value) {
            addCriterion("gm_port >", value, "gmPort");
            return (Criteria) this;
        }

        public Criteria andGmPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("gm_port >=", value, "gmPort");
            return (Criteria) this;
        }

        public Criteria andGmPortLessThan(Integer value) {
            addCriterion("gm_port <", value, "gmPort");
            return (Criteria) this;
        }

        public Criteria andGmPortLessThanOrEqualTo(Integer value) {
            addCriterion("gm_port <=", value, "gmPort");
            return (Criteria) this;
        }

        public Criteria andGmPortIn(List<Integer> values) {
            addCriterion("gm_port in", values, "gmPort");
            return (Criteria) this;
        }

        public Criteria andGmPortNotIn(List<Integer> values) {
            addCriterion("gm_port not in", values, "gmPort");
            return (Criteria) this;
        }

        public Criteria andGmPortBetween(Integer value1, Integer value2) {
            addCriterion("gm_port between", value1, value2, "gmPort");
            return (Criteria) this;
        }

        public Criteria andGmPortNotBetween(Integer value1, Integer value2) {
            addCriterion("gm_port not between", value1, value2, "gmPort");
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