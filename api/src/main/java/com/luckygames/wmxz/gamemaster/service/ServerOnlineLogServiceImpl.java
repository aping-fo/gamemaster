package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.ServerOnlineLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ServerOnlineLogMapper;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

public class ServerOnlineLogServiceImpl extends BaseServiceImpl<ServerOnlineLogEntity> implements ServerOnlineLogService {
    @Autowired
    private ServerOnlineLogMapper serverOnlineLogMapper;

    @Override
    public Mapper<ServerOnlineLogEntity> getMapper() {
        return serverOnlineLogMapper;
    }
}
