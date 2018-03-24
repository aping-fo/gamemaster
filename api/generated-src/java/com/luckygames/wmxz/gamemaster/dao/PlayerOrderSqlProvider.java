package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.PlayerOrder;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PlayerOrderSqlProvider {

    public String countByExample(PlayerOrderExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("player_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PlayerOrderExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("player_order");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PlayerOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("player_order");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderCode() != null) {
            sql.VALUES("order_code", "#{orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.VALUES("channel_id", "#{channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.VALUES("channel_name", "#{channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayerId() != null) {
            sql.VALUES("player_id", "#{playerId,jdbcType=BIGINT}");
        }
        
        if (record.getCharId() != null) {
            sql.VALUES("char_id", "#{charId,jdbcType=BIGINT}");
        }
        
        if (record.getItemId() != null) {
            sql.VALUES("item_id", "#{itemId,jdbcType=BIGINT}");
        }
        
        if (record.getItemPrice() != null) {
            sql.VALUES("item_price", "#{itemPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getGoldQuantity() != null) {
            sql.VALUES("gold_quantity", "#{goldQuantity,jdbcType=INTEGER}");
        }
        
        if (record.getOrderType() != null) {
            sql.VALUES("order_type", "#{orderType,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderStatus() != null) {
            sql.VALUES("order_status", "#{orderStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getSyncStatus() != null) {
            sql.VALUES("sync_status", "#{syncStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getCharLevel() != null) {
            sql.VALUES("char_level", "#{charLevel,jdbcType=INTEGER}");
        }
        
        if (record.getCharGold() != null) {
            sql.VALUES("char_gold", "#{charGold,jdbcType=INTEGER}");
        }
        
        if (record.getCharName() != null) {
            sql.VALUES("char_name", "#{charName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemName() != null) {
            sql.VALUES("item_name", "#{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getPaidDate() != null) {
            sql.VALUES("paid_date", "#{paidDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRechargedDate() != null) {
            sql.VALUES("recharged_date", "#{rechargedDate,jdbcType=TIMESTAMP}");
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

    public String selectByExample(PlayerOrderExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("order_id");
        sql.SELECT("order_code");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("player_id");
        sql.SELECT("char_id");
        sql.SELECT("item_id");
        sql.SELECT("item_price");
        sql.SELECT("amount");
        sql.SELECT("gold_quantity");
        sql.SELECT("order_type");
        sql.SELECT("order_status");
        sql.SELECT("sync_status");
        sql.SELECT("char_level");
        sql.SELECT("char_gold");
        sql.SELECT("char_name");
        sql.SELECT("item_name");
        sql.SELECT("paid_date");
        sql.SELECT("recharged_date");
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("player_order");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PlayerOrder record = (PlayerOrder) parameter.get("record");
        PlayerOrderExample example = (PlayerOrderExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("player_order");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        }
        
        if (record.getOrderCode() != null) {
            sql.SET("order_code = #{record.orderCode,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelId() != null) {
            sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        }
        
        if (record.getChannelName() != null) {
            sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayerId() != null) {
            sql.SET("player_id = #{record.playerId,jdbcType=BIGINT}");
        }
        
        if (record.getCharId() != null) {
            sql.SET("char_id = #{record.charId,jdbcType=BIGINT}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{record.itemId,jdbcType=BIGINT}");
        }
        
        if (record.getItemPrice() != null) {
            sql.SET("item_price = #{record.itemPrice,jdbcType=DECIMAL}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getGoldQuantity() != null) {
            sql.SET("gold_quantity = #{record.goldQuantity,jdbcType=INTEGER}");
        }
        
        if (record.getOrderType() != null) {
            sql.SET("order_type = #{record.orderType,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderStatus() != null) {
            sql.SET("order_status = #{record.orderStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getSyncStatus() != null) {
            sql.SET("sync_status = #{record.syncStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getCharLevel() != null) {
            sql.SET("char_level = #{record.charLevel,jdbcType=INTEGER}");
        }
        
        if (record.getCharGold() != null) {
            sql.SET("char_gold = #{record.charGold,jdbcType=INTEGER}");
        }
        
        if (record.getCharName() != null) {
            sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getPaidDate() != null) {
            sql.SET("paid_date = #{record.paidDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRechargedDate() != null) {
            sql.SET("recharged_date = #{record.rechargedDate,jdbcType=TIMESTAMP}");
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
        sql.UPDATE("player_order");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("order_id = #{record.orderId,jdbcType=BIGINT}");
        sql.SET("order_code = #{record.orderCode,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("player_id = #{record.playerId,jdbcType=BIGINT}");
        sql.SET("char_id = #{record.charId,jdbcType=BIGINT}");
        sql.SET("item_id = #{record.itemId,jdbcType=BIGINT}");
        sql.SET("item_price = #{record.itemPrice,jdbcType=DECIMAL}");
        sql.SET("amount = #{record.amount,jdbcType=DECIMAL}");
        sql.SET("gold_quantity = #{record.goldQuantity,jdbcType=INTEGER}");
        sql.SET("order_type = #{record.orderType,jdbcType=VARCHAR}");
        sql.SET("order_status = #{record.orderStatus,jdbcType=VARCHAR}");
        sql.SET("sync_status = #{record.syncStatus,jdbcType=VARCHAR}");
        sql.SET("char_level = #{record.charLevel,jdbcType=INTEGER}");
        sql.SET("char_gold = #{record.charGold,jdbcType=INTEGER}");
        sql.SET("char_name = #{record.charName,jdbcType=VARCHAR}");
        sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        sql.SET("paid_date = #{record.paidDate,jdbcType=TIMESTAMP}");
        sql.SET("recharged_date = #{record.rechargedDate,jdbcType=TIMESTAMP}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        PlayerOrderExample example = (PlayerOrderExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PlayerOrderExample example, boolean includeExamplePhrase) {
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