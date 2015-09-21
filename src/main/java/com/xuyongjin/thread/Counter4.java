package com.xuyongjin.thread;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by 许勇进 on 2015-9-16.
 */
public class Counter4 extends Applet{
    private Button start = new Button("Start");
    private boolean started = false;
    private Ticker[] s;
    private boolean isApplet = true;
    private int size;

    @Override
    public void init() {
        if (isApplet) {
            size = Integer.parseInt(getParameter("size"));
        }
        s = new Ticker[size];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Ticker(this);
        }
        start.addActionListener(new StartL());
        add(start);
    }

    class StartL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!started) {
                started = true;
                for (int i = 0; i <s.length; i++) {
                    s[i].start();
                }
            }
        }
    }

    public static void main(String[] args) {
        Counter4 applet = new Counter4();
        applet.isApplet = false;
        applet.size = (args.length == 0?5 : Integer.parseInt(args[0]));
        Frame aFrame = new Frame("Counter4");
        aFrame.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
        aFrame.add(applet,BorderLayout.CENTER);
        aFrame.setSize(200,applet.size * 50);
        applet.init();
        applet.start();
        aFrame.setVisible(true);
    }
}
