package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.Channel;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/channel")
public class ChannelController extends BaseController {
    @Autowired
    private ChannelService channelService;

    @RequestMapping(value = "/select", method = {RequestMethod.GET, RequestMethod.POST})
    public Response search(ChannelSearchQuery request) {
        Response r = new Response("channel/select")
                .request(request);

        if (request.getPageNum() == null) {
            List<Channel> channelList = channelService.searchList(request);
            r.data("channelList", channelList);
        } else {
            Page<Channel> channelList = channelService.searchPage(request);
            r.data("channelList", channelList);
        }

        return r;
    }
}
