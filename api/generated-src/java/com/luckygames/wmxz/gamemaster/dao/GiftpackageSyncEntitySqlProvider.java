package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntity;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class GiftpackageSyncEntitySqlProvider {

    public String countByExample(GiftpackageSyncEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("giftpackage_sync");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(GiftpackageSyncEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("giftpackage_sync");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(GiftpackageSyncEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("giftpackage_sync");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getCardFile() != null) {
            sql.VALUES("card_file", "#{cardFile,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityId() != null) {
            sql.VALUES("activity_id", "#{activityId,jdbcType=INTEGER}");
        }
        
        if (record.getMinTermValidity() != null) {
            sql.VALUES("min_term_validity", "#{minTermValidity,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMaxTermValidity() != null) {
            sql.VALUES("max_term_validity", "#{maxTermValidity,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsExclusiveGiftbag() != null) {
            sql.VALUES("is_exclusive_giftbag", "#{isExclusiveGiftbag,jdbcType=INTEGER}");
        }
        
        if (record.getCardType() != null) {
            sql.VALUES("card_type", "#{cardType,jdbcType=VARCHAR}");
        }
        
        if (record.getCardCount() != null) {
            sql.VALUES("card_count", "#{cardCount,jdbcType=INTEGER}");
        }
        
        if (record.getIsActivation() != null) {
            sql.VALUES("is_activation", "#{isActivation,jdbcType=INTEGER}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.VALUES("generate_time", "#{generateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGenerateType() != null) {
            sql.VALUES("generate_type", "#{generateType,jdbcType=INTEGER}");
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

    public String selectByExample(GiftpackageSyncEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("card_file");
        sql.SELECT("activity_id");
        sql.SELECT("min_term_validity");
        sql.SELECT("max_term_validity");
        sql.SELECT("is_exclusive_giftbag");
        sql.SELECT("card_type");
        sql.SELECT("card_count");
        sql.SELECT("is_activation");
        sql.SELECT("generate_time");
        sql.SELECT("generate_type");
        sql.SELECT("`status`");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("channel_id");
        sql.SELECT("channel_name");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("giftpackage_sync");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GiftpackageSyncEntity record = (GiftpackageSyncEntity) parameter.get("record");
        GiftpackageSyncEntityExample example = (GiftpackageSyncEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("giftpackage_sync");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getCardFile() != null) {
            sql.SET("card_file = #{record.cardFile,jdbcType=VARCHAR}");
        }
        
        if (record.getActivityId() != null) {
            sql.SET("activity_id = #{record.activityId,jdbcType=INTEGER}");
        }
        
        if (record.getMinTermValidity() != null) {
            sql.SET("min_term_validity = #{record.minTermValidity,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMaxTermValidity() != null) {
            sql.SET("max_term_validity = #{record.maxTermValidity,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsExclusiveGiftbag() != null) {
            sql.SET("is_exclusive_giftbag = #{record.isExclusiveGiftbag,jdbcType=INTEGER}");
        }
        
        if (record.getCardType() != null) {
            sql.SET("card_type = #{record.cardType,jdbcType=VARCHAR}");
        }
        
        if (record.getCardCount() != null) {
            sql.SET("card_count = #{record.cardCount,jdbcType=INTEGER}");
        }
        
        if (record.getIsActivation() != null) {
            sql.SET("is_activation = #{record.isActivation,jdbcType=INTEGER}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.SET("generate_time = #{record.generateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGenerateType() != null) {
            sql.SET("generate_type = #{record.generateType,jdbcType=INTEGER}");
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
        sql.UPDATE("giftpackage_sync");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("card_file = #{record.cardFile,jdbcType=VARCHAR}");
        sql.SET("activity_id = #{record.activityId,jdbcType=INTEGER}");
        sql.SET("min_term_validity = #{record.minTermValidity,jdbcType=TIMESTAMP}");
        sql.SET("max_term_validity = #{record.maxTermValidity,jdbcType=TIMESTAMP}");
        sql.SET("is_exclusive_giftbag = #{record.isExclusiveGiftbag,jdbcType=INTEGER}");
        sql.SET("card_type = #{record.cardType,jdbcType=VARCHAR}");
        sql.SET("card_count = #{record.cardCount,jdbcType=INTEGER}");
        sql.SET("is_activation = #{record.isActivation,jdbcType=INTEGER}");
        sql.SET("generate_time = #{record.generateTime,jdbcType=TIMESTAMP}");
        sql.SET("generate_type = #{record.generateType,jdbcType=INTEGER}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("channel_id = #{record.channelId,jdbcType=BIGINT}");
        sql.SET("channel_name = #{record.channelName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        GiftpackageSyncEntityExample example = (GiftpackageSyncEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, GiftpackageSyncEntityExample example, boolean includeExamplePhrase) {
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