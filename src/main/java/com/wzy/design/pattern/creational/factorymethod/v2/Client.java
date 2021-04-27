package com.wzy.design.pattern.creational.factorymethod.v2;

import com.wzy.design.pattern.creational.factorymethod.v1.Logger;
import com.wzy.design.pattern.creational.factorymethod.v1.LoggerFactory;
import com.wzy.design.pattern.creational.simplefactory.v1.Factory;
import com.wzy.design.pattern.utils.XmlUtil;

/**
 * @description:
 * 通过xml配置 生成的Loggerfactory
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class Client {

    public static void main(String[] args) {
        LoggerFactory factory = (LoggerFactory) XmlUtil.getFristBean("config.xml", "className");
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
