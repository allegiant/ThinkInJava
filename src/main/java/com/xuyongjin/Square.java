package com.xuyongjin;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    void erase() {
       System.out.println("Square.erase()");
    }
}
