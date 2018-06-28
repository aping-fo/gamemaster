package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ServerOnlineLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.ServerOnlineLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerOnlineLogQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface ServerOnlineLogService extends BaseService<ServerOnlineLogEntity> {
    Page<ServerOnlineLog> searchPage(ServerOnlineLogQuery query);
}
