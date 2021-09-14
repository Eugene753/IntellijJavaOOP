package com.Training.InterviewPreparation;

import java.util.*;

public class BracketsRepl {

    public static boolean check(String s) {
        Deque<Character> characters = new ArrayDeque<>();
        char x;
        for (int i = 0; i < s.length(); i++) {

            x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                characters.push(x);
                continue;
            }

            if (characters.isEmpty()) {
                return false;
            }

            char check;
            switch (x) {
                case ')':
                    check = characters.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = characters.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = characters.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (characters.isEmpty());
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String expr;
        System.out.println("Enter String");
        expr=scanner.next();
        System.out.println(check(expr));

        // Function call
        /*if (check(expr)) {
            System.out.println("Balanced ");
        } else {
            System.out.println("Not Balanced ");
        }*/


        String s = "({[]})";
        String open = "({[";
        String close = ")}]";
        int counter=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < open.length(); j++) {
                if (s.charAt(i) == '(') {
                    counter++;
                } else if (s.charAt(i) == ')') {
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

    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr) {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
                = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }


}
