package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ServerEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

import java.util.Date;
import java.util.List;

public interface ServerService extends BaseNewService<ServerEntity> {
    List<Server> searchList(ServerSearchQuery request);

    Page<Server> searchPage(ServerSearchQuery request);

    Server getByServerId(Long serverId);

    long countServers();

    Server fixOpenDate(Long serverId, Date date);

    List<Server> searchList();

    List<Server> searchAllList();

    void updateServerState(Long id, int serverState,String maintenanceTips);

    void updateWhitelist(Long id, int enable,String whiteList);

    String combine(ServerSearchQuery query);

    List<Server> servers(ServerSearchQuery query);

    void updateServer(Server server);

    void stop(Server server);
}
