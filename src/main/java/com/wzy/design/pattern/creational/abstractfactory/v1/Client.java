package com.wzy.design.pattern.creational.abstractfactory.v1;

import com.wzy.design.pattern.utils.XmlUtil;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/4/27 0027
 */
public class Client {

    public static void main(String[] args) {
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory) XmlUtil.getFristBean("config.xml", "skinFactory");
//        factory = new SpringSkinFactory();
        bt = factory.createButton();
        bt.display();
        tf = factory.createTextField();
        tf.display();
        cb = factory.createComboBox();
        cb.display();
    }
}
