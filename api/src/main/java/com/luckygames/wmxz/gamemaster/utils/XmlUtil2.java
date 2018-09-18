package com.luckygames.wmxz.gamemaster.utils;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.ResourceUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * xml工具类,依赖于dom4j解析
 *
 * @作者 周聪
 * @时间 2018/9/14 21:41
 */
public class XmlUtil2 {

    protected static final Logger logger = LoggerFactory.getLogger(XmlUtil2.class);

    public static Map<Integer, Map<String, String>> toMap() {
        HashMap var1 = new HashMap();
        DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
        Document var5 = null;
        try {
            DocumentBuilder var3 = var2.newDocumentBuilder();
            ClassPathResource resource = new ClassPathResource("GoodsConfig.xml");//jar包必须使用classpath
            InputStream inputStream = resource.getInputStream();//jar包必须必须使用流

            var5 = var3.parse(inputStream);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        Element var6 = var5.getDocumentElement();
        NodeList var7 = var6.getChildNodes();

        for (int var8 = 0; var8 < var7.getLength(); ++var8) {
            Node var9 = var7.item(var8);
            if (var9.getNodeType() == 1) {
                HashMap var10 = new HashMap();
                int var11 = 0;
                NodeList var12 = var9.getChildNodes();

                for (int var13 = 0; var13 < var12.getLength(); ++var13) {
                    Node var14 = var12.item(var13);
                    if (var14.getNodeType() == 1) {
                        if (var14.getNodeName().startsWith("id")) {
                            var11 = Integer.valueOf(var14.getTextContent().trim());
                        }

                        var10.put(var14.getNodeName().trim(), var14.getTextContent().trim());
                    }
                }

                var1.put(var11, var10);
            }
        }
        return var1;
    }
}