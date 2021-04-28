package com.wzy.design.pattern.creational.abstractfactory.practice;

/**
 * @description: 安卓游戏界面控制类： 具体产品
 * @author: WuZY
 * @time: 2021/4/28 0028
 */
public class AndroidInterfaceController implements InterfaceController{
    @Override
    public void display() {
        System.out.println("显示安卓游系界面控制!");
    }
}
