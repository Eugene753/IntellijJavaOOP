package com.class30.HomeWork.Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

    public static void main(String[] args) {

        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Geico","BMW"));
        insurances.add(new Pet("Farmers","Puck"));
        insurances.add(new Health("Blue Cross"));

        for(int i=0;i<insurances.size();i++){
            insurances.get(i).getQuote();
            insurances.get(i).cancellInsurance();
        }
        System.out.println("---------------------------------------");

        for(Insurance i:insurances){
            i.getQuote();
            i.cancellInsurance();
        }
        System.out.println("-----------------------------------------");

        Iterator<Insurance> iterator=insurances.iterator();

        while(iterator.hasNext()){
            Insurance str=iterator.next();
            str.getQuote();
            str.cancellInsurance();
        }



    }
}
