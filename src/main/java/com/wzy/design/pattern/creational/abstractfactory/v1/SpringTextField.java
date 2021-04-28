package com.wzy.design.pattern.creational.abstractfactory.v1;

/**
 * @description: spring 文本框：具体产品
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示绿色文本框");
    }
}
