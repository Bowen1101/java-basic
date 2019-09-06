package datastructure;

import java.util.Stack;

public class StackExercise {


    public static void main(String[] args) {
        /*
        * create a stack.
        */
        Stack<Integer> a  = new Stack<Integer>();

        a.push(1);
        System.out.println(a.peek()); // 1
        a.push(2);
        System.out.println(a.peek());// 2
        a.push(3);
        a.push(4);
        a.push(5);
        a.push(6);
        a.pop();
        System.out.println(a.peek()); // 1
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        System.out.println(a.get(3));
        System.out.println(a.get(4));


    }
}
