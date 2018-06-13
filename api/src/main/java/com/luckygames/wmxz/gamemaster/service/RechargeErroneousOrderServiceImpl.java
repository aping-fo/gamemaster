package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.RechargeErroneousOrderEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeErroneousOrderExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.RechargeErroneousOrderMapper;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeErroneousOrder;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeErroneousOrderSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("rechargeErroneousOrderService")
public class RechargeErroneousOrderServiceImpl extends BaseServiceImpl<RechargeErroneousOrderEntity> implements RechargeErroneousOrderService {
    @Autowired
    private RechargeErroneousOrderMapper rechargeErroneousOrderMapper;

    @Override
    public Mapper<RechargeErroneousOrderEntity> getMapper() {
        return rechargeErroneousOrderMapper;
    }

    @Override
    public Page<RechargeErroneousOrder> searchPage(RechargeErroneousOrderSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> rechargeErroneousOrderMapper.queryRechargeErroneousOrderReport(query));
    }

    private void saveRechargeErroneousOrderReport(List<RechargeErroneousOrder> list) {
        list.forEach(r -> {
            RechargeErroneousOrder rechargeErroneousOrder = findOne(r.getChannelId(), r.getServerId(), r.getReportDate());
            if (rechargeErroneousOrder == null) {
                rechargeErroneousOrder = new RechargeErroneousOrder();
            }
            BeanUtils.copyProperties(r, rechargeErroneousOrder);
            save(rechargeErroneousOrder);
        });
    }

    @Override
    public RechargeErroneousOrder findOne(Long channelId, Long serverId, Date date) {
        RechargeErroneousOrderExample example = new RechargeErroneousOrderExample();
        RechargeErroneousOrderExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andChannelIdEqualTo(channelId)
                .andServerIdEqualTo(serverId)
                .andReportDateEqualTo(date);
        List<RechargeErroneousOrderEntity> rechargeErroneousOrderList = rechargeErroneousOrderMapper.selectByExample(example);
        if (rechargeErroneousOrderList == null || rechargeErroneousOrderList.isEmpty()) {
            return null;
        }
        return BeanUtils.copyProperties(rechargeErroneousOrderList.get(0), RechargeErroneousOrder.class);
    }

    @Override
    public void generateRechargeErroneousOrderReportToday() {
        generateRechargeErroneousOrderReportByDay(DateUtils.TodayString());
    }


    @Override
    public void generateRechargeErroneousOrderReportByDay(String date) {
        List<RechargeErroneousOrder> list = rechargeErroneousOrderMapper.queryRechargeErroneousOrderReportFromOrderSingleDate(date);
        if (list == null || list.isEmpty()) {
            return;
        }
        saveRechargeErroneousOrderReport(list);
    }

}
