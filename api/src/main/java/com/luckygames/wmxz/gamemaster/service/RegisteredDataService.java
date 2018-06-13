package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RegisteredDataEntity;
import com.luckygames.wmxz.gamemaster.model.entity.RegisteredData;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface RegisteredDataService extends BaseService<RegisteredDataEntity> {
    Page<RegisteredData> searchPage(CommonSearchQuery query);
    void save(RegisteredData registeredData);
}
