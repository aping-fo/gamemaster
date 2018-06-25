package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.ForbiddenLog;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerCharacter;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenOperationType;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
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
    public Response dialogBan(@RequestParam("charIds") List<Long> charIds,
                              @RequestParam("opType") ForbiddenOperationType opType) {
        if (CollectionUtils.isNotEmpty(charIds)) {
            for (Long charId : charIds) {
                PlayerCharacter character = playerCharacterService.getByCharId(charId);
                if (character == null) {
                    return new Response(ResultCode.CHARACTER_NOT_FOUND);
                }
            }
        }
        List<Server> serverList = serverService.searchList();
        logger.debug("optype:{}", opType);

        return new Response("player/dialog_ban")
                .data("serverList", serverList)
                .data("charIds", charIds)
                .data("opType", opType);
    }

    @RequestMapping(value = "/player/ajax_ban", method = RequestMethod.POST)
    public Response ajaxBan(ForbiddenRequest forbiddenRequest) {
        if (CollectionUtils.isEmpty(forbiddenRequest.getCharIds())) {
            return new Response(ResultCode.CHARACTER_ID_INVALID);
        }

        forbiddenRequest.getCharIds().forEach(f -> {
            PlayerCharacter character = playerCharacterService.getByCharId(f);
            if (character == null) {
                return;
            }
            try {
                String result = adminService.banRole(new BanQuery(
                        forbiddenRequest.getForbiddenOperationType().getCode(),
                        forbiddenRequest.getForbiddenType().getCode(),
                        f,
                        forbiddenRequest.getHour(),
                        forbiddenRequest.getServerId()
                ));
                logger.debug("调用封禁接口返回：{}", result);
            } catch (Exception e) {
                logger.error("封禁角色异常：", e);
                //return new Response(ResultCode.CHARACTER_FORBIDDEN_FAILD.getCode(), e.getMessage()).json();
            }
            //TODO:检查返回值是否成功
            if (forbiddenRequest.getForbiddenOperationType().equals(ForbiddenOperationType.FORBIDDEN)) {
                ForbiddenLog forbiddenLog = new ForbiddenLog();
                forbiddenLog.setCharId(f);
                forbiddenLog.setPlayerId(character.getPlayerId());
                forbiddenLog.setExpireTime(DateUtils.addHours(DateUtils.Now(), forbiddenRequest.getHour()));
                forbiddenLog.setForbiddenType(forbiddenRequest.getForbiddenType());
                forbiddenLog.setOperateTime(DateUtils.Now());
                forbiddenLog.setOperateType(forbiddenRequest.getForbiddenOperationType());
                forbiddenLog.setReason(forbiddenRequest.getReason());
                forbiddenLog.setServerId(forbiddenRequest.getServerId());
                forbiddenLog.setStatus(Status.NORMAL);
                forbiddenLogService.save(forbiddenLog);
            } else {
                forbiddenLogService.removeFobidden(f);
            }
        });


        return new Response().request(forbiddenRequest).json();
    }
}
