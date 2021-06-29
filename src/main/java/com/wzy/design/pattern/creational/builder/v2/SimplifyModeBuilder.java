package com.wzy.design.pattern.creational.builder.v2;

/**
 * <p> </p>
 *
 * @author WuZhenYu
 * @since 2021/6/29 0029
 */
public class SimplifyModeBuilder extends PlayerBuilder {
    @Override
    public void buildMenu() {

    }

    @Override
    public void buildPalylist() {

    }

    @Override
    public void buildMainWindows() {
        System.out.println("显示主窗口");
    }

    @Override
    public void buildControlStrip() {
        System.out.println("显示控制条");
    }
}
