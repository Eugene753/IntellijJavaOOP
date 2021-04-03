package com.class22.HomeWork;

public class CalculateArea {

    double length;
    double width;
    double height;

    CalculateArea(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }


    double areaOfRectangle(){
        return length*width;
    }

    double areaOfSquare(){
        return length*length;
    }

    double areaOfBox(){
        return height*width*length;
    }

}
