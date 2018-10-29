package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewService;

import java.util.List;

public interface ActivationCodeService extends BaseNewService<ActivationCodeEntity> {
    Page<ActivationCode> searchPage(ActivationCodeSearchQuery query);

    ActivationCode searchById(Long id);

    Page<ActivationCode> add(ActivationCode activationCode);

    List<ActivationCode> searchByServerId(Long serverId);

    ActivationCode searchLast();

    Page<ActivationCode> search(String remarks);

    void updateAllActivationCode(String useServerId, String name);

    void addAllActivationCode();
}
