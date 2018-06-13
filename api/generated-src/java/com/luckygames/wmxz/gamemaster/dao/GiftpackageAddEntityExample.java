package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiftpackageAddEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiftpackageAddEntityExample() {
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

        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andIsbindingIsNull() {
            addCriterion("isBinding is null");
            return (Criteria) this;
        }

        public Criteria andIsbindingIsNotNull() {
            addCriterion("isBinding is not null");
            return (Criteria) this;
        }

        public Criteria andIsbindingEqualTo(Integer value) {
            addCriterion("isBinding =", value, "isbinding");
            return (Criteria) this;
        }

        public Criteria andIsbindingNotEqualTo(Integer value) {
            addCriterion("isBinding <>", value, "isbinding");
            return (Criteria) this;
        }

        public Criteria andIsbindingGreaterThan(Integer value) {
            addCriterion("isBinding >", value, "isbinding");
            return (Criteria) this;
        }

        public Criteria andIsbindingGreaterThanOrEqualTo(Integer value) {
            addCriterion("isBinding >=", value, "isbinding");
            return (Criteria) this;
        }

        public Criteria andIsbindingLessThan(Integer value) {
            addCriterion("isBinding <", value, "isbinding");
            return (Criteria) this;
        }

        public Criteria andIsbindingLessThanOrEqualTo(Integer value) {
            addCriterion("isBinding <=", value, "isbinding");
            return (Criteria) this;
        }

        public Criteria andIsbindingIn(List<Integer> values) {
            addCriterion("isBinding in", values, "isbinding");
            return (Criteria) this;
        }

        public Criteria andIsbindingNotIn(List<Integer> values) {
            addCriterion("isBinding not in", values, "isbinding");
            return (Criteria) this;
        }

        public Criteria andIsbindingBetween(Integer value1, Integer value2) {
            addCriterion("isBinding between", value1, value2, "isbinding");
            return (Criteria) this;
        }

        public Criteria andIsbindingNotBetween(Integer value1, Integer value2) {
            addCriterion("isBinding not between", value1, value2, "isbinding");
            return (Criteria) this;
        }

        public Criteria andGoods0NameIsNull() {
            addCriterion("goods0_name is null");
            return (Criteria) this;
        }

        public Criteria andGoods0NameIsNotNull() {
            addCriterion("goods0_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods0NameEqualTo(String value) {
            addCriterion("goods0_name =", value, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameNotEqualTo(String value) {
            addCriterion("goods0_name <>", value, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameGreaterThan(String value) {
            addCriterion("goods0_name >", value, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameGreaterThanOrEqualTo(String value) {
            addCriterion("goods0_name >=", value, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameLessThan(String value) {
            addCriterion("goods0_name <", value, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameLessThanOrEqualTo(String value) {
            addCriterion("goods0_name <=", value, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameLike(String value) {
            addCriterion("goods0_name like", value, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameNotLike(String value) {
            addCriterion("goods0_name not like", value, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameIn(List<String> values) {
            addCriterion("goods0_name in", values, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameNotIn(List<String> values) {
            addCriterion("goods0_name not in", values, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameBetween(String value1, String value2) {
            addCriterion("goods0_name between", value1, value2, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0NameNotBetween(String value1, String value2) {
            addCriterion("goods0_name not between", value1, value2, "goods0Name");
            return (Criteria) this;
        }

        public Criteria andGoods0CountIsNull() {
            addCriterion("goods0_count is null");
            return (Criteria) this;
        }

        public Criteria andGoods0CountIsNotNull() {
            addCriterion("goods0_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoods0CountEqualTo(Integer value) {
            addCriterion("goods0_count =", value, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods0CountNotEqualTo(Integer value) {
            addCriterion("goods0_count <>", value, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods0CountGreaterThan(Integer value) {
            addCriterion("goods0_count >", value, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods0CountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods0_count >=", value, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods0CountLessThan(Integer value) {
            addCriterion("goods0_count <", value, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods0CountLessThanOrEqualTo(Integer value) {
            addCriterion("goods0_count <=", value, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods0CountIn(List<Integer> values) {
            addCriterion("goods0_count in", values, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods0CountNotIn(List<Integer> values) {
            addCriterion("goods0_count not in", values, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods0CountBetween(Integer value1, Integer value2) {
            addCriterion("goods0_count between", value1, value2, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods0CountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods0_count not between", value1, value2, "goods0Count");
            return (Criteria) this;
        }

        public Criteria andGoods1NameIsNull() {
            addCriterion("goods1_name is null");
            return (Criteria) this;
        }

        public Criteria andGoods1NameIsNotNull() {
            addCriterion("goods1_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods1NameEqualTo(String value) {
            addCriterion("goods1_name =", value, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameNotEqualTo(String value) {
            addCriterion("goods1_name <>", value, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameGreaterThan(String value) {
            addCriterion("goods1_name >", value, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameGreaterThanOrEqualTo(String value) {
            addCriterion("goods1_name >=", value, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameLessThan(String value) {
            addCriterion("goods1_name <", value, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameLessThanOrEqualTo(String value) {
            addCriterion("goods1_name <=", value, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameLike(String value) {
            addCriterion("goods1_name like", value, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameNotLike(String value) {
            addCriterion("goods1_name not like", value, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameIn(List<String> values) {
            addCriterion("goods1_name in", values, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameNotIn(List<String> values) {
            addCriterion("goods1_name not in", values, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameBetween(String value1, String value2) {
            addCriterion("goods1_name between", value1, value2, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1NameNotBetween(String value1, String value2) {
            addCriterion("goods1_name not between", value1, value2, "goods1Name");
            return (Criteria) this;
        }

        public Criteria andGoods1CountIsNull() {
            addCriterion("goods1_count is null");
            return (Criteria) this;
        }

        public Criteria andGoods1CountIsNotNull() {
            addCriterion("goods1_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoods1CountEqualTo(Integer value) {
            addCriterion("goods1_count =", value, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods1CountNotEqualTo(Integer value) {
            addCriterion("goods1_count <>", value, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods1CountGreaterThan(Integer value) {
            addCriterion("goods1_count >", value, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods1CountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods1_count >=", value, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods1CountLessThan(Integer value) {
            addCriterion("goods1_count <", value, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods1CountLessThanOrEqualTo(Integer value) {
            addCriterion("goods1_count <=", value, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods1CountIn(List<Integer> values) {
            addCriterion("goods1_count in", values, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods1CountNotIn(List<Integer> values) {
            addCriterion("goods1_count not in", values, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods1CountBetween(Integer value1, Integer value2) {
            addCriterion("goods1_count between", value1, value2, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods1CountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods1_count not between", value1, value2, "goods1Count");
            return (Criteria) this;
        }

        public Criteria andGoods2NameIsNull() {
            addCriterion("goods2_name is null");
            return (Criteria) this;
        }

        public Criteria andGoods2NameIsNotNull() {
            addCriterion("goods2_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods2NameEqualTo(String value) {
            addCriterion("goods2_name =", value, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameNotEqualTo(String value) {
            addCriterion("goods2_name <>", value, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameGreaterThan(String value) {
            addCriterion("goods2_name >", value, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameGreaterThanOrEqualTo(String value) {
            addCriterion("goods2_name >=", value, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameLessThan(String value) {
            addCriterion("goods2_name <", value, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameLessThanOrEqualTo(String value) {
            addCriterion("goods2_name <=", value, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameLike(String value) {
            addCriterion("goods2_name like", value, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameNotLike(String value) {
            addCriterion("goods2_name not like", value, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameIn(List<String> values) {
            addCriterion("goods2_name in", values, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameNotIn(List<String> values) {
            addCriterion("goods2_name not in", values, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameBetween(String value1, String value2) {
            addCriterion("goods2_name between", value1, value2, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2NameNotBetween(String value1, String value2) {
            addCriterion("goods2_name not between", value1, value2, "goods2Name");
            return (Criteria) this;
        }

        public Criteria andGoods2CountIsNull() {
            addCriterion("goods2_count is null");
            return (Criteria) this;
        }

        public Criteria andGoods2CountIsNotNull() {
            addCriterion("goods2_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoods2CountEqualTo(Integer value) {
            addCriterion("goods2_count =", value, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods2CountNotEqualTo(Integer value) {
            addCriterion("goods2_count <>", value, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods2CountGreaterThan(Integer value) {
            addCriterion("goods2_count >", value, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods2CountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods2_count >=", value, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods2CountLessThan(Integer value) {
            addCriterion("goods2_count <", value, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods2CountLessThanOrEqualTo(Integer value) {
            addCriterion("goods2_count <=", value, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods2CountIn(List<Integer> values) {
            addCriterion("goods2_count in", values, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods2CountNotIn(List<Integer> values) {
            addCriterion("goods2_count not in", values, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods2CountBetween(Integer value1, Integer value2) {
            addCriterion("goods2_count between", value1, value2, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods2CountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods2_count not between", value1, value2, "goods2Count");
            return (Criteria) this;
        }

        public Criteria andGoods3NameIsNull() {
            addCriterion("goods3_name is null");
            return (Criteria) this;
        }

        public Criteria andGoods3NameIsNotNull() {
            addCriterion("goods3_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods3NameEqualTo(String value) {
            addCriterion("goods3_name =", value, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameNotEqualTo(String value) {
            addCriterion("goods3_name <>", value, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameGreaterThan(String value) {
            addCriterion("goods3_name >", value, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameGreaterThanOrEqualTo(String value) {
            addCriterion("goods3_name >=", value, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameLessThan(String value) {
            addCriterion("goods3_name <", value, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameLessThanOrEqualTo(String value) {
            addCriterion("goods3_name <=", value, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameLike(String value) {
            addCriterion("goods3_name like", value, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameNotLike(String value) {
            addCriterion("goods3_name not like", value, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameIn(List<String> values) {
            addCriterion("goods3_name in", values, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameNotIn(List<String> values) {
            addCriterion("goods3_name not in", values, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameBetween(String value1, String value2) {
            addCriterion("goods3_name between", value1, value2, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3NameNotBetween(String value1, String value2) {
            addCriterion("goods3_name not between", value1, value2, "goods3Name");
            return (Criteria) this;
        }

        public Criteria andGoods3CountIsNull() {
            addCriterion("goods3_count is null");
            return (Criteria) this;
        }

        public Criteria andGoods3CountIsNotNull() {
            addCriterion("goods3_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoods3CountEqualTo(Integer value) {
            addCriterion("goods3_count =", value, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods3CountNotEqualTo(Integer value) {
            addCriterion("goods3_count <>", value, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods3CountGreaterThan(Integer value) {
            addCriterion("goods3_count >", value, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods3CountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods3_count >=", value, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods3CountLessThan(Integer value) {
            addCriterion("goods3_count <", value, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods3CountLessThanOrEqualTo(Integer value) {
            addCriterion("goods3_count <=", value, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods3CountIn(List<Integer> values) {
            addCriterion("goods3_count in", values, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods3CountNotIn(List<Integer> values) {
            addCriterion("goods3_count not in", values, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods3CountBetween(Integer value1, Integer value2) {
            addCriterion("goods3_count between", value1, value2, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods3CountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods3_count not between", value1, value2, "goods3Count");
            return (Criteria) this;
        }

        public Criteria andGoods4NameIsNull() {
            addCriterion("goods4_name is null");
            return (Criteria) this;
        }

        public Criteria andGoods4NameIsNotNull() {
            addCriterion("goods4_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods4NameEqualTo(String value) {
            addCriterion("goods4_name =", value, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameNotEqualTo(String value) {
            addCriterion("goods4_name <>", value, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameGreaterThan(String value) {
            addCriterion("goods4_name >", value, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameGreaterThanOrEqualTo(String value) {
            addCriterion("goods4_name >=", value, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameLessThan(String value) {
            addCriterion("goods4_name <", value, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameLessThanOrEqualTo(String value) {
            addCriterion("goods4_name <=", value, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameLike(String value) {
            addCriterion("goods4_name like", value, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameNotLike(String value) {
            addCriterion("goods4_name not like", value, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameIn(List<String> values) {
            addCriterion("goods4_name in", values, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameNotIn(List<String> values) {
            addCriterion("goods4_name not in", values, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameBetween(String value1, String value2) {
            addCriterion("goods4_name between", value1, value2, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4NameNotBetween(String value1, String value2) {
            addCriterion("goods4_name not between", value1, value2, "goods4Name");
            return (Criteria) this;
        }

        public Criteria andGoods4CountIsNull() {
            addCriterion("goods4_count is null");
            return (Criteria) this;
        }

        public Criteria andGoods4CountIsNotNull() {
            addCriterion("goods4_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoods4CountEqualTo(Integer value) {
            addCriterion("goods4_count =", value, "goods4Count");
            return (Criteria) this;
        }

        public Criteria andGoods4CountNotEqualTo(Integer value) {
            addCriterion("goods4_count <>", value, "goods4Count");
            return (Criteria) this;
        }

        public Criteria andGoods4CountGreaterThan(Integer value) {
            addCriterion("goods4_count >", value, "goods4Count");
            return (Criteria) this;
        }

        public Criteria andGoods4CountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods4_count >=", value, "goods4Count");
            return (Criteria) this;
        }

        public Criteria andGoods4CountLessThan(Integer value) {
            addCriterion("goods4_count <", value, "goods4Count");
            return (Criteria) this;
        }

        public Criteria andGoods4CountLessThanOrEqualTo(Integer value) {
            addCriterion("goods4_count <=", value, "goods4Count");
            return (Criteria) this;
        }

        public Criteria andGoods4CountIn(List<Integer> values) {
            addCriterion("goods4_count in", values, "goods4Count");
            return (Criteria) this;
        }

        public Criteria andGoods4CountNotIn(List<Integer> values) {
            addCriterion("goods4_count not in", values, "goods4Count");
            return (Criteria) this;
        }

        public Criteria andGoods4CountBetween(Integer value1, Integer value2) {
            addCriterion("goods4_count between", value1, value2, "goods4Count");
            return (Criteria) this;
        }

        public Criteria andGoods4CountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods4_count not between", value1, value2, "goods4Count");
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