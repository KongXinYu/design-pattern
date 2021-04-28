package com.wzy.design.pattern.creational.abstractfactory.v1;

/**
 * @description: 界面皮肤工厂接口：抽象工厂
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public interface SkinFactory {

    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();

}
