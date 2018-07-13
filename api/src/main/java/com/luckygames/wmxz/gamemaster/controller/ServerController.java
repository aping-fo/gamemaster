package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/server")
public class ServerController extends BaseController {
    @Autowired
    private ServerService serverService;

    @RequestMapping(value = "/select", method = {RequestMethod.GET, RequestMethod.POST})
    public Response search(ServerSearchQuery request) {
        Response r = new Response("server/select")
                .request(request);

        if(request.getServerId()!=null){
            r.data("serverId",request.getServerId());
        }

        if (request.getPageNum() == null) {
            List<Server> serverList = serverService.searchList(request);
            r.data("serverList", serverList);
        } else {
            Page<Server> serverList = serverService.searchPage(request);
            r.data("serverList", serverList);
        }

        return r;
    }
}
