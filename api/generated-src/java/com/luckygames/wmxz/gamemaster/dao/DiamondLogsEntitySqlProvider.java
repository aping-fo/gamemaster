package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntityExample;
import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntityWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DiamondLogsEntitySqlProvider {

    public String countByExample(DiamondLogsEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("players_diamond_logs");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DiamondLogsEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("players_diamond_logs");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(DiamondLogsEntityWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("players_diamond_logs");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getPlayerId() != null) {
            sql.VALUES("player_id", "#{playerId,jdbcType=INTEGER}");
        }
        
        if (record.getUserCode() != null) {
            sql.VALUES("user_code", "#{userCode,jdbcType=VARCHAR}");
        }
        
        if (record.getItemId() != null) {
            sql.VALUES("item_id", "#{itemId,jdbcType=INTEGER}");
        }
        
        if (record.getItemType() != null) {
            sql.VALUES("item_type", "#{itemType,jdbcType=INTEGER}");
        }
        
        if (record.getOpType() != null) {
            sql.VALUES("op_type", "#{opType,jdbcType=INTEGER}");
        }
        
        if (record.getSourceType() != null) {
            sql.VALUES("source_type", "#{sourceType,jdbcType=INTEGER}");
        }
        
        if (record.getAction() != null) {
            sql.VALUES("`action`", "#{action,jdbcType=VARCHAR}");
        }
        
        if (record.getFreeMoney() != null) {
            sql.VALUES("free_money", "#{freeMoney,jdbcType=INTEGER}");
        }
        
        if (record.getPaidMoney() != null) {
            sql.VALUES("paid_money", "#{paidMoney,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCostInfo() != null) {
            sql.VALUES("cost_info", "#{costInfo,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getGetInfo() != null) {
            sql.VALUES("get_info", "#{getInfo,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(DiamondLogsEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("player_id");
        sql.SELECT("user_code");
        sql.SELECT("item_id");
        sql.SELECT("item_type");
        sql.SELECT("op_type");
        sql.SELECT("source_type");
        sql.SELECT("`action`");
        sql.SELECT("free_money");
        sql.SELECT("paid_money");
        sql.SELECT("create_time");
        sql.SELECT("cost_info");
        sql.SELECT("get_info");
        sql.FROM("players_diamond_logs");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(DiamondLogsEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("player_id");
        sql.SELECT("user_code");
        sql.SELECT("item_id");
        sql.SELECT("item_type");
        sql.SELECT("op_type");
        sql.SELECT("source_type");
        sql.SELECT("`action`");
        sql.SELECT("free_money");
        sql.SELECT("paid_money");
        sql.SELECT("create_time");
        sql.FROM("players_diamond_logs");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        DiamondLogsEntityWithBLOBs record = (DiamondLogsEntityWithBLOBs) parameter.get("record");
        DiamondLogsEntityExample example = (DiamondLogsEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("players_diamond_logs");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getPlayerId() != null) {
            sql.SET("player_id = #{record.playerId,jdbcType=INTEGER}");
        }
        
        if (record.getUserCode() != null) {
            sql.SET("user_code = #{record.userCode,jdbcType=VARCHAR}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{record.itemId,jdbcType=INTEGER}");
        }
        
        if (record.getItemType() != null) {
            sql.SET("item_type = #{record.itemType,jdbcType=INTEGER}");
        }
        
        if (record.getOpType() != null) {
            sql.SET("op_type = #{record.opType,jdbcType=INTEGER}");
        }
        
        if (record.getSourceType() != null) {
            sql.SET("source_type = #{record.sourceType,jdbcType=INTEGER}");
        }
        
        if (record.getAction() != null) {
            sql.SET("`action` = #{record.action,jdbcType=VARCHAR}");
        }
        
        if (record.getFreeMoney() != null) {
            sql.SET("free_money = #{record.freeMoney,jdbcType=INTEGER}");
        }
        
        if (record.getPaidMoney() != null) {
            sql.SET("paid_money = #{record.paidMoney,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCostInfo() != null) {
            sql.SET("cost_info = #{record.costInfo,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getGetInfo() != null) {
            sql.SET("get_info = #{record.getInfo,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("players_diamond_logs");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("player_id = #{record.playerId,jdbcType=INTEGER}");
        sql.SET("user_code = #{record.userCode,jdbcType=VARCHAR}");
        sql.SET("item_id = #{record.itemId,jdbcType=INTEGER}");
        sql.SET("item_type = #{record.itemType,jdbcType=INTEGER}");
        sql.SET("op_type = #{record.opType,jdbcType=INTEGER}");
        sql.SET("source_type = #{record.sourceType,jdbcType=INTEGER}");
        sql.SET("`action` = #{record.action,jdbcType=VARCHAR}");
        sql.SET("free_money = #{record.freeMoney,jdbcType=INTEGER}");
        sql.SET("paid_money = #{record.paidMoney,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("cost_info = #{record.costInfo,jdbcType=LONGVARCHAR}");
        sql.SET("get_info = #{record.getInfo,jdbcType=LONGVARCHAR}");
        
        DiamondLogsEntityExample example = (DiamondLogsEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("players_diamond_logs");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("player_id = #{record.playerId,jdbcType=INTEGER}");
        sql.SET("user_code = #{record.userCode,jdbcType=VARCHAR}");
        sql.SET("item_id = #{record.itemId,jdbcType=INTEGER}");
        sql.SET("item_type = #{record.itemType,jdbcType=INTEGER}");
        sql.SET("op_type = #{record.opType,jdbcType=INTEGER}");
        sql.SET("source_type = #{record.sourceType,jdbcType=INTEGER}");
        sql.SET("`action` = #{record.action,jdbcType=VARCHAR}");
        sql.SET("free_money = #{record.freeMoney,jdbcType=INTEGER}");
        sql.SET("paid_money = #{record.paidMoney,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        DiamondLogsEntityExample example = (DiamondLogsEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, DiamondLogsEntityExample example, boolean includeExamplePhrase) {
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