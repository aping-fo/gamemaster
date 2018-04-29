package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerActionLogMapper;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("playerActionLogService")
public class PlayerActionLogServiceImpl extends BaseServiceImpl<PlayerActionLogEntity> implements PlayerActionLogService {
    @Autowired
    private PlayerActionLogMapper playerActionLogMapper;

    @Override
    public Mapper<PlayerActionLogEntity> getMapper() {
        return playerActionLogMapper;
    }
}
