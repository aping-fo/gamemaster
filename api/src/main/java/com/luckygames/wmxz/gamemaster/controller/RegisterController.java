package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionDaily;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.PlayerActionDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class RegisterController extends BaseController {
    @Autowired
    private PlayerActionDailyService playerActionDailyService;

    @RequestMapping(value = "/statics", method = {RequestMethod.GET, RequestMethod.POST})
    public Response registerStatics() {
        return new Response("register/statics");
    }

    @RequestMapping(value = "/statics_register", method = {RequestMethod.GET, RequestMethod.POST})
    public Response staticsRegister(CommonSearchQuery commonSearchQuery) {
        if (commonSearchQuery.getPageNum() == null) {
            commonSearchQuery.setPageNum(1);
        }

        Page<PlayerActionDaily> playerActionDailyPage = playerActionDailyService.searchRegisterPage(commonSearchQuery);

        return new Response("register/statics_register")
                .request(commonSearchQuery)
                .data("playerActionDailyList", playerActionDailyPage);
    }

    @RequestMapping(value = "/statics_character", method = {RequestMethod.GET, RequestMethod.POST})
    public Response staticsCharacter(CommonSearchQuery commonSearchQuery) {
        if (commonSearchQuery.getPageNum() == null) {
            commonSearchQuery.setPageNum(1);
        }

        Page<PlayerActionDaily> playerActionDailyPage = playerActionDailyService.searchCharacterPage(commonSearchQuery);

        return new Response("register/statics_character")
                .request(commonSearchQuery)
                .data("playerActionDailyList", playerActionDailyPage);
    }

}
