package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ChatSettingsEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ChatSettingsMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ChatSettings;
import com.luckygames.wmxz.gamemaster.model.view.request.ChatSettingsSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("ChatSettingsService")
public class ChatSettingsServiceImpl extends BaseServiceImpl<ChatSettingsEntity> implements ChatSettingsService {
    @Autowired
    private ChatSettingsMapper chatSettingsMapper;

    @Override
    public Mapper<ChatSettingsEntity> getMapper() {
        return chatSettingsMapper;
    }

    @Override
    public Page<ChatSettings> searchPage(ChatSettingsSearchQuery query) {
        return chatSettingsMapper.searchPage(query);
    }

    @Override
    public ChatSettings search(ChatSettings chatSettings) {
        return chatSettingsMapper.search(chatSettings);
    }

    @Override
    public void update(ChatSettings ChatSettings) {
        chatSettingsMapper.update(ChatSettings);
    }

    @Override
    public void add(ChatSettings ChatSettings) {
        chatSettingsMapper.add(ChatSettings);
    }
}
