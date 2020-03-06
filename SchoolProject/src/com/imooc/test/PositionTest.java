package com.imooc.test;

import com.imooc.model.Department;
import com.imooc.model.Employee;
import com.imooc.model.Position;
import sun.print.PSPrinterJob;

public class PositionTest {
    public static void main(String[] args) {
        Department dep1 = new Department("D001", "Personnel Department");
        Department dep2 = new Department("D001", "Marketing");
        Position pos1 = new Position("P001", "Manager");
        Position pos2 = new Position("P002", "assistant Manager");
        Position pos3 = new Position("P003", "Staff");
        Employee emp1 = new Employee("Ming", "S001", 29, "male", dep1, pos1);
        Employee emp2 = new Employee("AIai", "S002", 21, "female", dep1, pos2);
        Employee emp3 = new Employee("Chao", "S003", 29, "male", dep1, pos3);
        Employee emp4 = new Employee("Meimei", "S004", 26, "female", dep2, pos3);
        Employee emp5 = new Employee("Di", "S005", 37, "male", dep2, pos1);
        Employee emp6 = new Employee("Li", "S006", 24, "female", dep2, pos3);

        System.out.println(emp1.introduction());
        System.out.println("================================");
        System.out.println(emp2.introduction());
        System.out.println("================================");
        System.out.println(emp3.introduction());
        System.out.println("================================");
        System.out.println(emp4.introduction());
        System.out.println("================================");
        System.out.println(emp5.introduction());
        System.out.println("================================");
        System.out.println(emp6.introduction());
        System.out.println("================================");
        dep1.addEmployee(emp1);
        dep1.addEmployee(emp2);
        dep1.addEmployee(emp3);
        dep1.addEmployee(emp4);
        dep1.addEmployee(emp5);
        dep1.addEmployee(emp6);
        System.out.println(dep1.getEmployeeNum1());
    }
}
