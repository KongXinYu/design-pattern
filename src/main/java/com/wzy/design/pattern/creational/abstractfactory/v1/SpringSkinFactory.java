package com.wzy.design.pattern.creational.abstractfactory.v1;

/**
 * @description: spring 皮肤工厂：具体工厂
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class SpringSkinFactory implements SkinFactory{

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
