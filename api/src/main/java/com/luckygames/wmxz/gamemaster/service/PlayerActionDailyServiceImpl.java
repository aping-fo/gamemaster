package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerActionDailyMapper;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("playerActionDailyService")
public class PlayerActionDailyServiceImpl extends BaseServiceImpl<PlayerActionDailyEntity> implements PlayerActionDailyService {
    @Autowired
    private PlayerActionDailyMapper playerActionDailyMapper;

    @Override
    public Mapper<PlayerActionDailyEntity> getMapper() {
        return playerActionDailyMapper;
    }
}
