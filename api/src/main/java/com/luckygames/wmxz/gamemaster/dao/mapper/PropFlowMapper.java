package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.PropFlowEntity;
import com.luckygames.wmxz.gamemaster.dao.PropFlowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PropFlowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.PropFlow;
import com.luckygames.wmxz.gamemaster.model.view.request.PropFlowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

public interface PropFlowMapper extends PropFlowEntityMapper<PropFlowEntity> {
    @SelectProvider(type = PropFlowSqlProvider.class, method = "searchPage")
    Page<PropFlow> searchPage(PropFlowSearchQuery query);
}
