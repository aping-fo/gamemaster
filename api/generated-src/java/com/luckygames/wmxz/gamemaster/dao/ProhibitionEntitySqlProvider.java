package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntity;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.ProhibitionEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ProhibitionEntitySqlProvider {

    public String countByExample(ProhibitionEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("prohibition");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ProhibitionEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("prohibition");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ProhibitionEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("prohibition");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getServerId() != null) {
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getClosureType() != null) {
            sql.VALUES("closure_type", "#{closureType,jdbcType=INTEGER}");
        }
        
        if (record.getClosureWay() != null) {
            sql.VALUES("closure_way", "#{closureWay,jdbcType=INTEGER}");
        }
        
        if (record.getClosureAccount() != null) {
            sql.VALUES("closure_account", "#{closureAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getClosureTime() != null) {
            sql.VALUES("closure_time", "#{closureTime,jdbcType=BIGINT}");
        }
        
        if (record.getEndTime() != null) {
            sql.VALUES("end_time", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ProhibitionEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("server_id");
        sql.SELECT("closure_type");
        sql.SELECT("closure_way");
        sql.SELECT("closure_account");
        sql.SELECT("closure_time");
        sql.SELECT("end_time");
        sql.FROM("prohibition");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ProhibitionEntity record = (ProhibitionEntity) parameter.get("record");
        ProhibitionEntityExample example = (ProhibitionEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("prohibition");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getServerId() != null) {
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getClosureType() != null) {
            sql.SET("closure_type = #{record.closureType,jdbcType=INTEGER}");
        }
        
        if (record.getClosureWay() != null) {
            sql.SET("closure_way = #{record.closureWay,jdbcType=INTEGER}");
        }
        
        if (record.getClosureAccount() != null) {
            sql.SET("closure_account = #{record.closureAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getClosureTime() != null) {
            sql.SET("closure_time = #{record.closureTime,jdbcType=BIGINT}");
        }
        
        if (record.getEndTime() != null) {
            sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("prohibition");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("closure_type = #{record.closureType,jdbcType=INTEGER}");
        sql.SET("closure_way = #{record.closureWay,jdbcType=INTEGER}");
        sql.SET("closure_account = #{record.closureAccount,jdbcType=VARCHAR}");
        sql.SET("closure_time = #{record.closureTime,jdbcType=BIGINT}");
        sql.SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        
        ProhibitionEntityExample example = (ProhibitionEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ProhibitionEntityExample example, boolean includeExamplePhrase) {
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