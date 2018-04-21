package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.model.entity.DataCollection;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeDaily;
import com.luckygames.wmxz.gamemaster.model.view.request.DataCollectionSearchQuery;

public interface ReportService {
    Page<DataCollection> searchPage(DataCollectionSearchQuery dataCollectionSearchRequest);
    DataCollection findOne(Long channelId, Long serverId, String date);
    void generateDataCollectionReportToday();
}
