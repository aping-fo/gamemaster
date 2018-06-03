package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ServerEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

public interface ServerService extends BaseService<ServerEntity> {
    List<Server> searchList(ServerSearchQuery request);

    Page<Server> searchPage(ServerSearchQuery request);

    Server getByServerId(Long serverId);

    long countServers();

    Server fixOpenDate(Long serverId, Date date);

    List<Server> searchList();
}
