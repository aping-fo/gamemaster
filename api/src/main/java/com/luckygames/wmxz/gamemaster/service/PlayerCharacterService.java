package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;

/**
 * Created by lucky on 2018/3/28.
 */
public interface PlayerCharacterService {
    Page<PlayerCharacter> queryCharacter(PlayerCharacterSearchQuery query);

}
