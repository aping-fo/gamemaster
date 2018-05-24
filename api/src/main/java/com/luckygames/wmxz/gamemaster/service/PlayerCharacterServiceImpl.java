package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerCharacterMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by lucky on 2018/3/28.
 */
@Service("playerCharacter")
public class PlayerCharacterServiceImpl extends BaseServiceImpl<PlayerCharacterEntity> implements PlayerCharacterService {

    @Autowired
    private PlayerCharacterMapper playerCharacterMapper;

    @Override
    public Page<PlayerCharacter> queryCharacterDailyReport(PlayerCharacterSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerCharacterMapper.queryCharacterDailyReport(query));
    }

    @Override
    public PlayerCharacter getByCharId(long playerId) {
        PlayerCharacterEntity playerCharacterEntity = playerCharacterMapper.selectOne(new PlayerCharacterEntity() {{
            setPlayerId(playerId);
            setStatus(Status.NORMAL);
        }});
        return BeanUtils.copyProperties(playerCharacterEntity, PlayerCharacter.class);
    }

    @Override
    public long countCharaters() {
        return this.playerCharacterMapper.selectCount(new PlayerCharacterEntity() {{
            setStatus(Status.NORMAL);
        }});
    }

    @Override
    public Mapper<PlayerCharacterEntity> getMapper() {
        return playerCharacterMapper;
    }
}
