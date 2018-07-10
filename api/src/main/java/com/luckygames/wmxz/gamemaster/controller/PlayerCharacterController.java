package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lucky on 2018/3/28.
 */
@RestController
@RequestMapping("/player")
public class PlayerCharacterController extends BaseController {
    @Autowired
    private PlayerCharacterService playerCharacterService;
    @Autowired
    private AdminService adminService;
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
    public Response queryPlayer(PlayerCharacterSearchQuery playerCharacterSearchQuery) {
        if (playerCharacterSearchQuery.getPageNum() == null) {
            playerCharacterSearchQuery.setPageNum(1);
        }
        Page<PlayerCharacter> characters = playerCharacterService.searchPage(playerCharacterSearchQuery);

        Response r = new Response("player/info_playerList")
                .request(playerCharacterSearchQuery)
                .data("characters", characters);
        return r;
    }

    //基本信息
    @RequestMapping(value = "/info_baseInformation", method = {RequestMethod.GET, RequestMethod.POST})
    public Response baseInformationPlayer(Integer charId) {
        BaseInformation baseInformation = baseInformationService.searchById(1);
        return new Response("player/info_baseInformation")
                .data("baseInformation", baseInformation);
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
        Response r = new Response("player/info_prop_flow")
                .request(query)
                .data("propFlowList", propFlowPage);
        return r;
    }

    //金钱流水
    @RequestMapping(value = "/info_money_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowMoneyQueryPlayer(MoneyFlowSearchQuery query) {
        Page<MoneyFlow> propFlowPage = moneyFlowService.searchPage(query);
        Response r = new Response("player/info_money_flow")
                .request(query)
                .data("propFlowList", propFlowPage);
        return r;
    }

    //等级流水
    @RequestMapping(value = "/info_level_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowLevelQueryPlayer(LevelFlowSearchQuery query) {
        Page<LevelFlow> propFlowPage = levelFlowService.searchPage(query);
        Response r = new Response("player/info_level_flow")
                .request(query)
                .data("propFlowList", propFlowPage);
        return r;
    }

    //登录流水
    @RequestMapping(value = "/info_login_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowLoginQueryPlayer(LoginFlowSearchQuery query) {
        Page<LoginFlow> propFlowPage = loginFlowService.searchPage(query);
        Response r = new Response("player/info_login_flow")
                .request(query)
                .data("propFlowList", propFlowPage);
        return r;
    }

    //任务流水
    @RequestMapping(value = "/info_task_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowTaskQueryPlayer(TaskFlowSearchQuery query) {
        Page<TaskFlow> propFlowPage = taskFlowService.searchPage(query);
        Response r = new Response("player/info_task_flow")
                .request(query)
                .data("propFlowList", propFlowPage);
        return r;
    }

    //排行流水
    @RequestMapping(value = "/info_rankings_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowRankingsQueryPlayer(RankingsFlowSearchQuery query) {
        Page<RankingsFlow> propFlowPage = rankingsFlowService.searchPage(query);
        Response r = new Response("player/info_rankings_flow")
                .request(query)
                .data("propFlowList", propFlowPage);
        return r;
    }

    //邮件流水
    @RequestMapping(value = "/info_email_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowEmailQueryPlayer(EmailFlowSearchQuery query) {
        Page<EmailFlow> propFlowPage = emailFlowService.searchPage(query);
        Response r = new Response("player/info_email_flow")
                .request(query)
                .data("propFlowList", propFlowPage);
        return r;
    }

    //其他流水
    @RequestMapping(value = "/info_other_flow", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowOtherQueryPlayer(OtherFlowSearchQuery query) {
        Page<OtherFlow> propFlowPage = otherFlowService.searchPage(query);
        Response r = new Response("player/info_other_flow")
                .request(query)
                .data("propFlowList", propFlowPage);
        return r;
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
