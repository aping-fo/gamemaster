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
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMinTermValidity() != null) {
            sql.VALUES("min_term_validity", "#{minTermValidity,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxTermValidity() != null) {
            sql.VALUES("max_term_validity", "#{maxTermValidity,jdbcType=VARCHAR}");
        }
        
        if (record.getCardType() != null) {
            sql.VALUES("card_type", "#{cardType,jdbcType=VARCHAR}");
        }
        
        if (record.getCardCount() != null) {
            sql.VALUES("card_count", "#{cardCount,jdbcType=INTEGER}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.VALUES("generate_time", "#{generateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
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
        sql.SELECT("`status`");
        sql.SELECT("update_time");
        sql.SELECT("create_time");
        sql.SELECT("min_term_validity");
        sql.SELECT("max_term_validity");
        sql.SELECT("card_type");
        sql.SELECT("card_count");
        sql.SELECT("generate_time");
        sql.SELECT("server_id");
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
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMinTermValidity() != null) {
            sql.SET("min_term_validity = #{record.minTermValidity,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxTermValidity() != null) {
            sql.SET("max_term_validity = #{record.maxTermValidity,jdbcType=VARCHAR}");
        }
        
        if (record.getCardType() != null) {
            sql.SET("card_type = #{record.cardType,jdbcType=VARCHAR}");
        }
        
        if (record.getCardCount() != null) {
            sql.SET("card_count = #{record.cardCount,jdbcType=INTEGER}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.SET("generate_time = #{record.generateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("giftpackage_sync");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("min_term_validity = #{record.minTermValidity,jdbcType=VARCHAR}");
        sql.SET("max_term_validity = #{record.maxTermValidity,jdbcType=VARCHAR}");
        sql.SET("card_type = #{record.cardType,jdbcType=VARCHAR}");
        sql.SET("card_count = #{record.cardCount,jdbcType=INTEGER}");
        sql.SET("generate_time = #{record.generateTime,jdbcType=TIMESTAMP}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        
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