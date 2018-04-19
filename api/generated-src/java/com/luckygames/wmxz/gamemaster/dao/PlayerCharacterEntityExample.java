package com.luckygames.wmxz.gamemaster.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayerCharacterEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayerCharacterEntityExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNull() {
            addCriterion("player_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("player_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(Integer value) {
            addCriterion("player_id =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(Integer value) {
            addCriterion("player_id <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(Integer value) {
            addCriterion("player_id >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("player_id >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(Integer value) {
            addCriterion("player_id <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("player_id <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<Integer> values) {
            addCriterion("player_id in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<Integer> values) {
            addCriterion("player_id not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("player_id between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("player_id not between", value1, value2, "playerId");
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

        public Criteria andServerIdEqualTo(Integer value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Integer value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Integer value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Integer value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Integer value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Integer> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Integer> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Integer value1, Integer value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
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

        public Criteria andVipLevelIsNull() {
            addCriterion("vip_level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(Integer value) {
            addCriterion("vip_level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(Integer value) {
            addCriterion("vip_level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(Integer value) {
            addCriterion("vip_level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(Integer value) {
            addCriterion("vip_level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(Integer value) {
            addCriterion("vip_level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<Integer> values) {
            addCriterion("vip_level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<Integer> values) {
            addCriterion("vip_level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(Integer value1, Integer value2) {
            addCriterion("vip_level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_level not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("`power` is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("`power` is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(Integer value) {
            addCriterion("`power` =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(Integer value) {
            addCriterion("`power` <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(Integer value) {
            addCriterion("`power` >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("`power` >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(Integer value) {
            addCriterion("`power` <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(Integer value) {
            addCriterion("`power` <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<Integer> values) {
            addCriterion("`power` in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<Integer> values) {
            addCriterion("`power` not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(Integer value1, Integer value2) {
            addCriterion("`power` between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("`power` not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andFactionIdIsNull() {
            addCriterion("faction_id is null");
            return (Criteria) this;
        }

        public Criteria andFactionIdIsNotNull() {
            addCriterion("faction_id is not null");
            return (Criteria) this;
        }

        public Criteria andFactionIdEqualTo(Integer value) {
            addCriterion("faction_id =", value, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionIdNotEqualTo(Integer value) {
            addCriterion("faction_id <>", value, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionIdGreaterThan(Integer value) {
            addCriterion("faction_id >", value, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("faction_id >=", value, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionIdLessThan(Integer value) {
            addCriterion("faction_id <", value, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionIdLessThanOrEqualTo(Integer value) {
            addCriterion("faction_id <=", value, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionIdIn(List<Integer> values) {
            addCriterion("faction_id in", values, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionIdNotIn(List<Integer> values) {
            addCriterion("faction_id not in", values, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionIdBetween(Integer value1, Integer value2) {
            addCriterion("faction_id between", value1, value2, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("faction_id not between", value1, value2, "factionId");
            return (Criteria) this;
        }

        public Criteria andFactionNameIsNull() {
            addCriterion("faction_name is null");
            return (Criteria) this;
        }

        public Criteria andFactionNameIsNotNull() {
            addCriterion("faction_name is not null");
            return (Criteria) this;
        }

        public Criteria andFactionNameEqualTo(String value) {
            addCriterion("faction_name =", value, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameNotEqualTo(String value) {
            addCriterion("faction_name <>", value, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameGreaterThan(String value) {
            addCriterion("faction_name >", value, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameGreaterThanOrEqualTo(String value) {
            addCriterion("faction_name >=", value, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameLessThan(String value) {
            addCriterion("faction_name <", value, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameLessThanOrEqualTo(String value) {
            addCriterion("faction_name <=", value, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameLike(String value) {
            addCriterion("faction_name like", value, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameNotLike(String value) {
            addCriterion("faction_name not like", value, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameIn(List<String> values) {
            addCriterion("faction_name in", values, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameNotIn(List<String> values) {
            addCriterion("faction_name not in", values, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameBetween(String value1, String value2) {
            addCriterion("faction_name between", value1, value2, "factionName");
            return (Criteria) this;
        }

        public Criteria andFactionNameNotBetween(String value1, String value2) {
            addCriterion("faction_name not between", value1, value2, "factionName");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
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

        public Criteria andRechargeGoldIsNull() {
            addCriterion("recharge_gold is null");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldIsNotNull() {
            addCriterion("recharge_gold is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldEqualTo(Integer value) {
            addCriterion("recharge_gold =", value, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldNotEqualTo(Integer value) {
            addCriterion("recharge_gold <>", value, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldGreaterThan(Integer value) {
            addCriterion("recharge_gold >", value, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_gold >=", value, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldLessThan(Integer value) {
            addCriterion("recharge_gold <", value, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_gold <=", value, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldIn(List<Integer> values) {
            addCriterion("recharge_gold in", values, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldNotIn(List<Integer> values) {
            addCriterion("recharge_gold not in", values, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldBetween(Integer value1, Integer value2) {
            addCriterion("recharge_gold between", value1, value2, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_gold not between", value1, value2, "rechargeGold");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesIsNull() {
            addCriterion("recharge_times is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesIsNotNull() {
            addCriterion("recharge_times is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesEqualTo(Integer value) {
            addCriterion("recharge_times =", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesNotEqualTo(Integer value) {
            addCriterion("recharge_times <>", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesGreaterThan(Integer value) {
            addCriterion("recharge_times >", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_times >=", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesLessThan(Integer value) {
            addCriterion("recharge_times <", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_times <=", value, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesIn(List<Integer> values) {
            addCriterion("recharge_times in", values, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesNotIn(List<Integer> values) {
            addCriterion("recharge_times not in", values, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesBetween(Integer value1, Integer value2) {
            addCriterion("recharge_times between", value1, value2, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andRechargeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_times not between", value1, value2, "rechargeTimes");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeIsNull() {
            addCriterion("first_recharge_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeIsNotNull() {
            addCriterion("first_recharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeEqualTo(Date value) {
            addCriterion("first_recharge_time =", value, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeNotEqualTo(Date value) {
            addCriterion("first_recharge_time <>", value, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeGreaterThan(Date value) {
            addCriterion("first_recharge_time >", value, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_recharge_time >=", value, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeLessThan(Date value) {
            addCriterion("first_recharge_time <", value, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_recharge_time <=", value, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeIn(List<Date> values) {
            addCriterion("first_recharge_time in", values, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeNotIn(List<Date> values) {
            addCriterion("first_recharge_time not in", values, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeBetween(Date value1, Date value2) {
            addCriterion("first_recharge_time between", value1, value2, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andFirstRechargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_recharge_time not between", value1, value2, "firstRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeIsNull() {
            addCriterion("last_recharge_time is null");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeIsNotNull() {
            addCriterion("last_recharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeEqualTo(Date value) {
            addCriterion("last_recharge_time =", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeNotEqualTo(Date value) {
            addCriterion("last_recharge_time <>", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeGreaterThan(Date value) {
            addCriterion("last_recharge_time >", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_recharge_time >=", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeLessThan(Date value) {
            addCriterion("last_recharge_time <", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_recharge_time <=", value, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeIn(List<Date> values) {
            addCriterion("last_recharge_time in", values, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeNotIn(List<Date> values) {
            addCriterion("last_recharge_time not in", values, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeBetween(Date value1, Date value2) {
            addCriterion("last_recharge_time between", value1, value2, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLastRechargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_recharge_time not between", value1, value2, "lastRechargeTime");
            return (Criteria) this;
        }

        public Criteria andLeftGoldIsNull() {
            addCriterion("left_gold is null");
            return (Criteria) this;
        }

        public Criteria andLeftGoldIsNotNull() {
            addCriterion("left_gold is not null");
            return (Criteria) this;
        }

        public Criteria andLeftGoldEqualTo(Integer value) {
            addCriterion("left_gold =", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldNotEqualTo(Integer value) {
            addCriterion("left_gold <>", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldGreaterThan(Integer value) {
            addCriterion("left_gold >", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_gold >=", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldLessThan(Integer value) {
            addCriterion("left_gold <", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldLessThanOrEqualTo(Integer value) {
            addCriterion("left_gold <=", value, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldIn(List<Integer> values) {
            addCriterion("left_gold in", values, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldNotIn(List<Integer> values) {
            addCriterion("left_gold not in", values, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldBetween(Integer value1, Integer value2) {
            addCriterion("left_gold between", value1, value2, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("left_gold not between", value1, value2, "leftGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldIsNull() {
            addCriterion("left_special_gold is null");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldIsNotNull() {
            addCriterion("left_special_gold is not null");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldEqualTo(Integer value) {
            addCriterion("left_special_gold =", value, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldNotEqualTo(Integer value) {
            addCriterion("left_special_gold <>", value, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldGreaterThan(Integer value) {
            addCriterion("left_special_gold >", value, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_special_gold >=", value, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldLessThan(Integer value) {
            addCriterion("left_special_gold <", value, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldLessThanOrEqualTo(Integer value) {
            addCriterion("left_special_gold <=", value, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldIn(List<Integer> values) {
            addCriterion("left_special_gold in", values, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldNotIn(List<Integer> values) {
            addCriterion("left_special_gold not in", values, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldBetween(Integer value1, Integer value2) {
            addCriterion("left_special_gold between", value1, value2, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftSpecialGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("left_special_gold not between", value1, value2, "leftSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldIsNull() {
            addCriterion("used_special_gold is null");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldIsNotNull() {
            addCriterion("used_special_gold is not null");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldEqualTo(Integer value) {
            addCriterion("used_special_gold =", value, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldNotEqualTo(Integer value) {
            addCriterion("used_special_gold <>", value, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldGreaterThan(Integer value) {
            addCriterion("used_special_gold >", value, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("used_special_gold >=", value, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldLessThan(Integer value) {
            addCriterion("used_special_gold <", value, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldLessThanOrEqualTo(Integer value) {
            addCriterion("used_special_gold <=", value, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldIn(List<Integer> values) {
            addCriterion("used_special_gold in", values, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldNotIn(List<Integer> values) {
            addCriterion("used_special_gold not in", values, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldBetween(Integer value1, Integer value2) {
            addCriterion("used_special_gold between", value1, value2, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andUsedSpecialGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("used_special_gold not between", value1, value2, "usedSpecialGold");
            return (Criteria) this;
        }

        public Criteria andLeftCoinIsNull() {
            addCriterion("left_coin is null");
            return (Criteria) this;
        }

        public Criteria andLeftCoinIsNotNull() {
            addCriterion("left_coin is not null");
            return (Criteria) this;
        }

        public Criteria andLeftCoinEqualTo(Long value) {
            addCriterion("left_coin =", value, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andLeftCoinNotEqualTo(Long value) {
            addCriterion("left_coin <>", value, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andLeftCoinGreaterThan(Long value) {
            addCriterion("left_coin >", value, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andLeftCoinGreaterThanOrEqualTo(Long value) {
            addCriterion("left_coin >=", value, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andLeftCoinLessThan(Long value) {
            addCriterion("left_coin <", value, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andLeftCoinLessThanOrEqualTo(Long value) {
            addCriterion("left_coin <=", value, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andLeftCoinIn(List<Long> values) {
            addCriterion("left_coin in", values, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andLeftCoinNotIn(List<Long> values) {
            addCriterion("left_coin not in", values, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andLeftCoinBetween(Long value1, Long value2) {
            addCriterion("left_coin between", value1, value2, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andLeftCoinNotBetween(Long value1, Long value2) {
            addCriterion("left_coin not between", value1, value2, "leftCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinIsNull() {
            addCriterion("used_coin is null");
            return (Criteria) this;
        }

        public Criteria andUsedCoinIsNotNull() {
            addCriterion("used_coin is not null");
            return (Criteria) this;
        }

        public Criteria andUsedCoinEqualTo(Long value) {
            addCriterion("used_coin =", value, "usedCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinNotEqualTo(Long value) {
            addCriterion("used_coin <>", value, "usedCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinGreaterThan(Long value) {
            addCriterion("used_coin >", value, "usedCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinGreaterThanOrEqualTo(Long value) {
            addCriterion("used_coin >=", value, "usedCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinLessThan(Long value) {
            addCriterion("used_coin <", value, "usedCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinLessThanOrEqualTo(Long value) {
            addCriterion("used_coin <=", value, "usedCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinIn(List<Long> values) {
            addCriterion("used_coin in", values, "usedCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinNotIn(List<Long> values) {
            addCriterion("used_coin not in", values, "usedCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinBetween(Long value1, Long value2) {
            addCriterion("used_coin between", value1, value2, "usedCoin");
            return (Criteria) this;
        }

        public Criteria andUsedCoinNotBetween(Long value1, Long value2) {
            addCriterion("used_coin not between", value1, value2, "usedCoin");
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