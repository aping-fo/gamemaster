package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineServiceEntity;
import com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnlineService;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineServiceSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface IntegratedOnlineServiceService extends BaseService<IntegratedOnlineServiceEntity> {
    Page<IntegratedOnlineService> searchPage(IntegratedOnlineServiceSearchQuery query);
}
