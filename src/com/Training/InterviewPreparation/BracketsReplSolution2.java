package com.Training.InterviewPreparation;

public class BracketsReplSolution2 {

    public static void main(String[] args) {

        String s = "({)]";
        // String open = "(";
        // String close = ")";
        int counter=0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 1; j++) { // j < open.length();
                if (s.charAt(i) == '(') {    //open.charAt(j)
                    counter++;
                } else if (s.charAt(i) == ')') {   //close.charAt(j)
                    counter--;
                }
            }
        }

        if (counter == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
