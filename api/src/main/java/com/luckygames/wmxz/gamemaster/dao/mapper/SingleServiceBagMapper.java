package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.SingleServiceBagEntity;
import com.luckygames.wmxz.gamemaster.dao.SingleServiceBagEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.SingleServiceBagSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.SingleServiceBag;
import com.luckygames.wmxz.gamemaster.model.view.request.SingleServiceBagSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface SingleServiceBagMapper extends SingleServiceBagEntityMapper<SingleServiceBagEntity> {
    @SelectProvider(type = SingleServiceBagSqlProvider.class, method = "searchPage")
    Page<SingleServiceBag> searchPage(SingleServiceBagSearchQuery query);
}
