package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.EquipmentFlowSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class EquipmentFlowSqlProvider {
    public String searchPage(EquipmentFlowSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT * FROM equipment_flow where char_id = ");
        if(query.getCharId()!=null){
            sql.append(query.getCharId());
        }else{
            sql.append("0 ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and update_time < #{endDate}  ");
        }
        if (StringUtils.isNotBlank(query.getName())) {
            sql.append(" and name like \"%\"#{name}\"%\" ");
        }
        if (StringUtils.isNotBlank(query.getType())) {
            sql.append(" and type = #{type} ");
        }
        return sql.toString();
    }
}
