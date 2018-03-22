package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.dao.Channel;
import com.luckygames.wmxz.gamemaster.dao.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelSearchRequest;
import com.luckygames.wmxz.gamemaster.model.view.request.KeywordSearchRequest;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchRequest;
import com.luckygames.wmxz.gamemaster.service.ChannelService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/tools")
public class ToolsController extends BaseController {
    @Autowired
    private ServerService serverService;
    @Autowired
    private ChannelService channelService;

    @RequestMapping(value = "serverchannelselect", method = {RequestMethod.GET, RequestMethod.POST})
    public Response ServerChannelSelect(KeywordSearchRequest request) {
        Response r = new Response("tools/server_channel_select")
                .request(request);
        List<Server> serverList = serverService.searchList(new ServerSearchRequest(request));
        List<Channel> channelList = channelService.searchList(new ChannelSearchRequest(request));

        r.data("serverList", serverList).data("channelList", channelList);
        return r;
    }
}
