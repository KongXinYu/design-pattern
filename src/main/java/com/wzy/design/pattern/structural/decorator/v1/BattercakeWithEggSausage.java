package com.wzy.design.pattern.structural.decorator.v1;
/**
 *
 *@description:
 *@author: WuZY
 *@time: 2020/9/22 0022 下午 5:07
 *
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    protected String getDesc() {
        return super.getDesc() + "加根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 4;
    }
}
