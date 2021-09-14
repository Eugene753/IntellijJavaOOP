package com.Training.InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static int removeDuplicate(int[] arrNumbers, int num)
    {

        int[] arrTemporary = new int[num];
        int b = 0;
        for(int a = 0; a < num - 1; a++)
        {
            if(arrNumbers[a] != arrNumbers[a + 1])
            {
                arrTemporary[b++] = arrNumbers[a];
            }
        }
        arrTemporary[b++] = arrNumbers[num - 1];

        for(int a = 0; a < b; a++)
        {
            arrNumbers[a] = arrTemporary[a];
        }
        return b;
    }


    public static void main(String[] args) {

        int [] arr={3,4,5,6,7,4,3,2,1,1};

        Arrays.sort(arr);

        int len=arr.length;

        int [] temp=new int[len];

        int b=0;

        //Inside of main method
        for(int i=0;i<len-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[b++]=arr[i];
            }
        }
        temp[b++]=arr[len-1];

        for(int j=0; j < b; j++){

            arr[j]=temp[j];
            System.out.print(arr[j]+" ");
        }
        System.out.println();

        for(int k=0;k<b;k++){
            System.out.print(arr[k]+" ");
        }

        System.out.println();


        //With the help of method we removing duplicates
        /*Arrays.sort(arr);

        int len=arr.length;

        len=removeDuplicate(arr,len);

        for(int a = 0; a < len; a++)
        {
            System.out.print(arr[a] + " ");
        }*/



    }
}
