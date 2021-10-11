package com.Codegym.week3.vd.StackQueue.Reverse;

import java.util.EmptyStackException;

public class StackOfInteger {
    private int size = 0;
    private int index = 0;
    private int arr[];

    public StackOfInteger(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("stack is full");
        }
        arr[index] = element;
        index++;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return index;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return arr[--index];
    }

    public void reverse() {
        int arr1[] = new int[this.size()];
        for (int i = 0; i < this.size(); i++) {
            arr1[i] = this.arr[i];
        }
        for (int i = 0; i < this.size(); i++) {
            this.arr[i] = arr1[size - i - 1];
        }
    }

    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(arr[i]);
        }
    }

}
