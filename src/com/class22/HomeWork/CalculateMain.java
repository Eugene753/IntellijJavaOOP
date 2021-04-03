package com.class22.HomeWork;

public class CalculateMain {

    public static void main(String[] args) {
        CalculateArea area=new CalculateArea(12.5,10.3,17.6);

        System.out.println("Area of a Rectangle: "+area.areaOfRectangle());
        System.out.println("Area of a Square: "+area.areaOfSquare());
        System.out.println("Area of a Box: "+area.areaOfBox());

    }
}
