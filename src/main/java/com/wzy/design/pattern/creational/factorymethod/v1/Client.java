package com.wzy.design.pattern.creational.factorymethod.v1;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        factory = new DatabaseLoggerFactory();
        factory.writeLog();
        factory = new FileLoggerFactory();
        factory.writeLog();
    }
}
