package com.wzy.design.pattern.structural.decorator.v2;
/**
 *
 * 本案例：在不修改Battercake类的情况下且不继承Battercake，为其附加了加鸡蛋加香肠等新的功能
 * 定义：在不改变原有对象的基础之上,将功能附加到对象上
 * 优点：
 * 1.继承的有力补充,比继承灵活,不改变原有对象的情况下给一个对象扩展功能
 * 2.通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同的效果
 * 3.符合开闭原则
 * 缺点:
 * 1.会出现更多的的代码，更多的类，增加程序的复杂性
 * 2.动态装饰时，多层装饰时会更复杂
 * 典型案例：java io
 *
 *@author: WuZY
 *@time: 2020/9/23 上午 8:29
 *
 */
public class Test {

    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println("煎饼材料：");
        System.out.println(aBattercake.getDesc());
        System.out.println("煎饼价格：" + aBattercake.cost());

    }
}
