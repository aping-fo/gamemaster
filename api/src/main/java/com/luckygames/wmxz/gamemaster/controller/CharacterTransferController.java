package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.CharacterTransfer;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeSimulation;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.CharacterTransferSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeSimulationSearchQuery;
import com.luckygames.wmxz.gamemaster.service.CharacterTransferService;
import com.luckygames.wmxz.gamemaster.service.PlayerCharacterService;
import com.luckygames.wmxz.gamemaster.service.RechargeSimulationService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/characterTransfer")
public class CharacterTransferController extends BaseController {
    @Autowired
    private ServerService serverService;
    @Autowired
    private CharacterTransferService characterTransferService;
    //转移列表
    @RequestMapping(value = "/transferList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryList(CharacterTransferSearchQuery query) {
        if(query.getPlayerId() != null)
        {
            characterTransferService.addCharacterTransfer(query);
        }
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        Page<CharacterTransfer> characters= characterTransferService.searchPage(query);
        List<Server> serverList = serverService.searchList();
        Response r = new Response("characterTransfer/main")
                .request(query)
                .data("characters", characters)
                .data("serverList",serverList);
        return r;
    }

}


