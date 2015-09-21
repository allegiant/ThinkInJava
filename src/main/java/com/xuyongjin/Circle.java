package com.xuyongjin;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    void erase() {
       System.out.println("Circle.erase()");
    }
}
