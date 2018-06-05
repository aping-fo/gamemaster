package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddEntity;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class GiftpackageAddEntitySqlProvider {

    public String countByExample(GiftpackageAddEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("giftpackage_add");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(GiftpackageAddEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("giftpackage_add");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(GiftpackageAddEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("giftpackage_add");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("`name`", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDes() != null) {
            sql.VALUES("des", "#{des,jdbcType=VARCHAR}");
        }
        
        if (record.getIsbinding() != null) {
            sql.VALUES("isBinding", "#{isbinding,jdbcType=INTEGER}");
        }
        
        if (record.getGoods0Name() != null) {
            sql.VALUES("goods0_name", "#{goods0Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods0Count() != null) {
            sql.VALUES("goods0_count", "#{goods0Count,jdbcType=INTEGER}");
        }
        
        if (record.getGoods1Name() != null) {
            sql.VALUES("goods1_name", "#{goods1Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods1Count() != null) {
            sql.VALUES("goods1_count", "#{goods1Count,jdbcType=INTEGER}");
        }
        
        if (record.getGoods2Name() != null) {
            sql.VALUES("goods2_name", "#{goods2Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods2Count() != null) {
            sql.VALUES("goods2_count", "#{goods2Count,jdbcType=INTEGER}");
        }
        
        if (record.getGoods3Name() != null) {
            sql.VALUES("goods3_name", "#{goods3Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods3Count() != null) {
            sql.VALUES("goods3_count", "#{goods3Count,jdbcType=INTEGER}");
        }
        
        if (record.getGoods4Name() != null) {
            sql.VALUES("goods4_name", "#{goods4Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods4Count() != null) {
            sql.VALUES("goods4_count", "#{goods4Count,jdbcType=INTEGER}");
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
        
        return sql.toString();
    }

    public String selectByExample(GiftpackageAddEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("`name`");
        sql.SELECT("des");
        sql.SELECT("isBinding");
        sql.SELECT("goods0_name");
        sql.SELECT("goods0_count");
        sql.SELECT("goods1_name");
        sql.SELECT("goods1_count");
        sql.SELECT("goods2_name");
        sql.SELECT("goods2_count");
        sql.SELECT("goods3_name");
        sql.SELECT("goods3_count");
        sql.SELECT("goods4_name");
        sql.SELECT("goods4_count");
        sql.SELECT("`status`");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("giftpackage_add");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GiftpackageAddEntity record = (GiftpackageAddEntity) parameter.get("record");
        GiftpackageAddEntityExample example = (GiftpackageAddEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("giftpackage_add");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getName() != null) {
            sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getDes() != null) {
            sql.SET("des = #{record.des,jdbcType=VARCHAR}");
        }
        
        if (record.getIsbinding() != null) {
            sql.SET("isBinding = #{record.isbinding,jdbcType=INTEGER}");
        }
        
        if (record.getGoods0Name() != null) {
            sql.SET("goods0_name = #{record.goods0Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods0Count() != null) {
            sql.SET("goods0_count = #{record.goods0Count,jdbcType=INTEGER}");
        }
        
        if (record.getGoods1Name() != null) {
            sql.SET("goods1_name = #{record.goods1Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods1Count() != null) {
            sql.SET("goods1_count = #{record.goods1Count,jdbcType=INTEGER}");
        }
        
        if (record.getGoods2Name() != null) {
            sql.SET("goods2_name = #{record.goods2Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods2Count() != null) {
            sql.SET("goods2_count = #{record.goods2Count,jdbcType=INTEGER}");
        }
        
        if (record.getGoods3Name() != null) {
            sql.SET("goods3_name = #{record.goods3Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods3Count() != null) {
            sql.SET("goods3_count = #{record.goods3Count,jdbcType=INTEGER}");
        }
        
        if (record.getGoods4Name() != null) {
            sql.SET("goods4_name = #{record.goods4Name,jdbcType=VARCHAR}");
        }
        
        if (record.getGoods4Count() != null) {
            sql.SET("goods4_count = #{record.goods4Count,jdbcType=INTEGER}");
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
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("giftpackage_add");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`name` = #{record.name,jdbcType=VARCHAR}");
        sql.SET("des = #{record.des,jdbcType=VARCHAR}");
        sql.SET("isBinding = #{record.isbinding,jdbcType=INTEGER}");
        sql.SET("goods0_name = #{record.goods0Name,jdbcType=VARCHAR}");
        sql.SET("goods0_count = #{record.goods0Count,jdbcType=INTEGER}");
        sql.SET("goods1_name = #{record.goods1Name,jdbcType=VARCHAR}");
        sql.SET("goods1_count = #{record.goods1Count,jdbcType=INTEGER}");
        sql.SET("goods2_name = #{record.goods2Name,jdbcType=VARCHAR}");
        sql.SET("goods2_count = #{record.goods2Count,jdbcType=INTEGER}");
        sql.SET("goods3_name = #{record.goods3Name,jdbcType=VARCHAR}");
        sql.SET("goods3_count = #{record.goods3Count,jdbcType=INTEGER}");
        sql.SET("goods4_name = #{record.goods4Name,jdbcType=VARCHAR}");
        sql.SET("goods4_count = #{record.goods4Count,jdbcType=INTEGER}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        GiftpackageAddEntityExample example = (GiftpackageAddEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, GiftpackageAddEntityExample example, boolean includeExamplePhrase) {
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