package com.wzy.design.pattern.creational.abstractfactory.v1;

/**
 * @description: summer 文本框：具体产品
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示蓝色边框");
    }
}
