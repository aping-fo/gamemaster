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
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> rechargeErroneousOrderMapper.searchPage(query));
    }
}
