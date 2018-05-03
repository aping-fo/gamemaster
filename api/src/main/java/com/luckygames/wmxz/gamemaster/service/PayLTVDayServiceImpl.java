package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.PayLTVDayMapper;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("payLTVDayService")
public class PayLTVDayServiceImpl extends BaseServiceImpl<PayLTVDayEntity> implements PayLTVDayService {
    @Autowired
    private PayLTVDayMapper payLTVDayMapper;

    @Override
    public Mapper<PayLTVDayEntity> getMapper() {
        return payLTVDayMapper;
    }
}
