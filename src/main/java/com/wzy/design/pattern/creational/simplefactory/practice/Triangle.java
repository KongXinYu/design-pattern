package com.wzy.design.pattern.creational.simplefactory.practice;

/**
 * @description: 三角形
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class Triangle extends Graph {

    @Override
    public void draw() {
        System.out.println("绘制三角形...");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形...");
    }
}
