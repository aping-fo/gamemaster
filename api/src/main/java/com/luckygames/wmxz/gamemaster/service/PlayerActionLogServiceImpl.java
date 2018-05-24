package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntityExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerActionLogMapper;
import com.luckygames.wmxz.gamemaster.model.enums.ActionType;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("playerActionLogService")
public class PlayerActionLogServiceImpl extends BaseServiceImpl<PlayerActionLogEntity> implements PlayerActionLogService {
    @Autowired
    private PlayerActionLogMapper playerActionLogMapper;

    @Override
    public Mapper<PlayerActionLogEntity> getMapper() {
        return playerActionLogMapper;
    }

    @Override
    public Date getCharaterLastLogout(Long charId) {
        PlayerActionLogEntityExample example = new PlayerActionLogEntityExample();
        PlayerActionLogEntityExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andCharIdEqualTo(charId)
                .andActionEqualTo(ActionType.OFFLINE);
        example.setOrderByClause("action_date desc");
        List<PlayerActionLogEntity> playerActionLogEntities = playerActionLogMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(playerActionLogEntities)) {
            return null;
        }
        return playerActionLogEntities.get(0).getActionDate();
    }
}
