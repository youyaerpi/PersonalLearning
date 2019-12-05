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


    public static Map<String, String> getObjectByXml (String xml, String charset) {
        Map<String, String> map = Maps.newHashMap();
        //new SAX解析器
        SAXReader reader = new SAXReader( false );
        //将xml变成字节流
        InputSource source = new InputSource( new ByteArrayInputStream( xml.getBytes() ) );
        source.setEncoding( charset );
        try {
            //获得模型对象
            Document document = reader.read( source );
            List elements = document.getRootElement().elements();
            List<Element> elementList = new ArrayList<>( elements.size() );
            for (Object element : elements) {
                elementList.add( (Element) element );
            }
            elementList.forEach( element -> map.put( element.getName(), element.getStringValue() ) );
            return map;

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }
}
