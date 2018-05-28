package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.RechargeMonthlyDayEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.RechargeMonthlyDayMapper;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeMonthlyDay;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service("rechargeMonthlyDayService")
public class RechargeMonthlyDayServiceImpl extends BaseServiceImpl<RechargeMonthlyDayEntity> implements RechargeMonthlyDayService {
    @Autowired
    private RechargeMonthlyDayMapper rechargeMonthlyDayMapper;

    @Override
    public Mapper<RechargeMonthlyDayEntity> getMapper() {
        return rechargeMonthlyDayMapper;
    }

    @Override
    public RechargeMonthlyDay findOne(Long rechargeMonthlyId, int day) {
        RechargeMonthlyDayEntity rechargeMonthlyDayEntity = this.rechargeMonthlyDayMapper.selectOne(new RechargeMonthlyDayEntity() {{
            setStatus(Status.NORMAL);
            setRechargeMonthlyId(rechargeMonthlyId);
            setRechargeDay(day);
        }});
        return BeanUtils.copyProperties(rechargeMonthlyDayEntity, RechargeMonthlyDay.class);
    }

    @Override
    public List<RechargeMonthlyDay> findByRechargeMonthlyId(Long rechargeMonthlyId) {
        List<RechargeMonthlyDayEntity> rechargeMonthlyDayEntityList = this.rechargeMonthlyDayMapper.select(new RechargeMonthlyDayEntity() {{
            setStatus(Status.NORMAL);
            setRechargeMonthlyId(rechargeMonthlyId);
        }});
        return BeanUtils.copyListProperties(rechargeMonthlyDayEntityList, RechargeMonthlyDay.class);
    }
}
