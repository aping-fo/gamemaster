package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.MailLogEntity;
import com.luckygames.wmxz.gamemaster.dao.MailLogEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.MailLogEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.MailLogEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MailLogEntitySqlProvider {

    public String countByExample(MailLogEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("mail_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MailLogEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("mail_log");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(MailLogEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("mail_log");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("`status`", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getMailType() != null) {
            sql.VALUES("mail_type", "#{mailType,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getVocation() != null) {
            sql.VALUES("vocation", "#{vocation,jdbcType=INTEGER}");
        }
        
        if (record.getMinLev() != null) {
            sql.VALUES("min_lev", "#{minLev,jdbcType=INTEGER}");
        }
        
        if (record.getMaxLev() != null) {
            sql.VALUES("max_lev", "#{maxLev,jdbcType=INTEGER}");
        }
        
        if (record.getSender() != null) {
            sql.VALUES("sender", "#{sender,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRewards() != null) {
            sql.VALUES("rewards", "#{rewards,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayerids() != null) {
            sql.VALUES("playerids", "#{playerids,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MailLogEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("`status`");
        sql.SELECT("server_id");
        sql.SELECT("mail_type");
        sql.SELECT("title");
        sql.SELECT("content");
        sql.SELECT("vocation");
        sql.SELECT("min_lev");
        sql.SELECT("max_lev");
        sql.SELECT("sender");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("rewards");
        sql.SELECT("playerids");
        sql.FROM("mail_log");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        MailLogEntity record = (MailLogEntity) parameter.get("record");
        MailLogEntityExample example = (MailLogEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("mail_log");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("`status` = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getMailType() != null) {
            sql.SET("mail_type = #{record.mailType,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{record.content,jdbcType=VARCHAR}");
        }
        
        if (record.getVocation() != null) {
            sql.SET("vocation = #{record.vocation,jdbcType=INTEGER}");
        }
        
        if (record.getMinLev() != null) {
            sql.SET("min_lev = #{record.minLev,jdbcType=INTEGER}");
        }
        
        if (record.getMaxLev() != null) {
            sql.SET("max_lev = #{record.maxLev,jdbcType=INTEGER}");
        }
        
        if (record.getSender() != null) {
            sql.SET("sender = #{record.sender,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRewards() != null) {
            sql.SET("rewards = #{record.rewards,jdbcType=VARCHAR}");
        }
        
        if (record.getPlayerids() != null) {
            sql.SET("playerids = #{record.playerids,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("mail_log");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=VARCHAR}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("mail_type = #{record.mailType,jdbcType=INTEGER}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("content = #{record.content,jdbcType=VARCHAR}");
        sql.SET("vocation = #{record.vocation,jdbcType=INTEGER}");
        sql.SET("min_lev = #{record.minLev,jdbcType=INTEGER}");
        sql.SET("max_lev = #{record.maxLev,jdbcType=INTEGER}");
        sql.SET("sender = #{record.sender,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("rewards = #{record.rewards,jdbcType=VARCHAR}");
        sql.SET("playerids = #{record.playerids,jdbcType=VARCHAR}");
        
        MailLogEntityExample example = (MailLogEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MailLogEntityExample example, boolean includeExamplePhrase) {
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