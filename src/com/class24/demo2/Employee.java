package com.class24.demo2;

public class Employee {

   double salary;
   void work(){
       System.out.println("Employee is working");
   }
   void getPaid(){
       System.out.println("Employee is getting paid "+salary+" other benefits");
   }
   void goOnLeaves(){
       System.out.println("Employee is going on");
   }
}
class FullTimeEmp extends Employee{

}
class PartTimeEmp extends Employee{
    @Override
    void goOnLeaves() {
        System.out.println("Part time employee dont get leaves");
    }
}
class Contractor extends Employee{
    @Override
    void goOnLeaves() {
        System.out.println("paid on hourly basis "+salary);
    }

}