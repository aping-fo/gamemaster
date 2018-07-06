package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ServerOnlineLogEntity;
import com.luckygames.wmxz.gamemaster.dao.ServerOnlineLogEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ServerOnlineLogSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.ServerOnlineLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerOnlineLogQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface ServerOnlineLogMapper extends ServerOnlineLogEntityMapper<ServerOnlineLogEntity> {
    @SelectProvider(type = ServerOnlineLogSqlProvider.class, method = "queryServerOnlineLog")
    Page<ServerOnlineLog> queryServerOnlineLog(ServerOnlineLogQuery query);
}
