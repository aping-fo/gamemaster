package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.ChargeLogEntity;
import com.luckygames.wmxz.gamemaster.dao.ChargeLogEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.ChargeLogEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.ChargeLogEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ChargeLogEntitySqlProvider {

    public String countByExample(ChargeLogEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("charge_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ChargeLogEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("charge_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ChargeLogEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("charge_log");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getRoleId() != null) {
            sql.VALUES("role_id", "#{roleId,jdbcType=INTEGER}");
        }
        
        if (record.getRoleName() != null) {
            sql.VALUES("role_name", "#{roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getChargeId() != null) {
            sql.VALUES("charge_id", "#{chargeId,jdbcType=INTEGER}");
        }
        
        if (record.getChargeType() != null) {
            sql.VALUES("charge_type", "#{chargeType,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=REAL}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPaymentType() != null) {
            sql.VALUES("payment_type", "#{paymentType,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ChargeLogEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("role_id");
        sql.SELECT("role_name");
        sql.SELECT("charge_id");
        sql.SELECT("charge_type");
        sql.SELECT("amount");
        sql.SELECT("channel_id");
        sql.SELECT("create_time");
        sql.SELECT("payment_type");
        sql.SELECT("server_id");
        sql.FROM("charge_log");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ChargeLogEntity record = (ChargeLogEntity) parameter.get("record");
        ChargeLogEntityExample example = (ChargeLogEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("charge_log");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getRoleId() != null) {
            sql.SET("role_id = #{record.roleId,jdbcType=INTEGER}");
        }
        
        if (record.getRoleName() != null) {
            sql.SET("role_name = #{record.roleName,jdbcType=VARCHAR}");
        }
        
        if (record.getChargeId() != null) {
            sql.SET("charge_id = #{record.chargeId,jdbcType=INTEGER}");
        }
        
        if (record.getChargeType() != null) {
            sql.SET("charge_type = #{record.chargeType,jdbcType=VARCHAR}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{record.amount,jdbcType=REAL}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPaymentType() != null) {
            sql.SET("payment_type = #{record.paymentType,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("charge_log");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("role_id = #{record.roleId,jdbcType=INTEGER}");
        sql.SET("role_name = #{record.roleName,jdbcType=VARCHAR}");
        sql.SET("charge_id = #{record.chargeId,jdbcType=INTEGER}");
        sql.SET("charge_type = #{record.chargeType,jdbcType=VARCHAR}");
        sql.SET("amount = #{record.amount,jdbcType=REAL}");
        sql.SET("channel_id = #{record.channelId,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("payment_type = #{record.paymentType,jdbcType=VARCHAR}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        
        ChargeLogEntityExample example = (ChargeLogEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ChargeLogEntityExample example, boolean includeExamplePhrase) {
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