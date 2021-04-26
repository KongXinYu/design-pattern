package com.wzy.design.pattern.creational.simplefactory.v2;

/**
 * 柱状图类：具体产品类
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class HistogramChart implements  Chart {

    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}
