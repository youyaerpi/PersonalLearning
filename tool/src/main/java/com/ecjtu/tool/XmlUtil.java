package com.ecjtu.tool;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * xml解析工具
 *
 * @author xiexiang
 * @date 2019/11/15 5:16 下午
 */

public class XmlUtil {


    public static   Map<String,String> getObjectByXml(String xml, String charset) {
        Map<String, String> map = Maps.newHashMap();
        //new SAX解析器
        SAXReader reader = new SAXReader(false);
        //将xml变成字节流
        InputSource source = new InputSource(new ByteArrayInputStream(xml.getBytes()));
        source.setEncoding(charset);
        try {
            //获得模型对象
            Document document = reader.read(source);
            List elements = document.getRootElement().elements();
            Element o = (Element)elements.get(0);
            List<Element> elementList= new ArrayList<>(elements.size());
            for (Object element : elements) {
                elementList.add((Element)element);
            }
            elementList.forEach(element -> map.put(element.getName(),element.getStringValue()));
            return map;

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String xml="<xml><return_code><![CDATA[FAIL]]></return_code>\n" + "<return_msg><![CDATA[System Error]]></return_msg>\n" + "<err_code><![CDATA[POST_DATA_EMPTY]]></err_code>\n" + "<err_code_des><![CDATA[post data empty.]]></err_code_des>\n" + "</xml>";

        Map<String, String> objectByXml = getObjectByXml(xml, "utf-8");
        System.out.println(JSONObject.toJSONString(objectByXml));
    }
}
