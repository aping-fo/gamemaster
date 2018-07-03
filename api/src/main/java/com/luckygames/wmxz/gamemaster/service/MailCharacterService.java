package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.MailCharacterEntity;
import com.luckygames.wmxz.gamemaster.model.entity.MailCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.List;

public interface MailCharacterService extends BaseService<MailCharacterEntity> {
    List<MailCharacter> saveMailCharacters(Long mailLogId, List<PlayerCharacter> playerCharacters);
}
