package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateEntity;
import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateSqlProvider;
import com.luckygames.wmxz.gamemaster.dao.PayRetentionRateSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.PayRetentionRate;
import com.luckygames.wmxz.gamemaster.model.entity.PayRetentionRate;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PayRetentionRateSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface PayRetentionRateMapper extends PayRetentionRateEntityMapper<PayRetentionRateEntity> {
    @SelectProvider(type = PayRetentionRateSqlProvider.class, method = "searchAndSave")
    List<PayRetentionRate> searchAndSave(String singleDate);
    
    @SelectProvider(type = PayRetentionRateSqlProvider.class, method = "searchPage")
    List<PayRetentionRate> searchPage(CommonSearchQuery query);
}
