package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntity;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;

public interface PlayerActionLogService extends BaseService<PlayerActionLogEntity> {
    Date getCharaterLastLogout(Long charId);
}
