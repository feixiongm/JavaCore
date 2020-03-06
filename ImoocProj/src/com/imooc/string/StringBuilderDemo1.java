package com.imooc.string;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("你好");
        str.append(",imooc");
        System.out.println(str);
        //把imooc编程IMOOC
        //两种方法，
        //1，使用delete删除imooc，再插入IMOOC；
        System.out.println(str.delete(4,8).insert(4,"MOOC"));
        //2,使用replace方法直接替换
        System.out.println(str.replace(4,8,"MOOC"));
        System.out.println(str.substring(0,3));
    }
}
