package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionLogEntityExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerActionLogMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionLog;
import com.luckygames.wmxz.gamemaster.model.enums.ActionType;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerActionLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
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

    @Override
    public Page<PlayerActionLog> searchEquipmentCountPage(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerActionLogMapper.queryEquipmentCountReport(query));
    }

    @Override
    public Page<PlayerActionLog> searchLeaveLoss(PlayerActionLogSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerActionLogMapper.searchLeaveLoss(query));

    }

    @Override
    public Page<PlayerActionLog> searchLeaveDistribution(PlayerActionLogSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerActionLogMapper.searchLeaveDistribution(query));
    }

    @Override
    public Page<PlayerActionLog> searchLeProduceExpend(PlayerActionLogSearchQuery query) {
        return playerActionLogMapper.searchLeProduceExpend(query);
    }
}
