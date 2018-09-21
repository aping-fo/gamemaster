package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.data.GoodsConfig;
import com.luckygames.wmxz.gamemaster.model.entity.ActivationCode;
import com.luckygames.wmxz.gamemaster.model.entity.GoodsRecovery;
import com.luckygames.wmxz.gamemaster.model.entity.MailLog;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.RandomString;
import com.luckygames.wmxz.gamemaster.utils.StringUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/**
 * @作者 周聪
 * @时间 2018/9/16 10:08
 */
@Controller
@RequestMapping("/operatingTools")
public class OperatingToolsController extends BaseController {
    public static final String SUCCESS = "success";
    public static final String PLAYERID_NOT_EXISTENCE = "playerid_not_existence";// 玩家id不存在
    public static final String GOOD_NOT_EXISTENCE = "good_not_existence";// 物品不存在

    public static int ActivationCodebatch;

    @Autowired
    private MailLogService mailLogService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private ActivationCodeService activationCodeService;
    @Autowired
    private GoodsRecoveryService goodsRecoveryService;

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

        if (!SUCCESS.equals(result)) {
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
        Response response = new Response();
        response.view("game/generate_activation_code");
        List<Server> serverList = serverService.searchList();

        if (activationCode.getNumber() != null) {
            int count = activationCode.getNumber();
            String rewards = activationCode.getRewards().replaceAll("\r\n", "");
            activationCode.setRewards(rewards);

            String batch = "";
            if (ActivationCodebatch < 10) {
                batch = "00" + ActivationCodebatch;
            } else if (ActivationCodebatch < 100) {
                batch = "0" + ActivationCodebatch;
            }

            for (int i = 0; i < count; i++) {
                activationCode.setName(RandomString.getSerialNo(5) + batch);
                activationCodeService.save(activationCode);
                activationCode.setId(null);
            }

            ActivationCodebatch++;

            response.view("game/synchronous_activation_code");

            new Thread(() -> {
                //更新全部服务器
                if (activationCode.getServerId() == 0) {
                    //更新游戏服务器的激活码
                    if (serverList != null && !serverList.isEmpty()) {
                        serverList.forEach(server -> {
                            adminService.sendActivationCode(new ActivationCodeQuery(server.getServerId(), "update"));
                        });
                    }
                } else {
                    adminService.sendActivationCode(new ActivationCodeQuery(activationCode.getServerId(), "update"));
                }
            }).start();
        }

        Page<ActivationCode> activationCodePage = activationCodeService.searchPage(query);
        response.request(new ActivationCodeSearchQuery()).data("list", activationCodePage).data("serverList", serverList).data("goodsList", AllDialogController.goodsList);
        return response;
    }

    //物品回收列表
    @RequestMapping(value = "/recoveryGoods", method = {RequestMethod.GET, RequestMethod.POST})
    public Response recoveryGoods(GoodsRecoverySearchQuery query) {
        Page<GoodsRecovery> recoveryList = goodsRecoveryService.searchPage(query);
        goodsHandle(recoveryList);
        return new Response("goodsRecovery/list")
                .request(query)
                .data("list", recoveryList)
                .data("goodsList", AllDialogController.goodsList);
    }

    //新增物品回收
    @RequestMapping(value = "/addRecoveryGoods", method = {RequestMethod.GET, RequestMethod.POST})
    public Response addRecoveryGoods(GoodsRecovery goodsRecovery) throws UnsupportedEncodingException {
        Response response = new Response();
        response.view("goodsRecovery/add");

        if (goodsRecovery.getPlayerId() != null) {
            String goods = goodsRecovery.getGoods().replaceAll("\r\n", "");
            goodsRecovery.setGoods(goods);
            String s = adminService.recoveryGoods(new RecoveryGoodsQuery(goodsRecovery.getServerId(), goodsRecovery.getGoods(), goodsRecovery.getPlayerId()));
            s = new String(s.getBytes("ISO-8859-1"), "utf-8");
            if (s.equals(PLAYERID_NOT_EXISTENCE)) {
                goodsRecovery.setState(2);
            } else if (s.equals(GOOD_NOT_EXISTENCE)) {
                goodsRecovery.setState(3);
            } else {
                goodsRecovery.setState(1);
                goodsRecovery.setPlayerName(s);
            }
            goodsRecoveryService.save(goodsRecovery);
            response.view("goodsRecovery/list");
            GoodsRecoverySearchQuery query = new GoodsRecoverySearchQuery();
            Page<GoodsRecovery> recoveryList = goodsRecoveryService.searchPage(query);
            goodsHandle(recoveryList);
            response.request(query).data("list", recoveryList);
        } else {
            List<Server> serverList = serverService.searchList();
            response.data("serverList", serverList)
                    .data("goodsList", AllDialogController.goodsList);
        }

        return response;
    }

    //物品处理
    private void goodsHandle(Page<GoodsRecovery> recoveryList) {
        recoveryList.forEach(r -> {
            Map<Integer, Integer> reward = StringUtil.str2map(r.getGoods(), ";", ":");
            StringBuffer goods = new StringBuffer();
            reward.forEach((k, v) -> {
                for (int i = 0; i < AllDialogController.goodsList.size(); i++) {
                    GoodsConfig goodsConfig = AllDialogController.goodsList.get(i);
                    if (k == goodsConfig.id) {
                        goods.append("物品:" + goodsConfig.name + " 数量:" + v + "  ");
                        break;
                    }
                }
            });
            r.setGoods(goods.toString());
        });
    }
}
