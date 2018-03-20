package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.Player;
import com.luckygames.wmxz.gamemaster.dao.PlayerExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.PlayerExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.PlayerExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PlayerSqlProvider {

    public String countByExample(PlayerExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("player");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PlayerExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("player");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Player record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("player");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.VALUES("player_id", "#{playerId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getIdCard() != null) {
            sql.VALUES("id_card", "#{idCard,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateIp() != null) {
            sql.VALUES("create_ip", "#{createIp,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDevice() != null) {
            sql.VALUES("create_device", "#{createDevice,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateVersion() != null) {
            sql.VALUES("create_version", "#{createVersion,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateMac() != null) {
            sql.VALUES("create_mac", "#{createMac,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PlayerExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("player_id");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.SELECT("username");
        sql.SELECT("mobile");
        sql.SELECT("id_card");
        sql.SELECT("create_ip");
        sql.SELECT("create_device");
        sql.SELECT("create_version");
        sql.SELECT("create_mac");
        sql.SELECT("status");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("player");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Player record = (Player) parameter.get("record");
        PlayerExample example = (PlayerExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("player");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.SET("player_id = #{record.playerId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getIdCard() != null) {
            sql.SET("id_card = #{record.idCard,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateIp() != null) {
            sql.SET("create_ip = #{record.createIp,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateDevice() != null) {
            sql.SET("create_device = #{record.createDevice,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateVersion() != null) {
            sql.SET("create_version = #{record.createVersion,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateMac() != null) {
            sql.SET("create_mac = #{record.createMac,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
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
        sql.UPDATE("player");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("player_id = #{record.playerId,jdbcType=BIGINT}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("username = #{record.username,jdbcType=VARCHAR}");
        sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("id_card = #{record.idCard,jdbcType=VARCHAR}");
        sql.SET("create_ip = #{record.createIp,jdbcType=VARCHAR}");
        sql.SET("create_device = #{record.createDevice,jdbcType=VARCHAR}");
        sql.SET("create_version = #{record.createVersion,jdbcType=VARCHAR}");
        sql.SET("create_mac = #{record.createMac,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        PlayerExample example = (PlayerExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PlayerExample example, boolean includeExamplePhrase) {
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