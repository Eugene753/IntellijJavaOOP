package com.GroupTask2.Task1;

public interface Shape {

    void calculateArea();

    void calculatePerimiter();
}
class Circle implements Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        double area;
        area=radius*radius*Math.PI;
        System.out.println("Area of a circle is: "+area);
    }

    @Override
    public void calculatePerimiter() {
        double perimeter;
        perimeter=Math.PI*2*radius;
        System.out.println("Perimeter of a circle is "+perimeter);
    }
}
class Square implements Shape{
    double length;
    double width;
    Square(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public void calculateArea(){
        double area;
        area=length*width;
        System.out.println("Area of a square is "+area);
    }
    @Override
    public void calculatePerimiter(){
        double perimeter;
        perimeter=length*4;
        System.out.println("Perimeter of a square "+perimeter);
    }
}
