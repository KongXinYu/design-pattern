package com.wzy.design.pattern.creational.simplefactory.v2;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class Client {

    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("pie");
        chart.display();
        chart = ChartFactory.getChart("histogram");
        chart.display();
    }
}
