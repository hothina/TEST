package com.Codegym.week3.vd.StackQueue.MyStack;

public class MyStack {
    private int size;
    private int index =0;
    private int arr[];

    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
         ;
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
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

}
