package com.imooc.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentTest {

    public static void main(String[] args) {
        SortStudent one = new SortStudent(40, "peter", 20);
        SortStudent two = new SortStudent(28,"angel", 5);
        SortStudent three = new SortStudent(35, "tom", 18);

        List<SortStudent> list = new ArrayList<SortStudent>();
        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println("排序前： ");
        for(SortStudent n : list){
            System.out.println(n);
        }
        System.out.println("排序后：");
        Collections.sort(list, new NameComparator());
        for(SortStudent n : list){
            System.out.println(n);
        }
    }
}
