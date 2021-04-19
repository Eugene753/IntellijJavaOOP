package com.advanceJava.OverloadArrays;

public class OverloadArrays {

    public static int indexOf(int[]list,int value){

        for(int i=0;i<list.length;i++){
            if(list[i]!=value){
                return -1;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.indexOf("el"));
    }

}
