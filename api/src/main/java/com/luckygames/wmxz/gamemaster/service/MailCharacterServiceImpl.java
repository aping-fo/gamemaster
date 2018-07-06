package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.MailCharacterEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.MailCharacterMapper;
import com.luckygames.wmxz.gamemaster.model.entity.MailCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.List;

@Service("mailCharacterService")
public class MailCharacterServiceImpl extends BaseServiceImpl<MailCharacterEntity> implements MailCharacterService {
    @Autowired
    private MailCharacterMapper mailCharacterMapper;

    @Override
    public Mapper<MailCharacterEntity> getMapper() {
        return mailCharacterMapper;
    }

    @Override
    public List<MailCharacter> saveMailCharacters(Long mailLogId, List<PlayerCharacter> playerCharacters) {
        if (mailLogId == null) {
            return null;
        }
        if (CollectionUtils.isEmpty(playerCharacters)) {
            return null;
        }
        List<MailCharacter> mailCharacters = new ArrayList<>();
        playerCharacters.forEach(pc -> {
            MailCharacter mailCharacter = new MailCharacter();
            mailCharacter.setMailId(mailLogId);
            mailCharacter.setCharId(pc.getCharId());
            mailCharacter.setCharName(pc.getCharName());
            mailCharacter.setStatus(Status.NORMAL);
            save(mailCharacter);

            mailCharacters.add(mailCharacter);
        });
        return mailCharacters;
    }
}
