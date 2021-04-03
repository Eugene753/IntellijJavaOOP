package com.Repl;

public class repl150 {

    public static void main(String[] args) {

        Employee obj1=new Employee();
        obj1.print();
        Student obj2=new Student();
        obj2.print2();
        Retiree obj3=new Retiree();
        obj3.print3();

    }
}

class Person{
    String name;
    String lastName;
    int age;
}

class Employee extends Person{
    int salary;

    public void print(){
        super.name="Joe";
        super.lastName="Smith";
        super.age=35;
        this.salary=35000;
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}

class Student extends Employee{
    int grade;

    public void print2(){

        super.name="Adam";
        super.lastName="Smith";
        super.age=15;
        this.grade=10;

        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}

class Retiree extends Student{
    String seniorActivity;
    public void print3(){
        super.name="Frank";
        super.lastName="Smith";
        super.age=15;
        this.seniorActivity="tour";
        System.out.print(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}
