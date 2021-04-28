package com.wzy.design.pattern.creational.abstractfactory.v1;

/**
 * @description: summer 皮肤工厂：具体工厂
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class SummerSkinFactory implements SkinFactory{

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
