package com.imooc.homework;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee one = new Employee(1, "a", 10);
        Employee two = new Employee(2, "b", 20);
        Employee three = new Employee(3, "c", 30);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName() + "    " + list.get(i).getSalary());
        }

    }
}
