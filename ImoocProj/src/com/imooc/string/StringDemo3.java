package com.imooc.string;

public class StringDemo3 {
    public static void main(String[] args) {
        //字符串和byte数组之间的相互转换
        String str = new String("JAVA 编程 基础");
        byte[] arrs = str.getBytes();
        for (byte arr : arrs) {
            System.out.print(arr + " ");
        }
        System.out.println();
        String str1 = new String(arrs);
        System.out.println(str1);
        //System.out.println(arrs);
    }
}
