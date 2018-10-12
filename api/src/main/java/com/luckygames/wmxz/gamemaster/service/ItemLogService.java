package com.luckygames.wmxz.gamemaster.service;


import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ItemLogEntity;
import com.luckygames.wmxz.gamemaster.model.entity.ItemLog;
import com.luckygames.wmxz.gamemaster.model.view.request.ItemLogSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

/**
 * @作者 周聪
 * @时间 2018/9/28 17:09
 */
public interface ItemLogService extends BaseNewService<ItemLogEntity> {
    Page<ItemLog> searchPage(ItemLogSearchQuery query);
}
