package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {

        Goods g1 = new Goods("01", "phone", 2000);
        Goods g2 = new Goods("02", "freezer", 5000);
        Goods g3 = new Goods("03", "TV", 3000);
        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(g1);
        goodsList.add(g2);
        goodsList.add(g3);
        System.out.println("排序前： ");
        for(Goods n : goodsList){
            System.out.println(n);
        }

        System.out.println("排序后： ");
        Collections.sort(goodsList);
        for(Goods n : goodsList){
            System.out.println(n);
        }

    }
}
