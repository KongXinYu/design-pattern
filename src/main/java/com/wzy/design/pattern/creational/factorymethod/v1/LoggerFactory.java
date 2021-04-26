package com.wzy.design.pattern.creational.factorymethod.v1;

/**
 * @description: 日志记录器工厂接口：抽象工厂
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public abstract class LoggerFactory {
    public abstract Logger createLogger();
    /**
     * 在工厂类中直接调用日志记录器类的业务方法writeLog()
     */
    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }
}
