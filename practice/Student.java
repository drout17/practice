package com.practice;

import java.util.List;

public class Student {
    private Integer id;
    private String name;
    private List<String> mobileNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(List<String> mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

    public Student(Integer id, String name, List<String> mobileNumber) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public Student() {
    }
}
