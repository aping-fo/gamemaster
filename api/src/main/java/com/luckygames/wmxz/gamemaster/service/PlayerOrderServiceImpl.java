package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.PlayerOrderExample;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerOrderMapper;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerOrder;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerOrderSearchQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Service("playerOrderService")
public class PlayerOrderServiceImpl implements PlayerOrderService {
    @Autowired
    private PlayerOrderMapper playerOrderMapper;
    public static final String FORMAT_STR = "yyyy-MM-dd HH:mm:ss";
    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_STR);
    private static final ZoneId zoneId = ZoneId.systemDefault();

    @Override
    public Page<PlayerOrder> searchPage(PlayerOrderSearchQuery query) {
        PlayerOrderExample example = new PlayerOrderExample();
        PlayerOrderExample.Criteria criteria = example.createCriteria();

        if (query.getServerId() != null && !query.getServerId().isEmpty()) {
            criteria.andServerIdIn(query.getServerId());
        }
        if (query.getChannelId() != null && !query.getChannelId().isEmpty()) {
            criteria.andChannelIdIn(query.getChannelId());
        }

        if (!StringUtils.isEmpty(query.getStartDate()) && !StringUtils.isEmpty(query.getEndDate())) {
            LocalDateTime startLocalDateTime = LocalDateTime.parse(query.getStartDate(), formatter);
            LocalDateTime endLocalDateTime = LocalDateTime.parse(query.getEndDate(), formatter);
            ZonedDateTime zdtStart = startLocalDateTime.atZone(zoneId);
            ZonedDateTime zdtEnd = endLocalDateTime.atZone(zoneId);
            criteria.andRechargedDateBetween(Date.from(zdtStart.toInstant()), Date.from(zdtEnd.toInstant()));
        }
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> playerOrderMapper.selectByExample(example));
    }
}
