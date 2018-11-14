package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.data.GoodsConfig;
import com.luckygames.wmxz.gamemaster.data.LogConsume;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
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
    private PlayerCharacterService playerCharacterService;
    @Autowired
    private PropFlowService propFlowService;
    @Autowired
    private EquipmentFlowService equipmentFlowService;
    @Autowired
    private MoneyFlowService moneyFlowService;
    @Autowired
    private LevelFlowService levelFlowService;
    @Autowired
    private LoginFlowService loginFlowService;
    @Autowired
    private TaskFlowService taskFlowService;
    @Autowired
    private RankingsFlowService rankingsFlowService;
    @Autowired
    private EmailFlowService emailFlowService;
    @Autowired
    private OtherFlowService otherFlowService;
    @Autowired
    private BaseInformationService baseInformationService;
    @Autowired
    private ForbiddenLogService forbiddenLogService;
    @Autowired
    private PlayerService playerService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private ItemLogService itemLogService;
    @Autowired
    private DiamondsLogService diamondsLogService;
    @Autowired
    private MailService mailService;

    //角色查询
    @RequestMapping(value = "/playerQuery", method = {RequestMethod.GET, RequestMethod.POST})
    public Response query(Player player) {
        Response response = new Response("player/playerQuery");
        if (player.getPlayerId() != null) {
            player.setSearchValue(player.getPlayerId().toString());
        }
        playerService.queryPlayer(player);
        List<Server> serverList = serverService.searchList();
        return response.request(player).data("serverList", serverList);
    }

    //钻石日志列表
    @RequestMapping(value = "/diamondsLogList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response diamondsLogList(DiamondsLogSearchQuery query) {
        Response response = new Response("player/diamondsLogList");

        Player player = new Player();
        if (query.getServerId() != null && query.getPlayerId() != null) {
            Page<DiamondsLog> diamondsLogs = diamondsLogService.searchPage(query);
            player.setServerId(query.getServerId());
            player.setSearchValue(query.getPlayerId().toString());
            playerService.queryPlayer(player);
            diamondsLogs.forEach(d -> {
                if (d.getOpType() == 2) {//减少
                    d.setCount(-d.getCount());
                }
                d.setReason(Objects.requireNonNull(LogConsume.getLog(d.getItemId())).desc);
            });
            response.data("list", diamondsLogs);
        }

        return response.request(query).data("player", player);
    }

    //物品日志列表
    @RequestMapping(value = "/itemLogList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response itemLogList(ItemLogSearchQuery query) {
        Response response = new Response("player/itemLogList");

        Player player = new Player();
        if (query.getServerId() != null && query.getPlayerId() != null) {
            Page<ItemLog> itemLogs = itemLogService.searchPage(query);
            player.setServerId(query.getServerId());
            player.setSearchValue(query.getPlayerId().toString());
            playerService.queryPlayer(player);
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
            response.data("list", itemLogs);
        }

        return response.request(query).data("player", player);
    }

    //邮件日志列表
    @RequestMapping(value = "/mailLogList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response mailLogList(MailSearchQuery query) {
        Response response = new Response("player/mailLogList");

        Player player = new Player();
        if (query.getServerId() != null && query.getPlayerId() != null) {
            Page<Mail> list = mailService.searchPage(query);
            player.setServerId(query.getServerId());
            player.setSearchValue(query.getPlayerId().toString());
            playerService.queryPlayer(player);
            list.forEach(d -> {
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
            response.data("list", list);
        }

        return response.request(query).data("player", player);
    }

//**********************************************************************************************

    @RequestMapping(value = "/character", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryCharacter(PlayerCharacterSearchQuery playerCharacterSearchQuery) {
        if (playerCharacterSearchQuery.getPageNum() == null) {
            playerCharacterSearchQuery.setPageNum(1);
        }
        Page<PlayerCharacter> characters = playerCharacterService.queryCharacterDailyReport(playerCharacterSearchQuery);

        Response r = new Response("player/character")
                .request(playerCharacterSearchQuery)
                .data("characters", characters);
        return r;
    }

    @RequestMapping(value = "/forbidden", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryForbidden(ForbiddenSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }

        Page<ForbiddenLog> forbiddenLogPage = forbiddenLogService.searchPage(query);
        return new Response("player/forbidden")
                .request(query)
                .data("forbiddenLogs", forbiddenLogPage);
    }

    @RequestMapping(value = "/info_playerList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryPlayer(PlayerCharacterSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        Page<PlayerCharacter> characters = playerCharacterService.searchPage(query);

        Response r = new Response("player/info_playerList")
                .request(query)
                .data("characters", characters)
                .data("charId", query.getCharId());
        return r;
    }

    //基本信息
    @RequestMapping(value = "/info_baseInformation", method = {RequestMethod.GET, RequestMethod.POST})
    public Response baseInformationPlayer(BaseInformation baseInformation) {
        if (baseInformation.getCharId() != null) {
            baseInformationService.update(baseInformation);
            // TODO 同步账户权限
        }
        BaseInformation baseInformation2 = baseInformationService.searchById(baseInformation.getCharId());
        return new Response("player/info_baseInformation")
                .data("baseInformation", baseInformation2)
                .data("charId", baseInformation.getCharId());
    }

    //装备流水
    @RequestMapping(value = "/info_equipment_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowEquipmentQueryPlayer(EquipmentFlowSearchQuery query) {
        Page<EquipmentFlow> equipmentFlowPage = equipmentFlowService.searchPage(query);
        return new Response("player/info_equipment_flow")
                .request(query)
                .data("list", equipmentFlowPage)
                .data("charId", query.getCharId());
    }

    //道具流水
    @RequestMapping(value = "/info_prop_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowPropQueryPlayer(PropFlowSearchQuery query) {
        Page<PropFlow> propFlowPage = propFlowService.searchPage(query);
        return new Response("player/info_prop_flow")
                .request(query)
                .data("list", propFlowPage)
                .data("charId", query.getCharId());
    }

    //金钱流水
    @RequestMapping(value = "/info_money_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowMoneyQueryPlayer(MoneyFlowSearchQuery query) {
        Page<MoneyFlow> propFlowPage = moneyFlowService.searchPage(query);
        return new Response("player/info_money_flow")
                .request(query)
                .data("list", propFlowPage)
                .data("charId", query.getCharId());
    }

    //等级流水
    @RequestMapping(value = "/info_level_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowLevelQueryPlayer(LevelFlowSearchQuery query) {
        Page<LevelFlow> propFlowPage = levelFlowService.searchPage(query);
        return new Response("player/info_level_flow")
                .request(query)
                .data("list", propFlowPage)
                .data("charId", query.getCharId());
    }

    //登录流水
    @RequestMapping(value = "/info_login_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowLoginQueryPlayer(LoginFlowSearchQuery query) {
        Page<LoginFlow> propFlowPage = loginFlowService.searchPage(query);
        return new Response("player/info_login_flow")
                .request(query)
                .data("list", propFlowPage)
                .data("charId", query.getCharId());
    }

    //任务流水
    @RequestMapping(value = "/info_task_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowTaskQueryPlayer(TaskFlowSearchQuery query) {
        Page<TaskFlow> propFlowPage = taskFlowService.searchPage(query);
        return new Response("player/info_task_flow")
                .request(query)
                .data("list", propFlowPage)
                .data("charId", query.getCharId());
    }

    //排行流水
    @RequestMapping(value = "/info_rankings_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowRankingsQueryPlayer(RankingsFlowSearchQuery query) {
        Page<RankingsFlow> propFlowPage = rankingsFlowService.searchPage(query);
        return new Response("player/info_rankings_flow")
                .request(query)
                .data("list", propFlowPage)
                .data("charId", query.getCharId());
    }

    //邮件流水
    @RequestMapping(value = "/info_email_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowEmailQueryPlayer(EmailFlowSearchQuery query) {
        Page<EmailFlow> propFlowPage = emailFlowService.searchPage(query);
        return new Response("player/info_email_flow")
                .request(query)
                .data("list", propFlowPage)
                .data("charId", query.getCharId());
    }

    //其他流水
    @RequestMapping(value = "/info_other_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowOtherQueryPlayer(OtherFlowSearchQuery query) {
        Page<OtherFlow> propFlowPage = otherFlowService.searchPage(query);
        return new Response("player/info_other_flow")
                .request(query)
                .data("list", propFlowPage)
                .data("charId", query.getCharId());
    }

    @RequestMapping(value = "/gm", method = {RequestMethod.GET})
    public String gm() {
        Map<String, String> reqParams = new HashMap<>();
        reqParams.put("ban", "1");
        reqParams.put("type", "1");
        reqParams.put("id", "1");
        reqParams.put("hour", "1");

        return "success";
    }
}
