package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.common.constants.AdminUrl;
import com.luckygames.wmxz.gamemaster.common.constants.ResultCode;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.dao.GiftpackageSyncEntity;
import com.luckygames.wmxz.gamemaster.model.entity.*;
import com.luckygames.wmxz.gamemaster.model.enums.BroadcastStatus;
import com.luckygames.wmxz.gamemaster.model.enums.BroadcastType;
import com.luckygames.wmxz.gamemaster.model.enums.MailType;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.*;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.ExcelExportUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
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
    private ActivityService activityService;
    @Autowired
    private ActivationCodeService activationCodeService;
    @Autowired
    private SingleServiceBagService singleServiceBagService;
    @Autowired
    private CreateRoleManageService createRoleManageService;
    @Autowired
    private ChatSettingsService chatSettingsService;
    @Autowired
    private AdminNewService adminNewService;
    @Autowired
    private BroadcastNewService broadcastNewService;

    //聊天设置
    @RequestMapping(value = "/chat_settings", method = {RequestMethod.GET, RequestMethod.POST})
    public Response chatSettings(ChatSettings chatSettings) {
        ChatSettingsSearchQuery query=new ChatSettingsSearchQuery();
        if(chatSettings.getServerId()!=null){
            //检查是否已存在
            ChatSettings chatSettings1 = chatSettingsService.search(chatSettings);
            if(chatSettings1!=null){
                chatSettings.setId(chatSettings1.getId());
                chatSettingsService.update(chatSettings);
            }else{
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
                .data("chatSettingsList",chatSettingsPage)
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //创建角色管理
    @RequestMapping(value = "/create_role_manage", method = {RequestMethod.GET, RequestMethod.POST})
    public Response createRoleManage(CreateRoleManage createRoleManage) {
        CreateRoleManageSearchQuery query=new CreateRoleManageSearchQuery();
        if(createRoleManage.getId()!=null){
            createRoleManageService.update(createRoleManage);
        }
        Page<CreateRoleManage> createRoleManagePage = createRoleManageService.searchPage(query);
        return new Response("game/create_role_manage")
                .data("createRoleManageList",createRoleManagePage);
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

        List<GiftpackageAdd> giftpackageAddList = giftpackageAddService.searchType();
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        Page<GiftpackageSync> giftPackagePage = giftpackageSyncService.searchPage(query);

        return new Response("game/giftpackage_sync")
                .request(query)
                .data("typeList", giftpackageAddList)
                .data("serverList", serverList)
                .data("channelList", channelList)
                .data("list", giftPackagePage);
    }

    //礼包下载
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(int id,String filename,String[] title,HttpServletRequest request){
        GiftpackageSync giftpackageSync = giftpackageSyncService.searchById(id);

        if(giftpackageSync.getIsExclusiveGiftbag()==0){
            giftpackageSync.setIsExclusiveGiftbag2("否");
        }else{
            giftpackageSync.setIsExclusiveGiftbag2("是");
        }

        if(giftpackageSync.getIsActivation()==0){
            giftpackageSync.setIsActivation2("否");
        }else{
            giftpackageSync.setIsActivation2("是");
        }

        if(giftpackageSync.getGenerateType()==1){
            giftpackageSync.setGenerateType2("同一类型只能使用1个卡号");
        }else if(giftpackageSync.getGenerateType()==2){
            giftpackageSync.setIsActivation2("同一类型可以使用多个激活码");
        }else if(giftpackageSync.getGenerateType()==3){
            giftpackageSync.setIsActivation2("特殊礼包");
        }

        List<GiftpackageSync> list=new ArrayList<>();
        list.add(giftpackageSync);
        ExcelExportUtil eu=new ExcelExportUtil();
        File file = new File(filename);
        eu.export(file, list, title,GiftpackageSync.class);
        HttpHeaders headers = new HttpHeaders();
        String fileName2;
        byte[] body= new byte[0];
        try {
            if(isMSBrowser(request)){
                fileName2 = URLEncoder.encode(filename, "UTF-8");
            }else{//如果是谷歌、火狐则解析为ISO-8859-1
                fileName2 = new String(filename.getBytes("UTF-8"), "iso-8859-1");
            }
            headers.setContentDispositionFormData("attachment", fileName2);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            body = FileUtils.readFileToByteArray(file);
            // 删除临时文件
            file.delete();
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(body, headers, HttpStatus.OK);
    }

    //判断是否是IE浏览器
    public boolean isMSBrowser(HttpServletRequest request) {
        String[] IEBrowserSignals = {"MSIE", "Trident", "Edge"};
        String userAgent = request.getHeader("User-Agent");
        for (String signal : IEBrowserSignals) {
            if (userAgent.contains(signal)){
                return true;
            }
        }
        return false;
    }

    //生成激活码
    @RequestMapping(value = "/generate_activation_code", method = {RequestMethod.GET, RequestMethod.POST})
    public Response generateActivationCode(ActivationCode activationCode) {
        if (activationCode.getNumber()!=null) {
            activationCodeService.add(activationCode);
        }
        List<GiftpackageAdd> giftpackageAddList = giftpackageAddService.searchType();
        return new Response("game/generate_activation_code")
                .data("typeList", giftpackageAddList);
    }

    //同步激活码
    @RequestMapping(value = "/synchronous_activation_code", method = {RequestMethod.GET, RequestMethod.POST})
    public Response synchronousActivationCode(ActivationCodeSearchQuery query) {
        Page<ActivationCode> activationCodePage = activationCodeService.searchPage(query);
        return new Response("game/synchronous_activation_code")
                .request(query)
                .data("activationCodeList",activationCodePage);
    }

    //单服礼包
    @RequestMapping(value = "/single_service_bag", method = {RequestMethod.GET, RequestMethod.POST})
    public Response singleServiceBag(SingleServiceBagSearchQuery query) {
        Page<SingleServiceBag> singleServiceBagPage = singleServiceBagService.searchPage(query);
        return new Response("game/single_service_bag")
                .request(query)
                .data("singleServiceBagList",singleServiceBagPage);
    }

    //活动
    @RequestMapping(value = "/event", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activity() {
        return new Response("activity/activity");
    }

    //奥林匹克活动列表
    @RequestMapping(value = "/olympics_activity_list", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityList(ActivitySearchQuery query) {
        if (query.getId() != null) {
            activityService.update(query);
        }
        Page<Activity> activityPage = activityService.searchPage(query);
        return new Response("activity/olympics_activity_list")
                .request(query)
                .data("activityList", activityPage);
    }

    //奥林匹克活动设置
    @RequestMapping(value = "/olympics_activity_setting", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activitySetting(Activity activity) {
        return new Response("activity/olympics_activity_setting");
    }

    //登录豪礼
    @RequestMapping(value = "/olympics_activity_logon_courtesy", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityLogonCourtesy(Activity activity) {
        if (StringUtils.isNotBlank(activity.getTitle())) {
            activityService.add(activity);
        }
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        return new Response("activity/olympics_activity_logon_courtesy")
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //特惠礼包
    @RequestMapping(value = "/olympics_activity_special_gift_bag", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activitySpecialGiftBag(Activity activity) {
        if (StringUtils.isNotBlank(activity.getTitle())) {
            activityService.add(activity);
        }
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        return new Response("activity/olympics_activity_special_gift_bag")
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //神兵现世
    @RequestMapping(value = "/olympics_activity_presence_divine_soldiers", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityPresenceDivineSoldiers(Activity activity) {
        if (StringUtils.isNotBlank(activity.getTitle())) {
            activityService.add(activity);
        }
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        return new Response("activity/olympics_activity_presence_divine_soldiers")
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //环卫绩点
    @RequestMapping(value = "/olympics_activity_sanitation_point", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activitySanitationPoint(Activity activity) {
        if (StringUtils.isNotBlank(activity.getTitle())) {
            activityService.add(activity);
        }
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        return new Response("activity/olympics_activity_sanitation_point")
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //节日兑换
    @RequestMapping(value = "/olympics_activity_festive_exchange", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityFestiveExchange(Activity activity) {
        if (StringUtils.isNotBlank(activity.getTitle())) {
            activityService.add(activity);
        }
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        return new Response("activity/olympics_activity_festive_exchange")
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //日夜除尘
    @RequestMapping(value = "/olympics_activity_day_night_dedusting", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityDayNightDedusting(Activity activity) {
        if (StringUtils.isNotBlank(activity.getTitle())) {
            activityService.add(activity);
        }
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        return new Response("activity/olympics_activity_day_night_dedusting")
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //双倍经验
    @RequestMapping(value = "/olympics_activity_double_experience", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityDoubleExperience(Activity activity) {
        if (StringUtils.isNotBlank(activity.getTitle())) {
            activityService.add(activity);
        }
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        return new Response("activity/olympics_activity_double_experience")
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //副本双倍
    @RequestMapping(value = "/olympics_activity_double_duplex", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityDoubleDuplex(Activity activity) {
        if (StringUtils.isNotBlank(activity.getTitle())) {
            activityService.add(activity);
        }
        ServerSearchQuery serverSearchQuery = new ServerSearchQuery();
        List<Server> serverList = serverService.searchList(serverSearchQuery);
        ChannelSearchQuery channelSearchQuery = new ChannelSearchQuery();
        List<Channel> channelList = channelService.searchList(channelSearchQuery);
        return new Response("activity/olympics_activity_double_duplex")
                .data("serverList", serverList)
                .data("channelList", channelList);
    }

    //奥林匹克单服活动
    @RequestMapping(value = "/olympics_single_activity", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activitySingleActivity(ActivitySearchQuery query) {
        if (query.getId() != null) {
            activityService.update(query);
        }
        Page<Activity> activityPage = activityService.searchPage(query);
        return new Response("activity/olympics_single_activity")
                .request(query)
                .data("activityList", activityPage);
    }

    //奥林匹克活动审核
    @RequestMapping(value = "/olympics_activity_audit", method = {RequestMethod.GET, RequestMethod.POST})
    public Response activityAudit(ActivitySearchQuery query) {
        query.setActivityStatus(0);
        Page<Activity> activityPage = activityService.searchPage(query);
        return new Response("activity/olympics_activity_audit")
                .request(query)
                .data("activityList", activityPage);
    }

    @Autowired
    private MailLogService mailLogService;

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
    public Response broadcast(BroadcastNewSearchQuery query) {
        //删除
        if(query.getId()!=null){
            broadcastNewService.deleteById(query.getId());
        }

        Page<BroadcastNew> broadcastList = broadcastNewService.searchPage(query);
        return new Response("game/broadcast")
                .request(query)
                .data("list", broadcastList);
    }

    //更新广播管理
    @RequestMapping(value = {"/update_broadcast"}, method = {RequestMethod.GET, RequestMethod.POST})
    public Response updateBroadcast(SendBroadcastNewRequest request) {
        if (StringUtils.isBlank(request.getServerId().toString())||StringUtils.isBlank(request.getChannelId().toString())||StringUtils.isBlank(request.getNotifyType())||StringUtils.isBlank(request.getContent())) {
            return new Response(ResultCode.EXISTENCE_UNFILLED_FIELDS).json();
        }
        String result="ok";
        try {
            BackendCommand command = new BackendCommand();
            command.setServerId(request.getServerId());
            command.setContent(request.getContent());
            command.setNotifyType(request.getNotifyType());
            command.setPlatform(channelService.getByChannelId(request.getChannelId()).getChannelName());
            result = adminNewService.commonAction(command, AdminUrl.BROADCAST.getUrl());
        } catch (Exception e) {
            logger.error("发送广播异常：", e);
            return new Response(ResultCode.SEND_BROADCAST_FAILED.getCode(), result);
        }

        if (!result.equals("success")) {
            return new Response(ResultCode.SEND_BROADCAST_FAILED.getCode(), result);
        }

        BroadcastNew broadcast = new BroadcastNew();
        broadcast.setId(request.getId());
        broadcast.setServerId(request.getServerId());
        broadcast.setChannelId(request.getChannelId());
        broadcast.setContent(request.getContent());
        broadcast.setNotifyType(Integer.parseInt(request.getNotifyType()));
        broadcastNewService.update(broadcast);
        return new Response().request(request).json();
    }


//    @RequestMapping(value = {"/affiche"}, method = {RequestMethod.GET, RequestMethod.POST})
//    public Response affiche(BroadcastSearchQuery query) {
//        Page<Broadcast> broadcastList = broadcastService.searchPage(query);
//        return new Response("game/affiche")
//                .request(query)
//                .data("broadcastList", broadcastList);
//    }
}
