package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.RegisteredData;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.RegisteredDataSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class RegisteredDataSqlProvider {
    public String save(RegisteredData registeredData) {
        StringBuilder sql = new StringBuilder("INSERT INTO registered_data(channel_id,equipment_count,activation_count,create_time,update_time) VALUES("+registeredData.getChannelId()+","+registeredData.getEquipmentCount()+","+registeredData.getActivationCount()+",now(),now())");
        return sql.toString();
    }
    public String searchPage(CommonSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT t2.datelist update_time,IFNULL(sum(t1.equipment_count),0) equipment_count,IFNULL(sum(t1.activation_count),0) activation_count,IFNULL(sum(t1.activation_count)/sum(t1.equipment_count),0) loss_rate from registered_data t1 ")
                .append("RIGHT JOIN")
                .append("(SELECT datelist FROM calendar t1 WHERE datelist<=(select last_day(curdate())) ")
                .append("AND datelist>=(select DATE_ADD(curdate(),interval -day(curdate())+1 day))) t2 ")
                .append("ON DATE_FORMAT(t1.update_time,'%Y-%m-%d')=t2.datelist where 1=1 ");

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and t1.channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and t1.server_id in (").append(ids).append(")  ");
        }

        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and t1.update_time >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and t1.update_time < #{endDate}  ");
        }
        sql.append(" GROUP BY t2.datelist");
        return sql.toString();
    }
}
