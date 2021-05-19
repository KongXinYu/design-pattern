package com.wzy.design.pattern.creational.prototype.v2;

/**
 * 抽象公文接口，也可定义为抽象类，提供clone()方法的实现，
 * 将业务方法申明为抽象方法
 * @author: WuZY
 * @time: 2021/05/18
 */
public interface OfficialDocument extends Cloneable {

    public OfficialDocument clone();

    public void display();
}
