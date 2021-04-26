package com.wzy.design.pattern.creational.factorymethod.v1;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
