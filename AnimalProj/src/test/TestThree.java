package test;

import animal.Animal;

public class TestThree {
    public static void main(String[] args){
        Animal one = new Animal("花花",2);
        Animal two = new Animal("花花",2);
        //equals
        boolean flag = one.equals(two);
        System.out.println(flag);
        System.out.println(one == two);
        System.out.println("==============================");
        String str1 = new String("hello");
        String str2 = new String("hello");
        flag = str1.equals(str2);
        System.out.println(flag);
        System.out.println(str1 == str2);
        String str3 = "hello";
        String str4 = "hello";
        flag = str3.equals(str4);
        System.out.println(flag);
        System.out.println("==============================");
        System.out.println(one.toString());
        System.out.println(one);
    }
}
