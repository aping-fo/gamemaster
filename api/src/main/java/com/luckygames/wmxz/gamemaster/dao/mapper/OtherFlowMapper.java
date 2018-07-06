package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.OtherFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.OtherFlowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.OtherFlowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.OtherFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.OtherFlowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface OtherFlowMapper extends OtherFlowEntityMapper<OtherFlowEntity> {
    @SelectProvider(type = OtherFlowSqlProvider.class, method = "searchPage")
    Page<OtherFlow> searchPage(OtherFlowSearchQuery query);
}
