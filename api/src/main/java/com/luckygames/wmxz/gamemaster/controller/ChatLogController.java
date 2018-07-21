package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.ChatLog;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ChatLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ChatLogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ChatLogController extends BaseController {
    @Autowired
    private ChatLogService chatLogService;

    @RequestMapping(value = "/chatlog/save", method = {RequestMethod.GET, RequestMethod.POST})
    public Response saveChatLog(ChatLog chatLog) {
        if (chatLog.getServerId() == null || chatLog.getServerId() <= 0) {
            return new Response(ResultCode.SERVER_ID_INVALID).json();
        }
        if (chatLog.getCharId() == null || chatLog.getCharId() <= 0) {
            return new Response(ResultCode.CHARACTER_ID_INVALID).json();
        }
        if (chatLog.getChatChannel()==null) {
            return new Response(ResultCode.CHAT_CHANNEL_INVALID).json();
        }

        ChatLog newChatLog = chatLogService.saveChatLog(chatLog);
        if (newChatLog == null) {
            return new Response(ResultCode.CHAT_LOG_SAVE_FAILED).json();
        }

        return new Response().data("chatLog", newChatLog).json();
    }

    @RequestMapping(value = "/game/chatmonitor", method = {RequestMethod.GET, RequestMethod.POST})
    public Response charMonitor(ChatLogSearchQuery query) {
        return new Response("game/chatmonitor")
                .request(query);
    }

    @RequestMapping(value = "/game/chatmonitor_frame", method = {RequestMethod.GET, RequestMethod.POST})
    public Response charMonitorData(ChatLogSearchQuery query) {
        Page<ChatLog> chatLogList = chatLogService.loadLastChatLog(query);
        return new Response("game/chatmonitor_frame")
                .request(query)
                .data("chatLogList", chatLogList);
    }
}
