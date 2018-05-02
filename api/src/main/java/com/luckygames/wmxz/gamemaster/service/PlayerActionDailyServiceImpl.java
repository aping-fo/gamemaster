package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.PlayerActionDailyExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerActionDailyMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionDaily;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("playerActionDailyService")
public class PlayerActionDailyServiceImpl extends BaseServiceImpl<PlayerActionDailyEntity> implements PlayerActionDailyService {
    @Autowired
    private PlayerActionDailyMapper playerActionDailyMapper;

    @Override
    public Mapper<PlayerActionDailyEntity> getMapper() {
        return playerActionDailyMapper;
    }

    @Override
    public void generatePlayerActionDailyReportToday() {
        generatePlayerActionDailyReportByDay(DateUtils.Now());
    }

    @Override
    public void generatePlayerActionDailyReportYesterday() {
        generatePlayerActionDailyReportByDay(DateUtils.AddDays(DateUtils.Now(), -1));
    }

    @Override
    public void generatePlayerActionDailyReportByDay(Date date) {
        List<PlayerActionDaily> list = this.playerActionDailyMapper.queryPlayerDailyReportSingleDate(date);
        if (list == null || list.isEmpty()) {
            return;
        }
        savePlayerActionDailyReport(list);
    }

    @Override
    public void generatePlayerActionDailyReportByDay(String date) {
        generatePlayerActionDailyReportByDay(DateUtils.StringToDate(date));
    }

    private void savePlayerActionDailyReport(List<PlayerActionDaily> list) {
        list.forEach(r -> {
            PlayerActionDaily playerActionDaily = findOne(r.getChannelId(), r.getServerId(), r.getReportDate());
            if (playerActionDaily == null) {
                playerActionDaily = new PlayerActionDaily();
            }
            BeanUtils.copyProperties(r, playerActionDaily);
            save(playerActionDaily);
        });
    }

    @Override
    public PlayerActionDaily findOne(Long channelId, Long serverId, String reportDate) {
        PlayerActionDailyExample example = new PlayerActionDailyExample();
        PlayerActionDailyExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andChannelIdEqualTo(channelId)
                .andServerIdEqualTo(serverId)
                .andReportDateEqualTo(reportDate);
        List<PlayerActionDailyEntity> list = playerActionDailyMapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return BeanUtils.copyProperties(list.get(0), PlayerActionDaily.class);

    }

    @Override
    public Page<PlayerActionDaily> searchRegisterPage(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerActionDailyMapper.queryPlayerActionDailyRegisterReport(query));
    }

    @Override
    public Page<PlayerActionDaily> searchCharacterPage(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerActionDailyMapper.queryPlayerActionDailyCharacterReport(query));
    }
}
