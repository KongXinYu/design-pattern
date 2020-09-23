package com.wzy.design.pattern.structural.decorator.v2;
/**
 *
 *@description:
 *@author: WuZY
 *@time: 2020/9/23 0023 上午 8:28
 *
 */
public class SausageDecorator extends ABattercakeDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    public void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 4;
    }
}
