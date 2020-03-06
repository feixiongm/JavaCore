package com.imooc.homework;

import com.imooc.set.Cat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Student one = new Student(1,"Tom",87);
        Student two = new Student(2,"Lucy", 95);
        Student three = new Student(3,"William", 65);
        Set<Student> set = new HashSet<Student>();
        set.add(one);
        set.add(two);
        set.add(three);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("************************");
        if(set.contains(one)){
            System.out.println("yes");
            System.out.println(one);
        }else{
            System.out.println("no");
        }

        boolean flag = false;
        iterator = set.iterator();
        Student stu = null;
        while(iterator.hasNext()){
            stu = (Student) iterator.next();
            if(stu.getName().equals("Lucy")){
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println(stu);
    }
}
