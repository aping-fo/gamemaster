package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.PlayerEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.PlayerEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.PlayerEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PlayerEntitySqlProvider {

    public String countByExample(PlayerEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("player");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PlayerEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("player");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PlayerEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("player");
        
        if (record.getPlayerid() != null) {
            sql.VALUES("playerId", "#{playerid,jdbcType=INTEGER}");
        }
        
        if (record.getAccname() != null) {
            sql.VALUES("accName", "#{accname,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("`name`", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=TINYINT}");
        }
        
        if (record.getVocation() != null) {
            sql.VALUES("vocation", "#{vocation,jdbcType=TINYINT}");
        }
        
        if (record.getExp() != null) {
            sql.VALUES("`exp`", "#{exp,jdbcType=INTEGER}");
        }
        
        if (record.getCoin() != null) {
            sql.VALUES("coin", "#{coin,jdbcType=INTEGER}");
        }
        
        if (record.getDiamond() != null) {
            sql.VALUES("diamond", "#{diamond,jdbcType=INTEGER}");
        }
        
        if (record.getChargediamond() != null) {
            sql.VALUES("chargeDiamond", "#{chargediamond,jdbcType=INTEGER}");
        }
        
        if (record.getVip() != null) {
            sql.VALUES("vip", "#{vip,jdbcType=INTEGER}");
        }
        
        if (record.getEnergy() != null) {
            sql.VALUES("energy", "#{energy,jdbcType=INTEGER}");
        }
        
        if (record.getServerid() != null) {
            sql.VALUES("serverId", "#{serverid,jdbcType=SMALLINT}");
        }
        
        if (record.getRegtime() != null) {
            sql.VALUES("regTime", "#{regtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastlogintime() != null) {
            sql.VALUES("lastLoginTime", "#{lastlogintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastlogouttime() != null) {
            sql.VALUES("lastLogoutTime", "#{lastlogouttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getSceneid() != null) {
            sql.VALUES("sceneId", "#{sceneid,jdbcType=INTEGER}");
        }
        
        if (record.getX() != null) {
            sql.VALUES("x", "#{x,jdbcType=REAL}");
        }
        
        if (record.getY() != null) {
            sql.VALUES("y", "#{y,jdbcType=REAL}");
        }
        
        if (record.getLastsceneid() != null) {
            sql.VALUES("lastSceneId", "#{lastsceneid,jdbcType=INTEGER}");
        }
        
        if (record.getLev() != null) {
            sql.VALUES("lev", "#{lev,jdbcType=SMALLINT}");
        }
        
        if (record.getPhysicattack() != null) {
            sql.VALUES("physicAttack", "#{physicattack,jdbcType=INTEGER}");
        }
        
        if (record.getPhysicdefense() != null) {
            sql.VALUES("physicDefense", "#{physicdefense,jdbcType=INTEGER}");
        }
        
        if (record.getMagicattack() != null) {
            sql.VALUES("magicAttack", "#{magicattack,jdbcType=INTEGER}");
        }
        
        if (record.getMagicdefense() != null) {
            sql.VALUES("magicDefense", "#{magicdefense,jdbcType=INTEGER}");
        }
        
        if (record.getCrit() != null) {
            sql.VALUES("crit", "#{crit,jdbcType=INTEGER}");
        }
        
        if (record.getCritdefense() != null) {
            sql.VALUES("critDefense", "#{critdefense,jdbcType=INTEGER}");
        }
        
        if (record.getMp() != null) {
            sql.VALUES("mp", "#{mp,jdbcType=INTEGER}");
        }
        
        if (record.getCurmp() != null) {
            sql.VALUES("curMp", "#{curmp,jdbcType=INTEGER}");
        }
        
        if (record.getHp() != null) {
            sql.VALUES("hp", "#{hp,jdbcType=INTEGER}");
        }
        
        if (record.getCurhp() != null) {
            sql.VALUES("curHp", "#{curhp,jdbcType=INTEGER}");
        }
        
        if (record.getFightstrength() != null) {
            sql.VALUES("fightStrength", "#{fightstrength,jdbcType=INTEGER}");
        }
        
        if (record.getZ() != null) {
            sql.VALUES("z", "#{z,jdbcType=REAL}");
        }
        
        if (record.getFashionid() != null) {
            sql.VALUES("fashionId", "#{fashionid,jdbcType=INTEGER}");
        }
        
        if (record.getGangid() != null) {
            sql.VALUES("gangId", "#{gangid,jdbcType=INTEGER}");
        }
        
        if (record.getTotalcoin() != null) {
            sql.VALUES("totalCoin", "#{totalcoin,jdbcType=INTEGER}");
        }
        
        if (record.getTotalreputation() != null) {
            sql.VALUES("totalReputation", "#{totalreputation,jdbcType=INTEGER}");
        }
        
        if (record.getWeaponid() != null) {
            sql.VALUES("weaponId", "#{weaponid,jdbcType=INTEGER}");
        }
        
        if (record.getContribute() != null) {
            sql.VALUES("contribute", "#{contribute,jdbcType=INTEGER}");
        }
        
        if (record.getEnergytime() != null) {
            sql.VALUES("energyTime", "#{energytime,jdbcType=BIGINT}");
        }
        
        if (record.getReputation() != null) {
            sql.VALUES("reputation", "#{reputation,jdbcType=INTEGER}");
        }
        
        if (record.getTotaldiamond() != null) {
            sql.VALUES("totalDiamond", "#{totaldiamond,jdbcType=INTEGER}");
        }
        
        if (record.getSoul() != null) {
            sql.VALUES("soul", "#{soul,jdbcType=INTEGER}");
        }
        
        if (record.getLotteryscore() != null) {
            sql.VALUES("lotteryScore", "#{lotteryscore,jdbcType=INTEGER}");
        }
        
        if (record.getFreediamond() != null) {
            sql.VALUES("freeDiamond", "#{freediamond,jdbcType=INTEGER}");
        }
        
        if (record.getChannel() != null) {
            sql.VALUES("channel", "#{channel,jdbcType=VARCHAR}");
        }
        
        if (record.getConsumediamon() != null) {
            sql.VALUES("consumeDiamon", "#{consumediamon,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PlayerEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("playerId");
        } else {
            sql.SELECT("playerId");
        }
        sql.SELECT("accName");
        sql.SELECT("`name`");
        sql.SELECT("sex");
        sql.SELECT("vocation");
        sql.SELECT("`exp`");
        sql.SELECT("coin");
        sql.SELECT("diamond");
        sql.SELECT("chargeDiamond");
        sql.SELECT("vip");
        sql.SELECT("energy");
        sql.SELECT("serverId");
        sql.SELECT("regTime");
        sql.SELECT("lastLoginTime");
        sql.SELECT("lastLogoutTime");
        sql.SELECT("ip");
        sql.SELECT("sceneId");
        sql.SELECT("x");
        sql.SELECT("y");
        sql.SELECT("lastSceneId");
        sql.SELECT("lev");
        sql.SELECT("physicAttack");
        sql.SELECT("physicDefense");
        sql.SELECT("magicAttack");
        sql.SELECT("magicDefense");
        sql.SELECT("crit");
        sql.SELECT("critDefense");
        sql.SELECT("mp");
        sql.SELECT("curMp");
        sql.SELECT("hp");
        sql.SELECT("curHp");
        sql.SELECT("fightStrength");
        sql.SELECT("z");
        sql.SELECT("fashionId");
        sql.SELECT("gangId");
        sql.SELECT("totalCoin");
        sql.SELECT("totalReputation");
        sql.SELECT("weaponId");
        sql.SELECT("contribute");
        sql.SELECT("energyTime");
        sql.SELECT("reputation");
        sql.SELECT("totalDiamond");
        sql.SELECT("soul");
        sql.SELECT("lotteryScore");
        sql.SELECT("freeDiamond");
        sql.SELECT("channel");
        sql.SELECT("consumeDiamon");
        sql.FROM("player");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PlayerEntity record = (PlayerEntity) parameter.get("record");
        PlayerEntityExample example = (PlayerEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("player");
        
        if (record.getPlayerid() != null) {
            sql.SET("playerId = #{record.playerid,jdbcType=INTEGER}");
        }
        
        if (record.getAccname() != null) {
            sql.SET("accName = #{record.accname,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=TINYINT}");
        }
        
        if (record.getVocation() != null) {
            sql.SET("vocation = #{record.vocation,jdbcType=TINYINT}");
        }
        
        if (record.getExp() != null) {
            sql.SET("`exp` = #{record.exp,jdbcType=INTEGER}");
        }
        
        if (record.getCoin() != null) {
            sql.SET("coin = #{record.coin,jdbcType=INTEGER}");
        }
        
        if (record.getDiamond() != null) {
            sql.SET("diamond = #{record.diamond,jdbcType=INTEGER}");
        }
        
        if (record.getChargediamond() != null) {
            sql.SET("chargeDiamond = #{record.chargediamond,jdbcType=INTEGER}");
        }
        
        if (record.getVip() != null) {
            sql.SET("vip = #{record.vip,jdbcType=INTEGER}");
        }
        
        if (record.getEnergy() != null) {
            sql.SET("energy = #{record.energy,jdbcType=INTEGER}");
        }
        
        if (record.getServerid() != null) {
            sql.SET("serverId = #{record.serverid,jdbcType=SMALLINT}");
        }
        
        if (record.getRegtime() != null) {
            sql.SET("regTime = #{record.regtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastlogintime() != null) {
            sql.SET("lastLoginTime = #{record.lastlogintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastlogouttime() != null) {
            sql.SET("lastLogoutTime = #{record.lastlogouttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        }
        
        if (record.getSceneid() != null) {
            sql.SET("sceneId = #{record.sceneid,jdbcType=INTEGER}");
        }
        
        if (record.getX() != null) {
            sql.SET("x = #{record.x,jdbcType=REAL}");
        }
        
        if (record.getY() != null) {
            sql.SET("y = #{record.y,jdbcType=REAL}");
        }
        
        if (record.getLastsceneid() != null) {
            sql.SET("lastSceneId = #{record.lastsceneid,jdbcType=INTEGER}");
        }
        
        if (record.getLev() != null) {
            sql.SET("lev = #{record.lev,jdbcType=SMALLINT}");
        }
        
        if (record.getPhysicattack() != null) {
            sql.SET("physicAttack = #{record.physicattack,jdbcType=INTEGER}");
        }
        
        if (record.getPhysicdefense() != null) {
            sql.SET("physicDefense = #{record.physicdefense,jdbcType=INTEGER}");
        }
        
        if (record.getMagicattack() != null) {
            sql.SET("magicAttack = #{record.magicattack,jdbcType=INTEGER}");
        }
        
        if (record.getMagicdefense() != null) {
            sql.SET("magicDefense = #{record.magicdefense,jdbcType=INTEGER}");
        }
        
        if (record.getCrit() != null) {
            sql.SET("crit = #{record.crit,jdbcType=INTEGER}");
        }
        
        if (record.getCritdefense() != null) {
            sql.SET("critDefense = #{record.critdefense,jdbcType=INTEGER}");
        }
        
        if (record.getMp() != null) {
            sql.SET("mp = #{record.mp,jdbcType=INTEGER}");
        }
        
        if (record.getCurmp() != null) {
            sql.SET("curMp = #{record.curmp,jdbcType=INTEGER}");
        }
        
        if (record.getHp() != null) {
            sql.SET("hp = #{record.hp,jdbcType=INTEGER}");
        }
        
        if (record.getCurhp() != null) {
            sql.SET("curHp = #{record.curhp,jdbcType=INTEGER}");
        }
        
        if (record.getFightstrength() != null) {
            sql.SET("fightStrength = #{record.fightstrength,jdbcType=INTEGER}");
        }
        
        if (record.getZ() != null) {
            sql.SET("z = #{record.z,jdbcType=REAL}");
        }
        
        if (record.getFashionid() != null) {
            sql.SET("fashionId = #{record.fashionid,jdbcType=INTEGER}");
        }
        
        if (record.getGangid() != null) {
            sql.SET("gangId = #{record.gangid,jdbcType=INTEGER}");
        }
        
        if (record.getTotalcoin() != null) {
            sql.SET("totalCoin = #{record.totalcoin,jdbcType=INTEGER}");
        }
        
        if (record.getTotalreputation() != null) {
            sql.SET("totalReputation = #{record.totalreputation,jdbcType=INTEGER}");
        }
        
        if (record.getWeaponid() != null) {
            sql.SET("weaponId = #{record.weaponid,jdbcType=INTEGER}");
        }
        
        if (record.getContribute() != null) {
            sql.SET("contribute = #{record.contribute,jdbcType=INTEGER}");
        }
        
        if (record.getEnergytime() != null) {
            sql.SET("energyTime = #{record.energytime,jdbcType=BIGINT}");
        }
        
        if (record.getReputation() != null) {
            sql.SET("reputation = #{record.reputation,jdbcType=INTEGER}");
        }
        
        if (record.getTotaldiamond() != null) {
            sql.SET("totalDiamond = #{record.totaldiamond,jdbcType=INTEGER}");
        }
        
        if (record.getSoul() != null) {
            sql.SET("soul = #{record.soul,jdbcType=INTEGER}");
        }
        
        if (record.getLotteryscore() != null) {
            sql.SET("lotteryScore = #{record.lotteryscore,jdbcType=INTEGER}");
        }
        
        if (record.getFreediamond() != null) {
            sql.SET("freeDiamond = #{record.freediamond,jdbcType=INTEGER}");
        }
        
        if (record.getChannel() != null) {
            sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        }
        
        if (record.getConsumediamon() != null) {
            sql.SET("consumeDiamon = #{record.consumediamon,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("player");
        
        sql.SET("playerId = #{record.playerid,jdbcType=INTEGER}");
        sql.SET("accName = #{record.accname,jdbcType=VARCHAR}");
        sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        sql.SET("sex = #{record.sex,jdbcType=TINYINT}");
        sql.SET("vocation = #{record.vocation,jdbcType=TINYINT}");
        sql.SET("`exp` = #{record.exp,jdbcType=INTEGER}");
        sql.SET("coin = #{record.coin,jdbcType=INTEGER}");
        sql.SET("diamond = #{record.diamond,jdbcType=INTEGER}");
        sql.SET("chargeDiamond = #{record.chargediamond,jdbcType=INTEGER}");
        sql.SET("vip = #{record.vip,jdbcType=INTEGER}");
        sql.SET("energy = #{record.energy,jdbcType=INTEGER}");
        sql.SET("serverId = #{record.serverid,jdbcType=SMALLINT}");
        sql.SET("regTime = #{record.regtime,jdbcType=TIMESTAMP}");
        sql.SET("lastLoginTime = #{record.lastlogintime,jdbcType=TIMESTAMP}");
        sql.SET("lastLogoutTime = #{record.lastlogouttime,jdbcType=TIMESTAMP}");
        sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        sql.SET("sceneId = #{record.sceneid,jdbcType=INTEGER}");
        sql.SET("x = #{record.x,jdbcType=REAL}");
        sql.SET("y = #{record.y,jdbcType=REAL}");
        sql.SET("lastSceneId = #{record.lastsceneid,jdbcType=INTEGER}");
        sql.SET("lev = #{record.lev,jdbcType=SMALLINT}");
        sql.SET("physicAttack = #{record.physicattack,jdbcType=INTEGER}");
        sql.SET("physicDefense = #{record.physicdefense,jdbcType=INTEGER}");
        sql.SET("magicAttack = #{record.magicattack,jdbcType=INTEGER}");
        sql.SET("magicDefense = #{record.magicdefense,jdbcType=INTEGER}");
        sql.SET("crit = #{record.crit,jdbcType=INTEGER}");
        sql.SET("critDefense = #{record.critdefense,jdbcType=INTEGER}");
        sql.SET("mp = #{record.mp,jdbcType=INTEGER}");
        sql.SET("curMp = #{record.curmp,jdbcType=INTEGER}");
        sql.SET("hp = #{record.hp,jdbcType=INTEGER}");
        sql.SET("curHp = #{record.curhp,jdbcType=INTEGER}");
        sql.SET("fightStrength = #{record.fightstrength,jdbcType=INTEGER}");
        sql.SET("z = #{record.z,jdbcType=REAL}");
        sql.SET("fashionId = #{record.fashionid,jdbcType=INTEGER}");
        sql.SET("gangId = #{record.gangid,jdbcType=INTEGER}");
        sql.SET("totalCoin = #{record.totalcoin,jdbcType=INTEGER}");
        sql.SET("totalReputation = #{record.totalreputation,jdbcType=INTEGER}");
        sql.SET("weaponId = #{record.weaponid,jdbcType=INTEGER}");
        sql.SET("contribute = #{record.contribute,jdbcType=INTEGER}");
        sql.SET("energyTime = #{record.energytime,jdbcType=BIGINT}");
        sql.SET("reputation = #{record.reputation,jdbcType=INTEGER}");
        sql.SET("totalDiamond = #{record.totaldiamond,jdbcType=INTEGER}");
        sql.SET("soul = #{record.soul,jdbcType=INTEGER}");
        sql.SET("lotteryScore = #{record.lotteryscore,jdbcType=INTEGER}");
        sql.SET("freeDiamond = #{record.freediamond,jdbcType=INTEGER}");
        sql.SET("channel = #{record.channel,jdbcType=VARCHAR}");
        sql.SET("consumeDiamon = #{record.consumediamon,jdbcType=INTEGER}");
        
        PlayerEntityExample example = (PlayerEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PlayerEntityExample example, boolean includeExamplePhrase) {
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