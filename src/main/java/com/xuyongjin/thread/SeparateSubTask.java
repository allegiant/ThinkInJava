package com.xuyongjin.thread;

/**
 * Created by 许勇进 on 2015-9-16.
 */
public class SeparateSubTask extends Thread{
    private int count = 0;
    private Counter c2;
    private boolean runFlag = true;

    public SeparateSubTask(Counter c2) {
        this.c2 = c2;
        start();
    }

    public void invertFlag() {runFlag = !runFlag;}
    @Override
    public void run() {
        while (true) {
            try {
                sleep(100);
            }catch (InterruptedException e){}
            if (runFlag) {
                c2.t.setText(Integer.toString(count++));
            }
        }
    }
}
