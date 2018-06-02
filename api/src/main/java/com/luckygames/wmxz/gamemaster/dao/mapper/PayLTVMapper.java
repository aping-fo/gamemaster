package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.PayLTVEntity;
import com.luckygames.wmxz.gamemaster.dao.PayLTVEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PayLTVSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.PayLTV;
import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface PayLTVMapper extends PayLTVEntityMapper<PayLTVEntity> {
    @SelectProvider(type = PayLTVSqlProvider.class, method = "queryPayLTVReportSingleDate")
    List<PayLTV> queryPayLTVReportSingleDate(String date);

    @SelectProvider(type = PayLTVSqlProvider.class, method = "queryPayLTVReport")
    List<PayLTV> queryPayLTVReport(LTVSearchQuery query);
}