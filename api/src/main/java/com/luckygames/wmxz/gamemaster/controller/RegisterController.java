package com.luckygames.wmxz.gamemaster.controller;

import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.AngleNumberAnalysis;
import com.luckygames.wmxz.gamemaster.model.entity.PlayerActionDaily;
import com.luckygames.wmxz.gamemaster.model.entity.RegisteredData;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.service.AngleNumberAnalysisService;
import com.luckygames.wmxz.gamemaster.service.PlayerActionDailyService;
import com.luckygames.wmxz.gamemaster.service.PlayerActionLogService;
import com.luckygames.wmxz.gamemaster.service.RegisteredDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/register")
public class RegisterController extends BaseController {
    @Autowired
    private PlayerActionDailyService playerActionDailyService;
    @Autowired
    private PlayerActionLogService playerActionLogService;
    @Autowired
    private RegisteredDataService registeredDataService;
    @Autowired
    private AngleNumberAnalysisService angleNumberAnalysisService;

    @RequestMapping(value = "/statics", method = {RequestMethod.GET, RequestMethod.POST})
    public Response registerStatics() {
        return new Response("register/statics");
    }

    @RequestMapping(value = "/statics_register", method = {RequestMethod.GET, RequestMethod.POST})
    public Response staticsRegister(CommonSearchQuery commonSearchQuery) {
        if (commonSearchQuery.getPageNum() == null) {
            commonSearchQuery.setPageNum(1);
        }

        Page<PlayerActionDaily> playerActionDailyPage = playerActionDailyService.searchRegisterPage(commonSearchQuery);

        return new Response("register/statics_register")
                .request(commonSearchQuery)
                .data("playerActionDailyList", playerActionDailyPage);
    }

    @RequestMapping(value = "/statics_character", method = {RequestMethod.GET, RequestMethod.POST})
    public Response staticsCharacter(CommonSearchQuery commonSearchQuery) {
        if (commonSearchQuery.getPageNum() == null) {
            commonSearchQuery.setPageNum(1);
        }

        Page<PlayerActionDaily> playerActionDailyPage = playerActionDailyService.searchCharacterPage(commonSearchQuery);

        return new Response("register/statics_character")
                .request(commonSearchQuery)
                .data("playerActionDailyList", playerActionDailyPage);
    }

    //设备数
    @RequestMapping(value = "/statics_equipment", method = {RequestMethod.GET, RequestMethod.POST})
    public Response staticsEquipment(CommonSearchQuery query) {
        Page<RegisteredData> registeredDataPage = registeredDataService.searchPage(query);

        return new Response("register/statics_equipment")
                .request(query)
                .data("equipmentCountList", registeredDataPage);
    }

    //创建数分析
    @RequestMapping(value = "/statics_character_analysis", method = {RequestMethod.GET, RequestMethod.POST})
    public Response staticsCharacterAnalysis(CommonSearchQuery query) {
        Page<AngleNumberAnalysis> angleNumberAnalysisPage = angleNumberAnalysisService.searchPage(query);

        return new Response("register/statics_character_analysis")
                .request(query)
                .data("angleNumberAnalysisList", angleNumberAnalysisPage);
    }

    //保存设备数
    @RequestMapping(value = "/save_equipment", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void saveEquipment(Long channelId,Boolean isActivated) {
        //http://192.168.6.190:7777/register/save_equipment?channelId=1&isActivated=true
        RegisteredData registeredData=new RegisteredData();
        registeredData.setChannelId(channelId);
        if(!isActivated){
            registeredData.setEquipmentCount(1);
        }else{
            registeredData.setActivationCount(1);
        }
        registeredDataService.save(registeredData);
    }
}
