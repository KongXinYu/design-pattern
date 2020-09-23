package com.wzy.design.pattern.structural.decorator.v2;
/**
 *
 *@description:
 *@author: WuZY
 *@time: 2020/9/23 0023 上午 8:17
 *
 */
public abstract class ABattercakeDecorator extends ABattercake{

    private ABattercake aBattercake;

    public ABattercakeDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    public abstract void doSomething();

    @Override
    protected String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return aBattercake.cost();
    }
}
