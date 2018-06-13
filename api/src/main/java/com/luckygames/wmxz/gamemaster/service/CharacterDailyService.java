package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.CharacterDailyEntity;
import com.luckygames.wmxz.gamemaster.model.entity.CharacterDaily;
import com.luckygames.wmxz.gamemaster.service.base.BaseService;

import java.util.Date;
import java.util.List;

public interface CharacterDailyService extends BaseService<CharacterDailyEntity> {
    void generateCharacterDailyReportToday();

    void generateCharacterDailyReportYesterday();

    void generateCharacterDailyReportByDate(String date);

    void saveCharacterDailyReport(List<CharacterDaily> list);

    CharacterDaily findOne(Long charId, String reportDate);

    void generateCharacterDailyReportByDate(Date date);
}
