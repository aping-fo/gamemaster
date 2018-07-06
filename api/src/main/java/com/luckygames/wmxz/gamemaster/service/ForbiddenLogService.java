package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ForbiddenLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.ForbiddenLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ForbiddenSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface ForbiddenLogService extends BaseService<ForbiddenLogEntity> {
    Page<ForbiddenLog> searchPage(ForbiddenSearchQuery forbiddenQuery);

    void removeFobidden(Long charId);
}
