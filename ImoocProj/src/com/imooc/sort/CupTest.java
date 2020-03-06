package com.imooc.sort;

public class CupTest {
    public static void main(String[] args) {
        Gaizi gaizi1 = new Gaizi("blue");
        BeiShen beishen1 = new BeiShen(10);
        Cup cup1 = new Cup(gaizi1, beishen1, 100,80);
        System.out.println(cup1.getGaizi().getColor());
        System.out.println(cup1.getBeiShen().getWeight());
        cup1.pullWater(20);
    }
}
