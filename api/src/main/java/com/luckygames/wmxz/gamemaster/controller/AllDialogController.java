package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.ForbiddenLog;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.BanQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.ForbiddenRequest;
import com.luckygames.wmxz.gamemaster.service.AdminService;
import com.luckygames.wmxz.gamemaster.service.ForbiddenLogService;
import com.luckygames.wmxz.gamemaster.service.PlayerCharacterService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class AllDialogController extends BaseController {
    @Autowired
    private PlayerCharacterService playerCharacterService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private ForbiddenLogService forbiddenLogService;
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/player/dialog_ban", method = {RequestMethod.GET, RequestMethod.POST})
    public Response dialogBan(@RequestParam("charId") Long charId) {
        PlayerCharacter character = playerCharacterService.getByCharId(charId);
        if (character == null) {
            return new Response(ResultCode.CHARACTER_NOT_FOUND);
        }
        Server server = serverService.getByServerId(character.getServerId());
        if (server == null) {
            return new Response(ResultCode.SERVER_NOT_FOUND);
        }
        List<Server> serverList = serverService.searchList();

        return new Response("player/dialog_ban")
                .data("serverList", serverList)
                .data("server", server)
                .data("charId", charId)
                .data("charIds", new ArrayList<Long>() {{
                    add(charId);
                }})
                .data("char", character);
    }

    @RequestMapping(value = "/player/ajax_ban", method = RequestMethod.POST)
    public Response ajaxBan(ForbiddenRequest forbiddenRequest) {
        if (forbiddenRequest.getServerId() == null || forbiddenRequest.getServerId() <= 0) {
            return new Response(ResultCode.SERVER_ID_INVALID).json();
        }
        Server server = serverService.getByServerId(forbiddenRequest.getServerId());
        if (server == null) {
            return new Response(ResultCode.SERVER_NOT_FOUND).json();
        }
        if (CollectionUtils.isEmpty(forbiddenRequest.getCharIds())) {
            return new Response(ResultCode.CHARACTER_ID_INVALID);
        }

        try {
            forbiddenRequest.getCharIds().forEach(f -> {
                String result = adminService.banRole(new BanQuery() {{
                    setBan(forbiddenRequest.getForbiddenType().getCode());
                    setHour(forbiddenRequest.getHour());
                    setId(f);
                    setType(forbiddenRequest.getForbiddenOperationType().getCode());
                }});
                logger.debug("调用封禁接口返回：{}", result);
                //TODO:检查返回值是否成功
                if (true) {
                    ForbiddenLog forbiddenLog = new ForbiddenLog();
                    forbiddenLog.setCharId(f);
                    forbiddenLog.setExpireTime(DateUtils.addHours(DateUtils.Now(), forbiddenRequest.getHour()));
                    forbiddenLog.setForbiddenType(forbiddenRequest.getForbiddenType());
                    forbiddenLog.setOperateTime(DateUtils.Now());
                    forbiddenLog.setOperateType(forbiddenRequest.getForbiddenOperationType());
                    forbiddenLog.setReason(forbiddenRequest.getReason());
                    forbiddenLog.setServerId(forbiddenRequest.getServerId());
                    forbiddenLogService.save(forbiddenLog);
                }
            });

        } catch (Exception e) {
            logger.error("封禁角色异常：", e);
            return new Response(ResultCode.CHARACTER_FORBIDDEN_FAILD.getCode(), e.getMessage()).json();
        }

        return new Response().request(forbiddenRequest).json();
    }
}
