package com.wzy.design.pattern.creational.simplefactory.v2;

/**
 * 饼状图类：具体产品类
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class PieChart implements  Chart {

    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}
