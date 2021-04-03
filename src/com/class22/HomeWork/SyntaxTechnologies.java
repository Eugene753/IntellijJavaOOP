package com.class22.HomeWork;

public class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies(){

    }
    SyntaxTechnologies(String schoolName,int batch,int year,String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }



    public void display(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);

    }

}
