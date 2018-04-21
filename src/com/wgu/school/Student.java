package com.wgu.school;

import java.lang.reflect.Array;

public class Student {
    private int student_ID;
    private String first_name;
    private String last_name;
    private String email;
    private int age;
    private Array grades;

    public Student(int student_ID, String first_name, String last_name, String email, int age, Array grades) {
        this.student_ID = student_ID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Array getGrades() {
        return grades;
    }

    public void setGrades(Array grades) {
        this.grades = grades;
    }
}
