package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ServerEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

<<<<<<< HEAD
public interface ServerService {

    public Server searchOne(Long serverId);

=======
public interface ServerService extends BaseService<ServerEntity> {
>>>>>>> origin/william
    List<Server> searchList(ServerSearchQuery request);

    Page<Server> searchPage(ServerSearchQuery request);

    Server getByServerId(Long serverId);

    long countServers();

    Server fixOpenDate(Long serverId, Date date);
}
