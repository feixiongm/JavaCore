package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CatTest {
    public static void main(String[] args) {
        Cat huahua = new Cat("huahua", 5, "duan mao mao");
        Cat fanfan = new Cat("fanfan", 2,"tian yuan mao");
        Cat maomao = new Cat("maomao", 3, "tian yuan mao");
        List<Cat> catList = new ArrayList<Cat>();
        catList.add(huahua);
        catList.add(fanfan);
        catList.add(maomao);
        System.out.println("排序前： ");
        for(Cat n : catList){
            System.out.println(n + " ");
        }
        System.out.println(catList);
        System.out.println("排序后：");
        Collections.sort(catList, new NameComparator());
        //catList.sort(new NameComparator());
        System.out.println(catList);
        Collections.sort(catList, new AgeComparator());
        System.out.println(catList);
    }
}
