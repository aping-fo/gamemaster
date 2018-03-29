package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerOrderSearchQuery;

public interface PlayerOrderService {
    Page<PlayerOrder> searchPage(PlayerOrderSearchQuery playerOrderSearchQuery);
}
