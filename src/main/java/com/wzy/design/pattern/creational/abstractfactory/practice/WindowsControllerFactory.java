package com.wzy.design.pattern.creational.abstractfactory.practice;

/**
 * @description: 微软控制类工厂：具体工厂
 * @author: WuZY
 * @time: 2021/4/28 0028
 */
public class WindowsControllerFactory implements ControllerFactory{

    @Override
    public OperationController createOperationController() {
        return new WindowsOperationController();
    }

    @Override
    public InterfaceController createInterfaceController() {
        return new WindowsInterfaceController();
    }
}
