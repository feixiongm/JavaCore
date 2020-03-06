package com.imooc.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("blue");
        list.add("yellow");
        list.add("gray");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
