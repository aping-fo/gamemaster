package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.RechargeDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailyEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailyEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.RechargeDailyEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RechargeDailyEntitySqlProvider {

    public String countByExample(RechargeDailyEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("recharge_daily");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RechargeDailyEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("recharge_daily");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(RechargeDailyEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("recharge_daily");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getReportDate() != null) {
            sql.VALUES("report_date", "#{reportDate,jdbcType=VARCHAR}");
        }
        
        if (record.getRechargeSum() != null) {
            sql.VALUES("recharge_sum", "#{rechargeSum,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeAmount() != null) {
            sql.VALUES("recharge_amount", "#{rechargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAppendSum() != null) {
            sql.VALUES("append_sum", "#{appendSum,jdbcType=INTEGER}");
        }
        
        if (record.getAppendAmount() != null) {
            sql.VALUES("append_amount", "#{appendAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getGoldSum() != null) {
            sql.VALUES("gold_sum", "#{goldSum,jdbcType=INTEGER}");
        }
        
        if (record.getGoldAppend() != null) {
            sql.VALUES("gold_append", "#{goldAppend,jdbcType=INTEGER}");
        }
        
        if (record.getArpuSum() != null) {
            sql.VALUES("arpu_sum", "#{arpuSum,jdbcType=DECIMAL}");
        }
        
        if (record.getArpuAppend() != null) {
            sql.VALUES("arpu_append", "#{arpuAppend,jdbcType=DECIMAL}");
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
        
        return sql.toString();
    }

    public String selectByExample(RechargeDailyEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("channel_id");
        sql.SELECT("server_id");
        sql.SELECT("report_date");
        sql.SELECT("recharge_sum");
        sql.SELECT("recharge_amount");
        sql.SELECT("append_sum");
        sql.SELECT("append_amount");
        sql.SELECT("gold_sum");
        sql.SELECT("gold_append");
        sql.SELECT("arpu_sum");
        sql.SELECT("arpu_append");
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("recharge_daily");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        RechargeDailyEntity record = (RechargeDailyEntity) parameter.get("record");
        RechargeDailyEntityExample example = (RechargeDailyEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("recharge_daily");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getReportDate() != null) {
            sql.SET("report_date = #{record.reportDate,jdbcType=VARCHAR}");
        }
        
        if (record.getRechargeSum() != null) {
            sql.SET("recharge_sum = #{record.rechargeSum,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeAmount() != null) {
            sql.SET("recharge_amount = #{record.rechargeAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getAppendSum() != null) {
            sql.SET("append_sum = #{record.appendSum,jdbcType=INTEGER}");
        }
        
        if (record.getAppendAmount() != null) {
            sql.SET("append_amount = #{record.appendAmount,jdbcType=DECIMAL}");
        }
        
        if (record.getGoldSum() != null) {
            sql.SET("gold_sum = #{record.goldSum,jdbcType=INTEGER}");
        }
        
        if (record.getGoldAppend() != null) {
            sql.SET("gold_append = #{record.goldAppend,jdbcType=INTEGER}");
        }
        
        if (record.getArpuSum() != null) {
            sql.SET("arpu_sum = #{record.arpuSum,jdbcType=DECIMAL}");
        }
        
        if (record.getArpuAppend() != null) {
            sql.SET("arpu_append = #{record.arpuAppend,jdbcType=DECIMAL}");
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
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("recharge_daily");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("report_date = #{record.reportDate,jdbcType=VARCHAR}");
        sql.SET("recharge_sum = #{record.rechargeSum,jdbcType=INTEGER}");
        sql.SET("recharge_amount = #{record.rechargeAmount,jdbcType=DECIMAL}");
        sql.SET("append_sum = #{record.appendSum,jdbcType=INTEGER}");
        sql.SET("append_amount = #{record.appendAmount,jdbcType=DECIMAL}");
        sql.SET("gold_sum = #{record.goldSum,jdbcType=INTEGER}");
        sql.SET("gold_append = #{record.goldAppend,jdbcType=INTEGER}");
        sql.SET("arpu_sum = #{record.arpuSum,jdbcType=DECIMAL}");
        sql.SET("arpu_append = #{record.arpuAppend,jdbcType=DECIMAL}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        RechargeDailyEntityExample example = (RechargeDailyEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RechargeDailyEntityExample example, boolean includeExamplePhrase) {
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