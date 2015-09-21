package com.xuyongjin.music;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class Wind extends Instrument{
    @Override
    public void paly() {
        System.out.println("Wind.play()");
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}
