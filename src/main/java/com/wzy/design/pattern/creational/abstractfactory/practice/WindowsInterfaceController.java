package com.wzy.design.pattern.creational.abstractfactory.practice;

/**
 * @description: 微软手机游戏界面控制类：具体产品
 * @author: WuZY
 * @time: 2021/4/28 0028
 */
public class WindowsInterfaceController implements InterfaceController{

    @Override
    public void display() {
        System.out.println("显示微软手机游戏界面控制！");
    }
}
