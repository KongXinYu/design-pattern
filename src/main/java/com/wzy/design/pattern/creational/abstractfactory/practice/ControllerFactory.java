package com.wzy.design.pattern.creational.abstractfactory.practice;

/**
 * @description: 控制类工厂接口: 抽象工厂
 * @author: WuZY
 * @time: 2021/4/28 0028
 */
public interface ControllerFactory {

    public OperationController createOperationController();

    public InterfaceController createInterfaceController();
}
