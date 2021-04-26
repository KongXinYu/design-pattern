package com.wzy.design.pattern.creational.simplefactory.v1;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/26 0026
 */
public class Factory {

    // 静态工厂方法
    public static Product getProduct(String arg){
        Product product = null;

        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            // 初始化设置product
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            // 初始化设置product
        }
        return product;
    }

}
