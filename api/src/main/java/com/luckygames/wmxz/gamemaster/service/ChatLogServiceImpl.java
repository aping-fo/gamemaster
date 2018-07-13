package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ChatLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ChatLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ChatLog;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.ChatLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("chatLogService")
public class ChatLogServiceImpl extends BaseServiceImpl<ChatLogEntity> implements ChatLogService {
    @Autowired
    private ChatLogMapper chatLogMapper;

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private ServerService serverService;
    @Autowired
    private PlayerCharacterService playerCharacterService;

    @Override
    public Mapper<ChatLogEntity> getMapper() {
        return chatLogMapper;
    }

    @Override
    public ChatLog saveChatLog(ChatLog chatLog) {
        if (chatLog.getServerId() != null) {
            Server server = serverService.getByServerId(chatLog.getServerId());
            if (server == null) {
                return null;
            }
            chatLog.setServerName(server.getServerName());
        }

        if (chatLog.getCharId() != null) {
            PlayerCharacter character = playerCharacterService.getByCharId(chatLog.getCharId());
            if (character == null) {
                return null;
            }
            chatLog.setCharName(character.getCharName());
        }

        if (chatLog.getToCharId() != null) {
            PlayerCharacter character = playerCharacterService.getByCharId(chatLog.getToCharId());
            if (character == null) {
                return null;
            }
            chatLog.setToCharName(character.getCharName());

        }
        Long id = create(chatLog);

        Long l = redisTemplate.opsForList().leftPush("CHAT_LOG_" + chatLog.getChatChannel(), chatLog);
        l = redisTemplate.opsForList().leftPush("CHAT_LOG_ALL", chatLog);

        return chatLog;
    }

    @Override
    public Page<ChatLog> loadLastChatLog(ChatLogSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        if (query.getPageSize() == null) {
            query.setPageSize(50);
        }

        long start = (query.getPageNum() - 1) * query.getPageSize();
        long end = start + query.getPageSize();
        String channel = StringUtils.isBlank(query.getChatChannel()) ? "CHAT_LOG_ALL" : "CHAT_LOG_" + query.getChatChannel();
        Page<ChatLog> chatLogList = new Page<>();

        ListOperations listOperations = redisTemplate.opsForList();
        List range = listOperations.range(channel, start, end);
        chatLogList.addAll(range);

        return chatLogList;
    }
}
