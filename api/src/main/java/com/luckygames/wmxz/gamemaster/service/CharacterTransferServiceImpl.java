package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.CharacterDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.CharacterDailyEntityExample;
import com.luckygames.wmxz.gamemaster.dao.CharacterTransferEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.CharacterTransferMapper;
import com.luckygames.wmxz.gamemaster.model.entity.CharacterDaily;
import com.luckygames.wmxz.gamemaster.model.entity.CharacterTransfer;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.request.CharacterTransferSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("characterTransferService")
public class CharacterTransferServiceImpl extends BaseServiceImpl<CharacterTransferEntity> implements CharacterTransferService {
    @Autowired
    private CharacterTransferMapper characterTransferMapper;

    @Override
    public Mapper<CharacterTransferEntity> getMapper() {
        return characterTransferMapper;
    }
    @Override
    public Page<CharacterTransfer> searchPage(CharacterTransferSearchQuery query) {
        return characterTransferMapper.searchPage(query);
    }
    @Override
    public void addCharacterTransfer(CharacterTransferSearchQuery query) {
        CharacterTransfer transferAdd = new CharacterTransfer();
        transferAdd.setPlayerId(query.getPlayerId());
        transferAdd.setToId(query.getToId());
        transferAdd.setCurrentId(query.getCurrentId());
        transferAdd.setServerId(query.getServerId());
        create(transferAdd);
    }
}
