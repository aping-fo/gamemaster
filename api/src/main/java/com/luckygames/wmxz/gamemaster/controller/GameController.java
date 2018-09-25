package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.common.constants.AdminUrl;
import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.enums.MailType;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.ExcelExportUtil;
import com.luckygames.wmxz.gamemaster.utils.ExportUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.formula.functions.Now;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/game")
public class GameController extends BaseController {
    @Autowired
    private GiftpackageSyncService giftpackageSyncService;
    @Autowired
    private GiftpackageAddService giftpackageAddService;
    @Autowired
    private ServerService serverService;
    @Autowired
    private ChannelService channelService;
    @Autowired
    private ActivationCodeService activationCodeService;
    @Autowired
    private SingleServiceBagService singleServiceBagService;
    @Autowired
    private CreateRoleManageService createRoleManageService;
    @Autowired
    private ChatSettingsService chatSettingsService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private BroadcastService broadcastService;
    @Autowired
    private NoticeService noticeService;
    @Autowired
    private MailLogService mailLogService;

    //聊天设置
    @RequestMapping(value = "/chat_settings", method = {RequestMethod.GET, RequestMethod.POST})
    public Response chatSettings(ChatSettings chatSettings) {
        ChatSettingsSearchQuery query = new ChatSettingsSearchQuery();
        if (chatSettings.getServerId() != null) {
            //检查是否已存在
            ChatSettings chatSettings1 = chatSettingsService.search(chatSettings);
            if (chatSettings1 != null) {
                chatSettings.setId(chatSettings1.getId());
                chatSettingsService.update(chatSettings);
            } else {
                Server service = serverService.getByServerId(chatSettings.getServerId());
                chatSettings.setServerName(service.getServerName());
                Channel channel = channelService.getByChannelId(chatSettings.getChannelId());
                chatSettings.setChannelName(channel.getChannelName());
                chatSettingsService.add(chatSettings);
            }
        }

        Page<ChatSettings> chatSettingsPage = chatSettingsService.searchPage(query);
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);

        return new Response("game/chat_settings")
                .data("chatSettingsList", chatSettingsPage)
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //创建角色管理
    @RequestMapping(value = "/create_role_manage", method = {RequestMethod.GET, RequestMethod.POST})
    public Response createRoleManage(CreateRoleManage createRoleManage) {
        CreateRoleManageSearchQuery query = new CreateRoleManageSearchQuery();
        if (createRoleManage.getId() != null) {
            createRoleManageService.update(createRoleManage);
        }
        Page<CreateRoleManage> createRoleManagePage = createRoleManageService.searchPage(query);
        return new Response("game/create_role_manage")
                .data("createRoleManageList", createRoleManagePage);
    }

    //添加礼包
    @RequestMapping(value = "/giftpackage_add", method = {RequestMethod.GET, RequestMethod.POST})
    public Response addGiftPackage(GiftpackageAddSearchQuery giftpackageAddSearchQuery) {
        if (StringUtils.isNotBlank(giftpackageAddSearchQuery.getName())) {
            giftpackageAddService.addGiftpackage(giftpackageAddSearchQuery);
        }
        return new Response("game/giftpackage_add");
    }

    //同步礼包
    @RequestMapping(value = "/giftpackage_sync", method = {RequestMethod.GET, RequestMethod.POST})
    public Response syncGiftPackage(GiftpackageSyncSearchQuery query) {
        //同步礼包
        if (query.getCount() != null) {
            giftpackageSyncService.addGiftpackage(query);
            //TODO 同步礼包
        }

        //删除礼包
        if (query.getId() != null) {
            giftpackageSyncService.delete(query.getId());
        }

//        List<GiftpackageAdd> giftpackageAddList = giftpackageAddService.searchType();
//        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
//        List<Server> serverList = serverService.searchList(serverSearchQuery);
//        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
//        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        Page<GiftpackageSync> giftPackagePage = giftpackageSyncService.searchPage(query);

        return new Response("game/giftpackage_sync")
                .request(query)
//                .data("typeList", giftpackageAddList)
//                .data("serverList", serverList)
//                .data("channelList", channelList)
                .data("list", giftPackagePage);
    }

    //礼包下载
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(int id, String filename, String[] title, HttpServletRequest request) {
        GiftpackageSync giftpackageSync = giftpackageSyncService.searchById(id);

//        if (giftpackageSync.getIsExclusiveGiftbag() == 0) {
//            giftpackageSync.setIsExclusiveGiftbag2("否");
//        } else {
//            giftpackageSync.setIsExclusiveGiftbag2("是");
//        }
//
//        if (giftpackageSync.getIsActivation() == 0) {
//            giftpackageSync.setIsActivation2("否");
//        } else {
//            giftpackageSync.setIsActivation2("是");
//        }
//
//        if (giftpackageSync.getGenerateType() == 1) {
//            giftpackageSync.setGenerateType2("同一类型只能使用1个卡号");
//        } else if (giftpackageSync.getGenerateType() == 2) {
//            giftpackageSync.setIsActivation2("同一类型可以使用多个激活码");
//        } else if (giftpackageSync.getGenerateType() == 3) {
//            giftpackageSync.setIsActivation2("特殊礼包");
//        }

        List<GiftpackageSync> list = new ArrayList<>();
        list.add(giftpackageSync);
        ExcelExportUtil eu = new ExcelExportUtil();
        File file = new File(filename);
        eu.export(file, list, title, GiftpackageSync.class);
        HttpHeaders headers = new HttpHeaders();
        String fileName2;
        byte[] body = new byte[0];
        body = ExportUtil.exportExcel(filename, request, file, headers, body);
        return new ResponseEntity<>(body, headers, HttpStatus.OK);
    }

    //生成激活码
    @RequestMapping(value = "/generate_activation_code", method = {RequestMethod.GET, RequestMethod.POST})
    public Response generateActivationCode(ActivationCode activationCode) {
        Response response = new Response("game/generate_activation_code");
        if (activationCode.getId() != null) {
            if (activationCode.getId() != null) {
                activationCodeService.update(activationCode);
            } else {
                activationCodeService.add(activationCode);
            }
        } else if (activationCode.getId() != null) {
            ActivationCode activationCode1 = activationCodeService.searchById(activationCode.getId());
            response.data("activationCode", activationCode1);
        }

        List<GiftpackageAdd> giftpackageAddList = giftpackageAddService.searchType();
        response.data("typeList", giftpackageAddList);
        return response;
    }

    //同步激活码
    @RequestMapping(value = "/synchronous_activation_code", method = {RequestMethod.GET, RequestMethod.POST})
    public Response synchronousActivationCode(ActivationCodeSearchQuery query) {
        Page<ActivationCode> activationCodePage = activationCodeService.searchPage(query);
        return new Response("game/synchronous_activation_code")
                .request(query)
                .data("activationCodeList", activationCodePage);
    }

    //单服礼包
    @RequestMapping(value = "/single_service_bag", method = {RequestMethod.GET, RequestMethod.POST})
    public Response singleServiceBag(SingleServiceBagSearchQuery query) {
        Page<SingleServiceBag> singleServiceBagPage = singleServiceBagService.searchPage(query);
        return new Response("game/single_service_bag")
                .request(query)
                .data("singleServiceBagList", singleServiceBagPage);
    }

    //活动
    @RequestMapping(value = "/event", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activity() {
        return new Response("activity/activity");
    }

    //邮件列表
    @RequestMapping(value = "/mail", method = {RequestMethod.GET, RequestMethod.POST})
    public Response mail(MailSearchQuery query) {
        if (query.getMailType() != null && query.getMailType().equals(MailType.UNKNOWN)) {
            query.setMailType(null);
        }
        Page<MailLog> mailLogs = mailLogService.searchPage(query);

        return new Response("game/mail")
                .request(query)
                .data("mailLogs", mailLogs);
    }

    //广播管理
    @RequestMapping(value = {"/broadcast"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Response broadcast(Broadcast broadcast) {
        BroadcastSearchQuery query = new BroadcastSearchQuery();

        //删除
        if (broadcast.getId() != null) {
            broadcastService.deleteById(broadcast.getId());
        }

        //增加
        if (broadcast.getContent() != null) {
            broadcastService.save(broadcast);
            BroadcastQuery broadcastQuery = new BroadcastQuery(broadcast.getServerId(), broadcast.getLoopTimes(), broadcast.getGapSecond(), new Date(), broadcast.getTitle(), broadcast.getContent());

            adminService.sendBroadcast(broadcastQuery);
        }

        Page<Broadcast> broadcastList = broadcastService.searchPage(query);
        List<Server> serverList = serverService.searchList();
        return new Response("game/broadcast")
                .request(query)
                .data("list", broadcastList)
                .data("serverList", serverList);
    }

    //首屏公告
    @RequestMapping(value = {"/notice"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Response notice(Notice notice) {
        Response response = new Response("game/notice");
        Notice notice1 = new Notice();
        if (notice.getType() != null) {
            if (notice.getType().equals("add") || notice.getType().equals("update")) {
                if (StringUtils.isBlank(notice.getTitle()) || StringUtils.isBlank(notice.getContent())) {
                    return new Response(ResultCode.EXISTENCE_UNFILLED_FIELDS).json();
                } else {
                    if (notice.getType().equals("update")) {
                        notice.setId(notice.getId());
                    }
                    noticeService.save(notice);
                }
            } else if (notice.getType().equals("delete")) {
                noticeService.deleteById(notice.getId());
            } else if (notice.getType().equals("modify")) {
                notice1 = noticeService.searchById(notice.getId());
            } else if (notice.getType().equals("open") || notice.getType().equals("close")) {
                notice.setId(notice.getId());
                if (notice.getType().equals("open")) {
                    notice.setEnable(1);
                } else if (notice.getType().equals("close")) {
                    notice.setEnable(0);
                }
                noticeService.update(notice);
            }

            AdminController.notice = noticeService.searchLast();
        }

        NoticeSearchQuery query = new NoticeSearchQuery();
        query.setStartDate(notice.getStartDate());
        query.setEndDate(notice.getEndDate());
        Page<Notice> noticePage = noticeService.searchPage(query);

        response.data("list", noticePage)
                .data("notice", notice1)
                .request(query);
        return response;
    }
}
