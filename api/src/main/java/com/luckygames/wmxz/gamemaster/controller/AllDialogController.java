package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.enums.*;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    private MailLogService mailLogService;
    @Autowired
    private MailCharacterService mailCharacterService;
    @Autowired
    private MailRewardService mailRewardService;
    @Autowired
    private BroadcastService broadcastService;

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
        Response response=new Response();
        String view="player/dialog_ban";
        if(opType==ForbiddenOperationType.ALLOWED){
            view="player/dialog_unban";
            ForbiddenLog forbiddenLog = forbiddenLogService.searchByCharId(charIds.get(0));

            //计算封禁时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal=Calendar.getInstance();//获取当前日期
            cal.setTime(forbiddenLog.getCreateTime());
            long time1 = cal.getTimeInMillis();
            cal.setTime(forbiddenLog.getExpireTime());
            long time2 = cal.getTimeInMillis();
            long between_days=(time2-time1)/(1000*3600);
            int hour = Integer.parseInt(String.valueOf(between_days));
            forbiddenLog.setHour(hour);

            response.data("forbiddenLog",forbiddenLog);
        }

        response.view(view)
                .data("serverList", serverList)
                .data("charIds", charIds)
                .data("opType", opType);
        return response;
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
            String result = null;
            try {
                result = adminService.banRole(new BanQuery(
                        forbiddenRequest.getForbiddenOperationType().getCode(),
                        forbiddenRequest.getForbiddenType().getCode(),
                        f,
                        forbiddenRequest.getHour(),
                        character.getServerId()
                ));
                logger.debug("调用封禁接口返回：{}", result);
            } catch (Exception e) {
                logger.error("封禁角色异常：", e);
            }
            result = "OK";
            if (result!=null&&"OK".equals(result)) {
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

                    //更新玩家状态
                    playerCharacterService.updateStatus(character.getPlayerId(),2);
                } else if(forbiddenRequest.getForbiddenOperationType().equals(ForbiddenOperationType.ALLOWED)){
                    playerCharacterService.updateStatus(character.getPlayerId(),1);
                    forbiddenLogService.removeFobidden(f);
                }
            }
        });
        return new Response().request(forbiddenRequest).json();
    }

    @RequestMapping(value = "/game/dialog_newmail", method = {RequestMethod.GET, RequestMethod.POST})
    public Response dialogNewMail() {
        List<Server> serverList = serverService.searchList();

        return new Response("game/dialog_newmail")
                .data("mailType", MailType.SERVER)
                .data("serverList", serverList);

    }

    @RequestMapping(value = "/game/ajax_sendmail", method = {RequestMethod.GET, RequestMethod.POST})
    public Response ajaxSendMail(SendMailRequest request) {
        if (request.getServerId() == null || request.getServerId() <= 0) {
            return new Response(ResultCode.SERVER_ID_INVALID)
                    .json();
        }
        if (request.getMailType().equals(MailType.CHAR) && CollectionUtils.isEmpty(request.getCharNames())) {
            return new Response(ResultCode.CHARACTER_NAME_INVALID)
                    .json();
        }
        if (request.getMailType().equals(MailType.LEVEL) && (request.getMinLevel() == null && request.getMaxLevel() == null)) {
            return new Response(ResultCode.CHARACTER_LEVEL_INVALID)
                    .json();
        }

        List<Long> charIds = new ArrayList<>();
        List<PlayerCharacter> playerCharacters = new ArrayList<>();

        request.getCharNames().forEach(charName -> {
            PlayerCharacter character = playerCharacterService.getByCharName(request.getServerId(), charName);
            if (character == null) {
                return;
            }
            playerCharacters.add(character);
            charIds.add(character.getCharId());
        });

        String result;
        try {
            result = adminService.sendMail(new MailQuery(
                    request.getServerId(),
                    request.getTitle(),
                    request.getContent(),
                    StringUtils.join(charIds, ","),
                    request.getMinLevel(),
                    request.getMaxLevel(),
                    0,
                    StringUtils.join(request.getRewardNames(), ",")
            ));
        } catch (Exception e) {
            logger.error("发送邮件异常：", e);
//            return new Response(ResultCode.SEND_MAIL_FAILED.getCode(), e.getMessage())
//                    .json();
        }
        result = "OK";
        if (!"OK".equals(result)) {
            logger.error("发送邮件失败：{}", result);
            return new Response(ResultCode.SEND_MAIL_FAILED.getCode(), result);
        }

        MailLog mailLog = new MailLog();
        mailLog.setServerId(request.getServerId());
        mailLog.setMailType(request.getMailType());
        mailLog.setTitle(request.getTitle());
        mailLog.setContent(request.getContent());
        mailLog.setVocation(0);
        mailLog.setMinLev(request.getMinLevel());
        mailLog.setMaxLev(request.getMaxLevel());
        mailLog.setSender(request.getSender());
        mailLog.setStatus(Status.NORMAL);
        mailLogService.save(mailLog);

        mailCharacterService.saveMailCharacters(mailLog.getId(), playerCharacters);
        mailRewardService.saveMailRewards(mailLog.getId(), request.getRewardNames());

        return new Response().request(request).json();
    }

    @RequestMapping(value = "/game/dialog_newbroadcast", method = {RequestMethod.GET, RequestMethod.POST})
    public Response dialogNewBroadcast(@RequestParam("broadcastType") BroadcastType broadcastType) {
        List<Server> serverList = serverService.searchList();

        String view = broadcastType.equals(BroadcastType.BROADCAST) ? "game/dialog_newbroadcast" : "game/dialog_newaffiche";
        return new Response(view)
                .data("serverList", serverList);
    }

    @RequestMapping(value = "/game/ajax_sendbroadcast", method = {RequestMethod.GET, RequestMethod.POST})
    public Response ajaxSendBroadcast(SendBroadcastRequest request) {
        if (CollectionUtils.isEmpty(request.getServerIds())) {
            return new Response(ResultCode.SERVER_ID_INVALID).json();
        }

        if (StringUtils.isBlank(request.getContent())) {
            return new Response(ResultCode.CONTENT_INVALID).json();
        }

        request.getServerIds().forEach(id -> {
            String result = "OK";
            try {
                result = adminService.sendBroadcast(new BroadcastQuery(
                        id,
                        request.getLoopTimes(),
                        request.getGameSeconds(),
                        request.getPlayTime(),
                        request.getTitle(),
                        request.getContent()
                ));
            } catch (Exception e) {
                logger.error("发送广播异常：", e);
                return;
//                return new Response(ResultCode.SEND_BROADCAST_FAILED.getCode(), e.getMessage())
//                        .json();
            }

//            result = "OK";
            if (!result.equals("success")) {
                return;
            }
            Broadcast broadcast = new Broadcast();
            broadcast.setServerId(id);
            broadcast.setLoopTimes(request.getLoopTimes());
            broadcast.setPlayTime(request.getPlayTime());
            broadcast.setTitle(request.getTitle());
            broadcast.setContent(request.getContent());
            broadcast.setBroadcastStatus(BroadcastStatus.ENABLED);
            broadcast.setGapSecond(request.getGameSeconds());
            broadcastService.save(broadcast);
        });

        return new Response().request(request).json();
    }

    // TODO 踢下线
    @RequestMapping(value = "/player/kick_line", method = {RequestMethod.GET, RequestMethod.POST})
    public Response kickLine(KickLineRequest request) {
        String result;
        try {
            result = adminService.kickLine(new KickLineQuery(
                    request.getCharId(),
                    request.getServerId()
            ));
            logger.debug("调用踢人接口返回：{}", result);
        } catch (Exception e) {
            logger.error("踢人角色异常：", e);
        }
        return new Response().request(request).json();
    }

    // TODO 闪断
//    @RequestMapping(value = "/game/flicker", method = {RequestMethod.GET, RequestMethod.POST})

    // TODO 公告
//    @RequestMapping(value = "/game/affiche", method = {RequestMethod.GET, RequestMethod.POST})
}
