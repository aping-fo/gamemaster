package com.luckygames.wmxz.gamemaster.dao.mapper;

import com.luckygames.wmxz.gamemaster.dao.CharacterDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.CharacterDailyEntityMapper;
import com.luckygames.wmxz.gamemaster.dao.CharacterDailySqlProvider;
import com.luckygames.wmxz.gamemaster.model.entity.CharacterDaily;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface CharacterDailyMapper extends CharacterDailyEntityMapper<CharacterDailyEntity> {
    @SelectProvider(type = CharacterDailySqlProvider.class, method = "queryCharacterDailyReportByDate")
    List<CharacterDaily> queryCharacterDailyReportByDate(String date);
}
