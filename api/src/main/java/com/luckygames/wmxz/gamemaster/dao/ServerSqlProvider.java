package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import org.apache.commons.lang3.StringUtils;

public class ServerSqlProvider extends ServerEntitySqlProvider {
    public String searchPage(ServerSearchQuery query) {
        StringBuilder sql = new StringBuilder(" SELECT * from server")
                .append(" WHERE 1=1 ");
        if (query.getServerId() != null) {
            sql.append(" and server_id like '%" + query.getServerId() + "%' ");
        }
        if (StringUtils.isNotBlank(query.getServerName())) {
            sql.append(" and server_name like \"%\"#{serverName}\"%\" ");
        }
        if (StringUtils.isNotBlank(query.getServerGroup())) {
            if (!query.getServerGroup().equals("other")) {
                sql.append(" and server_group = #{serverGroup}");
            } else {
                sql.append(" and server_group != 'ingcle' and server_group != 'ingcle_mixture' and server_group != 'ingcle_iOS'");
            }
        }
        sql.append(" order by server_id desc");
        return sql.toString();
    }

    public String servers(ServerSearchQuery query) {
        StringBuilder sql = new StringBuilder(" SELECT * from server WHERE 1=1");
        if (StringUtils.isNotBlank(query.getServerGroup())) {
            if (query.getServerGroup().equals("all")) {
                sql.append(" and (server_group = 'ingcle' or server_group = 'ingcle_mixture' or server_group = 'ingcle_iOS')");
            } else {
                sql.append(" and server_group = #{serverGroup}");
            }
        }
        if (query.getServerId() != null) {
            sql.append(" and server_id = #{serverId}");
        }
        sql.append(" order by server_id desc");
        return sql.toString();
    }

    public String searchList(ServerSearchQuery query) {
        StringBuilder sql = new StringBuilder(" SELECT * from server")
                .append(" WHERE 1=1 ");
        if (query.getServerId() != null) {
            sql.append(" and server_id like '%" + query.getServerId() + "%' ");
        }
        if (StringUtils.isNotBlank(query.getServerName())) {
            sql.append(" and server_name like \"%\"#{serverName}\"%\" ");
        }
        if (StringUtils.isNotBlank(query.getServerGroup())) {
            if (!query.getServerGroup().equals("other")) {
                sql.append(" and server_group = #{serverGroup}");
            } else {
                sql.append(" and server_group != 'ingcle' and server_group != 'ingcle_mixture' and server_group != 'ingcle_iOS'");
            }
        }
        sql.append(" order by server_id desc");
        return sql.toString();
    }
}
