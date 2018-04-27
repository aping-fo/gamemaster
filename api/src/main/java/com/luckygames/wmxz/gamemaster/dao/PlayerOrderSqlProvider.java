package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.PlayerOrderSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class PlayerOrderSqlProvider {
    public String queryPlayerOrder(PlayerOrderSearchQuery query) {
        StringBuilder sql = new StringBuilder("select po.* ")
                .append(" ,p.username username ")
                .append(" from player_order po ")
                .append(" inner join player p on p.player_id=po.player_id ")
                .append(" inner join player_character pc on pc.char_id=po.char_id ")
                .append(" where 1=1 ");

        if (query.getChannelId() != null && !query.getChannelId().isEmpty()) {
            String ids = StringUtils.join(query.getChannelId(), ",");
            sql.append(" and po.channel_id in (").append(ids).append(")  ");
        }
        if (query.getServerId() != null && !query.getServerId().isEmpty()) {
            String ids = StringUtils.join(query.getServerId(), ",");
            sql.append(" and po.server_id in (").append(ids).append(")  ");
        }

        if (StringUtils.isNotBlank(query.getStartDate())) {
            sql.append(" and po.recharged_date >= #{startDate}  ");
        }
        if (StringUtils.isNotBlank(query.getEndDate())) {
            sql.append(" and po.recharged_date < #{endDate}  ");
        }

        if (StringUtils.isNotBlank(query.getOrderCode())) {
            sql.append(" and po.order_code like \"%\"#{orderCode}\"%\" ");
        }

        if (StringUtils.isNotBlank(query.getPlayer())) {
            sql.append(" and ( p.username like \"%\"#{player}\"%\" or p.mobile like \"%\"#{player}\"%\" or p.id_card like \"%\"#{player}\"%\") ");
        }

        if (StringUtils.isNotBlank(query.getCharacter())) {
            sql.append(" and ( pc.char_name like \"%\"#{character}\"%\" ) ");
        }

        if (query.getGoldFrom() != null) {
            sql.append(" and po.gold_quantity >=#{goldFrom} ");
        }
        if (query.getGoldTo() != null) {
            sql.append(" and po.gold_quantity <=#{goldTo} ");
        }

        return sql.toString();
    }
}
