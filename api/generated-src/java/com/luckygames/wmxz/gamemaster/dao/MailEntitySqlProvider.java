package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.MailEntity;
import com.luckygames.wmxz.gamemaster.dao.MailEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.MailEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.MailEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MailEntitySqlProvider {

    public String countByExample(MailEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("mail_log_new");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MailEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("mail_log_new");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MailEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mail_log_new");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getSenderId() != null) {
            sql.VALUES("sender_id", "#{senderId,jdbcType=INTEGER}");
        }
        
        if (record.getSenderName() != null) {
            sql.VALUES("sender_name", "#{senderName,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveId() != null) {
            sql.VALUES("receive_id", "#{receiveId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getSendTime() != null) {
            sql.VALUES("send_time", "#{sendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getState() != null) {
            sql.VALUES("`state`", "#{state,jdbcType=TINYINT}");
        }
        
        if (record.getRewards() != null) {
            sql.VALUES("rewards", "#{rewards,jdbcType=VARCHAR}");
        }
        
        if (record.getHasReward() != null) {
            sql.VALUES("has_reward", "#{hasReward,jdbcType=TINYINT}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("`type`", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MailEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("sender_id");
        sql.SELECT("sender_name");
        sql.SELECT("receive_id");
        sql.SELECT("title");
        sql.SELECT("content");
        sql.SELECT("send_time");
        sql.SELECT("`state`");
        sql.SELECT("rewards");
        sql.SELECT("has_reward");
        sql.SELECT("`type`");
        sql.SELECT("server_id");
        sql.FROM("mail_log_new");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MailEntity record = (MailEntity) parameter.get("record");
        MailEntityExample example = (MailEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("mail_log_new");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getSenderId() != null) {
            sql.SET("sender_id = #{record.senderId,jdbcType=INTEGER}");
        }
        
        if (record.getSenderName() != null) {
            sql.SET("sender_name = #{record.senderName,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiveId() != null) {
            sql.SET("receive_id = #{record.receiveId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{record.content,jdbcType=VARCHAR}");
        }
        
        if (record.getSendTime() != null) {
            sql.SET("send_time = #{record.sendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getState() != null) {
            sql.SET("`state` = #{record.state,jdbcType=TINYINT}");
        }
        
        if (record.getRewards() != null) {
            sql.SET("rewards = #{record.rewards,jdbcType=VARCHAR}");
        }
        
        if (record.getHasReward() != null) {
            sql.SET("has_reward = #{record.hasReward,jdbcType=TINYINT}");
        }
        
        if (record.getType() != null) {
            sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("mail_log_new");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("sender_id = #{record.senderId,jdbcType=INTEGER}");
        sql.SET("sender_name = #{record.senderName,jdbcType=VARCHAR}");
        sql.SET("receive_id = #{record.receiveId,jdbcType=INTEGER}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("content = #{record.content,jdbcType=VARCHAR}");
        sql.SET("send_time = #{record.sendTime,jdbcType=TIMESTAMP}");
        sql.SET("`state` = #{record.state,jdbcType=TINYINT}");
        sql.SET("rewards = #{record.rewards,jdbcType=VARCHAR}");
        sql.SET("has_reward = #{record.hasReward,jdbcType=TINYINT}");
        sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        
        MailEntityExample example = (MailEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MailEntityExample example, boolean includeExamplePhrase) {
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