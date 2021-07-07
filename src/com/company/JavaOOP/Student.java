package com.company.JavaOOP;

public class Student {
    private String name;
    private int standard;
    private int rollNo;
    private String gender;
    private String favSubject;

    public Student(String name, int standard, int rollNo, String gender, String favSubject) {
        this.name = name;
        this.standard = standard;
        this.rollNo = rollNo;
        this.gender = gender;
        this.favSubject = favSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavSubject() {
        return favSubject;
    }

    public void setFavSubject(String favSubject) {
        this.favSubject = favSubject;
    }

    public String toString(){
        String s = "name  = " + getName();
        return s;
    }

    public String printClass(){
        String s = "name  = " + getName();
        return s;
    }
}
