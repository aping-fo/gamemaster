package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.ChatSettings;
import com.luckygames.wmxz.gamemaster.model.view.request.ChatSettingsSearchQuery;

public class ChatSettingsSqlProvider {
    public String search(ChatSettings ChatSettings) {
        StringBuilder sql = new StringBuilder("select * from chat_settings where ");
        sql.append("channel_id = "+ChatSettings.getChannelId());
        sql.append(" and server_id = "+ChatSettings.getServerId());
        sql.append(" and chat_channel = "+ChatSettings.getChatChannel());
         return sql.toString();
    }

    public String add(ChatSettings ChatSettings) {
        StringBuilder sql = new StringBuilder("insert into chat_settings(channel_id,server_id,chat_channel,chat_level,chat_vip,channel_name,server_name,create_time,update_time) values(");
                sql.append(ChatSettings.getChannelId());
                sql.append(","+ChatSettings.getServerId());
                sql.append(","+ChatSettings.getChatChannel());
                sql.append(","+ChatSettings.getChatLevel());
                sql.append(","+ChatSettings.getChatVip());
                sql.append(",'"+ChatSettings.getChannelName()+"'");
                sql.append(",'"+ChatSettings.getServerName()+"'");
                sql.append(",now(),now())");
        return sql.toString();
    }

    public String update(ChatSettings ChatSettings) {
//        StringBuilder sql = new StringBuilder("update create_role_manage set create_role="+ChatSettings.getCreateRole()+" where id="+ChatSettings.getId());
        StringBuilder sql = new StringBuilder("");
        return sql.toString();
    }

    public String searchPage(ChatSettingsSearchQuery query) {
        StringBuilder sql = new StringBuilder("SELECT * FROM chat_settings");
        return sql.toString();
    }
}
