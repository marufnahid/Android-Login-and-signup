package com.example.myloginapp;

public class Test {

    String name;
    String father_name;
    int roll;
    int rollNumber;
    int phone;
    int callnumber;
    String email;
    String password;


    public Test(String name, int roll) {
        this.name = name;
        this.rollNumber = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return rollNumber;
    }

    public void setRoll(int roll) {
        this.rollNumber = roll;
    }
}
