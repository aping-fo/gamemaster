package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.RechargeFailedOrderEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RechargeFailedOrderEntitySqlProvider {

    public String countByExample(RechargeFailedOrderEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("recharge_failed_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RechargeFailedOrderEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("recharge_failed_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(RechargeFailedOrderEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("recharge_failed_order");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getOrderCode() != null) {
            sql.VALUES("order_code", "#{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getCharName() != null) {
            sql.VALUES("char_name", "#{charName,jdbcType=VARCHAR}");
        }
        
        if (record.getCharLevel() != null) {
            sql.VALUES("char_level", "#{charLevel,jdbcType=INTEGER}");
        }
        
        if (record.getGoldQuantity() != null) {
            sql.VALUES("gold_quantity", "#{goldQuantity,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getReason() != null) {
            sql.VALUES("reason", "#{reason,jdbcType=INTEGER}");
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
        
        if (record.getReportDate() != null) {
            sql.VALUES("report_date", "#{reportDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCharId() != null) {
            sql.VALUES("char_id", "#{charId,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.VALUES("player_id", "#{playerId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RechargeFailedOrderEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("order_code");
        sql.SELECT("`server_name`");
        sql.SELECT("server_id");
        sql.SELECT("channel_name");
        sql.SELECT("channel_id");
        sql.SELECT("user_name");
        sql.SELECT("char_name");
        sql.SELECT("char_level");
        sql.SELECT("gold_quantity");
        sql.SELECT("amount");
        sql.SELECT("reason");
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("report_date");
        sql.SELECT("char_id");
        sql.SELECT("player_id");
        sql.FROM("recharge_failed_order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        RechargeFailedOrderEntity record = (RechargeFailedOrderEntity) parameter.get("record");
        RechargeFailedOrderEntityExample example = (RechargeFailedOrderEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("recharge_failed_order");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{record.orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        }
        
        if (record.getCharName() != null) {
            sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        }
        
        if (record.getCharLevel() != null) {
            sql.SET("char_level = #{record.charLevel,jdbcType=INTEGER}");
        }
        
        if (record.getGoldQuantity() != null) {
            sql.SET("gold_quantity = #{record.goldQuantity,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getReason() != null) {
            sql.SET("reason = #{record.reason,jdbcType=INTEGER}");
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
        
        if (record.getReportDate() != null) {
            sql.SET("report_date = #{record.reportDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCharId() != null) {
            sql.SET("char_id = #{record.charId,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.SET("player_id = #{record.playerId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("recharge_failed_order");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("order_code = #{record.orderCode,jdbcType=VARCHAR}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        sql.SET("char_level = #{record.charLevel,jdbcType=INTEGER}");
        sql.SET("gold_quantity = #{record.goldQuantity,jdbcType=INTEGER}");
        sql.SET("amount = #{record.amount,jdbcType=DECIMAL}");
        sql.SET("reason = #{record.reason,jdbcType=INTEGER}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("report_date = #{record.reportDate,jdbcType=TIMESTAMP}");
        sql.SET("char_id = #{record.charId,jdbcType=BIGINT}");
        sql.SET("player_id = #{record.playerId,jdbcType=BIGINT}");
        
        RechargeFailedOrderEntityExample example = (RechargeFailedOrderEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RechargeFailedOrderEntityExample example, boolean includeExamplePhrase) {
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