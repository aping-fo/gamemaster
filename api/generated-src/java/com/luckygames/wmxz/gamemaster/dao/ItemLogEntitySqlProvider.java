package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.ItemLogEntity;
import com.luckygames.wmxz.gamemaster.dao.ItemLogEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.ItemLogEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.ItemLogEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ItemLogEntitySqlProvider {

    public String countByExample(ItemLogEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("item_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ItemLogEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("item_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ItemLogEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("item_log");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.VALUES("player_id", "#{playerId,jdbcType=INTEGER}");
        }
        
        if (record.getOp() != null) {
            sql.VALUES("op", "#{op,jdbcType=INTEGER}");
        }
        
        if (record.getCount() != null) {
            sql.VALUES("`count`", "#{count,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("`type`", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            sql.VALUES("goods_id", "#{goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsType() != null) {
            sql.VALUES("goods_type", "#{goodsType,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getLev() != null) {
            sql.VALUES("lev", "#{lev,jdbcType=INTEGER}");
        }
        
        if (record.getPrev() != null) {
            sql.VALUES("prev", "#{prev,jdbcType=INTEGER}");
        }
        
        if (record.getNext() != null) {
            sql.VALUES("`next`", "#{next,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ItemLogEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("player_id");
        sql.SELECT("op");
        sql.SELECT("`count`");
        sql.SELECT("`type`");
        sql.SELECT("goods_id");
        sql.SELECT("goods_type");
        sql.SELECT("create_time");
        sql.SELECT("server_id");
        sql.SELECT("lev");
        sql.SELECT("prev");
        sql.SELECT("`next`");
        sql.FROM("item_log");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ItemLogEntity record = (ItemLogEntity) parameter.get("record");
        ItemLogEntityExample example = (ItemLogEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("item_log");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getPlayerId() != null) {
            sql.SET("player_id = #{record.playerId,jdbcType=INTEGER}");
        }
        
        if (record.getOp() != null) {
            sql.SET("op = #{record.op,jdbcType=INTEGER}");
        }
        
        if (record.getCount() != null) {
            sql.SET("`count` = #{record.count,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsId() != null) {
            sql.SET("goods_id = #{record.goodsId,jdbcType=INTEGER}");
        }
        
        if (record.getGoodsType() != null) {
            sql.SET("goods_type = #{record.goodsType,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getLev() != null) {
            sql.SET("lev = #{record.lev,jdbcType=INTEGER}");
        }
        
        if (record.getPrev() != null) {
            sql.SET("prev = #{record.prev,jdbcType=INTEGER}");
        }
        
        if (record.getNext() != null) {
            sql.SET("`next` = #{record.next,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("item_log");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("player_id = #{record.playerId,jdbcType=INTEGER}");
        sql.SET("op = #{record.op,jdbcType=INTEGER}");
        sql.SET("`count` = #{record.count,jdbcType=INTEGER}");
        sql.SET("`type` = #{record.type,jdbcType=INTEGER}");
        sql.SET("goods_id = #{record.goodsId,jdbcType=INTEGER}");
        sql.SET("goods_type = #{record.goodsType,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("lev = #{record.lev,jdbcType=INTEGER}");
        sql.SET("prev = #{record.prev,jdbcType=INTEGER}");
        sql.SET("`next` = #{record.next,jdbcType=INTEGER}");
        
        ItemLogEntityExample example = (ItemLogEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ItemLogEntityExample example, boolean includeExamplePhrase) {
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