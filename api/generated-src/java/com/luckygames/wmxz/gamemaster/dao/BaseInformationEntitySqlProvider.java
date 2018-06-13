package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.BaseInformationEntity;
import com.luckygames.wmxz.gamemaster.dao.BaseInformationEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.BaseInformationEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.BaseInformationEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class BaseInformationEntitySqlProvider {

    public String countByExample(BaseInformationEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("base_information");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(BaseInformationEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("base_information");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(BaseInformationEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("base_information");
        
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
        
        if (record.getCharId() != null) {
            sql.VALUES("char_id", "#{charId,jdbcType=INTEGER}");
        }
        
        if (record.getAccount() != null) {
            sql.VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getCharName() != null) {
            sql.VALUES("char_name", "#{charName,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.VALUES("`level`", "#{level,jdbcType=INTEGER}");
        }
        
        if (record.getSlaughter() != null) {
            sql.VALUES("slaughter", "#{slaughter,jdbcType=INTEGER}");
        }
        
        if (record.getKillingNumber() != null) {
            sql.VALUES("killing_number", "#{killingNumber,jdbcType=INTEGER}");
        }
        
        if (record.getVipLevel() != null) {
            sql.VALUES("VIP_level", "#{vipLevel,jdbcType=INTEGER}");
        }
        
        if (record.getAccountAuthority() != null) {
            sql.VALUES("account_authority", "#{accountAuthority,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getCombatPower() != null) {
            sql.VALUES("combat_power", "#{combatPower,jdbcType=INTEGER}");
        }
        
        if (record.getGangs() != null) {
            sql.VALUES("gangs", "#{gangs,jdbcType=VARCHAR}");
        }
        
        if (record.getExp() != null) {
            sql.VALUES("`exp`", "#{exp,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeTreasure() != null) {
            sql.VALUES("recharge_treasure", "#{rechargeTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeNumber() != null) {
            sql.VALUES("recharge_number", "#{rechargeNumber,jdbcType=INTEGER}");
        }
        
        if (record.getFirstChargeTime() != null) {
            sql.VALUES("first_charge_time", "#{firstChargeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastChargeTime() != null) {
            sql.VALUES("last_charge_time", "#{lastChargeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNonRechargeDays() != null) {
            sql.VALUES("non_recharge_days", "#{nonRechargeDays,jdbcType=INTEGER}");
        }
        
        if (record.getSurplusTreasure() != null) {
            sql.VALUES("surplus_treasure", "#{surplusTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getConsumesTreasure() != null) {
            sql.VALUES("consumes_treasure", "#{consumesTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getSurplusBindingTreasure() != null) {
            sql.VALUES("surplus_binding_treasure", "#{surplusBindingTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getConsumesBindingTreasure() != null) {
            sql.VALUES("consumes_binding_treasure", "#{consumesBindingTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getSurplusMoney() != null) {
            sql.VALUES("surplus_money", "#{surplusMoney,jdbcType=INTEGER}");
        }
        
        if (record.getConsumesMoney() != null) {
            sql.VALUES("consumes_money", "#{consumesMoney,jdbcType=INTEGER}");
        }
        
        if (record.getSurplusBindingMoney() != null) {
            sql.VALUES("surplus_binding_money", "#{surplusBindingMoney,jdbcType=INTEGER}");
        }
        
        if (record.getConsumesBindingMoney() != null) {
            sql.VALUES("consumes_binding_money", "#{consumesBindingMoney,jdbcType=INTEGER}");
        }
        
        if (record.getLoginTime() != null) {
            sql.VALUES("login_time", "#{loginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLoginIp() != null) {
            sql.VALUES("login_ip", "#{loginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getNetworkEnvironment() != null) {
            sql.VALUES("network_environment", "#{networkEnvironment,jdbcType=VARCHAR}");
        }
        
        if (record.getMac() != null) {
            sql.VALUES("mac", "#{mac,jdbcType=VARCHAR}");
        }
        
        if (record.getModel() != null) {
            sql.VALUES("model", "#{model,jdbcType=VARCHAR}");
        }
        
        if (record.getSystemVersion() != null) {
            sql.VALUES("system_version", "#{systemVersion,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(BaseInformationEntityExample example) {
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
        sql.SELECT("char_id");
        sql.SELECT("account");
        sql.SELECT("char_name");
        sql.SELECT("`level`");
        sql.SELECT("slaughter");
        sql.SELECT("killing_number");
        sql.SELECT("VIP_level");
        sql.SELECT("account_authority");
        sql.SELECT("sex");
        sql.SELECT("combat_power");
        sql.SELECT("gangs");
        sql.SELECT("`exp`");
        sql.SELECT("recharge_treasure");
        sql.SELECT("recharge_number");
        sql.SELECT("first_charge_time");
        sql.SELECT("last_charge_time");
        sql.SELECT("non_recharge_days");
        sql.SELECT("surplus_treasure");
        sql.SELECT("consumes_treasure");
        sql.SELECT("surplus_binding_treasure");
        sql.SELECT("consumes_binding_treasure");
        sql.SELECT("surplus_money");
        sql.SELECT("consumes_money");
        sql.SELECT("surplus_binding_money");
        sql.SELECT("consumes_binding_money");
        sql.SELECT("login_time");
        sql.SELECT("login_ip");
        sql.SELECT("network_environment");
        sql.SELECT("mac");
        sql.SELECT("model");
        sql.SELECT("system_version");
        sql.FROM("base_information");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        BaseInformationEntity record = (BaseInformationEntity) parameter.get("record");
        BaseInformationEntityExample example = (BaseInformationEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("base_information");
        
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
        
        if (record.getCharId() != null) {
            sql.SET("char_id = #{record.charId,jdbcType=INTEGER}");
        }
        
        if (record.getAccount() != null) {
            sql.SET("account = #{record.account,jdbcType=VARCHAR}");
        }
        
        if (record.getCharName() != null) {
            sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("`level` = #{record.level,jdbcType=INTEGER}");
        }
        
        if (record.getSlaughter() != null) {
            sql.SET("slaughter = #{record.slaughter,jdbcType=INTEGER}");
        }
        
        if (record.getKillingNumber() != null) {
            sql.SET("killing_number = #{record.killingNumber,jdbcType=INTEGER}");
        }
        
        if (record.getVipLevel() != null) {
            sql.SET("VIP_level = #{record.vipLevel,jdbcType=INTEGER}");
        }
        
        if (record.getAccountAuthority() != null) {
            sql.SET("account_authority = #{record.accountAuthority,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        }
        
        if (record.getCombatPower() != null) {
            sql.SET("combat_power = #{record.combatPower,jdbcType=INTEGER}");
        }
        
        if (record.getGangs() != null) {
            sql.SET("gangs = #{record.gangs,jdbcType=VARCHAR}");
        }
        
        if (record.getExp() != null) {
            sql.SET("`exp` = #{record.exp,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeTreasure() != null) {
            sql.SET("recharge_treasure = #{record.rechargeTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeNumber() != null) {
            sql.SET("recharge_number = #{record.rechargeNumber,jdbcType=INTEGER}");
        }
        
        if (record.getFirstChargeTime() != null) {
            sql.SET("first_charge_time = #{record.firstChargeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastChargeTime() != null) {
            sql.SET("last_charge_time = #{record.lastChargeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getNonRechargeDays() != null) {
            sql.SET("non_recharge_days = #{record.nonRechargeDays,jdbcType=INTEGER}");
        }
        
        if (record.getSurplusTreasure() != null) {
            sql.SET("surplus_treasure = #{record.surplusTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getConsumesTreasure() != null) {
            sql.SET("consumes_treasure = #{record.consumesTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getSurplusBindingTreasure() != null) {
            sql.SET("surplus_binding_treasure = #{record.surplusBindingTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getConsumesBindingTreasure() != null) {
            sql.SET("consumes_binding_treasure = #{record.consumesBindingTreasure,jdbcType=INTEGER}");
        }
        
        if (record.getSurplusMoney() != null) {
            sql.SET("surplus_money = #{record.surplusMoney,jdbcType=INTEGER}");
        }
        
        if (record.getConsumesMoney() != null) {
            sql.SET("consumes_money = #{record.consumesMoney,jdbcType=INTEGER}");
        }
        
        if (record.getSurplusBindingMoney() != null) {
            sql.SET("surplus_binding_money = #{record.surplusBindingMoney,jdbcType=INTEGER}");
        }
        
        if (record.getConsumesBindingMoney() != null) {
            sql.SET("consumes_binding_money = #{record.consumesBindingMoney,jdbcType=INTEGER}");
        }
        
        if (record.getLoginTime() != null) {
            sql.SET("login_time = #{record.loginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLoginIp() != null) {
            sql.SET("login_ip = #{record.loginIp,jdbcType=VARCHAR}");
        }
        
        if (record.getNetworkEnvironment() != null) {
            sql.SET("network_environment = #{record.networkEnvironment,jdbcType=VARCHAR}");
        }
        
        if (record.getMac() != null) {
            sql.SET("mac = #{record.mac,jdbcType=VARCHAR}");
        }
        
        if (record.getModel() != null) {
            sql.SET("model = #{record.model,jdbcType=VARCHAR}");
        }
        
        if (record.getSystemVersion() != null) {
            sql.SET("system_version = #{record.systemVersion,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("base_information");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("char_id = #{record.charId,jdbcType=INTEGER}");
        sql.SET("account = #{record.account,jdbcType=VARCHAR}");
        sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        sql.SET("`level` = #{record.level,jdbcType=INTEGER}");
        sql.SET("slaughter = #{record.slaughter,jdbcType=INTEGER}");
        sql.SET("killing_number = #{record.killingNumber,jdbcType=INTEGER}");
        sql.SET("VIP_level = #{record.vipLevel,jdbcType=INTEGER}");
        sql.SET("account_authority = #{record.accountAuthority,jdbcType=INTEGER}");
        sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        sql.SET("combat_power = #{record.combatPower,jdbcType=INTEGER}");
        sql.SET("gangs = #{record.gangs,jdbcType=VARCHAR}");
        sql.SET("`exp` = #{record.exp,jdbcType=INTEGER}");
        sql.SET("recharge_treasure = #{record.rechargeTreasure,jdbcType=INTEGER}");
        sql.SET("recharge_number = #{record.rechargeNumber,jdbcType=INTEGER}");
        sql.SET("first_charge_time = #{record.firstChargeTime,jdbcType=TIMESTAMP}");
        sql.SET("last_charge_time = #{record.lastChargeTime,jdbcType=TIMESTAMP}");
        sql.SET("non_recharge_days = #{record.nonRechargeDays,jdbcType=INTEGER}");
        sql.SET("surplus_treasure = #{record.surplusTreasure,jdbcType=INTEGER}");
        sql.SET("consumes_treasure = #{record.consumesTreasure,jdbcType=INTEGER}");
        sql.SET("surplus_binding_treasure = #{record.surplusBindingTreasure,jdbcType=INTEGER}");
        sql.SET("consumes_binding_treasure = #{record.consumesBindingTreasure,jdbcType=INTEGER}");
        sql.SET("surplus_money = #{record.surplusMoney,jdbcType=INTEGER}");
        sql.SET("consumes_money = #{record.consumesMoney,jdbcType=INTEGER}");
        sql.SET("surplus_binding_money = #{record.surplusBindingMoney,jdbcType=INTEGER}");
        sql.SET("consumes_binding_money = #{record.consumesBindingMoney,jdbcType=INTEGER}");
        sql.SET("login_time = #{record.loginTime,jdbcType=TIMESTAMP}");
        sql.SET("login_ip = #{record.loginIp,jdbcType=VARCHAR}");
        sql.SET("network_environment = #{record.networkEnvironment,jdbcType=VARCHAR}");
        sql.SET("mac = #{record.mac,jdbcType=VARCHAR}");
        sql.SET("model = #{record.model,jdbcType=VARCHAR}");
        sql.SET("system_version = #{record.systemVersion,jdbcType=VARCHAR}");
        
        BaseInformationEntityExample example = (BaseInformationEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, BaseInformationEntityExample example, boolean includeExamplePhrase) {
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