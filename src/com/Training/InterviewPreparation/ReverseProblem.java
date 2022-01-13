package com.Training.InterviewPreparation;

public class ReverseProblem {

    public void reverse1(String str){

        String str1="";
        int num=0;

        char[] arr = new char[str.length()];

        for(int i=str.length()-1;i>=0;i--){
            arr[num]=str.charAt(i);
            num++;
        }

        for(int i=0;i<arr.length;i++){
            str1+=arr[i];
        }
        System.out.println(str1);
    }

    public void reverse2(String str){
        String str1="";

        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }

        System.out.println(str1);
    }

    public void reverse3(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }


    public static void main(String[] args) {

        ReverseProblem reverseProblem=new ReverseProblem();

        String str="Hello";

        System.out.print("First method: "); reverseProblem.reverse1(str);


        System.out.print("Second method: ");reverseProblem.reverse2(str);

        System.out.print("Third method: ");reverseProblem.reverse3(str);

    }

}
