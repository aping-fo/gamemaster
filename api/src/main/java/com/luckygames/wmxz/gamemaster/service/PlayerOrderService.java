package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderEntity;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerOrderSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.math.BigDecimal;

public interface PlayerOrderService extends BaseService<PlayerOrderEntity> {
    Page<PlayerOrder> searchPage(PlayerOrderSearchQuery playerOrderSearchQuery);

    BigDecimal sumRechargeAmount(Long serverId);

    Integer countRechargeCount(Long serverId);
}
