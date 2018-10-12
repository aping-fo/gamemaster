package com.luckygames.wmxz.gamemaster.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BroadcastEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BroadcastEntityExample() {
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

        public Criteria andBroadcastTypeIsNull() {
            addCriterion("broadcast_type is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeIsNotNull() {
            addCriterion("broadcast_type is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeEqualTo(Integer value) {
            addCriterion("broadcast_type =", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeNotEqualTo(Integer value) {
            addCriterion("broadcast_type <>", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeGreaterThan(Integer value) {
            addCriterion("broadcast_type >", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("broadcast_type >=", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeLessThan(Integer value) {
            addCriterion("broadcast_type <", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeLessThanOrEqualTo(Integer value) {
            addCriterion("broadcast_type <=", value, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeIn(List<Integer> values) {
            addCriterion("broadcast_type in", values, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeNotIn(List<Integer> values) {
            addCriterion("broadcast_type not in", values, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeBetween(Integer value1, Integer value2) {
            addCriterion("broadcast_type between", value1, value2, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andBroadcastTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("broadcast_type not between", value1, value2, "broadcastType");
            return (Criteria) this;
        }

        public Criteria andLoopTimesIsNull() {
            addCriterion("loop_times is null");
            return (Criteria) this;
        }

        public Criteria andLoopTimesIsNotNull() {
            addCriterion("loop_times is not null");
            return (Criteria) this;
        }

        public Criteria andLoopTimesEqualTo(Integer value) {
            addCriterion("loop_times =", value, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andLoopTimesNotEqualTo(Integer value) {
            addCriterion("loop_times <>", value, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andLoopTimesGreaterThan(Integer value) {
            addCriterion("loop_times >", value, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andLoopTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("loop_times >=", value, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andLoopTimesLessThan(Integer value) {
            addCriterion("loop_times <", value, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andLoopTimesLessThanOrEqualTo(Integer value) {
            addCriterion("loop_times <=", value, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andLoopTimesIn(List<Integer> values) {
            addCriterion("loop_times in", values, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andLoopTimesNotIn(List<Integer> values) {
            addCriterion("loop_times not in", values, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andLoopTimesBetween(Integer value1, Integer value2) {
            addCriterion("loop_times between", value1, value2, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andLoopTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("loop_times not between", value1, value2, "loopTimes");
            return (Criteria) this;
        }

        public Criteria andGapSecondIsNull() {
            addCriterion("gap_second is null");
            return (Criteria) this;
        }

        public Criteria andGapSecondIsNotNull() {
            addCriterion("gap_second is not null");
            return (Criteria) this;
        }

        public Criteria andGapSecondEqualTo(Integer value) {
            addCriterion("gap_second =", value, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andGapSecondNotEqualTo(Integer value) {
            addCriterion("gap_second <>", value, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andGapSecondGreaterThan(Integer value) {
            addCriterion("gap_second >", value, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andGapSecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("gap_second >=", value, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andGapSecondLessThan(Integer value) {
            addCriterion("gap_second <", value, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andGapSecondLessThanOrEqualTo(Integer value) {
            addCriterion("gap_second <=", value, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andGapSecondIn(List<Integer> values) {
            addCriterion("gap_second in", values, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andGapSecondNotIn(List<Integer> values) {
            addCriterion("gap_second not in", values, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andGapSecondBetween(Integer value1, Integer value2) {
            addCriterion("gap_second between", value1, value2, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andGapSecondNotBetween(Integer value1, Integer value2) {
            addCriterion("gap_second not between", value1, value2, "gapSecond");
            return (Criteria) this;
        }

        public Criteria andPlayTimeIsNull() {
            addCriterion("play_time is null");
            return (Criteria) this;
        }

        public Criteria andPlayTimeIsNotNull() {
            addCriterion("play_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTimeEqualTo(Date value) {
            addCriterion("play_time =", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotEqualTo(Date value) {
            addCriterion("play_time <>", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeGreaterThan(Date value) {
            addCriterion("play_time >", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("play_time >=", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeLessThan(Date value) {
            addCriterion("play_time <", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeLessThanOrEqualTo(Date value) {
            addCriterion("play_time <=", value, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeIn(List<Date> values) {
            addCriterion("play_time in", values, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotIn(List<Date> values) {
            addCriterion("play_time not in", values, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeBetween(Date value1, Date value2) {
            addCriterion("play_time between", value1, value2, "playTime");
            return (Criteria) this;
        }

        public Criteria andPlayTimeNotBetween(Date value1, Date value2) {
            addCriterion("play_time not between", value1, value2, "playTime");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusIsNull() {
            addCriterion("broadcast_status is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusIsNotNull() {
            addCriterion("broadcast_status is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusEqualTo(Integer value) {
            addCriterion("broadcast_status =", value, "broadcastStatus");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusNotEqualTo(Integer value) {
            addCriterion("broadcast_status <>", value, "broadcastStatus");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusGreaterThan(Integer value) {
            addCriterion("broadcast_status >", value, "broadcastStatus");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("broadcast_status >=", value, "broadcastStatus");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusLessThan(Integer value) {
            addCriterion("broadcast_status <", value, "broadcastStatus");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusLessThanOrEqualTo(Integer value) {
            addCriterion("broadcast_status <=", value, "broadcastStatus");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusIn(List<Integer> values) {
            addCriterion("broadcast_status in", values, "broadcastStatus");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusNotIn(List<Integer> values) {
            addCriterion("broadcast_status not in", values, "broadcastStatus");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusBetween(Integer value1, Integer value2) {
            addCriterion("broadcast_status between", value1, value2, "broadcastStatus");
            return (Criteria) this;
        }

        public Criteria andBroadcastStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("broadcast_status not between", value1, value2, "broadcastStatus");
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

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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