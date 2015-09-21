package com.xuyongjin;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    void erase() {
        System.out.println("Triangle.erase()");
    }
}
