package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.dao.ServerEntity;
import com.luckygames.wmxz.gamemaster.dao.ServerEntityExample.Criteria;
import com.luckygames.wmxz.gamemaster.dao.ServerEntityExample.Criterion;
import com.luckygames.wmxz.gamemaster.dao.ServerEntityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ServerEntitySqlProvider {

    public String countByExample(ServerEntityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("server");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ServerEntityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("server");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ServerEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("server");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
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
            sql.VALUES("server_id", "#{serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.VALUES("`server_name`", "#{serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerState() != null) {
            sql.VALUES("server_state", "#{serverState,jdbcType=INTEGER}");
        }
        
        if (record.getShowNumber() != null) {
            sql.VALUES("show_number", "#{showNumber,jdbcType=INTEGER}");
        }
        
        if (record.getLabel() != null) {
            sql.VALUES("`label`", "#{label,jdbcType=INTEGER}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }
        
        if (record.getPort() != null) {
            sql.VALUES("port", "#{port,jdbcType=INTEGER}");
        }
        
        if (record.getPayAddress() != null) {
            sql.VALUES("pay_address", "#{payAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenTime() != null) {
            sql.VALUES("open_time", "#{openTime,jdbcType=VARCHAR}");
        }
        
        if (record.getCloseTime() != null) {
            sql.VALUES("close_time", "#{closeTime,jdbcType=VARCHAR}");
        }
        
        if (record.getRemarks() != null) {
            sql.VALUES("remarks", "#{remarks,jdbcType=VARCHAR}");
        }
        
        if (record.getWhiteListEnable() != null) {
            sql.VALUES("white_list_enable", "#{whiteListEnable,jdbcType=INTEGER}");
        }
        
        if (record.getMaintenanceTips() != null) {
            sql.VALUES("maintenance_tips", "#{maintenanceTips,jdbcType=VARCHAR}");
        }
        
        if (record.getGmPort() != null) {
            sql.VALUES("gm_port", "#{gmPort,jdbcType=INTEGER}");
        }
        
        if (record.getWhiteList() != null) {
            sql.VALUES("white_list", "#{whiteList,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(ServerEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("server_state");
        sql.SELECT("show_number");
        sql.SELECT("`label`");
        sql.SELECT("ip");
        sql.SELECT("port");
        sql.SELECT("pay_address");
        sql.SELECT("open_time");
        sql.SELECT("close_time");
        sql.SELECT("remarks");
        sql.SELECT("white_list_enable");
        sql.SELECT("maintenance_tips");
        sql.SELECT("gm_port");
        sql.SELECT("white_list");
        sql.FROM("server");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(ServerEntityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("`status`");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("server_id");
        sql.SELECT("`server_name`");
        sql.SELECT("server_state");
        sql.SELECT("show_number");
        sql.SELECT("`label`");
        sql.SELECT("ip");
        sql.SELECT("port");
        sql.SELECT("pay_address");
        sql.SELECT("open_time");
        sql.SELECT("close_time");
        sql.SELECT("remarks");
        sql.SELECT("white_list_enable");
        sql.SELECT("maintenance_tips");
        sql.SELECT("gm_port");
        sql.FROM("server");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ServerEntity record = (ServerEntity) parameter.get("record");
        ServerEntityExample example = (ServerEntityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("server");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
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
            sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        }
        
        if (record.getServerName() != null) {
            sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        }
        
        if (record.getServerState() != null) {
            sql.SET("server_state = #{record.serverState,jdbcType=INTEGER}");
        }
        
        if (record.getShowNumber() != null) {
            sql.SET("show_number = #{record.showNumber,jdbcType=INTEGER}");
        }
        
        if (record.getLabel() != null) {
            sql.SET("`label` = #{record.label,jdbcType=INTEGER}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        }
        
        if (record.getPort() != null) {
            sql.SET("port = #{record.port,jdbcType=INTEGER}");
        }
        
        if (record.getPayAddress() != null) {
            sql.SET("pay_address = #{record.payAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOpenTime() != null) {
            sql.SET("open_time = #{record.openTime,jdbcType=VARCHAR}");
        }
        
        if (record.getCloseTime() != null) {
            sql.SET("close_time = #{record.closeTime,jdbcType=VARCHAR}");
        }
        
        if (record.getRemarks() != null) {
            sql.SET("remarks = #{record.remarks,jdbcType=VARCHAR}");
        }
        
        if (record.getWhiteListEnable() != null) {
            sql.SET("white_list_enable = #{record.whiteListEnable,jdbcType=INTEGER}");
        }
        
        if (record.getMaintenanceTips() != null) {
            sql.SET("maintenance_tips = #{record.maintenanceTips,jdbcType=VARCHAR}");
        }
        
        if (record.getGmPort() != null) {
            sql.SET("gm_port = #{record.gmPort,jdbcType=INTEGER}");
        }
        
        if (record.getWhiteList() != null) {
            sql.SET("white_list = #{record.whiteList,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("server");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("server_state = #{record.serverState,jdbcType=INTEGER}");
        sql.SET("show_number = #{record.showNumber,jdbcType=INTEGER}");
        sql.SET("`label` = #{record.label,jdbcType=INTEGER}");
        sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        sql.SET("port = #{record.port,jdbcType=INTEGER}");
        sql.SET("pay_address = #{record.payAddress,jdbcType=VARCHAR}");
        sql.SET("open_time = #{record.openTime,jdbcType=VARCHAR}");
        sql.SET("close_time = #{record.closeTime,jdbcType=VARCHAR}");
        sql.SET("remarks = #{record.remarks,jdbcType=VARCHAR}");
        sql.SET("white_list_enable = #{record.whiteListEnable,jdbcType=INTEGER}");
        sql.SET("maintenance_tips = #{record.maintenanceTips,jdbcType=VARCHAR}");
        sql.SET("gm_port = #{record.gmPort,jdbcType=INTEGER}");
        sql.SET("white_list = #{record.whiteList,jdbcType=LONGVARCHAR}");
        
        ServerEntityExample example = (ServerEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("server");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("`status` = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("server_id = #{record.serverId,jdbcType=BIGINT}");
        sql.SET("`server_name` = #{record.serverName,jdbcType=VARCHAR}");
        sql.SET("server_state = #{record.serverState,jdbcType=INTEGER}");
        sql.SET("show_number = #{record.showNumber,jdbcType=INTEGER}");
        sql.SET("`label` = #{record.label,jdbcType=INTEGER}");
        sql.SET("ip = #{record.ip,jdbcType=VARCHAR}");
        sql.SET("port = #{record.port,jdbcType=INTEGER}");
        sql.SET("pay_address = #{record.payAddress,jdbcType=VARCHAR}");
        sql.SET("open_time = #{record.openTime,jdbcType=VARCHAR}");
        sql.SET("close_time = #{record.closeTime,jdbcType=VARCHAR}");
        sql.SET("remarks = #{record.remarks,jdbcType=VARCHAR}");
        sql.SET("white_list_enable = #{record.whiteListEnable,jdbcType=INTEGER}");
        sql.SET("maintenance_tips = #{record.maintenanceTips,jdbcType=VARCHAR}");
        sql.SET("gm_port = #{record.gmPort,jdbcType=INTEGER}");
        
        ServerEntityExample example = (ServerEntityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ServerEntityExample example, boolean includeExamplePhrase) {
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