package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.Channel;
import com.luckygames.wmxz.gamemaster.model.entity.ChannelBag;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.IndexQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.*;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class CommonController extends BaseController {
    @Autowired
    private ServerService serverService;
    @Autowired
    private PlayerCharacterService playerCharacterService;
    @Autowired
    private OnlineNowService onlineNowService;
    @Autowired
    private PlayerOrderService playerOrderService;
    @Autowired
    private ChannelService channelService;
    @Autowired
    private ChannelBagService channelBagService;

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public Response index(IndexQuery query) {
//        List<Server> serverList;
//        if (CollectionUtils.isEmpty(query.getServerIds())) {
//            serverList = serverService.searchList();
//        } else {
//            serverList = serverService.searchList(new ServerSearchQuery() {{
//                setServerIds(query.getServerIds());
//            }});
//        }
//        if (CollectionUtils.isNotEmpty(serverList)) {
//            serverList.forEach(s -> {
//                s.setOpenDays((int) DateUtils.gapDays(s.getOpenDate(), DateUtils.Now()));
//                s.setCharCount((int) playerCharacterService.countCharaters(s.getServerId()));
//                s.setOnlineCount((int) onlineNowService.countOnlineNow(s.getServerId()));
//                s.setActiveCount((int) onlineNowService.countOnlineNow(s.getServerId(), 30 * 60));
//                BigDecimal rechargeAmount = playerOrderService.sumRechargeAmount(s.getServerId());
//                if (rechargeAmount != null) {
//                    s.setRechargeAmount(rechargeAmount);
//                }
//                Integer rechargeCount = playerOrderService.countRechargeCount(s.getServerId());
//                if (rechargeCount != null) {
//                    s.setRechargeCount(rechargeCount);
//                }
//                if (rechargeAmount != null && rechargeCount != null && rechargeCount >= 0) {
//                    s.setArpu(rechargeAmount.divide(BigDecimal.valueOf(rechargeCount), 2, BigDecimal.ROUND_HALF_UP));
//                }
//            });
//        }
//        List<Server> serverList = serverService.searchList();
//        Server server;
//        if(query.getServerId()!=null){
//            server=serverService.getByServerId(query.getServerId());
//        }else{
//            server = serverList.get(0);
//        }
//        if (CollectionUtils.isNotEmpty(serverList)) {
//            server.setOpenDays((int) DateUtils.gapDays(server.getOpenTime(), DateUtils.Now()));
//            server.setCharCount((int) playerCharacterService.countCharaters(server.getServerId()));
//            server.setOnlineCount((int) onlineNowService.countOnlineNow(server.getServerId()));
//            server.setActiveCount((int) onlineNowService.countOnlineNow(server.getServerId(), 30 * 60));
//            BigDecimal rechargeAmount = playerOrderService.sumRechargeAmount(server.getServerId());
//            if (rechargeAmount != null) {
//                server.setRechargeAmount(rechargeAmount);
//            }
//            Integer rechargeCount = playerOrderService.countRechargeCount(server.getServerId());
//            if (rechargeCount != null) {
//                server.setRechargeCount(rechargeCount);
//            }
//            if (rechargeAmount != null && rechargeCount != null && rechargeCount >= 0) {
//                server.setArpu(rechargeAmount.divide(BigDecimal.valueOf(rechargeCount), 2, BigDecimal.ROUND_HALF_UP));
//            }

//            Map<String, List<ChannelBag>> channelListMap=new HashMap<>();
//            List<Channel> channelList = channelService.searchListByServerId(server.getServerId());
//            if(query.getChannelId()!=null){
//                Channel channel = channelService.getByChannelId(query.getChannelId());
//                for(Channel channelTemp:channelList){
//                    if(channel.getId()==channelTemp.getId()){
//                        List<ChannelBag> ChannelBagList = channelBagService.searchPageByChannelId(channel.getChannelId());
//                        channelListMap.put(channel.getChannelName(),ChannelBagList);
//                        break;
//                    }
//                }
//            }else{
//                for(Channel channel:channelList){
//                    List<ChannelBag> ChannelBagList = channelBagService.searchPageByChannelId(channel.getChannelId());
//                    channelListMap.put(channel.getChannelName(),ChannelBagList);
//                }
//            }
//            server.setChannelListMap(channelListMap);
//        }

//        List<Channel> channelList = channelService.searchList();
        return new Response("index")
                .request(query);
//                .data("server", server)
//                .data("serverList", serverList)
//                .data("channelList", channelList);
    }
}
