package com.wzy.design.pattern.creational.abstractfactory.practice;

import com.wzy.design.pattern.utils.XmlUtil;

/**
 * @description:
 * Sunny软件公司欲推出一款新的手机游戏软件，该软件能够支持Symbian、
 * Android和Windows Mobile等多个智能手机操作系统平台，针对不同的手机操作系统，
 * 该游戏软件提供了不同的游戏操作控制(OperationController)类和
 * 游戏界面控制(InterfaceController)类，并提供相应的工厂类来封装这些类的初始化过程。
 * 软件要求具有较好的扩展性以支持新的操作系统平台，为了满足上述需求，
 * 试采用抽象工厂模式对其进行设计。
 * @author: WuZY
 * @time: 2021/4/28 0028
 */
public class Client {

    public static void main(String[] args) {
        ControllerFactory factory;

        factory = (ControllerFactory) XmlUtil.getFristBean("config.xml", "controllerFactory");

        InterfaceController interfaceController = factory.createInterfaceController();
        OperationController operationController = factory.createOperationController();

        interfaceController.display();
        operationController.display();

    }

}
