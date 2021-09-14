package com.Training.InterviewPreparation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedCheckBrackets {
    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
                = new ArrayDeque<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
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

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Deque<Character> deque1 = new ArrayDeque<Character>();

        Deque<Character> deque2 = new ArrayDeque<Character>();

        stack.add('a');
        stack.add('b');
        stack.add('c');
        System.out.println("Stack "+stack);
        System.out.println("Stack with add method peek "+stack.peek());
        System.out.println("Removing with pop method  from the stack "+stack.pop());
        System.out.println("Index with add method 0 index "+stack.get(0));
        System.out.println("Stack with add method peek "+stack.peek());
        System.out.println("-------------------------------------------");

        deque1.push('a');
        deque1.push('b');
        deque1.push('c');
        System.out.println("Printing all elements from deque1 "+ deque1);
        System.out.println("Deque with push method peek "+deque1.peek());
        System.out.println("Index with push method first element "+deque1.getFirst());
        System.out.println("Removing element from deque1 from the top "+deque1.pop());
        System.out.println("Printing all elements from deque1 "+ deque1);
        System.out.println("-----------------------------------------------");

        deque2.add('a');
        deque2.add('b');
        deque2.add('c');
        System.out.println("Printing all elements from deque2 "+ deque2);
        System.out.println("Deque with add method peek "+deque2.peek());
        System.out.println("Index with add method first element "+deque2.getFirst());
        System.out.println("Removing element from deque2 from the top "+deque2.pop());
        System.out.println("Printing all elements from deque2 "+ deque2);
        System.out.println("-----------------------------------------------");

        Deque<Character> characters1 = new ArrayDeque<>();
        char x1;

        String str1="{()}";

        for(int i=0;i<str1.length();i++){
            x1=str1.charAt(i);
            characters1.add(x1);
        }
        System.out.println("Deque add method "+characters1);
        System.out.println("Deque pick "+characters1.peek());
        System.out.println("Deque pop method "+characters1.pop());
        System.out.println("Deque add method "+characters1);
        System.out.println("-----------------------------------------------");


        Deque<Character> characters2 = new ArrayDeque<>();
        Deque<Character> characters3 = new ArrayDeque<>();
        Deque<Character> characters4 = new ArrayDeque<>();

        char x2;
        char x3;
        char x4;
        String str2="{()}";

        for(int i=0;i<str2.length();i++){
            x2=str2.charAt(i);
            if(x2=='(' || x2=='['|| x2=='{') {
                characters2.push(x2);
            }
        }
        System.out.println("Deque push method "+characters2);
        System.out.println("Deque pick "+characters2.peek());
        System.out.println("Deque pop method "+characters2.pop());
        System.out.println("Deque push method "+characters2);
        System.out.println("---------------------------------------------");


        for(int i=0;i<str2.length();i++){
            x3=str2.charAt(i);
            characters3.push(x3);
        }
        System.out.println("Deque push method "+characters3);
        System.out.println("---------------------------------------------");


    }
}
