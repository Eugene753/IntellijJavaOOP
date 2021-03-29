package com.class22.ClassWork;

public class Circle extends Shape{

    Circle(double radius){
        super(radius);
    }

    double area(){
       return radius*radius*Math.PI;
    }

}
