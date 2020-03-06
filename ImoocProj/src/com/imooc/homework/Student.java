package com.imooc.homework;

import java.util.Objects;

public class Student {
    private int stuId;
    private String name;
    private float score;

    public Student(int stuId, String name, float score) {
        this.setName(name);
        this.setStuId(stuId);
        this.setScore(score);
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuId == student.stuId &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, name);
    }
}
