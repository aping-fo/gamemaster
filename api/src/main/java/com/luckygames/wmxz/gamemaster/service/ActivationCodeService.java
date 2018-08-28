package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface ActivationCodeService extends BaseService<ActivationCodeEntity> {
    Page<ActivationCode> searchPage(ActivationCodeSearchQuery query);
    ActivationCode searchById(Long id);
    Page<ActivationCode> add(ActivationCode activationCode);
}
