package com.wzy.design.pattern.creational.builder.v2;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/6/29 0029
 */
public class PlayerController {

    public Player construct(PlayerBuilder builder) {
        builder.buildMenu();
        builder.buildPalylist();
        builder.buildMainWindows();
        builder.buildControlStrip();
        return builder.createPlayer();
    }
}
