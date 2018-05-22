package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;

import java.util.List;

public interface ServerService {

    public Server searchOne(Long serverId);

    List<Server> searchList(ServerSearchQuery request);

    Page<Server> searchPage(ServerSearchQuery request);
}
