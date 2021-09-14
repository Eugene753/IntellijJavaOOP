package com.Repl;

import java.util.ArrayList;

public class Repl187 {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("hi");
        list.add("sup");
        list.add("yo");
        list.add("yolo");
        list.add("boop");
        list.add("hello");
        list.add("goo");
        list.add("boo");
        list.add("foo");
        list.add("why");
        list.add("my");
        list.add("we");
        list.add("see");
        System.out.println(list.indexOf("sup"));

        for(int i=0;i<list.size(); i++){
           // System.out.println(list.indexOf(i));
            if(list.indexOf(i)%2!=0){
                System.out.print(list.indexOf(i)+" ");
                System.out.println();
                System.out.println("-------------------------");
                list.remove(list.get(i));
            }

        }
        System.out.println(list);

        for(int i=list.size()-1;i>=0;i--){

        }


    }
}
