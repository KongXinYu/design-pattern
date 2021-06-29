package com.wzy.design.pattern.creational.builder.v2;

/**
 * <p>  </p>
 *
 * @author WuZhenYu
 * @since 2021/6/29 0029
 */
public abstract class PlayerBuilder {

    private Player player = new Player();

    public Player createPlayer() {
        return player;
    }

    public abstract void buildMenu();

    public abstract void buildPalylist();

    public abstract void buildMainWindows();

    public abstract void buildControlStrip();

}
