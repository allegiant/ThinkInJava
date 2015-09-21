package com.xuyongjin.music;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class WoodWind extends Wind{
    @Override
    public void paly() {
        System.out.println("WoodWind.play()");
    }

    @Override
    public String what() {
        return "WoodWind";
    }
}
