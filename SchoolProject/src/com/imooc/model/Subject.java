package com.imooc.model;

import com.sun.codemodel.internal.JMethod;

public class Subject {
    //Subject name, number, year, amount of students;
    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    private Student[] myStudents;
    private int studentNum;

    //no argument constructor
    public Subject() {

    }

    //constructors about the subject name, subject number, subject life;
    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    //all the information of students
    public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
        this.setMyStudents(myStudents);
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    //set Life must > 0
    public void setSubjectLife(int subjectLife) {
        if (subjectLife <= 0) return;
        this.subjectLife = subjectLife;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    //get the student info of subject, if there is no array of student, create a new array.the length is 200
    public Student[] getMyStudents() {
        if (myStudents == null)
            this.myStudents = new Student[200];
        return myStudents;
    }

    public void setMyStudents(Student[] myStudents) {
        this.myStudents = myStudents;
    }
//    Subject introduction method
//    return info of Subject information,include Subject, number, life

    public String info() {
        String str = "Subject information is here: \n" +
                "Subject name: " + this.getSubjectName() +
                "\nSubject number: " + this.getSubjectNo() + "" +
                "\nSubject life: " + this.getSubjectLife() + " years";
        return str;
    }

    public void addStudent(Student stu) {
        // 1.save the students info into array
        // 2.save the number of students into studentNum

        // 1.save the students info into array
        for (int i = 0; i < this.getMyStudents().length; i++) {
            if (this.getMyStudents()[i] == null) {
                stu.setStudentSubject(this);
                this.getMyStudents()[i] = stu;
                // 2.save the number of students into studentNum
                this.studentNum = i + 1;
                return;
            }
        }

    }

}
