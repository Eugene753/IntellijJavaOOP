package com.Training.InterviewPreparation;

public class MultipleBy3and5 {

    public static void main(String[] args) {
        /**Design a program that print the numbers from 1 to 100. For multiples of three print "Boats" instead of the number,
         * and for the multiple of five print "Group". For numbers which are multiples of both three and five print "BoatsGroup".
         *
         * For example:
         * 1
         * 2
         * Boats
         * 4
         * Group
         *
        */

        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("BoatsGroup");
            }else if(i%3==0){
                System.out.println("Boats");
            }else if(i%5==0){
                System.out.println("Group");
            }else{
                System.out.println(i);
            }
        }

        int[]arr={1,2,3};
        System.out.println(arr[1]);
    }
}
