package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.BaseInformation;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.PropFlow;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.AdminService;
import com.luckygames.wmxz.gamemaster.service.BaseInformationService;
import com.luckygames.wmxz.gamemaster.service.PlayerCharacterService;
import com.luckygames.wmxz.gamemaster.service.PropFlowService;
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
    private BaseInformationService baseInformationService;

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
    public Response queryForbidden(ForbiddenSearchQuery forbiddenQuery) {
        return new Response("player/forbidden")
                .request(forbiddenQuery)
                .data("", null);
    }

    @RequestMapping(value = "/info", method = {RequestMethod.GET, RequestMethod.POST})
    public Response infoStatics() {
        return new Response("player/info");
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

    //流水查询
    @RequestMapping(value = "/info_flowQuery", method = {RequestMethod.GET, RequestMethod.POST})
    public Response flowQueryPlayer(PropFlowSearchQuery query) {
        Page<PropFlow> propFlowPage = propFlowService.searchPage(query);
        Response r = new Response("player/info_flowQuery")
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
