package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.ServerOnlineLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ServerOnlineLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.ServerOnlineLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerOnlineLogQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("serverOnlineLogService")
public class ServerOnlineLogServiceImpl extends BaseServiceImpl<ServerOnlineLogEntity> implements ServerOnlineLogService {
    @Autowired
    private ServerOnlineLogMapper serverOnlineLogMapper;

    @Override
    public Mapper<ServerOnlineLogEntity> getMapper() {
        return serverOnlineLogMapper;
    }

    @Override
    public Page<ServerOnlineLog> searchPage(ServerOnlineLogQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        if (query.getPageSize() == null) {
            query.setPageSize(24);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> serverOnlineLogMapper.queryServerOnlineLog(query));

    }
}
