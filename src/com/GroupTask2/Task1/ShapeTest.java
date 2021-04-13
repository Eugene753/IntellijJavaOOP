package com.GroupTask2.Task1;

public class ShapeTest {

    public static void main(String[] args) {

        Shape[]shapes={new Circle(10),new Square(20,20)};

        for(Shape s:shapes){
            s.calculateArea();
            s.calculatePerimiter();

        }

    }
}
