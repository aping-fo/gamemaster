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

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/startup")
public class StartupController extends BaseController {
    @Autowired
    private ServerService serverService;
    private String[] stateNameList={"一般","火爆","爆满","新服","推荐","审核服务","代理服"};
    @RequestMapping(value = "/server_info", method = {RequestMethod.GET, RequestMethod.POST})
    public Response getServerList(ServerSearchQuery request) {
        if(request.getServerId() == null && request.getServerName() == null)
        {
            List<Server> serverList = serverService.searchPage(request);
            return new Response("startup/server_info")
                    .request(request)
                    .data("serverList", serverList);
        }
        else
        {
            int sid=request.getServerId() == null? 0:request.getServerId();
            String sname=request.getServerName();
            List<Server> serverList = serverService.searchList();
            Page<Server> result = new Page<Server>();
            Object[] arr=serverList.toArray();
            Server server=null;

            for(int i=0;i<arr.length;i++)
            {
                boolean equalA=false;
                boolean equalB=false;
                Server item=serverList.get(i);
                if(item.getServerId()==sid || sid == 0)
                {
                    equalA=true;
                }
                if(sname == null || sname == "" || item.getServerName().contains(sname))
                {
                    equalB=true;
                }
                if(equalA && equalB)
                {
                    result.add(item);
                }
            }
            return new Response("startup/server_info")
                    .request(request)
                    .data("serverList", result);
        }
    }
    @RequestMapping(value = "/server_createnew", method = {RequestMethod.GET, RequestMethod.POST})
    public Response createnew(ServerSearchQuery request) {
        ArrayList<ServerState> list=new ArrayList<ServerState>();
        for(int i=0;i<stateNameList.length;i++)
        {
            ServerState state=new ServerState();
            state.name=stateNameList[i];
            state.sign=i;
            list.add(state);
        }

        return new Response("startup/server_createnew")
                .request(request)
                .data("stateList", list);
    }
    @RequestMapping(value = "/server_changestate", method = {RequestMethod.GET, RequestMethod.POST})
    public Response changestate(ServerSearchQuery request) {
        List<Server> serverList = serverService.searchPage(request);
        return new Response("startup/server_changestate")
                .request(request)
                .data("serverList", serverList);
    }

    @RequestMapping(value = "/server_combine", method = {RequestMethod.GET, RequestMethod.POST})
    public Response combine(ServerSearchQuery request) {
        List<Server> serverList = serverService.searchPage(request);
        return new Response("startup/server_combine")
                .request(request)
                .data("serverList", serverList);
    }
    @RequestMapping(value = "/server_whitelist", method = {RequestMethod.GET, RequestMethod.POST})
    public Response whitelist(ServerSearchQuery request) {
        List<Server> serverList = serverService.searchPage(request);
        return new Response("startup/server_whitelist")
                .request(request)
                .data("serverList", serverList);
    }

    @RequestMapping(value = "/server_edit", method = {RequestMethod.GET, RequestMethod.POST})
    public Response edit(ServerSearchQuery request) {
        ArrayList<ServerState> list=new ArrayList<ServerState>();
        for(int i=0;i<stateNameList.length;i++)
        {
            ServerState state=new ServerState();
            state.name=stateNameList[i];
            state.sign=i;
            list.add(state);
        }
        int sid=request.getServerId();
        List<Server> serverList = serverService.searchList();
        Object[] arr=serverList.toArray();
        Server server=null;
        for(int i=0;i<arr.length;i++)
        {
            Server item=serverList.get(i);
            if(item.getServerId()==sid)
            {
                server=item;
                break;
            }

        }
        return new Response("startup/server_edit")
                .request(request)
                .data("server", server).data("stateList", list);
    }

}
class ServerState
{
    public String name;
    public int sign;
}

