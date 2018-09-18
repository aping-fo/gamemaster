package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.CharacterTransfer;

import com.luckygames.wmxz.gamemaster.model.entity.GoodsRecovery;
import com.luckygames.wmxz.gamemaster.model.entity.Server;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.GoodsRecoverySearchQuery;

import com.luckygames.wmxz.gamemaster.service.GoodsRecoveryService;
import com.luckygames.wmxz.gamemaster.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/goodsRecovery")
public class GoodsRecoveryController extends BaseController {
    @Autowired
    private ServerService serverService;
    @Autowired
    private GoodsRecoveryService goodsRecoveryService;
    //转移列表
    @RequestMapping(value = "/recoveryList", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryList(GoodsRecoverySearchQuery query) {
        if(query.getPlayerId() != null)
        {
            goodsRecoveryService.addGoodsRecovery(query);
        }
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }

        ArrayList<GoodsCfg> glist=new ArrayList<GoodsCfg>();
        Iterator iter = goodsRecoveryService.goodsMap().entrySet().iterator();
        while (iter.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            GoodsCfg cfg=new GoodsCfg();
            cfg.id=(Long)key;
            cfg.name=(String)val;
            glist.add(cfg);
        }
        Page<GoodsRecovery> recovery= goodsRecoveryService.searchPage(query);
        List<Server> serverList = serverService.searchList();
        Response r = new Response("goodsRecovery/main")
                .request(query)
                .data("recovery", recovery)
                .data("serverList",serverList)
                .data("goodsList",glist);
        return r;
    }
}
class GoodsCfg
{
    public String name;
    public Long id;
}

