package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PlayerCharacterEntitySqlProvider {

    public String countByExample(PlayerCharacterEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("player_character");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PlayerCharacterEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("player_character");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PlayerCharacterEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("player_character");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getPlayerId() != null) {
            sql.VALUES("player_id", "#{playerId,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=INTEGER}");
        }
        
        if (record.getCharId() != null) {
            sql.VALUES("char_id", "#{charId,jdbcType=INTEGER}");
        }
        
        if (record.getCharName() != null) {
            sql.VALUES("char_name", "#{charName,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.VALUES("`level`", "#{level,jdbcType=INTEGER}");
        }
        
        if (record.getVipLevel() != null) {
            sql.VALUES("vip_level", "#{vipLevel,jdbcType=INTEGER}");
        }
        
        if (record.getPower() != null) {
            sql.VALUES("`power`", "#{power,jdbcType=INTEGER}");
        }
        
        if (record.getFactionId() != null) {
            sql.VALUES("faction_id", "#{factionId,jdbcType=INTEGER}");
        }
        
        if (record.getFactionName() != null) {
            sql.VALUES("faction_name", "#{factionName,jdbcType=VARCHAR}");
        }
        
        if (record.getJob() != null) {
            sql.VALUES("job", "#{job,jdbcType=VARCHAR}");
        }
        
        if (record.getExp() != null) {
            sql.VALUES("`exp`", "#{exp,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeGold() != null) {
            sql.VALUES("recharge_gold", "#{rechargeGold,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeTimes() != null) {
            sql.VALUES("recharge_times", "#{rechargeTimes,jdbcType=INTEGER}");
        }
        
        if (record.getFirstRechargeTime() != null) {
            sql.VALUES("first_recharge_time", "#{firstRechargeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastRechargeTime() != null) {
            sql.VALUES("last_recharge_time", "#{lastRechargeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLeftGold() != null) {
            sql.VALUES("left_gold", "#{leftGold,jdbcType=INTEGER}");
        }
        
        if (record.getLeftSpecialGold() != null) {
            sql.VALUES("left_special_gold", "#{leftSpecialGold,jdbcType=INTEGER}");
        }
        
        if (record.getUsedSpecialGold() != null) {
            sql.VALUES("used_special_gold", "#{usedSpecialGold,jdbcType=INTEGER}");
        }
        
        if (record.getLeftCoin() != null) {
            sql.VALUES("left_coin", "#{leftCoin,jdbcType=BIGINT}");
        }
        
        if (record.getUsedCoin() != null) {
            sql.VALUES("used_coin", "#{usedCoin,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PlayerCharacterEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("player_id");
        sql.SELECT("server_id");
        sql.SELECT("char_id");
        sql.SELECT("char_name");
        sql.SELECT("sex");
        sql.SELECT("`level`");
        sql.SELECT("vip_level");
        sql.SELECT("`power`");
        sql.SELECT("faction_id");
        sql.SELECT("faction_name");
        sql.SELECT("job");
        sql.SELECT("`exp`");
        sql.SELECT("recharge_gold");
        sql.SELECT("recharge_times");
        sql.SELECT("first_recharge_time");
        sql.SELECT("last_recharge_time");
        sql.SELECT("left_gold");
        sql.SELECT("left_special_gold");
        sql.SELECT("used_special_gold");
        sql.SELECT("left_coin");
        sql.SELECT("used_coin");
        sql.FROM("player_character");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PlayerCharacterEntity record = (PlayerCharacterEntity) parameter.get("record");
        PlayerCharacterEntityExample example = (PlayerCharacterEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("player_character");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getPlayerId() != null) {
            sql.SET("player_id = #{record.playerId,jdbcType=INTEGER}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=INTEGER}");
        }
        
        if (record.getCharId() != null) {
            sql.SET("char_id = #{record.charId,jdbcType=INTEGER}");
        }
        
        if (record.getCharName() != null) {
            sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("`level` = #{record.level,jdbcType=INTEGER}");
        }
        
        if (record.getVipLevel() != null) {
            sql.SET("vip_level = #{record.vipLevel,jdbcType=INTEGER}");
        }
        
        if (record.getPower() != null) {
            sql.SET("`power` = #{record.power,jdbcType=INTEGER}");
        }
        
        if (record.getFactionId() != null) {
            sql.SET("faction_id = #{record.factionId,jdbcType=INTEGER}");
        }
        
        if (record.getFactionName() != null) {
            sql.SET("faction_name = #{record.factionName,jdbcType=VARCHAR}");
        }
        
        if (record.getJob() != null) {
            sql.SET("job = #{record.job,jdbcType=VARCHAR}");
        }
        
        if (record.getExp() != null) {
            sql.SET("`exp` = #{record.exp,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeGold() != null) {
            sql.SET("recharge_gold = #{record.rechargeGold,jdbcType=INTEGER}");
        }
        
        if (record.getRechargeTimes() != null) {
            sql.SET("recharge_times = #{record.rechargeTimes,jdbcType=INTEGER}");
        }
        
        if (record.getFirstRechargeTime() != null) {
            sql.SET("first_recharge_time = #{record.firstRechargeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastRechargeTime() != null) {
            sql.SET("last_recharge_time = #{record.lastRechargeTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLeftGold() != null) {
            sql.SET("left_gold = #{record.leftGold,jdbcType=INTEGER}");
        }
        
        if (record.getLeftSpecialGold() != null) {
            sql.SET("left_special_gold = #{record.leftSpecialGold,jdbcType=INTEGER}");
        }
        
        if (record.getUsedSpecialGold() != null) {
            sql.SET("used_special_gold = #{record.usedSpecialGold,jdbcType=INTEGER}");
        }
        
        if (record.getLeftCoin() != null) {
            sql.SET("left_coin = #{record.leftCoin,jdbcType=BIGINT}");
        }
        
        if (record.getUsedCoin() != null) {
            sql.SET("used_coin = #{record.usedCoin,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("player_character");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("player_id = #{record.playerId,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=INTEGER}");
        sql.SET("char_id = #{record.charId,jdbcType=INTEGER}");
        sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        sql.SET("sex = #{record.sex,jdbcType=VARCHAR}");
        sql.SET("`level` = #{record.level,jdbcType=INTEGER}");
        sql.SET("vip_level = #{record.vipLevel,jdbcType=INTEGER}");
        sql.SET("`power` = #{record.power,jdbcType=INTEGER}");
        sql.SET("faction_id = #{record.factionId,jdbcType=INTEGER}");
        sql.SET("faction_name = #{record.factionName,jdbcType=VARCHAR}");
        sql.SET("job = #{record.job,jdbcType=VARCHAR}");
        sql.SET("`exp` = #{record.exp,jdbcType=INTEGER}");
        sql.SET("recharge_gold = #{record.rechargeGold,jdbcType=INTEGER}");
        sql.SET("recharge_times = #{record.rechargeTimes,jdbcType=INTEGER}");
        sql.SET("first_recharge_time = #{record.firstRechargeTime,jdbcType=TIMESTAMP}");
        sql.SET("last_recharge_time = #{record.lastRechargeTime,jdbcType=TIMESTAMP}");
        sql.SET("left_gold = #{record.leftGold,jdbcType=INTEGER}");
        sql.SET("left_special_gold = #{record.leftSpecialGold,jdbcType=INTEGER}");
        sql.SET("used_special_gold = #{record.usedSpecialGold,jdbcType=INTEGER}");
        sql.SET("left_coin = #{record.leftCoin,jdbcType=BIGINT}");
        sql.SET("used_coin = #{record.usedCoin,jdbcType=BIGINT}");
        
        PlayerCharacterEntityExample example = (PlayerCharacterEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PlayerCharacterEntityExample example, boolean includeExamplePhrase) {
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