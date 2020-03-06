package com.imooc.string;

public class StringDemo5 {
    public static void main(String[] args) {
        //定义三个字符串，内容都是imooc
        String str1 = "imooc";
        String str2 = "imooc";
        String str3 = new String("imooc");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println((str1.equals(str2)));
        System.out.println((str1.equals(str3)));
    }
}
