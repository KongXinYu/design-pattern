package com.wzy.design.pattern.creational.simplefactory.v2;

/**
 * 折线图类：具体产品类
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class LineChart implements  Chart {

    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}
