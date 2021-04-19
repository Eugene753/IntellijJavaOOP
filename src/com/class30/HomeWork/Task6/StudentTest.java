package com.class30.HomeWork.Task6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

    public static void main(String[] args) {

        Set<Student> students=new HashSet<>();

        students.add(new Student("Igor","I778965"));
        students.add(new Student("Vladimir","V565674"));
        students.add(new Student("Danila","D568421"));
        students.add(new Student("Eugene","E4552777"));
        students.add(new Student("Marta","M465821"));
        students.add(new Student("Olena","O45852114"));
        students.add(new Student("Marina","M5627721"));
        students.add(new Student("Kseniia","K4574584321"));

        for(Student s:students){
            System.out.println(s);
        }

        Iterator <Student> iterator=students.iterator();

        while(iterator.hasNext()){
            Student str=iterator.next();
            System.out.println(str);
        }


    }
}
