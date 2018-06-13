package com.luckygames.wmxz.gamemaster.service;

import com.luckygames.wmxz.gamemaster.dao.CharacterDailyEntity;
import com.luckygames.wmxz.gamemaster.dao.CharacterDailyEntityExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.CharacterDailyMapper;
import com.luckygames.wmxz.gamemaster.model.entity.CharacterDaily;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.service.base.BaseServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.BeanUtils;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Service("characterDailyService")
public class CharacterDailyServiceImpl extends BaseServiceImpl<CharacterDailyEntity> implements CharacterDailyService {
    @Autowired
    private CharacterDailyMapper characterDailyMapper;

    @Override
    public Mapper<CharacterDailyEntity> getMapper() {
        return characterDailyMapper;
    }

    @Override
    public void generateCharacterDailyReportToday() {
        generateCharacterDailyReportByDate(DateUtils.TodayString());
    }

    @Override
    public void generateCharacterDailyReportYesterday() {
        generateCharacterDailyReportByDate(DateUtils.YesterdayString());
    }

    @Override
    public void generateCharacterDailyReportByDate(String date) {
        List<CharacterDaily> list = characterDailyMapper.queryCharacterDailyReportByDate(date);
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        saveCharacterDailyReport(list);
    }

    @Override
    public void saveCharacterDailyReport(List<CharacterDaily> list) {
        list.forEach(r -> {
            CharacterDaily characterDaily = findOne(r.getCharId(), r.getReportDate());
            if (characterDaily == null) {
                characterDaily = new CharacterDaily();
            }
            BeanUtils.copyProperties(r, characterDaily);
            r.setStatus(Status.NORMAL);
            save(characterDaily);
        });
    }

    @Override
    public CharacterDaily findOne(Long charId, String reportDate) {
        CharacterDailyEntityExample example = new CharacterDailyEntityExample();
        CharacterDailyEntityExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.NORMAL)
                .andCharIdEqualTo(charId)
                .andReportDateEqualTo(reportDate);
        List<CharacterDailyEntity> characterDailyEntities = characterDailyMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(characterDailyEntities)) {
            return null;
        }
        return BeanUtils.copyProperties(characterDailyEntities.get(0), CharacterDaily.class);
    }

    @Override
    public void generateCharacterDailyReportByDate(Date date) {
        generateCharacterDailyReportByDate(DateUtils.DateToString(date));
    }
}
