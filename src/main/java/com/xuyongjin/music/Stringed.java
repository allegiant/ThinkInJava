package com.xuyongjin.music;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class Stringed extends Instrument{
    @Override
    public void paly() {
        System.out.println("Stringed.play()");
    }

    @Override
    public String what() {
       return "Stringed";
    }

    @Override
    public void adjust() {

    }
}
