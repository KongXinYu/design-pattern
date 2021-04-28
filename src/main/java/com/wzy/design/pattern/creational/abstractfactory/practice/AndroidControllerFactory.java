package com.wzy.design.pattern.creational.abstractfactory.practice;

/**
 * @description: 安卓系统工厂类： 具体工厂
 * @author: WuZY
 * @time: 2021/4/28 0028
 */
public class AndroidControllerFactory implements ControllerFactory{
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
