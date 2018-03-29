package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.PlayerCharacterSearchQuery;
import com.luckygames.wmxz.gamemaster.service.PlayerCharacterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lucky on 2018/3/28.
 */
@Controller
@RequestMapping("/player")
public class PlayerCharacterController extends BaseController {
    @Autowired
    private PlayerCharacterServiceImpl playerCharacterService;

    @RequestMapping(value = "/character", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryCharacter(PlayerCharacterSearchQuery playerCharacterSearchQuery) {
        if (playerCharacterSearchQuery.getPageNum() == null) {
            playerCharacterSearchQuery.setPageNum(1);
        }
        Page<PlayerCharacter> characters = playerCharacterService.queryCharacter(playerCharacterSearchQuery);

        Response r = new Response("player/character")
                .request(playerCharacterSearchQuery)
                .data("characters", characters);
        return r;
    }
}
