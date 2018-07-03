package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.MailRewardEntity;
import com.luckygames.wmxz.gamemaster.model.entity.MailReward;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.List;

public interface MailRewardService extends BaseService<MailRewardEntity> {
    List<MailReward> saveMailRewards(Long mailLogId, List<String> rewardNames);
}
