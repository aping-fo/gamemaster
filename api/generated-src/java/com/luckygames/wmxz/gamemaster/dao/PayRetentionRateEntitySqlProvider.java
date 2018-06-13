package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateEntity;
import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PayRetentionRateEntitySqlProvider {

    public String countByExample(PayRetentionRateEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("pay_retention_rate");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PayRetentionRateEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("pay_retention_rate");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PayRetentionRateEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pay_retention_rate");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getReportDate() != null) {
            sql.VALUES("report_date", "#{reportDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserCount() != null) {
            sql.VALUES("user_count", "#{userCount,jdbcType=INTEGER}");
        }
        
        if (record.getOneDay() != null) {
            sql.VALUES("one_day", "#{oneDay,jdbcType=DECIMAL}");
        }
        
        if (record.getTwoDay() != null) {
            sql.VALUES("two_day", "#{twoDay,jdbcType=DECIMAL}");
        }
        
        if (record.getThreeDay() != null) {
            sql.VALUES("three_day", "#{threeDay,jdbcType=DECIMAL}");
        }
        
        if (record.getFourDay() != null) {
            sql.VALUES("four_day", "#{fourDay,jdbcType=DECIMAL}");
        }
        
        if (record.getFiveDay() != null) {
            sql.VALUES("five_day", "#{fiveDay,jdbcType=DECIMAL}");
        }
        
        if (record.getSixDay() != null) {
            sql.VALUES("six_day", "#{sixDay,jdbcType=DECIMAL}");
        }
        
        if (record.getSevenDay() != null) {
            sql.VALUES("seven_day", "#{sevenDay,jdbcType=DECIMAL}");
        }
        
        if (record.getTwoWeeks() != null) {
            sql.VALUES("two_weeks", "#{twoWeeks,jdbcType=DECIMAL}");
        }
        
        if (record.getOneMonth() != null) {
            sql.VALUES("one_month", "#{oneMonth,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
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
        
        return sql.toString();
    }

    public String selectByExample(PayRetentionRateEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("report_date");
        sql.SELECT("user_count");
        sql.SELECT("one_day");
        sql.SELECT("two_day");
        sql.SELECT("three_day");
        sql.SELECT("four_day");
        sql.SELECT("five_day");
        sql.SELECT("six_day");
        sql.SELECT("seven_day");
        sql.SELECT("two_weeks");
        sql.SELECT("one_month");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("`status`");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.FROM("pay_retention_rate");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PayRetentionRateEntity record = (PayRetentionRateEntity) parameter.get("record");
        PayRetentionRateEntityExample example = (PayRetentionRateEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pay_retention_rate");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getReportDate() != null) {
            sql.SET("report_date = #{record.reportDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserCount() != null) {
            sql.SET("user_count = #{record.userCount,jdbcType=INTEGER}");
        }
        
        if (record.getOneDay() != null) {
            sql.SET("one_day = #{record.oneDay,jdbcType=DECIMAL}");
        }
        
        if (record.getTwoDay() != null) {
            sql.SET("two_day = #{record.twoDay,jdbcType=DECIMAL}");
        }
        
        if (record.getThreeDay() != null) {
            sql.SET("three_day = #{record.threeDay,jdbcType=DECIMAL}");
        }
        
        if (record.getFourDay() != null) {
            sql.SET("four_day = #{record.fourDay,jdbcType=DECIMAL}");
        }
        
        if (record.getFiveDay() != null) {
            sql.SET("five_day = #{record.fiveDay,jdbcType=DECIMAL}");
        }
        
        if (record.getSixDay() != null) {
            sql.SET("six_day = #{record.sixDay,jdbcType=DECIMAL}");
        }
        
        if (record.getSevenDay() != null) {
            sql.SET("seven_day = #{record.sevenDay,jdbcType=DECIMAL}");
        }
        
        if (record.getTwoWeeks() != null) {
            sql.SET("two_weeks = #{record.twoWeeks,jdbcType=DECIMAL}");
        }
        
        if (record.getOneMonth() != null) {
            sql.SET("one_month = #{record.oneMonth,jdbcType=DECIMAL}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
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
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("pay_retention_rate");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("report_date = #{record.reportDate,jdbcType=TIMESTAMP}");
        sql.SET("user_count = #{record.userCount,jdbcType=INTEGER}");
        sql.SET("one_day = #{record.oneDay,jdbcType=DECIMAL}");
        sql.SET("two_day = #{record.twoDay,jdbcType=DECIMAL}");
        sql.SET("three_day = #{record.threeDay,jdbcType=DECIMAL}");
        sql.SET("four_day = #{record.fourDay,jdbcType=DECIMAL}");
        sql.SET("five_day = #{record.fiveDay,jdbcType=DECIMAL}");
        sql.SET("six_day = #{record.sixDay,jdbcType=DECIMAL}");
        sql.SET("seven_day = #{record.sevenDay,jdbcType=DECIMAL}");
        sql.SET("two_weeks = #{record.twoWeeks,jdbcType=DECIMAL}");
        sql.SET("one_month = #{record.oneMonth,jdbcType=DECIMAL}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        
        PayRetentionRateEntityExample example = (PayRetentionRateEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PayRetentionRateEntityExample example, boolean includeExamplePhrase) {
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