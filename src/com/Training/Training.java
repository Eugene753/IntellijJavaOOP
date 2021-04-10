package com.Training;

public class Training {

    public static void main(String[] args) {

        Employee obj1=new Employee("Joe", "Smith",35,35000);
        Student obj2=new Student("Adam","Smith",15,10);
        Retiree obj3=new Retiree("Frank","Smith",15,"tour");

        obj1.print();
        obj2.print();
        obj3.print();

    }
}
class Person{
    String name;
    String lastName;
    int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
class Employee extends Person{
    int salary;

    public Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student extends Person {
    int grade;

    public Student(String name, String lastName, int age, int grade) {
        super(name, lastName, age);
        this.grade = grade;
    }
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree extends Person {
    String seniorActivity;

    public Retiree(String name, String lastName, int age, String seniorActivity) {
        super(name, lastName, age);
        this.seniorActivity = seniorActivity;
    }
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}