package com.Training.InterviewPreparation;

import org.apache.commons.collections4.list.TreeList;

import java.util.*;

public class ListOfDuplicates {





    public static void main(String[] args) {

        /*List<Integer> listOf = new ArrayList<Integer>();
        listOf.add(3);
        listOf.add(1);
        listOf.add(2);
        listOf.add(3);
        listOf.add(4);
        listOf.add(2);
        listOf.add(1);

        Collections.sort(listOf);

        System.out.println(listOf);

        for(int i=0;i<listOf.size()-1;i++){

            if(listOf.get(i).equals(listOf.get(i+1))){

                System.out.println(listOf.get(i+1));
            }
        }*/


        int[] nums =  new int[] {3, 1, 2, 7, 3, 8, 1};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] == nums[i+1]) {
                System.out.println("duplicate item "+nums[i+1]+" at Location "+(i+1) );
            }
        }


        /*List<Integer> listOf1 = new ArrayList<Integer>();
        listOf1.add(0);
        listOf1.add(1);
        listOf1.add(5);
        listOf1.add(1);
        listOf1.add(2);
        listOf1.add(19);
        listOf1.add(2);
        listOf1.add(19);


        for(int i =0; i < listOf1.size(); i++) {

            if (listOf1.lastIndexOf(listOf1.get(i)) != i)  {

                System.out.println(listOf1.get(i)+" is duplicated"+" "+"Just a number"+ i);

            }

            //System.out.println(listOf.lastIndexOf(listOf.get(i)));
        }*/

    }
}
