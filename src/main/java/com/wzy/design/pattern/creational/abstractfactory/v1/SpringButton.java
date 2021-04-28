package com.wzy.design.pattern.creational.abstractfactory.v1;

/**
 * @description: spring 按钮类： 具体产品
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示绿色按钮");
    }
}
