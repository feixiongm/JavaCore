package com.imooc.model;

import com.sun.deploy.security.SelectableSecurityManager;

public class Employee {

    private String employeeName;
    private String employeeNo;
    private int employeeAge;
    private String employeeGender;
    private Department departmentInfo;
    private Position positionInfo;

    public Employee() {

    }

    public Employee(String employeeName, String employeeNo, int employeeAge, String employeeGender, Department departmentInfo, Position positionInfo) {
        this.setEmployeeName(employeeName);
        this.setEmployeeNo(employeeNo);
        this.setEmployeeAge(employeeAge);
        this.setEmployeeGender(employeeGender);
        this.setDepartmentInfo(departmentInfo);
        this.setPositionInfo(positionInfo);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        if (employeeAge <= 18 || employeeAge >= 65) {
            this.employeeAge = 18;
        } else {
            this.employeeAge = employeeAge;
        }
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        if (employeeGender == "male" || employeeGender == "female")
            this.employeeGender = employeeGender;
        else
            this.employeeGender = "male";
    }

    public Department getDepartmentInfo() {
        return departmentInfo;
    }

    public void setDepartmentInfo(Department departmentInfo) {
        this.departmentInfo = departmentInfo;
    }

    public Position getPositionInfo() {
        return positionInfo;
    }

    public void setPositionInfo(Position positionInfo) {
        this.positionInfo = positionInfo;
    }
    public String introduction(){
        String str;
        str = "Name: " + this.getEmployeeName() + "\nPosition Number: " + this.getEmployeeNo() +
                "\nGender: " + this.getEmployeeGender() + "\nAge: " + this.getEmployeeAge() + "\nPosition: " + this.departmentInfo.getDepartmentName() +" " + this.positionInfo.getPositionName();
    return str;
    }

}
