package com.Training.InterviewPreparation;

import java.util.*;

public class FindOutWhichNumberIsDuplicate {

    public static void main(String[] args) {

        List<Integer> num=new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(45);
        num.add(56);
        num.add(89);
        num.add(45);
        num.add(8);
        num.add(1);
        num.add(9);

        Collections.sort(num);


        System.out.println(num);

        /*Set<Integer> num2=new TreeSet<>(num);

        System.out.println(num2);*/

        int j=0;

        for(int i=1;i<num.size();i++){
            if(num.get(j)==num.get(i)){
                System.out.println(num.get(i));
            }
            j++;
        }

    }
}
