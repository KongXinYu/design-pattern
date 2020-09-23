package com.wzy.design.pattern.structural.decorator.v1;
/**
 *
 *煎饼加蛋
 *@author: WuZY
 *@time: 2020/9/22 0022 下午 5:05
 *
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getDesc() {
        return super.getDesc() + "加个蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
