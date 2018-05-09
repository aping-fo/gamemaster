package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntity;
import com.luckygames.wmxz.gamemaster.dao.PayLTVDayEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PayLTVDaySqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.PayLTVDay;
import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

public interface PayLTVDayMapper extends PayLTVDayEntityMapper<PayLTVDayEntity> {
    @SelectProvider(type = PayLTVDaySqlProvider.class, method = "queryPayLTVDaySingleDate")
    PayLTVDay queryPayLTVDaySingleDate(Map<String, Object> queryMap);

    @SelectProvider(type = PayLTVDaySqlProvider.class, method = "queryPayLTVDays")
    List<PayLTVDay> queryPayLTVDays(LTVSearchQuery query);
}