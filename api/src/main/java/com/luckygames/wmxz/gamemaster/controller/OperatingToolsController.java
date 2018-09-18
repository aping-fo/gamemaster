package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.entity.MailLog;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.ActivationCodeSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.MailQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.MailSearchQuery;
import com.luckygames.wmxz.gamemaster.service.ActivationCodeService;
import com.luckygames.wmxz.gamemaster.service.AdminService;
import com.luckygames.wmxz.gamemaster.service.MailLogService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @作者 周聪
 * @时间 2018/9/16 10:08
 */
@Controller
@RequestMapping("/operatingTools")
public class OperatingToolsController extends BaseController {
    public static final String Result = "success";

    @Autowired
    private MailLogService mailLogService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private ActivationCodeService activationCodeService;

    //邮件查询
    @RequestMapping(value = "/mailManage", method = {RequestMethod.GET, RequestMethod.POST})
    public Response mailManage(MailSearchQuery query) {
        Response response = new Response("game/mail");
        Page<MailLog> mailLogs = mailLogService.searchPage(query);
        List<Server> serverList = serverService.searchList();
        response.request(query).data("list", mailLogs).data("serverList", serverList);
        return response;
    }

    //发送邮件
    @RequestMapping(value = "/sendmail", method = {RequestMethod.GET, RequestMethod.POST})
    public Response sendmail(MailLog mailLog) {
        //处理道具换行符
        String rewardNames = mailLog.getRewards();
        String rewards = rewardNames.replaceAll("\r\n", "");

        String result = "OK";

        try {
            result = adminService.sendMail(new MailQuery(
                    mailLog.getServerId(),
                    mailLog.getTitle(),
                    mailLog.getContent(),
                    mailLog.getPlayerids(),
                    mailLog.getMinLev(),
                    mailLog.getMaxLev(),
                    0,
                    rewards
            ));
        } catch (Exception e) {
            logger.error("发送邮件异常：", e);
        }

        if (!Result.equals(result)) {
            logger.error("发送邮件失败：{}", result);
            return new Response().request(mailLog).json();
        }

        mailLogService.save(mailLog);

        return mailManage(new MailSearchQuery());
    }

    //激活码列表
    @RequestMapping(value = "/activationCode", method = {RequestMethod.GET, RequestMethod.POST})
    public Response synchronousActivationCode(ActivationCodeSearchQuery query) {
        Response response = new Response("game/synchronous_activation_code");
        Page<ActivationCode> activationCodePage = activationCodeService.searchPage(query);
        response.request(query).data("list", activationCodePage);
        return response;
    }

    //生成激活码
    @RequestMapping(value = "/addActivationCode", method = {RequestMethod.GET, RequestMethod.POST})
    public Response addActivationCode(ActivationCode activationCode) {
        ActivationCodeSearchQuery query = new ActivationCodeSearchQuery();
        Response response = new Response("operatingTools/generate_activation_code");
        if (activationCode.getNumber() != null) {
            activationCodeService.save(activationCode);
        }
        Page<ActivationCode> activationCodePage = activationCodeService.searchPage(query);
        response.request(activationCode).data("list", activationCodePage);
        return response;
    }
}
