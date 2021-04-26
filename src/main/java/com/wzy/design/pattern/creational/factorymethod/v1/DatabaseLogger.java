package com.wzy.design.pattern.creational.factorymethod.v1;

/**
 * @description: 数据库日志记录器：具体产品
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
