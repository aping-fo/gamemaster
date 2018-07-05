package com.luckygames.wmxz.gamemaster.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.Page;
import com.luckygames.wmxz.gamemaster.controller.base.BaseController;
import com.luckygames.wmxz.gamemaster.model.entity.GiftpackageSync;
import com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnline;
import com.luckygames.wmxz.gamemaster.model.entity.OnlineNow;
import com.luckygames.wmxz.gamemaster.model.view.base.Response;
import com.luckygames.wmxz.gamemaster.model.view.request.CommonSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.IntegratedOnlineServiceSearchQuery;
import com.luckygames.wmxz.gamemaster.model.view.request.OnlineNowSearchQuery;
import com.luckygames.wmxz.gamemaster.service.IntegratedOnlineService;
import com.luckygames.wmxz.gamemaster.service.IntegratedOnlineServiceService;
import com.luckygames.wmxz.gamemaster.service.OnlineNowService;
import com.luckygames.wmxz.gamemaster.utils.ExcelExportUtil;
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
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/online")
public class OnlineController extends BaseController {
    @Autowired
    private OnlineNowService onlineNowService;
    @Autowired
    private IntegratedOnlineService integratedOnlineService;
    @Autowired
    private IntegratedOnlineServiceService integratedOnlineServiceService;

    //综合在线
    @RequestMapping(value = "/statics", method = {RequestMethod.GET, RequestMethod.POST})
    public Response integratedOnline(CommonSearchQuery query) {
        return new Response("online/statics")
                .request(query);
    }

    // 综合在线数据
    @RequestMapping(value = "/statics_data", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public JSONArray integratedOnlineData(IntegratedOnlineSearchQuery query) {
        List<IntegratedOnline> integratedOnlinePage = integratedOnlineService.searchPage(query);
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(integratedOnlinePage));
        return jsonArray;
    }

    //综合在线下载
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(int id, String filename, String[] title, HttpServletRequest request){
//        GiftpackageSync giftpackageSync = giftpackageSyncService.searchById(id);
//
//        if(giftpackageSync.getIsExclusiveGiftbag()==0){
//            giftpackageSync.setIsExclusiveGiftbag2("否");
//        }else{
//            giftpackageSync.setIsExclusiveGiftbag2("是");
//        }
//
//        if(giftpackageSync.getIsActivation()==0){
//            giftpackageSync.setIsActivation2("否");
//        }else{
//            giftpackageSync.setIsActivation2("是");
//        }
//
//        if(giftpackageSync.getGenerateType()==1){
//            giftpackageSync.setGenerateType2("同一类型只能使用1个卡号");
//        }else if(giftpackageSync.getGenerateType()==2){
//            giftpackageSync.setIsActivation2("同一类型可以使用多个激活码");
//        }else if(giftpackageSync.getGenerateType()==3){
//            giftpackageSync.setIsActivation2("特殊礼包");
//        }
//
//        List<GiftpackageSync> list=new ArrayList<>();
//        list.add(giftpackageSync);
//        ExcelExportUtil eu=new ExcelExportUtil();
//        File file = new File(filename);
//        eu.export(file, list, title,GiftpackageSync.class);
//        HttpHeaders headers = new HttpHeaders();
//        String fileName2;
//        byte[] body= new byte[0];
//        try {
//            if(isMSBrowser(request)){
//                fileName2 = URLEncoder.encode(filename, "UTF-8");
//            }else{//如果是谷歌、火狐则解析为ISO-8859-1
//                fileName2 = new String(filename.getBytes("UTF-8"), "iso-8859-1");
//            }
//            headers.setContentDispositionFormData("attachment", fileName2);
//            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//            body = FileUtils.readFileToByteArray(file);
//            // 删除临时文件
//            file.delete();
//        }catch (UnsupportedEncodingException e){
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return new ResponseEntity<>(body, headers, HttpStatus.OK);
        return null;
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


    //当前在线
    @RequestMapping(value = "/now", method = {RequestMethod.GET, RequestMethod.POST})
    public Response onlineNow(OnlineNowSearchQuery query) {
        Page<OnlineNow> onlineNowPage = onlineNowService.searchPage(query);
        return new Response("online/now")
                .request(query)
                .data("list", onlineNowPage);
    }

    //区服综合在线
    @RequestMapping(value = "/server", method = {RequestMethod.GET, RequestMethod.POST})
    public Response queryServerNow(IntegratedOnlineServiceSearchQuery query) {
        Page<com.luckygames.wmxz.gamemaster.model.entity.IntegratedOnlineService> integratedOnlineServicePage = integratedOnlineServiceService.searchPage(query);
        return new Response("online/server")
                .request(query)
                .data("list", integratedOnlineServicePage);
    }
}
