package com.imooc.set;

import java.util.*;

public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String,String> animal = new HashMap<String,String>();
        System.out.println("输入三组单词的注释，并存放到HashMap中");
        Scanner console = new Scanner(System.in);
        //insert key,value
        int i = 0;
        while(i < 3){
            System.out.println("请输入K值: ");
            String key = console.next();
            System.out.println("请输入Value值: ");
            String value = console.next();
            animal.put(key,value);
            i++;
        }

        //print Value by using iterator
        System.out.println("*********************");
        System.out.println("使用迭代器输出所有的Value: ");

        Iterator<String> iterator = animal.values().iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
        System.out.println("*********************");
        //打印输出key和value的值
        //通过entrySet方法完成
        System.out.println("通过entrySet方法得到key-value: ");
        Set<Map.Entry<String, String>> entrySet =animal.entrySet();
        for(Map.Entry<String, String> entry : entrySet){
            System.out.print(entry.getKey() + "-");
            System.out.println(entry.getValue());
        }
        //通过单词找到注释并输出
        //通过keySet方法
        System.out.println("请输入要查找的单词");
        String strSearch = console.next();
        //1,取得keySet
        Set<String> keySet = animal.keySet();
        //2,遍历keySet
        boolean flag = false;
        String s = null;
        for(String key : keySet) {
            if (strSearch.equals(key)) {
                flag = true;
                s = key;
                //System.out.println("意思是: " + animal.get(key));
                break;
            }
        }
            if(flag){
                System.out.println(s + "的意思是" + animal.get(s));
            }else{
                System.out.println("没有这个单词");
            }

    }
}
