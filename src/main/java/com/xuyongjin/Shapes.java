package com.xuyongjin;

/**
 * Created by 许勇进 on 2015-9-15.
 */
public class Shapes {
    public static Shape randShape() {
        switch ( (int) (Math.random() * 3)) {
           default:
            case 0:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();
        }
    }

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i=0;i<s.length;i++) {
            s[i] = randShape();
        }
        for (int i=0;i<s.length;i++) {
            s[i].draw();
        }
    }
}
