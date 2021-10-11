package com.Codegym.week3.vd.StackQueue.Reverse;

public class Main {
    public static void main(String[] args) {
        int[] elements = new int[]{1, 2, 3, 4, 5};
        StackOfInteger stack = new StackOfInteger(elements.length);
        for (int i = 0; i < elements.length; i++) {
            stack.push(elements[i]);
        }
        //stack.reverse();
//        stack.print();
        int i = 0;
        while (stack.size() != 0) {
            elements[i] = stack.pop();
            i++;
        }
        for (int element : elements) {
            System.out.print(element);
        }
    }


}
