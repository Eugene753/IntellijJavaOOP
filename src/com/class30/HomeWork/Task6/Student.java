package com.class30.HomeWork.Task6;

public class Student {

    String name;
    String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student: " +
                "\nname: " + name +
                " \nstudentId: " + studentId;
    }
}
