package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.dao.RechargeDaily;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeDailySearchRequest;

public interface RechargeDailyService {
    Page<RechargeDaily> search(RechargeDailySearchRequest rechargeDailySearchRequest);
}
