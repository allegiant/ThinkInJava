package com.xuyongjin.music;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class Percussion extends Instrument{
    @Override
    public void paly() {
        System.out.println("Percussion.play()");
    }

    @Override
    public String what() {
       return "Percussion";
    }

    @Override
    public void adjust() {

    }
}
