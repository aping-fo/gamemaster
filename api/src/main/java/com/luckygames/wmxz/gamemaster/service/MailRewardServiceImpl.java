package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.MailRewardEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.MailRewardMapper;
import com.luckygames.wmxz.gamemaster.model.entity.MailReward;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.ArrayList;
import java.util.List;

@Service("mailRewardService")
public class MailRewardServiceImpl extends BaseServiceImpl<MailRewardEntity> implements MailRewardService {
    @Autowired
    private MailRewardMapper mailRewardMapper;

    @Override
    public Mapper<MailRewardEntity> getMapper() {
        return mailRewardMapper;
    }

    @Override
    public List<MailReward> saveMailRewards(Long mailLogId, List<String> rewardNames) {
        if (mailLogId == null) {
            return null;
        }
        if (CollectionUtils.isEmpty(rewardNames)) {
            return null;
        }
        List<MailReward> mailRewards = new ArrayList<>();
        rewardNames.forEach(pc -> {
            MailReward mailReward = new MailReward();
            mailReward.setMailId(mailLogId);
            mailReward.setReward(pc);
            mailReward.setStatus(Status.NORMAL);
            save(mailReward);

            mailRewards.add(mailReward);
        });
        return mailRewards;

    }
}
