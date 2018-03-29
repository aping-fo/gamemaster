package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerOrderMapper;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeStatics;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lucky on 2018/3/28.
 * 充值查询
 */
@Service("rechargeService")
public class RechargeServiceImpl implements RechargeService {
    @Autowired
    private PlayerOrderMapper playerOrderMapper;

    /**
     * @param query
     * @return
     */
    public Page<RechargeStatics> queryServerRechargeTotal(CommonSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerOrderMapper.queryServerRechargeStaticsReportFromOrder());
    }
}
