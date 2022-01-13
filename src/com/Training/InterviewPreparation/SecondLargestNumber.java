package com.Training.InterviewPreparation;

import java.util.Arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[]arr={3000,2000,2,10,100,90,78};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest "+largest);
        System.out.println("Second Largest "+secondLargest);





        int[]array={2000,1500,55,2,4,7,256,0};
        int largest1=0;
        int secondLargest1=0;

        Arrays.sort(array);



        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest1=array[i];
            }
            for(int j=0;j<array.length;j++){
                if(array[j]>largest1 && largest1>secondLargest1){
                    secondLargest1=largest1;
                }
            }
        }
        System.out.println("Largest 1 "+largest1);
        System.out.println("Second Largest "+secondLargest1);

        


    }
}
