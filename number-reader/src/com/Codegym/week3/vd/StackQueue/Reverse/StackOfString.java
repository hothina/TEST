package com.Codegym.week3.vd.StackQueue.Reverse;

import java.util.Arrays;

public class StackOfString {
    private int index = 0;
    private char[] elements;
    boolean isEmpty() {
        if(index==0){
            return true;
        }
        return false;
    }
    public int size(){
        return index;
    }
    public boolean isFull() {
        if (index == elements.length) {
            return true;
        }
        return false;
    }

    public StackOfString(int size) {
        elements = new char[size];
    }

    public void push(char x) {
        if (isFull()) {
            System.out.println("Stack full ;");

        } else {
            elements[index++] = x;
        }
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack isEmpty");

        }
        return elements[--index];
    }
}


