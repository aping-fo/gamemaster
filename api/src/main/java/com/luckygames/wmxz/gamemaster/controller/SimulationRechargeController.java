package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.RechargeSimulation;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.RechargeSimulationSearchQuery;
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
@RequestMapping("/simulationRecharge")
public class SimulationRechargeController extends BaseController {
    @Autowired
    private ServerService serverService;
    @Autowired
    private PlayerCharacterService playerCharacterService;
    @Autowired
    private RechargeSimulationService rechargeSimulationService;
    //玩家列表
    @RequestMapping(value = "/create", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryPlayer(PlayerCharacterSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        Page<PlayerCharacter> characters;
        if(query.getKeyword() == null || query.getKeyword().length() == 0)
        {
            characters=new Page<PlayerCharacter>();
        }
        else
        {
            characters= playerCharacterService.searchPage(query);
        }

        Response r = new Response("simulationRecharge/create")
                .request(query)
                .data("characters", characters)
                .data("charId", query.getCharId());
        return r;
    }
    //未处理列表
    @RequestMapping(value = "/pending", method = {RequestMethod.GET, RequestMethod.POST})
        public Response pending(RechargeSimulationSearchQuery rechargeSimulationSearchQuery) {

        if (rechargeSimulationSearchQuery.getId() != null) {
            if (rechargeSimulationSearchQuery.getState() != null) {
                RechargeSimulation sim=new RechargeSimulation();
                sim.setId(rechargeSimulationSearchQuery.getId());
                sim.setState(rechargeSimulationSearchQuery.getState());
                rechargeSimulationService.update(sim);
            }
            else //删除
            {
                rechargeSimulationService.delRechargeSimulation(rechargeSimulationSearchQuery.getId());
            }

        }
        //

            if (rechargeSimulationSearchQuery.getPageNum() == null) {
                rechargeSimulationSearchQuery.setPageNum(1);
            }
            Page<RechargeSimulation> charges = rechargeSimulationService.searchPage(rechargeSimulationSearchQuery);

            Response r = new Response("simulationRecharge/pending")
                    .request(rechargeSimulationSearchQuery)
                    .data("charges", charges);
            return r;
    }
    //新增条目
    @RequestMapping(value = "/createNew", method = {RequestMethod.GET, RequestMethod.POST})
    public Response create(RechargeSimulationSearchQuery rechargeSimulationSearchQuery) {
        rechargeSimulationService.addRechargeSimulation(rechargeSimulationSearchQuery);
        Response r = new Response("simulationRecharge/create_success")
                .request(rechargeSimulationSearchQuery);
        return r;

    }
    //已处理条目
    @RequestMapping(value = "/processed", method = {RequestMethod.GET, RequestMethod.POST})
    public Response processed(RechargeSimulationSearchQuery rechargeSimulationSearchQuery) {
            if (rechargeSimulationSearchQuery.getPageNum() == null) {
                rechargeSimulationSearchQuery.setPageNum(1);
            }
            Page<RechargeSimulation> charges = rechargeSimulationService.searchPage(rechargeSimulationSearchQuery);

            Response r = new Response("simulationRecharge/processed")
                    .request(rechargeSimulationSearchQuery)
                    .data("charges", charges);
            return r;
    }

}


