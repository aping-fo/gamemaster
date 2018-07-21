package com.luckygames.wmxz.gamemaster.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayerEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlayerEntityExample() {
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

        public Criteria andPlayeridIsNull() {
            addCriterion("playerId is null");
            return (Criteria) this;
        }

        public Criteria andPlayeridIsNotNull() {
            addCriterion("playerId is not null");
            return (Criteria) this;
        }

        public Criteria andPlayeridEqualTo(Integer value) {
            addCriterion("playerId =", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridNotEqualTo(Integer value) {
            addCriterion("playerId <>", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridGreaterThan(Integer value) {
            addCriterion("playerId >", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("playerId >=", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridLessThan(Integer value) {
            addCriterion("playerId <", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridLessThanOrEqualTo(Integer value) {
            addCriterion("playerId <=", value, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridIn(List<Integer> values) {
            addCriterion("playerId in", values, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridNotIn(List<Integer> values) {
            addCriterion("playerId not in", values, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridBetween(Integer value1, Integer value2) {
            addCriterion("playerId between", value1, value2, "playerid");
            return (Criteria) this;
        }

        public Criteria andPlayeridNotBetween(Integer value1, Integer value2) {
            addCriterion("playerId not between", value1, value2, "playerid");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNull() {
            addCriterion("accName is null");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNotNull() {
            addCriterion("accName is not null");
            return (Criteria) this;
        }

        public Criteria andAccnameEqualTo(String value) {
            addCriterion("accName =", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotEqualTo(String value) {
            addCriterion("accName <>", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThan(String value) {
            addCriterion("accName >", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThanOrEqualTo(String value) {
            addCriterion("accName >=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThan(String value) {
            addCriterion("accName <", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThanOrEqualTo(String value) {
            addCriterion("accName <=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLike(String value) {
            addCriterion("accName like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotLike(String value) {
            addCriterion("accName not like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameIn(List<String> values) {
            addCriterion("accName in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotIn(List<String> values) {
            addCriterion("accName not in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameBetween(String value1, String value2) {
            addCriterion("accName between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotBetween(String value1, String value2) {
            addCriterion("accName not between", value1, value2, "accname");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andVocationIsNull() {
            addCriterion("vocation is null");
            return (Criteria) this;
        }

        public Criteria andVocationIsNotNull() {
            addCriterion("vocation is not null");
            return (Criteria) this;
        }

        public Criteria andVocationEqualTo(Byte value) {
            addCriterion("vocation =", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotEqualTo(Byte value) {
            addCriterion("vocation <>", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationGreaterThan(Byte value) {
            addCriterion("vocation >", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationGreaterThanOrEqualTo(Byte value) {
            addCriterion("vocation >=", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationLessThan(Byte value) {
            addCriterion("vocation <", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationLessThanOrEqualTo(Byte value) {
            addCriterion("vocation <=", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationIn(List<Byte> values) {
            addCriterion("vocation in", values, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotIn(List<Byte> values) {
            addCriterion("vocation not in", values, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationBetween(Byte value1, Byte value2) {
            addCriterion("vocation between", value1, value2, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotBetween(Byte value1, Byte value2) {
            addCriterion("vocation not between", value1, value2, "vocation");
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

        public Criteria andCoinIsNull() {
            addCriterion("coin is null");
            return (Criteria) this;
        }

        public Criteria andCoinIsNotNull() {
            addCriterion("coin is not null");
            return (Criteria) this;
        }

        public Criteria andCoinEqualTo(Integer value) {
            addCriterion("coin =", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotEqualTo(Integer value) {
            addCriterion("coin <>", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThan(Integer value) {
            addCriterion("coin >", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("coin >=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThan(Integer value) {
            addCriterion("coin <", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThanOrEqualTo(Integer value) {
            addCriterion("coin <=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinIn(List<Integer> values) {
            addCriterion("coin in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotIn(List<Integer> values) {
            addCriterion("coin not in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinBetween(Integer value1, Integer value2) {
            addCriterion("coin between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("coin not between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andDiamondIsNull() {
            addCriterion("diamond is null");
            return (Criteria) this;
        }

        public Criteria andDiamondIsNotNull() {
            addCriterion("diamond is not null");
            return (Criteria) this;
        }

        public Criteria andDiamondEqualTo(Integer value) {
            addCriterion("diamond =", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondNotEqualTo(Integer value) {
            addCriterion("diamond <>", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondGreaterThan(Integer value) {
            addCriterion("diamond >", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondGreaterThanOrEqualTo(Integer value) {
            addCriterion("diamond >=", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondLessThan(Integer value) {
            addCriterion("diamond <", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondLessThanOrEqualTo(Integer value) {
            addCriterion("diamond <=", value, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondIn(List<Integer> values) {
            addCriterion("diamond in", values, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondNotIn(List<Integer> values) {
            addCriterion("diamond not in", values, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondBetween(Integer value1, Integer value2) {
            addCriterion("diamond between", value1, value2, "diamond");
            return (Criteria) this;
        }

        public Criteria andDiamondNotBetween(Integer value1, Integer value2) {
            addCriterion("diamond not between", value1, value2, "diamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondIsNull() {
            addCriterion("chargeDiamond is null");
            return (Criteria) this;
        }

        public Criteria andChargediamondIsNotNull() {
            addCriterion("chargeDiamond is not null");
            return (Criteria) this;
        }

        public Criteria andChargediamondEqualTo(Integer value) {
            addCriterion("chargeDiamond =", value, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondNotEqualTo(Integer value) {
            addCriterion("chargeDiamond <>", value, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondGreaterThan(Integer value) {
            addCriterion("chargeDiamond >", value, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeDiamond >=", value, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondLessThan(Integer value) {
            addCriterion("chargeDiamond <", value, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondLessThanOrEqualTo(Integer value) {
            addCriterion("chargeDiamond <=", value, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondIn(List<Integer> values) {
            addCriterion("chargeDiamond in", values, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondNotIn(List<Integer> values) {
            addCriterion("chargeDiamond not in", values, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondBetween(Integer value1, Integer value2) {
            addCriterion("chargeDiamond between", value1, value2, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andChargediamondNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeDiamond not between", value1, value2, "chargediamond");
            return (Criteria) this;
        }

        public Criteria andVipIsNull() {
            addCriterion("vip is null");
            return (Criteria) this;
        }

        public Criteria andVipIsNotNull() {
            addCriterion("vip is not null");
            return (Criteria) this;
        }

        public Criteria andVipEqualTo(Integer value) {
            addCriterion("vip =", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotEqualTo(Integer value) {
            addCriterion("vip <>", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThan(Integer value) {
            addCriterion("vip >", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip >=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThan(Integer value) {
            addCriterion("vip <", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipLessThanOrEqualTo(Integer value) {
            addCriterion("vip <=", value, "vip");
            return (Criteria) this;
        }

        public Criteria andVipIn(List<Integer> values) {
            addCriterion("vip in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotIn(List<Integer> values) {
            addCriterion("vip not in", values, "vip");
            return (Criteria) this;
        }

        public Criteria andVipBetween(Integer value1, Integer value2) {
            addCriterion("vip between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andVipNotBetween(Integer value1, Integer value2) {
            addCriterion("vip not between", value1, value2, "vip");
            return (Criteria) this;
        }

        public Criteria andEnergyIsNull() {
            addCriterion("energy is null");
            return (Criteria) this;
        }

        public Criteria andEnergyIsNotNull() {
            addCriterion("energy is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyEqualTo(Integer value) {
            addCriterion("energy =", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyNotEqualTo(Integer value) {
            addCriterion("energy <>", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyGreaterThan(Integer value) {
            addCriterion("energy >", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyGreaterThanOrEqualTo(Integer value) {
            addCriterion("energy >=", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyLessThan(Integer value) {
            addCriterion("energy <", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyLessThanOrEqualTo(Integer value) {
            addCriterion("energy <=", value, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyIn(List<Integer> values) {
            addCriterion("energy in", values, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyNotIn(List<Integer> values) {
            addCriterion("energy not in", values, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyBetween(Integer value1, Integer value2) {
            addCriterion("energy between", value1, value2, "energy");
            return (Criteria) this;
        }

        public Criteria andEnergyNotBetween(Integer value1, Integer value2) {
            addCriterion("energy not between", value1, value2, "energy");
            return (Criteria) this;
        }

        public Criteria andServeridIsNull() {
            addCriterion("serverId is null");
            return (Criteria) this;
        }

        public Criteria andServeridIsNotNull() {
            addCriterion("serverId is not null");
            return (Criteria) this;
        }

        public Criteria andServeridEqualTo(Short value) {
            addCriterion("serverId =", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridNotEqualTo(Short value) {
            addCriterion("serverId <>", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridGreaterThan(Short value) {
            addCriterion("serverId >", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridGreaterThanOrEqualTo(Short value) {
            addCriterion("serverId >=", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridLessThan(Short value) {
            addCriterion("serverId <", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridLessThanOrEqualTo(Short value) {
            addCriterion("serverId <=", value, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridIn(List<Short> values) {
            addCriterion("serverId in", values, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridNotIn(List<Short> values) {
            addCriterion("serverId not in", values, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridBetween(Short value1, Short value2) {
            addCriterion("serverId between", value1, value2, "serverid");
            return (Criteria) this;
        }

        public Criteria andServeridNotBetween(Short value1, Short value2) {
            addCriterion("serverId not between", value1, value2, "serverid");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regTime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Date value) {
            addCriterion("regTime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Date value) {
            addCriterion("regTime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Date value) {
            addCriterion("regTime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("regTime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Date value) {
            addCriterion("regTime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("regTime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Date> values) {
            addCriterion("regTime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Date> values) {
            addCriterion("regTime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Date value1, Date value2) {
            addCriterion("regTime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("regTime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("lastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("lastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("lastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("lastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("lastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("lastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("lastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("lastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("lastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("lastLoginTime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeIsNull() {
            addCriterion("lastLogoutTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeIsNotNull() {
            addCriterion("lastLogoutTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeEqualTo(Date value) {
            addCriterion("lastLogoutTime =", value, "lastlogouttime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeNotEqualTo(Date value) {
            addCriterion("lastLogoutTime <>", value, "lastlogouttime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeGreaterThan(Date value) {
            addCriterion("lastLogoutTime >", value, "lastlogouttime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLogoutTime >=", value, "lastlogouttime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeLessThan(Date value) {
            addCriterion("lastLogoutTime <", value, "lastlogouttime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeLessThanOrEqualTo(Date value) {
            addCriterion("lastLogoutTime <=", value, "lastlogouttime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeIn(List<Date> values) {
            addCriterion("lastLogoutTime in", values, "lastlogouttime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeNotIn(List<Date> values) {
            addCriterion("lastLogoutTime not in", values, "lastlogouttime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeBetween(Date value1, Date value2) {
            addCriterion("lastLogoutTime between", value1, value2, "lastlogouttime");
            return (Criteria) this;
        }

        public Criteria andLastlogouttimeNotBetween(Date value1, Date value2) {
            addCriterion("lastLogoutTime not between", value1, value2, "lastlogouttime");
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

        public Criteria andSceneidIsNull() {
            addCriterion("sceneId is null");
            return (Criteria) this;
        }

        public Criteria andSceneidIsNotNull() {
            addCriterion("sceneId is not null");
            return (Criteria) this;
        }

        public Criteria andSceneidEqualTo(Integer value) {
            addCriterion("sceneId =", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotEqualTo(Integer value) {
            addCriterion("sceneId <>", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThan(Integer value) {
            addCriterion("sceneId >", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sceneId >=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThan(Integer value) {
            addCriterion("sceneId <", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThanOrEqualTo(Integer value) {
            addCriterion("sceneId <=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidIn(List<Integer> values) {
            addCriterion("sceneId in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotIn(List<Integer> values) {
            addCriterion("sceneId not in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidBetween(Integer value1, Integer value2) {
            addCriterion("sceneId between", value1, value2, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotBetween(Integer value1, Integer value2) {
            addCriterion("sceneId not between", value1, value2, "sceneid");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(Float value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(Float value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(Float value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(Float value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(Float value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(Float value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<Float> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<Float> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(Float value1, Float value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(Float value1, Float value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(Float value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(Float value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(Float value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(Float value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(Float value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(Float value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<Float> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<Float> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(Float value1, Float value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(Float value1, Float value2) {
            addCriterion("y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andLastsceneidIsNull() {
            addCriterion("lastSceneId is null");
            return (Criteria) this;
        }

        public Criteria andLastsceneidIsNotNull() {
            addCriterion("lastSceneId is not null");
            return (Criteria) this;
        }

        public Criteria andLastsceneidEqualTo(Integer value) {
            addCriterion("lastSceneId =", value, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLastsceneidNotEqualTo(Integer value) {
            addCriterion("lastSceneId <>", value, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLastsceneidGreaterThan(Integer value) {
            addCriterion("lastSceneId >", value, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLastsceneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastSceneId >=", value, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLastsceneidLessThan(Integer value) {
            addCriterion("lastSceneId <", value, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLastsceneidLessThanOrEqualTo(Integer value) {
            addCriterion("lastSceneId <=", value, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLastsceneidIn(List<Integer> values) {
            addCriterion("lastSceneId in", values, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLastsceneidNotIn(List<Integer> values) {
            addCriterion("lastSceneId not in", values, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLastsceneidBetween(Integer value1, Integer value2) {
            addCriterion("lastSceneId between", value1, value2, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLastsceneidNotBetween(Integer value1, Integer value2) {
            addCriterion("lastSceneId not between", value1, value2, "lastsceneid");
            return (Criteria) this;
        }

        public Criteria andLevIsNull() {
            addCriterion("lev is null");
            return (Criteria) this;
        }

        public Criteria andLevIsNotNull() {
            addCriterion("lev is not null");
            return (Criteria) this;
        }

        public Criteria andLevEqualTo(Short value) {
            addCriterion("lev =", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotEqualTo(Short value) {
            addCriterion("lev <>", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThan(Short value) {
            addCriterion("lev >", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThanOrEqualTo(Short value) {
            addCriterion("lev >=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThan(Short value) {
            addCriterion("lev <", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThanOrEqualTo(Short value) {
            addCriterion("lev <=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevIn(List<Short> values) {
            addCriterion("lev in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotIn(List<Short> values) {
            addCriterion("lev not in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevBetween(Short value1, Short value2) {
            addCriterion("lev between", value1, value2, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotBetween(Short value1, Short value2) {
            addCriterion("lev not between", value1, value2, "lev");
            return (Criteria) this;
        }

        public Criteria andPhysicattackIsNull() {
            addCriterion("physicAttack is null");
            return (Criteria) this;
        }

        public Criteria andPhysicattackIsNotNull() {
            addCriterion("physicAttack is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicattackEqualTo(Integer value) {
            addCriterion("physicAttack =", value, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicattackNotEqualTo(Integer value) {
            addCriterion("physicAttack <>", value, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicattackGreaterThan(Integer value) {
            addCriterion("physicAttack >", value, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicattackGreaterThanOrEqualTo(Integer value) {
            addCriterion("physicAttack >=", value, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicattackLessThan(Integer value) {
            addCriterion("physicAttack <", value, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicattackLessThanOrEqualTo(Integer value) {
            addCriterion("physicAttack <=", value, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicattackIn(List<Integer> values) {
            addCriterion("physicAttack in", values, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicattackNotIn(List<Integer> values) {
            addCriterion("physicAttack not in", values, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicattackBetween(Integer value1, Integer value2) {
            addCriterion("physicAttack between", value1, value2, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicattackNotBetween(Integer value1, Integer value2) {
            addCriterion("physicAttack not between", value1, value2, "physicattack");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseIsNull() {
            addCriterion("physicDefense is null");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseIsNotNull() {
            addCriterion("physicDefense is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseEqualTo(Integer value) {
            addCriterion("physicDefense =", value, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseNotEqualTo(Integer value) {
            addCriterion("physicDefense <>", value, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseGreaterThan(Integer value) {
            addCriterion("physicDefense >", value, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("physicDefense >=", value, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseLessThan(Integer value) {
            addCriterion("physicDefense <", value, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseLessThanOrEqualTo(Integer value) {
            addCriterion("physicDefense <=", value, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseIn(List<Integer> values) {
            addCriterion("physicDefense in", values, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseNotIn(List<Integer> values) {
            addCriterion("physicDefense not in", values, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseBetween(Integer value1, Integer value2) {
            addCriterion("physicDefense between", value1, value2, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andPhysicdefenseNotBetween(Integer value1, Integer value2) {
            addCriterion("physicDefense not between", value1, value2, "physicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicattackIsNull() {
            addCriterion("magicAttack is null");
            return (Criteria) this;
        }

        public Criteria andMagicattackIsNotNull() {
            addCriterion("magicAttack is not null");
            return (Criteria) this;
        }

        public Criteria andMagicattackEqualTo(Integer value) {
            addCriterion("magicAttack =", value, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicattackNotEqualTo(Integer value) {
            addCriterion("magicAttack <>", value, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicattackGreaterThan(Integer value) {
            addCriterion("magicAttack >", value, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicattackGreaterThanOrEqualTo(Integer value) {
            addCriterion("magicAttack >=", value, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicattackLessThan(Integer value) {
            addCriterion("magicAttack <", value, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicattackLessThanOrEqualTo(Integer value) {
            addCriterion("magicAttack <=", value, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicattackIn(List<Integer> values) {
            addCriterion("magicAttack in", values, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicattackNotIn(List<Integer> values) {
            addCriterion("magicAttack not in", values, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicattackBetween(Integer value1, Integer value2) {
            addCriterion("magicAttack between", value1, value2, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicattackNotBetween(Integer value1, Integer value2) {
            addCriterion("magicAttack not between", value1, value2, "magicattack");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseIsNull() {
            addCriterion("magicDefense is null");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseIsNotNull() {
            addCriterion("magicDefense is not null");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseEqualTo(Integer value) {
            addCriterion("magicDefense =", value, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseNotEqualTo(Integer value) {
            addCriterion("magicDefense <>", value, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseGreaterThan(Integer value) {
            addCriterion("magicDefense >", value, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("magicDefense >=", value, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseLessThan(Integer value) {
            addCriterion("magicDefense <", value, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseLessThanOrEqualTo(Integer value) {
            addCriterion("magicDefense <=", value, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseIn(List<Integer> values) {
            addCriterion("magicDefense in", values, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseNotIn(List<Integer> values) {
            addCriterion("magicDefense not in", values, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseBetween(Integer value1, Integer value2) {
            addCriterion("magicDefense between", value1, value2, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andMagicdefenseNotBetween(Integer value1, Integer value2) {
            addCriterion("magicDefense not between", value1, value2, "magicdefense");
            return (Criteria) this;
        }

        public Criteria andCritIsNull() {
            addCriterion("crit is null");
            return (Criteria) this;
        }

        public Criteria andCritIsNotNull() {
            addCriterion("crit is not null");
            return (Criteria) this;
        }

        public Criteria andCritEqualTo(Integer value) {
            addCriterion("crit =", value, "crit");
            return (Criteria) this;
        }

        public Criteria andCritNotEqualTo(Integer value) {
            addCriterion("crit <>", value, "crit");
            return (Criteria) this;
        }

        public Criteria andCritGreaterThan(Integer value) {
            addCriterion("crit >", value, "crit");
            return (Criteria) this;
        }

        public Criteria andCritGreaterThanOrEqualTo(Integer value) {
            addCriterion("crit >=", value, "crit");
            return (Criteria) this;
        }

        public Criteria andCritLessThan(Integer value) {
            addCriterion("crit <", value, "crit");
            return (Criteria) this;
        }

        public Criteria andCritLessThanOrEqualTo(Integer value) {
            addCriterion("crit <=", value, "crit");
            return (Criteria) this;
        }

        public Criteria andCritIn(List<Integer> values) {
            addCriterion("crit in", values, "crit");
            return (Criteria) this;
        }

        public Criteria andCritNotIn(List<Integer> values) {
            addCriterion("crit not in", values, "crit");
            return (Criteria) this;
        }

        public Criteria andCritBetween(Integer value1, Integer value2) {
            addCriterion("crit between", value1, value2, "crit");
            return (Criteria) this;
        }

        public Criteria andCritNotBetween(Integer value1, Integer value2) {
            addCriterion("crit not between", value1, value2, "crit");
            return (Criteria) this;
        }

        public Criteria andCritdefenseIsNull() {
            addCriterion("critDefense is null");
            return (Criteria) this;
        }

        public Criteria andCritdefenseIsNotNull() {
            addCriterion("critDefense is not null");
            return (Criteria) this;
        }

        public Criteria andCritdefenseEqualTo(Integer value) {
            addCriterion("critDefense =", value, "critdefense");
            return (Criteria) this;
        }

        public Criteria andCritdefenseNotEqualTo(Integer value) {
            addCriterion("critDefense <>", value, "critdefense");
            return (Criteria) this;
        }

        public Criteria andCritdefenseGreaterThan(Integer value) {
            addCriterion("critDefense >", value, "critdefense");
            return (Criteria) this;
        }

        public Criteria andCritdefenseGreaterThanOrEqualTo(Integer value) {
            addCriterion("critDefense >=", value, "critdefense");
            return (Criteria) this;
        }

        public Criteria andCritdefenseLessThan(Integer value) {
            addCriterion("critDefense <", value, "critdefense");
            return (Criteria) this;
        }

        public Criteria andCritdefenseLessThanOrEqualTo(Integer value) {
            addCriterion("critDefense <=", value, "critdefense");
            return (Criteria) this;
        }

        public Criteria andCritdefenseIn(List<Integer> values) {
            addCriterion("critDefense in", values, "critdefense");
            return (Criteria) this;
        }

        public Criteria andCritdefenseNotIn(List<Integer> values) {
            addCriterion("critDefense not in", values, "critdefense");
            return (Criteria) this;
        }

        public Criteria andCritdefenseBetween(Integer value1, Integer value2) {
            addCriterion("critDefense between", value1, value2, "critdefense");
            return (Criteria) this;
        }

        public Criteria andCritdefenseNotBetween(Integer value1, Integer value2) {
            addCriterion("critDefense not between", value1, value2, "critdefense");
            return (Criteria) this;
        }

        public Criteria andMpIsNull() {
            addCriterion("mp is null");
            return (Criteria) this;
        }

        public Criteria andMpIsNotNull() {
            addCriterion("mp is not null");
            return (Criteria) this;
        }

        public Criteria andMpEqualTo(Integer value) {
            addCriterion("mp =", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotEqualTo(Integer value) {
            addCriterion("mp <>", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThan(Integer value) {
            addCriterion("mp >", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpGreaterThanOrEqualTo(Integer value) {
            addCriterion("mp >=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThan(Integer value) {
            addCriterion("mp <", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpLessThanOrEqualTo(Integer value) {
            addCriterion("mp <=", value, "mp");
            return (Criteria) this;
        }

        public Criteria andMpIn(List<Integer> values) {
            addCriterion("mp in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotIn(List<Integer> values) {
            addCriterion("mp not in", values, "mp");
            return (Criteria) this;
        }

        public Criteria andMpBetween(Integer value1, Integer value2) {
            addCriterion("mp between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andMpNotBetween(Integer value1, Integer value2) {
            addCriterion("mp not between", value1, value2, "mp");
            return (Criteria) this;
        }

        public Criteria andCurmpIsNull() {
            addCriterion("curMp is null");
            return (Criteria) this;
        }

        public Criteria andCurmpIsNotNull() {
            addCriterion("curMp is not null");
            return (Criteria) this;
        }

        public Criteria andCurmpEqualTo(Integer value) {
            addCriterion("curMp =", value, "curmp");
            return (Criteria) this;
        }

        public Criteria andCurmpNotEqualTo(Integer value) {
            addCriterion("curMp <>", value, "curmp");
            return (Criteria) this;
        }

        public Criteria andCurmpGreaterThan(Integer value) {
            addCriterion("curMp >", value, "curmp");
            return (Criteria) this;
        }

        public Criteria andCurmpGreaterThanOrEqualTo(Integer value) {
            addCriterion("curMp >=", value, "curmp");
            return (Criteria) this;
        }

        public Criteria andCurmpLessThan(Integer value) {
            addCriterion("curMp <", value, "curmp");
            return (Criteria) this;
        }

        public Criteria andCurmpLessThanOrEqualTo(Integer value) {
            addCriterion("curMp <=", value, "curmp");
            return (Criteria) this;
        }

        public Criteria andCurmpIn(List<Integer> values) {
            addCriterion("curMp in", values, "curmp");
            return (Criteria) this;
        }

        public Criteria andCurmpNotIn(List<Integer> values) {
            addCriterion("curMp not in", values, "curmp");
            return (Criteria) this;
        }

        public Criteria andCurmpBetween(Integer value1, Integer value2) {
            addCriterion("curMp between", value1, value2, "curmp");
            return (Criteria) this;
        }

        public Criteria andCurmpNotBetween(Integer value1, Integer value2) {
            addCriterion("curMp not between", value1, value2, "curmp");
            return (Criteria) this;
        }

        public Criteria andHpIsNull() {
            addCriterion("hp is null");
            return (Criteria) this;
        }

        public Criteria andHpIsNotNull() {
            addCriterion("hp is not null");
            return (Criteria) this;
        }

        public Criteria andHpEqualTo(Integer value) {
            addCriterion("hp =", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotEqualTo(Integer value) {
            addCriterion("hp <>", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThan(Integer value) {
            addCriterion("hp >", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpGreaterThanOrEqualTo(Integer value) {
            addCriterion("hp >=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThan(Integer value) {
            addCriterion("hp <", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpLessThanOrEqualTo(Integer value) {
            addCriterion("hp <=", value, "hp");
            return (Criteria) this;
        }

        public Criteria andHpIn(List<Integer> values) {
            addCriterion("hp in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotIn(List<Integer> values) {
            addCriterion("hp not in", values, "hp");
            return (Criteria) this;
        }

        public Criteria andHpBetween(Integer value1, Integer value2) {
            addCriterion("hp between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andHpNotBetween(Integer value1, Integer value2) {
            addCriterion("hp not between", value1, value2, "hp");
            return (Criteria) this;
        }

        public Criteria andCurhpIsNull() {
            addCriterion("curHp is null");
            return (Criteria) this;
        }

        public Criteria andCurhpIsNotNull() {
            addCriterion("curHp is not null");
            return (Criteria) this;
        }

        public Criteria andCurhpEqualTo(Integer value) {
            addCriterion("curHp =", value, "curhp");
            return (Criteria) this;
        }

        public Criteria andCurhpNotEqualTo(Integer value) {
            addCriterion("curHp <>", value, "curhp");
            return (Criteria) this;
        }

        public Criteria andCurhpGreaterThan(Integer value) {
            addCriterion("curHp >", value, "curhp");
            return (Criteria) this;
        }

        public Criteria andCurhpGreaterThanOrEqualTo(Integer value) {
            addCriterion("curHp >=", value, "curhp");
            return (Criteria) this;
        }

        public Criteria andCurhpLessThan(Integer value) {
            addCriterion("curHp <", value, "curhp");
            return (Criteria) this;
        }

        public Criteria andCurhpLessThanOrEqualTo(Integer value) {
            addCriterion("curHp <=", value, "curhp");
            return (Criteria) this;
        }

        public Criteria andCurhpIn(List<Integer> values) {
            addCriterion("curHp in", values, "curhp");
            return (Criteria) this;
        }

        public Criteria andCurhpNotIn(List<Integer> values) {
            addCriterion("curHp not in", values, "curhp");
            return (Criteria) this;
        }

        public Criteria andCurhpBetween(Integer value1, Integer value2) {
            addCriterion("curHp between", value1, value2, "curhp");
            return (Criteria) this;
        }

        public Criteria andCurhpNotBetween(Integer value1, Integer value2) {
            addCriterion("curHp not between", value1, value2, "curhp");
            return (Criteria) this;
        }

        public Criteria andFightstrengthIsNull() {
            addCriterion("fightStrength is null");
            return (Criteria) this;
        }

        public Criteria andFightstrengthIsNotNull() {
            addCriterion("fightStrength is not null");
            return (Criteria) this;
        }

        public Criteria andFightstrengthEqualTo(Integer value) {
            addCriterion("fightStrength =", value, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andFightstrengthNotEqualTo(Integer value) {
            addCriterion("fightStrength <>", value, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andFightstrengthGreaterThan(Integer value) {
            addCriterion("fightStrength >", value, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andFightstrengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("fightStrength >=", value, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andFightstrengthLessThan(Integer value) {
            addCriterion("fightStrength <", value, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andFightstrengthLessThanOrEqualTo(Integer value) {
            addCriterion("fightStrength <=", value, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andFightstrengthIn(List<Integer> values) {
            addCriterion("fightStrength in", values, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andFightstrengthNotIn(List<Integer> values) {
            addCriterion("fightStrength not in", values, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andFightstrengthBetween(Integer value1, Integer value2) {
            addCriterion("fightStrength between", value1, value2, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andFightstrengthNotBetween(Integer value1, Integer value2) {
            addCriterion("fightStrength not between", value1, value2, "fightstrength");
            return (Criteria) this;
        }

        public Criteria andZIsNull() {
            addCriterion("z is null");
            return (Criteria) this;
        }

        public Criteria andZIsNotNull() {
            addCriterion("z is not null");
            return (Criteria) this;
        }

        public Criteria andZEqualTo(Float value) {
            addCriterion("z =", value, "z");
            return (Criteria) this;
        }

        public Criteria andZNotEqualTo(Float value) {
            addCriterion("z <>", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThan(Float value) {
            addCriterion("z >", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThanOrEqualTo(Float value) {
            addCriterion("z >=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThan(Float value) {
            addCriterion("z <", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThanOrEqualTo(Float value) {
            addCriterion("z <=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZIn(List<Float> values) {
            addCriterion("z in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZNotIn(List<Float> values) {
            addCriterion("z not in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZBetween(Float value1, Float value2) {
            addCriterion("z between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andZNotBetween(Float value1, Float value2) {
            addCriterion("z not between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andFashionidIsNull() {
            addCriterion("fashionId is null");
            return (Criteria) this;
        }

        public Criteria andFashionidIsNotNull() {
            addCriterion("fashionId is not null");
            return (Criteria) this;
        }

        public Criteria andFashionidEqualTo(Integer value) {
            addCriterion("fashionId =", value, "fashionid");
            return (Criteria) this;
        }

        public Criteria andFashionidNotEqualTo(Integer value) {
            addCriterion("fashionId <>", value, "fashionid");
            return (Criteria) this;
        }

        public Criteria andFashionidGreaterThan(Integer value) {
            addCriterion("fashionId >", value, "fashionid");
            return (Criteria) this;
        }

        public Criteria andFashionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fashionId >=", value, "fashionid");
            return (Criteria) this;
        }

        public Criteria andFashionidLessThan(Integer value) {
            addCriterion("fashionId <", value, "fashionid");
            return (Criteria) this;
        }

        public Criteria andFashionidLessThanOrEqualTo(Integer value) {
            addCriterion("fashionId <=", value, "fashionid");
            return (Criteria) this;
        }

        public Criteria andFashionidIn(List<Integer> values) {
            addCriterion("fashionId in", values, "fashionid");
            return (Criteria) this;
        }

        public Criteria andFashionidNotIn(List<Integer> values) {
            addCriterion("fashionId not in", values, "fashionid");
            return (Criteria) this;
        }

        public Criteria andFashionidBetween(Integer value1, Integer value2) {
            addCriterion("fashionId between", value1, value2, "fashionid");
            return (Criteria) this;
        }

        public Criteria andFashionidNotBetween(Integer value1, Integer value2) {
            addCriterion("fashionId not between", value1, value2, "fashionid");
            return (Criteria) this;
        }

        public Criteria andGangidIsNull() {
            addCriterion("gangId is null");
            return (Criteria) this;
        }

        public Criteria andGangidIsNotNull() {
            addCriterion("gangId is not null");
            return (Criteria) this;
        }

        public Criteria andGangidEqualTo(Integer value) {
            addCriterion("gangId =", value, "gangid");
            return (Criteria) this;
        }

        public Criteria andGangidNotEqualTo(Integer value) {
            addCriterion("gangId <>", value, "gangid");
            return (Criteria) this;
        }

        public Criteria andGangidGreaterThan(Integer value) {
            addCriterion("gangId >", value, "gangid");
            return (Criteria) this;
        }

        public Criteria andGangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gangId >=", value, "gangid");
            return (Criteria) this;
        }

        public Criteria andGangidLessThan(Integer value) {
            addCriterion("gangId <", value, "gangid");
            return (Criteria) this;
        }

        public Criteria andGangidLessThanOrEqualTo(Integer value) {
            addCriterion("gangId <=", value, "gangid");
            return (Criteria) this;
        }

        public Criteria andGangidIn(List<Integer> values) {
            addCriterion("gangId in", values, "gangid");
            return (Criteria) this;
        }

        public Criteria andGangidNotIn(List<Integer> values) {
            addCriterion("gangId not in", values, "gangid");
            return (Criteria) this;
        }

        public Criteria andGangidBetween(Integer value1, Integer value2) {
            addCriterion("gangId between", value1, value2, "gangid");
            return (Criteria) this;
        }

        public Criteria andGangidNotBetween(Integer value1, Integer value2) {
            addCriterion("gangId not between", value1, value2, "gangid");
            return (Criteria) this;
        }

        public Criteria andTotalcoinIsNull() {
            addCriterion("totalCoin is null");
            return (Criteria) this;
        }

        public Criteria andTotalcoinIsNotNull() {
            addCriterion("totalCoin is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcoinEqualTo(Integer value) {
            addCriterion("totalCoin =", value, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalcoinNotEqualTo(Integer value) {
            addCriterion("totalCoin <>", value, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalcoinGreaterThan(Integer value) {
            addCriterion("totalCoin >", value, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalcoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalCoin >=", value, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalcoinLessThan(Integer value) {
            addCriterion("totalCoin <", value, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalcoinLessThanOrEqualTo(Integer value) {
            addCriterion("totalCoin <=", value, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalcoinIn(List<Integer> values) {
            addCriterion("totalCoin in", values, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalcoinNotIn(List<Integer> values) {
            addCriterion("totalCoin not in", values, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalcoinBetween(Integer value1, Integer value2) {
            addCriterion("totalCoin between", value1, value2, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalcoinNotBetween(Integer value1, Integer value2) {
            addCriterion("totalCoin not between", value1, value2, "totalcoin");
            return (Criteria) this;
        }

        public Criteria andTotalreputationIsNull() {
            addCriterion("totalReputation is null");
            return (Criteria) this;
        }

        public Criteria andTotalreputationIsNotNull() {
            addCriterion("totalReputation is not null");
            return (Criteria) this;
        }

        public Criteria andTotalreputationEqualTo(Integer value) {
            addCriterion("totalReputation =", value, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andTotalreputationNotEqualTo(Integer value) {
            addCriterion("totalReputation <>", value, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andTotalreputationGreaterThan(Integer value) {
            addCriterion("totalReputation >", value, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andTotalreputationGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalReputation >=", value, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andTotalreputationLessThan(Integer value) {
            addCriterion("totalReputation <", value, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andTotalreputationLessThanOrEqualTo(Integer value) {
            addCriterion("totalReputation <=", value, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andTotalreputationIn(List<Integer> values) {
            addCriterion("totalReputation in", values, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andTotalreputationNotIn(List<Integer> values) {
            addCriterion("totalReputation not in", values, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andTotalreputationBetween(Integer value1, Integer value2) {
            addCriterion("totalReputation between", value1, value2, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andTotalreputationNotBetween(Integer value1, Integer value2) {
            addCriterion("totalReputation not between", value1, value2, "totalreputation");
            return (Criteria) this;
        }

        public Criteria andWeaponidIsNull() {
            addCriterion("weaponId is null");
            return (Criteria) this;
        }

        public Criteria andWeaponidIsNotNull() {
            addCriterion("weaponId is not null");
            return (Criteria) this;
        }

        public Criteria andWeaponidEqualTo(Integer value) {
            addCriterion("weaponId =", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidNotEqualTo(Integer value) {
            addCriterion("weaponId <>", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidGreaterThan(Integer value) {
            addCriterion("weaponId >", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidGreaterThanOrEqualTo(Integer value) {
            addCriterion("weaponId >=", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidLessThan(Integer value) {
            addCriterion("weaponId <", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidLessThanOrEqualTo(Integer value) {
            addCriterion("weaponId <=", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidIn(List<Integer> values) {
            addCriterion("weaponId in", values, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidNotIn(List<Integer> values) {
            addCriterion("weaponId not in", values, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidBetween(Integer value1, Integer value2) {
            addCriterion("weaponId between", value1, value2, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidNotBetween(Integer value1, Integer value2) {
            addCriterion("weaponId not between", value1, value2, "weaponid");
            return (Criteria) this;
        }

        public Criteria andContributeIsNull() {
            addCriterion("contribute is null");
            return (Criteria) this;
        }

        public Criteria andContributeIsNotNull() {
            addCriterion("contribute is not null");
            return (Criteria) this;
        }

        public Criteria andContributeEqualTo(Integer value) {
            addCriterion("contribute =", value, "contribute");
            return (Criteria) this;
        }

        public Criteria andContributeNotEqualTo(Integer value) {
            addCriterion("contribute <>", value, "contribute");
            return (Criteria) this;
        }

        public Criteria andContributeGreaterThan(Integer value) {
            addCriterion("contribute >", value, "contribute");
            return (Criteria) this;
        }

        public Criteria andContributeGreaterThanOrEqualTo(Integer value) {
            addCriterion("contribute >=", value, "contribute");
            return (Criteria) this;
        }

        public Criteria andContributeLessThan(Integer value) {
            addCriterion("contribute <", value, "contribute");
            return (Criteria) this;
        }

        public Criteria andContributeLessThanOrEqualTo(Integer value) {
            addCriterion("contribute <=", value, "contribute");
            return (Criteria) this;
        }

        public Criteria andContributeIn(List<Integer> values) {
            addCriterion("contribute in", values, "contribute");
            return (Criteria) this;
        }

        public Criteria andContributeNotIn(List<Integer> values) {
            addCriterion("contribute not in", values, "contribute");
            return (Criteria) this;
        }

        public Criteria andContributeBetween(Integer value1, Integer value2) {
            addCriterion("contribute between", value1, value2, "contribute");
            return (Criteria) this;
        }

        public Criteria andContributeNotBetween(Integer value1, Integer value2) {
            addCriterion("contribute not between", value1, value2, "contribute");
            return (Criteria) this;
        }

        public Criteria andEnergytimeIsNull() {
            addCriterion("energyTime is null");
            return (Criteria) this;
        }

        public Criteria andEnergytimeIsNotNull() {
            addCriterion("energyTime is not null");
            return (Criteria) this;
        }

        public Criteria andEnergytimeEqualTo(Long value) {
            addCriterion("energyTime =", value, "energytime");
            return (Criteria) this;
        }

        public Criteria andEnergytimeNotEqualTo(Long value) {
            addCriterion("energyTime <>", value, "energytime");
            return (Criteria) this;
        }

        public Criteria andEnergytimeGreaterThan(Long value) {
            addCriterion("energyTime >", value, "energytime");
            return (Criteria) this;
        }

        public Criteria andEnergytimeGreaterThanOrEqualTo(Long value) {
            addCriterion("energyTime >=", value, "energytime");
            return (Criteria) this;
        }

        public Criteria andEnergytimeLessThan(Long value) {
            addCriterion("energyTime <", value, "energytime");
            return (Criteria) this;
        }

        public Criteria andEnergytimeLessThanOrEqualTo(Long value) {
            addCriterion("energyTime <=", value, "energytime");
            return (Criteria) this;
        }

        public Criteria andEnergytimeIn(List<Long> values) {
            addCriterion("energyTime in", values, "energytime");
            return (Criteria) this;
        }

        public Criteria andEnergytimeNotIn(List<Long> values) {
            addCriterion("energyTime not in", values, "energytime");
            return (Criteria) this;
        }

        public Criteria andEnergytimeBetween(Long value1, Long value2) {
            addCriterion("energyTime between", value1, value2, "energytime");
            return (Criteria) this;
        }

        public Criteria andEnergytimeNotBetween(Long value1, Long value2) {
            addCriterion("energyTime not between", value1, value2, "energytime");
            return (Criteria) this;
        }

        public Criteria andReputationIsNull() {
            addCriterion("reputation is null");
            return (Criteria) this;
        }

        public Criteria andReputationIsNotNull() {
            addCriterion("reputation is not null");
            return (Criteria) this;
        }

        public Criteria andReputationEqualTo(Integer value) {
            addCriterion("reputation =", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotEqualTo(Integer value) {
            addCriterion("reputation <>", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThan(Integer value) {
            addCriterion("reputation >", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThanOrEqualTo(Integer value) {
            addCriterion("reputation >=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThan(Integer value) {
            addCriterion("reputation <", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThanOrEqualTo(Integer value) {
            addCriterion("reputation <=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationIn(List<Integer> values) {
            addCriterion("reputation in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotIn(List<Integer> values) {
            addCriterion("reputation not in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationBetween(Integer value1, Integer value2) {
            addCriterion("reputation between", value1, value2, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotBetween(Integer value1, Integer value2) {
            addCriterion("reputation not between", value1, value2, "reputation");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondIsNull() {
            addCriterion("totalDiamond is null");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondIsNotNull() {
            addCriterion("totalDiamond is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondEqualTo(Integer value) {
            addCriterion("totalDiamond =", value, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondNotEqualTo(Integer value) {
            addCriterion("totalDiamond <>", value, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondGreaterThan(Integer value) {
            addCriterion("totalDiamond >", value, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalDiamond >=", value, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondLessThan(Integer value) {
            addCriterion("totalDiamond <", value, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondLessThanOrEqualTo(Integer value) {
            addCriterion("totalDiamond <=", value, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondIn(List<Integer> values) {
            addCriterion("totalDiamond in", values, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondNotIn(List<Integer> values) {
            addCriterion("totalDiamond not in", values, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondBetween(Integer value1, Integer value2) {
            addCriterion("totalDiamond between", value1, value2, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andTotaldiamondNotBetween(Integer value1, Integer value2) {
            addCriterion("totalDiamond not between", value1, value2, "totaldiamond");
            return (Criteria) this;
        }

        public Criteria andSoulIsNull() {
            addCriterion("soul is null");
            return (Criteria) this;
        }

        public Criteria andSoulIsNotNull() {
            addCriterion("soul is not null");
            return (Criteria) this;
        }

        public Criteria andSoulEqualTo(Integer value) {
            addCriterion("soul =", value, "soul");
            return (Criteria) this;
        }

        public Criteria andSoulNotEqualTo(Integer value) {
            addCriterion("soul <>", value, "soul");
            return (Criteria) this;
        }

        public Criteria andSoulGreaterThan(Integer value) {
            addCriterion("soul >", value, "soul");
            return (Criteria) this;
        }

        public Criteria andSoulGreaterThanOrEqualTo(Integer value) {
            addCriterion("soul >=", value, "soul");
            return (Criteria) this;
        }

        public Criteria andSoulLessThan(Integer value) {
            addCriterion("soul <", value, "soul");
            return (Criteria) this;
        }

        public Criteria andSoulLessThanOrEqualTo(Integer value) {
            addCriterion("soul <=", value, "soul");
            return (Criteria) this;
        }

        public Criteria andSoulIn(List<Integer> values) {
            addCriterion("soul in", values, "soul");
            return (Criteria) this;
        }

        public Criteria andSoulNotIn(List<Integer> values) {
            addCriterion("soul not in", values, "soul");
            return (Criteria) this;
        }

        public Criteria andSoulBetween(Integer value1, Integer value2) {
            addCriterion("soul between", value1, value2, "soul");
            return (Criteria) this;
        }

        public Criteria andSoulNotBetween(Integer value1, Integer value2) {
            addCriterion("soul not between", value1, value2, "soul");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreIsNull() {
            addCriterion("lotteryScore is null");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreIsNotNull() {
            addCriterion("lotteryScore is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreEqualTo(Integer value) {
            addCriterion("lotteryScore =", value, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreNotEqualTo(Integer value) {
            addCriterion("lotteryScore <>", value, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreGreaterThan(Integer value) {
            addCriterion("lotteryScore >", value, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("lotteryScore >=", value, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreLessThan(Integer value) {
            addCriterion("lotteryScore <", value, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreLessThanOrEqualTo(Integer value) {
            addCriterion("lotteryScore <=", value, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreIn(List<Integer> values) {
            addCriterion("lotteryScore in", values, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreNotIn(List<Integer> values) {
            addCriterion("lotteryScore not in", values, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreBetween(Integer value1, Integer value2) {
            addCriterion("lotteryScore between", value1, value2, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andLotteryscoreNotBetween(Integer value1, Integer value2) {
            addCriterion("lotteryScore not between", value1, value2, "lotteryscore");
            return (Criteria) this;
        }

        public Criteria andFreediamondIsNull() {
            addCriterion("freeDiamond is null");
            return (Criteria) this;
        }

        public Criteria andFreediamondIsNotNull() {
            addCriterion("freeDiamond is not null");
            return (Criteria) this;
        }

        public Criteria andFreediamondEqualTo(Integer value) {
            addCriterion("freeDiamond =", value, "freediamond");
            return (Criteria) this;
        }

        public Criteria andFreediamondNotEqualTo(Integer value) {
            addCriterion("freeDiamond <>", value, "freediamond");
            return (Criteria) this;
        }

        public Criteria andFreediamondGreaterThan(Integer value) {
            addCriterion("freeDiamond >", value, "freediamond");
            return (Criteria) this;
        }

        public Criteria andFreediamondGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeDiamond >=", value, "freediamond");
            return (Criteria) this;
        }

        public Criteria andFreediamondLessThan(Integer value) {
            addCriterion("freeDiamond <", value, "freediamond");
            return (Criteria) this;
        }

        public Criteria andFreediamondLessThanOrEqualTo(Integer value) {
            addCriterion("freeDiamond <=", value, "freediamond");
            return (Criteria) this;
        }

        public Criteria andFreediamondIn(List<Integer> values) {
            addCriterion("freeDiamond in", values, "freediamond");
            return (Criteria) this;
        }

        public Criteria andFreediamondNotIn(List<Integer> values) {
            addCriterion("freeDiamond not in", values, "freediamond");
            return (Criteria) this;
        }

        public Criteria andFreediamondBetween(Integer value1, Integer value2) {
            addCriterion("freeDiamond between", value1, value2, "freediamond");
            return (Criteria) this;
        }

        public Criteria andFreediamondNotBetween(Integer value1, Integer value2) {
            addCriterion("freeDiamond not between", value1, value2, "freediamond");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andConsumediamonIsNull() {
            addCriterion("consumeDiamon is null");
            return (Criteria) this;
        }

        public Criteria andConsumediamonIsNotNull() {
            addCriterion("consumeDiamon is not null");
            return (Criteria) this;
        }

        public Criteria andConsumediamonEqualTo(Integer value) {
            addCriterion("consumeDiamon =", value, "consumediamon");
            return (Criteria) this;
        }

        public Criteria andConsumediamonNotEqualTo(Integer value) {
            addCriterion("consumeDiamon <>", value, "consumediamon");
            return (Criteria) this;
        }

        public Criteria andConsumediamonGreaterThan(Integer value) {
            addCriterion("consumeDiamon >", value, "consumediamon");
            return (Criteria) this;
        }

        public Criteria andConsumediamonGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumeDiamon >=", value, "consumediamon");
            return (Criteria) this;
        }

        public Criteria andConsumediamonLessThan(Integer value) {
            addCriterion("consumeDiamon <", value, "consumediamon");
            return (Criteria) this;
        }

        public Criteria andConsumediamonLessThanOrEqualTo(Integer value) {
            addCriterion("consumeDiamon <=", value, "consumediamon");
            return (Criteria) this;
        }

        public Criteria andConsumediamonIn(List<Integer> values) {
            addCriterion("consumeDiamon in", values, "consumediamon");
            return (Criteria) this;
        }

        public Criteria andConsumediamonNotIn(List<Integer> values) {
            addCriterion("consumeDiamon not in", values, "consumediamon");
            return (Criteria) this;
        }

        public Criteria andConsumediamonBetween(Integer value1, Integer value2) {
            addCriterion("consumeDiamon between", value1, value2, "consumediamon");
            return (Criteria) this;
        }

        public Criteria andConsumediamonNotBetween(Integer value1, Integer value2) {
            addCriterion("consumeDiamon not between", value1, value2, "consumediamon");
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