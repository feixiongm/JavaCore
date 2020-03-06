package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IntSort {
    public static void main(String[] args) {
        //sort a list of Integer type
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(1);
        for(int a : list){
            System.out.print(a + "  ");
        }
        System.out.println();
        System.out.println("排序前的： " + list);
        Collections.sort(list);
        System.out.println("排序后的： " + list);
    }
}
