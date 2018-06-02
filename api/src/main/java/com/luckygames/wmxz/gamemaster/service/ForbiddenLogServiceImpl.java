package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.ForbiddenLogMapper;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

public class ForbiddenLogServiceImpl extends BaseServiceImpl<ForbiddenLogEntity> implements ForbiddenLogService {
    @Autowired
    private ForbiddenLogMapper forbiddenLogMapper;

    @Override
    public Mapper<ForbiddenLogEntity> getMapper() {
        return forbiddenLogMapper;
    }
}
