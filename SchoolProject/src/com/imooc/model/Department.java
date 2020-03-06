package com.imooc.model;

public class Department {
    private String departmentNo;
    private String departmentName;
    private Employee[] myEmploy;
    private int employeeNum1;

    public Department() {
    }

    public Department(String departmentNo, String departmentName) {
        this.setDepartmentNo(departmentNo);
        this.setDepartmentName(departmentName);
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getMyEmploy() {
        if (myEmploy == null)
            this.myEmploy = new Employee[200];
        return myEmploy;
    }

    public void setMyEmploy(Employee[] myEmploy) {
        this.myEmploy = myEmploy;
    }

    public int getEmployeeNum1() {
        return employeeNum1;
    }

    public void setEmployeeNum1(int employeeNum1) {
        this.employeeNum1 = employeeNum1;
    }

    public void addEmployee(Employee emp) {

        for (int i = 0; i < getMyEmploy().length; i++) {
            if (myEmploy[i] == null && emp.getDepartmentInfo().getDepartmentName() == "Personnel Department") {
                this.getMyEmploy()[i] = emp;
                employeeNum1++;
                return;
            }


        }
    }

}
