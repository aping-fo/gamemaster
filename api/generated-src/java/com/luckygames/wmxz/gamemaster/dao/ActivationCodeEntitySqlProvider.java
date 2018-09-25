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
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInvalidTime() != null) {
            sql.VALUES("invalid_time", "#{invalidTime,jdbcType=VARCHAR}");
        }
        
        if (record.getOverdueTime() != null) {
            sql.VALUES("overdue_time", "#{overdueTime,jdbcType=VARCHAR}");
        }
        
        if (record.getRemarks() != null) {
            sql.VALUES("remarks", "#{remarks,jdbcType=VARCHAR}");
        }
        
        if (record.getUniversal() != null) {
            sql.VALUES("universal", "#{universal,jdbcType=INTEGER}");
        }
        
        if (record.getUseTime() != null) {
            sql.VALUES("use_time", "#{useTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUsePlayerId() != null) {
            sql.VALUES("use_player_id", "#{usePlayerId,jdbcType=INTEGER}");
        }
        
        if (record.getUsePlayerName() != null) {
            sql.VALUES("use_player_name", "#{usePlayerName,jdbcType=VARCHAR}");
        }
        
        if (record.getUsePlayerAccount() != null) {
            sql.VALUES("use_player_account", "#{usePlayerAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getUseServerId() != null) {
            sql.VALUES("use_server_id", "#{useServerId,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("`name`", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getRewards() != null) {
            sql.VALUES("rewards", "#{rewards,jdbcType=VARCHAR}");
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
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("invalid_time");
        sql.SELECT("overdue_time");
        sql.SELECT("remarks");
        sql.SELECT("universal");
        sql.SELECT("use_time");
        sql.SELECT("use_player_id");
        sql.SELECT("use_player_name");
        sql.SELECT("use_player_account");
        sql.SELECT("use_server_id");
        sql.SELECT("`name`");
        sql.SELECT("rewards");
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
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInvalidTime() != null) {
            sql.SET("invalid_time = #{record.invalidTime,jdbcType=VARCHAR}");
        }
        
        if (record.getOverdueTime() != null) {
            sql.SET("overdue_time = #{record.overdueTime,jdbcType=VARCHAR}");
        }
        
        if (record.getRemarks() != null) {
            sql.SET("remarks = #{record.remarks,jdbcType=VARCHAR}");
        }
        
        if (record.getUniversal() != null) {
            sql.SET("universal = #{record.universal,jdbcType=INTEGER}");
        }
        
        if (record.getUseTime() != null) {
            sql.SET("use_time = #{record.useTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUsePlayerId() != null) {
            sql.SET("use_player_id = #{record.usePlayerId,jdbcType=INTEGER}");
        }
        
        if (record.getUsePlayerName() != null) {
            sql.SET("use_player_name = #{record.usePlayerName,jdbcType=VARCHAR}");
        }
        
        if (record.getUsePlayerAccount() != null) {
            sql.SET("use_player_account = #{record.usePlayerAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getUseServerId() != null) {
            sql.SET("use_server_id = #{record.useServerId,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getRewards() != null) {
            sql.SET("rewards = #{record.rewards,jdbcType=VARCHAR}");
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
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("invalid_time = #{record.invalidTime,jdbcType=VARCHAR}");
        sql.SET("overdue_time = #{record.overdueTime,jdbcType=VARCHAR}");
        sql.SET("remarks = #{record.remarks,jdbcType=VARCHAR}");
        sql.SET("universal = #{record.universal,jdbcType=INTEGER}");
        sql.SET("use_time = #{record.useTime,jdbcType=TIMESTAMP}");
        sql.SET("use_player_id = #{record.usePlayerId,jdbcType=INTEGER}");
        sql.SET("use_player_name = #{record.usePlayerName,jdbcType=VARCHAR}");
        sql.SET("use_player_account = #{record.usePlayerAccount,jdbcType=VARCHAR}");
        sql.SET("use_server_id = #{record.useServerId,jdbcType=VARCHAR}");
        sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        sql.SET("rewards = #{record.rewards,jdbcType=VARCHAR}");
        
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