package com.imooc.set;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        //用ArrayList存储编程语言的名称，并输出
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Go");
        list.add("swift");
        //输出列表中元素的个数
        System.out.println("列表中元素个数为: " + list.size());
        System.out.println("***********************");
        for(String a : list){
            System.out.print(a + " ");
        }
        System.out.println();
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.remove("C++");
        System.out.println("***********************");
        System.out.println("移除C++以后的");
        for(String a : list){
            System.out.print(a + " ");
        }
    }
}
