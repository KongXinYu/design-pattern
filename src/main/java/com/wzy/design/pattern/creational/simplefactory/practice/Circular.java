package com.wzy.design.pattern.creational.simplefactory.practice;

/**
 * @description: 圆形
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class Circular extends Graph {
    @Override
    public void draw() {
        System.out.println("绘制圆形...");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形...");
    }
}
