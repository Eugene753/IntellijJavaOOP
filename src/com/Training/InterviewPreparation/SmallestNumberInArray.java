package com.Training.InterviewPreparation;

public class SmallestNumberInArray {

    public static void main(String[] args) {

        int [] arr={1,2,54,5,7778,5555,65,45};

        int temp=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
           if(temp>arr[i]){
               temp=arr[i];
           }
        }

        System.out.println(temp);

        System.out.println("Hello "+23);

        int money = 0;

        if(money>0){
            System.out.println("Don't spend it all ;)");
        }else{
            System.out.println("You should get a job");
        }
    }
}
