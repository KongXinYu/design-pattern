package com.wzy.design.pattern.creational.builder.v1;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/6/28 0028
 */
public abstract class ActorBuilder {

    Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor createActor() {
        return actor;
    }

}
