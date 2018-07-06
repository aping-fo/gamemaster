package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ActivationCodeEntitySqlProvider {

    public String countByExample(ActivationCodeEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("activation_code");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ActivationCodeEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("activation_code");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ActivationCodeEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("activation_code");
        
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
        
        if (record.getBatch() != null) {
            sql.VALUES("batch", "#{batch,jdbcType=INTEGER}");
        }
        
        if (record.getGiftBag() != null) {
            sql.VALUES("gift_bag", "#{giftBag,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.VALUES("`number`", "#{number,jdbcType=INTEGER}");
        }
        
        if (record.getFrequency() != null) {
            sql.VALUES("frequency", "#{frequency,jdbcType=INTEGER}");
        }
        
        if (record.getInvalidTime() != null) {
            sql.VALUES("invalid_time", "#{invalidTime,jdbcType=VARCHAR}");
        }
        
        if (record.getOverdueTime() != null) {
            sql.VALUES("overdue_time", "#{overdueTime,jdbcType=VARCHAR}");
        }
        
        if (record.getSynchronizationTime() != null) {
            sql.VALUES("synchronization_time", "#{synchronizationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSynchronizationLog() != null) {
            sql.VALUES("synchronization_log", "#{synchronizationLog,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ActivationCodeEntityExample example) {
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
        sql.SELECT("batch");
        sql.SELECT("gift_bag");
        sql.SELECT("`number`");
        sql.SELECT("frequency");
        sql.SELECT("invalid_time");
        sql.SELECT("overdue_time");
        sql.SELECT("synchronization_time");
        sql.SELECT("synchronization_log");
        sql.FROM("activation_code");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ActivationCodeEntity record = (ActivationCodeEntity) parameter.get("record");
        ActivationCodeEntityExample example = (ActivationCodeEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("activation_code");
        
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
        
        if (record.getBatch() != null) {
            sql.SET("batch = #{record.batch,jdbcType=INTEGER}");
        }
        
        if (record.getGiftBag() != null) {
            sql.SET("gift_bag = #{record.giftBag,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.SET("`number` = #{record.number,jdbcType=INTEGER}");
        }
        
        if (record.getFrequency() != null) {
            sql.SET("frequency = #{record.frequency,jdbcType=INTEGER}");
        }
        
        if (record.getInvalidTime() != null) {
            sql.SET("invalid_time = #{record.invalidTime,jdbcType=VARCHAR}");
        }
        
        if (record.getOverdueTime() != null) {
            sql.SET("overdue_time = #{record.overdueTime,jdbcType=VARCHAR}");
        }
        
        if (record.getSynchronizationTime() != null) {
            sql.SET("synchronization_time = #{record.synchronizationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSynchronizationLog() != null) {
            sql.SET("synchronization_log = #{record.synchronizationLog,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("activation_code");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("batch = #{record.batch,jdbcType=INTEGER}");
        sql.SET("gift_bag = #{record.giftBag,jdbcType=VARCHAR}");
        sql.SET("`number` = #{record.number,jdbcType=INTEGER}");
        sql.SET("frequency = #{record.frequency,jdbcType=INTEGER}");
        sql.SET("invalid_time = #{record.invalidTime,jdbcType=VARCHAR}");
        sql.SET("overdue_time = #{record.overdueTime,jdbcType=VARCHAR}");
        sql.SET("synchronization_time = #{record.synchronizationTime,jdbcType=TIMESTAMP}");
        sql.SET("synchronization_log = #{record.synchronizationLog,jdbcType=VARCHAR}");
        
        ActivationCodeEntityExample example = (ActivationCodeEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ActivationCodeEntityExample example, boolean includeExamplePhrase) {
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