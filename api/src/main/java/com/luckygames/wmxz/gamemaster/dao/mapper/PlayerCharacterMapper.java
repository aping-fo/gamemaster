package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface PlayerCharacterMapper extends PlayerCharacterEntityMapper<PlayerCharacterEntity> {
    @SelectProvider(type = PlayerCharacterSqlProvider.class, method = "queryCharacterDailyReport")
    List<PlayerCharacter> queryCharacterDailyReport(PlayerCharacterSearchQuery query);

    @SelectProvider(type = PlayerCharacterSqlProvider.class, method = "searchPlayerCharacter")
    List<PlayerCharacter> searchPlayerCharacter(PlayerCharacterSearchQuery query);

    @SelectProvider(type = PlayerCharacterSqlProvider.class, method = "updateStatus")
    List<PlayerCharacter> updateStatus(Long playerId,Integer operateStatus);
}