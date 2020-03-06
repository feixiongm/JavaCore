package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {
    public static void main(String[] args) {
        //添加英文单词到HashSet中
        Set<String> set = new HashSet<>();
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");
        Iterator<String> it = set.iterator();
        System.out.println();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("================================");
        set.add("green");
        set.add("black");
        it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
