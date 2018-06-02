package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PlayerEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Player;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface PlayerService extends BaseService<PlayerEntity> {
    Player getByPlayerId(long playerId);

    long countPlayers();
}
