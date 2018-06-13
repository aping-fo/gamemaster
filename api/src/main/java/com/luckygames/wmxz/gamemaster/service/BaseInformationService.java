package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.BaseInformationEntity;
import com.luckygames.wmxz.gamemaster.model.entity.BaseInformation;
import com.luckygames.wmxz.gamemaster.model.view.request.BaseInformationSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface BaseInformationService extends BaseService<BaseInformationEntity> {
    BaseInformation searchById(Integer charId);
}
