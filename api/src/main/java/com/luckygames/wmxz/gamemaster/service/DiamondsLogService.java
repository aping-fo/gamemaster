package com.luckygames.wmxz.gamemaster.service;


import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.DiamondLogsEntity;
import com.luckygames.wmxz.gamemaster.model.entity.DiamondsLog;
import com.luckygames.wmxz.gamemaster.model.view.request.DiamondsLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

/**
 * @作者 周聪
 * @时间 2018/9/28 17:09
 */
public interface DiamondsLogService extends BaseNewService<DiamondLogsEntity> {
    Page<DiamondsLog> searchPage(DiamondsLogSearchQuery query);
}
