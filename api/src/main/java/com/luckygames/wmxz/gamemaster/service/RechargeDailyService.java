package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeDaily;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchRequest;

import java.util.List;

public interface RechargeDailyService {
    Page<RechargeDaily> searchPage(RechargeDailySearchRequest rechargeDailySearchRequest);

    List<RechargeDaily> searchList(RechargeDailySearchRequest rechargeDailySearchRequest);
}
