package com.imooc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        Cat huahua = new Cat("huahua", 12, "duan mao");
        Cat fanfan = new Cat("fanfan", 3, "zhong hua tian yuan");
        Set<Cat> set = new HashSet<Cat>();
        set.add(huahua);
        set.add(fanfan);
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Cat huahua01 = new Cat("huahua", 12, "duan mao");
        set.add(huahua01);
        System.out.println("***********************");
        System.out.println("添加重复数据后的信息");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("***********************");

        Cat huahua02 = new Cat("huahua2", 2, "duan mao ");
        set.add(huahua02);
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //在set中查找花花的信息并输出
        if(set.contains(huahua)){
            System.out.println("huahua找到了");
            System.out.println(huahua);
        }else{
            System.out.println("没找到");
        }
        System.out.println();
        System.out.println("*********************");

        boolean flag = false;
        Cat c = null;
        it = set.iterator();
        while(it.hasNext()){
            c = it.next();
            if(c.getName().equals("huahua")){
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.println("找到了");
            System.out.println(c);
        }else{
            System.out.println("没找到");
        }
        System.out.println("**************************");

        //set.removeIf(cat -> "huahua2".equals(cat.getName()));

        for(Cat cat : set){
            if(cat.getName().equals("huahua"));
            set.remove(cat);
            break;
        }

        for(Cat cat : set){
            System.out.println(cat);
        }
        System.out.println("**************************");
        boolean flag1 = set.removeAll(set);
        if(flag1){
            System.out.println("delete all");
        }
    }
}
