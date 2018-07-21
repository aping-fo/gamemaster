package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntity;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.OnlineNowSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.OnlineNow;
import com.luckygames.wmxz.gamemaster.model.view.request.OnlineNowSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface OnlineNowMapper extends OnlineNowEntityMapper<OnlineNowEntity> {
    @SelectProvider(type = OnlineNowSqlProvider.class, method = "queryOnlineNowReportFromOrderSingleDate")
    List<OnlineNow> queryOnlineNowReportFromOrderSingleDate(String singleDate);

    @SelectProvider(type = OnlineNowSqlProvider.class, method = "searchPage")
    List<OnlineNow> searchPage(OnlineNowSearchQuery query);
}
