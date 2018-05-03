package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.PayLTVEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.PayLTVMapper;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

@Service("payLTVService")
public class PayLTVServiceImpl extends BaseServiceImpl<PayLTVEntity> implements PayLTVService {
    @Autowired
    private PayLTVMapper payLTVMapper;

    @Override
    public Mapper<PayLTVEntity> getMapper() {
        return payLTVMapper;
    }
}
