package com.luckygames.wmxz.gamemaster.service;


import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PlayerEntity;
import com.luckygames.wmxz.gamemaster.model.entity.Player;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

/**
 * @作者 周聪
 * @时间 2018/9/28 17:09
 */
public interface PlayerService extends BaseNewService<PlayerEntity> {
    Page<Player> searchPage(PlayerSearchQuery query);

    Player queryPlayer(Player player);
}
