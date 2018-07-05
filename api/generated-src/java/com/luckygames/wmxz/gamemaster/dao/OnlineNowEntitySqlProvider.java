package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntity;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OnlineNowEntitySqlProvider {

    public String countByExample(OnlineNowEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("online_now");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(OnlineNowEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("online_now");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(OnlineNowEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("online_now");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getCharId() != null) {
            sql.VALUES("char_id", "#{charId,jdbcType=BIGINT}");
        }
        
        if (record.getCharName() != null) {
            sql.VALUES("char_name", "#{charName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginTime() != null) {
            sql.VALUES("last_login_time", "#{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMaxOnlineLength() != null) {
            sql.VALUES("max_online_length", "#{maxOnlineLength,jdbcType=INTEGER}");
        }
        
        if (record.getMapId() != null) {
            sql.VALUES("map_id", "#{mapId,jdbcType=INTEGER}");
        }
        
        if (record.getPlayerIp() != null) {
            sql.VALUES("player_ip", "#{playerIp,jdbcType=VARCHAR}");
        }
        
        if (record.getOnline() != null) {
            sql.VALUES("`online`", "#{online,jdbcType=INTEGER}");
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
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=INTEGER}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=INTEGER}");
        }
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(OnlineNowEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("char_id");
        sql.SELECT("char_name");
        sql.SELECT("user_name");
        sql.SELECT("last_login_time");
        sql.SELECT("max_online_length");
        sql.SELECT("map_id");
        sql.SELECT("player_ip");
        sql.SELECT("`online`");
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.FROM("online_now");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        OnlineNowEntity record = (OnlineNowEntity) parameter.get("record");
        OnlineNowEntityExample example = (OnlineNowEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("online_now");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getCharId() != null) {
            sql.SET("char_id = #{record.charId,jdbcType=BIGINT}");
        }
        
        if (record.getCharName() != null) {
            sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        }
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        }
        
        if (record.getLastLoginTime() != null) {
            sql.SET("last_login_time = #{record.lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMaxOnlineLength() != null) {
            sql.SET("max_online_length = #{record.maxOnlineLength,jdbcType=INTEGER}");
        }
        
        if (record.getMapId() != null) {
            sql.SET("map_id = #{record.mapId,jdbcType=INTEGER}");
        }
        
        if (record.getPlayerIp() != null) {
            sql.SET("player_ip = #{record.playerIp,jdbcType=VARCHAR}");
        }
        
        if (record.getOnline() != null) {
            sql.SET("`online` = #{record.online,jdbcType=INTEGER}");
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
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=INTEGER}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=INTEGER}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("online_now");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("char_id = #{record.charId,jdbcType=BIGINT}");
        sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        sql.SET("user_name = #{record.userName,jdbcType=VARCHAR}");
        sql.SET("last_login_time = #{record.lastLoginTime,jdbcType=TIMESTAMP}");
        sql.SET("max_online_length = #{record.maxOnlineLength,jdbcType=INTEGER}");
        sql.SET("map_id = #{record.mapId,jdbcType=INTEGER}");
        sql.SET("player_ip = #{record.playerIp,jdbcType=VARCHAR}");
        sql.SET("`online` = #{record.online,jdbcType=INTEGER}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("server_id = #{record.serverId,jdbcType=INTEGER}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=INTEGER}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        
        OnlineNowEntityExample example = (OnlineNowEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, OnlineNowEntityExample example, boolean includeExamplePhrase) {
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