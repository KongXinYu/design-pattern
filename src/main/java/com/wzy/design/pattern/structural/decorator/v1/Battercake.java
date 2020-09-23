package com.wzy.design.pattern.structural.decorator.v1;

/**
 *
 *普通的煎饼类
 *@author: WuZY
 *@time: 2020/9/22 0022 下午 5:01
 *
 */
public class Battercake {

    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 8;
    }
}
