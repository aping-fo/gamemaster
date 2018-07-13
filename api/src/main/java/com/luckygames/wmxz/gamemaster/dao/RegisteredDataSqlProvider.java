package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.RegisteredData;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.EquipmentSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class RegisteredDataSqlProvider {
    public String searchPage(EquipmentSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT t2.datelist update_time,IFNULL(sum(t1.equipment_count),0) equipment_count,IFNULL(sum(t1.activation_count),0) activation_count,IFNULL(sum(t1.activation_count)/sum(t1.equipment_count),0) loss_rate from registered_data t1 ")
                .append("RIGHT JOIN")
                .append("(SELECT datelist FROM calendar t1 WHERE datelist<= ");
        if(StringUtils.isNotBlank(query.getEndDate())){
            sql.append(" #{endDate} and datelist>= ");
        }else{
            sql.append("(select last_day(curdate())) and datelist>= ");
        }
        if(StringUtils.isNotBlank(query.getStartDate())){
            sql.append(" #{startDate} ) t2 ");
        }else{
            sql.append("(select DATE_ADD(curdate(),interval -day(curdate())+1 day))) t2  ");
        }
        sql.append("ON DATE_FORMAT(t1.update_time,'%Y-%m-%d')=t2.datelist ");

        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and t1.channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and t1.server_id in (").append(ids).append(")  ");
        }
        if (query.getPackageId()!=null) {
            sql.append(" and t1.package_id = #{packageId}  ");
        }
        sql.append(" GROUP BY t2.datelist");
        return sql.toString();
    }
}
