package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ChatSettingsEntity;
import com.luckygames.wmxz.gamemaster.dao.ChatSettingsEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ChatSettingsSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.ChatSettings;
import com.luckygames.wmxz.gamemaster.model.view.request.ChatSettingsSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface ChatSettingsMapper extends ChatSettingsEntityMapper<ChatSettingsEntity> {
    @SelectProvider(type = ChatSettingsSqlProvider.class, method = "searchPage")
    Page<ChatSettings> searchPage(ChatSettingsSearchQuery query);

    @SelectProvider(type = ChatSettingsSqlProvider.class, method = "search")
    ChatSettings search(ChatSettings chatSettings);

    @SelectProvider(type = ChatSettingsSqlProvider.class, method = "update")
    void update(ChatSettings ChatSettings);

    @SelectProvider(type = ChatSettingsSqlProvider.class, method = "add")
    void add(ChatSettings ChatSettings);
}
