package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.RechargeErroneousOrderSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class RechargeErroneousOrderSqlProvider {
    public String searchPage(RechargeErroneousOrderSearchQuery query) {
        StringBuilder sql = new StringBuilder("select po.* ")
                .append(" ,p.username username ")
                .append(" from recharge_Erroneous_order po ")
                .append(" inner join player p on p.player_id=po.player_id ")
                .append(" inner join player_character pc on pc.char_id=po.char_id ")
                .append(" where 1=1 ");
        if (query.getChannelIds() != null && !query.getChannelIds().isEmpty()) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and po.channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerIds() != null && !query.getServerIds().isEmpty()) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and po.server_id in (").append(ids).append(")  ");
        }
        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and DATE_FORMAT(po.report_date,'%Y-%m-%d') >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and DATE_FORMAT(po.report_date,'%Y-%m-%d') <= #{endDate}  ");
        }
        if (StringUtils.isNotBlank(query.getOrderCode())) {
            sql.append(" and po.order_code like \"%\"#{orderCode}\"%\" ");
        }
        if (StringUtils.isNotBlank(query.getUserName())) {
            sql.append(" and ( p.username like \"%"+query.getUserName()+"%\" or p.mobile like \"%"+query.getUserName()+"%\" or p.id_card like \"%"+query.getUserName()+"%\") ");
        }
        if (StringUtils.isNotBlank(query.getCharName())) {
            sql.append(" and ( pc.char_name like \"%\"#{charName}\"%\" ) ");
        }
        sql.append(" order by po.update_time desc");
        return sql.toString();
    }
}
