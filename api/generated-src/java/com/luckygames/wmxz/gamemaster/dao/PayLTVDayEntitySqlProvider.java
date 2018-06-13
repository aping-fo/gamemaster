package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntity;
import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PayLTVDayEntitySqlProvider {

    public String countByExample(PayLTVDayEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("pay_ltv_day");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PayLTVDayEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("pay_ltv_day");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PayLTVDayEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("pay_ltv_day");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getPayLtvId() != null) {
            sql.VALUES("pay_ltv_id", "#{payLtvId,jdbcType=BIGINT}");
        }
        
        if (record.getDays() != null) {
            sql.VALUES("`days`", "#{days,jdbcType=INTEGER}");
        }
        
        if (record.getAverage() != null) {
            sql.VALUES("average", "#{average,jdbcType=DECIMAL}");
        }
        
        if (record.getSummary() != null) {
            sql.VALUES("summary", "#{summary,jdbcType=DECIMAL}");
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

    public String selectByExample(PayLTVDayEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("pay_ltv_id");
        sql.SELECT("`days`");
        sql.SELECT("average");
        sql.SELECT("summary");
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("pay_ltv_day");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PayLTVDayEntity record = (PayLTVDayEntity) parameter.get("record");
        PayLTVDayEntityExample example = (PayLTVDayEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("pay_ltv_day");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getPayLtvId() != null) {
            sql.SET("pay_ltv_id = #{record.payLtvId,jdbcType=BIGINT}");
        }
        
        if (record.getDays() != null) {
            sql.SET("`days` = #{record.days,jdbcType=INTEGER}");
        }
        
        if (record.getAverage() != null) {
            sql.SET("average = #{record.average,jdbcType=DECIMAL}");
        }
        
        if (record.getSummary() != null) {
            sql.SET("summary = #{record.summary,jdbcType=DECIMAL}");
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
        sql.UPDATE("pay_ltv_day");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("pay_ltv_id = #{record.payLtvId,jdbcType=BIGINT}");
        sql.SET("`days` = #{record.days,jdbcType=INTEGER}");
        sql.SET("average = #{record.average,jdbcType=DECIMAL}");
        sql.SET("summary = #{record.summary,jdbcType=DECIMAL}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        PayLTVDayEntityExample example = (PayLTVDayEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PayLTVDayEntityExample example, boolean includeExamplePhrase) {
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