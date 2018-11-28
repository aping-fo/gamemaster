package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.data.ChargeConfig;
import com.luckygames.wmxz.gamemaster.model.entity.Player;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.PayQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/simulationRecharge")
public class SimulationRechargeController extends BaseController {
    public static final String RETURN_SUCCESS = "success";// 成功
    public static List<ChargeConfig> chargeList = new ArrayList<>();//物品列表

    @Autowired
    private PlayerCharacterService playerCharacterService;
    @Autowired
    private RechargeSimulationService rechargeSimulationService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private PlayerService playerService;

    //模拟充值列表
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryPlayer(PlayerSearchQuery query) {
        Response response = new Response("simulationRecharge/list");
        Page<Player> players = playerService.searchPage(query);
        response.request(query)
                .data("list", players);
        return response;
    }

    //模拟充值搜索玩家
    @RequestMapping(value = "/selectPlayer", method = {RequestMethod.GET, RequestMethod.POST})
    public Response selectPlayer(Player player) {
        Response response = new Response("simulationRecharge/add");

        try {
            playerService.queryPlayer(player);
        } catch (Exception e) {
            return new Response(ResultCode.PLAYERS_NOT_EXIST).json();
        }

        List<Server> serverList = serverService.searchList();
        return response.request(player).data("player", player).data("serverList", serverList).data("chargeList", chargeList);
    }

    //模拟充值增加
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public Response add(Player player) {
        Response response = new Response("simulationRecharge/list");
        for (ChargeConfig cc : chargeList) {
            if (cc.id == player.getType()) {
                player.setAmount((long) (cc.total + cc.add));
                break;
            }
        }
        String code = adminService.pay(new PayQuery(player.getServerId(), player.getPlayerId(), player.getAmount(), player.getType()));
        if (code.equals(RETURN_SUCCESS)) {
            playerService.save(player);
        }
        PlayerSearchQuery query = new PlayerSearchQuery();
        Page<Player> players = playerService.searchPage(query);
        return response.request(query).data("list", players);
    }
}


