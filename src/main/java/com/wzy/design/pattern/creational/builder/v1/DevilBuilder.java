package com.wzy.design.pattern.creational.builder.v1;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/6/28 0028
 */
public class DevilBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }
}
