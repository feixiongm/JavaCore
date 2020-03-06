package test;

import fruit.Banana;
import fruit.Fruits;
import fruit.Waxberry;

public class TestFruit {
    public static void main(String[] args){
        Fruits one = new Fruits("方的","甜的");
        Fruits two = new Fruits("方的","甜的");
        one.eat();
        System.out.println(one.equals(two));
        Waxberry three =new Waxberry("圆的", "酸的","黑的");
        three.face();
        three.eat();
        three.toString();
        Banana four = new Banana("长的", "甜的", "芭蕉");
        four.advantage();
        four.advantage("黄的");

    }
}
