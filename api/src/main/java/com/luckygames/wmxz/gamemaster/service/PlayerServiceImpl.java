package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PlayerEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Player;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("playerService")
public class PlayerServiceImpl extends BaseServiceImpl<PlayerEntity> implements PlayerService {
    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public Player getByPlayerId(long playerId) {
        PlayerEntity playerEntity = playerMapper.selectOne(new PlayerEntity() {{
            setPlayerId(playerId);
            setStatus(Status.NORMAL);
        }});
        return BeanUtils.copyProperties(playerEntity, Player.class);
    }

    @Override
    public long countPlayers() {
        return this.playerMapper.selectCount(new PlayerEntity() {{
            setStatus(Status.NORMAL);
        }});
    }

    @Override
    public Mapper<PlayerEntity> getMapper() {
        return playerMapper;
    }
}
