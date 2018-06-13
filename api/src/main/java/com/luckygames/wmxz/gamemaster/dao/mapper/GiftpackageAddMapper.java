package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddEntity;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageAddSqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageAdd;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface GiftpackageAddMapper extends GiftpackageAddEntityMapper<GiftpackageAddEntity> {
    @SelectProvider(type = GiftpackageAddSqlProvider.class, method = "queryGiftpackageAddReport")
    List<GiftpackageAdd> queryGiftpackageAddReport();
}
