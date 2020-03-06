package com.imooc.test;

import com.imooc.model.Student;
import com.imooc.model.Subject;

public class SchoolTest {
    public static void main(String[] args) {
        //test Subject
        Subject sub1 = new Subject("Computer science", "J0001", 4);
        System.out.println(sub1.info());
        System.out.println("===============================");
        //test Student
        Student stu1 = new Student("S01", "Zhang San", "male", 18, sub1);
        System.out.println(stu1.introduction());
        System.out.println("===============================");
        Student stu2 = new Student("S02", "Li Si", "female", 17);
        System.out.println(stu2.introduction("Computer Science", 4));
        System.out.println("===============================");
        Student stu3 = new Student("S03", "Wang Wu", "male", 19);
        System.out.println(stu3.introduction(sub1));
        System.out.println("===============================");
        // To know how many students join the subject
        sub1.addStudent(stu1);
        sub1.addStudent(stu2);
        sub1.addStudent(stu3);
        System.out.println(sub1.getStudentNum());
    }
}
