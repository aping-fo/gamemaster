package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.OnlineEntity;
import com.luckygames.wmxz.gamemaster.dao.OnlineEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.OnlineSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.Online;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface OnlineMapper extends OnlineEntityMapper<OnlineEntity> {
    @SelectProvider(type = OnlineSqlProvider.class, method = "queryOnlineReport")
    List<Online> queryOnlineReport(CommonSearchQuery query);
}
