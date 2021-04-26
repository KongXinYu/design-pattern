package com.wzy.design.pattern.creational.factorymethod.v1;

/**
 * @description: 文件日志记录器：具体产品
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
