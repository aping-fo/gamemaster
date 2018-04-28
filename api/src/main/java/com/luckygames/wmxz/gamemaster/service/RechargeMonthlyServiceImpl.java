package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.RechargeMonthlyMapper;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeMonthlySearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service("rechargeMonthlyService")
public class RechargeMonthlyServiceImpl extends BaseServiceImpl<RechargeMonthlyEntity> implements RechargeMonthlyService {
    @Autowired
    private RechargeMonthlyMapper rechargeMonthlyMapper;
    @Autowired
    private RechargeDailyService rechargeDailyService;
    @Autowired
    private RechargeMonthlyDayService rechargeMonthlyDayService;
    @Autowired
    private ChannelService channelService;
    @Autowired
    private ServerService serverService;

    @Override
    public Mapper<RechargeMonthlyEntity> getMapper() {
        return rechargeMonthlyMapper;
    }

    @Override
    public void generateRechargeMonthlyReportByDay(String date) {
        List<RechargeDaily> rechargeDailies = this.rechargeDailyService.findByOneDate(date);
        if (rechargeDailies == null || rechargeDailies.isEmpty()) {
            return;
        }
        saveRechargeMonthlyReport(rechargeDailies);
    }

    @Override
    public void generateRechargeMonthlyReportToday() {
        generateRechargeMonthlyReportByDay(DateUtils.TodayString());
    }

    @Override
    public void generateRechargeMonthlyReportYesterday() {
        generateRechargeMonthlyReportByDay(DateUtils.YesterdayString());
    }

    private void saveRechargeMonthlyReport(List<RechargeDaily> list) {
        list.forEach(r -> {
            int month = DateUtils.MonthFromDate(r.getReportDate());
            int year = DateUtils.YearFromDate(r.getReportDate());
            int day = DateUtils.DayFromDate(r.getReportDate());

            RechargeMonthly rechargeMonthly = findOne(r.getChannelId(), r.getServerId(), year, month);
            if (rechargeMonthly == null) {
                rechargeMonthly = new RechargeMonthly();
                rechargeMonthly.setStatus(Status.NORMAL);
                rechargeMonthly.setChannelId(r.getChannelId());
                Channel channel = channelService.getByChannelId(r.getChannelId());
                if (channel != null) {
                    rechargeMonthly.setChannelName(channel.getChannelName());
                }
                rechargeMonthly.setServerId(r.getServerId());
                Server server = serverService.getByServerId(r.getServerId());
                if (server != null) {
                    rechargeMonthly.setServerName(server.getServerName());
                    rechargeMonthly.setOpenDate(server.getOpenDate());
                }
                rechargeMonthly.setRechargeYear(year);
                rechargeMonthly.setRechargeMonth(month);
                rechargeMonthly.setRechargeAmount(r.getRechargeAmount());
                this.save(rechargeMonthly);
            }

            RechargeMonthlyDay rechargeMonthlyDay = this.rechargeMonthlyDayService.findOne(rechargeMonthly.getId(), day);
            if (rechargeMonthlyDay == null) {
                rechargeMonthlyDay = new RechargeMonthlyDay();
                rechargeMonthlyDay.setRechargeMonthlyId(rechargeMonthly.getId());
                rechargeMonthlyDay.setRechargeDay(day);
            }
            rechargeMonthlyDay.setAmount(r.getRechargeAmount());
            this.rechargeMonthlyDayService.save(rechargeMonthlyDay);


        });
    }

    @Override
    public RechargeMonthly findOne(Long channelId, Long serverId, int year, int month) {
        RechargeMonthlyEntity rechargeMonthlyEntity = rechargeMonthlyMapper.selectOne(new RechargeMonthlyEntity() {{
            setStatus(Status.NORMAL);
            setChannelId(channelId);
            setServerId(serverId);
            setRechargeYear(year);
            setRechargeMonth(month);
        }});

        return BeanUtils.copyProperties(rechargeMonthlyEntity, RechargeMonthly.class);
    }

    @Override
    public Page<RechargeMonthly> searchPage(RechargeMonthlySearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        if (StringUtils.isBlank(query.getStartDate())) {
            query.setStartDate(DateUtils.TodayString());
        }
        Page<RechargeMonthly> rechargeMonthlyPage = PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> rechargeMonthlyMapper.queryRechargeMonthlyReport(query));
        if (rechargeMonthlyPage == null) {
            return null;
        }
        List<RechargeMonthly> rechargeMonthlyList = rechargeMonthlyPage.getResult();
        rechargeMonthlyList.forEach(r -> {
            List<BigDecimal> amountMonthly = new ArrayList<>(Collections.nCopies(31, null));
            List<RechargeMonthlyDay> rechargeMonthlyDayList = this.rechargeMonthlyDayService.findByRechargeMonthlyId(r.getId());
            if (rechargeMonthlyDayList != null && !rechargeMonthlyDayList.isEmpty()) {
                rechargeMonthlyDayList.forEach(rd -> {
                    amountMonthly.set(rd.getRechargeDay() - 1, rd.getAmount());
                });
            }
            r.setAmountMonthly(amountMonthly);
        });
        return rechargeMonthlyPage;
    }

}
