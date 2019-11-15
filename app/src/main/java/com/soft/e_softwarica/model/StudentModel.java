package com.soft.e_softwarica.model;

public class StudentModel {
    private String fullName;
    private String address;
    private String gender;
    int age;

    public StudentModel(String fullName, String address, String gender, int age) {
        this.fullName = fullName;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
