package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/startup")
public class StartupController extends BaseController {
    @Autowired
    private ServerService serverService;

    //查询服务器列表
    @RequestMapping(value = "/server_info", method = {RequestMethod.GET, RequestMethod.POST})
    public Response getServerInfo(ServerSearchQuery query) {
        List<Server> serverList = serverService.searchPage(query);
        return new Response("startup/server_info").request(query).data("serverList", serverList);
    }

    //查询服务器列表
    @RequestMapping(value = "/server_list", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<Server> getServerList(ServerSearchQuery query) {
        List<Server> serverList = serverService.searchList(query);
        return serverList;
    }

    //新增服务器
    @RequestMapping(value = "/server_createnew", method = {RequestMethod.GET, RequestMethod.POST})
    public Response createnew(Server server) {
        Response response = new Response();
        List<Server> list;
        ServerSearchQuery query = new ServerSearchQuery();
        if (server.getServerId() != null) {
            server.setPayAddress("http://" + server.getIp() + ":" + server.getChargePort() + "/ingcle/recharge");
            serverService.save(server);
            response.view("startup/server_info");
            list = serverService.searchPage(query);
            AdminController.serverList = serverService.searchList(query);
        } else {
            list = serverService.searchPage(query);
            response.view("startup/server_createnew");
        }
        response.request(query).data("serverList", list);
        return response;
    }

    //修改服务器状态
    @RequestMapping(value = "/server_changestate", method = {RequestMethod.GET, RequestMethod.POST})
    public Response changestate(Server server) {
        Response response = new Response();
        List<Server> list;
        ServerSearchQuery query = new ServerSearchQuery();
        if (server.getIds() != null) {
            Long[] ids = server.getIds();
            int serverState = server.getServerState();
            for (Long id : ids) {
                serverService.updateServerState(id, serverState, server.getMaintenanceTips());
            }
            list = serverService.searchPage(query);
            AdminController.serverList = serverService.searchList(query);
            response.view("startup/server_info");
        } else {
            list = serverService.searchList(query);
            response.view("startup/server_changestate");
        }
        response.request(query).data("serverList", list);
        return response;
    }

    //修改服务器信息
    @RequestMapping(value = "/server_edit", method = {RequestMethod.GET, RequestMethod.POST})
    public Response edit(Server server) {
        Response response = new Response();
        if (server.getId() != null) {
            server.setPayAddress("http://" + server.getIp() + ":" + server.getChargePort() + "/ingcle/recharge");
            serverService.update(server);
            ServerSearchQuery query = new ServerSearchQuery();
            List<Server> list = serverService.searchPage(query);
            response.request(query).data("serverList", list);
            AdminController.serverList = serverService.searchList(query);
            response.view("startup/server_info");
        } else {
            Server server1 = serverService.getByServerId(server.getServerId());
            response.data("server", server1);
            response.view("startup/server_edit");
        }
        return response;
    }

    //白名单
    @RequestMapping(value = "/server_whitelist", method = {RequestMethod.GET, RequestMethod.POST})
    public Response whitelist(Server server) {
        Response response = new Response();
        ServerSearchQuery query = new ServerSearchQuery();
        response.request(query);
        if (server.getIds() != null) {
            Long[] ids = server.getIds();
            int enable = server.getWhiteListEnable();
            String whiteList = server.getWhiteList();
            for (Long id : ids) {
                serverService.updateWhitelist(id, enable, whiteList);
            }
            AdminController.serverList = serverService.searchList(query);
            response.view("startup/server_info");
            response.data("serverList", serverService.searchPage(query));
        } else {
            response.view("startup/server_whitelist");
            response.data("serverList", serverService.searchList(query));
        }

        return response;
    }

    //合服
    @RequestMapping(value = "/server_combine", method = {RequestMethod.GET, RequestMethod.POST})
    public Response combine(ServerSearchQuery query) {
        Response response = new Response();
        response.request(query);
        if (query.getFromServer() != null) {
            if (SUCCESS.equals(serverService.combine(query))) {
                response.view("startup/server_info");
                response.data("serverList",serverService.searchPage(query));
            } else {
                return new Response(ResultCode.MERGE_SERVER_FAILED).json();
            }
        } else {
            response.view("startup/server_combine");
            response.data("serverList",serverService.searchList(query));
        }

        return response;
    }

    //更新服务器
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public Response update(Server server) {
        Response response = new Response();
        ServerSearchQuery query = new ServerSearchQuery();
        response.request(query);
        if (server.getIds() != null) {
            serverService.updateServer(server);
            response.view("startup/server_info")
                    .data("serverList", serverService.searchPage(query));
        } else {
            response.view("startup/update")
                    .data("serverList", serverService.searchList(query));
        }
        return response;
    }

    //停止服务器
    @RequestMapping(value = "/stop", method = {RequestMethod.GET, RequestMethod.POST})
    public Response stop(Server server) {
        Response response = new Response();
        ServerSearchQuery query = new ServerSearchQuery();
        response.request(query);
        if (server.getIds() != null) {
            serverService.stop(server);
            response.view("startup/server_info")
                    .data("serverList", serverService.searchPage(query));
        } else {
            response.view("startup/stop")
                    .data("serverList", serverService.searchList(query));
        }
        return response;
    }
}