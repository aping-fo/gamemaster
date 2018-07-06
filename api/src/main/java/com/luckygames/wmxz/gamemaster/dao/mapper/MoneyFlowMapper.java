package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.MoneyFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.MoneyFlowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.MoneyFlowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.MoneyFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.MoneyFlowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface MoneyFlowMapper extends MoneyFlowEntityMapper<MoneyFlowEntity> {
    @SelectProvider(type = MoneyFlowSqlProvider.class, method = "searchPage")
    Page<MoneyFlow> searchPage(MoneyFlowSearchQuery query);
}
