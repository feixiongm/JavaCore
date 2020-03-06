package com.imooc.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = new String("JAVA编程基础，我喜欢JAVA编程");
        System.out.println(str.indexOf('J'));
        System.out.println(str.indexOf("AVA"));
        System.out.println(str.lastIndexOf("AVA"));
        System.out.println(str.lastIndexOf('J'));
    }
}
