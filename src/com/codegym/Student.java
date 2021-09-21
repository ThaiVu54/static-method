package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGY";
    }

    //method to display value
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
