package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.SingleServiceBagEntity;
import com.luckygames.wmxz.gamemaster.model.entity.SingleServiceBag;
import com.luckygames.wmxz.gamemaster.model.view.request.SingleServiceBagSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface SingleServiceBagService extends BaseService<SingleServiceBagEntity> {
    Page<SingleServiceBag> searchPage(SingleServiceBagSearchQuery query);
}
