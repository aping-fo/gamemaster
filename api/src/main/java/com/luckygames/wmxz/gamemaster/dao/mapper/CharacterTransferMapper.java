package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.CharacterTransferEntity;
import com.luckygames.wmxz.gamemaster.dao.CharacterTransferEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.CharacterTransferEntitySqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.CharacterTransfer;
import com.luckygames.wmxz.gamemaster.model.view.request.CharacterTransferSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface CharacterTransferMapper extends CharacterTransferEntityMapper<CharacterTransferEntity>
{
    @SelectProvider(type = CharacterTransferEntitySqlProvider.class, method = "searchPage")
    Page<CharacterTransfer> searchPage(CharacterTransferSearchQuery query);
}
