package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.RechargeErroneousOrderEntity;
import com.luckygames.wmxz.gamemaster.dao.RechargeErroneousOrderEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.RechargeErroneousOrderSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeErroneousOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeErroneousOrderSearchQuery;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface RechargeErroneousOrderMapper extends RechargeErroneousOrderEntityMapper<RechargeErroneousOrderEntity> {
    @SelectProvider(type = RechargeErroneousOrderSqlProvider.class, method = "searchPage")
    List<RechargeErroneousOrder> searchPage(RechargeErroneousOrderSearchQuery query);
}
