package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntity;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.ActivationCodeSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface ActivationCodeMapper extends ActivationCodeEntityMapper<ActivationCodeEntity> {
    @SelectProvider(type = ActivationCodeSqlProvider.class, method = "searchPage")
    Page<ActivationCode> searchPage(ActivationCodeSearchQuery query);

    @SelectProvider(type = ActivationCodeSqlProvider.class, method = "add")
    Page<ActivationCode> add(ActivationCode activationCode);
}
