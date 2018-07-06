package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntity;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

/**
 * Created by lucky on 2018/3/28.
 */
public interface PlayerCharacterService extends BaseService<PlayerCharacterEntity> {
    Page<PlayerCharacter> queryCharacterDailyReport(PlayerCharacterSearchQuery query);

    PlayerCharacter getByCharId(long playerId);

    long countCharaters();

    Page<PlayerCharacter> searchPage(PlayerCharacterSearchQuery query);

    PlayerCharacter getByCharName(Long serverId, String charName);

    void updateStatus(Long playerId,Integer operateStatus);
}
