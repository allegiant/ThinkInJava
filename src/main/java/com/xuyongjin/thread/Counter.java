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
public class Counter extends Applet{
    private static int count = 0;
    TextField t = new TextField(10);
    private SeparateSubTask sp = null;
    private Button onOff = new Button("Toggle"),start = new Button("Start");

    @Override
    public void init() {
        add(t);
        start.addActionListener(new StartL());
        add(start);
        onOff.addActionListener(new OnOffL());
        add(onOff);
    }

    class StartL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("开始被点击: " + count++);
            if (sp == null) {
                System.out.println("线程被创建: " + count);
                sp = new SeparateSubTask(Counter.this);
            }
        }
    }
    class OnOffL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (sp != null) {
                sp.invertFlag();
            }
        }
    }

    public static void main(String[] args) {
        Counter applet = new Counter();
        Frame aFrame = new Frame("Counter");
        aFrame.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
        aFrame.add(applet, BorderLayout.CENTER);
        aFrame.setSize(300, 200);
        applet.init();
        applet.start();
        aFrame.setVisible(true);
    }
}
