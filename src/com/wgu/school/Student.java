package com.wgu.school;

import java.lang.reflect.Array;

public class Student {
    private Integer studentID;
    private String first_name;
    private String last_name;
    private String email;
    private Integer age;
    private Integer[] grades;

    public Student(Integer studentID, String first_name, String last_name, String email, Integer age, Integer[] grades) {
        this.studentID = studentID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }

    public Integer getStudentID() {
        return this.studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer[] getGrades() {
        return grades;
    }

    public void setGrades(Integer[] grades) {
        this.grades = grades;
    }

    public String print(){
        //can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}
        return getStudentID()+"\tFirst Name: "+getFirst_name()+"\tLast Name: "+getLast_name()+"\tAge: "+getAge()+"\tGrades: "+printGrades();

    }

    private String printGrades(){
        String allGrades = "{";
        for (Integer aGrade : grades) {
            allGrades+=aGrade.toString()+",";
        }
        allGrades=allGrades.substring(0,allGrades.length()-2)+"}";
        return allGrades;
    }
}
