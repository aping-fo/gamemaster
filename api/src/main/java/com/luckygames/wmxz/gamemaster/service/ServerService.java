package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchRequest;

import java.util.List;

public interface ServerService {
    List<Server> searchList(ServerSearchRequest request);

    Page<Server> searchPage(ServerSearchRequest request);
}
