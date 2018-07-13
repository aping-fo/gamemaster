package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ChatSettingsEntity;
import com.luckygames.wmxz.gamemaster.model.entity.ChatSettings;
import com.luckygames.wmxz.gamemaster.model.view.request.ChatSettingsSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface ChatSettingsService extends BaseService<ChatSettingsEntity> {
    Page<ChatSettings> searchPage(ChatSettingsSearchQuery query);

    ChatSettings search(ChatSettings chatSettings);

//    void update(ChatSettings chatSettings);

    void add(ChatSettings ChatSettings);
}
