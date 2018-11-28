package com.luckygames.wmxz.gamemaster.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.data.GoodsConfig;
import com.luckygames.wmxz.gamemaster.data.LogConsume;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.AdminService;
import com.luckygames.wmxz.gamemaster.service.PlayerService;
import com.luckygames.wmxz.gamemaster.service.ProhibitionService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import com.luckygames.wmxz.gamemaster.utils.JsonUtils;
import com.luckygames.wmxz.gamemaster.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by lucky on 2018/3/28.
 */
@Controller
@RequestMapping("/player")
public class PlayerCharacterController extends BaseController {
    @Autowired
    private PlayerService playerService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private ProhibitionService prohibitionService;

    public static final String RETURN_SUCCESS = "success";// 成功

    //角色查询
    @RequestMapping(value = "/playerQuery", method = {RequestMethod.GET, RequestMethod.POST})
    public Response query(Player player) {
        Response response = new Response("player/playerQuery");
        if (player.getPlayerId() != null) {
            player.setSearchValue(player.getPlayerId().toString());
        }
        List<Server> serverList = serverService.searchList();

        try {
            playerService.queryPlayer(player);
            if (player.getServerId() != null) {
                String playerString = adminService.getPlayerByPlayerId(new PlayerQuery(player.getServerId(), player.getPlayerId()));
                Player player1 = JsonUtils.string2Object(playerString, Player.class);
                player.setAccName(player1.getAccName());
            }
        } catch (Exception e) {
            return new Response(ResultCode.PLAYERS_NOT_EXIST).json();
        }

        return response.request(player).data("serverList", serverList);
    }

    //钻石日志列表
    @RequestMapping(value = "/diamondsLogList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response diamondsLogList(DiamondsLogSearchQuery query) {
        Response response = new Response("player/diamondsLogList");

        Player player = new Player();
        if (query.getServerId() != null && query.getPlayerId() != null) {
            String s = adminService.diamondsLogList(new DiamondsLogQuery(query.getServerId(), query.getPlayerId(), query.getStartDate(), query.getEndDate(), query.getPageNum(), query.getPageSize()));
            List<DiamondsLog> diamondsLogs = JSONObject.parseArray(s, DiamondsLog.class);
            Page<DiamondsLog> page = new Page<>();
            if (diamondsLogs != null && diamondsLogs.size() > 0) {
                diamondsLogs.forEach(d -> {
                    if (d.getOpType() == 2) {//减少
                        d.setCount(-d.getCount());
                    }
                    d.setReason(Objects.requireNonNull(LogConsume.getLog(d.getItemId())).desc);
                });

                page.setTotal(diamondsLogs.get(0).getSize());
                page.setPageNum(query.getPageNum());
                page.setPageSize(query.getPageSize());
                page.addAll(diamondsLogs);
            }

            response.data("list", page);

            player.setServerId(query.getServerId());
            player.setSearchValue(query.getPlayerId().toString());
            try {
                playerService.queryPlayer(player);
            } catch (Exception e) {
                return new Response(ResultCode.PLAYERS_NOT_EXIST).json();
            }
        }

        return response.request(query).data("player", player);
    }

    //物品日志列表
    @RequestMapping(value = "/itemLogList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response itemLogList(ItemLogSearchQuery query) {
        Response response = new Response("player/itemLogList");

        Player player = new Player();
        if (query.getServerId() != null && query.getPlayerId() != null) {
            String s = adminService.itemLogList(new ItemLogQuery(query.getServerId(), query.getPlayerId(), query.getStartDate(), query.getEndDate(), query.getPageNum(), query.getPageSize()));
            List<ItemLog> itemLogs = JSONObject.parseArray(s, ItemLog.class);
            Page<ItemLog> page = new Page<>();
            if (itemLogs != null && itemLogs.size() > 0) {
                itemLogs.forEach(d -> {
                    if (d.getOp() == 2) {//减少
                        d.setCount(-d.getCount());
                    }
                    for (GoodsConfig goodsConfig : OperatingToolsController.goodsList) {
                        if (d.getGoodsId() == goodsConfig.id) {
                            d.setGoodsName(goodsConfig.name);
                            break;
                        }
                    }
                    d.setReason(Objects.requireNonNull(LogConsume.getLog(d.getType())).desc);
                });

                page.setTotal(itemLogs.get(0).getSize());
                page.setPageNum(query.getPageNum());
                page.setPageSize(query.getPageSize());
                page.addAll(itemLogs);
            }
            response.data("list", page);

            player.setServerId(query.getServerId());
            player.setSearchValue(query.getPlayerId().toString());

            try {
                playerService.queryPlayer(player);
            } catch (Exception e) {
                return new Response(ResultCode.PLAYERS_NOT_EXIST).json();
            }
        }

        return response.request(query).data("player", player);
    }

    //邮件日志列表
    @RequestMapping(value = "/mailLogList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response mailLogList(MailSearchQuery query) {
        Response response = new Response("player/mailLogList");

        Player player = new Player();
        if (query.getServerId() != null && query.getPlayerId() != null) {
            String s = adminService.mailLogList(new MailQuery(query.getServerId(), query.getPlayerId(), query.getStartDate(), query.getEndDate(), query.getPageNum(), query.getPageSize()));
            List<Mail> mailLogs = null;
            try {
                mailLogs = JSONObject.parseArray(new String(s.getBytes("ISO-8859-1"), "UTF-8"), Mail.class);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            Page<Mail> page = new Page<>();
            if (mailLogs != null && mailLogs.size() > 0) {
                mailLogs.forEach(d -> {
                    Map<Integer, Integer> reward = StringUtil.str2map(d.getRewards().replaceAll("\r\n", ""), ";", ":");
                    StringBuffer goods = new StringBuffer();
                    reward.forEach((k, v) -> {
                        for (GoodsConfig goodsConfig : OperatingToolsController.goodsList) {
                            if (k == goodsConfig.id) {
                                goods.append("物品:").append(goodsConfig.name).append(" 数量:").append(v).append("  ");
                                break;
                            }
                        }
                    });
                    d.setRewards(goods.toString());
                    d.setReason(Objects.requireNonNull(LogConsume.getLog(d.getType())).desc);
                });

                page.setTotal(mailLogs.get(0).getSize());
                page.setPageNum(query.getPageNum());
                page.setPageSize(query.getPageSize());
                page.addAll(mailLogs);
            }

            response.data("list", page);

            player.setServerId(query.getServerId());
            player.setSearchValue(query.getPlayerId().toString());

            try {
                playerService.queryPlayer(player);
            } catch (Exception e) {
                return new Response(ResultCode.PLAYERS_NOT_EXIST).json();
            }
        }

        return response.request(query).data("player", player);
    }

    //踢下线
    @RequestMapping(value = "/kickLine", method = {RequestMethod.GET, RequestMethod.POST})
    public Response kickLine(Prohibition prohibition) {
        String result = adminService.kickLine(
                new KickLineQuery(
                        prohibition.getServerId(),
                        Long.parseLong(prohibition.getClosureAccount())
                )
        );
        if (result.equals(RETURN_SUCCESS)) {
            return new Response(ResultCode.KICK_LINE_SUCCESS).json();
        } else {
            return new Response(ResultCode.KICK_LINE_FAIL).json();
        }
    }
}
