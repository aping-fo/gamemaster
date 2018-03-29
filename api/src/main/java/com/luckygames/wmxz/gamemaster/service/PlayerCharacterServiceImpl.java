package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.PlayerCharacterEntityExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerCharacterMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lucky on 2018/3/28.
 */
@Service("playerCharacter")
public class PlayerCharacterServiceImpl implements PlayerCharacterService {

    @Autowired
    private PlayerCharacterMapper playerCharacterMapper;

    @Override
    public Page<PlayerCharacter> queryCharacter(PlayerCharacterSearchQuery query) {
        PlayerCharacterEntityExample example = new PlayerCharacterEntityExample();
        PlayerCharacterEntityExample.Criteria criteria = example.createCriteria();

        if (query.getCharId() != null) {
            criteria.andCharIdEqualTo(query.getCharId());
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerCharacterMapper.selectByExample(example));
    }
}
