package com.wzy.design.pattern.creational.simplefactory.v1;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public abstract class Product {

    // 所有产品类的公共业务方法
    public void methodSame() {
        // 公共方法的实现
    }

    // 声明抽象业务方法，需要子类实现的方法
    public abstract void methodDiff();

}
