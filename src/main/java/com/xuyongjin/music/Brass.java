package com.xuyongjin.music;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class Brass extends Wind{
    @Override
    public void paly() {
        System.out.println("Brass.play()");
    }

    @Override
    public void adjust() {
       System.out.println("Brass.adjust()");
    }
}
