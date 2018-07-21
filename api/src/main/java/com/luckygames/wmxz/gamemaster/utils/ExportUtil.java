package com.luckygames.wmxz.gamemaster.utils;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @作者 周聪
 * @时间 2018/7/18 15:34
 */
public class ExportUtil {
    public static byte[] exportExcel(String filename, HttpServletRequest request, File file, HttpHeaders headers, byte[] body) {
        String fileName2;
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

    //判断是否是IE浏览器
    private static boolean isMSBrowser(HttpServletRequest request) {
        String[] IEBrowserSignals = {"MSIE", "Trident", "Edge"};
        String userAgent = request.getHeader("User-Agent");
        for (String signal : IEBrowserSignals) {
            if (userAgent.contains(signal)){
                return true;
            }
        }
        return false;
    }
}
