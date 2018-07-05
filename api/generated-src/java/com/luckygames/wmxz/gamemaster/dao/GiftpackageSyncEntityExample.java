package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiftpackageSyncEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiftpackageSyncEntityExample() {
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

        public Criteria andCardFileIsNull() {
            addCriterion("card_file is null");
            return (Criteria) this;
        }

        public Criteria andCardFileIsNotNull() {
            addCriterion("card_file is not null");
            return (Criteria) this;
        }

        public Criteria andCardFileEqualTo(String value) {
            addCriterion("card_file =", value, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileNotEqualTo(String value) {
            addCriterion("card_file <>", value, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileGreaterThan(String value) {
            addCriterion("card_file >", value, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileGreaterThanOrEqualTo(String value) {
            addCriterion("card_file >=", value, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileLessThan(String value) {
            addCriterion("card_file <", value, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileLessThanOrEqualTo(String value) {
            addCriterion("card_file <=", value, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileLike(String value) {
            addCriterion("card_file like", value, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileNotLike(String value) {
            addCriterion("card_file not like", value, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileIn(List<String> values) {
            addCriterion("card_file in", values, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileNotIn(List<String> values) {
            addCriterion("card_file not in", values, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileBetween(String value1, String value2) {
            addCriterion("card_file between", value1, value2, "cardFile");
            return (Criteria) this;
        }

        public Criteria andCardFileNotBetween(String value1, String value2) {
            addCriterion("card_file not between", value1, value2, "cardFile");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityIsNull() {
            addCriterion("min_term_validity is null");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityIsNotNull() {
            addCriterion("min_term_validity is not null");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityEqualTo(Date value) {
            addCriterion("min_term_validity =", value, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityNotEqualTo(Date value) {
            addCriterion("min_term_validity <>", value, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityGreaterThan(Date value) {
            addCriterion("min_term_validity >", value, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityGreaterThanOrEqualTo(Date value) {
            addCriterion("min_term_validity >=", value, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityLessThan(Date value) {
            addCriterion("min_term_validity <", value, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityLessThanOrEqualTo(Date value) {
            addCriterion("min_term_validity <=", value, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityIn(List<Date> values) {
            addCriterion("min_term_validity in", values, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityNotIn(List<Date> values) {
            addCriterion("min_term_validity not in", values, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityBetween(Date value1, Date value2) {
            addCriterion("min_term_validity between", value1, value2, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMinTermValidityNotBetween(Date value1, Date value2) {
            addCriterion("min_term_validity not between", value1, value2, "minTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityIsNull() {
            addCriterion("max_term_validity is null");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityIsNotNull() {
            addCriterion("max_term_validity is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityEqualTo(Date value) {
            addCriterion("max_term_validity =", value, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityNotEqualTo(Date value) {
            addCriterion("max_term_validity <>", value, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityGreaterThan(Date value) {
            addCriterion("max_term_validity >", value, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityGreaterThanOrEqualTo(Date value) {
            addCriterion("max_term_validity >=", value, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityLessThan(Date value) {
            addCriterion("max_term_validity <", value, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityLessThanOrEqualTo(Date value) {
            addCriterion("max_term_validity <=", value, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityIn(List<Date> values) {
            addCriterion("max_term_validity in", values, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityNotIn(List<Date> values) {
            addCriterion("max_term_validity not in", values, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityBetween(Date value1, Date value2) {
            addCriterion("max_term_validity between", value1, value2, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andMaxTermValidityNotBetween(Date value1, Date value2) {
            addCriterion("max_term_validity not between", value1, value2, "maxTermValidity");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagIsNull() {
            addCriterion("is_exclusive_giftbag is null");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagIsNotNull() {
            addCriterion("is_exclusive_giftbag is not null");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagEqualTo(Integer value) {
            addCriterion("is_exclusive_giftbag =", value, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagNotEqualTo(Integer value) {
            addCriterion("is_exclusive_giftbag <>", value, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagGreaterThan(Integer value) {
            addCriterion("is_exclusive_giftbag >", value, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_exclusive_giftbag >=", value, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagLessThan(Integer value) {
            addCriterion("is_exclusive_giftbag <", value, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagLessThanOrEqualTo(Integer value) {
            addCriterion("is_exclusive_giftbag <=", value, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagIn(List<Integer> values) {
            addCriterion("is_exclusive_giftbag in", values, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagNotIn(List<Integer> values) {
            addCriterion("is_exclusive_giftbag not in", values, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagBetween(Integer value1, Integer value2) {
            addCriterion("is_exclusive_giftbag between", value1, value2, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andIsExclusiveGiftbagNotBetween(Integer value1, Integer value2) {
            addCriterion("is_exclusive_giftbag not between", value1, value2, "isExclusiveGiftbag");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("card_type like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("card_type not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardCountIsNull() {
            addCriterion("card_count is null");
            return (Criteria) this;
        }

        public Criteria andCardCountIsNotNull() {
            addCriterion("card_count is not null");
            return (Criteria) this;
        }

        public Criteria andCardCountEqualTo(Integer value) {
            addCriterion("card_count =", value, "cardCount");
            return (Criteria) this;
        }

        public Criteria andCardCountNotEqualTo(Integer value) {
            addCriterion("card_count <>", value, "cardCount");
            return (Criteria) this;
        }

        public Criteria andCardCountGreaterThan(Integer value) {
            addCriterion("card_count >", value, "cardCount");
            return (Criteria) this;
        }

        public Criteria andCardCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_count >=", value, "cardCount");
            return (Criteria) this;
        }

        public Criteria andCardCountLessThan(Integer value) {
            addCriterion("card_count <", value, "cardCount");
            return (Criteria) this;
        }

        public Criteria andCardCountLessThanOrEqualTo(Integer value) {
            addCriterion("card_count <=", value, "cardCount");
            return (Criteria) this;
        }

        public Criteria andCardCountIn(List<Integer> values) {
            addCriterion("card_count in", values, "cardCount");
            return (Criteria) this;
        }

        public Criteria andCardCountNotIn(List<Integer> values) {
            addCriterion("card_count not in", values, "cardCount");
            return (Criteria) this;
        }

        public Criteria andCardCountBetween(Integer value1, Integer value2) {
            addCriterion("card_count between", value1, value2, "cardCount");
            return (Criteria) this;
        }

        public Criteria andCardCountNotBetween(Integer value1, Integer value2) {
            addCriterion("card_count not between", value1, value2, "cardCount");
            return (Criteria) this;
        }

        public Criteria andIsActivationIsNull() {
            addCriterion("is_activation is null");
            return (Criteria) this;
        }

        public Criteria andIsActivationIsNotNull() {
            addCriterion("is_activation is not null");
            return (Criteria) this;
        }

        public Criteria andIsActivationEqualTo(Integer value) {
            addCriterion("is_activation =", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationNotEqualTo(Integer value) {
            addCriterion("is_activation <>", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationGreaterThan(Integer value) {
            addCriterion("is_activation >", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_activation >=", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationLessThan(Integer value) {
            addCriterion("is_activation <", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationLessThanOrEqualTo(Integer value) {
            addCriterion("is_activation <=", value, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationIn(List<Integer> values) {
            addCriterion("is_activation in", values, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationNotIn(List<Integer> values) {
            addCriterion("is_activation not in", values, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationBetween(Integer value1, Integer value2) {
            addCriterion("is_activation between", value1, value2, "isActivation");
            return (Criteria) this;
        }

        public Criteria andIsActivationNotBetween(Integer value1, Integer value2) {
            addCriterion("is_activation not between", value1, value2, "isActivation");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeIsNull() {
            addCriterion("generate_time is null");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeIsNotNull() {
            addCriterion("generate_time is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeEqualTo(Date value) {
            addCriterion("generate_time =", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeNotEqualTo(Date value) {
            addCriterion("generate_time <>", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeGreaterThan(Date value) {
            addCriterion("generate_time >", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("generate_time >=", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeLessThan(Date value) {
            addCriterion("generate_time <", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeLessThanOrEqualTo(Date value) {
            addCriterion("generate_time <=", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeIn(List<Date> values) {
            addCriterion("generate_time in", values, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeNotIn(List<Date> values) {
            addCriterion("generate_time not in", values, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeBetween(Date value1, Date value2) {
            addCriterion("generate_time between", value1, value2, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeNotBetween(Date value1, Date value2) {
            addCriterion("generate_time not between", value1, value2, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeIsNull() {
            addCriterion("generate_type is null");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeIsNotNull() {
            addCriterion("generate_type is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeEqualTo(Integer value) {
            addCriterion("generate_type =", value, "generateType");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeNotEqualTo(Integer value) {
            addCriterion("generate_type <>", value, "generateType");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeGreaterThan(Integer value) {
            addCriterion("generate_type >", value, "generateType");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("generate_type >=", value, "generateType");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeLessThan(Integer value) {
            addCriterion("generate_type <", value, "generateType");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("generate_type <=", value, "generateType");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeIn(List<Integer> values) {
            addCriterion("generate_type in", values, "generateType");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeNotIn(List<Integer> values) {
            addCriterion("generate_type not in", values, "generateType");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeBetween(Integer value1, Integer value2) {
            addCriterion("generate_type between", value1, value2, "generateType");
            return (Criteria) this;
        }

        public Criteria andGenerateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("generate_type not between", value1, value2, "generateType");
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