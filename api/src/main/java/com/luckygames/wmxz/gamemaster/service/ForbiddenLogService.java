package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.ForbiddenLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ForbiddenSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

public interface ForbiddenLogService extends BaseNewService<ForbiddenLogEntity> {
    Page<ForbiddenLog> searchPage(ForbiddenSearchQuery forbiddenQuery);

    ForbiddenLog searchByCharId(Long charId);

    void removeFobidden(Long charId);
}
