package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.ActivityEntity;
import com.luckygames.wmxz.gamemaster.dao.ActivityEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.ActivityEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.ActivityEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ActivityEntitySqlProvider {

    public String countByExample(ActivityEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("activity");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ActivityEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("activity");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ActivityEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("activity");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getClassification() != null) {
            sql.VALUES("classification", "#{classification,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            sql.VALUES("start_time", "#{startTime,jdbcType=VARCHAR}");
        }
        
        if (record.getEndTime() != null) {
            sql.VALUES("end_time", "#{endTime,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityStatus() != null) {
            sql.VALUES("activity_status", "#{activityStatus,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("`type`", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getCreater() != null) {
            sql.VALUES("creater", "#{creater,jdbcType=VARCHAR}");
        }
        
        if (record.getAuditor() != null) {
            sql.VALUES("auditor", "#{auditor,jdbcType=VARCHAR}");
        }
        
        if (record.getAuditorTime() != null) {
            sql.VALUES("auditor_time", "#{auditorTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDes() != null) {
            sql.VALUES("des", "#{des,jdbcType=VARCHAR}");
        }
        
        if (record.getCompletionConditions() != null) {
            sql.VALUES("completion_conditions", "#{completionConditions,jdbcType=VARCHAR}");
        }
        
        if (record.getReward() != null) {
            sql.VALUES("reward", "#{reward,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            sql.VALUES("sort", "#{sort,jdbcType=INTEGER}");
        }
        
        if (record.getIsOpen() != null) {
            sql.VALUES("is_open", "#{isOpen,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ActivityEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("`status`");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("classification");
        sql.SELECT("title");
        sql.SELECT("start_time");
        sql.SELECT("end_time");
        sql.SELECT("activity_status");
        sql.SELECT("`type`");
        sql.SELECT("creater");
        sql.SELECT("auditor");
        sql.SELECT("auditor_time");
        sql.SELECT("des");
        sql.SELECT("completion_conditions");
        sql.SELECT("reward");
        sql.SELECT("sort");
        sql.SELECT("is_open");
        sql.FROM("activity");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ActivityEntity record = (ActivityEntity) parameter.get("record");
        ActivityEntityExample example = (ActivityEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("activity");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getClassification() != null) {
            sql.SET("classification = #{record.classification,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getStartTime() != null) {
            sql.SET("start_time = #{record.startTime,jdbcType=VARCHAR}");
        }
        
        if (record.getEndTime() != null) {
            sql.SET("end_time = #{record.endTime,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityStatus() != null) {
            sql.SET("activity_status = #{record.activityStatus,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getCreater() != null) {
            sql.SET("creater = #{record.creater,jdbcType=VARCHAR}");
        }
        
        if (record.getAuditor() != null) {
            sql.SET("auditor = #{record.auditor,jdbcType=VARCHAR}");
        }
        
        if (record.getAuditorTime() != null) {
            sql.SET("auditor_time = #{record.auditorTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDes() != null) {
            sql.SET("des = #{record.des,jdbcType=VARCHAR}");
        }
        
        if (record.getCompletionConditions() != null) {
            sql.SET("completion_conditions = #{record.completionConditions,jdbcType=VARCHAR}");
        }
        
        if (record.getReward() != null) {
            sql.SET("reward = #{record.reward,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            sql.SET("sort = #{record.sort,jdbcType=INTEGER}");
        }
        
        if (record.getIsOpen() != null) {
            sql.SET("is_open = #{record.isOpen,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("activity");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("classification = #{record.classification,jdbcType=INTEGER}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("start_time = #{record.startTime,jdbcType=VARCHAR}");
        sql.SET("end_time = #{record.endTime,jdbcType=VARCHAR}");
        sql.SET("activity_status = #{record.activityStatus,jdbcType=INTEGER}");
        sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        sql.SET("creater = #{record.creater,jdbcType=VARCHAR}");
        sql.SET("auditor = #{record.auditor,jdbcType=VARCHAR}");
        sql.SET("auditor_time = #{record.auditorTime,jdbcType=TIMESTAMP}");
        sql.SET("des = #{record.des,jdbcType=VARCHAR}");
        sql.SET("completion_conditions = #{record.completionConditions,jdbcType=VARCHAR}");
        sql.SET("reward = #{record.reward,jdbcType=VARCHAR}");
        sql.SET("sort = #{record.sort,jdbcType=INTEGER}");
        sql.SET("is_open = #{record.isOpen,jdbcType=INTEGER}");
        
        ActivityEntityExample example = (ActivityEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ActivityEntityExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}