package com.Codegym.week3.vd.Stack.Reverse;

public class Main {
    public static void main(String[] args) {
        StackOfInteger stack = new StackOfInteger(5);
            stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(4);
       // stack.push(5);

        stack.Reverse();
        stack.Show();
    }
}
