package com.wzy.design.pattern.creational.simplefactory.v3;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

/**
 * 创建具体Chart对象时，每更换一个Chart对象都需要修改客户端代码中
 * 静态工厂方法的参数，客户端代码将要重新编译，这对于客户端而言，
 * 违反了“开闭原则”， 我们可以从XML中读取
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class XMLUtil {

    // 该方法用于从XML配置文件中提取图表类型,并返回类型名
    public static String getCharType(){
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("simplefactory_config.xml"));

            // 获取包含图表类型的文本节点
            NodeList n1 = doc.getElementsByTagName("chartType");
            Node classNode = n1.item(0).getFirstChild();
            String charType = classNode.getNodeValue().trim();
            return charType;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
