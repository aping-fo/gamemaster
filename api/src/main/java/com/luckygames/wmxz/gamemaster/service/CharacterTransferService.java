package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.CharacterTransferEntity;
import com.luckygames.wmxz.gamemaster.model.entity.CharacterTransfer;
import com.luckygames.wmxz.gamemaster.model.view.request.CharacterTransferSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

public interface CharacterTransferService extends BaseService<CharacterTransferEntity> {
    Page<CharacterTransfer> searchPage(CharacterTransferSearchQuery query);
    void addCharacterTransfer(CharacterTransferSearchQuery query);
}
