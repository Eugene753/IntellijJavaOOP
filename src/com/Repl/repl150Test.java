package com.Repl;

public class repl150Test {

    public static void main(String[] args) {

        Employee2 obj1=new Employee2("Joe","Smith",35,35000);
        Student2 obj2=new Student2("Adam","Smith",15,10);
        Retiree2 obj3=new Retiree2("Frank","Smith",15,"tour");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
class Person2{
    String name;
    String lastName;
    int age;

    public Person2(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
class Employee2 extends Person2 {
    int salary;

    Employee2(String name, String lastName, int age,int salary) {
        super(name,lastName,age);
        this.salary = salary;
    }
    public void display(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student2 extends Person2 {
    int grade;

    Student2(String name, String lastName, int age,int grade){
        super(name,lastName,age);
        this.grade=grade;
    }
    public void display(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree2 extends Person2 {
    String seniorActivity;
    Retiree2(String name, String lastName, int age, String seniorActivity){
        super(name,lastName,age);
        this.seniorActivity=seniorActivity;
    }
    public void display(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }

}