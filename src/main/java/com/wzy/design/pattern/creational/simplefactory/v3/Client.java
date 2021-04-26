package com.wzy.design.pattern.creational.simplefactory.v3;

import com.wzy.design.pattern.creational.simplefactory.v2.Chart;
import com.wzy.design.pattern.creational.simplefactory.v2.ChartFactory;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class Client {
    public static void main(String[] args) {
        // 读取配置文件中
        String type = XMLUtil.getCharType();
        // 创建产品对象
        Chart chart = ChartFactory.getChart(type);
        chart.display();
    }
}
