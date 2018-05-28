package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.PayLTV;
import com.luckygames.wmxz.gamemaster.model.enums.LTVDaysType;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.LTVSearchQuery;
import com.luckygames.wmxz.gamemaster.service.PayLTVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/paid")
public class PaidController extends BaseController {
    @Autowired
    private PayLTVService payLTVService;

    @RequestMapping(value = "/ltv", method = {RequestMethod.GET, RequestMethod.POST})
    public Response ltv(LTVSearchQuery query) {
        if (query.getPageNum() == null) {
            query.setPageNum(1);
        }

        Page<PayLTV> payLTVPage = payLTVService.searchSummaryPage(query);

        return new Response("paid/ltv")
                .request(query)
                .data("payLTVList", payLTVPage)
                .data("days", LTVDaysType.values());

    }
}
