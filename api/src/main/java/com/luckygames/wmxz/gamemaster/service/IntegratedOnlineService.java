package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.IntegratedOnlineEntity;
import com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnline;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.List;

public interface IntegratedOnlineService extends BaseService<IntegratedOnlineEntity> {
    List<IntegratedOnline> searchPage(IntegratedOnlineSearchQuery query);
}
