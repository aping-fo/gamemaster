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
        if(baseInformation.getCharId()!=null){
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
