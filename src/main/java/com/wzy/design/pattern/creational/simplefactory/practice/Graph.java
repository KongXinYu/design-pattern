package com.wzy.design.pattern.creational.simplefactory.practice;

/**
 * 图形抽象类
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public abstract class Graph {
    /**
     * 绘制图形
     */
    public abstract void draw();

    /**
     * 擦除图形
     */
    public abstract void erase();

}

