package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.model.entity.DataCollection;
import com.luckygames.wmxz.gamemaster.model.view.request.ChannelDataSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.DataCollectionSearchQuery;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface ReportService {
    Page<DataCollection> searchPage(DataCollectionSearchQuery query);

    Page<DataCollection> searchChannelDataPage(ChannelDataSearchQuery query);

    Page<DataCollection> searchChannelDailyPage(ChannelDataSearchQuery query, Integer type);

    DataCollection findOne(Long channelId, Long serverId, String date);

    void generateDataCollectionReportToday();

    List<LinkedHashMap> queryChannelDailyReport2(String startDate, String endDate,Integer type);
}
