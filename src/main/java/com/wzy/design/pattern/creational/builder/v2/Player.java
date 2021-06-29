package com.wzy.design.pattern.creational.builder.v2;

/**
 * <p> 播放器 </p>
 *
 * @author WuZhenYu
 * @since 2021/6/29 0029
 */
public class Player {

    private String menu;

    private String playlist;

    private String mainWindows;

    private String controlStrip;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getMainWindows() {
        return mainWindows;
    }

    public void setMainWindows(String mainWindows) {
        this.mainWindows = mainWindows;
    }

    public String getControlStrip() {
        return controlStrip;
    }

    public void setControlStrip(String controlStrip) {
        this.controlStrip = controlStrip;
    }
}
