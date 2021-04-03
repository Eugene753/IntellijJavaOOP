package com.class22.HomeWork;

public class Example2 {

    public static String maxLength(String[] arr) {
        String max = "";
        for (int i = 1; i < arr.length; i++) {
                if(arr[i].length()>arr[i-1].length());{
                    max=arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {

        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
    }
}
