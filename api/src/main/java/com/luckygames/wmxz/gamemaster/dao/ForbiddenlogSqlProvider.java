package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.ForbiddenSearchQuery;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class ForbiddenlogSqlProvider {
    public String queryFobiddenLog(ForbiddenSearchQuery query) {
        StringBuilder sql = new StringBuilder("select f.* ")
                .append(" ,p.username ")
                .append(" ,pc.char_name ")
                .append(" from forbidden_log f ")
                .append(" left join player p on p.player_id=f.player_id ")
                .append(" left join player_character pc on pc.char_id=f.char_id ")
                .append(" where 1=1 ")
                .append(" and f.status = ").append(Status.NORMAL.code());

        if (CollectionUtils.isNotEmpty(query.getChannelIds())) {
            String ids = StringUtils.join(query.getChannelIds(), ",");
            sql.append(" and f.channel_id in (").append(ids).append(")  ");
        }
        if (CollectionUtils.isNotEmpty(query.getServerIds())) {
            String ids = StringUtils.join(query.getServerIds(), ",");
            sql.append(" and f.server_id in (").append(ids).append(")  ");
        }
        if (query.getForbiddenType() != null) {
            sql.append(" and forbidden_type = #{forbiddenType} ");
        }
        if (StringUtils.isNotBlank(query.getUsername())) {
            sql.append(" and ( p.username like \"%\"#{userName}\"%\" or p.mobile like \"%\"#{userName}\"%\" or p.id_card like \"%\"#{userName}\"%\") ");
        }
        if (StringUtils.isNotBlank(query.getCharName())) {
            sql.append(" and ( pc.char_name like \"%\"#{charName}\"%\" ) ");
        }
        if (StringUtils.isNotBlank(query.getIpAddress())) {
            sql.append(" and ( f.ip_address like \"%\"#{ipAddress}\"%\" ) ");
        }
        return sql.toString();
    }
}
