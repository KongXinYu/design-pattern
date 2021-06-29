package com.wzy.design.pattern.creational.builder.v1;

import com.wzy.design.pattern.utils.XmlUtil;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/6/28 0028
 */
public class Client {

    public static void main(String[] args) {
        ActorBuilder ab = XmlUtil.getFristBean("config.xml", "builder");
        ActorController ac = new ActorController();
        Actor actor = ac.construct(ab);

        String  type = actor.getType();
        System.out.println(type  + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }
}
