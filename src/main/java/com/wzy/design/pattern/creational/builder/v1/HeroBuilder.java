package com.wzy.design.pattern.creational.builder.v1;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/6/28 0028
 */
public class HeroBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
    
}
