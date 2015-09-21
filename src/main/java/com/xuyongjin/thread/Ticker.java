package com.xuyongjin.thread;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 许勇进 on 2015-9-16.
 */
public class Ticker extends Thread{

    private Button b = new Button("Toggle");
    private TextField t = new TextField(10);
    private int count = 0;
    private boolean runFlag = true;

    public Ticker(Container c) {
       b.addActionListener(new ToggleL());
        Panel p = new Panel();
        p.add(t);
        p.add(b);
        c.add(p);
    }

    class ToggleL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            runFlag = !runFlag;
        }
    }

    @Override
    public void run() {
        while (true) {
            if (runFlag) {
                t.setText(Integer.toString(count++));
            }
            try {
                sleep(100);
            }catch (InterruptedException e) {}

        }
    }
}
