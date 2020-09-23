package com.wzy.design.pattern.structural.decorator.v2;/**
 * @description:
 * @author: Administrator
 * @time: 2020/9/23 0023 上午 8:24
 */

/**
 *
 *@description:
 *@author: WuZY
 *@time: 2020/9/23 0023 上午 8:24
 *
 */
public class EggDecorator extends ABattercakeDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    public void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
