package com.wzy.design.pattern.structural.decorator.v2;/**
 * @description:
 * @author: Administrator
 * @time: 2020/9/22 0022 下午 5:01
 */

/**
 *
 *普通的煎饼类
 *@author: WuZY
 *@time: 2020/9/22 0022 下午 5:01
 *
 */
public class Battercake extends ABattercake {

    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 8;
    }
}
