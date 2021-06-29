package com.wzy.design.pattern.utils;

import org.codehaus.jackson.sym.Name1;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.InputStream;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class XmlUtil {

    /**
     * 该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
     * @return
     */
    public static <T> T getFristBean(String path, String tagName) {
        NodeList nl = getNodeList(path, tagName);
        if (null == nl) {
            return null;
        }
        Node classNode = nl.item(0).getFirstChild();
        String cName = classNode.getNodeValue();

        // 通过类名生成实例对象并将其返回
        try {
            Class c = Class.forName(cName);
            T obj = (T) c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取xml文件中相应节点的信息
     * @param path
     * @param tagName
     * @return
     */
    public static NodeList getNodeList(String path, String tagName) {
        NodeList nl = null;
        // 创建DOM文档对象
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        try(InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(path)) {
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(inputStream);
            // 获取对应标签的文本节点
            nl = doc.getElementsByTagName(tagName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nl;
    }

}
