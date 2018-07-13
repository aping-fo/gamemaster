package com.luckygames.wmxz.gamemaster.controller;

import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.IndexQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.ServerSearchQuery;
import com.luckygames.wmxz.gamemaster.service.OnlineNowService;
import com.luckygames.wmxz.gamemaster.service.PlayerCharacterService;
import com.luckygames.wmxz.gamemaster.service.PlayerOrderService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import com.luckygames.wmxz.gamemaster.utils.DateUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.List;

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

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public Response index(IndexQuery query) {
        List<Server> serverList;
        if (CollectionUtils.isEmpty(query.getServerIds())) {
            serverList = serverService.searchList();
        } else {
            serverList = serverService.searchList(new ServerSearchQuery() {{
                setServerIds(query.getServerIds());
            }});
        }
        if (CollectionUtils.isNotEmpty(serverList)) {
            serverList.forEach(s -> {
                s.setOpenDays((int) DateUtils.gapDays(s.getOpenDate(), DateUtils.Now()));
                s.setCharCount((int) playerCharacterService.countCharaters(s.getServerId()));
                s.setOnlineCount((int) onlineNowService.countOnlineNow(s.getServerId()));
                s.setActiveCount((int) onlineNowService.countOnlineNow(s.getServerId(), 30 * 60));
                BigDecimal rechargeAmount = playerOrderService.sumRechargeAmount(s.getServerId());
                if (rechargeAmount != null) {
                    s.setRechargeAmount(rechargeAmount);
                }
                Integer rechargeCount = playerOrderService.countRechargeCount(s.getServerId());
                if (rechargeCount != null) {
                    s.setRechargeCount(rechargeCount);
                }
                if (rechargeAmount != null && rechargeCount != null && rechargeCount >= 0) {
                    s.setArpu(rechargeAmount.divide(BigDecimal.valueOf(rechargeCount), 2, BigDecimal.ROUND_HALF_UP));
                }
            });
        }
        return new Response("index")
                .request(query)
                .data("serverList", serverList)
                ;
    }

}
