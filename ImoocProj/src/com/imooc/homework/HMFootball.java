package com.imooc.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HMFootball {
    public static void main(String[] args) {
        HashMap<Integer,String> football = new HashMap<>();
        football.put(2014,"deguo");
        football.put(2010,"xibanya");
        football.put(2006,"yidali");
        System.out.println("使用iterator方式进行输出");
        Iterator<String> iterator = football.values().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("使用EntrySet进行输出");

        Set<Map.Entry<Integer,String>> set = football.entrySet();
        for(Map.Entry<Integer,String> entry : set){
            System.out.println(entry);
        }

    }
}
