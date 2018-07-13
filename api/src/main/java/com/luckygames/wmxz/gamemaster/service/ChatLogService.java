package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ChatLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.ChatLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ChatLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface ChatLogService extends BaseService<ChatLogEntity> {
    ChatLog saveChatLog(ChatLog chatLog);

    Page<ChatLog> loadLastChatLog(ChatLogSearchQuery query);
}
