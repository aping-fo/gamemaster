package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntity;
import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.DataCollectionEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DataCollectionEntitySqlProvider {

    public String countByExample(DataCollectionEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("comprehensive_report_data_collection");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DataCollectionEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("comprehensive_report_data_collection");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(DataCollectionEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("comprehensive_report_data_collection");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getReportDate() != null) {
            sql.VALUES("report_date", "#{reportDate,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterNumber() != null) {
            sql.VALUES("register_number", "#{registerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getRoleNumber() != null) {
            sql.VALUES("role_number", "#{roleNumber,jdbcType=BIGINT}");
        }
        
        if (record.getLoginNumber() != null) {
            sql.VALUES("login_number", "#{loginNumber,jdbcType=BIGINT}");
        }
        
        if (record.getActiveNumber() != null) {
            sql.VALUES("active_number", "#{activeNumber,jdbcType=BIGINT}");
        }
        
        if (record.getOldPlayerNumber() != null) {
            sql.VALUES("old_player_number", "#{oldPlayerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getPayNumber() != null) {
            sql.VALUES("pay_number", "#{payNumber,jdbcType=BIGINT}");
        }
        
        if (record.getRechargeAmount() != null) {
            sql.VALUES("recharge_amount", "#{rechargeAmount,jdbcType=BIGINT}");
        }
        
        if (record.getPayRate() != null) {
            sql.VALUES("pay_rate", "#{payRate,jdbcType=DECIMAL}");
        }
        
        if (record.getPayArpu() != null) {
            sql.VALUES("pay_arpu", "#{payArpu,jdbcType=DECIMAL}");
        }
        
        if (record.getNewPayNumber() != null) {
            sql.VALUES("new_pay_number", "#{newPayNumber,jdbcType=BIGINT}");
        }
        
        if (record.getNewPayRate() != null) {
            sql.VALUES("new_pay_rate", "#{newPayRate,jdbcType=DECIMAL}");
        }
        
        if (record.getNewRechargeAmount() != null) {
            sql.VALUES("new_recharge_amount", "#{newRechargeAmount,jdbcType=BIGINT}");
        }
        
        if (record.getNewPayArpu() != null) {
            sql.VALUES("new_pay_arpu", "#{newPayArpu,jdbcType=DECIMAL}");
        }
        
        if (record.getOldPayNumber() != null) {
            sql.VALUES("old_pay_number", "#{oldPayNumber,jdbcType=BIGINT}");
        }
        
        if (record.getOldRechargeAmount() != null) {
            sql.VALUES("old_recharge_amount", "#{oldRechargeAmount,jdbcType=BIGINT}");
        }
        
        if (record.getOldPayRate() != null) {
            sql.VALUES("old_pay_rate", "#{oldPayRate,jdbcType=DECIMAL}");
        }
        
        if (record.getOldPayArpu() != null) {
            sql.VALUES("old_pay_arpu", "#{oldPayArpu,jdbcType=DECIMAL}");
        }
        
        if (record.getNextDayAvg() != null) {
            sql.VALUES("next_day_avg", "#{nextDayAvg,jdbcType=DECIMAL}");
        }
        
        if (record.getThreeDayAvg() != null) {
            sql.VALUES("three_day_avg", "#{threeDayAvg,jdbcType=DECIMAL}");
        }
        
        if (record.getSevenDayAvg() != null) {
            sql.VALUES("seven_day_avg", "#{sevenDayAvg,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
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
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageName() != null) {
            sql.VALUES("package_name", "#{packageName,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageId() != null) {
            sql.VALUES("package_id", "#{packageId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(DataCollectionEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("report_date");
        sql.SELECT("register_number");
        sql.SELECT("role_number");
        sql.SELECT("login_number");
        sql.SELECT("active_number");
        sql.SELECT("old_player_number");
        sql.SELECT("pay_number");
        sql.SELECT("recharge_amount");
        sql.SELECT("pay_rate");
        sql.SELECT("pay_arpu");
        sql.SELECT("new_pay_number");
        sql.SELECT("new_pay_rate");
        sql.SELECT("new_recharge_amount");
        sql.SELECT("new_pay_arpu");
        sql.SELECT("old_pay_number");
        sql.SELECT("old_recharge_amount");
        sql.SELECT("old_pay_rate");
        sql.SELECT("old_pay_arpu");
        sql.SELECT("next_day_avg");
        sql.SELECT("three_day_avg");
        sql.SELECT("seven_day_avg");
        sql.SELECT("channel_id");
        sql.SELECT("server_id");
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("channel_name");
        sql.SELECT("`server_name`");
        sql.SELECT("package_name");
        sql.SELECT("package_id");
        sql.FROM("comprehensive_report_data_collection");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        DataCollectionEntity record = (DataCollectionEntity) parameter.get("record");
        DataCollectionEntityExample example = (DataCollectionEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("comprehensive_report_data_collection");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getReportDate() != null) {
            sql.SET("report_date = #{record.reportDate,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterNumber() != null) {
            sql.SET("register_number = #{record.registerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getRoleNumber() != null) {
            sql.SET("role_number = #{record.roleNumber,jdbcType=BIGINT}");
        }
        
        if (record.getLoginNumber() != null) {
            sql.SET("login_number = #{record.loginNumber,jdbcType=BIGINT}");
        }
        
        if (record.getActiveNumber() != null) {
            sql.SET("active_number = #{record.activeNumber,jdbcType=BIGINT}");
        }
        
        if (record.getOldPlayerNumber() != null) {
            sql.SET("old_player_number = #{record.oldPlayerNumber,jdbcType=BIGINT}");
        }
        
        if (record.getPayNumber() != null) {
            sql.SET("pay_number = #{record.payNumber,jdbcType=BIGINT}");
        }
        
        if (record.getRechargeAmount() != null) {
            sql.SET("recharge_amount = #{record.rechargeAmount,jdbcType=BIGINT}");
        }
        
        if (record.getPayRate() != null) {
            sql.SET("pay_rate = #{record.payRate,jdbcType=DECIMAL}");
        }
        
        if (record.getPayArpu() != null) {
            sql.SET("pay_arpu = #{record.payArpu,jdbcType=DECIMAL}");
        }
        
        if (record.getNewPayNumber() != null) {
            sql.SET("new_pay_number = #{record.newPayNumber,jdbcType=BIGINT}");
        }
        
        if (record.getNewPayRate() != null) {
            sql.SET("new_pay_rate = #{record.newPayRate,jdbcType=DECIMAL}");
        }
        
        if (record.getNewRechargeAmount() != null) {
            sql.SET("new_recharge_amount = #{record.newRechargeAmount,jdbcType=BIGINT}");
        }
        
        if (record.getNewPayArpu() != null) {
            sql.SET("new_pay_arpu = #{record.newPayArpu,jdbcType=DECIMAL}");
        }
        
        if (record.getOldPayNumber() != null) {
            sql.SET("old_pay_number = #{record.oldPayNumber,jdbcType=BIGINT}");
        }
        
        if (record.getOldRechargeAmount() != null) {
            sql.SET("old_recharge_amount = #{record.oldRechargeAmount,jdbcType=BIGINT}");
        }
        
        if (record.getOldPayRate() != null) {
            sql.SET("old_pay_rate = #{record.oldPayRate,jdbcType=DECIMAL}");
        }
        
        if (record.getOldPayArpu() != null) {
            sql.SET("old_pay_arpu = #{record.oldPayArpu,jdbcType=DECIMAL}");
        }
        
        if (record.getNextDayAvg() != null) {
            sql.SET("next_day_avg = #{record.nextDayAvg,jdbcType=DECIMAL}");
        }
        
        if (record.getThreeDayAvg() != null) {
            sql.SET("three_day_avg = #{record.threeDayAvg,jdbcType=DECIMAL}");
        }
        
        if (record.getSevenDayAvg() != null) {
            sql.SET("seven_day_avg = #{record.sevenDayAvg,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
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
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageName() != null) {
            sql.SET("package_name = #{record.packageName,jdbcType=VARCHAR}");
        }
        
        if (record.getPackageId() != null) {
            sql.SET("package_id = #{record.packageId,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("comprehensive_report_data_collection");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("report_date = #{record.reportDate,jdbcType=VARCHAR}");
        sql.SET("register_number = #{record.registerNumber,jdbcType=BIGINT}");
        sql.SET("role_number = #{record.roleNumber,jdbcType=BIGINT}");
        sql.SET("login_number = #{record.loginNumber,jdbcType=BIGINT}");
        sql.SET("active_number = #{record.activeNumber,jdbcType=BIGINT}");
        sql.SET("old_player_number = #{record.oldPlayerNumber,jdbcType=BIGINT}");
        sql.SET("pay_number = #{record.payNumber,jdbcType=BIGINT}");
        sql.SET("recharge_amount = #{record.rechargeAmount,jdbcType=BIGINT}");
        sql.SET("pay_rate = #{record.payRate,jdbcType=DECIMAL}");
        sql.SET("pay_arpu = #{record.payArpu,jdbcType=DECIMAL}");
        sql.SET("new_pay_number = #{record.newPayNumber,jdbcType=BIGINT}");
        sql.SET("new_pay_rate = #{record.newPayRate,jdbcType=DECIMAL}");
        sql.SET("new_recharge_amount = #{record.newRechargeAmount,jdbcType=BIGINT}");
        sql.SET("new_pay_arpu = #{record.newPayArpu,jdbcType=DECIMAL}");
        sql.SET("old_pay_number = #{record.oldPayNumber,jdbcType=BIGINT}");
        sql.SET("old_recharge_amount = #{record.oldRechargeAmount,jdbcType=BIGINT}");
        sql.SET("old_pay_rate = #{record.oldPayRate,jdbcType=DECIMAL}");
        sql.SET("old_pay_arpu = #{record.oldPayArpu,jdbcType=DECIMAL}");
        sql.SET("next_day_avg = #{record.nextDayAvg,jdbcType=DECIMAL}");
        sql.SET("three_day_avg = #{record.threeDayAvg,jdbcType=DECIMAL}");
        sql.SET("seven_day_avg = #{record.sevenDayAvg,jdbcType=DECIMAL}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("package_name = #{record.packageName,jdbcType=VARCHAR}");
        sql.SET("package_id = #{record.packageId,jdbcType=INTEGER}");
        
        DataCollectionEntityExample example = (DataCollectionEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, DataCollectionEntityExample example, boolean includeExamplePhrase) {
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