package com.luckygames.wmxz.gamemaster.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luckygames.wmxz.gamemaster.dao.PlayerEntity;
import com.luckygames.wmxz.gamemaster.dao.mapper.PlayerMapper;
import com.luckygames.wmxz.gamemaster.dao.mapper.ServerMapper;
import com.luckygames.wmxz.gamemaster.model.entity.Player;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerNameQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.base.BaseNewServiceImpl;
import com.luckygames.wmxz.gamemaster.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.Map;

@Service("PlayerService")
public class PlayerServiceImpl extends BaseNewServiceImpl<PlayerEntity> implements PlayerService {
    @Autowired
    private PlayerMapper PlayerMapper;
    @Autowired
    private AdminService adminService;
    @Autowired
    private ServerMapper serverMapper;

    @Override
    public Mapper<PlayerEntity> getMapper() {
        return PlayerMapper;
    }

    @Override
    public Page<Player> searchPage(PlayerSearchQuery query) {
        return PageHelper.startPage(query.getPageNum(), query.getPageSize()).doSelectPage(() -> PlayerMapper.searchPage(query));
    }

    @Override
    public Player queryPlayer(Player player) throws UnsupportedEncodingException {
        if (StringUtils.isNotBlank(player.getSearchValue())) {
            String playerString = adminService.getPlayerName(new PlayerNameQuery(player.getServerId(), player.getSearchValue()));
            Map<String, Object> playerMap = JsonUtils.string2Map(playerString);
            if (playerMap != null) {
                player.setName(new String(playerMap.get("name").toString().getBytes("ISO-8859-1"), "utf-8"));
                player.setPlayerId(Long.valueOf(playerMap.get("playerId").toString()));
                player.setLev(Short.valueOf(playerMap.get("lev").toString()));
                player.setSex(Byte.valueOf(playerMap.get("sex").toString()));
                player.setVocation(Byte.valueOf(playerMap.get("vocation").toString()));
                player.setCoin(Integer.valueOf(playerMap.get("coin").toString()));
                player.setDiamond(Integer.valueOf(playerMap.get("diamond").toString()));
                Server server = serverMapper.getByServerId(player.getServerId());
                player.setServerName(server.getServerName());
                player.setChargediamond(Integer.valueOf(playerMap.get("chargeDiamond").toString()));
                player.setRegtime(new Date(Long.parseLong(playerMap.get("regTime").toString())));
                player.setOnline(Boolean.parseBoolean(playerMap.get("online").toString()));
            }
        }
        return player;
    }
}
