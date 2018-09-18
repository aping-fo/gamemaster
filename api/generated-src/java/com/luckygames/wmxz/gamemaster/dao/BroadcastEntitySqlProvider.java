package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.BroadcastEntity;
import com.luckygames.wmxz.gamemaster.dao.BroadcastEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.BroadcastEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.BroadcastEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class BroadcastEntitySqlProvider {

    public String countByExample(BroadcastEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("broadcast");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(BroadcastEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("broadcast");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(BroadcastEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("broadcast");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getBroadcastType() != null) {
            sql.VALUES("broadcast_type", "#{broadcastType,jdbcType=INTEGER}");
        }
        
        if (record.getLoopTimes() != null) {
            sql.VALUES("loop_times", "#{loopTimes,jdbcType=INTEGER}");
        }
        
        if (record.getGapSecond() != null) {
            sql.VALUES("gap_second", "#{gapSecond,jdbcType=INTEGER}");
        }
        
        if (record.getPlayTime() != null) {
            sql.VALUES("play_time", "#{playTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getBroadcastStatus() != null) {
            sql.VALUES("broadcast_status", "#{broadcastStatus,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReason() != null) {
            sql.VALUES("reason", "#{reason,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(BroadcastEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("channel_id");
        sql.SELECT("server_id");
        sql.SELECT("broadcast_type");
        sql.SELECT("loop_times");
        sql.SELECT("gap_second");
        sql.SELECT("play_time");
        sql.SELECT("title");
        sql.SELECT("content");
        sql.SELECT("broadcast_status");
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("reason");
        sql.FROM("broadcast");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        BroadcastEntity record = (BroadcastEntity) parameter.get("record");
        BroadcastEntityExample example = (BroadcastEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("broadcast");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getBroadcastType() != null) {
            sql.SET("broadcast_type = #{record.broadcastType,jdbcType=INTEGER}");
        }
        
        if (record.getLoopTimes() != null) {
            sql.SET("loop_times = #{record.loopTimes,jdbcType=INTEGER}");
        }
        
        if (record.getGapSecond() != null) {
            sql.SET("gap_second = #{record.gapSecond,jdbcType=INTEGER}");
        }
        
        if (record.getPlayTime() != null) {
            sql.SET("play_time = #{record.playTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{record.content,jdbcType=VARCHAR}");
        }
        
        if (record.getBroadcastStatus() != null) {
            sql.SET("broadcast_status = #{record.broadcastStatus,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReason() != null) {
            sql.SET("reason = #{record.reason,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("broadcast");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("broadcast_type = #{record.broadcastType,jdbcType=INTEGER}");
        sql.SET("loop_times = #{record.loopTimes,jdbcType=INTEGER}");
        sql.SET("gap_second = #{record.gapSecond,jdbcType=INTEGER}");
        sql.SET("play_time = #{record.playTime,jdbcType=TIMESTAMP}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("content = #{record.content,jdbcType=VARCHAR}");
        sql.SET("broadcast_status = #{record.broadcastStatus,jdbcType=INTEGER}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("reason = #{record.reason,jdbcType=VARCHAR}");
        
        BroadcastEntityExample example = (BroadcastEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, BroadcastEntityExample example, boolean includeExamplePhrase) {
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