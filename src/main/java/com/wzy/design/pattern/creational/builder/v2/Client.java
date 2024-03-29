package com.wzy.design.pattern.creational.builder.v2;

import com.wzy.design.pattern.utils.XmlUtil;

/**
 * <p>
 *     Sunny软件公司欲开发一个视频播放软件，为了给用户使用提供方便，
 *     该播放软件提供多种界面显示模式，如完整模式、精简模式、记忆模式、网络模式等。
 *     在不同的显示模式下主界面的组成元素有所差异，如在完整模式下将显示菜单、
 *     播放列表、主窗口、控制条等，在精简模式下只显示主窗口和控制条，
 *     而在记忆模式下将显示主窗口、控制条、收藏列表等。
 *     尝试使用建造者模式设计该软件。
 * </p>
 *
 * @author WuZhenYu
 * @since 2021/6/29 0029
 */
public class Client {


    public static void main(String[] args) {
        PlayerBuilder builder = XmlUtil.getFristBean("config.xml", "playerBuilder");
        PlayerController pc = new PlayerController();
        Player player = pc.construct(builder);

    }
}
