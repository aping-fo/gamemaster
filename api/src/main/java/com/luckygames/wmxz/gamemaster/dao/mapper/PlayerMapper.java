package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PlayerEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PlayerSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Player;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface PlayerMapper extends PlayerEntityMapper<PlayerEntity> {
    @SelectProvider(type = PlayerSqlProvider.class, method = "searchPage")
    Page<Player> searchPage(PlayerSearchQuery query);
}