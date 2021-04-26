package com.wzy.design.pattern.creational.simplefactory.practice;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class Rectangle extends Graph{

    @Override
    public void draw() {
        System.out.println("绘制长方形...");
    }

    @Override
    public void erase() {
        System.out.println("擦除长方形...");
    }
}
