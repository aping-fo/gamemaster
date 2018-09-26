package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.data.GoodsConfig;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.enums.ForbiddenOperationType;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @作者 周聪
 * @时间 2018/9/16 10:08
 */
@Controller
@RequestMapping("/operatingTools")
public class OperatingToolsController extends BaseController {
    private static final String SUCCESS = "success";
    private static final String PLAYERID_NOT_EXISTENCE = "playerid_not_existence";// 玩家id不存在
    private static final String GOOD_NOT_EXISTENCE = "good_not_existence";// 物品不存在

    public static int Activation_Code_batch;

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
    @Autowired
    private CharacterTransferService characterTransferService;
    @Autowired
    private GiftpackageSyncService giftpackageSyncService;
    @Autowired
    private NoticeService noticeService;
    @Autowired
    private ForbiddenLogService forbiddenLogService;

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

    //公告列表
    @RequestMapping(value = {"/noticeList"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Response noticeList(NoticeSearchQuery query) {
        Response response = new Response("game/noticeList");
        Notice notice1 = new Notice();
        Page<Notice> noticePage = noticeService.searchPage(query);
        response.data("list", noticePage)
                .data("notice", notice1)
                .request(query);
        return response;
    }

    //增加公告
    @RequestMapping(value = {"/noticeAdd"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Response noticeAdd(Notice notice) {
        Response response = new Response("game/noticeAdd");
        if (notice.getTitle() != null) {
            noticeService.save(notice);
            response.view("game/noticeList");
        }
        AdminController.notice = noticeService.searchLast();
        return response.data("list", noticeService.searchPage(new NoticeSearchQuery()))
                .request(new NoticeSearchQuery());
    }

    //更新公告
    @RequestMapping(value = {"/noticeUpdate"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Response noticeUpdate(Notice notice) {
        Response response = new Response("game/noticeUpdate");
        if (notice.getType() == null) {
            noticeService.update(notice);
            response.view("game/noticeList");
        }
        AdminController.notice = noticeService.searchLast();
        return response.data("list", noticeService.searchPage(new NoticeSearchQuery()))
                .request(new NoticeSearchQuery())
                .data("notice", noticeService.searchById(notice.getId()));
    }

    //删除公告
    @RequestMapping(value = {"/noticeDelete"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Response noticeDelete(Notice notice) {
        noticeService.deleteById(notice.getId());
        AdminController.notice = noticeService.searchLast();
        return new Response("game/noticeList")
                .data("list", noticeService.searchPage(new NoticeSearchQuery()))
                .request(new NoticeSearchQuery());
    }

    //激活码列表
    @RequestMapping(value = "/activationCode", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activationCode(GiftpackageSyncSearchQuery query) {
        Response response = new Response("game/activation_code");
        Page<GiftpackageSync> giftpackageSyncs = giftpackageSyncService.searchPage(query);
        response.request(query).data("list", giftpackageSyncs);
        return response;
    }

    //激活码详情列表
    @RequestMapping(value = "/activationCodeDetails", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activationCodeDetails(ActivationCodeSearchQuery query) throws UnsupportedEncodingException {
        if (query.getRemarks() != null && !query.getRemarks().trim().equals("")) {
            String s = new String(query.getRemarks().getBytes("ISO-8859-1"), "UTF-8");
            query.setRemarks(s);
        }

        Response response = new Response("game/activation_code_details");
        Page<ActivationCode> activationCodePage = activationCodeService.searchPage(query);
        response.request(query).data("list", activationCodePage);
        return response;
    }

    //导出激活码
    @RequestMapping(value = "/activationCodeExport", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<byte[]> activationCodeExport(ActivationCodeSearchQuery query, HttpServletRequest request) {
        String name = query.getRemarks() + ".xls";
        Page<ActivationCode> activationCodePage = activationCodeService.search(query.getRemarks());

        //导出数据处理
        activationCodePage.forEach(ac -> {
            Map<Integer, Integer> reward = StringUtil.str2map(ac.getRewards(), ";", ":");
            StringBuffer goods = new StringBuffer();
            goodId2goodString(reward, goods);
            ac.setRewards(goods.toString());
            if (ac.getUniversal() == 0) {
                ac.setUniversal2("否");
            } else {
                ac.setUniversal2("是");
            }
        });


        ExcelExportUtil eu = new ExcelExportUtil();
        File file = new File(name);
        eu.export(file, activationCodePage, new String[]{"激活码", "备注", "物品", "万能码", "生效时间", "失效时间", "有效区服", "创建时间", "使用时间", "使用角色ID", "使用角色名称", "使用角色账户", "使用服务器"}, ActivationCode.class);
        HttpHeaders headers = new HttpHeaders();
        byte[] body = new byte[0];
        body = ExportUtil.exportExcel(name, request, file, headers, body);
        return new ResponseEntity<>(body, headers, HttpStatus.OK);
    }

    //物品id转物品名称
    private void goodId2goodString(Map<Integer, Integer> reward, StringBuffer goods) {
        reward.forEach((k, v) -> {
            for (int i = 0; i < AllDialogController.goodsList.size(); i++) {
                GoodsConfig goodsConfig = AllDialogController.goodsList.get(i);
                if (k == goodsConfig.id) {
                    goods.append("物品:").append(goodsConfig.name).append(" 数量:").append(v).append("  ");
                    break;
                }
            }
        });
    }

    //生成激活码
    @RequestMapping(value = "/addActivationCode", method = {RequestMethod.GET, RequestMethod.POST})
    public Response addActivationCode(ActivationCode activationCode) {
        Response response = new Response();
        response.view("game/generate_activation_code");
        List<Server> serverList = serverService.searchList();

        if (activationCode.getNumber() != null) {
            int count = activationCode.getNumber();
            String rewards = activationCode.getRewards().replaceAll("\r\n", "");
            activationCode.setRewards(rewards);

            Activation_Code_batch++;

            String batch = "";
            if (Activation_Code_batch < 10) {
                batch = "00" + Activation_Code_batch;
            } else if (Activation_Code_batch < 100) {
                batch = "0" + Activation_Code_batch;
            }

            GiftpackageSync giftpackageSync = new GiftpackageSync();
            giftpackageSync.setCardCount(count);
            giftpackageSync.setCardType(activationCode.getRemarks());
            giftpackageSync.setMinTermValidity(activationCode.getInvalidTime());
            giftpackageSync.setMaxTermValidity(activationCode.getOverdueTime());
            giftpackageSync.setServerId(activationCode.getServerId());
            giftpackageSyncService.save(giftpackageSync);

            for (int i = 0; i < count; i++) {
                activationCode.setName(RandomString.getSerialNo(5) + batch);
                activationCodeService.save(activationCode);
                activationCode.setId(null);
            }

            response.view("game/activation_code");

            new Thread(() -> {
                //更新全部服务器
                if (activationCode.getServerId() == 0) {
                    //更新游戏服务器的激活码
                    if (serverList != null && !serverList.isEmpty()) {
                        serverList.forEach(server -> adminService.sendActivationCode(new ActivationCodeQuery(server.getServerId(), "update")));
                    }
                } else {
                    adminService.sendActivationCode(new ActivationCodeQuery(activationCode.getServerId(), "update"));
                }
            }).start();
        }

        GiftpackageSyncSearchQuery query = new GiftpackageSyncSearchQuery();
        Page<GiftpackageSync> giftpackageSyncs = giftpackageSyncService.searchPage(query);

        response.request(new ActivationCodeSearchQuery())
                .data("list", giftpackageSyncs)
                .data("serverList", serverList)
                .data("goodsList", AllDialogController.goodsList);
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
            switch (s) {
                case PLAYERID_NOT_EXISTENCE:
                    goodsRecovery.setState(2);
                    break;
                case GOOD_NOT_EXISTENCE:
                    goodsRecovery.setState(3);
                    break;
                default:
                    goodsRecovery.setState(1);
                    goodsRecovery.setPlayerName(s);
                    break;
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
            goodId2goodString(reward, goods);
            r.setGoods(goods.toString());
        });
    }

    //角色转移
    @RequestMapping(value = "/transferList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryList(CharacterTransferSearchQuery query) {
        if (query.getPlayerId() != null) {
            characterTransferService.addCharacterTransfer(query);
        }
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }
        Page<CharacterTransfer> characters = characterTransferService.searchPage(query);
        List<Server> serverList = serverService.searchList();
        return new Response("characterTransfer/main")
                .request(query)
                .data("characters", characters)
                .data("serverList", serverList);
    }

    //封禁列表
    @RequestMapping(value = "/forbiddenList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response forbiddenList(ForbiddenSearchQuery query) {
        Page<ForbiddenLog> forbiddenLogList = forbiddenLogService.searchPage(query);
        forbiddenLogList.forEach(f -> {
            if (f.getOperateType().equals(ForbiddenOperationType.FORBIDDEN) && f.getExpireTime().getTime() < new Date().getTime()) {
                f.setOperateType(ForbiddenOperationType.ALLOWED);
                forbiddenLogService.update(f);
            }
        });

        return new Response("player/forbiddenList")
                .request(query)
                .data("list", forbiddenLogList);
    }

    //封禁增加
    @RequestMapping(value = "/forbiddenAdd", method = {RequestMethod.GET, RequestMethod.POST})
    public Response forbiddenAdd(ForbiddenLog forbiddenLog) {
        Response response = new Response("player/forbiddenAdd");
//        if (forbiddenLog.getPlayerId() != null) {
        //设置玩家名称
//        String playerString = adminService.getPlayerById(new PlayerQuery(forbiddenLog.getServerId(), forbiddenLog.getPlayerId()));
//        Map<String, Object> playerMap = JsonUtils.string2Map(playerString);
//        try {
//            forbiddenLog.setPlayerName(new String(playerMap.get("name").toString().getBytes("ISO-8859-1"), "utf-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        if (forbiddenLog.getPlayerName() != null) {
            String playerString = adminService.getPlayerName(new PlayerNameQuery(forbiddenLog.getServerId(), forbiddenLog.getPlayerName()));
            Map<String, Object> playerMap = JsonUtils.string2Map(playerString);
            try {
                forbiddenLog.setPlayerName(new String(playerMap.get("name").toString().getBytes("ISO-8859-1"), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            forbiddenLog.setPlayerId(Long.valueOf(playerMap.get("playerId").toString()));

            //设置过期时间
            Date date = new Date();
            date.setTime(date.getTime() + forbiddenLog.getHour() * 1000 * 60 * 60);
            forbiddenLog.setExpireTime(date);

            forbiddenLogService.save(forbiddenLog);

            response.view("player/forbiddenList");
            ForbiddenSearchQuery query = new ForbiddenSearchQuery();
            Page<ForbiddenLog> forbiddenLogList = forbiddenLogService.searchPage(query);
            response.request(query).data("list", forbiddenLogList);

            new Thread(() -> adminService.banRole(new BanQuery(
                    forbiddenLog.getForbiddenType().getCode(),
                    forbiddenLog.getOperateType().getCode(),
                    forbiddenLog.getPlayerId(),
                    forbiddenLog.getHour(),
                    forbiddenLog.getServerId()))).start();
        } else {
            List<Server> serverList = serverService.searchList();
            response.data("serverList", serverList);
        }
        return response;
    }

    //封禁解除
    @RequestMapping(value = "/forbiddenAllowed", method = {RequestMethod.GET, RequestMethod.POST})
    public Response forbiddenAllowed(ForbiddenLog forbiddenLog) {
        Response response = new Response("player/forbiddenList");
        forbiddenLogService.update(forbiddenLog);
        ForbiddenSearchQuery query = new ForbiddenSearchQuery();
        Page<ForbiddenLog> forbiddenLogList = forbiddenLogService.searchPage(query);
        response.request(query).data("list", forbiddenLogList);

        new Thread(() -> adminService.banRole(new BanQuery(
                forbiddenLog.getForbiddenType().getCode(),
                forbiddenLog.getOperateType().getCode(),
                forbiddenLog.getPlayerId(),
                forbiddenLog.getHour(),
                forbiddenLog.getServerId())
        )).start();

        return response;
    }

    //踢人
    @RequestMapping(value = "/kickLine", method = {RequestMethod.GET, RequestMethod.POST})
    public Response kickLine(ForbiddenLog forbiddenLog) {
        Response response = new Response("player/forbiddenList");

        ForbiddenSearchQuery query = new ForbiddenSearchQuery();
        Page<ForbiddenLog> forbiddenLogList = forbiddenLogService.searchPage(query);
        response.request(query).data("list", forbiddenLogList);

        new Thread(() -> adminService.kickLine(new KickLineQuery(
                forbiddenLog.getPlayerId(),
                forbiddenLog.getServerId())
        )).start();

        return response;
    }
}
