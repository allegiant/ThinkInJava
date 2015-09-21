package com.xuyongjin.music;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class Music {
    static void tune(Instrument i) {
        i.paly();
        i.adjust();
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument ins:e) {
            tune(ins);
        }
    }

    public static void main(String[] args) {
        Instrument[] ins = new Instrument[5];
        int i = 0;
        ins[i++] = new Wind();
        ins[i++] = new Percussion();
        ins[i++] = new Stringed();
        ins[i++] = new Brass();
        ins[i++] = new WoodWind();
        tuneAll(ins);
    }
}
