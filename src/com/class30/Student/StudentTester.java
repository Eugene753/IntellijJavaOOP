package com.class30.Student;

import java.util.ArrayList;

public class StudentTester {

    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1,"Aman",15));
        students.add(new Student(2,"Aman",25));
        students.add(new Student(3,"Kseniia",105));
        students.add(new Student(4,"Afzal",15));
        students.add(new Student(5,"Nazir",18));
        students.add(new Student(6,"Kseniia",40));
        Student student=new Student(3,"Kseniia",105);

        students.remove(student);

        System.out.println(students+"       ");
    }
}
