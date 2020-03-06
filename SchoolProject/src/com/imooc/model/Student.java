package com.imooc.model;

public class Student {
    //property: Student number, name, sex, age,Subject name
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;
    private Subject studentSubject;

    public Student() {
    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
    }

    //constructor
    public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
        this.setStudentSubject(studentSubject);
    }

    // Get the subject object, if there is no object, create object and return

    public Subject getStudentSubject() {
        if (this.studentSubject == null)
            this.studentSubject = new Subject();
        return studentSubject;
    }

    public void setStudentSubject(Subject studentSubject) {
        this.studentSubject = studentSubject;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String StudentName) {
        this.studentName = StudentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        if (studentSex != "male" || studentSex != "female")
            this.studentSex = "male";
        else {
            this.studentSex = studentSex;
        }
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        // The age must between 10 to 100
        if (studentAge < 10 || studentAge > 100)
            this.studentAge = 18;
        else
            this.studentAge = studentAge;
    }

    //Student introduction method3
    //return Student introduction info : name, number, sex, age
    public String introduction() {
        String str = "Student information is here: \n" +
                "Student name: " + this.getStudentName() +
                "\nStudent number: " + this.getStudentNo() +
                "\nStudent sex: " + this.getStudentSex() +
                "\nStudent age: " + this.getStudentAge() + "years" + "\nSubject name: " + this.getStudentSubject().getSubjectName() +
                "\nSubject life: " + this.getStudentSubject().getSubjectLife();
        ;
        return str;
    }

    //Student introduction method 1
    //Add subject name, subject life to Student introduction info
    //return Student introduction info : name, number, sex, age,subject name, subject life
    public String introduction(String subjectName, int subjectLife) {
        String str = "Student information is here: \n" +
                "Student name: " + this.getStudentName() +
                "\nStudent number: " + this.getStudentNo() +
                "\nStudent sex: " + this.getStudentSex() +
                "\nStudent age: " + this.getStudentAge() + "years" +
                "\nSubject name: " + subjectName +
                "\nSubject life: " + subjectLife;
        return str;
    }

    //Student introduction method 2
    //Add subject name, subject life to Student introduction info
    //return Student introduction info : name, number, sex, age,subject name, subject life
    // Using object Subject to get the information
    public String introduction(Subject mySubject) {
        String str = "Student information is here: \n" +
                "Student name: " + this.getStudentName() +
                "\nStudent number: " + this.getStudentNo() +
                "\nStudent sex: " + this.getStudentSex() +
                "\nStudent age: " + this.getStudentAge() + "years" +
                "\nSubject name: " + mySubject.getSubjectName() +
                "\nSubject life: " + mySubject.getSubjectLife();
        return str;
    }

}
